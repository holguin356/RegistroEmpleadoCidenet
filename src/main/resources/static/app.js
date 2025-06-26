fetch('http://localhost:8080/api/empleados')
  .then(res => res.json())
  .then(data => {
    const tabla = document.getElementById('tabla-empleados');
    data.forEach(emp => {
      const fila = `
        <tr>
          <td>${emp.id}</td>
          <td>${emp.primerApellido}</td>
          <td>${emp.segundoApellido}</td>
          <td>${emp.primerNombre}</td>
          <td>${emp.otrosNombres || ''}</td>
          <td>${emp.tipoIdentificacion}</td>
          <td>${emp.numeroIdentificacion}</td>
          <td>${emp.correo}</td>
          <td>${emp.pais}</td>
          <td>${emp.area}</td>
          <td>${emp.fechaIngreso}</td>
          <td>${emp.estado}</td>
          <td>${emp.fechaRegistro.replace('T', ' ')}</td>
        </tr>`;
      tabla.insertAdjacentHTML('beforeend', fila);
    });
  })
  .catch(err => {
    console.error('Error al cargar los empleados:', err);
    document.getElementById('tabla-empleados').innerHTML =
      '<tr><td colspan="13" class="text-center text-danger">Error al cargar datos.</td></tr>';
  });