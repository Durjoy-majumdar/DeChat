package ck0;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.LinkedList;

/* renamed from: ck0.b */
public final class C92422b {

    /* renamed from: a */
    public static final String[] f264467a;

    static {
        LinkedList linkedList = new LinkedList();
        for (Field field : ExifInterface.class.getDeclaredFields()) {
            try {
                if (Modifier.isFinal(field.getModifiers()) && Modifier.isStatic(field.getModifiers()) && field.getName().startsWith("TAG_")) {
                    linkedList.add((String) field.get((Object) null));
                }
            } catch (Exception unused) {
            }
        }
        f264467a = (String[]) linkedList.toArray(new String[linkedList.size()]);
    }

    /* renamed from: a */
    public static void m116247a(ExifInterface exifInterface, ExifInterface exifInterface2) {
        if (exifInterface != null && exifInterface2 != null) {
            for (String str : f264467a) {
                String attribute = exifInterface.getAttribute(str);
                if (attribute != null) {
                    exifInterface2.setAttribute(str, attribute);
                }
            }
            exifInterface2.saveAttributes();
        }
    }
}
