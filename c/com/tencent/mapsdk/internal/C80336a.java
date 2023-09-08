package com.tencent.mapsdk.internal;

import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.tencent.mapsdk.internal.a */
public final class C80336a {

    /* renamed from: a */
    private static ClassLoader f235157a = null;

    /* renamed from: b */
    private static boolean f235158b = true;

    /* renamed from: a */
    private static void m97808a(boolean z, ClassLoader classLoader) {
        f235158b = z;
        f235157a = classLoader;
    }

    /* renamed from: b */
    private static Object m97809b(String str, boolean z, ClassLoader classLoader) {
        Class<?> cls;
        if (str.equals("java.lang.Integer")) {
            return 0;
        }
        if (str.equals("java.lang.Boolean")) {
            return Boolean.FALSE;
        }
        if (str.equals("java.lang.Byte")) {
            return (byte) 0;
        }
        if (str.equals("java.lang.Double")) {
            return Double.valueOf(0.0d);
        }
        if (str.equals("java.lang.Float")) {
            return Float.valueOf(0.0f);
        }
        if (str.equals("java.lang.Long")) {
            return 0L;
        }
        if (str.equals("java.lang.Short")) {
            return (short) 0;
        }
        if (str.equals("java.lang.Character")) {
            throw new IllegalArgumentException("can not support java.lang.Character");
        } else if (str.equals("java.lang.String")) {
            return "";
        } else {
            if (str.equals("java.util.List")) {
                return new ArrayList();
            }
            if (str.equals("java.util.Map")) {
                return new HashMap();
            }
            if (str.equals("Array")) {
                return "Array";
            }
            if (str.equals("?")) {
                return str;
            }
            if (classLoader != null) {
                try {
                    cls = Class.forName(str, z, classLoader);
                } catch (Exception e) {
                    throw new C80337b(e);
                }
            } else {
                ClassLoader classLoader2 = f235157a;
                if (classLoader2 != null) {
                    cls = Class.forName(str, f235158b, classLoader2);
                } else {
                    cls = Class.forName(str);
                }
            }
            return cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        }
    }

    /* renamed from: c */
    private static String m97811c(String str) {
        return str.equals("int32") ? "java.lang.Integer" : str.equals("bool") ? "java.lang.Boolean" : str.equals("char") ? "java.lang.Byte" : str.equals("double") ? "java.lang.Double" : str.equals("float") ? "java.lang.Float" : str.equals("int64") ? "java.lang.Long" : str.equals("short") ? "java.lang.Short" : str.equals("string") ? "java.lang.String" : str.equals("list") ? "java.util.List" : str.equals("map") ? "java.util.Map" : str;
    }

    /* renamed from: d */
    private static boolean m97812d(String str) {
        return str.equals("int") || str.equals(DownloadSetting.TYPE_BOOLEAN) || str.equals("byte") || str.equals("double") || str.equals("float") || str.equals("long") || str.equals("short") || str.equals("char") || str.equals(DownloadSetting.TYPE_INTEGER) || str.equals("Boolean") || str.equals("Byte") || str.equals("Double") || str.equals("Float") || str.equals("Long") || str.equals("Short") || str.equals("Char");
    }

