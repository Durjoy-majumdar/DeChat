package v24;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import u24.C90596b;
import u24.C90600i;
import x24.C91135a;

/* renamed from: v24.b */
public abstract class C90743b implements Serializable {

    /* renamed from: o */
    public static final C90743b f260630o = new C90744a();

    /* renamed from: p */
    public static final C90743b f260631p = new C90746c();

    /* renamed from: q */
    public static final ThreadLocal f260632q = new ThreadLocal();

    /* renamed from: d */
    public boolean f260633d = true;

    /* renamed from: e */
    public boolean f260634e = true;

    /* renamed from: f */
    public boolean f260635f = false;

    /* renamed from: g */
    public boolean f260636g = true;

    /* renamed from: h */
    public String f260637h = "[";

    /* renamed from: i */
    public String f260638i = "]";

    /* renamed from: j */
    public boolean f260639j = false;

    /* renamed from: n */
    public String f260640n = ",";

    /* renamed from: v24.b$a */
    public static final class C90744a extends C90743b {
    }

    /* renamed from: v24.b$b */
    public static final class C90745b extends C90743b {
        public C90745b() {
            this.f260637h = "[";
            StringBuffer stringBuffer = new StringBuffer();
            String str = C90600i.f260316b;
            stringBuffer.append(str);
            stringBuffer.append("  ");
            String stringBuffer2 = stringBuffer.toString();
            String str2 = "";
            this.f260640n = stringBuffer2 == null ? str2 : stringBuffer2;
            this.f260639j = true;
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(str);
            stringBuffer3.append("]");
            String stringBuffer4 = stringBuffer3.toString();
            this.f260638i = stringBuffer4 != null ? stringBuffer4 : str2;
        }
    }

    /* renamed from: v24.b$c */
    public static final class C90746c extends C90743b {
        public C90746c() {
            this.f260634e = false;
            this.f260636g = false;
            this.f260633d = false;
            this.f260637h = "";
            this.f260638i = "";
        }
    }

    static {
        new C90745b();
    }

