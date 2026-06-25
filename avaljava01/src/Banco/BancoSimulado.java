package Banco;

import java.util.ArrayList;
import classes.Alunos;

public class BancoSimulado {
    public static ArrayList<Alunos> alunos = new ArrayList<>();
    
     public static int idAluno = 1;
    
    static {

        alunos.add(new Alunos(
                idAluno++,
                "João Silva",
                "2598",
                "joao.silva@email.com"
            )
        );
        alunos.add(new Alunos(
                idAluno++,
                "Maria Silva",
                "2130",
                "maria.silva@email.com"
            )
        );
        alunos.add(new Alunos(
                idAluno++,
                "Pedro Barbosa",
                "2434",
                "pedro.barbosa@email.com"
            )
        );
        
        alunos.add(new Alunos(
                idAluno++,
                "Jose Nogueira",
                "5483",
                "jose.nogueira@email.com"
            )
        );
        
              alunos.add(new Alunos(
                idAluno++,
                "Marina Pia",
                "7745",
                "marina.pia@email.com"
            )
        );
    }
}
