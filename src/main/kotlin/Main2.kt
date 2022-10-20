//დავალება 1.2 დიედრული (ორწახნაგა) კუთხე

class vector1(var x1: Double, var y1: Double, var x2: Double, var y2: Double) {
    var length1 = Math.sqrt((x1 * x1) + (y1 * y1))
    var length2 = Math.sqrt((x2 * x2) + (y2 * y2))
    var product_of_coordinates = (x1 * x2) + (y1 * y2)
    var arccos = product_of_coordinates / (length1 * length2)
}

fun main() {
    var parameters = vector1(2.0, 3.0, 5.0, 7.0)
    println("დიედრული კუთხე არის arccos${parameters.arccos} - ის ტოლი")
}
