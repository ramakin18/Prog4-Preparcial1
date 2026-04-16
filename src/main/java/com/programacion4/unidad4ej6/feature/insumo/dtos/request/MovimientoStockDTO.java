package com.programacion4.unidad4ej6.feature.insumo.dtos.request;

import com.programacion4.unidad4ej6.feature.insumo.models.TipoMovimiento;

import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Negative;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovimientoStockDTO {
    
    @Positive(message = "La cantidad debe ser mayor a 0")
    @NotNull(message = "La cantidad es requerida")
    private Long cantidad;

    @NotNull(message = "El tipo es requerido")
    private TipoMovimiento tipoMovimiento;

}
