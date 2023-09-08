package com.p013qq.taf.jce.dynamic;

import com.p013qq.taf.jce.JceDecodeException;

/* renamed from: com.qq.taf.jce.dynamic.JceField */
public class JceField {

    /* renamed from: zs */
    private static ZeroField[] f339250zs = new ZeroField[256];
    private int tag;

    static {
        int i = 0;
        while (true) {
            ZeroField[] zeroFieldArr = f339250zs;
            if (i < zeroFieldArr.length) {
                zeroFieldArr[i] = new ZeroField(i);
                i++;
            } else {
                return;
            }
        }
    }

    public JceField(int i) {
        this.tag = i;
    }

    public static JceField create(byte b, int i) {
        return new ByteField(b, i);
    }

    public static JceField createList(JceField[] jceFieldArr, int i) {
        return new ListField(jceFieldArr, i);
    }

    public static JceField createMap(JceField[] jceFieldArr, JceField[] jceFieldArr2, int i) {
        return new MapField(jceFieldArr, jceFieldArr2, i);
    }

    public static JceField createStruct(JceField[] jceFieldArr, int i) {
        return new StructField(jceFieldArr, i);
    }

    public static JceField createZero(int i) {
        if (i >= 0 && i < 255) {
            return f339250zs[i];
        }
        throw new JceDecodeException("invalid tag: " + i);
    }

    public int getTag() {
        return this.tag;
    }

    public static JceField create(short s, int i) {
        return new ShortField(s, i);
    }

    public static JceField create(int i, int i2) {
        return new IntField(i, i2);
    }

    public static JceField create(long j, int i) {
        return new LongField(j, i);
    }

    public static JceField create(float f, int i) {
        return new FloatField(f, i);
    }

    public static JceField create(double d, int i) {
        return new DoubleField(d, i);
    }

    public static JceField create(String str, int i) {
        return new StringField(str, i);
    }

    public static JceField create(byte[] bArr, int i) {
        return new ByteArrayField(bArr, i);
    }
}
