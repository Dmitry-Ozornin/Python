// Задание №2.1 📌 Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 📌 Вывести название каждой планеты и количество его повторений в списке. Задание состоит из двух блоков Задание №2.2 (если выполнено первое задание) 📌 Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Spisok {
    public static void main(String[] args) {
        List<String> planets = planetsList();
        uniquePlanetsCount(planets);
        deleteRepeatPlenet(planets);
        System.out.println(planets);


        
    }

    private static List<String> planetsList() {
        List<String> planets = new ArrayList<>();
        planets.add("Mars");
        planets.add("Earth");
        planets.add("Earth");
        planets.add("Jupiter");
        planets.add("Venus");
        planets.add("Neptune");
        planets.add("Saturn");
        planets.add("Earth");
        planets.add("Uranus");
        planets.add("Mercury");
        planets.add("Jupiter");
        planets.add("Uranus");
        planets.add("Jupiter");
        planets.add("Venus");
        planets.add("Neptune");
        planets.add("Saturn");
        planets.add("Earth");
        planets.add("Uranus");
        planets.add("Mercury");
        planets.add("Jupiter");
        return planets;
    }

    public static void uniquePlanetsCount(List<String> planets) {
        List<String> sortedPlanets = new ArrayList<>(planets);
        Collections.sort(sortedPlanets);
        int count = 1;
        String currentPlanet = sortedPlanets.get(0);

        for (int i = 0; i < sortedPlanets.size(); i++) {
            if (sortedPlanets.get(i).equals(currentPlanet)){
                count++;
            } else {
                System.out.println(currentPlanet + ":" + count);
                count = 1;
                currentPlanet = sortedPlanets.get(i);
            }
            
        }
        System.out.println(currentPlanet + ":" + count);
        
    }

    public static void deleteRepeatPlenet(List<String> planets) {
        for (int i = 0; i < planets.size(); i++) {
            String currentPlanet =  planets.get(i);
            for (int j = i + 1; j < planets.size(); j++) {
                if(planets.get(j).equals(currentPlanet)){
                    planets.remove(j);
                    j--;
                }
                
                
            }
            
        }
        // второй вариант
        // for (int i = 0; i < planets.size(); i++) {
        //     String currentPlanet =  planets.get(i);
        //     for (int j = planets.size() - 1; j >i; j--) {
        //         if(planets.get(j).equals(currentPlanet)){
        //             planets.remove(j);
                
        //         }
                
                
        //     }
            
        // }
        
    }
    
}
