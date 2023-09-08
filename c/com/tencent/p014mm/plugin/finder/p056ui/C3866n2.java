package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import cm1.C0742j2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.component.api.jumper.UICustomParam;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import di3.C86312j;
import er1.C58684b;
import f12.C7970a;
import f40.C86709a0;
import gy3.C87412m;
import hd0.C98410o0;
import hd0.C98426q0;
import hh2.C8532a;
import it1.C9247b;
import java.util.HashMap;
import java.util.Map;
import nj3.C76912y0;
import p140cw.C7138g;
import p166hy.C98562i0;
import p447aw.C103918d;
import p599lr.C61381b;
import p682rz.C101488s;
import p910lj.C76701a;
import su0.C13781a;

/* renamed from: com.tencent.mm.plugin.finder.ui.n2 */
public final class C3866n2 {

    /* renamed from: a */
    public final MMActivity f17410a;

    /* renamed from: b */
    public C9247b f17411b;

    /* renamed from: c */
    public final C0742j2 f17412c = new C0742j2();

    public C3866n2(MMActivity mMActivity) {
        C87412m.m108594g(mMActivity, "context");
        this.f17410a = mMActivity;
    }

    /* renamed from: a */
    public static final boolean m4068a(C3866n2 n2Var, boolean z) {
        n2Var.getClass();
        if (!C86709a0.m107535s().mo121147n()) {
            C76912y0.m92771j(n2Var.f17410a, (View) null);
            return false;
        }
        boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(n2Var.f17410a, "android.permission.CAMERA", 16, "", "");
        Log.m105925i("Finder.SelectCoverHelper", "checkPermission checkCamera[%b], stack[%s], activity[%s]", Boolean.valueOf(z1), Util.getStack(), n2Var.f17410a);
        if (!z1) {
            return false;
        }
        if (z) {
            Class cls = C98562i0.class;
            Class cls2 = C101488s.class;
            C3856l2 l2Var = new C3856l2(n2Var);
            String a = C98426q0.m127793a(C13781a.m13082a());
            C87412m.m108593f(a, "genFileName(Account.username())");
            RecordConfigProvider f = RecordConfigProvider.m119436f(((C98410o0) ((C101488s) C86312j.m106911c(cls2)).Kj0()).mo137728q(a), ((C98410o0) ((C101488s) C86312j.m106911c(cls2)).Kj0()).mo137729r(a), ((C98562i0) C86312j.m106911c(cls)).Gv0(), ((C98562i0) C86312j.m106911c(cls)).Gv0().f267170h * 1000, 11);
            UICustomParam uICustomParam = new UICustomParam();
            Map<String, Boolean> map = uICustomParam.f266575h;
            Boolean bool = Boolean.TRUE;
            ((HashMap) map).put("plugin_filter", bool);
            ((HashMap) uICustomParam.f266575h).put("plugin_poi", bool);
            ((HashMap) uICustomParam.f266575h).put("plugin_tip", bool);
            ((HashMap) uICustomParam.f266575h).put("plugin_menu", bool);
            f.f272927o = uICustomParam;
            Boolean bool2 = Boolean.FALSE;
            f.f272934v = bool2;
            f.f272932t = bool2;
            f.f272910K = false;
            f.f272911L = false;
            f.f272913N = true;
            f.f272930r = bool;
            f.f272929q = 4;
            f.mo129804a(1, "com.tencent.mm.plugin.recordvideo.plugin.parent.DirectSendPhotoPluginLayout");
            f.mo129804a(0, "com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout");
            CaptureDataManager.f272890c.f272891a = l2Var;
            C8532a.f27585a.mo9444c(n2Var.f17410a, 2000, C0966R.C0968anim.f2492eg, C0966R.C0968anim.f2493eh, f);
        } else {
            MMActivity mMActivity = n2Var.f17410a;
            String a2 = C7970a.m8127a();
            if (!((C7138g) C86312j.m106911c(C7138g.class)).Gl0(mMActivity, a2, "finderProfileCover." + System.currentTimeMillis() + ".jpg", 2003)) {
                C76701a.makeText((Context) n2Var.f17410a, (CharSequence) n2Var.mo4203b(C0966R.string.ik5), 1).show();
            }
        }
        return true;
    }

    /* renamed from: b */
    public final String mo4203b(int i) {
        String string = this.f17410a.getResources().getString(i);
        C87412m.m108593f(string, "context.resources.getString(strResId)");
        return string;
    }

    /* renamed from: c */
    public final void mo4204c(String str) {
        if (Util.isNullOrNil(str) || !C86013q1.m106450k(str)) {
            Log.m105928w("Finder.SelectCoverHelper", "no img select");
            return;
        }
        MMActivity mMActivity = this.f17410a;
        String str2 = "finder_profile_cover_" + System.currentTimeMillis() + ".tmp";
        ((C58684b) C86312j.m106911c(C58684b.class)).getClass();
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        C87412m.m108594g(str2, "resultFileName");
        ((C61381b) C86312j.m106911c(C61381b.class)).Yp0().mo88202m(mMActivity, (Intent) null, str, str2, 2002);
    }

    /* renamed from: d */
    public final void mo4205d() {
        C9247b bVar = this.f17411b;
        if (bVar != null) {
            bVar.mo8913b();
        }
        C9247b.C9248a aVar = C9247b.f28989d;
        MMActivity mMActivity = this.f17410a;
        C9247b a = C9247b.C9248a.m8889a(aVar, mMActivity, mMActivity.getString(C0966R.string.a4d), 300, (DialogInterface.OnCancelListener) null, 8, (Object) null);
        this.f17411b = a;
        a.begin();
    }
}
