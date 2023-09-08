package p871zj;

import android.graphics.Canvas;
import com.tencent.p014mm.danmaku.render.C55190a;

/* renamed from: zj.d */
public class C66837d implements C55190a.C55192b {

    /* renamed from: a */
    public final /* synthetic */ C66838e f191969a;

    public C66837d(C66838e eVar) {
        this.f191969a = eVar;
    }

    /* renamed from: a */
    public void mo90813a(Canvas canvas) {
        this.f191969a.mo90816c(canvas);
        synchronized (this.f191969a.f191982K) {
            C66838e eVar = this.f191969a;
            eVar.f191983L = true;
            eVar.f191982K.notifyAll();
        }
        this.f191969a.f191981J.mo90858a(12);
    }
}
