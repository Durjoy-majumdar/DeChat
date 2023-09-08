package o33;

import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.ball.service.FloatBallHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import l33.C109247e;

/* renamed from: o33.a */
public class C109935a extends FloatBallHelper {

    /* renamed from: n */
    public long f328928n = 0;

    /* renamed from: o33.a$a */
    public class C109936a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f328929d;

        /* renamed from: e */
        public final /* synthetic */ View f328930e;

        /* renamed from: f */
        public final /* synthetic */ boolean f328931f;

        public C109936a(int i, View view, boolean z) {
            this.f328929d = i;
            this.f328930e = view;
            this.f328931f = z;
        }

        public void run() {
            Log.m105925i("MicroMsg.VoipFloatBallHelper", "addVoipView, no ball, state:%s, view:%s", Integer.valueOf(this.f328929d), this.f328930e);
            BallInfo ballInfo = C109935a.this.f311726d;
            ballInfo.f311680E = true;
            ballInfo.f311681F = false;
            ballInfo.f311689g = this.f328930e;
            ballInfo.f311696q = false;
            ballInfo.f311682G = C109247e.xx0().f317337f;
            C109935a.this.f311726d.f311677B = true;
            if (!C109247e.xx0().f317337f) {
                C109247e.xx0().f317337f = true;
            }
            C109935a aVar = C109935a.this;
            int i = this.f328929d;
            boolean z = this.f328931f;
            aVar.getReportInfo().f311719h = z ? "3" : i == 4 ? "2" : "1";
            aVar.getReportInfo().f311720i = z ? null : String.valueOf(C109247e.xx0().mo152616o());
            aVar.getReportInfo().f311715d = 2;
            aVar.mo68414O();
            C109935a aVar2 = C109935a.this;
            int i2 = this.f328929d;
            if (!this.f328931f) {
                aVar2.f311726d.f311679D = i2;
            } else if (i2 == 4) {
                aVar2.f311726d.f311679D = 512;
            } else if (i2 == 8) {
                aVar2.f311726d.f311679D = 1024;
            } else {
                aVar2.getClass();
            }
            C109935a.this.mo161256y0(this.f328929d, this.f328931f, false);
            C109935a.this.mo161255x0(this.f328929d, this.f328931f);
            C109935a.this.mo68419u();
        }
    }

    /* renamed from: o33.a$b */
    public static class C109937b {

        /* renamed from: a */
        public static C109935a f328933a = new C109935a();
    }

    public C109935a() {
        mo35648A(9, "VOIPFloatBall");
        getReportInfo().f311717f = 10;
        if (C109247e.xx0() != null) {
            getReportInfo().f311718g = String.valueOf(C109247e.xx0().mo152616o());
        }
        mo68414O();
    }

    /* renamed from: v0 */
    public void mo161253v0(int i, boolean z, View view) {
        if (view == null) {
            return;
        }
        if (i != 4 && i != 8) {
            return;
        }
        if (!mo90541w()) {
            C109936a aVar = new C109936a(i, view, z);
            long nowMilliSecond = (this.f328928n + 200) - Util.nowMilliSecond();
            if (nowMilliSecond <= 0) {
                aVar.run();
                return;
            }
            Log.m105925i("MicroMsg.VoipFloatBallHelper", "addVoipView, no ball, add delayed:%s", Long.valueOf(nowMilliSecond));
            MMHandlerThread.postToMainThreadDelayed(aVar, nowMilliSecond);
        } else if (this.f311726d.f311689g != view) {
            Log.m105925i("MicroMsg.VoipFloatBallHelper", "addVoipView, has ball, but view is different, state:%s, view:%s, ballInfo.customView:%s", Integer.valueOf(i), view, this.f311726d.f311689g);
            BallInfo ballInfo = this.f311726d;
            ballInfo.f311680E = true;
            ballInfo.f311689g = view;
            ballInfo.f311681F = false;
            ballInfo.f311696q = false;
            ballInfo.f311677B = true;
            if (!z) {
                ballInfo.f311679D = i;
            } else if (i == 4) {
                ballInfo.f311679D = 512;
            } else if (i == 8) {
                ballInfo.f311679D = 1024;
            }
            mo161256y0(i, z, false);
            mo161255x0(i, z);
            mo68419u();
        } else {
            Log.m105925i("MicroMsg.VoipFloatBallHelper", "addVoipView, has ball, state:%s, view:%s", Integer.valueOf(i), view);
        }
    }

    /* renamed from: w0 */
    public void mo161254w0(FrameLayout frameLayout) {
        if (mo90541w()) {
            Log.m105925i("MicroMsg.VoipFloatBallHelper", "removeVoipView, has ball, view:%s", frameLayout);
            this.f328928n = Util.nowMilliSecond();
            mo68418k();
            return;
        }
        Log.m105925i("MicroMsg.VoipFloatBallHelper", "removeVoipView, no ball, view:%s", frameLayout);
    }

    /* renamed from: x0 */
    public final void mo161255x0(int i, boolean z) {
        if (z || i == 4) {
            BallInfo ballInfo = this.f311726d;
            if (ballInfo.f311684I == null) {
                ballInfo.f311684I = new BallInfo.C104949b();
            }
        }
        if (z) {
            C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.f3766df);
            int c = C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.a__);
            int c2 = C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.a__);
            int c3 = C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.a_9);
            this.f311726d.f311684I.f311713a = new Point(c, c3);
            this.f311726d.f311684I.f311714b = new Point(c2, c3);
            Log.m105919d("MicroMsg.VoipFloatBallHelper", "setAnimationInfo isMultiTalk: %b, state: %d, startSize: %d, endWidth: %d, endHeight: %d", Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(c), Integer.valueOf(c2), Integer.valueOf(c3));
        } else if (i == 4) {
            C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.f3766df);
            int c4 = C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.a_c);
            int c5 = C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.a_a);
            int c6 = C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.a_6);
            int c7 = C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.a_4);
            this.f311726d.f311684I.f311713a = new Point(c4, c5);
            this.f311726d.f311684I.f311714b = new Point(c6, c7);
            BallInfo.C104949b bVar = this.f311726d.f311684I;
            Log.m105919d("MicroMsg.VoipFloatBallHelper", "setAnimationInfo isMultiTalk: %b, state: %d, startSize: %s, endSize: %s", Boolean.valueOf(z), Integer.valueOf(i), bVar.f311713a, bVar.f311714b);
        } else {
            this.f311726d.f311684I = null;
        }
    }

    /* renamed from: y0 */
    public void mo161256y0(int i, boolean z, boolean z2) {
        BallInfo ballInfo = this.f311726d;
        if (ballInfo.f311690h == null) {
            ballInfo.f311690h = new Point();
        }
        int c = C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.f3766df);
        if (i == 8) {
            if (!z) {
                this.f311726d.f311690h.x = C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.a_6);
                this.f311726d.f311690h.y = C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.a_4);
            } else {
                this.f311726d.f311690h.x = C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.a__);
                this.f311726d.f311690h.y = C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.a_9);
            }
        } else if (i == 4) {
            if (!z) {
                this.f311726d.f311690h.x = C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.a_c);
                this.f311726d.f311690h.y = C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.a_a);
            } else {
                this.f311726d.f311690h.x = C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.a__);
                this.f311726d.f311690h.y = C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.a_9);
            }
        }
        if (z2) {
            Point point = this.f311726d.f311690h;
            int i2 = point.x;
            point.x = point.y;
            point.y = i2;
        }
        Log.m105927v("MicroMsg.VoipFloatBallHelper", "setVoipViewSize %s, margin: %d", this.f311726d.f311690h, Integer.valueOf(c));
    }
}
