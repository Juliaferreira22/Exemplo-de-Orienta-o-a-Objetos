public class Principal {

    public static  void main(String[] args) {

        //Objeto
        Livro livro = new Livro();

        // O método SET sempre armazena uma informação no atributo do objeto
        livro.setNome("Orientação a Objetos");

        // O método GET sempre reorna um informção guardada no atributo do objeto
        System.out.println(livro.getNome());
        System.out.println(livro);

    livro.setAutor("Nome do Autor");
    System.out.println(livro.getAutor());

    livro.setGenero("Gênero");
    System.out.println(livro.getGenero());
    
    //  livro.setPaginas("Páginas");
    //  System.out.println(livro.getPaginas());

        
        
    }

}

    

    

