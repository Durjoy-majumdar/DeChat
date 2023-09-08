package sm2;

import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C64196u0;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: sm2.a */
public abstract class C101650a implements C64054c {

    /* renamed from: b */
    public static final C101652b f297560b = new C101652b((C8480h) null);

    /* renamed from: c */
    public static final char[] f297561c = {'<', '>', '\"', '\'', '&', 13, 10, ' ', 9};

    /* renamed from: d */
    public static final String[] f297562d = {"&lt;", "&gt;", "&quot;", "&apos;", "&amp;", "&#x0D;", "&#x0A;", "&#x20;", "&#x09;"};

    /* renamed from: e */
    public static final C13601g<C101655e<String, Object>> f297563e = C36568h.m40985a(C101651a.f297565d);

    /* renamed from: a */
    public Class<?> f297564a;

    /* renamed from: sm2.a$a */
    public static final class C101651a extends C87413o implements C32224a<C101655e<String, Object>> {

        /* renamed from: d */
        public static final C101651a f297565d = new C101651a();

        public C101651a() {
            super(0);
        }

        public Object invoke() {
            return new C101655e(32);
        }
    }

    /* renamed from: sm2.a$b */
    public static final class C101652b {
        public C101652b(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo141119a(String str) {
            boolean z;
            if (str == null) {
                return "";
            }
            StringBuffer stringBuffer = new StringBuffer();
            int length = str.length();
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                char charAt = str.charAt(i);
                C101652b bVar = C101650a.f297560b;
                int i3 = 8;
                while (true) {
                    int i4 = i3 - 1;
                    if (C101650a.f297561c[i3] == charAt) {
                        stringBuffer.append(C101650a.f297562d[i3]);
                        z = false;
                        break;
                    } else if (i4 < 0) {
                        z = true;
                        break;
                    } else {
                        i3 = i4;
                    }
                }
                if (i == length - 1 && Character.isHighSurrogate(charAt)) {
                    z = false;
                }
                if (z) {
                    stringBuffer.append(charAt);
                }
                i = i2;
            }
            String stringBuffer2 = stringBuffer.toString();
            C87412m.m108593f(stringBuffer2, "out.toString()");
            return stringBuffer2;
        }

        /* renamed from: b */
        public final C101655e<String, Object> mo141120b() {
            return (C101655e) ((C36570n) C101650a.f297563e).getValue();
        }
    }

    /* renamed from: a */
    public boolean mo53884a(String str, Object obj, boolean z) {
        C87412m.m108594g(str, "fieldSerializeName");
        if (z) {
            if (obj == null || C87412m.m108589b(obj, 0) || C87412m.m108589b(obj, 0L) || C87412m.m108589b(obj, Float.valueOf(0.0f)) || C87412m.m108589b(obj, Double.valueOf(0.0d)) || C87412m.m108589b(obj, "") || C87412m.m108589b(C112550d0.m153799i0(obj.toString()).toString(), "")) {
                return true;
            }
        } else if (obj == null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public <T> boolean mo141097b(List<? extends T> list, List<? extends T> list2, Class<T> cls) {
        C87412m.m108594g(cls, "itemClass");
        if (list == null && list2 != null) {
            return false;
        }
        if (list2 == null && list != null) {
            return false;
        }
        if (list == null || list2 == null) {
            return true;
        }
        if (list.size() != list2.size()) {
            return false;
        }
        if (mo141102g(cls)) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (!C87412m.m108589b(list.get(i), list2.get(i))) {
                    return false;
                }
                i = i2;
            }
            return true;
        }
        int size2 = list.size();
        int i3 = 0;
        while (i3 < size2) {
            int i4 = i3 + 1;
            Object obj = list.get(i3);
            Object obj2 = list2.get(i3);
            if (!(obj instanceof C101650a) || !(obj2 instanceof C101650a)) {
                if (obj != null && obj2 == null) {
                    return false;
                }
                if (obj2 != null && obj == null) {
                    return false;
                }
            } else if (!((C101650a) obj).mo141100e().mo53860f((C64054c) obj, (C64054c) obj2)) {
                return false;
            }
            i3 = i4;
        }
        return true;
    }

