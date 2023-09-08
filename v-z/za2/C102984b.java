package za2;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.vfs.C86009m1;
import ha2.C32752h;
import qc0.C101106m;

/* renamed from: za2.b */
public class C102984b {
    /* renamed from: a */
    public static String m136164a(C101106m mVar) {
        String str = "";
        if (mVar.f295959d == 6) {
            StringBuilder sb = new StringBuilder();
            sb.append("6_");
            if (!TextUtils.isEmpty(mVar.f295960e)) {
                str = MD5Util.getMD5String(mVar.f295960e);
            }
            sb.append(str);
            return sb.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("0_");
        if (!TextUtils.isEmpty(mVar.f295960e)) {
            str = MD5Util.getMD5String(mVar.f295960e);
        }
        sb4.append(str);
        return sb4.toString();
    }

    /* renamed from: b */
    public static String m136165b(String str) {
        return "piece" + MD5Util.getMD5String("" + str.hashCode());
    }

    /* renamed from: c */
    public static String m136166c(String str) {
        return m136167d(str.hashCode() + "", false);
    }

    /* renamed from: d */
    public static String m136167d(String str, boolean z) {
        String str2;
        C86009m1 m1Var = new C86009m1(C32752h.m39802a(), "music");
        if (!m1Var.mo119967g()) {
            Log.m105925i("MicroMsg.Music.MusicFileUtil", "create file folder:%b for path:%s", Boolean.valueOf(m1Var.mo119987x()), m1Var.mo119971i());
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(MD5Util.getMD5String(str + "temp"));
            sb.append("-wifi");
            str2 = sb.toString();
        } else {
            str2 = MD5Util.getMD5String(str + "temp");
        }
        C86009m1 m1Var2 = new C86009m1(m1Var, str2);
        Log.m105919d("MicroMsg.Music.MusicFileUtil", "music name %s path %s", str2, m1Var2.mo119969h());
        return m1Var2.mo119971i();
    }

    /* renamed from: e */
    public static String m136168e(String str) {
        C86009m1 m1Var = new C86009m1(C32752h.m39802a(), "music");
        if (!m1Var.mo119967g()) {
            m1Var.mo119987x();
        }
        String b = m136165b(str);
        C86009m1 m1Var2 = new C86009m1(m1Var, b);
        Log.m105919d("MicroMsg.Music.MusicFileUtil", "getMusicPieceFilePath music name %s path %s", b, m1Var2.mo119969h());
        return m1Var2.mo119971i();
    }

    /* renamed from: f */
    public static String m136169f(String str, boolean z) {
        return m136167d(str, false) + "-thumb-" + z;
    }
}
