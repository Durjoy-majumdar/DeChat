package ot2;

import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.tools.C45059m0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import rx3.C36570n;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: ot2.i */
public final class C100446i implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public final /* synthetic */ C100437h f294261d;

    /* renamed from: e */
    public final /* synthetic */ C45059m0 f294262e;

    /* renamed from: ot2.i$a */
    public static final class C100447a implements C45059m0.C45068i {

        /* renamed from: a */
        public final /* synthetic */ C100437h f294263a;

        public C100447a(C100437h hVar) {
            this.f294263a = hVar;
        }

        public void onAnimationEnd() {
            Class cls = C100448j.class;
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runEnterAni$1$1$onPreDraw$1");
            Log.m105924i("MicroMsg.SnsFakeVideoAniUIC", "ani end");
            C100437h hVar = this.f294263a;
            SnsMethodCalculate.markStartTimeMs("access$setEnterAniEnd$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
            hVar.f294243s = true;
            SnsMethodCalculate.markEndTimeMs("access$setEnterAniEnd$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
            C39818r rVar = C39818r.f106831a;
            C100448j jVar = (C100448j) rVar.mo62444c(this.f294263a.getActivity()).mo75002a(cls);
            jVar.getClass();
            SnsMethodCalculate.markStartTimeMs("getFirstFrameFinish", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
            boolean z = jVar.f294272o;
            SnsMethodCalculate.markEndTimeMs("getFirstFrameFinish", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
            if (z) {
                Log.m105924i("MicroMsg.SnsFakeVideoAniUIC", "ani end but video is finish first frame");
                C100448j jVar2 = (C100448j) rVar.mo62444c(this.f294263a.getActivity()).mo75002a(cls);
                jVar2.getClass();
                SnsMethodCalculate.markStartTimeMs("resumePlay", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
                Log.m105924i("MicroMsg.SnsFakeVideoPlayUIC", "resume play");
                jVar2.mo139938d3().setAlpha(1.0f);
                jVar2.mo139938d3().mo154761h();
                SnsMethodCalculate.markEndTimeMs("resumePlay", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
                C100437h hVar2 = this.f294263a;
                SnsMethodCalculate.markStartTimeMs("access$getThumbView", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
                ImageView j3 = hVar2.mo139926j3();
                SnsMethodCalculate.markEndTimeMs("access$getThumbView", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
                j3.setVisibility(8);
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runEnterAni$1$1$onPreDraw$1");
        }

        public void onAnimationStart() {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runEnterAni$1$1$onPreDraw$1");
            Log.m105924i("MicroMsg.SnsFakeVideoAniUIC", "ani start");
            C100448j jVar = (C100448j) C39818r.f106831a.mo62444c(this.f294263a.getActivity()).mo75002a(C100448j.class);
            jVar.getClass();
            SnsMethodCalculate.markStartTimeMs("playVideo", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
            jVar.mo139938d3().setPlayerCallback(jVar.f294273p);
            jVar.f294266f = C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C100452k(jVar, (C15601d<? super C100452k>) null), 3, (Object) null);
            SnsMethodCalculate.markEndTimeMs("playVideo", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runEnterAni$1$1$onPreDraw$1");
        }
    }

    public C100446i(C100437h hVar, C45059m0 m0Var) {
        this.f294261d = hVar;
        this.f294262e = m0Var;
    }

    public boolean onPreDraw() {
        SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runEnterAni$1$1");
        C100437h.m131463f3(this.f294261d).getViewTreeObserver().removeOnPreDrawListener(this);
        C45059m0 m0Var = this.f294262e;
        View f3 = C100437h.m131463f3(this.f294261d);
        C100437h hVar = this.f294261d;
        SnsMethodCalculate.markStartTimeMs("access$getGalleyBg", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        hVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getGalleyBg", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        Object value = ((C36570n) hVar.f294232e).getValue();
        C87412m.m108593f(value, "<get-galleyBg>(...)");
        SnsMethodCalculate.markEndTimeMs("getGalleyBg", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        SnsMethodCalculate.markEndTimeMs("access$getGalleyBg", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        m0Var.mo70408c(f3, (View) value, new C100447a(this.f294261d));
        SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runEnterAni$1$1");
        return true;
    }
}
