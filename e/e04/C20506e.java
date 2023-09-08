package e04;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import ty3.C22558j;
import vz3.C22826c;

/* renamed from: e04.e */
public enum C20506e {
    BOOLEAN(C22558j.BOOLEAN, DownloadSetting.TYPE_BOOLEAN, "Z", "java.lang.Boolean"),
    CHAR(C22558j.CHAR, "char", "C", "java.lang.Character"),
    BYTE(C22558j.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(C22558j.SHORT, "short", ExifInterface.LATITUDE_SOUTH, "java.lang.Short"),
    INT(C22558j.INT, "int", "I", "java.lang.Integer"),
    FLOAT(C22558j.FLOAT, "float", "F", "java.lang.Float"),
    LONG(C22558j.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(C22558j.DOUBLE, "double", "D", "java.lang.Double");
    

    /* renamed from: s */
    public static final Set<C22826c> f57718s = null;

    /* renamed from: t */
    public static final Map<String, C20506e> f57719t = null;

    /* renamed from: u */
    public static final Map<C22558j, C20506e> f57720u = null;

    /* renamed from: v */
    public static final Map<String, C20506e> f57721v = null;

    /* renamed from: d */
    public final C22558j f57723d;

    /* renamed from: e */
    public final String f57724e;

    /* renamed from: f */
    public final String f57725f;

    /* renamed from: g */
    public final C22826c f57726g;

    /* access modifiers changed from: public */
    static {
        int i;
        f57718s = new HashSet();
        f57719t = new HashMap();
        f57720u = new EnumMap(C22558j.class);
        f57721v = new HashMap();
        C20506e[] values = values();
        int length = values.length;
        while (i < length) {
            C20506e eVar = values[i];
            ((HashSet) f57718s).add(eVar.mo32071f());
            Map<String, C20506e> map = f57719t;
            String str = eVar.f57724e;
            if (str != null) {
                ((HashMap) map).put(str, eVar);
                ((EnumMap) f57720u).put(eVar.mo32070e(), eVar);
                ((HashMap) f57721v).put(eVar.mo32069c(), eVar);
                i++;
            } else {
                m22187a(11);
                throw null;
            }
        }
    }

    /* access modifiers changed from: public */
    C20506e(C22558j jVar, String str, String str2, String str3) {
        if (jVar == null) {
            m22187a(6);
            throw null;
        } else if (str == null) {
            m22187a(7);
            throw null;
        } else if (str2 == null) {
            m22187a(8);
            throw null;
        } else if (str3 != null) {
            this.f57723d = jVar;
            this.f57724e = str;
            this.f57725f = str2;
            this.f57726g = new C22826c(str3);
        } else {
            m22187a(9);
            throw null;
        }
    }

    /* renamed from: b */
    public static C20506e m22188b(String str) {
        if (str != null) {
            C20506e eVar = (C20506e) ((HashMap) f57719t).get(str);
            if (eVar != null) {
                return eVar;
            }
            throw new AssertionError("Non-primitive type name passed: " + str);
        }
        m22187a(1);
        throw null;
    }

    /* renamed from: c */
    public String mo32069c() {
        String str = this.f57725f;
        if (str != null) {
            return str;
        }
        m22187a(12);
        throw null;
    }

    /* renamed from: e */
    public C22558j mo32070e() {
        C22558j jVar = this.f57723d;
        if (jVar != null) {
            return jVar;
        }
        m22187a(10);
        throw null;
    }

    /* renamed from: f */
    public C22826c mo32071f() {
        C22826c cVar = this.f57726g;
        if (cVar != null) {
            return cVar;
        }
        m22187a(13);
        throw null;
    }
}