    /* renamed from: c */
    public boolean mo141098c(C64054c cVar, C64054c cVar2) {
        if (cVar == null && cVar2 != null) {
            return false;
        }
        if (cVar2 == null && cVar != null) {
            return false;
        }
        if (cVar == null || cVar2 == null || !(cVar instanceof C101650a) || !(cVar2 instanceof C101650a)) {
            return true;
        }
        return ((C101650a) cVar).mo141100e().mo53860f(cVar, cVar2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo141099d(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "xml"
            gy3.C87412m.m108594g(r10, r0)
            sm2.d r0 = r9.mo141100e()
            java.lang.String r0 = r0.mo53862h()
            java.lang.String r1 = "xmlPrefixTag"
            gy3.C87412m.m108594g(r0, r1)
            sm2.d r7 = r9.mo141100e()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            r2 = 95
            r1.append(r2)
            r1.append(r0)
            java.lang.String r8 = r1.toString()
            java.lang.String r1 = r7.mo53857c()
            java.lang.String r2 = "tagName"
            gy3.C87412m.m108594g(r1, r2)
            boolean r2 = z04.C112551y.m153811k(r0)
            if (r2 == 0) goto L_0x003d
            goto L_0x0052
        L_0x003d:
            java.lang.String r1 = "."
            java.lang.String[] r2 = new java.lang.String[]{r1}
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r0
            java.util.List r1 = z04.C112550d0.m153785U(r1, r2, r3, r4, r5, r6)
            java.lang.Object r1 = sx3.C110818d0.m150914L(r1)
            java.lang.String r1 = (java.lang.String) r1
        L_0x0052:
            boolean r2 = r7.mo53855a()
            if (r2 == 0) goto L_0x00c8
            sm2.a$b r2 = f297560b
            sm2.e r3 = r2.mo141120b()
            monitor-enter(r3)
            java.util.LinkedHashMap<K, V> r4 = r3.f297566a     // Catch:{ all -> 0x00c5 }
            boolean r4 = r4.containsKey(r8)     // Catch:{ all -> 0x00c5 }
            monitor-exit(r3)
            if (r4 == 0) goto L_0x00c0
            sm2.e r3 = r2.mo141120b()
            r4 = 0
            if (r8 != 0) goto L_0x0073
            r3.getClass()
            goto L_0x008c
        L_0x0073:
            monitor-enter(r3)
            java.util.LinkedHashMap<K, V> r5 = r3.f297566a     // Catch:{ all -> 0x00bd }
            java.lang.Object r5 = r5.get(r8)     // Catch:{ all -> 0x00bd }
            if (r5 == 0) goto L_0x0085
            int r4 = r3.f297569d     // Catch:{ all -> 0x00bd }
            int r4 = r4 + 1
            r3.f297569d = r4     // Catch:{ all -> 0x00bd }
            monitor-exit(r3)     // Catch:{ all -> 0x00bd }
            r4 = r5
            goto L_0x008c
        L_0x0085:
            int r5 = r3.f297570e     // Catch:{ all -> 0x00bd }
            int r5 = r5 + 1
            r3.f297570e = r5     // Catch:{ all -> 0x00bd }
            monitor-exit(r3)     // Catch:{ all -> 0x00bd }
        L_0x008c:
            boolean r3 = r4 instanceof java.util.Map
            if (r3 == 0) goto L_0x0093
            java.util.Map r4 = (java.util.Map) r4
            goto L_0x00cc
        L_0x0093:
            sm2.e r2 = r2.mo141120b()
            if (r8 == 0) goto L_0x00b1
            monitor-enter(r2)
            java.util.LinkedHashMap<K, V> r3 = r2.f297566a     // Catch:{ all -> 0x00ae }
            java.lang.Object r3 = r3.remove(r8)     // Catch:{ all -> 0x00ae }
            if (r3 == 0) goto L_0x00a8
            int r3 = r2.f297567b     // Catch:{ all -> 0x00ae }
            int r3 = r3 + -1
            r2.f297567b = r3     // Catch:{ all -> 0x00ae }
        L_0x00a8:
            monitor-exit(r2)     // Catch:{ all -> 0x00ae }
            java.util.Map r4 = sm2.C101663g.m133551a(r10, r1)
            goto L_0x00cc
        L_0x00ae:
            r10 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00ae }
            throw r10
        L_0x00b1:
            r2.getClass()
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r0 = "key == null"
            r10.<init>(r0)
            throw r10
        L_0x00bd:
            r10 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00bd }
            throw r10
        L_0x00c0:
            java.util.Map r4 = sm2.C101663g.m133551a(r10, r1)
            goto L_0x00cc
        L_0x00c5:
            r10 = move-exception
            monitor-exit(r3)
            throw r10
        L_0x00c8:
            java.util.Map r4 = sm2.C101663g.m133551a(r10, r1)
        L_0x00cc:
            if (r4 != 0) goto L_0x00d0
            goto L_0x0177
        L_0x00d0:
            sm2.d r10 = r9.mo141100e()
            java.lang.String r1 = r10.mo53857c()
            r10.mo53856b(r9, r4, r1, r0)
            boolean r10 = r7.mo53855a()
            if (r10 == 0) goto L_0x0177
            sm2.a$b r10 = f297560b
            sm2.e r0 = r10.mo141120b()
            monitor-enter(r0)
            java.util.LinkedHashMap<K, V> r1 = r0.f297566a     // Catch:{ all -> 0x0174 }
            boolean r1 = r1.containsKey(r8)     // Catch:{ all -> 0x0174 }
            monitor-exit(r0)
            if (r1 != 0) goto L_0x0177
            sm2.e r10 = r10.mo141120b()
            monitor-enter(r10)
            int r0 = r10.f297567b     // Catch:{ all -> 0x0171 }
            int r0 = r0 + 1
            r10.f297567b = r0     // Catch:{ all -> 0x0171 }
            java.util.LinkedHashMap<K, V> r0 = r10.f297566a     // Catch:{ all -> 0x0171 }
            java.lang.Object r0 = r0.put(r8, r4)     // Catch:{ all -> 0x0171 }
            if (r0 == 0) goto L_0x010a
            int r0 = r10.f297567b     // Catch:{ all -> 0x0171 }
            int r0 = r0 + -1
            r10.f297567b = r0     // Catch:{ all -> 0x0171 }
        L_0x010a:
            monitor-exit(r10)     // Catch:{ all -> 0x0171 }
            int r0 = r10.f297568c
        L_0x010d:
            monitor-enter(r10)
            int r1 = r10.f297567b     // Catch:{ all -> 0x016e }
            if (r1 < 0) goto L_0x0151
            java.util.LinkedHashMap<K, V> r1 = r10.f297566a     // Catch:{ all -> 0x016e }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x016e }
            if (r1 == 0) goto L_0x011e
            int r1 = r10.f297567b     // Catch:{ all -> 0x016e }
            if (r1 != 0) goto L_0x0151
        L_0x011e:
            int r1 = r10.f297567b     // Catch:{ all -> 0x016e }
            if (r1 <= r0) goto L_0x014f
            java.util.LinkedHashMap<K, V> r1 = r10.f297566a     // Catch:{ all -> 0x016e }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x016e }
            if (r1 == 0) goto L_0x012b
            goto L_0x014f
        L_0x012b:
            java.util.LinkedHashMap<K, V> r1 = r10.f297566a     // Catch:{ all -> 0x016e }
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x016e }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x016e }
            java.lang.Object r1 = r1.next()     // Catch:{ all -> 0x016e }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x016e }
            java.lang.Object r2 = r1.getKey()     // Catch:{ all -> 0x016e }
            r1.getValue()     // Catch:{ all -> 0x016e }
            java.util.LinkedHashMap<K, V> r1 = r10.f297566a     // Catch:{ all -> 0x016e }
            r1.remove(r2)     // Catch:{ all -> 0x016e }
            int r1 = r10.f297567b     // Catch:{ all -> 0x016e }
            int r1 = r1 + -1
            r10.f297567b = r1     // Catch:{ all -> 0x016e }
            monitor-exit(r10)     // Catch:{ all -> 0x016e }
            goto L_0x010d
        L_0x014f:
            monitor-exit(r10)     // Catch:{ all -> 0x016e }
            goto L_0x0177
        L_0x0151:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x016e }
            java.lang.Class<sm2.e> r1 = sm2.C101655e.class
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x016e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x016e }
            r2.<init>()     // Catch:{ all -> 0x016e }
            r2.append(r1)     // Catch:{ all -> 0x016e }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r2.append(r1)     // Catch:{ all -> 0x016e }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x016e }
            r0.<init>(r1)     // Catch:{ all -> 0x016e }
            throw r0     // Catch:{ all -> 0x016e }
        L_0x016e:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x016e }
            throw r0
        L_0x0171:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0171 }
            throw r0
        L_0x0174:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        L_0x0177:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sm2.C101650a.mo141099d(java.lang.String):void");
    }

    /* renamed from: e */
    public final C101654d mo141100e() {
        Class<?> cls = this.f297564a;
        if (cls != null) {
            Object newInstance = cls.getConstructors()[0].newInstance(new Object[0]);
            if (newInstance != null) {
                return (C101654d) newInstance;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.tencent.mm.plugin.serialize.ISerializeClassSerializeImpl");
        }
        C87412m.m108603p("serializeClassImplClazz");
        throw null;
    }

    /* renamed from: f */
    public String mo141101f(String str, String str2) {
        C87412m.m108594g(str, "tagName");
        C87412m.m108594g(str2, "xmlPrefixTag");
        if (C112551y.m153811k(str2)) {
            return str;
        }
        return str2 + '.' + str;
    }

    /* renamed from: g */
    public final boolean mo141102g(Class<?> cls) {
        C87412m.m108594g(cls, "clazz");
        if (C87412m.m108589b(cls, Integer.TYPE) ? true : C87412m.m108589b(cls, Short.TYPE) ? true : C87412m.m108589b(cls, Long.TYPE) ? true : C87412m.m108589b(cls, Double.TYPE) ? true : C87412m.m108589b(cls, Float.TYPE) ? true : C87412m.m108589b(cls, Boolean.TYPE)) {
            return true;
        }
        return C87412m.m108589b(cls, String.class);
    }

    /* renamed from: h */
    public boolean mo141103h(Object obj) {
        return (obj instanceof String) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Boolean) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof Short) || (obj instanceof Character);
    }

    /* renamed from: i */
    public boolean mo137669i(String str, String str2, boolean z) {
        C87412m.m108594g(str, "tagName");
        C87412m.m108594g(str2, "itemTagName");
        return false;
    }

    /* renamed from: j */
    public C101650a mo141104j(String str) {
        C87412m.m108594g(str, "xml");
        String h = mo141100e().mo53862h();
        C87412m.m108594g(h, "xmlPrefixTag");
        C101654d e = mo141100e();
        return e.mo53858d(this, str, e.mo53857c(), h);
    }

    /* renamed from: k */
    public String mo54985k(Object obj, String str, String str2, boolean z) {
        C87412m.m108594g(obj, "value");
        C87412m.m108594g(str, "tagName");
        C87412m.m108594g(str2, "itemTagName");
        if (!mo137663l(obj, str, str2, z)) {
            return obj instanceof String ? f297560b.mo141119a((String) obj) : obj.toString();
        }
        if (obj instanceof Number) {
            return obj.toString();
        }
        if (!(obj instanceof String) || !C112550d0.m153801u((CharSequence) obj, "<![CDATA[", false)) {
            return "<![CDATA[" + obj + "]]>";
        }
        String n = C112551y.m153814n((String) obj, "]]>", "]]]]><![CDATA[>", false);
        return "<![CDATA[" + n + "]]>";
    }

    /* renamed from: l */
    public boolean mo137663l(Object obj, String str, String str2, boolean z) {
        C87412m.m108594g(obj, "value");
        C87412m.m108594g(str, "tagName");
        C87412m.m108594g(str2, "itemTagName");
        return false;
    }

    /* renamed from: m */
    public void mo141105m(C101650a aVar, Map<String, String> map, String str, String str2) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(map, "xmlValueMap");
        C87412m.m108594g(str, "tagName");
        C87412m.m108594g(str2, "xmlPrefixTag");
        aVar.mo141100e().mo53856b(aVar, map, str, str2);
    }

    /* renamed from: n */
    public void mo141106n(JSONObject jSONObject, String str, Object obj, boolean z) {
        C87412m.m108594g(jSONObject, "obj");
        C87412m.m108594g(str, "key");
        if (!mo53884a(str, obj, z) && obj != null) {
            if (obj instanceof List) {
                JSONArray jSONArray = new JSONArray();
                for (Object next : (List) obj) {
                    if (!mo53884a("", next, z) && next != null) {
                        if (mo141103h(next)) {
                            jSONArray.put(next);
                        } else if (next instanceof C101650a) {
                            jSONArray.put(((C101650a) next).mo141100e().mo53859e((C64054c) next, z));
                        }
                    }
                }
                jSONObject.put(str, jSONArray);
            } else if (mo141103h(obj)) {
                jSONObject.put(str, obj);
            } else if (obj instanceof C101650a) {
                jSONObject.put(str, ((C101650a) obj).mo141100e().mo53859e((C64054c) obj, z));
            } else {
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: o */
    public <T> void mo141107o(List<T> list, Class<T> cls, Map<String, String> map, String str, String str2) {
        StringBuilder sb;
        C87412m.m108594g(list, "list");
        C87412m.m108594g(cls, "itemClazz");
        C87412m.m108594g(map, "xmlValueMap");
        C87412m.m108594g(str, "xmlPrefixTag");
        C87412m.m108594g(str2, "itemTagName");
        int i = 0;
        while (true) {
            if (mo141102g(cls)) {
                String str3 = C112551y.m153811k(str2) ? "item" : str2;
                if (i == 0) {
                    sb.append('.');
                    sb.append(str);
                    sb.append('.');
                    sb.append(str3);
                } else {
                    sb = new StringBuilder();
                    sb.append('.');
                    sb.append(str);
                    sb.append('.');
                    sb.append(str3);
                    sb.append(i);
                }
                String sb4 = sb.toString();
                if (map.containsKey(sb4)) {
                    String str4 = map.get(sb4);
                    if (str4 != null) {
                        if (C87412m.m108589b(cls, Integer.TYPE)) {
                            list.add(mo141115w(str4, 0));
                        } else if (C87412m.m108589b(cls, Short.TYPE)) {
                            short s = (short) 0;
                            if (!(C112551y.m153811k(str4))) {
                                try {
                                    s = Short.valueOf(Short.parseShort(str4));
                                } catch (NumberFormatException unused) {
                                }
                            }
                            list.add(s);
                        } else if (C87412m.m108589b(cls, Long.TYPE)) {
                            list.add(mo141116x(str4, 0L));
                        } else if (C87412m.m108589b(cls, Double.TYPE)) {
                            list.add(mo141113u(str4, Double.valueOf(0.0d)));
                        } else if (C87412m.m108589b(cls, Float.TYPE)) {
                            list.add(mo141114v(str4, Float.valueOf(0.0f)));
                        } else if (C87412m.m108589b(cls, Boolean.TYPE)) {
                            list.add(mo141112t(str4, Boolean.FALSE));
                        } else if (C87412m.m108589b(cls, String.class)) {
                            list.add(mo141117y(str4, ""));
                        }
                    }
                } else {
                    return;
                }
            } else {
                Object newInstance = cls.getConstructors()[0].newInstance(new Object[0]);
                if (newInstance != null) {
                    C101650a aVar = (C101650a) newInstance;
                    C101654d e = aVar.mo141100e();
                    String c = C112551y.m153811k(str2) ? e.mo53857c() : str2;
                    if (i != 0) {
                        c = C87412m.m108600m(c, Integer.valueOf(i));
                    }
                    if (map.containsKey('.' + str + '.' + c)) {
                        e.mo53856b(aVar, map, c, str);
                        list.add(aVar);
                    } else {
                        return;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.tencent.mm.plugin.serialize.BaseSerializeClass");
                }
            }
            i++;
        }
    }

    /* renamed from: p */
    public void mo141108p(StringBuilder sb, String str, Object obj, boolean z) {
        C87412m.m108594g(sb, "xmlBuilder");
        C87412m.m108594g(str, "key");
        if (!mo53884a(str, obj, z) && mo141103h(obj)) {
            if (obj instanceof String) {
                sb.append(' ' + str + "=\"" + f297560b.mo141119a((String) obj) + '\"');
                return;
            }
            sb.append(' ' + str + "=\"" + obj + '\"');
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0167, code lost:
        if (gy3.C87412m.m108589b(r10, '<' + r9 + "></" + r9 + '>') != false) goto L_0x016b;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo141109q(java.lang.StringBuilder r8, java.lang.String r9, java.lang.String r10, java.lang.Object r11, boolean r12) {
        /*
            r7 = this;
            java.lang.String r0 = "xmlBuilder"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "tagName"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "itemTagName"
            gy3.C87412m.m108594g(r10, r0)
            boolean r0 = r7.mo53884a(r9, r11, r12)
            if (r0 != 0) goto L_0x0170
            if (r11 != 0) goto L_0x001c
            goto L_0x0170
        L_0x001c:
            boolean r0 = r7.mo141103h(r11)
            java.lang.String r1 = "</"
            r2 = 60
            r3 = 62
            if (r0 == 0) goto L_0x004f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r9)
            r0.append(r3)
            java.lang.String r10 = r7.mo54985k(r11, r9, r10, r12)
            r0.append(r10)
            r0.append(r1)
            r0.append(r9)
            r0.append(r3)
            java.lang.String r9 = r0.toString()
            r8.append(r9)
            goto L_0x0170
        L_0x004f:
            boolean r0 = r11 instanceof java.util.List
            java.lang.String r4 = ""
            r5 = 1
            if (r0 == 0) goto L_0x0130
            java.util.List r11 = (java.util.List) r11
            boolean r0 = r11.isEmpty()
            r0 = r0 ^ r5
            if (r0 == 0) goto L_0x0170
            boolean r0 = r7.mo137669i(r9, r10, r12)
            if (r0 == 0) goto L_0x0089
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r9)
            java.lang.String r5 = " count=\""
            r0.append(r5)
            int r5 = r11.size()
            r0.append(r5)
            java.lang.String r5 = "\">"
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r8.append(r0)
            goto L_0x009e
        L_0x0089:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r9)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r8.append(r0)
        L_0x009e:
            java.util.Iterator r11 = r11.iterator()
        L_0x00a2:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x011a
            java.lang.Object r0 = r11.next()
            boolean r5 = r7.mo53884a(r9, r0, r12)
            if (r5 == 0) goto L_0x00b3
            goto L_0x00a2
        L_0x00b3:
            if (r0 != 0) goto L_0x00b6
            goto L_0x00a2
        L_0x00b6:
            boolean r5 = r0 instanceof sm2.C101650a
            if (r5 == 0) goto L_0x00d7
            r5 = r0
            sm2.a r5 = (sm2.C101650a) r5
            sm2.d r5 = r5.mo141100e()
            boolean r6 = z04.C112551y.m153811k(r10)
            if (r6 == 0) goto L_0x00cc
            java.lang.String r6 = r5.mo53857c()
            goto L_0x00cd
        L_0x00cc:
            r6 = r10
        L_0x00cd:
            sm2.c r0 = (sm2.C64054c) r0
            java.lang.String r0 = r5.mo53863i(r0, r12, r6, r4)
            r8.append(r0)
            goto L_0x00a2
        L_0x00d7:
            boolean r5 = r7.mo141103h(r0)
            if (r5 == 0) goto L_0x00a2
            boolean r5 = z04.C112551y.m153811k(r10)
            if (r5 == 0) goto L_0x00e7
            java.lang.String r5 = "item"
            goto L_0x00e8
        L_0x00e7:
            r5 = r10
        L_0x00e8:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            r6.append(r5)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            r8.append(r6)
            java.lang.String r0 = r7.mo54985k(r0, r9, r10, r12)
            r8.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r5)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r8.append(r0)
            goto L_0x00a2
        L_0x011a:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            r10.append(r9)
            r10.append(r3)
            java.lang.String r9 = r10.toString()
            r8.append(r9)
            goto L_0x0170
        L_0x0130:
            boolean r10 = r11 instanceof sm2.C101650a
            if (r10 == 0) goto L_0x0170
            r10 = r11
            sm2.a r10 = (sm2.C101650a) r10
            sm2.d r10 = r10.mo141100e()
            sm2.c r11 = (sm2.C64054c) r11
            java.lang.String r10 = r10.mo53863i(r11, r12, r9, r4)
            java.lang.String r11 = "valueXml"
            gy3.C87412m.m108594g(r10, r11)
            if (r12 == 0) goto L_0x016a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            r11.append(r9)
            java.lang.String r12 = "></"
            r11.append(r12)
            r11.append(r9)
            r11.append(r3)
            java.lang.String r9 = r11.toString()
            boolean r9 = gy3.C87412m.m108589b(r10, r9)
            if (r9 == 0) goto L_0x016a
            goto L_0x016b
        L_0x016a:
            r5 = 0
        L_0x016b:
            if (r5 != 0) goto L_0x0170
            r8.append(r10)
        L_0x0170:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sm2.C101650a.mo141109q(java.lang.StringBuilder, java.lang.String, java.lang.String, java.lang.Object, boolean):void");
    }

    /* renamed from: r */
    public void mo141110r(StringBuilder sb, String str) {
        StringBuilder sb4 = sb;
        C87412m.m108594g(sb4, "xmlBuilder");
        C87412m.m108594g(str, "xmlPrefixTag");
        if (!C112551y.m153811k(str)) {
            List U = C112550d0.m153785U(str, new String[]{"."}, false, 0, 6, (Object) null);
            String S = C110818d0.m150921S(U, "><", "<", ">", 0, (CharSequence) null, (C32226l) null, 56, (Object) null);
            String S2 = C110818d0.m150921S(new C64196u0(U), "></", "</", ">", 0, (CharSequence) null, (C32226l) null, 56, (Object) null);
            sb4.insert(0, S);
            sb4.append(S2);
        }
    }

    /* renamed from: s */
    public JSONObject mo141111s() {
        return mo141100e().mo53859e(this, mo141100e().mo53861g());
    }

    /* renamed from: t */
    public Boolean mo141112t(String str, Boolean bool) {
        if (str == null || C112551y.m153811k(str)) {
            return bool;
        }
        try {
            return Boolean.valueOf(Boolean.parseBoolean(str));
        } catch (NumberFormatException unused) {
            return bool;
        }
    }

    /* renamed from: u */
    public Double mo141113u(String str, Double d) {
        if (str == null || C112551y.m153811k(str)) {
            return d;
        }
        try {
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException unused) {
            return d;
        }
    }

    /* renamed from: v */
    public Float mo141114v(String str, Float f) {
        if (str == null || C112551y.m153811k(str)) {
            return f;
        }
        try {
            return Float.valueOf(Float.parseFloat(str));
        } catch (NumberFormatException unused) {
            return f;
        }
    }

    /* renamed from: w */
    public Integer mo141115w(String str, Integer num) {
        if (str == null || C112551y.m153811k(str)) {
            return num;
        }
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return num;
        }
    }

    /* renamed from: x */
    public Long mo141116x(String str, Long l) {
        if (str == null || C112551y.m153811k(str)) {
            return l;
        }
        try {
            return Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            return l;
        }
    }

    /* renamed from: y */
    public String mo141117y(String str, String str2) {
        return str == null || C112551y.m153811k(str) ? str2 : str;
    }

    /* renamed from: z */
    public String mo141118z() {
        boolean g = mo141100e().mo53861g();
        String h = mo141100e().mo53862h();
        C87412m.m108594g(h, "xmlPrefixTag");
        C101654d e = mo141100e();
        return e.mo53863i(this, g, e.mo53857c(), h);
    }
}
