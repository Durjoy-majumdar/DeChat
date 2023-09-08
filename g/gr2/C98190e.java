package gr2;

import android.animation.Animator;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.LinkedList;
import sq2.C13774c;

/* renamed from: gr2.e */
public class C98190e extends C13774c {

    /* renamed from: d */
    public final /* synthetic */ View f287884d;

    /* renamed from: e */
    public final /* synthetic */ C98191f f287885e;

    public C98190e(C98191f fVar, View view) {
        this.f287885e = fVar;
        this.f287884d = view;
    }

    public void onAnimationEnd(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator$1");
        C98191f fVar = this.f287885e;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        LinkedList<View> linkedList = fVar.f287890b;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        linkedList.remove(this.f287884d);
        C98191f fVar2 = this.f287885e;
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        LinkedList<View> linkedList2 = fVar2.f287891c;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        linkedList2.offerFirst(this.f287884d);
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator$1");
    }
}
