package fr2;

import android.animation.Animator;
import com.tencent.p014mm.plugin.sns.p104ad.widget.shakead.GLCardAnimView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import sq2.C13774c;
import zq2.C103063b;

/* renamed from: fr2.c */
public class C97953c extends C13774c {

    /* renamed from: d */
    public final /* synthetic */ C103063b f287314d;

    public C97953c(GLCardAnimView gLCardAnimView, C103063b bVar) {
        this.f287314d = bVar;
    }

    public void onAnimationStart(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView$2");
        C103063b bVar = this.f287314d;
        bVar.getClass();
        SnsMethodCalculate.markStartTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        bVar.f304091u = 0;
        SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView$2");
    }
}
