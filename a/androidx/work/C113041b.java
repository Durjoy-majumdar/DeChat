package androidx.work;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p1014o4.C117693m;

/* renamed from: androidx.work.b */
public final class C113041b {

    /* renamed from: b */
    public static final C113041b f338352b;

    /* renamed from: a */
    public Map<String, Object> f338353a;

    /* renamed from: androidx.work.b$a */
    public static final class C113042a {

        /* renamed from: a */
        public Map<String, Object> f338354a = new HashMap();

        /* renamed from: a */
        public C113042a mo165526a(Map<String, Object> map) {
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                Object value = next.getValue();
                if (value == null) {
                    ((HashMap) this.f338354a).put(str, (Object) null);
                } else {
                    Class<?> cls = value.getClass();
                    if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                        ((HashMap) this.f338354a).put(str, value);
                    } else {
                        int i = 0;
                        if (cls == boolean[].class) {
                            Map<String, Object> map2 = this.f338354a;
                            boolean[] zArr = (boolean[]) value;
                            C113041b bVar = C113041b.f338352b;
                            Boolean[] boolArr = new Boolean[zArr.length];
                            while (i < zArr.length) {
                                boolArr[i] = Boolean.valueOf(zArr[i]);
                                i++;
                            }
                            ((HashMap) map2).put(str, boolArr);
                        } else if (cls == byte[].class) {
                            Map<String, Object> map3 = this.f338354a;
                            byte[] bArr = (byte[]) value;
                            C113041b bVar2 = C113041b.f338352b;
                            Byte[] bArr2 = new Byte[bArr.length];
                            while (i < bArr.length) {
                                bArr2[i] = Byte.valueOf(bArr[i]);
                                i++;
                            }
                            ((HashMap) map3).put(str, bArr2);
                        } else if (cls == int[].class) {
                            Map<String, Object> map4 = this.f338354a;
                            int[] iArr = (int[]) value;
                            C113041b bVar3 = C113041b.f338352b;
                            Integer[] numArr = new Integer[iArr.length];
                            while (i < iArr.length) {
                                numArr[i] = Integer.valueOf(iArr[i]);
                                i++;
                            }
                            ((HashMap) map4).put(str, numArr);
                        } else if (cls == long[].class) {
                            Map<String, Object> map5 = this.f338354a;
                            long[] jArr = (long[]) value;
                            C113041b bVar4 = C113041b.f338352b;
                            Long[] lArr = new Long[jArr.length];
                            while (i < jArr.length) {
                                lArr[i] = Long.valueOf(jArr[i]);
                                i++;
                            }
                            ((HashMap) map5).put(str, lArr);
                        } else if (cls == float[].class) {
                            Map<String, Object> map6 = this.f338354a;
                            float[] fArr = (float[]) value;
                            C113041b bVar5 = C113041b.f338352b;
                            Float[] fArr2 = new Float[fArr.length];
                            while (i < fArr.length) {
                                fArr2[i] = Float.valueOf(fArr[i]);
                                i++;
                            }
                            ((HashMap) map6).put(str, fArr2);
                        } else if (cls == double[].class) {
                            Map<String, Object> map7 = this.f338354a;
                            double[] dArr = (double[]) value;
                            C113041b bVar6 = C113041b.f338352b;
                            Double[] dArr2 = new Double[dArr.length];
                            while (i < dArr.length) {
                                dArr2[i] = Double.valueOf(dArr[i]);
                                i++;
                            }
                            ((HashMap) map7).put(str, dArr2);
                        } else {
                            throw new IllegalArgumentException(String.format("Key %s has invalid type %s", new Object[]{str, cls}));
                        }
                    }
                }
            }
            return this;
        }
    }

    static {
        C117693m.m165967e("Data");
        C113041b bVar = new C113041b((Map<String, ?>) new HashMap());
        m154668c(bVar);
        f338352b = bVar;
    }

    public C113041b() {
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x003c */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0039 A[SYNTHETIC, Splitter:B:20:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0042 A[SYNTHETIC, Splitter:B:28:0x0042] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.work.C113041b m154667a(byte[] r5) {
        /*
            int r0 = r5.length
            r1 = 10240(0x2800, float:1.4349E-41)
            if (r0 > r1) goto L_0x004c
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r5)
            r5 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ IOException | ClassNotFoundException -> 0x0040, all -> 0x0034 }
            r2.<init>(r1)     // Catch:{ IOException | ClassNotFoundException -> 0x0040, all -> 0x0034 }
            int r5 = r2.readInt()     // Catch:{ IOException | ClassNotFoundException -> 0x0032, all -> 0x0030 }
        L_0x0019:
            if (r5 <= 0) goto L_0x0029
            java.lang.String r3 = r2.readUTF()     // Catch:{ IOException | ClassNotFoundException -> 0x0032, all -> 0x0030 }
            java.lang.Object r4 = r2.readObject()     // Catch:{ IOException | ClassNotFoundException -> 0x0032, all -> 0x0030 }
            r0.put(r3, r4)     // Catch:{ IOException | ClassNotFoundException -> 0x0032, all -> 0x0030 }
            int r5 = r5 + -1
            goto L_0x0019
        L_0x0029:
            r2.close()     // Catch:{ IOException -> 0x002c }
        L_0x002c:
            r1.close()     // Catch:{ IOException -> 0x0046 }
            goto L_0x0046
        L_0x0030:
            r5 = move-exception
            goto L_0x0037
        L_0x0032:
            r5 = r2
            goto L_0x0040
        L_0x0034:
            r0 = move-exception
            r2 = r5
            r5 = r0
        L_0x0037:
            if (r2 == 0) goto L_0x003c
            r2.close()     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            r1.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            throw r5
        L_0x0040:
            if (r5 == 0) goto L_0x002c
            r5.close()     // Catch:{ IOException -> 0x002c }
            goto L_0x002c
        L_0x0046:
            androidx.work.b r5 = new androidx.work.b
            r5.<init>((java.util.Map<java.lang.String, ?>) r0)
            return r5
        L_0x004c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.C113041b.m154667a(byte[]):androidx.work.b");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|(2:7|5)|8|9|10|11|13|(2:15|16)(2:17|18)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:19|20|(0)|36|37|38) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:22|21|24|25|(0)|29|30|31) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0042 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0063 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0075 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069 A[SYNTHETIC, Splitter:B:27:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072 A[SYNTHETIC, Splitter:B:34:0x0072] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m154668c(androidx.work.C113041b r4) {
        /*
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0063 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0063 }
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.f338353a     // Catch:{ IOException -> 0x005f, all -> 0x005c }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ IOException -> 0x005f, all -> 0x005c }
            int r1 = r1.size()     // Catch:{ IOException -> 0x005f, all -> 0x005c }
            r2.writeInt(r1)     // Catch:{ IOException -> 0x005f, all -> 0x005c }
            java.util.Map<java.lang.String, java.lang.Object> r4 = r4.f338353a     // Catch:{ IOException -> 0x005f, all -> 0x005c }
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ IOException -> 0x005f, all -> 0x005c }
            java.util.Set r4 = r4.entrySet()     // Catch:{ IOException -> 0x005f, all -> 0x005c }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x005f, all -> 0x005c }
        L_0x0022:
            boolean r1 = r4.hasNext()     // Catch:{ IOException -> 0x005f, all -> 0x005c }
            if (r1 == 0) goto L_0x003f
            java.lang.Object r1 = r4.next()     // Catch:{ IOException -> 0x005f, all -> 0x005c }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ IOException -> 0x005f, all -> 0x005c }
            java.lang.Object r3 = r1.getKey()     // Catch:{ IOException -> 0x005f, all -> 0x005c }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x005f, all -> 0x005c }
            r2.writeUTF(r3)     // Catch:{ IOException -> 0x005f, all -> 0x005c }
            java.lang.Object r1 = r1.getValue()     // Catch:{ IOException -> 0x005f, all -> 0x005c }
            r2.writeObject(r1)     // Catch:{ IOException -> 0x005f, all -> 0x005c }
            goto L_0x0022
        L_0x003f:
            r2.close()     // Catch:{ IOException -> 0x0042 }
        L_0x0042:
            r0.close()     // Catch:{ IOException -> 0x0046 }
            goto L_0x0047
        L_0x0046:
        L_0x0047:
            int r4 = r0.size()
            r1 = 10240(0x2800, float:1.4349E-41)
            if (r4 > r1) goto L_0x0054
            byte[] r4 = r0.toByteArray()
            return r4
        L_0x0054:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r4.<init>(r0)
            throw r4
        L_0x005c:
            r4 = move-exception
            r1 = r2
            goto L_0x0070
        L_0x005f:
            r1 = r2
            goto L_0x0063
        L_0x0061:
            r4 = move-exception
            goto L_0x0070
        L_0x0063:
            byte[] r4 = r0.toByteArray()     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x006c
            r1.close()     // Catch:{ IOException -> 0x006c }
        L_0x006c:
            r0.close()     // Catch:{ IOException -> 0x006f }
        L_0x006f:
            return r4
        L_0x0070:
            if (r1 == 0) goto L_0x0075
            r1.close()     // Catch:{ IOException -> 0x0075 }
        L_0x0075:
            r0.close()     // Catch:{ IOException -> 0x0078 }
        L_0x0078:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.C113041b.m154668c(androidx.work.b):byte[]");
    }

    /* renamed from: b */
    public int mo165522b(String str, int i) {
        Object obj = this.f338353a.get(str);
        return obj instanceof Integer ? ((Integer) obj).intValue() : i;
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj == null || C113041b.class != obj.getClass()) {
            return false;
        }
        C113041b bVar = (C113041b) obj;
        Set<String> keySet = this.f338353a.keySet();
        if (!keySet.equals(bVar.f338353a.keySet())) {
            return false;
        }
        for (String next : keySet) {
            Object obj2 = this.f338353a.get(next);
            Object obj3 = bVar.f338353a.get(next);
            if (obj2 == null || obj3 == null) {
                if (obj2 == obj3) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
            } else if (!(obj2 instanceof Object[]) || !(obj3 instanceof Object[])) {
                z = obj2.equals(obj3);
                continue;
            } else {
                z = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f338353a.hashCode() * 31;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.f338353a.isEmpty()) {
            for (String next : this.f338353a.keySet()) {
                sb.append(next);
                sb.append(" : ");
                Object obj = this.f338353a.get(next);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public C113041b(C113041b bVar) {
        this.f338353a = new HashMap(bVar.f338353a);
    }

    public C113041b(Map<String, ?> map) {
        this.f338353a = new HashMap(map);
    }
}
