package bw0;

import com.tencent.p014mm.plugin.ball.view.FloatMenuView;
import uv0.C111231e;

/* renamed from: bw0.q */
public class C104178q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f308419d;

    /* renamed from: e */
    public final /* synthetic */ int f308420e;

    /* renamed from: f */
    public final /* synthetic */ boolean f308421f;

    /* renamed from: g */
    public final /* synthetic */ FloatMenuView f308422g;

    public C104178q(FloatMenuView floatMenuView, int i, int i2, boolean z) {
        this.f308422g = floatMenuView;
        this.f308419d = i;
        this.f308420e = i2;
        this.f308421f = z;
    }

    public void run() {
        FloatMenuView floatMenuView = this.f308422g;
        int i = this.f308419d;
        int i2 = this.f308420e;
        int i3 = FloatMenuView.f312029F;
        floatMenuView.mo149367i(i, i2);
        C111231e eVar = this.f308422g.f312038g;
        if (eVar != null) {
            eVar.f333087e = this.f308421f;
            eVar.notifyDataSetChanged();
        }
    }
}
