package com.app.tarefas.AppTarefas.repositório;

import com.app.tarefas.AppTarefas.models.Administrador;
import org.springframework.data.repository.CrudRepository;

public interface AdministradoresRepo extends CrudRepository<Administrador, Integer> {
}
