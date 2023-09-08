package com.p013qq.taf.jce.dynamic;

import com.p013qq.taf.jce.JceDecodeException;
import com.p013qq.taf.jce.JceInputStream;
import java.io.UnsupportedEncodingException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: com.qq.taf.jce.dynamic.DynamicInputStream */
public final class DynamicInputStream {

    /* renamed from: bs */
    private ByteBuffer f339249bs;
    private String sServerEncoding = "GBK";

    public DynamicInputStream(ByteBuffer byteBuffer) {
        this.f339249bs = byteBuffer;
    }

    private JceField readString(JceInputStream.HeadData headData, int i) {
        String str;
        byte[] bArr = new byte[i];
        this.f339249bs.get(bArr);
        try {
            str = new String(bArr, this.sServerEncoding);
        } catch (UnsupportedEncodingException unused) {
            str = new String(bArr);
        }
        return JceField.create(str, headData.tag);
    }

    public JceField read() {
        try {
            JceInputStream.HeadData headData = new JceInputStream.HeadData();
            JceInputStream.readHead(headData, this.f339249bs);
            int i = 0;
            switch (headData.type) {
                case 0:
                    return JceField.create(this.f339249bs.get(), headData.tag);
                case 1:
                    return JceField.create(this.f339249bs.getShort(), headData.tag);
                case 2:
                    return JceField.create(this.f339249bs.getInt(), headData.tag);
                case 3:
                    return JceField.create(this.f339249bs.getLong(), headData.tag);
                case 4:
                    return JceField.create(this.f339249bs.getFloat(), headData.tag);
                case 5:
                    return JceField.create(this.f339249bs.getDouble(), headData.tag);
                case 6:
                    int i2 = this.f339249bs.get();
                    if (i2 < 0) {
                        i2 += 256;
                    }
                    return readString(headData, i2);
                case 7:
                    return readString(headData, this.f339249bs.getInt());
                case 8:
                    int intValue = ((NumberField) read()).intValue();
                    JceField[] jceFieldArr = new JceField[intValue];
                    JceField[] jceFieldArr2 = new JceField[intValue];
                    while (i < intValue) {
                        jceFieldArr[i] = read();
                        jceFieldArr2[i] = read();
                        i++;
                    }
                    return JceField.createMap(jceFieldArr, jceFieldArr2, headData.tag);
                case 9:
                    int intValue2 = ((NumberField) read()).intValue();
                    JceField[] jceFieldArr3 = new JceField[intValue2];
                    while (i < intValue2) {
                        jceFieldArr3[i] = read();
                        i++;
                    }
                    return JceField.createList(jceFieldArr3, headData.tag);
                case 10:
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        JceField read = read();
                        if (read == null) {
                            return JceField.createStruct((JceField[]) arrayList.toArray(new JceField[0]), headData.tag);
                        }
                        arrayList.add(read);
                    }
                case 12:
                    return JceField.createZero(headData.tag);
                case 13:
                    int i3 = headData.tag;
                    JceInputStream.readHead(headData, this.f339249bs);
                    if (headData.type == 0) {
                        byte[] bArr = new byte[((NumberField) read()).intValue()];
                        this.f339249bs.get(bArr);
                        return JceField.create(bArr, i3);
                    }
                    throw new JceDecodeException("type mismatch, simple_list only support byte, tag: " + i3 + ", type: " + headData.type);
                default:
                    return null;
            }
        } catch (BufferUnderflowException unused) {
            return null;
        }
    }

    public int setServerEncoding(String str) {
        this.sServerEncoding = str;
        return 0;
    }

    public DynamicInputStream(byte[] bArr) {
        this.f339249bs = ByteBuffer.wrap(bArr);
    }
}
