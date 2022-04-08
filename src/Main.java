public class Main {

  public static void main(String args[]){

    //movie with only tiltel
    Film obj1 = new Film("Titanic");
    System.out.println("NAme of movie :" + obj1.GetTitel());

    System.out.println();

    //movie with tiltel and date
    Film obj2 = new Film("Fast and Furious", 1999);
    System.out.println("Movie titel & Release year:");
    System.out.println("Titel: " + obj2.GetTitel() +
                        "\nReleaseYear:" + obj2.GetReleaseYear());

    System.out.println();
    System.out.println("the fst movie updated producer:");
    obj1._producer.SetName("Kouakou Solace");
    System.out.println("Titel: " + obj1.GetTitel() +
        "\nProducerName:" + obj1._producer.GetName());

    System.out.println();
    /*
    //movie with titel and ProducerName:
    Film obj3 = new Film("Ma Famille", new Producer("Mathias"));
    System.out.println("Titel: " + obj3.GetTitel() +
        "\nProducerName: " + obj3._producer.GetName());

     */


  }
}
