package nj2;

import a70.C112760b;
import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.C54219z;
import bp3.C104160f;
import bp3.C79758p;
import com.davemorrissey.labs.subscaleview.view.ImageSource;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import p206nj.C11171e;
import wj2.C66132f;
import z04.C112551y;

/* renamed from: nj2.o */
public final class C61767o {

    /* renamed from: a */
    public static final C61767o f175575a = new C61767o();

    /* renamed from: b */
    public static final String f175576b;

    /* renamed from: c */
    public static final String f175577c;

    /* renamed from: d */
    public static final C54219z<C66132f> f175578d = new C54219z<>();

    /* renamed from: e */
    public static final String f175579e = "phonering.mp3";

    /* renamed from: f */
    public static final String f175580f = "playend.mp3";

    /* renamed from: g */
    public static final String f175581g = "close_sound.mp3";

    /* renamed from: h */
    public static final String f175582h = "voip_bad_netstatus_hint.mp3";

    /* renamed from: i */
    public static final String f175583i = "animation_ringonte_ring.wxam";

    /* renamed from: j */
    public static final String f175584j = "animation_ringonte_ring_dark.wxam";

    /* renamed from: k */
    public static final String f175585k = "animation_ringtone_ring_gold.wxam";

    static {
        String str = C112760b.m154216X() + "app_ringtone";
        f175576b = str;
        f175577c = str + XVFSFile.SEPARATOR_CHAR;
    }

    /* renamed from: b */
    public static final Uri m72468b(Context context) {
        C87412m.m108594g(context, "context");
        StringBuilder sb = new StringBuilder();
        String str = f175577c;
        sb.append(str);
        String str2 = f175580f;
        sb.append(str2);
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
            f175575a.mo86685a();
        }
        Uri uriForFile = FileProviderHelper.getUriForFile(context, new C86009m1(str + str2));
        C87412m.m108593f(uriForFile, "getUriForFile(\n            context, file)");
        return uriForFile;
    }

    /* renamed from: e */
    public static final String m72469e(boolean z) {
        return z ? f175575a.mo86686c(f175584j) : f175575a.mo86686c(f175583i);
    }

    /* renamed from: f */
    public static final String m72470f(String str, String str2) {
        String str3;
        C87412m.m108594g(str, "toUser");
        C87412m.m108594g(str2, DownloadInfo.FILENAME);
        boolean z = false;
        String n = C112551y.m153814n(str2, "/", " ", false);
        if (n.length() == 0) {
            n = String.valueOf(System.currentTimeMillis());
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f175577c);
        if (str.length() > 0) {
            z = true;
        }
        if (z) {
            str3 = str + XVFSFile.SEPARATOR_CHAR;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(n);
        C86009m1 m1Var = new C86009m1(sb.toString());
        C86009m1 l = m1Var.mo119974l();
        if (l != null && !l.mo119967g()) {
            l.mo119987x();
        }
        String i = m1Var.mo119971i();
        C87412m.m108593f(i, "userRingtonePath.absolutePath");
        return i;
    }

    /* renamed from: g */
    public static final boolean m72471g() {
        C79758p pVar = C79758p.f233760a;
        C104160f fVar = C104160f.RepairerConfig_VOIP_RingChannelGrantPermission_Int;
        if (pVar.mo109882e(fVar, 0) != 0) {
            return pVar.mo109882e(fVar, 0) == 1;
        }
        if (C11171e.m11046c(29)) {
            return ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_ringtone_ringtone_channel_grant_permission, true);
        }
        return false;
    }

    /* renamed from: h */
    public static final boolean m72472h() {
        C79758p pVar = C79758p.f233760a;
        C104160f fVar = C104160f.RepairerConfig_VOIP_SetModeWhileRing_Int;
        return pVar.mo109882e(fVar, 0) != 0 ? pVar.mo109882e(fVar, 0) == 1 : ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_voip_setmode_while_ringing, false);
    }

    /* renamed from: a */
    public final void mo86685a() {
        C86009m1 m1Var = new C86009m1(f175576b);
        if (m1Var.mo119978p()) {
            m1Var.mo119966f();
        }
        if (!m1Var.mo119967g()) {
            m1Var.mo119987x();
        }
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append(ImageSource.ASSET_SCHEME);
        String str = f175579e;
        sb.append(str);
        String sb4 = sb.toString();
        StringBuilder sb5 = new StringBuilder();
        String str2 = f175577c;
        sb5.append(str2);
        sb5.append(str);
        C86013q1.m106442c(sb4, sb5.toString());
        StringBuilder sb6 = new StringBuilder();
        sb6.append(ImageSource.ASSET_SCHEME);
        String str3 = f175580f;
        sb6.append(str3);
        String sb7 = sb6.toString();
        C86013q1.m106442c(sb7, str2 + str3);
        StringBuilder sb8 = new StringBuilder();
        sb8.append(ImageSource.ASSET_SCHEME);
        String str4 = f175581g;
        sb8.append(str4);
        String sb9 = sb8.toString();
        C86013q1.m106442c(sb9, str2 + str4);
        StringBuilder sb10 = new StringBuilder();
        sb10.append(ImageSource.ASSET_SCHEME);
        String str5 = f175582h;
        sb10.append(str5);
        String sb11 = sb10.toString();
        C86013q1.m106442c(sb11, str2 + str5);
        StringBuilder sb12 = new StringBuilder();
        sb12.append(ImageSource.ASSET_SCHEME);
        String str6 = f175583i;
        sb12.append(str6);
        String sb13 = sb12.toString();
        C86013q1.m106442c(sb13, str2 + str6);
        StringBuilder sb14 = new StringBuilder();
        sb14.append(ImageSource.ASSET_SCHEME);
        String str7 = f175584j;
        sb14.append(str7);
        String sb15 = sb14.toString();
        C86013q1.m106442c(sb15, str2 + str7);
        StringBuilder sb16 = new StringBuilder();
        sb16.append(ImageSource.ASSET_SCHEME);
        String str8 = f175585k;
        sb16.append(str8);
        String sb17 = sb16.toString();
        C86013q1.m106442c(sb17, str2 + str8);
        Log.m105919d("MicroMsg.RingBackHelper", "copyRingtone. use time:%d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: c */
    public final String mo86686c(String str) {
        StringBuilder sb = new StringBuilder();
        String str2 = f175577c;
        sb.append(str2);
        sb.append(str);
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
            mo86685a();
        }
        String i = new C86009m1(str2 + str).mo119971i();
        C87412m.m108593f(i, "file.absolutePath");
        return i;
    }

    /* renamed from: d */
    public final String mo86687d(int i, String str) {
        C87412m.m108594g(str, "mediaId");
        return f175577c + i + '_' + str + ".ringtone";
    }

    /* renamed from: i */
    public final boolean mo86688i() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_multitalk_start_sco_when_ring, false);
    }
}
