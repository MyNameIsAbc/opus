package com.jachat.opus;

public class OpusUtils {

    public native long createEncoder(int sampleRateInHz,int  channelConfig, int complexity);
    public native long createDecoder(int sampleRateInHz,int  channelConfig);
    public native int encode(long handle,short[] shortArray,int offset , byte[] encoded);
    public native int decode(long handle,byte[] encoded,short[] shortArray);
    public native void destroyEncoder(long handle);
    public native void destroyDecoder(long handle);
}
