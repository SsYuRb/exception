package exceptions3;

import java.util.HashMap;

public class Prog {
    public static void main(String[] args) {
        String newFileName = null; 
        WriteFile writeFile = new WriteFile(); 

        HashMap<String, Object> data = Input.parsInputData(); 
        while (data.size() != 6) {
            try {
                throw new DataException();
            } catch (DataException e) {
                data = Input.parsInputData();
            }
        } 

        newFileName = data.get("lastName") + ".txt"; 
        StringBuilder sb = new StringBuilder();
        for (String str : data.keySet()) {
            sb.append(data.get(str));
            sb.append(" ");
        }


        System.out.println(data);
        String filePath = newFileName;
        System.out.println(filePath);
        writeFile.writeData(String.valueOf(sb), filePath); 

    }
}
    
