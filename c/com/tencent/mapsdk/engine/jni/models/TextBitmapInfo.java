package com.tencent.mapsdk.engine.jni.models;

import com.tencent.mapsdk.internal.C80353mf;
import java.util.Arrays;

public class TextBitmapInfo {
    public boolean bold;
    public float density;
    public int height;
    public byte[] mData = new byte[4];
    public int pitch;
    public int width;

    public void fill(byte[] bArr) {
        boolean z = false;
        Arrays.fill(this.mData, (byte) 0);
        System.arraycopy(bArr, 0, this.mData, 0, 4);
        this.density = Float.intBitsToFloat(C80353mf.m97895a(this.mData));
        System.arraycopy(bArr, 4, this.mData, 0, 4);
        this.width = C80353mf.m97895a(this.mData);
        System.arraycopy(bArr, 8, this.mData, 0, 4);
        this.height = C80353mf.m97895a(this.mData);
        System.arraycopy(bArr, 12, this.mData, 0, 4);
        this.pitch = C80353mf.m97895a(this.mData);
        System.arraycopy(bArr, 16, this.mData, 0, 1);
        if (this.mData[0] > 0) {
            z = true;
        }
        this.bold = z;
    }
}
