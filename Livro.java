// Classe de modelo

/* Atributos ou propriedades

    ID --> Int
    Páginas --> String
    Autor --> String
    Editora --> String
    Nome --> String
    Genero --> String
    Data do Lançamaneto --> String
    Edição --> String
    Material da Capa --> String
    ISBN --> String

    */
public class Livro {

     // Propriedades ou Atributos 
     // Todos os atributos devem ser privados

       private String nome;
       private String autor;
       private String genero;
       private int paginas;
       

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }


    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }


    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    } 
       
       
    @Override
    public String toString() {
    return "Nome: " + nome +
       "\nAutor: " + autor;
}
       

      




}
