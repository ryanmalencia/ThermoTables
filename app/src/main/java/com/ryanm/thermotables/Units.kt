package com.ryanm.thermotables

import java.io.Serializable

class Units : Serializable {
    val mult: DoubleArray = doubleArrayOf(1.0,1.0,1.0,1.0,1.0,1.0,1.0);
    var verbose: Array<String> = arrayOf("C", "kPa", "kJ/kg", "kJ/kg-K", "kJ/kg", "m^3/kg", "");
}
