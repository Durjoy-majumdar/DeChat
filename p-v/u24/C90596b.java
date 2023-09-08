package u24;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import java.util.HashMap;
import java.util.Map;

/* renamed from: u24.b */
public class C90596b {

    /* renamed from: a */
    public static final Map f260303a;

    /* renamed from: b */
    public static final Map f260304b = new HashMap();

    /* renamed from: c */
    public static final Map f260305c = new HashMap();

    /* renamed from: d */
    public static final Map f260306d = new HashMap();

    /* renamed from: e */
    public static /* synthetic */ Class f260307e;

    /* renamed from: f */
    public static /* synthetic */ Class f260308f;

    /* renamed from: g */
    public static /* synthetic */ Class f260309g;

    /* renamed from: h */
    public static /* synthetic */ Class f260310h;

    /* renamed from: i */
    public static /* synthetic */ Class f260311i;

    /* renamed from: j */
    public static /* synthetic */ Class f260312j;

    /* renamed from: k */
    public static /* synthetic */ Class f260313k;

    /* renamed from: l */
    public static /* synthetic */ Class f260314l;

    static {
        String.valueOf('.');
        String.valueOf('$');
        HashMap hashMap = new HashMap();
        f260303a = hashMap;
        Class cls = Boolean.TYPE;
        Class cls2 = f260307e;
        if (cls2 == null) {
            cls2 = m113501b("java.lang.Boolean");
            f260307e = cls2;
        }
        hashMap.put(cls, cls2);
        Class cls3 = Byte.TYPE;
        Class cls4 = f260308f;
        if (cls4 == null) {
            cls4 = m113501b("java.lang.Byte");
            f260308f = cls4;
        }
        hashMap.put(cls3, cls4);
        Class cls5 = Character.TYPE;
        Class cls6 = f260309g;
        if (cls6 == null) {
            cls6 = m113501b("java.lang.Character");
            f260309g = cls6;
        }
        hashMap.put(cls5, cls6);
        Class cls7 = Short.TYPE;
        Class cls8 = f260310h;
        if (cls8 == null) {
            cls8 = m113501b("java.lang.Short");
            f260310h = cls8;
        }
        hashMap.put(cls7, cls8);
        Class cls9 = Integer.TYPE;
        Class cls10 = f260311i;
        if (cls10 == null) {
            cls10 = m113501b("java.lang.Integer");
            f260311i = cls10;
        }
        hashMap.put(cls9, cls10);
        Class cls11 = Long.TYPE;
        Class cls12 = f260312j;
        if (cls12 == null) {
            cls12 = m113501b("java.lang.Long");
            f260312j = cls12;
        }
        hashMap.put(cls11, cls12);
        Class cls13 = Double.TYPE;
        Class cls14 = f260313k;
        if (cls14 == null) {
            cls14 = m113501b("java.lang.Double");
            f260313k = cls14;
        }
        hashMap.put(cls13, cls14);
        Class cls15 = Float.TYPE;
        Class cls16 = f260314l;
        if (cls16 == null) {
            cls16 = m113501b("java.lang.Float");
            f260314l = cls16;
        }
        hashMap.put(cls15, cls16);
        Class cls17 = Void.TYPE;
        hashMap.put(cls17, cls17);
        for (Class cls18 : hashMap.keySet()) {
            Class cls19 = (Class) f260303a.get(cls18);
            if (!cls18.equals(cls19)) {
                f260304b.put(cls19, cls18);
            }
        }
        m113500a("int", "I");
        m113500a(DownloadSetting.TYPE_BOOLEAN, "Z");
        m113500a("float", "F");
        m113500a("long", "J");
        m113500a("short", ExifInterface.LATITUDE_SOUTH);
        m113500a("byte", "B");
        m113500a("double", "D");
        m113500a("char", "C");
    }

    /* renamed from: a */
    public static void m113500a(String str, String str2) {
        f260305c.put(str, str2);
        f260306d.put(str2, str);
    }

    /* renamed from: b */
    public static /* synthetic */ Class m113501b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }
}
