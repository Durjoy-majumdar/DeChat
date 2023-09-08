package p1050v2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: v2.h */
public class C111331h {
    /* renamed from: a */
    public static boolean m151814a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !m151820g(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    /* renamed from: b */
    public static C111318d m151815b(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        C111318d dVar;
        if (m151820g(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return new C111318d((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                dVar = C111318d.m151802a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception unused) {
                dVar = null;
            }
            if (dVar != null) {
                return dVar;
            }
        }
        return new C111318d((Shader) null, (ColorStateList) null, i2);
    }

    /* renamed from: c */
    public static float m151816c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !m151820g(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: d */
    public static int m151817d(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m151820g(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* renamed from: e */
    public static int m151818e(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m151820g(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }

    /* renamed from: f */
    public static String m151819f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m151820g(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    /* renamed from: g */
    public static boolean m151820g(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: h */
    public static TypedArray m151821h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
