var edad=0, estadoCivil=0, estatura=0, sexo, promedioEdad=0, promedioEstatura=0,
porcentajePersonas=0, contadorPersonas=0, acumuladorEdad=0, 
acumuladorEstatura=0, cantidadPersonas=2;

for (let numeropersona=1; numeropersona <= cantidadPersonas; numeropersona++){
edad= parseFloat(prompt("ingrese la edad de la persona "+numeropersona));
estadoCivil= parseFloat(prompt("ingrese el estado civil de la persona "+numeropersona + " 1. Soltero  2.Casado" ));
estatura= parseFloat(prompt("ingrese la persona de la persona "+numeropersona + " en cms"));
sexo= parseFloat(prompt("ingrese el sexo de la persona "+numeropersona + " 1. Hombre   2.Mujer"));
if((edad>=18)&&(estadoCivil==1)&&(estatura>170)&&(sexo==1)){
contadorPersonas=contadorPersonas+1;
acumuladorEdad=acumuladorEdad+edad;
acumuladorEstatura=acumuladorEstatura+estatura;
    }
}
promedioEdad=acumuladorEdad/contadorPersonas;
promedioEstatura=acumuladorEstatura/contadorPersonas;
porcentajePersonas=(contadorPersonas/cantidadPersonas)*100;

alert("El promedio de edad de las personas que cumplen es " + promedioEdad + " años ")
alert("El promedio de estatura de las personas que cumplen es " + promedioEstatura + " centimetros ")
alert("El porcentaje  de las personas que cumplen con la condición es del " + porcentajePersonas + " % ")