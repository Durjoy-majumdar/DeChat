package r13;

import a70.C112760b;
import android.net.Uri;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.C40939n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import gk2.C59528a;
import gy3.C87412m;
import h81.C32735h;
import p237sp.C13754y;
import qe3.C89625d;
import z04.C112550d0;
import z04.C112551y;
import z04.C91602g0;

/* renamed from: r13.c */
public final class C63358c {

    /* renamed from: a */
    public static final C63358c f179727a = new C63358c();

    /* renamed from: b */
    public static final String f179728b;

    /* renamed from: c */
    public static final String f179729c;

    static {
        String str = C112760b.m154216X() + "app_vibrate";
        f179728b = str;
        f179729c = str + XVFSFile.SEPARATOR_CHAR;
    }

    /* renamed from: a */
    public static final boolean m74699a() {
        String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_ringtone_vibrate_support, "");
        if (Y60 != null) {
            if (!((Y60.length() > 0) && (C112551y.m153811k(Y60) ^ true))) {
                Y60 = null;
            }
            String str = Y60;
            if (str != null) {
                if (C112550d0.m153784T(str, new char[]{C91602g0.m114943k0(str)}, false, 0, 6, (Object) null).contains(C89625d.f257838d)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m74700b(C59528a aVar) {
        C86009m1 m1Var;
        C87412m.m108594g(aVar, "vibrateDescInfo");
        if (C87412m.m108589b(aVar.f170149a, "phonering.HE")) {
            m1Var = new C86009m1(m74702f());
        } else {
            m1Var = new C86009m1(f179729c + aVar.f170150b + ".HE");
        }
        return (m74699a() ? false : ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_ringtone_preview_can_vibrate, true)) && m1Var.mo119967g();
    }

    /* renamed from: e */
    public static final String m74701e(String str, String str2, boolean z) {
        C87412m.m108594g(str, "url");
        C87412m.m108594g(str2, DownloadInfo.FILENAME);
        if (C87412m.m108589b(str, "phonering.HE")) {
            return m74702f();
        }
        StringBuilder sb = new StringBuilder();
        String str3 = f179729c;
        sb.append(str3);
        sb.append(str2);
        sb.append(".HE");
        Uri n = C116299g2.m163858n(sb.toString());
        String path = n.getPath();
        boolean z2 = false;
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if ((!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b)) || !z) {
            C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n, l);
            if (l2.mo177810a()) {
                z2 = l2.f348991a.mo119948x(l2.f348992b);
            }
            if (!z2 && !z) {
                f179727a.mo88265d(str, str2);
            }
            String i = new C86009m1(str3 + str2 + ".HE").mo119971i();
            C87412m.m108593f(i, "file.absolutePath");
            return i;
        }
        f179727a.mo88265d(str, str2);
        return m74702f();
    }

    /* renamed from: f */
    public static final String m74702f() {
        StringBuilder sb = new StringBuilder();
        String str = f179729c;
        sb.append(str);
        sb.append("phonering.HE");
        Uri n = C116299g2.m163858n(sb.toString());
        String path = n.getPath();
        boolean z = false;
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (l.mo177810a()) {
            z = l.f348991a.mo119948x(l.f348992b);
        }
        if (!z) {
            f179727a.mo88264c();
        }
        String i = new C86009m1(str + "phonering.HE").mo119971i();
        C87412m.m108593f(i, "file.absolutePath");
        return i;
    }

    /* renamed from: c */
    public final void mo88264c() {
        String str = f179729c;
        C86009m1 m1Var = new C86009m1(str);
        if (m1Var.mo119978p()) {
            m1Var.mo119966f();
        }
        if (!m1Var.mo119967g()) {
            m1Var.mo119987x();
        }
        long currentTimeMillis = System.currentTimeMillis();
        C86013q1.m106442c("assets:///phonering.HE", str + "phonering.HE");
        Log.m105919d("MicroMsg.VibrationManager", "copyVibrate. use time:%d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: d */
    public final void mo88265d(String str, String str2) {
        C87412m.m108594g(str, "url");
        C87412m.m108594g(str2, DownloadInfo.FILENAME);
        Uri n = C116299g2.m163858n(f179728b + str);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
            mo88264c();
        }
        C40939n nVar = new C40939n((C40939n.C2206a) null);
        nVar.f110186k = true;
        nVar.f110182g = "vibrate_" + str2;
        nVar.f110176a = str;
        nVar.f110181f = 0;
        nVar.f110201z = f179729c + str2 + ".HE";
        nVar.f110184i = false;
        nVar.f110185j = false;
        nVar.f110179d = str2 + ".HE";
        ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63957c(nVar);
    }
}
