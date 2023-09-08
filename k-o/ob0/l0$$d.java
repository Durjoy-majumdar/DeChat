package ob0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86723g;
import java.util.concurrent.Executor;

public class l0$$d extends C117747y {

    /* renamed from: d */
    public C11385n f256854d = null;

    /* renamed from: e */
    public final C117747y f256855e = this;

    /* renamed from: f */
    public final long f256856f = Util.nowMilliSecond();

    /* renamed from: g */
    public int f256857g = 0;

    /* renamed from: h */
    public C1311n f256858h = new C89145a();

    /* renamed from: i */
    public MTimerHandler f256859i = new MTimerHandler(C86723g.this.f251779b.f256810e.getLooper(), (MTimerHandler.CallBack) new C89146b(), false);

    /* renamed from: j */
    public final /* synthetic */ C47350c f256860j;

    /* renamed from: n */
    public final /* synthetic */ Executor f256861n;

    /* renamed from: o */
    public final /* synthetic */ l0$$e f256862o;

    /* renamed from: ob0.l0$$d$a */
    public class C89145a implements C1311n {
        public C89145a() {
        }

        public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
            char c;
            String str2 = str;
            l0$$d l0__d = l0$$d.this;
            if (l0__d.f256857g != 2) {
                l0__d.f256859i.stopTimer();
                l0$$d l0__d2 = l0$$d.this;
                l0__d2.f256857g = 1;
                c = 2;
                C89144l0.m111425a(l0__d2.f256861n, l0__d2.f256862o, i2, i3, str, l0__d2.f256860j, l0__d2.f256855e);
            } else {
                c = 2;
                Log.m105929w("MicroMsg.RunCgi", "Has been callback by protect:%d func:%d time:%d [%d,%d,%s]", Integer.valueOf(l0__d.f256855e.hashCode()), Integer.valueOf(l0$$d.this.f256860j.f127058d), Long.valueOf(Util.nowMilliSecond() - l0$$d.this.f256856f), Integer.valueOf(i2), Integer.valueOf(i3), str2);
            }
            l0$$d l0__d3 = l0$$d.this;
            l0__d3.f256854d.onSceneEnd(i2, i3, str2, l0__d3.f256855e);
            Object[] objArr = new Object[6];
            objArr[0] = Integer.valueOf(l0$$d.this.f256855e.hashCode());
            objArr[1] = Integer.valueOf(l0$$d.this.f256860j.f127058d);
            objArr[c] = Long.valueOf(Util.nowMilliSecond() - l0$$d.this.f256856f);
            objArr[3] = Integer.valueOf(i2);
            objArr[4] = Integer.valueOf(i3);
            objArr[5] = str2;
            Log.m105925i("MicroMsg.RunCgi", "onGYNetEnd:%d func:%d time:%d [%d,%d,%s]", objArr);
        }
    }

    /* renamed from: ob0.l0$$d$b */
    public class C89146b implements MTimerHandler.CallBack {
        public C89146b() {
        }

        public boolean onTimerExpired() {
            Log.m105929w("MicroMsg.RunCgi", "Warning: Never should go here. usr canceled:%b Or NetsceneQueue Not call onGYNetEnd! %d func:%d time:%d", Boolean.valueOf(l0$$d.this.f256855e.isCanceled()), Integer.valueOf(l0$$d.this.f256855e.hashCode()), Integer.valueOf(l0$$d.this.f256860j.f127058d), Long.valueOf(Util.nowMilliSecond() - l0$$d.this.f256856f));
            if (l0$$d.this.f256855e.isCanceled()) {
                return false;
            }
            l0$$d l0__d = l0$$d.this;
            if (l0__d.f256857g == 1) {
                return false;
            }
            l0__d.f256857g = 2;
            C89144l0.m111425a(l0__d.f256861n, l0__d.f256862o, 3, -1, "", l0__d.f256860j, l0__d.f256855e);
            return false;
        }

        public String toString() {
            return super.toString() + "|protectNotCallback";
        }
    }

    public l0$$d(C47350c cVar, Executor executor, l0$$e l0__e) {
        this.f256860j = cVar;
        this.f256861n = executor;
        this.f256862o = l0__e;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f256854d = nVar;
        int dispatch = dispatch(gVar, this.f256860j, this.f256858h);
        Log.m105925i("MicroMsg.RunCgi", "Start doScene:%d func:%d netid:%d time:%d", Integer.valueOf(this.f256855e.hashCode()), Integer.valueOf(this.f256860j.f127058d), Integer.valueOf(dispatch), Long.valueOf(Util.nowMilliSecond() - this.f256856f));
        l0$$e l0__e = this.f256862o;
        if (l0__e != null) {
            if (dispatch < 0) {
                C89144l0.m111425a(this.f256861n, l0__e, 3, -1, "", this.f256860j, this.f256855e);
            } else {
                this.f256859i.startTimer(60000);
            }
        }
        return dispatch;
    }

    public int getType() {
        return this.f256860j.f127058d;
    }
}
