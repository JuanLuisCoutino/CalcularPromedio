import javax.swing.JOptionPane

var calificacion = 0.0
var calificaciones : DoubleArray = DoubleArray(4)
var semestre = 0
var suma = 0.0
var promedio = 0.0
do {
    var textoCalificaciones= JOptionPane.showInputDialog("Ingresa tu calificaciones del semestre: ${semestre+1}")
    if(textoCalificaciones==null){
        break
    }
    calificacion=textoCalificaciones.toDouble()
    calificaciones[semestre]=calificacion
    semestre++
}while (semestre<4)
calificaciones.forEach {
    suma+=it
}
promedio=suma/semestre
JOptionPane.showMessageDialog(null,"Tu promedio durante los $semestre semestre(s) fue de $promedio")


