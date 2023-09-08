package bw0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Point;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.ball.view.FloatBallView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: bw0.l */
public class C104172l extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ BallInfo f308406d;

    /* renamed from: e */
    public final /* synthetic */ Point f308407e;

    /* renamed from: f */
    public final /* synthetic */ Point f308408f;

    /* renamed from: g */
    public final /* synthetic */ FloatBallView f308409g;

    public C104172l(FloatBallView floatBallView, BallInfo ballInfo, Point point, Point point2) {
        this.f308409g = floatBallView;
        this.f308406d = ballInfo;
        this.f308407e = point;
        this.f308408f = point2;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        int i = this.f308406d.f311679D;
        if (i == 512) {
            FloatBallView.m141030a(this.f308409g, 1024);
            FloatBallView floatBallView = this.f308409g;
            floatBallView.getClass();
            Log.m105926v("MicroMsg.FloatBallView", "alvinluo resetExtraSize");
            Point point = floatBallView.f311968g1;
            point.x = 0;
            point.y = 0;
            FloatBallView floatBallView2 = this.f308409g;
            floatBallView2.f311966f1 = floatBallView2.f311960c1.f311684I.f311714b;
            this.f308406d.f311690h = new Point(this.f308409g.f311966f1);
        } else if (i == 8) {
            FloatBallView.m141030a(this.f308409g, 16);
            this.f308409g.f311968g1.x = Math.max(0, this.f308407e.x - this.f308408f.x);
            this.f308409g.f311968g1.y = Math.max(0, this.f308407e.y - this.f308408f.y);
            FloatBallView floatBallView3 = this.f308409g;
            floatBallView3.f311966f1 = floatBallView3.f311960c1.f311684I.f311714b;
            this.f308406d.f311690h = new Point(this.f308409g.f311966f1);
        }
        FloatBallView floatBallView4 = this.f308409g;
        Log.m105927v("MicroMsg.FloatBallView", "animateVoipSwitch onAnimationEnd voipViewSize: %s, extraSize: %s", floatBallView4.f311966f1, floatBallView4.f311968g1);
    }
}
