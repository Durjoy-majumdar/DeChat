package com.tencent.mapsdk.internal;

import androidx.exifinterface.media.ExifInterface;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.mapsdk.internal.m */
public final class C113953m {

    /* renamed from: a */
    public String f340831a = "GBK";

    /* renamed from: b */
    private ByteBuffer f340832b;

    /* renamed from: com.tencent.mapsdk.internal.m$a */
    public static class C113954a {

        /* renamed from: a */
        public byte f340833a;

        /* renamed from: b */
        public int f340834b;

        /* renamed from: a */
        private void m157930a() {
            this.f340833a = 0;
            this.f340834b = 0;
        }
    }

    public C113953m() {
    }

    /* renamed from: b */
    private void m157903b(byte[] bArr) {
        mo172387a(bArr);
    }

    /* renamed from: d */
    private Map<String, String> m157907d(int i, boolean z) {
        HashMap hashMap = new HashMap();
        if (m157904b(i)) {
            C113954a aVar = new C113954a();
            m157896a(aVar);
            if (aVar.f340833a == 8) {
                int a = mo172379a(0, 0, true);
                if (a >= 0) {
                    for (int i2 = 0; i2 < a; i2++) {
                        hashMap.put(mo172389b(0, true), mo172389b(1, true));
                    }
                } else {
                    throw new C113832j("size invalid: ".concat(String.valueOf(a)));
                }
            } else {
                throw new C113832j("type mismatch.");
            }
        } else if (z) {
            throw new C113832j("require field not exist.");
        }
        return hashMap;
    }

    /* renamed from: e */
    private List m157908e(int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (m157904b(i)) {
            C113954a aVar = new C113954a();
            m157896a(aVar);
            if (aVar.f340833a == 9) {
                int a = mo172379a(0, 0, true);
                if (a >= 0) {
                    for (int i2 = 0; i2 < a; i2++) {
                        C113954a aVar2 = new C113954a();
                        m157896a(aVar2);
                        switch (aVar2.f340833a) {
                            case 0:
                                m157895a(1);
                                break;
                            case 1:
                                m157895a(2);
                                break;
                            case 2:
                                m157895a(4);
                                break;
                            case 3:
                                m157895a(8);
                                break;
                            case 4:
                                m157895a(4);
                                break;
                            case 5:
                                m157895a(8);
                                break;
                            case 6:
                                int i3 = this.f340832b.get();
                                if (i3 < 0) {
                                    i3 += 256;
                                }
                                m157895a(i3);
                                break;
                            case 7:
                                m157895a(this.f340832b.getInt());
                                break;
                            case 8:
                            case 9:
                                break;
                            case 10:
                                try {
                                    C114029p pVar = (C114029p) Class.forName(C114029p.class.getName()).getConstructor(new Class[0]).newInstance(new Object[0]);
                                    pVar.readFrom(this);
                                    m157893a();
                                    arrayList.add(pVar);
                                    break;
                                } catch (Exception e) {
                                    throw new C113832j("type mismatch.".concat(String.valueOf(e)));
                                }
                            case 12:
                                arrayList.add(0);
                                break;
                            default:
                                throw new C113832j("type mismatch.");
                        }
                    }
                } else {
                    throw new C113832j("size invalid: ".concat(String.valueOf(a)));
                }
            } else {
                throw new C113832j("type mismatch.");
            }
        } else if (z) {
            throw new C113832j("require field not exist.");
        }
        return arrayList;
    }

    /* renamed from: f */
    private boolean[] m157909f(int i, boolean z) {
        if (m157904b(i)) {
            C113954a aVar = new C113954a();
            m157896a(aVar);
            if (aVar.f340833a == 9) {
                int a = mo172379a(0, 0, true);
                if (a >= 0) {
                    boolean[] zArr = new boolean[a];
                    for (int i2 = 0; i2 < a; i2++) {
                        zArr[i2] = mo172388a(0, true);
                    }
                    return zArr;
                }
                throw new C113832j("size invalid: ".concat(String.valueOf(a)));
            }
            throw new C113832j("type mismatch.");
        } else if (!z) {
            return null;
        } else {
            throw new C113832j("require field not exist.");
        }
    }

