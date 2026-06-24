package Banco;

import java.util.ArrayList;
import classes.Aluno;

public class BancoSimulado {
    public static ArrayList<Aluno> alunos = new ArrayList<>();
    
     public static int idCliente = 1;
    
    static {

        alunos.add(new Aluno(
                idCliente++,
                "João Silva",
                "775.368.852-91",
                "joao.silva@email.com"
            )
        );
        alunos.add(new Aluno(
                idCliente++,
                "Maria Silva",
                "656.000.654-91",
                "maria.silva@email.com"
            )
        );
        alunos.add(new Aluno(
                idCliente++,
                "Pedro Barbosa",
                "555.123.654-34",
                "pedro.barbosa@email.com"
            )
        );
        
        alunos.add(new Aluno(
                idCliente++,
                "Jose Nogueira",
                "666.888.654-99",
                "jose.nogueira@email.com"
            )
        );
        
              alunos.add(new Aluno(
                idCliente++,
                "Marina Pia",
                "777.555.4444-00",
                "marina.pia@email.com"
            )
        );
    }
}
