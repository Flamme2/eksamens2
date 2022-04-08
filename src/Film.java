import javax.swing.event.ListDataEvent;
import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Film {

  private String filmTiltel;
  private Integer udgivelsesÅr;
  private LocalDate date = LocalDate.now();
  public Producer _producer ;

  public Film(String _filmtitel, Integer _udgivelseÅr){
    this.filmTiltel = _filmtitel;
    this.udgivelsesÅr = _udgivelseÅr;
    _producer = new Producer();
  }

  public Film(String _filmtitel){
    this.filmTiltel = _filmtitel;
    this.udgivelsesÅr = date.getYear();
    _producer = new Producer();

  }


  public Film(String _filmtitel, Producer _prod){
    this._producer = _prod;
    this.filmTiltel = _filmtitel;
  }



  // method / function
  public String GetTitel(){
    return  this.filmTiltel;
  }

  public Integer GetReleaseYear(){
    return this.udgivelsesÅr;
  }





}
