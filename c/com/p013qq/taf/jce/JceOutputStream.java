package com.p013qq.taf.jce;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.qq.taf.jce.JceOutputStream */
public class JceOutputStream {

    /* renamed from: bs */
    private ByteBuffer f339248bs;
    public String sServerEncoding;

    public JceOutputStream(ByteBuffer byteBuffer) {
        this.sServerEncoding = "GBK";
        this.f339248bs = byteBuffer;
    }

    public static void main(String[] strArr) {
        JceOutputStream jceOutputStream = new JceOutputStream();
        jceOutputStream.write(1311768467283714885L, 0);
        System.out.println(HexUtil.bytes2HexStr(jceOutputStream.getByteBuffer().array()));
        System.out.println(Arrays.toString(jceOutputStream.toByteArray()));
    }

    private void writeArray(Object[] objArr, int i) {
        reserve(8);
        writeHead((byte) 9, i);
        write(objArr.length, 0);
        for (Object write : objArr) {
            write(write, 0);
        }
    }

    public ByteBuffer getByteBuffer() {
        return this.f339248bs;
    }

    public void reserve(int i) {
        if (this.f339248bs.remaining() < i) {
            ByteBuffer allocate = ByteBuffer.allocate((this.f339248bs.capacity() + i) * 2);
            allocate.put(this.f339248bs.array(), 0, this.f339248bs.position());
            this.f339248bs = allocate;
        }
    }

    public int setServerEncoding(String str) {
        this.sServerEncoding = str;
        return 0;
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[this.f339248bs.position()];
        System.arraycopy(this.f339248bs.array(), 0, bArr, 0, this.f339248bs.position());
        return bArr;
    }

    public void write(boolean z, int i) {
        write(z ? (byte) 1 : 0, i);
    }

    public void writeByteString(String str, int i) {
        reserve(str.length() + 10);
        byte[] hexStr2Bytes = HexUtil.hexStr2Bytes(str);
        if (hexStr2Bytes.length > 255) {
            writeHead((byte) 7, i);
            this.f339248bs.putInt(hexStr2Bytes.length);
            this.f339248bs.put(hexStr2Bytes);
            return;
        }
        writeHead((byte) 6, i);
        this.f339248bs.put((byte) hexStr2Bytes.length);
        this.f339248bs.put(hexStr2Bytes);
    }

    public void writeHead(byte b, int i) {
        if (i < 15) {
            this.f339248bs.put((byte) (b | (i << 4)));
        } else if (i < 256) {
            this.f339248bs.put((byte) (b | 240));
            this.f339248bs.put((byte) i);
        } else {
            throw new JceEncodeException("tag is too large: " + i);
        }
    }

    public void writeStringByte(String str, int i) {
        byte[] hexStr2Bytes = HexUtil.hexStr2Bytes(str);
        reserve(hexStr2Bytes.length + 10);
        if (hexStr2Bytes.length > 255) {
            writeHead((byte) 7, i);
            this.f339248bs.putInt(hexStr2Bytes.length);
            this.f339248bs.put(hexStr2Bytes);
            return;
        }
        writeHead((byte) 6, i);
        this.f339248bs.put((byte) hexStr2Bytes.length);
        this.f339248bs.put(hexStr2Bytes);
    }

    public void write(byte b, int i) {
        reserve(3);
        if (b == 0) {
            writeHead((byte) 12, i);
            return;
        }
        writeHead((byte) 0, i);
        this.f339248bs.put(b);
    }

    public JceOutputStream(int i) {
        this.sServerEncoding = "GBK";
        this.f339248bs = ByteBuffer.allocate(i);
    }

    public void write(short s, int i) {
        reserve(4);
        if (s < -128 || s > 127) {
            writeHead((byte) 1, i);
            this.f339248bs.putShort(s);
            return;
        }
        write((byte) s, i);
    }

    public JceOutputStream() {
        this(128);
    }

    public void write(int i, int i2) {
        reserve(6);
        if (i < -32768 || i > 32767) {
            writeHead((byte) 2, i2);
            this.f339248bs.putInt(i);
            return;
        }
        write((short) i, i2);
    }

    public void write(long j, int i) {
        reserve(10);
        if (j < -2147483648L || j > 2147483647L) {
            writeHead((byte) 3, i);
            this.f339248bs.putLong(j);
            return;
        }
        write((int) j, i);
    }

    public void write(float f, int i) {
        reserve(6);
        writeHead((byte) 4, i);
        this.f339248bs.putFloat(f);
    }

    public void write(double d, int i) {
        reserve(10);
        writeHead((byte) 5, i);
        this.f339248bs.putDouble(d);
    }

    public void write(String str, int i) {
        byte[] bArr;
        try {
            bArr = str.getBytes(this.sServerEncoding);
        } catch (UnsupportedEncodingException unused) {
            bArr = str.getBytes();
        }
        reserve(bArr.length + 10);
        if (bArr.length > 255) {
            writeHead((byte) 7, i);
            this.f339248bs.putInt(bArr.length);
            this.f339248bs.put(bArr);
            return;
        }
        writeHead((byte) 6, i);
        this.f339248bs.put((byte) bArr.length);
        this.f339248bs.put(bArr);
    }

