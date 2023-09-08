package uz3;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32226l;
import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import sx3.C110818d0;
import sx3.C64197v;
import z04.C112551y;
import zx3.C66986c;

/* renamed from: uz3.b */
public final class C22709b {

    /* renamed from: a */
    public static final String f65288a = C110818d0.m150921S(C64197v.m75537f('k', 'o', 't', 'l', 'i', 'n'), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);

    /* renamed from: b */
    public static final Map<String, String> f65289b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List f = C64197v.m75537f("Boolean", "Z", "Char", "C", "Byte", "B", "Short", ExifInterface.LATITUDE_SOUTH, "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int a = C66986c.m79137a(0, f.size() - 1, 2);
        if (a >= 0) {
            int i = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = f65288a;
                sb.append(str);
                sb.append(XVFSFile.SEPARATOR_CHAR);
                sb.append((String) f.get(i));
                int i2 = i + 1;
                linkedHashMap.put(sb.toString(), f.get(i2));
                linkedHashMap.put(str + XVFSFile.SEPARATOR_CHAR + ((String) f.get(i)) + "Array", '[' + ((String) f.get(i2)));
                if (i == a) {
                    break;
                }
                i += 2;
            }
        }
        linkedHashMap.put(f65288a + "/Unit", ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        m26583a(linkedHashMap, "Any", "java/lang/Object");
        m26583a(linkedHashMap, "Nothing", "java/lang/Void");
        m26583a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : C64197v.m75537f("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            m26583a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : C64197v.m75537f("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            m26583a(linkedHashMap, "collections/" + str3, "java/util/" + str3);
            m26583a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        m26583a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        m26583a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        m26583a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        m26583a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i3 = 0; i3 < 23; i3++) {
            StringBuilder sb4 = new StringBuilder();
            String str4 = f65288a;
            sb4.append(str4);
            sb4.append("/jvm/functions/Function");
            sb4.append(i3);
            m26583a(linkedHashMap, "Function" + i3, sb4.toString());
            m26583a(linkedHashMap, "reflect/KFunction" + i3, str4 + "/reflect/KFunction");
        }
        for (String str5 : C64197v.m75537f("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            m26583a(linkedHashMap, str5 + ".Companion", f65288a + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f65289b = linkedHashMap;
    }

    /* renamed from: a */
    public static final void m26583a(Map<String, String> map, String str, String str2) {
        map.put(f65288a + XVFSFile.SEPARATOR_CHAR + str, 'L' + str2 + ';');
    }

    /* renamed from: b */
    public static final String m26584b(String str) {
        C87412m.m108594g(str, "classId");
        String str2 = (String) ((LinkedHashMap) f65289b).get(str);
        if (str2 != null) {
            return str2;
        }
        return 'L' + C112551y.m153815o(str, '.', '$', false, 4, (Object) null) + ';';
    }
}
