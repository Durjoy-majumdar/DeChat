package hd0;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: hd0.b1 */
public class C76151b1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f223052d;

    /* renamed from: e */
    public final /* synthetic */ int f223053e;

    public C76151b1(C98447z0 z0Var, String str, int i) {
        this.f223052d = str;
        this.f223053e = i;
    }

    public void run() {
        String str = this.f223052d;
        int i = this.f223053e;
        C98408n0 i2 = C98429r0.m127818i(str);
        if (i2 != null) {
            i2.f288537E = i;
            i2.f288548P = 268435456;
            C98429r0.m127808N(i2);
        }
        C98408n0 i3 = C98429r0.m127818i(this.f223052d);
        if (i3 != null && i3.f288562i != 199) {
            if (i3.mo137711o()) {
                Log.m105924i("MicroMsg.VideoService", "start complete online video");
                C98429r0.m127803I(this.f223052d);
                return;
            }
            Log.m105924i("MicroMsg.VideoService", "start complete offline video");
            C98429r0.m127804J(this.f223052d);
        }
    }
}
