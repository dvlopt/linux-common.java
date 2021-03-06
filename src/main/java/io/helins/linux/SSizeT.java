/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/. */




package io.helins.linux ;


import com.sun.jna.IntegerType ;
import com.sun.jna.Native      ;




/**
 * Class representing the native <code>ssize_t</code> type which is architecture-specific.
 * <p>
 * It is a signed integer typically representing the length of something (eg. the number of bytes that
 * have been read) where negative values represent an error (eg. -1 means nothing has been read because
 * something failed).
 */
public class SSizeT extends IntegerType {


    /**
     * In bytes, the size of <code>ssize_t</code>.
     */
    public static final int SIZE = Native.SIZE_T_SIZE ;




    /**
     * Constructor defaulting to 0.
     */
    public SSizeT() {
    
        this( 0 ) ;
    }




    /**
     * Constructor with a value.
     *
     * @param value  The original value, cannot be larger than the native <code>ssize_t</code>.
     */
    public SSizeT( long value ) {
    
        super( SIZE  ,
               value  ,
               false ) ;
    }
}
