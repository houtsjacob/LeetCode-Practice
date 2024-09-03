class Solution {
    public List<List<String>> displayTable(List<List<String>> orders) {
        // create the result dispplay table
        List<List<String>> result = new ArrayList<>();
        
        // set of unique food types
        Set<String> food = new TreeSet<String>();
        
        // set of unique tables
        Set<Integer> tables = new TreeSet<Integer>();
        
        // hashmap for food orders  
        Map<String, Map<String, Integer>> map = new HashMap<>();
        
        // iterate through the list of orders
        for(List<String> o : orders) {
            String tableString = o.get(1);
            String foodString = o.get(2);
            
            // add table to set
            tables.add(Integer.parseInt(tableString));
            
            //add food to set
            food.add(foodString);
                       
            
            if(map.containsKey(tableString)) {
                // get the map of table orders
                Map<String, Integer> tableOrders = map.get(tableString);
                if(tableOrders.containsKey(foodString)) {
                    // get the repeating table order and increment order count
                    int count = tableOrders.get(foodString);
                    tableOrders.put(foodString, ++count);
                }
                else tableOrders.put(foodString, 1); // add the new order
            }
            else {
                // create a new map for the table and place the first order
                Map<String, Integer> tableOrders = new HashMap<>();
                tableOrders.put(foodString, 1);
                map.put(tableString, tableOrders);
            }
        }
        
        // convert the food set into the first list in the display table
        List<String> displayFood = new ArrayList<String>();
        displayFood.add("Table");
        displayFood.addAll(food);
        result.add(displayFood);
               
               
        // iterate through the tables
        for(Integer s : tables) {
            // create the table list and add the table number
            String tableString = Integer.toString(s);
            List<String> displayTable = new ArrayList<>();
            displayTable.add(tableString);
            
            // iterate through food types and add the orders to the table list
            Map<String, Integer> tableOrders = map.get(tableString);
            for(String f : food) displayTable.add(Integer.toString(tableOrders.getOrDefault(f, 0)));
            
            // add table list to final result
            result.add(displayTable);
        }
        
        return result;
    }
}