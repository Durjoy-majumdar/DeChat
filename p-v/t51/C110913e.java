package t51;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.plugin.eggspring.p882ui.SpringLuckyEggActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import p51.C110184g;
import p821rk.C48041n;

/* renamed from: t51.e */
public final class C110913e<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ SpringLuckyEggActivity f331725d;

    public C110913e(SpringLuckyEggActivity springLuckyEggActivity) {
        this.f331725d = springLuckyEggActivity;
    }

    public final void onChanged(T t) {
        if (C87412m.m108589b((Boolean) t, Boolean.TRUE)) {
            C110928q qVar = this.f331725d.f312423f;
            if (qVar != null) {
                qVar.f331756l.setVisibility(4);
                C110928q qVar2 = this.f331725d.f312423f;
                if (qVar2 != null) {
                    qVar2.f331746b.mo129236w();
                    C110928q qVar3 = this.f331725d.f312423f;
                    if (qVar3 != null) {
                        qVar3.f331746b.setVisibility(0);
                    } else {
                        C87412m.m108603p("viewBinding");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("viewBinding");
                    throw null;
                }
            } else {
                C87412m.m108603p("viewBinding");
                throw null;
            }
        } else {
            SpringLuckyEggActivity springLuckyEggActivity = this.f331725d;
            long j = springLuckyEggActivity.f312425h;
            springLuckyEggActivity.getClass();
            PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(View.ROTATION_X, new Keyframe[]{Keyframe.ofFloat(0.0f, 90.0f), Keyframe.ofFloat(1.0f, 0.0f)});
            Keyframe ofFloat = Keyframe.ofFloat(0.0f, 0.0f);
            Keyframe ofFloat2 = Keyframe.ofFloat(1.0f, 1.0f);
            PropertyValuesHolder ofKeyframe2 = PropertyValuesHolder.ofKeyframe(View.SCALE_X, new Keyframe[]{ofFloat, ofFloat2});
            PropertyValuesHolder ofKeyframe3 = PropertyValuesHolder.ofKeyframe(View.SCALE_Y, new Keyframe[]{ofFloat, ofFloat2});
            PropertyValuesHolder ofKeyframe4 = PropertyValuesHolder.ofKeyframe(View.ALPHA, new Keyframe[]{Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(1.0f, 1.0f)});
            PropertyValuesHolder ofKeyframe5 = PropertyValuesHolder.ofKeyframe(View.Y, new Keyframe[]{Keyframe.ofFloat(0.0f, -50.0f), Keyframe.ofFloat(0.5f, -610.0f), Keyframe.ofFloat(1.0f, 0.0f)});
            C110928q qVar4 = springLuckyEggActivity.f312423f;
            if (qVar4 != null) {
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(qVar4.f331756l, new PropertyValuesHolder[]{ofKeyframe, ofKeyframe2, ofKeyframe3, ofKeyframe4, ofKeyframe5});
                C87412m.m108593f(ofPropertyValuesHolder, "ofPropertyValuesHolder(v…scaleX, scaleY, alpha, y)");
                ofPropertyValuesHolder.setInterpolator(new LinearInterpolator());
                long milliSecondsToNow = Util.milliSecondsToNow(j);
                if (milliSecondsToNow < 2000) {
                    ofPropertyValuesHolder.setStartDelay(((long) 2000) - milliSecondsToNow);
                    Log.m105928w("MicroMsg.SpringLuckyEggActivity", "animator start delay " + ofPropertyValuesHolder.getStartDelay());
                }
                ofPropertyValuesHolder.setDuration(550).start();
                ofPropertyValuesHolder.addListener(new C110911c(springLuckyEggActivity, j));
                ofPropertyValuesHolder.start();
                C48041n value = springLuckyEggActivity.mo149514M7().f331793q.getValue();
                C115669n.INSTANCE.mo160131h(18916, C110184g.f329622e, "", 1, "", "", "", "", "", C110184g.f329624g, Long.valueOf(value != null ? value.f128876u : 0));
                return;
            }
            C87412m.m108603p("viewBinding");
            throw null;
        }
    }
}