    /* renamed from: e */
    private static String m97813e(String str) {
        return str.equals("int") ? DownloadSetting.TYPE_INTEGER : str.equals(DownloadSetting.TYPE_BOOLEAN) ? "Boolean" : str.equals("byte") ? "Byte" : str.equals("double") ? "Double" : str.equals("float") ? "Float" : str.equals("long") ? "Long" : str.equals("short") ? "Short" : str.equals("char") ? "Character" : str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0004 A[LOOP:0: B:1:0x0004->B:4:0x0010, LOOP_START, PHI: r0 
      PHI: (r0v1 int) = (r0v0 int), (r0v23 int) binds: [B:0:0x0000, B:4:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m97807a(java.util.ArrayList<java.lang.String> r3, java.lang.String r4) {
        /*
            int r0 = r4.length()
        L_0x0004:
            int r1 = r0 + -1
            char r1 = r4.charAt(r1)
            r2 = 62
            if (r1 != r2) goto L_0x0012
            int r0 = r0 + -1
            if (r0 != 0) goto L_0x0004
        L_0x0012:
            r1 = 0
            java.lang.String r4 = r4.substring(r1, r0)
            java.lang.String r0 = "int32"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0022
            java.lang.String r4 = "java.lang.Integer"
            goto L_0x0086
        L_0x0022:
            java.lang.String r0 = "bool"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x002d
            java.lang.String r4 = "java.lang.Boolean"
            goto L_0x0086
        L_0x002d:
            java.lang.String r0 = "char"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0038
            java.lang.String r4 = "java.lang.Byte"
            goto L_0x0086
        L_0x0038:
            java.lang.String r0 = "double"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0043
            java.lang.String r4 = "java.lang.Double"
            goto L_0x0086
        L_0x0043:
            java.lang.String r0 = "float"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x004e
            java.lang.String r4 = "java.lang.Float"
            goto L_0x0086
        L_0x004e:
            java.lang.String r0 = "int64"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0059
            java.lang.String r4 = "java.lang.Long"
            goto L_0x0086
        L_0x0059:
            java.lang.String r0 = "short"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0065
            java.lang.String r4 = "java.lang.Short"
            goto L_0x0086
        L_0x0065:
            java.lang.String r0 = "string"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0071
            java.lang.String r4 = "java.lang.String"
            goto L_0x0086
        L_0x0071:
            java.lang.String r0 = "list"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x007c
            java.lang.String r4 = "java.util.List"
            goto L_0x0086
        L_0x007c:
            java.lang.String r0 = "map"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0086
            java.lang.String r4 = "java.util.Map"
        L_0x0086:
            r3.add(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C80336a.m97807a(java.util.ArrayList, java.lang.String):void");
    }

    /* renamed from: a */
    private static ArrayList<String> m97806a(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        int indexOf = str.indexOf("<");
        int i = 0;
        while (i < indexOf) {
            m97807a(arrayList, str.substring(i, indexOf));
            i = indexOf + 1;
            indexOf = str.indexOf("<", i);
            int indexOf2 = str.indexOf(",", i);
            if (indexOf == -1) {
                indexOf = indexOf2;
            }
            if (indexOf2 != -1 && indexOf2 < indexOf) {
                indexOf = indexOf2;
            }
        }
        m97807a(arrayList, str.substring(i, str.length()));
        return arrayList;
    }

    /* renamed from: a */
    public static String m97805a(ArrayList<String> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (true) {
            String str = "map";
            if (i < arrayList.size()) {
                String str2 = arrayList.get(i);
                if (str2.equals("java.lang.Integer") || str2.equals("int")) {
                    str = "int32";
                } else if (str2.equals("java.lang.Boolean") || str2.equals(DownloadSetting.TYPE_BOOLEAN)) {
                    str = "bool";
                } else if (str2.equals("java.lang.Byte") || str2.equals("byte")) {
                    str = "char";
                } else if (str2.equals("java.lang.Double") || str2.equals("double")) {
                    str = "double";
                } else if (str2.equals("java.lang.Float") || str2.equals("float")) {
                    str = "float";
                } else if (str2.equals("java.lang.Long") || str2.equals("long")) {
                    str = "int64";
                } else if (str2.equals("java.lang.Short") || str2.equals("short")) {
                    str = "short";
                } else if (str2.equals("java.lang.Character")) {
                    throw new IllegalArgumentException("can not support java.lang.Character");
                } else if (str2.equals("java.lang.String")) {
                    str = "string";
                } else if (str2.equals("java.util.List")) {
                    str = "list";
                } else if (!str2.equals("java.util.Map")) {
                    str = str2;
                }
                arrayList.set(i, str);
                i++;
            } else {
                Collections.reverse(arrayList);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    String str3 = arrayList.get(i2);
                    if (str3.equals("list")) {
                        int i3 = i2 - 1;
                        arrayList.set(i3, "<" + arrayList.get(i3));
                        arrayList.set(0, arrayList.get(0) + ">");
                    } else if (str3.equals(str)) {
                        int i4 = i2 - 1;
                        arrayList.set(i4, "<" + arrayList.get(i4) + ",");
                        arrayList.set(0, arrayList.get(0) + ">");
                    } else if (str3.equals("Array")) {
                        int i5 = i2 - 1;
                        arrayList.set(i5, "<" + arrayList.get(i5));
                        arrayList.set(0, arrayList.get(0) + ">");
                    }
                }
                Collections.reverse(arrayList);
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    stringBuffer.append(it.next());
                }
                return stringBuffer.toString();
            }
        }
    }

    /* renamed from: b */
    private static String m97810b(String str) {
        if (str.equals("java.lang.Integer") || str.equals("int")) {
            return "int32";
        }
        if (str.equals("java.lang.Boolean") || str.equals(DownloadSetting.TYPE_BOOLEAN)) {
            return "bool";
        }
        if (str.equals("java.lang.Byte") || str.equals("byte")) {
            return "char";
        }
        String str2 = "double";
        if (!str.equals("java.lang.Double") && !str.equals(str2)) {
            str2 = "float";
            if (!str.equals("java.lang.Float") && !str.equals(str2)) {
                if (str.equals("java.lang.Long") || str.equals("long")) {
                    return "int64";
                }
                if (str.equals("java.lang.Short") || str.equals("short")) {
                    return "short";
                }
                if (str.equals("java.lang.Character")) {
                    throw new IllegalArgumentException("can not support java.lang.Character");
                } else if (str.equals("java.lang.String")) {
                    return "string";
                } else {
                    if (str.equals("java.util.List")) {
                        return "list";
                    }
                    return str.equals("java.util.Map") ? "map" : str;
                }
            }
        }
        return str2;
    }

    /* renamed from: a */
    private static String m97804a(String str, String str2) {
        if (str2.equals("int")) {
            return str2 + " " + str + "=0 ;\n";
        } else if (str2.equals(DownloadSetting.TYPE_BOOLEAN)) {
            return str2 + " " + str + "=false ;\n";
        } else if (str2.equals("byte")) {
            return str2 + " " + str + " ;\n";
        } else if (str2.equals("double")) {
            return str2 + " " + str + "=0 ;\n";
        } else if (str2.equals("float")) {
            return str2 + " " + str + "=0 ;\n";
        } else if (str2.equals("long")) {
            return str2 + " " + str + "=0 ;\n";
        } else if (str2.equals("short")) {
            return str2 + " " + str + "=0 ;\n";
        } else if (str2.equals("char")) {
            return str2 + " " + str + " ;\n";
        } else {
            return str2 + " " + str + " = null ;\n";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006f, code lost:
        if (r3 == null) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a9, code lost:
        if (r3 == null) goto L_0x00ab;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m97803a(java.lang.String r8, boolean r9, java.lang.ClassLoader r10) {
        /*
            java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "<"
            int r3 = r8.indexOf(r2)
            r4 = 0
            r5 = 0
        L_0x000f:
            if (r5 >= r3) goto L_0x002e
            java.lang.String r5 = r8.substring(r5, r3)
            m97807a((java.util.ArrayList<java.lang.String>) r1, (java.lang.String) r5)
            int r5 = r3 + 1
            int r3 = r8.indexOf(r2, r5)
            java.lang.String r6 = ","
            int r6 = r8.indexOf(r6, r5)
            r7 = -1
            if (r3 != r7) goto L_0x0028
            r3 = r6
        L_0x0028:
            if (r6 == r7) goto L_0x000f
            if (r6 >= r3) goto L_0x000f
            r3 = r6
            goto L_0x000f
        L_0x002e:
            int r2 = r8.length()
            java.lang.String r8 = r8.substring(r5, r2)
            m97807a((java.util.ArrayList<java.lang.String>) r1, (java.lang.String) r8)
            java.util.Iterator r8 = r1.iterator()
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x0040:
            r5 = r3
        L_0x0041:
            boolean r6 = r8.hasNext()
            if (r6 == 0) goto L_0x00ad
            java.lang.Object r2 = r8.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = m97809b(r2, r9, r10)
            boolean r6 = r2 instanceof java.lang.String
            if (r6 == 0) goto L_0x0074
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = "Array"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x0067
            if (r3 != 0) goto L_0x0041
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r0, r4)
            goto L_0x0041
        L_0x0067:
            java.lang.String r7 = "?"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L_0x0041
            if (r3 != 0) goto L_0x0072
            goto L_0x00ab
        L_0x0072:
            r5 = r3
            goto L_0x00ab
        L_0x0074:
            boolean r6 = r2 instanceof java.util.List
            r7 = 1
            if (r6 == 0) goto L_0x0091
            if (r3 == 0) goto L_0x0087
            boolean r6 = r3 instanceof java.lang.Byte
            if (r6 == 0) goto L_0x0087
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r0, r7)
            java.lang.reflect.Array.set(r2, r4, r3)
            goto L_0x0041
        L_0x0087:
            if (r3 == 0) goto L_0x008f
            r6 = r2
            java.util.List r6 = (java.util.List) r6
            r6.add(r3)
        L_0x008f:
            r3 = r1
            goto L_0x0041
        L_0x0091:
            boolean r6 = r2 instanceof java.util.Map
            if (r6 == 0) goto L_0x00a9
            if (r3 == 0) goto L_0x0099
            r6 = 1
            goto L_0x009a
        L_0x0099:
            r6 = 0
        L_0x009a:
            if (r5 == 0) goto L_0x009d
            goto L_0x009e
        L_0x009d:
            r7 = 0
        L_0x009e:
            r6 = r6 & r7
            if (r6 == 0) goto L_0x00a7
            r6 = r2
            java.util.Map r6 = (java.util.Map) r6
            r6.put(r3, r5)
        L_0x00a7:
            r3 = r1
            goto L_0x0040
        L_0x00a9:
            if (r3 != 0) goto L_0x0072
        L_0x00ab:
            r3 = r2
            goto L_0x0041
        L_0x00ad:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C80336a.m97803a(java.lang.String, boolean, java.lang.ClassLoader):java.lang.Object");
    }
}
