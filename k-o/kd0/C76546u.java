package kd0;

import android.content.Context;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.pluginsdk.cmd.C30650a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30747i5;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import f40.C86718e;
import junit.framework.Assert;
import p375qh.C77347o;
import p375qh.o$$e;
import p787ai.C79547b;
import yc3.C38992a;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: kd0.u */
public class C76546u extends C86301e {

    /* renamed from: d */
    public C76541g0 f224044d;

    /* renamed from: e */
    public C30747i5 f224045e;

    /* renamed from: f */
    public C77347o f224046f;

    /* renamed from: g */
    public C114668z.C104589a f224047g = new C76547a(this);

    /* renamed from: kd0.u$b */
    public static class C33886b implements C38992a {
        /* renamed from: a */
        public boolean mo38a(Context context, String[] strArr, String str) {
            String str2;
            String str3 = strArr[0];
            str3.getClass();
            if (!str3.equals("//voicetrymore") || strArr.length <= 1 || (str2 = strArr[1]) == null) {
                return false;
            }
            int i = Util.getInt(str2, 1);
            C77347o.f225520t = i == 1;
            Log.m105925i("MicroMsg.SubCoreVoice", "summervoicetrymore enable[%d]", Integer.valueOf(i));
            return true;
        }
    }

    /* renamed from: kd0.u$a */
    public class C76547a extends C114668z.C104589a {

        /* renamed from: kd0.u$a$a */
        public class C76548a implements Runnable {
            public C76548a(C76547a aVar) {
            }

            public void run() {
                C76546u.xx0().mo107480e();
            }
        }

        public C76547a(C76546u uVar) {
        }

        public void onAppBackground(String str) {
            if (C86709a0.m107522a() && C86709a0.m107523b().f251765p) {
                C86709a0.m107523b();
                C86718e.m107551r();
            }
        }

        public void onAppForeground(String str) {
            if (C86709a0.m107522a() && C86709a0.m107523b().f251765p) {
                C86709a0.m107523b();
                if (!C86718e.m107551r()) {
                    C79547b.f233255g.mo109607a(new C76548a(this));
                }
            }
        }
    }

    public static C76546u vx0() {
        return (C76546u) C86312j.m106911c(C76546u.class);
    }

    public static C30747i5 wx0() {
        C86709a0.m107523b().mo121108c();
        if (vx0().f224045e == null) {
            Assert.assertTrue("dataDB is null ", C86709a0.m107535s().mo121143j() != null);
            vx0().f224045e = new C30747i5(C86709a0.m107535s().mo121143j());
        }
        return vx0().f224045e;
    }

    public static C77347o xx0() {
        C86709a0.m107523b().mo121108c();
        if (vx0().f224046f == null) {
            vx0().f224046f = o$$e.f225543a;
        }
        Log.m105925i("MicroMsg.SubCoreVoice", "getVoiceService %s", vx0().f224046f.toString());
        return vx0().f224046f;
    }

    public static C76541g0 yx0() {
        C86709a0.m107523b().mo121108c();
        if (vx0().f224044d == null) {
            Assert.assertTrue("dataDB is null ", C86709a0.m107535s().mo121143j() != null);
            vx0().f224044d = new C76541g0(C86709a0.m107535s().mo121143j());
        }
        return vx0().f224044d;
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        C77347o xx02 = xx0();
        xx02.getClass();
        Log.m105928w("MicroMsg.SceneVoiceService", "setAccountReady: true");
        xx02.f225524f = true;
        this.f224047g.alive();
        C30650a.m39147b(new C33886b(), "//voicetrymore");
    }

    public void onAccountReleased(Context context) {
        if (vx0().f224046f != null) {
            C77347o oVar = vx0().f224046f;
            oVar.f225531p = 0;
            oVar.mo107481f(true);
        }
        this.f224047g.dead();
        C30650a.m39148c("//voicetrymore");
        C77347o xx02 = xx0();
        xx02.getClass();
        Log.m105928w("MicroMsg.SceneVoiceService", "setAccountReady: false");
        xx02.f225524f = false;
    }
}
