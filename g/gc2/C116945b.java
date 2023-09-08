package gc2;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.newtips.model.C115621e;
import com.tencent.p014mm.plugin.newtips.model.C115627l;
import com.tencent.p014mm.plugin.newtips.model.C57150p;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import jc2.C117341a;
import jc2.C117342b;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: gc2.b */
public class C116945b extends C86301e {

    /* renamed from: d */
    public C115627l f350431d = null;

    /* renamed from: e */
    public C117341a f350432e = null;

    /* renamed from: f */
    public C117342b f350433f = null;

    /* renamed from: g */
    public C115621e f350434g = null;

    /* renamed from: h */
    public C57150p f350435h = new C57150p();

    public static C117341a vx0() {
        C86709a0.m107523b().mo121108c();
        if (zx0().f350432e == null) {
            C116945b zx02 = zx0();
            C86709a0.m107528h();
            zx02.f350432e = new C117341a(C86709a0.m107535s().f251811i);
        }
        return zx0().f350432e;
    }

    public static C115621e wx0() {
        C86709a0.m107523b().mo121108c();
        if (zx0().f350434g == null) {
            zx0().f350434g = new C115621e();
        }
        return zx0().f350434g;
    }

    public static C117342b xx0() {
        C86709a0.m107523b().mo121108c();
        if (zx0().f350433f == null) {
            C116945b zx02 = zx0();
            C86709a0.m107528h();
            zx02.f350433f = new C117342b(C86709a0.m107535s().f251811i);
        }
        return zx0().f350433f;
    }

    public static C115627l yx0() {
        C86709a0.m107523b().mo121108c();
        if (zx0().f350431d == null) {
            zx0().f350431d = new C115627l();
        }
        return zx0().f350431d;
    }

    public static C116945b zx0() {
        return (C116945b) C86312j.m106911c(C116945b.class);
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        yx0().mo175767h(1, 1, 1, "", "me_setting_general_plugin");
        Log.m105925i("MicroMsg.NewTips.NewTipsManager", "dancy register dynamic newtips, tipsId:%s, path:%s", 1, "me_setting_general_plugin");
    }
}