    /* renamed from: g */
    private short[] m157910g(int i, boolean z) {
        if (m157904b(i)) {
            C113954a aVar = new C113954a();
            m157896a(aVar);
            if (aVar.f340833a == 9) {
                int a = mo172379a(0, 0, true);
                if (a >= 0) {
                    short[] sArr = new short[a];
                    for (int i2 = 0; i2 < a; i2++) {
                        sArr[i2] = mo172386a(sArr[0], 0, true);
                    }
                    return sArr;
                }
                throw new C113832j("size invalid: ".concat(String.valueOf(a)));
            }
            throw new C113832j("type mismatch.");
        } else if (!z) {
            return null;
        } else {
            throw new C113832j("require field not exist.");
        }
    }

    /* renamed from: h */
    private int[] m157911h(int i, boolean z) {
        if (m157904b(i)) {
            C113954a aVar = new C113954a();
            m157896a(aVar);
            if (aVar.f340833a == 9) {
                int a = mo172379a(0, 0, true);
                if (a >= 0) {
                    int[] iArr = new int[a];
                    for (int i2 = 0; i2 < a; i2++) {
                        iArr[i2] = mo172379a(iArr[0], 0, true);
                    }
                    return iArr;
                }
                throw new C113832j("size invalid: ".concat(String.valueOf(a)));
            }
            throw new C113832j("type mismatch.");
        } else if (!z) {
            return null;
        } else {
            throw new C113832j("require field not exist.");
        }
    }

    /* renamed from: i */
    private long[] m157912i(int i, boolean z) {
        if (m157904b(i)) {
            C113954a aVar = new C113954a();
            m157896a(aVar);
            if (aVar.f340833a == 9) {
                int a = mo172379a(0, 0, true);
                if (a >= 0) {
                    long[] jArr = new long[a];
                    for (int i2 = 0; i2 < a; i2++) {
                        jArr[i2] = mo172381a(jArr[0], 0, true);
                    }
                    return jArr;
                }
                throw new C113832j("size invalid: ".concat(String.valueOf(a)));
            }
            throw new C113832j("type mismatch.");
        } else if (!z) {
            return null;
        } else {
            throw new C113832j("require field not exist.");
        }
    }

    /* renamed from: j */
    private float[] m157913j(int i, boolean z) {
        if (m157904b(i)) {
            C113954a aVar = new C113954a();
            m157896a(aVar);
            if (aVar.f340833a == 9) {
                int a = mo172379a(0, 0, true);
                if (a >= 0) {
                    float[] fArr = new float[a];
                    for (int i2 = 0; i2 < a; i2++) {
                        fArr[i2] = mo172378a(fArr[0], 0, true);
                    }
                    return fArr;
                }
                throw new C113832j("size invalid: ".concat(String.valueOf(a)));
            }
            throw new C113832j("type mismatch.");
        } else if (!z) {
            return null;
        } else {
            throw new C113832j("require field not exist.");
        }
    }

    /* renamed from: k */
    private double[] m157914k(int i, boolean z) {
        if (m157904b(i)) {
            C113954a aVar = new C113954a();
            m157896a(aVar);
            if (aVar.f340833a == 9) {
                int a = mo172379a(0, 0, true);
                if (a >= 0) {
                    double[] dArr = new double[a];
                    for (int i2 = 0; i2 < a; i2++) {
                        dArr[i2] = mo172377a(dArr[0], 0, true);
                    }
                    return dArr;
                }
                throw new C113832j("size invalid: ".concat(String.valueOf(a)));
            }
            throw new C113832j("type mismatch.");
        } else if (!z) {
            return null;
        } else {
            throw new C113832j("require field not exist.");
        }
    }

    /* renamed from: a */
    public final void mo172387a(byte[] bArr) {
        this.f340832b = ByteBuffer.wrap(bArr);
    }

    /* renamed from: c */
    public final byte[] mo172390c(int i, boolean z) {
        if (m157904b(i)) {
            C113954a aVar = new C113954a();
            m157896a(aVar);
            byte b = aVar.f340833a;
            if (b == 9) {
                int a = mo172379a(0, 0, true);
                if (a < 0 || a > this.f340832b.capacity()) {
                    throw new C113832j("size invalid: ".concat(String.valueOf(a)));
                }
                byte[] bArr = new byte[a];
                for (int i2 = 0; i2 < a; i2++) {
                    bArr[i2] = mo172376a(bArr[0], 0, true);
                }
                return bArr;
            } else if (b == 13) {
                C113954a aVar2 = new C113954a();
                m157896a(aVar2);
                if (aVar2.f340833a == 0) {
                    int a2 = mo172379a(0, 0, true);
                    if (a2 < 0 || a2 > this.f340832b.capacity()) {
                        throw new C113832j("invalid size, tag: " + i + ", type: " + aVar.f340833a + ", " + aVar2.f340833a + ", size: " + a2);
                    }
                    byte[] bArr2 = new byte[a2];
                    this.f340832b.get(bArr2);
                    return bArr2;
                }
                throw new C113832j("type mismatch, tag: " + i + ", type: " + aVar.f340833a + ", " + aVar2.f340833a);
            } else {
                throw new C113832j("type mismatch.");
            }
        } else if (!z) {
            return null;
        } else {
            throw new C113832j("require field not exist.");
        }
    }

