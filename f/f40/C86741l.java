package f40;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import zh3.C91753f;

/* renamed from: f40.l */
public class C86741l implements C91753f.C91754a {

    /* renamed from: d */
    public final /* synthetic */ C86744o f251800d;

    public C86741l(C86744o oVar) {
        this.f251800d = oVar;
    }

    /* renamed from: d */
    public void mo56419d() {
        if (this.f251800d.f251812j != null) {
            Log.m105924i("MMKernel.CoreStorage", "summer preCloseCallback userConfigStg: " + this.f251800d.f251812j);
            this.f251800d.f251812j.mo119681a(true);
            MMHandler mMHandler = this.f251800d.f251812j.f249899h;
            if (mMHandler != null) {
                mMHandler.quit();
            }
        }
        this.f251800d.f251804b.mo56419d();
    }

    /* renamed from: f */
    public void mo56420f() {
        this.f251800d.f251804b.mo56420f();
    }

    /* renamed from: m */
    public void mo56421m() {
        this.f251800d.f251804b.mo56421m();
    }
}
