package p1062x3;

import com.tencent.xweb.file.XVFSFile;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: x3.h */
public class C118821h {

    /* renamed from: a */
    public static final byte[] f355509a = {112, 114, 111, 0};

    /* renamed from: b */
    public static final byte[] f355510b = {112, 114, 109, 0};

    /* renamed from: a */
    public static byte[] m167514a(C118819b[] bVarArr, byte[] bArr) {
        int i = 0;
        int i2 = 0;
        for (C118819b bVar : bVarArr) {
            i2 += m167515b(bVar.f355493a, bVar.f355494b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + (bVar.f355497e * 2) + bVar.f355498f + (((((bVar.f355499g * 2) + 8) - 1) & -8) / 8);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, C118822i.f355513c)) {
            int length = bVarArr.length;
            while (i < length) {
                C118819b bVar2 = bVarArr[i];
                m167525l(byteArrayOutputStream, bVar2, m167515b(bVar2.f355493a, bVar2.f355494b, bArr));
                m167527n(byteArrayOutputStream, bVar2);
                m167524k(byteArrayOutputStream, bVar2);
                m167526m(byteArrayOutputStream, bVar2);
                i++;
            }
        } else {
            for (C118819b bVar3 : bVarArr) {
                m167525l(byteArrayOutputStream, bVar3, m167515b(bVar3.f355493a, bVar3.f355494b, bArr));
            }
            int length2 = bVarArr.length;
            while (i < length2) {
                C118819b bVar4 = bVarArr[i];
                m167527n(byteArrayOutputStream, bVar4);
                m167524k(byteArrayOutputStream, bVar4);
                m167526m(byteArrayOutputStream, bVar4);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    /* renamed from: b */
    public static String m167515b(String str, String str2, byte[] bArr) {
        byte[] bArr2 = C118822i.f355515e;
        String str3 = "!";
        String str4 = (!Arrays.equals(bArr, bArr2) && !Arrays.equals(bArr, C118822i.f355514d)) ? str3 : XVFSFile.PATH_SEPARATOR;
        if (str.length() <= 0) {
            if (str3.equals(str4)) {
                return str2.replace(XVFSFile.PATH_SEPARATOR, str3);
            }
            if (XVFSFile.PATH_SEPARATOR.equals(str4)) {
                str2 = str2.replace(str3, XVFSFile.PATH_SEPARATOR);
            }
            return str2;
        } else if (str2.equals("classes.dex")) {
            return str;
        } else {
            if (str2.contains(str3) || str2.contains(XVFSFile.PATH_SEPARATOR)) {
                if (str3.equals(str4)) {
                    return str2.replace(XVFSFile.PATH_SEPARATOR, str3);
                }
                if (XVFSFile.PATH_SEPARATOR.equals(str4)) {
                    str2 = str2.replace(str3, XVFSFile.PATH_SEPARATOR);
                }
                return str2;
            } else if (str2.endsWith(".apk")) {
                return str2;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, C118822i.f355514d)) {
                    str3 = XVFSFile.PATH_SEPARATOR;
                }
                sb.append(str3);
                sb.append(str2);
                return sb.toString();
            }
        }
    }

    /* renamed from: c */
    public static int m167516c(int i, int i2, int i3) {
        if (i == 1) {
            throw new IllegalStateException("HOT methods are not stored in the bitmap");
        } else if (i == 2) {
            return i2;
        } else {
            if (i == 4) {
                return i2 + i3;
            }
            throw new IllegalStateException("Unexpected flag: " + i);
        }
    }

    /* renamed from: d */
    public static int[] m167517d(InputStream inputStream, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += C91136c.m114344e(inputStream);
            iArr[i3] = i2;
        }
        return iArr;
    }