    /* renamed from: a */
    private static int m157889a(C113954a aVar, ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        aVar.f340833a = (byte) (b & 15);
        int i = (b & 240) >> 4;
        aVar.f340834b = i;
        if (i != 15) {
            return 1;
        }
        aVar.f340834b = byteBuffer.get() & ExifInterface.MARKER;
        return 2;
    }

    /* renamed from: b */
    private int m157900b(C113954a aVar) {
        return m157889a(aVar, this.f340832b.duplicate());
    }

    private C113953m(ByteBuffer byteBuffer) {
        this.f340832b = byteBuffer;
    }

    /* renamed from: b */
    private boolean m157904b(int i) {
        int i2;
        try {
            C113954a aVar = new C113954a();
            while (true) {
                int a = m157889a(aVar, this.f340832b.duplicate());
                i2 = aVar.f340834b;
                if (i <= i2) {
                    break;
                } else if (aVar.f340833a == 11) {
                    break;
                } else {
                    m157895a(a);
                    m157894a(aVar.f340833a);
                }
            }
            if (aVar.f340833a != 11 && i == i2) {
                return true;
            }
            return false;
        } catch (C113832j | BufferUnderflowException unused) {
        }
    }

    public C113953m(byte[] bArr) {
        this.f340832b = ByteBuffer.wrap(bArr);
    }

    /* renamed from: a */
    private void m157896a(C113954a aVar) {
        m157889a(aVar, this.f340832b);
    }

    /* renamed from: a */
    private void m157895a(int i) {
        ByteBuffer byteBuffer = this.f340832b;
        byteBuffer.position(byteBuffer.position() + i);
    }

    /* renamed from: a */
    private void m157893a() {
        C113954a aVar = new C113954a();
        do {
            m157896a(aVar);
            m157894a(aVar.f340833a);
        } while (aVar.f340833a != 11);
    }

