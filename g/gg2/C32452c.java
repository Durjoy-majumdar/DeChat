package gg2;

import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import hg2.C76193l;
import tc0.C77885p;
import te3.C48993ce3;

/* renamed from: gg2.c */
public class C32452c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f86234d;

    public C32452c(boolean z) {
        this.f86234d = z;
    }

    public void run() {
        Log.m105925i("MicroMsg.PluginReaderApp", "set pluginReaderApp install %b", Boolean.valueOf(this.f86234d));
        int o = C75592q0.m90785o();
        C86709a0.m107535s().mo121142i().mo119676J(34, Integer.valueOf(this.f86234d ? o & -524289 : o | 524288));
        C48993ce3 ce32 = new C48993ce3();
        ce32.f131680d = 524288;
        ce32.f131681e = this.f86234d ^ true ? 1 : 0;
        ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(39, ce32));
        if (!this.f86234d) {
            C76193l.vx0((C76193l.C76196c) null);
            C32449b.wx0(false);
            return;
        }
        C32449b.wx0(true);
    }
}
