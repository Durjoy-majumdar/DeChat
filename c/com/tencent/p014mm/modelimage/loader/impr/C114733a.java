package com.tencent.p014mm.modelimage.loader.impr;

import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import hc0.C20937c;
import ic0.C117152b;
import ic0.C117153g;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import mc0.C34542b;

/* renamed from: com.tencent.mm.modelimage.loader.impr.a */
public class C114733a implements C117152b {

    /* renamed from: a */
    public C117153g f343975a;

    /* renamed from: a */
    public boolean mo174348a(String str, C20937c cVar) {
        String c = mo174350c(str, cVar);
        if (c == null) {
            return false;
        }
        Uri n = C116299g2.m163858n(c);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        return l.mo177810a() && l.f348991a.mo119933c(l.f348992b);
    }

    /* renamed from: b */
    public InputStream mo174349b(String str, C20937c cVar) {
        try {
            String c = mo174350c(str, cVar);
            if (c == null) {
                return null;
            }
            return C86013q1.m106423E(c);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final String mo174350c(String str, C20937c cVar) {
        String str2 = cVar.f59321e;
        if (!((str2 != null && str2.length() != 0) || (str2 = cVar.f59322f) == null || str2.length() == 0)) {
            str2 = str2 + "/" + ((C114734d) this.f343975a).mo174352a(str);
        }
        if (cVar.f59318b && Util.isNullOrNil(str2)) {
            StringBuilder sb = new StringBuilder();
            String str3 = C34542b.f92924a;
            StringBuilder sb4 = new StringBuilder();
            String str4 = C34542b.f92924a;
            sb4.append(str4);
            sb4.append("/");
            sb4.append(new SimpleDateFormat("yyyyMMdd").format(new Date(System.currentTimeMillis())));
            String sb5 = sb4.toString();
            boolean z = false;
            Log.m105919d("MicroMsg.imageloader.ImageTmpFilehUtils", "[cpan] get tmp file path:%s", sb5);
            Uri n = C116299g2.m163858n(str4);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0 f0Var = C116281f0.C116289i.f348994a;
            C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
            if (l.mo177810a()) {
                z = l.f348991a.mo119948x(l.f348992b);
            }
            if (!z) {
                C116281f0.C116288h l2 = f0Var.mo177799l(n, l);
                if (l2.mo177810a()) {
                    l2.f348991a.mo119937g(l2.f348992b);
                }
            }
            sb.append(sb5);
            sb.append("/");
            sb.append(((C114734d) this.f343975a).mo174352a(str));
            str2 = sb.toString();
        }
        if (str2 == null || str2.length() == 0) {
            return null;
        }
        return str2;
    }

    /* renamed from: d */
    public boolean mo174351d(String str, byte[] bArr, C20937c cVar) {
        String c = mo174350c(str, cVar);
        if (c == null) {
            return false;
        }
        C86009m1 l = new C86009m1(c).mo119974l();
        if (l != null && !l.mo119967g()) {
            l.mo119987x();
        }
        C86009m1 m1Var = new C86009m1(c);
        if (!m1Var.mo119967g()) {
            try {
                m1Var.mo119964e();
            } catch (Exception e) {
                Log.m105924i("MicroMsg.imageloader.DefaultImageDiskCache", Util.stackTraceToString(e));
            }
        }
        if (bArr != null && C86013q1.m106438T(c, bArr, 0, bArr.length) < 0) {
            return false;
        }
        Log.m105925i("MicroMsg.Mv.ImageLoader", "save image to disk success url:%s filePath:%s", str, c);
        return true;
    }
}
