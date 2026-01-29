package med.voll.api.domain.consulta.validaciones.reserva;

import med.voll.api.domain.ValidacionException;
import med.voll.api.domain.consulta.ConsultaRepository;
import med.voll.api.domain.consulta.DatosReservaConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorMedicoConOtraConsultaEnMismoHorario implements ValidadorDeConsultas{
    @Autowired
    private ConsultaRepository repository;

    public void validar(DatosReservaConsulta datos){
        var medicoPoseeOtraConsulta = repository.existsByMedicoIdAndFechaAndMotivoCancelamientoIsNull(datos.idMedico(),datos.fecha());
        if (medicoPoseeOtraConsulta){
            throw new ValidacionException("Medico ya posee otra consulta en esa misma fecha y horario.");
        }
    }
}