    public <K, V> void write(Map<K, V> map, int i) {
        int i2;
        reserve(8);
        writeHead((byte) 8, i);
        if (map == null) {
            i2 = 0;
        } else {
            i2 = map.size();
        }
        write(i2, 0);
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                write(next.getKey(), 0);
                write(next.getValue(), 1);
            }
        }
    }

    public void write(boolean[] zArr, int i) {
        reserve(8);
        writeHead((byte) 9, i);
        write(zArr.length, 0);
        for (boolean write : zArr) {
            write(write, 0);
        }
    }

    public void write(byte[] bArr, int i) {
        reserve(bArr.length + 8);
        writeHead((byte) 13, i);
        writeHead((byte) 0, 0);
        write(bArr.length, 0);
        this.f339248bs.put(bArr);
    }

    public void write(short[] sArr, int i) {
        reserve(8);
        writeHead((byte) 9, i);
        write(sArr.length, 0);
        for (short write : sArr) {
            write(write, 0);
        }
    }

    public void write(int[] iArr, int i) {
        reserve(8);
        writeHead((byte) 9, i);
        write(iArr.length, 0);
        for (int write : iArr) {
            write(write, 0);
        }
    }

    public void write(long[] jArr, int i) {
        reserve(8);
        writeHead((byte) 9, i);
        write(jArr.length, 0);
        for (long write : jArr) {
            write(write, 0);
        }
    }

    public void write(float[] fArr, int i) {
        reserve(8);
        writeHead((byte) 9, i);
        write(fArr.length, 0);
        for (float write : fArr) {
            write(write, 0);
        }
    }

    public void write(double[] dArr, int i) {
        reserve(8);
        writeHead((byte) 9, i);
        write(dArr.length, 0);
        for (double write : dArr) {
            write(write, 0);
        }
    }

    public <T> void write(T[] tArr, int i) {
        writeArray(tArr, i);
    }

    public <T> void write(Collection<T> collection, int i) {
        int i2;
        reserve(8);
        writeHead((byte) 9, i);
        if (collection == null) {
            i2 = 0;
        } else {
            i2 = collection.size();
        }
        write(i2, 0);
        if (collection != null) {
            for (T write : collection) {
                write((Object) write, 0);
            }
        }
    }

    public void write(JceStruct jceStruct, int i) {
        reserve(2);
        writeHead((byte) 10, i);
        jceStruct.writeTo(this);
        reserve(2);
        writeHead((byte) 11, 0);
    }

    public void write(Byte b, int i) {
        write(b.byteValue(), i);
    }

    public void write(Boolean bool, int i) {
        write(bool.booleanValue(), i);
    }

    public void write(Short sh, int i) {
        write(sh.shortValue(), i);
    }

    public void write(Integer num, int i) {
        write(num.intValue(), i);
    }

    public void write(Long l, int i) {
        write(l.longValue(), i);
    }

    public void write(Float f, int i) {
        write(f.floatValue(), i);
    }

    public void write(Double d, int i) {
        write(d.doubleValue(), i);
    }

    public void write(Object obj, int i) {
        if (obj instanceof Byte) {
            write(((Byte) obj).byteValue(), i);
        } else if (obj instanceof Boolean) {
            write(((Boolean) obj).booleanValue(), i);
        } else if (obj instanceof Short) {
            write(((Short) obj).shortValue(), i);
        } else if (obj instanceof Integer) {
            write(((Integer) obj).intValue(), i);
        } else if (obj instanceof Long) {
            write(((Long) obj).longValue(), i);
        } else if (obj instanceof Float) {
            write(((Float) obj).floatValue(), i);
        } else if (obj instanceof Double) {
            write(((Double) obj).doubleValue(), i);
        } else if (obj instanceof String) {
            write((String) obj, i);
        } else if (obj instanceof Map) {
            write((Map) obj, i);
        } else if (obj instanceof List) {
            write((List) obj, i);
        } else if (obj instanceof JceStruct) {
            write((JceStruct) obj, i);
        } else if (obj instanceof byte[]) {
            write((byte[]) obj, i);
        } else if (obj instanceof boolean[]) {
            write((boolean[]) obj, i);
        } else if (obj instanceof short[]) {
            write((short[]) obj, i);
        } else if (obj instanceof int[]) {
            write((int[]) obj, i);
        } else if (obj instanceof long[]) {
            write((long[]) obj, i);
        } else if (obj instanceof float[]) {
            write((float[]) obj, i);
        } else if (obj instanceof double[]) {
            write((double[]) obj, i);
        } else if (obj.getClass().isArray()) {
            writeArray((Object[]) obj, i);
        } else if (obj instanceof Collection) {
            write((Collection) obj, i);
        } else {
            throw new JceEncodeException("write object error: unsupport type. " + obj.getClass());
        }
    }
}
