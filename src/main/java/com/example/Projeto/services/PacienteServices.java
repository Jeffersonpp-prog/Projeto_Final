package com.example.Projeto.services;

    import java.util.List;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    import com.example.Projeto.entities.Paciente;
    import com.example.Projeto.repositories.PacienteRepository;

    @Service
    public class PacienteServices {



    @Autowired 
    private PacienteRepository repository;


        public List<Paciente> procurarTodos(){

            return repository.findAll();

        }


        public Paciente procurarPorId (Integer id) {

            return repository.findById(id).get();

        }


        public String adicionarPaciente(Paciente paciente) {

            repository.save(paciente);
            return "Paciente adicionado com sucesso";
        }




        public String editarPaciente(Integer Id, Paciente paciente) {
            Paciente response = repository.findById(Id).get();

            response.setNomepet(paciente.getNomepet());
            response.setRaca(paciente.getRaca());
            response.setEndereco(paciente.getEndereco());
            response.setTelefone(paciente.getTelefone());
            response.setDonoPet(paciente.getDonoPet());
            
            repository.save(response);
            return "Paciente atualizado com sucesso";
        }




        public String deletarPaciente(Integer Id) {


           Paciente response = repository.findById(Id).get();
            repository.delete(response);
            return "Paciente excluido com sucesso";
        }

    }

 
