package p1050v2;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p1091b3.C104030e;
import p1146r2.C110495a;

/* renamed from: v2.e */
public class C111319e {

    /* renamed from: v2.e$a */
    public interface C111320a {
    }

    /* renamed from: v2.e$b */
    public static final class C111321b implements C111320a {

        /* renamed from: a */
        public final C111323c[] f333288a;

        public C111321b(C111323c[] cVarArr) {
            this.f333288a = cVarArr;
        }
    }

    /* renamed from: v2.e$d */
    public static final class C111322d implements C111320a {

        /* renamed from: a */
        public final C104030e f333289a;

        /* renamed from: b */
        public final int f333290b;

        /* renamed from: c */
        public final int f333291c;

        /* renamed from: d */
        public final String f333292d;

        public C111322d(C104030e eVar, int i, int i2, String str) {
            this.f333289a = eVar;
            this.f333291c = i;
            this.f333290b = i2;
            this.f333292d = str;
        }
    }

    /* renamed from: v2.e$c */
    public static final class C111323c {

        /* renamed from: a */
        public final String f333293a;

        /* renamed from: b */
        public int f333294b;

        /* renamed from: c */
        public boolean f333295c;

        /* renamed from: d */
        public String f333296d;

        /* renamed from: e */
        public int f333297e;

        /* renamed from: f */
        public int f333298f;

        public C111323c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f333293a = str;
            this.f333294b = i;
            this.f333295c = z;
            this.f333296d = str2;
            this.f333297e = i2;
            this.f333298f = i3;
        }
    }

    /* renamed from: a */
    public static C111320a m151804a(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        Resources resources2 = resources;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlPullParser.require(2, (String) null, "font-family");
            if (xmlPullParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources2.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C110495a.f330398b);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(4);
                String string3 = obtainAttributes.getString(5);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(2, 1);
                int integer2 = obtainAttributes.getInteger(3, 500);
                String string4 = obtainAttributes.getString(6);
                obtainAttributes.recycle();
                if (string == null || string2 == null || string3 == null) {
                    ArrayList arrayList = new ArrayList();
                    while (xmlPullParser.next() != 3) {
                        if (xmlPullParser.getEventType() == 2) {
                            if (xmlPullParser.getName().equals("font")) {
                                TypedArray obtainAttributes2 = resources2.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C110495a.f330399c);
                                int i = 8;
                                if (!obtainAttributes2.hasValue(8)) {
                                    i = 1;
                                }
                                int i2 = obtainAttributes2.getInt(i, 400);
                                boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                                int i3 = 9;
                                if (!obtainAttributes2.hasValue(9)) {
                                    i3 = 3;
                                }
                                int i4 = 7;
                                if (!obtainAttributes2.hasValue(7)) {
                                    i4 = 4;
                                }
                                String string5 = obtainAttributes2.getString(i4);
                                int i5 = obtainAttributes2.getInt(i3, 0);
                                int i6 = obtainAttributes2.hasValue(5) ? 5 : 0;
                                int resourceId2 = obtainAttributes2.getResourceId(i6, 0);
                                String string6 = obtainAttributes2.getString(i6);
                                obtainAttributes2.recycle();
                                while (xmlPullParser.next() != 3) {
                                    m151806c(xmlPullParser);
                                }
                                arrayList.add(new C111323c(string6, i2, z, string5, i5, resourceId2));
                            } else {
                                m151806c(xmlPullParser);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return new C111321b((C111323c[]) arrayList.toArray(new C111323c[arrayList.size()]));
                    }
                } else {
                    while (xmlPullParser.next() != 3) {
                        m151806c(xmlPullParser);
                    }
                    return new C111322d(new C104030e(string, string2, string3, m151805b(resources2, resourceId)), integer, integer2, string4);
                }
            } else {
                m151806c(xmlPullParser);
            }
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: b */
    public static List<List<byte[]>> m151805b(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String decode : stringArray) {
                            arrayList2.add(Base64.decode(decode, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String decode2 : stringArray2) {
                    arrayList3.add(Base64.decode(decode2, 0));
                }
                arrayList.add(arrayList3);
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: c */
    public static void m151806c(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
