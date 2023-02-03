package ejercicio.pkg3.javadoc;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Marc Ara
 */
public class JavadocEj2 {

    /**
     *
     * La clase Password permite generar una contraseña aleatoria y verificar si
     * es fuerte o no.
     *
     * @version 1.5
     */
    private final static int LONG_DEF = 8;
    /**
     *
     * Longitud de la contraseña.
     */
    private int longitud;
    /**
     *
     * Contraseña generada.
     */
    private String contraseña;

    /**
     *
     * Devuelve la longitud de la contraseña.
     *
     * @return Longitud de la contraseña.
     */
    public int getLongitud() {
        return longitud;
    }

    /**
     *
     * Establece la longitud de la contraseña.
     *
     * @param longitud La longitud de la contraseña a establecer.
     */
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    /**
     *
     * Devuelve la contraseña generada.
     *
     * @return La contraseña generada.
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     *
     * Genera una contraseña aleatoria compuesta por números, letras minúsculas
     * y mayúsculas.
     *
     * @return La contraseña generada.
     * @see Math#random()
     * @see Math#floor(double)
     */
    public String generaPassword() {
        String password = "";
        for (int i = 0; i < longitud; i++) {
            int eleccion = ((int) Math.floor(Math.random() * 3 + 1));
            if (eleccion == 1) {
                char minusculas = (char) ((int) Math.floor(Math.random() * (123 - 97) + 97));
                password += minusculas;
            } else {
                if (eleccion == 2) {
                    char mayusculas = (char) ((int) Math.floor(Math.random() * (91 - 65) + 65));
                    password += mayusculas;
                } else {
                    char numeros = (char) ((int) Math.floor(Math.random() * (58 - 48) + 48));
                    password += numeros;
                }
            }
        }
        return password;
    }

    /**
     *
     * Verifica si la contraseña es fuerte, es decir, tiene al menos 5 números,
     * 2 letras mayúsculas y 1 minúscula.
     *
     * @return True si la contraseña es fuerte, false si no lo es.
     * @see String#charAt(int)
     */
    public boolean esFuerte() {
        int cuentanumeros = 0;
        int cuentaminusculas = 0;
        int cuentamayusculas = 0;
        for (int i = 0; i < contraseña.length(); i++) {
            if (contraseña.charAt(i) >= 97 && contraseña.charAt(i) <= 122) {
                cuentaminusculas += 1;
            } else {
                if (contraseña.charAt(i) >= 65 && contraseña.charAt(i) <= 90) {
                    cuentamayusculas += 1;
                } else {
                    cuentanumeros += 1;
                }
            }
        }
        if (cuentanumeros >= 3 && cuentaminusculas >= 1 && cuentamayusculas >= 1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Constructor sin parámetros
     */
    public JavadocEj2() {
        this(LONG_DEF);
    }

    /**
     * Constructor con parámetros
     * @param longitud Longitud de la contraseña a generar
     */
    public JavadocEj2(int longitud) {
        this.longitud = longitud;
        contraseña = generaPassword();
    }
}