    public C113953m(byte[] bArr, byte b) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        this.f340832b = wrap;
        wrap.position(4);
    }

    /* renamed from: b */
    private void m157902b() {
        C113954a aVar = new C113954a();
        m157896a(aVar);
        m157894a(aVar.f340833a);
    }

    /* renamed from: a */
    private void m157894a(byte b) {
        int i = 0;
        switch (b) {
            case 0:
                m157895a(1);
                return;
            case 1:
                m157895a(2);
                return;
            case 2:
                m157895a(4);
                return;
            case 3:
                m157895a(8);
                return;
            case 4:
                m157895a(4);
                return;
            case 5:
                m157895a(8);
                return;
            case 6:
                int i2 = this.f340832b.get();
                if (i2 < 0) {
                    i2 += 256;
                }
                m157895a(i2);
                return;
            case 7:
                m157895a(this.f340832b.getInt());
                return;
            case 8:
                int a = mo172379a(0, 0, true);
                while (i < a * 2) {
                    m157902b();
                    i++;
                }
                return;
            case 9:
                int a2 = mo172379a(0, 0, true);
                while (i < a2) {
                    m157902b();
                    i++;
                }
                return;
            case 10:
                m157893a();
                return;
            case 11:
            case 12:
                return;
            case 13:
                C113954a aVar = new C113954a();
                m157896a(aVar);
                if (aVar.f340833a == 0) {
                    m157895a(mo172379a(0, 0, true));
                    return;
                }
                throw new C113832j("skipField with invalid type, type value: " + b + ", " + aVar.f340833a);
            default:
                throw new C113832j("invalid type.");
        }
    }

    /* renamed from: b */
    private String m157901b(String str, int i, boolean z) {
        String str2;
        if (m157904b(i)) {
            C113954a aVar = new C113954a();
            m157896a(aVar);
            byte b = aVar.f340833a;
            if (b == 6) {
                int i2 = this.f340832b.get();
                if (i2 < 0) {
                    i2 += 256;
                }
                byte[] bArr = new byte[i2];
                this.f340832b.get(bArr);
                try {
                    str2 = new String(bArr, this.f340831a);
                } catch (UnsupportedEncodingException unused) {
                    str2 = new String(bArr);
                }
            } else if (b == 7) {
                int i3 = this.f340832b.getInt();
                if (i3 > 104857600 || i3 < 0 || i3 > this.f340832b.capacity()) {
                    throw new C113832j("String too long: ".concat(String.valueOf(i3)));
                }
                byte[] bArr2 = new byte[i3];
                this.f340832b.get(bArr2);
                try {
                    str2 = new String(bArr2, this.f340831a);
                } catch (UnsupportedEncodingException unused2) {
                    str2 = new String(bArr2);
                }
            } else {
                throw new C113832j("type mismatch.");
            }
            return str2;
        } else if (!z) {
            return str;
        } else {
            throw new C113832j("require field not exist.");
        }
    }

    /* renamed from: c */
    private ByteBuffer m157906c() {
        return this.f340832b;
    }

    /* renamed from: b */
    public final String mo172389b(int i, boolean z) {
        if (m157904b(i)) {
            C113954a aVar = new C113954a();
            m157896a(aVar);
            byte b = aVar.f340833a;
            if (b == 6) {
                int i2 = this.f340832b.get();
                if (i2 < 0) {
                    i2 += 256;
                }
                byte[] bArr = new byte[i2];
                this.f340832b.get(bArr);
                try {
                    return new String(bArr, this.f340831a);
                } catch (UnsupportedEncodingException unused) {
                    return new String(bArr);
                }
            } else if (b == 7) {
                int i3 = this.f340832b.getInt();
                if (i3 > 104857600 || i3 < 0 || i3 > this.f340832b.capacity()) {
                    throw new C113832j("String too long: ".concat(String.valueOf(i3)));
                }
                byte[] bArr2 = new byte[i3];
                this.f340832b.get(bArr2);
                try {
                    return new String(bArr2, this.f340831a);
                } catch (UnsupportedEncodingException unused2) {
                    return new String(bArr2);
                }
            } else {
                throw new C113832j("type mismatch.");
            }
        } else if (!z) {
            return null;
        } else {
            throw new C113832j("require field not exist.");
        }
    }

    /* renamed from: a */
    public final boolean mo172388a(int i, boolean z) {
        return mo172376a((byte) 0, i, z) != 0;
    }

    /* renamed from: a */
    public final byte mo172376a(byte b, int i, boolean z) {
        if (m157904b(i)) {
            C113954a aVar = new C113954a();
            m157896a(aVar);
            byte b2 = aVar.f340833a;
            if (b2 == 0) {
                return this.f340832b.get();
            }
            if (b2 == 12) {
                return 0;
            }
            throw new C113832j("type mismatch.");
        } else if (!z) {
            return b;
        } else {
            throw new C113832j("require field not exist.");
        }
    }

    /* renamed from: a */
    public final short mo172386a(short s, int i, boolean z) {
        if (m157904b(i)) {
            C113954a aVar = new C113954a();
            m157896a(aVar);
            byte b = aVar.f340833a;
            if (b == 0) {
                return (short) this.f340832b.get();
            }
            if (b == 1) {
                return this.f340832b.getShort();
            }
            if (b == 12) {
                return 0;
            }
            throw new C113832j("type mismatch.");
        } else if (!z) {
            return s;
        } else {
            throw new C113832j("require field not exist.");
        }
    }

    /* renamed from: b */
    private <T> T[] m157905b(T t, int i, boolean z) {
        if (m157904b(i)) {
            C113954a aVar = new C113954a();
            m157896a(aVar);
            if (aVar.f340833a == 9) {
                int a = mo172379a(0, 0, true);
                if (a >= 0) {
                    T[] tArr = (Object[]) Array.newInstance(t.getClass(), a);
                    for (int i2 = 0; i2 < a; i2++) {
                        tArr[i2] = mo172384a(t, 0, true);
                    }
                    return tArr;
                }
                throw new C113832j("size invalid: ".concat(String.valueOf(a)));
            }
            throw new C113832j("type mismatch.");
        } else if (!z) {
            return null;
        } else {
            throw new C113832j("require field not exist.");
        }
    }

    /* renamed from: a */
    public final int mo172379a(int i, int i2, boolean z) {
        if (m157904b(i2)) {
            C113954a aVar = new C113954a();
            m157896a(aVar);
            byte b = aVar.f340833a;
            if (b == 0) {
                return this.f340832b.get();
            }
            if (b == 1) {
                return this.f340832b.getShort();
            }
            if (b == 2) {
                return this.f340832b.getInt();
            }
            if (b == 12) {
                return 0;
            }
            throw new C113832j("type mismatch.");
        } else if (!z) {
            return i;
        } else {
            throw new C113832j("require field not exist.");
        }
    }

    /* renamed from: a */
    public final long mo172381a(long j, int i, boolean z) {
        int i2;
        if (m157904b(i)) {
            C113954a aVar = new C113954a();
            m157896a(aVar);
            byte b = aVar.f340833a;
            if (b == 0) {
                i2 = this.f340832b.get();
            } else if (b == 1) {
                i2 = this.f340832b.getShort();
            } else if (b == 2) {
                i2 = this.f340832b.getInt();
            } else if (b == 3) {
                return this.f340832b.getLong();
            } else {
                if (b == 12) {
                    return 0;
                }
                throw new C113832j("type mismatch.");
            }
            return (long) i2;
        } else if (!z) {
            return j;
        } else {
            throw new C113832j("require field not exist.");
        }
    }

    /* renamed from: a */
    public final float mo172378a(float f, int i, boolean z) {
        if (m157904b(i)) {
            C113954a aVar = new C113954a();
            m157896a(aVar);
            byte b = aVar.f340833a;
            if (b == 4) {
                return this.f340832b.getFloat();
            }
            if (b == 12) {
                return 0.0f;
            }
            throw new C113832j("type mismatch.");
        } else if (!z) {
            return f;
        } else {
            throw new C113832j("require field not exist.");
        }
    }

    /* renamed from: a */
    public final double mo172377a(double d, int i, boolean z) {
        if (m157904b(i)) {
            C113954a aVar = new C113954a();
            m157896a(aVar);
            byte b = aVar.f340833a;
            if (b == 4) {
                return (double) this.f340832b.getFloat();
            }
            if (b == 5) {
                return this.f340832b.getDouble();
            }
            if (b == 12) {
                return 0.0d;
            }
            throw new C113832j("type mismatch.");
        } else if (!z) {
            return d;
        } else {
            throw new C113832j("require field not exist.");
        }
    }

    /* renamed from: a */
    private String m157890a(String str, int i, boolean z) {
        if (m157904b(i)) {
            C113954a aVar = new C113954a();
            m157896a(aVar);
            byte b = aVar.f340833a;
            if (b == 6) {
                int i2 = this.f340832b.get();
                if (i2 < 0) {
                    i2 += 256;
                }
                byte[] bArr = new byte[i2];
                this.f340832b.get(bArr);
                return C80342i.m97830a(bArr);
            } else if (b == 7) {
                int i3 = this.f340832b.getInt();
                if (i3 > 104857600 || i3 < 0 || i3 > this.f340832b.capacity()) {
                    throw new C113832j("String too long: ".concat(String.valueOf(i3)));
                }
                byte[] bArr2 = new byte[i3];
                this.f340832b.get(bArr2);
                return C80342i.m97830a(bArr2);
            } else {
                throw new C113832j("type mismatch.");
            }
        } else if (!z) {
            return str;
        } else {
            throw new C113832j("require field not exist.");
        }
    }

    /* renamed from: a */
    private String[] m157899a(String[] strArr, int i, boolean z) {
        return (String[]) m157898a((T[]) strArr, i, z);
    }

    /* renamed from: a */
    public final <K, V> HashMap<K, V> mo172385a(Map<K, V> map, int i, boolean z) {
        return (HashMap) m157892a(new HashMap(), map, i, z);
    }

    /* renamed from: a */
    private <K, V> Map<K, V> m157892a(Map<K, V> map, Map<K, V> map2, int i, boolean z) {
        if (map2 == null || map2.isEmpty()) {
            return new HashMap();
        }
        Map.Entry next = map2.entrySet().iterator().next();
        Object key = next.getKey();
        Object value = next.getValue();
        if (m157904b(i)) {
            C113954a aVar = new C113954a();
            m157896a(aVar);
            if (aVar.f340833a == 8) {
                int a = mo172379a(0, 0, true);
                if (a >= 0) {
                    for (int i2 = 0; i2 < a; i2++) {
                        map.put(mo172384a(key, 0, true), mo172384a(value, 1, true));
                    }
                } else {
                    throw new C113832j("size invalid: ".concat(String.valueOf(a)));
                }
            } else {
                throw new C113832j("type mismatch.");
            }
        } else if (z) {
            throw new C113832j("require field not exist.");
        }
        return map;
    }

    /* renamed from: a */
    private <T> T[] m157898a(T[] tArr, int i, boolean z) {
        if (tArr != null && tArr.length != 0) {
            return m157905b(tArr[0], i, z);
        }
        throw new C113832j("unable to get type of key and value.");
    }

    /* renamed from: a */
    private <T> List<T> m157891a(List<T> list, int i, boolean z) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        Object[] b = m157905b(list.get(0), i, z);
        if (b == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object add : b) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final C114029p mo172382a(C114029p pVar) {
        if (m157904b(0)) {
            try {
                C114029p newInit = pVar.newInit();
                C113954a aVar = new C113954a();
                m157896a(aVar);
                if (aVar.f340833a == 10) {
                    newInit.readFrom(this);
                    m157893a();
                    return newInit;
                }
                throw new C113832j("type mismatch.");
            } catch (Exception e) {
                throw new C113832j(e.getMessage());
            }
        } else {
            throw new C113832j("require field not exist.");
        }
    }

    /* renamed from: a */
    public final C114029p mo172383a(C114029p pVar, int i, boolean z) {
        if (m157904b(i)) {
            try {
                C114029p pVar2 = (C114029p) pVar.getClass().newInstance();
                C113954a aVar = new C113954a();
                m157896a(aVar);
                if (aVar.f340833a == 10) {
                    pVar2.readFrom(this);
                    m157893a();
                    return pVar2;
                }
                throw new C113832j("type mismatch.");
            } catch (Exception e) {
                throw new C113832j(e.getMessage());
            }
        } else if (!z) {
            return null;
        } else {
            throw new C113832j("require field not exist.");
        }
    }

    /* renamed from: a */
    private C114029p[] m157897a(C114029p[] pVarArr, int i, boolean z) {
        return (C114029p[]) m157898a((T[]) pVarArr, i, z);
    }

    /* renamed from: a */
    public final <T> Object mo172384a(T t, int i, boolean z) {
        if (t instanceof Byte) {
            return Byte.valueOf(mo172376a((byte) 0, i, z));
        }
        if (t instanceof Boolean) {
            return Boolean.valueOf(mo172388a(i, z));
        }
        if (t instanceof Short) {
            return Short.valueOf(mo172386a(0, i, z));
        }
        if (t instanceof Integer) {
            return Integer.valueOf(mo172379a(0, i, z));
        }
        if (t instanceof Long) {
            return Long.valueOf(mo172381a(0, i, z));
        }
        if (t instanceof Float) {
            return Float.valueOf(mo172378a(0.0f, i, z));
        }
        if (t instanceof Double) {
            return Double.valueOf(mo172377a(0.0d, i, z));
        }
        if (t instanceof String) {
            return mo172389b(i, z);
        }
        if (t instanceof Map) {
            return mo172385a((Map) t, i, z);
        }
        if (t instanceof List) {
            return m157891a((List) t, i, z);
        }
        if (t instanceof C114029p) {
            return mo172383a((C114029p) t, i, z);
        }
        if (!t.getClass().isArray()) {
            throw new C113832j("read object error: unsupport type.");
        } else if ((t instanceof byte[]) || (t instanceof Byte[])) {
            return mo172390c(i, z);
        } else {
            if (t instanceof boolean[]) {
                return m157909f(i, z);
            }
            if (t instanceof short[]) {
                return m157910g(i, z);
            }
            if (t instanceof int[]) {
                return m157911h(i, z);
            }
            if (t instanceof long[]) {
                return m157912i(i, z);
            }
            if (t instanceof float[]) {
                return m157913j(i, z);
            }
            if (t instanceof double[]) {
                return m157914k(i, z);
            }
            return m157898a((T[]) (Object[]) t, i, z);
        }
    }

    /* renamed from: a */
    public final int mo172380a(String str) {
        this.f340831a = str;
        return 0;
    }
}
