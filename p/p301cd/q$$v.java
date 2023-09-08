package p301cd;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: cd.q$$v */
public class q$$v implements Runnable {

    /* renamed from: d */
    public int f234392d;

    /* renamed from: e */
    public int f234393e = 0;

    /* renamed from: f */
    public final /* synthetic */ C80005q f234394f;

    public q$$v(C80005q qVar) {
        this.f234394f = qVar;
    }

    public void run() {
        int i = this.f234393e + 1;
        this.f234393e = i;
        Log.m105925i("MicroMsg.SameLayer.LivePusherPluginHandler", "[CheckRotateTask] number:%s, angle:%s", Integer.valueOf(i), Integer.valueOf(this.f234392d));
        int x = this.f234394f.mo110228x();
        if (x == this.f234392d) {
            this.f234394f.mo110230z(x);
        } else if (this.f234393e < 8) {
            this.f234394f.f234312B.postDelayed(this, 250);
        }
    }
}