    /* renamed from: d */
    public static void m113811d(Object obj) {
        if (obj != null) {
            ThreadLocal threadLocal = f260632q;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new WeakHashMap();
                threadLocal.set(map);
            }
            map.put(obj, (Object) null);
        }
    }

    /* renamed from: e */
    public static void m113812e(Object obj) {
        if (obj != null) {
            ThreadLocal threadLocal = f260632q;
            Map map = (Map) threadLocal.get();
            if (map != null) {
                map.remove(obj);
                if (map.isEmpty()) {
                    threadLocal.set((Object) null);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo124875a(StringBuffer stringBuffer, String str, Object obj, boolean z) {
        Map map = (Map) f260632q.get();
        int i = 0;
        if (!(map != null && map.containsKey(obj)) || (obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof Character)) {
            m113811d(obj);
            try {
                if (obj instanceof Collection) {
                    if (z) {
                        stringBuffer.append((Collection) obj);
                    } else {
                        mo124876b(stringBuffer, str, ((Collection) obj).size());
                    }
                } else if (obj instanceof Map) {
                    if (z) {
                        stringBuffer.append((Map) obj);
                    } else {
                        mo124876b(stringBuffer, str, ((Map) obj).size());
                    }
                } else if (obj instanceof long[]) {
                    if (z) {
                        long[] jArr = (long[]) obj;
                        stringBuffer.append("{");
                        while (i < jArr.length) {
                            if (i > 0) {
                                stringBuffer.append(",");
                            }
                            stringBuffer.append(jArr[i]);
                            i++;
                        }
                        stringBuffer.append("}");
                    } else {
                        mo124876b(stringBuffer, str, ((long[]) obj).length);
                    }
                } else if (obj instanceof int[]) {
                    if (z) {
                        int[] iArr = (int[]) obj;
                        stringBuffer.append("{");
                        while (i < iArr.length) {
                            if (i > 0) {
                                stringBuffer.append(",");
                            }
                            stringBuffer.append(iArr[i]);
                            i++;
                        }
                        stringBuffer.append("}");
                    } else {
                        mo124876b(stringBuffer, str, ((int[]) obj).length);
                    }
                } else if (obj instanceof short[]) {
                    if (z) {
                        short[] sArr = (short[]) obj;
                        stringBuffer.append("{");
                        while (i < sArr.length) {
                            if (i > 0) {
                                stringBuffer.append(",");
                            }
                            stringBuffer.append(sArr[i]);
                            i++;
                        }
                        stringBuffer.append("}");
                    } else {
                        mo124876b(stringBuffer, str, ((short[]) obj).length);
                    }
                } else if (obj instanceof byte[]) {
                    if (z) {
                        byte[] bArr = (byte[]) obj;
                        stringBuffer.append("{");
                        while (i < bArr.length) {
                            if (i > 0) {
                                stringBuffer.append(",");
                            }
                            stringBuffer.append(bArr[i]);
                            i++;
                        }
                        stringBuffer.append("}");
                    } else {
                        mo124876b(stringBuffer, str, ((byte[]) obj).length);
                    }
                } else if (obj instanceof char[]) {
                    if (z) {
                        char[] cArr = (char[]) obj;
                        stringBuffer.append("{");
                        while (i < cArr.length) {
                            if (i > 0) {
                                stringBuffer.append(",");
                            }
                            stringBuffer.append(cArr[i]);
                            i++;
                        }
                        stringBuffer.append("}");
                    } else {
                        mo124876b(stringBuffer, str, ((char[]) obj).length);
                    }
                } else if (obj instanceof double[]) {
                    if (z) {
                        double[] dArr = (double[]) obj;
                        stringBuffer.append("{");
                        while (i < dArr.length) {
                            if (i > 0) {
                                stringBuffer.append(",");
                            }
                            stringBuffer.append(dArr[i]);
                            i++;
                        }
                        stringBuffer.append("}");
                    } else {
                        mo124876b(stringBuffer, str, ((double[]) obj).length);
                    }
                } else if (obj instanceof float[]) {
                    if (z) {
                        float[] fArr = (float[]) obj;
                        stringBuffer.append("{");
                        while (i < fArr.length) {
                            if (i > 0) {
                                stringBuffer.append(",");
                            }
                            stringBuffer.append(fArr[i]);
                            i++;
                        }
                        stringBuffer.append("}");
                    } else {
                        mo124876b(stringBuffer, str, ((float[]) obj).length);
                    }
                } else if (obj instanceof boolean[]) {
                    if (z) {
                        boolean[] zArr = (boolean[]) obj;
                        stringBuffer.append("{");
                        while (i < zArr.length) {
                            if (i > 0) {
                                stringBuffer.append(",");
                            }
                            stringBuffer.append(zArr[i]);
                            i++;
                        }
                        stringBuffer.append("}");
                    } else {
                        mo124876b(stringBuffer, str, ((boolean[]) obj).length);
                    }
                } else if (obj.getClass().isArray()) {
                    if (z) {
                        Object[] objArr = (Object[]) obj;
                        stringBuffer.append("{");
                        while (i < objArr.length) {
                            Object obj2 = objArr[i];
                            if (i > 0) {
                                stringBuffer.append(",");
                            }
                            if (obj2 == null) {
                                stringBuffer.append("<null>");
                            } else {
                                mo124875a(stringBuffer, str, obj2, true);
                            }
                            i++;
                        }
                        stringBuffer.append("}");
                    } else {
                        mo124876b(stringBuffer, str, ((Object[]) obj).length);
                    }
                } else if (z) {
                    stringBuffer.append(obj);
                } else {
                    stringBuffer.append("<");
                    stringBuffer.append(mo124877c(obj.getClass()));
                    stringBuffer.append(">");
                }
            } finally {
                m113812e(obj);
            }
        } else if (obj != null) {
            stringBuffer.append(obj.getClass().getName());
            stringBuffer.append('@');
            stringBuffer.append(Integer.toHexString(System.identityHashCode(obj)));
        } else {
            throw new NullPointerException("Cannot get the toString of a null identity");
        }
    }

    /* renamed from: b */
    public void mo124876b(StringBuffer stringBuffer, String str, int i) {
        stringBuffer.append("<size=");
        stringBuffer.append(i);
        stringBuffer.append(">");
    }

    /* renamed from: c */
    public String mo124877c(Class cls) {
        Map map = C90596b.f260303a;
        if (cls == null) {
            return "";
        }
        String name = cls.getName();
        if (name.length() == 0) {
            return "";
        }
        C91135a aVar = new C91135a();
        int i = 0;
        if (name.startsWith("[")) {
            while (name.charAt(0) == '[') {
                name = name.substring(1);
                aVar.mo125201a("[]");
            }
            if (name.charAt(0) == 'L' && name.charAt(name.length() - 1) == ';') {
                name = name.substring(1, name.length() - 1);
            }
        }
        HashMap hashMap = (HashMap) C90596b.f260306d;
        if (hashMap.containsKey(name)) {
            name = (String) hashMap.get(name);
        }
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf != -1) {
            i = lastIndexOf + 1;
        }
        int indexOf = name.indexOf(36, i);
        String substring = name.substring(lastIndexOf + 1);
        if (indexOf != -1) {
            substring = substring.replace('$', '.');
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(substring);
        stringBuffer.append(aVar);
        return stringBuffer.toString();
    }
}
