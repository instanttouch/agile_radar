package de.schleichy.agile.radar

class SpiderData {

	List<String> categories = new ArrayList<String>()
	Map<String,Average> values = new HashMap<String, Average>(); 

	public class Average{
		int count = 0
		double average = 5.0
		
		public void calc(double newValue){
			double newAverage = newValue - average
			newAverage /= count
			newAverage += average
	
			average = newAverage
		}
	
	}
			
	public SpiderData() {
		super();
	}
	
	public void addCategory(String category){
		values.put(category, new Average())
	}
	

	public void addValue(String category, double value){
		Average average = values.get(category);
		if(average){
			average.count++
			average.calc(value)
		}
		
	}
	
	public String[] fields() {
		return values.keySet().toArray()
	}
	
	public Double[] data(String[] categories){
		
		Double[] data = new Double[categories.length]
		for(int i=0;i<categories.length;i++){
			data[i] = values.get(categories[i]).average
		}				
		return data
	}
	
}
