/**
 * This utility class is called Parity.
 *
 * Implement a public static method called validateParity.
 *
 * The validateParity method tells the user if a parity-encoded word is valid or not.
 *
 * A parity-encoded word is a series of binary digits (zeros and ones) where the left-most
 * digit is either a zero or one depending on the type of parity being used (EVEN or ODD).
 *
 * If a word is encoded with EVEN parity the total number of 1 bits must be an even number.
 *
 * If a word is encoded with ODD parity the total number of 1 bits must be an odd number.
 *
 * For example if the original word is 1001:
 *
 *     EVEN codeword is 01001 (2 is even so prepend a 0 to keep it even)
 *     ODD codeword is 11001 (2 is even so prepend a 1 to make it odd)
 *
 * Your method must accept a string codeword (the original value with the parity bit prepended to it)
 * and a parity (EVEN or ODD) as command line arguments and return a boolean: true if valid, else false.
 *
 * Prove your static method works by testing it in the main method:
 *
 *     Parity.validateParity("101", "EVEN") returns true
 *     Parity.validateParity("11", "EVEN") returns true
 *     Parity.validateParity("111111111100000000001010110101", "EVEN") returns true
 *     Parity.validateParity("10", "ODD") returns true
 *     Parity.validateParity("111", "ODD") returns true
 *     Parity.validateParity("1111111111000011111000001010110101", "ODD") returns true
 *     Parity.validateParity("111", "EVEN") returns false
 *     Parity.validateParity("11111111100000000001010110101", "EVEN") returns false
 *     Parity.validateParity("11", "ODD") returns false
 *     Parity.validateParity("101", "ODD") returns false
 *     Parity.validateParity("11111111111000011111000001010110101", "ODD") returns false

 *
 * @author BCIT
 * @author ADD YOUR NAME HERE
 * @version 2022
 */
public final class Parity {

    private Parity() { }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(final String[] args) {
        // Drive the program from here.
    }
}
