package com.zpj.hardlibrary;

public class HardControl {

//    public static native int Ctrl (int which, int status);

//    public static native int Ctrl();
    public static native int Open();
    public static native void Close();

    static {
        try {
            System.loadLibrary("hardcontrol");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}