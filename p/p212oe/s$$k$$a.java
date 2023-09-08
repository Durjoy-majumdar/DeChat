package p212oe;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import p981ie.C117187w;

/* renamed from: oe.s$$k$$a */
public final /* synthetic */ class s$$k$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ s$$k f352274d;

    /* renamed from: e */
    public final /* synthetic */ int f352275e;

    public /* synthetic */ s$$k$$a(s$$k s__k, int i) {
        this.f352274d = s__k;
        this.f352275e = i;
    }

    public final void run() {
        s$$k s__k = this.f352274d;
        int i = this.f352275e;
        synchronized (s__k.f352285b.f352273s) {
            Log.m105924i("MicroMsg.battery.MMCompositeMonitors", s__k.hashCode() + " DeepBg: " + i);
            ((ArrayList) s__k.f352285b.f352271q).add(0, new C117187w.C117189b(String.valueOf(i)));
        }
    }
}
