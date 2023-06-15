// Ned Isaiah B. Palacios BSCS-1A

class DataTypes {
  boolean val1;
  double val2, val11;
  float val3;
  int val4, val10;
  long val5;
  String val6;
  byte val7;
  short val8;
  char val9, val12;
  public static void main(String[] args) {
    // all of the variables cannot be reassigned with new data because
    // the variables referenced/used are non-static variables.

    // the new data assigned to val1 is not a boolean and the syntax for
    // the string must be in double quotes instead of single quotes as it
    // denotes a character.
    val1 = 'true';

    // the number assigned to the val2 variable is correct but it would
    // be much better to use float in this case.
    val2 = 1.4;

    // the syntax for casting integer val4 to float is incorrect.
    // the val4 variable is also uninitialized.
    val3 = float val4;

    // the syntax and the new data assigned is valid but since it is not
    // a number that is not outside of any numeric type above long, the
    // type of val5 should be either a byte, a short, or an int instead
    // to save memory space.
    val5 = 5;

    // the value of variable val1 cannot be assigned as a new data for the
    // val6 variable as String and boolean are incompatible types. however,
    // the value of val1 can be converted into a string using a toString()
    // method. also, the value of val1 is uninitialized and the assignment
    // happened in line 20 is not counted by the compiler.
    val6 = val1;

    // the number assigned to the val7 variable is invalid since it is
    // outside the range of the byte type.
    val7 = 128;

    // the value assigned to the val8 variable is valid but the data type
    // can be reduce to byte if possible.
    val8 = 128;

    // the right hand side of the assignment of val9 variable is invalid
    // because it is a string. if it's really a char, it should use single
    // quotes instead of double quotes.
    val9 = "c";

    // the syntax is correct because it is possible in java to do multiple
    // assignments at once and in this case the value of the val8 variable
    // is assigned to the val7 and val10 variables. however, the three
    // variables have incompatible data types and the compiler will produce
    // an error.
    val10 = val7 = val8;

    // this line will produce a compiler error as the val4 variable is
    // uninitialized and cannot be assigned to the val11 variable.
    val11 = val4;

    // this line is valid since a char is also a number underneath and the
    // compiler will print this as `1` as this is the character assigned
    // to that specific number.
    val12 = 49;
  }
}
