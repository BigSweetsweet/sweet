String[] stringArray = { "a", "b", "c", "d", "e" };  
ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));  
String[] stringArr = new String[arrayList.size()];  
arrayList.toArray(stringArr);
for (String s : stringArr)
  System.out.println(s);
