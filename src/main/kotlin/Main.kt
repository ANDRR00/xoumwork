//cube
class Cube(var line: Double) {
    var volume = line * line * line
}

//cuboid
class Cuboid(var length: Double, var width: Double, var height: Double) {
    var volume = length * width * height
}

//sphere
class Sphere(var radius: Double) {
    var volume = 4/3 * Math.PI * radius
}


fun main() {
    var line_cube = Cube(5.0)
    println("კუბის მოცულობაა ${line_cube.volume}")

    var parameters_cuboid = Cuboid(2.0, 4.0, 5.0)
    println("პარალელეპიპედის მოცულობაა ${parameters_cuboid.volume}")

    var parameters_sphere = Sphere(6.0)
    println("სფეროს მოცულობაა ${parameters_sphere.volume}")

//sum of volumes
    println("მოცულობათა ჯამია ${parameters_cuboid.volume + parameters_sphere.volume + line_cube.volume}")
}