    /* renamed from: e */
    public static C118819b[] m167518e(InputStream inputStream, byte[] bArr, byte[] bArr2, C118819b[] bVarArr) {
        byte[] bArr3 = C118822i.f355516f;
        if (Arrays.equals(bArr, bArr3)) {
            if (Arrays.equals(C118822i.f355511a, bArr2)) {
                throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            } else if (Arrays.equals(bArr, bArr3)) {
                int d = (int) C91136c.m114343d(inputStream, 1);
                byte[] c = C91136c.m114342c(inputStream, (int) C91136c.m114343d(inputStream, 4), (int) C91136c.m114343d(inputStream, 4));
                if (inputStream.read() <= 0) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(c);
                    try {
                        C118819b[] f = m167519f(byteArrayInputStream, d, bVarArr);
                        byteArrayInputStream.close();
                        return f;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                } else {
                    throw new IllegalStateException("Content found after the end of file");
                }
            } else {
                throw new IllegalStateException("Unsupported meta version");
            }
        } else if (Arrays.equals(bArr, C118822i.f355517g)) {
            int e = C91136c.m114344e(inputStream);
            byte[] c2 = C91136c.m114342c(inputStream, (int) C91136c.m114343d(inputStream, 4), (int) C91136c.m114343d(inputStream, 4));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(c2);
                try {
                    C118819b[] g = m167520g(byteArrayInputStream2, bArr2, e, bVarArr);
                    byteArrayInputStream2.close();
                    return g;
                } catch (Throwable th4) {
                    th.addSuppressed(th4);
                }
            } else {
                throw new IllegalStateException("Content found after the end of file");
            }
        } else {
            throw new IllegalStateException("Unsupported meta version");
        }
        throw th;
        throw th;
    }

    /* renamed from: f */
    public static C118819b[] m167519f(InputStream inputStream, int i, C118819b[] bVarArr) {
        int i2 = 0;
        if (inputStream.available() == 0) {
            return new C118819b[0];
        }
        if (i == bVarArr.length) {
            String[] strArr = new String[i];
            int[] iArr = new int[i];
            for (int i3 = 0; i3 < i; i3++) {
                int e = C91136c.m114344e(inputStream);
                iArr[i3] = C91136c.m114344e(inputStream);
                strArr[i3] = new String(C91136c.m114341b(inputStream, e), StandardCharsets.UTF_8);
            }
            while (i2 < i) {
                C118819b bVar = bVarArr[i2];
                if (bVar.f355494b.equals(strArr[i2])) {
                    int i4 = iArr[i2];
                    bVar.f355497e = i4;
                    bVar.f355500h = m167517d(inputStream, i4);
                    i2++;
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return bVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    /* renamed from: g */
    public static C118819b[] m167520g(InputStream inputStream, byte[] bArr, int i, C118819b[] bVarArr) {
        if (inputStream.available() == 0) {
            return new C118819b[0];
        }
        if (i == bVarArr.length) {
            int i2 = 0;
            while (i2 < i) {
                C91136c.m114344e(inputStream);
                String str = new String(C91136c.m114341b(inputStream, C91136c.m114344e(inputStream)), StandardCharsets.UTF_8);
                long d = C91136c.m114343d(inputStream, 4);
                int e = C91136c.m114344e(inputStream);
                C118819b bVar = null;
                if (bVarArr.length > 0) {
                    int indexOf = str.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str.indexOf(XVFSFile.PATH_SEPARATOR);
                    }
                    String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= bVarArr.length) {
                            break;
                        } else if (bVarArr[i3].f355494b.equals(substring)) {
                            bVar = bVarArr[i3];
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                if (bVar != null) {
                    bVar.f355496d = d;
                    int[] d2 = m167517d(inputStream, e);
                    if (Arrays.equals(bArr, C118822i.f355515e)) {
                        bVar.f355497e = e;
                        bVar.f355500h = d2;
                    }
                    i2++;
                } else {
                    throw new IllegalStateException("Missing profile key: " + str);
                }
            }
            return bVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    /* renamed from: h */
    public static C118819b[] m167521h(InputStream inputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, C118822i.f355512b)) {
            int d = (int) C91136c.m114343d(inputStream, 1);
            byte[] c = C91136c.m114342c(inputStream, (int) C91136c.m114343d(inputStream, 4), (int) C91136c.m114343d(inputStream, 4));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(c);
                try {
                    C118819b[] i = m167522i(byteArrayInputStream, str, d);
                    byteArrayInputStream.close();
                    return i;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                throw new IllegalStateException("Content found after the end of file");
            }
        } else {
            throw new IllegalStateException("Unsupported version");
        }
        throw th;
    }

    /* renamed from: i */
    public static C118819b[] m167522i(InputStream inputStream, String str, int i) {
        InputStream inputStream2 = inputStream;
        int i2 = i;
        if (inputStream.available() == 0) {
            return new C118819b[0];
        }
        C118819b[] bVarArr = new C118819b[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int e = C91136c.m114344e(inputStream);
            int e2 = C91136c.m114344e(inputStream);
            String str2 = str;
            bVarArr[i3] = new C118819b(str2, new String(C91136c.m114341b(inputStream2, e), StandardCharsets.UTF_8), C91136c.m114343d(inputStream2, 4), 0, e2, (int) C91136c.m114343d(inputStream2, 4), (int) C91136c.m114343d(inputStream2, 4), new int[e2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i2) {
            C118819b bVar = bVarArr[i4];
            int available = inputStream.available() - bVar.f355498f;
            int i5 = 0;
            while (inputStream.available() > available) {
                i5 += C91136c.m114344e(inputStream);
                bVar.f355501i.put(Integer.valueOf(i5), 1);
                for (int e3 = C91136c.m114344e(inputStream); e3 > 0; e3--) {
                    C91136c.m114344e(inputStream);
                    int d = (int) C91136c.m114343d(inputStream2, 1);
                    if (!(d == 6 || d == 7)) {
                        while (d > 0) {
                            C91136c.m114343d(inputStream2, 1);
                            for (int d2 = (int) C91136c.m114343d(inputStream2, 1); d2 > 0; d2--) {
                                C91136c.m114344e(inputStream);
                            }
                            d--;
                        }
                    }
                }
            }
            if (inputStream.available() == available) {
                bVar.f355500h = m167517d(inputStream2, bVar.f355497e);
                BitSet valueOf = BitSet.valueOf(C91136c.m114341b(inputStream2, ((((bVar.f355499g * 2) + 8) - 1) & -8) / 8));
                int i6 = 0;
                while (true) {
                    int i7 = bVar.f355499g;
                    if (i6 >= i7) {
                        break;
                    }
                    int i8 = valueOf.get(m167516c(2, i6, i7)) ? 2 : 0;
                    if (valueOf.get(m167516c(4, i6, i7))) {
                        i8 |= 4;
                    }
                    if (i8 != 0) {
                        Integer num = bVar.f355501i.get(Integer.valueOf(i6));
                        if (num == null) {
                            num = 0;
                        }
                        bVar.f355501i.put(Integer.valueOf(i6), Integer.valueOf(num.intValue() | i8));
                    }
                    i6++;
                }
                i4++;
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return bVarArr;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: j */
    public static boolean m167523j(OutputStream outputStream, byte[] bArr, C118819b[] bVarArr) {
        Throwable th;
        Throwable th4;
        ArrayList arrayList;
        int i;
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th5;
        ByteArrayOutputStream byteArrayOutputStream2;
        Throwable th6;
        OutputStream outputStream2 = outputStream;
        byte[] bArr2 = bArr;
        C118819b[] bVarArr2 = bVarArr;
        if (Arrays.equals(bArr2, C118822i.f355511a)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            try {
                C91136c.m114346g(byteArrayOutputStream3, bVarArr2.length);
                int i2 = 2;
                int i3 = 2;
                for (C118819b bVar : bVarArr2) {
                    C91136c.m114345f(byteArrayOutputStream3, bVar.f355495c, 4);
                    C91136c.m114345f(byteArrayOutputStream3, bVar.f355496d, 4);
                    C91136c.m114345f(byteArrayOutputStream3, (long) bVar.f355499g, 4);
                    String b = m167515b(bVar.f355493a, bVar.f355494b, C118822i.f355511a);
                    int length = b.getBytes(StandardCharsets.UTF_8).length;
                    C91136c.m114346g(byteArrayOutputStream3, length);
                    i3 = i3 + 4 + 4 + 4 + 2 + (length * 1);
                    byteArrayOutputStream3.write(b.getBytes(StandardCharsets.UTF_8));
                }
                byte[] byteArray = byteArrayOutputStream3.toByteArray();
                if (i3 == byteArray.length) {
                    C118823j jVar = new C118823j(C118820d.DEX_FILES, i3, byteArray, false);
                    byteArrayOutputStream3.close();
                    arrayList2.add(jVar);
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < bVarArr2.length) {
                        try {
                            C118819b bVar2 = bVarArr2[i4];
                            C91136c.m114346g(byteArrayOutputStream4, i4);
                            C91136c.m114346g(byteArrayOutputStream4, bVar2.f355497e);
                            i5 = i5 + 2 + 2 + (bVar2.f355497e * 2);
                            m167524k(byteArrayOutputStream4, bVar2);
                            i4++;
                        } catch (Throwable th7) {
                            th4.addSuppressed(th7);
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream4.toByteArray();
                    if (i5 == byteArray2.length) {
                        C118823j jVar2 = new C118823j(C118820d.CLASSES, i5, byteArray2, true);
                        byteArrayOutputStream4.close();
                        arrayList2.add(jVar2);
                        ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < bVarArr2.length) {
                            try {
                                C118819b bVar3 = bVarArr2[i6];
                                int i8 = 0;
                                for (Map.Entry<Integer, Integer> value : bVar3.f355501i.entrySet()) {
                                    i8 |= ((Integer) value.getValue()).intValue();
                                }
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                m167526m(byteArrayOutputStream, bVar3);
                                byte[] byteArray3 = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                byteArrayOutputStream2 = new ByteArrayOutputStream();
                                m167527n(byteArrayOutputStream2, bVar3);
                                byte[] byteArray4 = byteArrayOutputStream2.toByteArray();
                                byteArrayOutputStream2.close();
                                C91136c.m114346g(byteArrayOutputStream5, i6);
                                int length2 = byteArray3.length + i2 + byteArray4.length;
                                int i9 = i7 + 2 + 4;
                                ArrayList arrayList4 = arrayList3;
                                C91136c.m114345f(byteArrayOutputStream5, (long) length2, 4);
                                C91136c.m114346g(byteArrayOutputStream5, i8);
                                byteArrayOutputStream5.write(byteArray3);
                                byteArrayOutputStream5.write(byteArray4);
                                i7 = i9 + length2;
                                i6++;
                                arrayList3 = arrayList4;
                                i2 = 2;
                            } catch (Throwable th8) {
                                Throwable th9 = th8;
                                try {
                                    byteArrayOutputStream5.close();
                                } catch (Throwable th10) {
                                    th9.addSuppressed(th10);
                                }
                                throw th9;
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream5.toByteArray();
                        if (i7 == byteArray5.length) {
                            C118823j jVar3 = new C118823j(C118820d.METHODS, i7, byteArray5, true);
                            byteArrayOutputStream5.close();
                            arrayList2.add(jVar3);
                            long j = (long) 4;
                            long size = j + j + 4 + ((long) (arrayList2.size() * 16));
                            C91136c.m114345f(outputStream2, (long) arrayList2.size(), 4);
                            int i15 = 0;
                            while (i15 < arrayList2.size()) {
                                C118823j jVar4 = (C118823j) arrayList2.get(i15);
                                C91136c.m114345f(outputStream2, jVar4.f355518a.f355506d, 4);
                                C91136c.m114345f(outputStream2, size, 4);
                                if (jVar4.f355520c) {
                                    byte[] bArr3 = jVar4.f355519b;
                                    long length3 = (long) bArr3.length;
                                    byte[] a = C91136c.m114340a(bArr3);
                                    arrayList = arrayList5;
                                    arrayList.add(a);
                                    C91136c.m114345f(outputStream2, (long) a.length, 4);
                                    C91136c.m114345f(outputStream2, length3, 4);
                                    i = a.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(jVar4.f355519b);
                                    C91136c.m114345f(outputStream2, (long) jVar4.f355519b.length, 4);
                                    C91136c.m114345f(outputStream2, 0, 4);
                                    i = jVar4.f355519b.length;
                                }
                                size += (long) i;
                                i15++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i16 = 0; i16 < arrayList6.size(); i16++) {
                                outputStream2.write((byte[]) arrayList6.get(i16));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i3 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th11) {
                th.addSuppressed(th11);
            }
        } else {
            byte[] bArr4 = C118822i.f355512b;
            if (Arrays.equals(bArr2, bArr4)) {
                byte[] a2 = m167514a(bVarArr2, bArr4);
                C91136c.m114345f(outputStream2, (long) bVarArr2.length, 1);
                C91136c.m114345f(outputStream2, (long) a2.length, 4);
                byte[] a3 = C91136c.m114340a(a2);
                C91136c.m114345f(outputStream2, (long) a3.length, 4);
                outputStream2.write(a3);
                return true;
            } else if (Arrays.equals(bArr2, C118822i.f355514d)) {
                C91136c.m114345f(outputStream2, (long) bVarArr2.length, 1);
                for (C118819b bVar4 : bVarArr2) {
                    String b2 = m167515b(bVar4.f355493a, bVar4.f355494b, C118822i.f355514d);
                    C91136c.m114346g(outputStream2, b2.getBytes(StandardCharsets.UTF_8).length);
                    C91136c.m114346g(outputStream2, bVar4.f355500h.length);
                    C91136c.m114345f(outputStream2, (long) (bVar4.f355501i.size() * 4), 4);
                    C91136c.m114345f(outputStream2, bVar4.f355495c, 4);
                    outputStream2.write(b2.getBytes(StandardCharsets.UTF_8));
                    for (Integer intValue : bVar4.f355501i.keySet()) {
                        C91136c.m114346g(outputStream2, intValue.intValue());
                        C91136c.m114346g(outputStream2, 0);
                    }
                    for (int g : bVar4.f355500h) {
                        C91136c.m114346g(outputStream2, g);
                    }
                }
                return true;
            } else {
                byte[] bArr5 = C118822i.f355513c;
                if (Arrays.equals(bArr2, bArr5)) {
                    byte[] a4 = m167514a(bVarArr2, bArr5);
                    C91136c.m114345f(outputStream2, (long) bVarArr2.length, 1);
                    C91136c.m114345f(outputStream2, (long) a4.length, 4);
                    byte[] a5 = C91136c.m114340a(a4);
                    C91136c.m114345f(outputStream2, (long) a5.length, 4);
                    outputStream2.write(a5);
                    return true;
                } else if (!Arrays.equals(bArr2, C118822i.f355515e)) {
                    return false;
                } else {
                    C91136c.m114346g(outputStream2, bVarArr2.length);
                    for (C118819b bVar5 : bVarArr2) {
                        String b3 = m167515b(bVar5.f355493a, bVar5.f355494b, C118822i.f355515e);
                        C91136c.m114346g(outputStream2, b3.getBytes(StandardCharsets.UTF_8).length);
                        C91136c.m114346g(outputStream2, bVar5.f355501i.size());
                        C91136c.m114346g(outputStream2, bVar5.f355500h.length);
                        C91136c.m114345f(outputStream2, bVar5.f355495c, 4);
                        outputStream2.write(b3.getBytes(StandardCharsets.UTF_8));
                        for (Integer intValue2 : bVar5.f355501i.keySet()) {
                            C91136c.m114346g(outputStream2, intValue2.intValue());
                        }
                        for (int g2 : bVar5.f355500h) {
                            C91136c.m114346g(outputStream2, g2);
                        }
                    }
                    return true;
                }
            }
        }
        throw th;
        throw th5;
        throw th4;
        throw th6;
    }

    /* renamed from: k */
    public static void m167524k(OutputStream outputStream, C118819b bVar) {
        int i = 0;
        for (int valueOf : bVar.f355500h) {
            Integer valueOf2 = Integer.valueOf(valueOf);
            C91136c.m114346g(outputStream, valueOf2.intValue() - i);
            i = valueOf2.intValue();
        }
    }

    /* renamed from: l */
    public static void m167525l(OutputStream outputStream, C118819b bVar, String str) {
        C91136c.m114346g(outputStream, str.getBytes(StandardCharsets.UTF_8).length);
        C91136c.m114346g(outputStream, bVar.f355497e);
        C91136c.m114345f(outputStream, (long) bVar.f355498f, 4);
        C91136c.m114345f(outputStream, bVar.f355495c, 4);
        C91136c.m114345f(outputStream, (long) bVar.f355499g, 4);
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    /* renamed from: m */
    public static void m167526m(OutputStream outputStream, C118819b bVar) {
        byte[] bArr = new byte[(((((bVar.f355499g * 2) + 8) - 1) & -8) / 8)];
        for (Map.Entry next : bVar.f355501i.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            int intValue2 = ((Integer) next.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int c = m167516c(2, intValue, bVar.f355499g);
                int i = c / 8;
                bArr[i] = (byte) ((1 << (c % 8)) | bArr[i]);
            }
            if ((intValue2 & 4) != 0) {
                int c2 = m167516c(4, intValue, bVar.f355499g);
                int i2 = c2 / 8;
                bArr[i2] = (byte) ((1 << (c2 % 8)) | bArr[i2]);
            }
        }
        outputStream.write(bArr);
    }

    /* renamed from: n */
    public static void m167527n(OutputStream outputStream, C118819b bVar) {
        int i = 0;
        for (Map.Entry next : bVar.f355501i.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            if ((((Integer) next.getValue()).intValue() & 1) != 0) {
                C91136c.m114346g(outputStream, intValue - i);
                C91136c.m114346g(outputStream, 0);
                i = intValue;
            }
        }
    }
}
