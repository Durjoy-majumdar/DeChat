package dn0;

import android.text.TextUtils;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import java.util.HashMap;

/* renamed from: dn0.b */
public class C86358b {

    /* renamed from: c */
    public static final C86358b f251077c = new C86358b("unknown");

    /* renamed from: d */
    public static final C86358b f251078d = new C86358b("application/octet-stream");

    /* renamed from: e */
    public static final C86358b f251079e = new C86358b(MimeTypes.VIDEO_MP4);

    /* renamed from: f */
    public static final byte[] f251080f = {117, 110, 107, 110, 111, 119, 110};

    /* renamed from: g */
    public static HashMap<String, C86358b> f251081g = new HashMap<>();

    /* renamed from: a */
    public String f251082a;

    /* renamed from: b */
    public String f251083b;

    public C86358b(String str) {
        this.f251082a = str;
    }

    /* renamed from: a */
    public static C86358b m106987a(String str) {
        return TextUtils.isEmpty(str) ? f251077c : str.equals(MimeTypes.VIDEO_MP4) ? f251079e : str.equals("unknown") ? f251077c : new C86358b(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C86358b.class != obj.getClass()) {
            return false;
        }
        String str = this.f251082a;
        String str2 = ((C86358b) obj).f251082a;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
    }

    public int hashCode() {
        String str = this.f251082a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return this.f251082a;
    }
}
