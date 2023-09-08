package ou2;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAdBreakFrameVideoView;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C58052j1;
import fy3.C32224a;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import jp2.C98963o;
import k20.C60958c;
import k20.C9556a;
import nq2.C100151a;
import nu2.C100198b;
import p329d3.C86165a;
import up2.C102064e;

/* renamed from: ou2.e */
public final class C100478e extends C100198b {

    /* renamed from: k */
    public final int f294375k;

    /* renamed from: l */
    public final C100464b f294376l;

    /* renamed from: m */
    public C102064e f294377m;

    /* renamed from: n */
    public boolean f294378n;

    /* renamed from: ou2.e$a */
    public static final class C100479a implements C102064e.C102069c {

        /* renamed from: a */
        public final /* synthetic */ C100478e f294379a;

        public C100479a(C100478e eVar) {
            this.f294379a = eVar;
        }

        /* renamed from: a */
        public ViewGroup mo132650a() {
            SnsMethodCalculate.markStartTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness$onCreate$1");
            C100478e eVar = this.f294379a;
            SnsMethodCalculate.markStartTimeMs("access$getMWrapHolder$p$s-274574479", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
            C100151a.C100155d dVar = eVar.f293576c;
            SnsMethodCalculate.markEndTimeMs("access$getMWrapHolder$p$s-274574479", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
            ViewGroup viewGroup = null;
            KeyEvent.Callback callback = dVar != null ? dVar.f293379x : null;
            if (callback instanceof ViewGroup) {
                viewGroup = (ViewGroup) callback;
            }
            SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness$onCreate$1");
            return viewGroup;
        }

        /* renamed from: b */
        public void mo132651b() {
            SnsMethodCalculate.markStartTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness$onCreate$1");
            C100478e eVar = this.f294379a;
            SnsMethodCalculate.markStartTimeMs("access$prepareFullCardAnimation", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
            eVar.mo139500o((Bundle) null);
            SnsMethodCalculate.markEndTimeMs("access$prepareFullCardAnimation", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
            SnsMethodCalculate.markEndTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness$onCreate$1");
        }
    }

    /* renamed from: ou2.e$b */
    public static final class C100480b extends C87413o implements C32224a<C102064e> {

        /* renamed from: d */
        public final /* synthetic */ C100478e f294380d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100480b(C100478e eVar) {
            super(0);
            this.f294380d = eVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness$onCreate$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness$onCreate$2");
            C100478e eVar = this.f294380d;
            eVar.getClass();
            SnsMethodCalculate.markStartTimeMs("getAdClickActionHandler", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
            C102064e eVar2 = eVar.f294377m;
            SnsMethodCalculate.markEndTimeMs("getAdClickActionHandler", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness$onCreate$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness$onCreate$2");
            return eVar2;
        }
    }

    /* renamed from: ou2.e$c */
    public static final class C100481c<T> implements C86165a {

        /* renamed from: a */
        public final /* synthetic */ C100478e f294381a;

        public C100481c(C100478e eVar) {
            this.f294381a = eVar;
        }

        public void accept(Object obj) {
            SnsMethodCalculate.markStartTimeMs("accept", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness$onRefresh$1");
            Void voidR = (Void) obj;
            SnsMethodCalculate.markStartTimeMs("accept", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness$onRefresh$1");
            this.f294381a.mo139977p().mo139969j();
            SnsMethodCalculate.markEndTimeMs("accept", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness$onRefresh$1");
            SnsMethodCalculate.markEndTimeMs("accept", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness$onRefresh$1");
        }
    }

    public C100478e(int i) {
        this.f294375k = i;
        this.f294376l = new C100464b(i);
    }

    /* renamed from: a */
    public void mo139487a(Activity activity, C98963o oVar, TimelineClickListener timelineClickListener, C100151a.C100155d dVar, C100151a aVar) {
        C100151a.C100155d dVar2 = dVar;
        C100151a aVar2 = aVar;
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        super.mo139487a(activity, oVar, timelineClickListener, dVar, aVar);
        if (this.f293574a == null) {
            SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
            return;
        }
        if (aVar2 != null) {
            C100464b bVar = this.f294376l;
            SnsMethodCalculate.markStartTimeMs("setBreakFrameWrapperDelegate", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
            aVar2.f293335g = bVar;
            SnsMethodCalculate.markEndTimeMs("setBreakFrameWrapperDelegate", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        }
        C100464b bVar2 = this.f294376l;
        C100151a.C100155d dVar3 = this.f293576c;
        SnsInfo snsInfo = this.f293579f;
        Activity activity2 = this.f293574a;
        C98963o oVar2 = this.f293575b;
        bVar2.getClass();
        SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        if (dVar3 != null) {
            bVar2.f294312b = dVar3;
        }
        if (snsInfo != null) {
            bVar2.f294313c = snsInfo;
        }
        if (activity2 != null) {
            bVar2.f294314d = activity2;
        }
        if (oVar2 != null) {
            bVar2.f294315e = oVar2;
        }
        SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        if (dVar2.f293370o == null) {
            View inflate = ((ViewStub) dVar2.f293377v.findViewById(C0966R.C0970id.jod)).inflate();
            C87412m.m108592e(inflate, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
            dVar2.f293370o = (SnsAdBreakFrameVideoView) inflate;
        } else {
            Log.m105920e("BreakFrameAdBusiness", "buildContent many times");
        }
        if (dVar2.f293353I == null) {
            dVar2.f293353I = ((ViewStub) dVar2.f293377v.findViewById(C0966R.C0970id.o3r)).inflate();
        } else {
            Log.m105920e("BreakFrameAdBusiness", "buildContent many times");
        }
        this.f294377m = new C102064e(this.f293574a, mo139979r(), this.f293575b, (C102064e.C102068b) null, new C100479a(this));
        C100464b bVar3 = this.f294376l;
        C100480b bVar4 = new C100480b(this);
        bVar3.getClass();
        SnsMethodCalculate.markStartTimeMs("setAdClickActionHandler", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        bVar3.f294317g = bVar4;
        SnsMethodCalculate.markEndTimeMs("setAdClickActionHandler", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
    }

    /* renamed from: b */
    public void mo139488b() {
        SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        super.mo139488b();
        C100464b bVar = this.f294376l;
        bVar.getClass();
        SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        C100462a aVar = bVar.f294326p;
        if (aVar != null) {
            aVar.mo139960k(bVar.f294313c);
        }
        SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
    }

    /* renamed from: c */
    public void mo139489c() {
        SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        super.mo139489c();
        SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
    }

    /* renamed from: d */
    public void mo139490d(int i, SnsInfo snsInfo, ADXml.C95018g gVar, ViewGroup.LayoutParams layoutParams) {
        SnsMethodCalculate.markStartTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        super.mo139490d(i, snsInfo, gVar, layoutParams);
        C100151a.C100155d dVar = this.f293576c;
        if (dVar == null) {
            SnsMethodCalculate.markEndTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
            return;
        }
        C100464b bVar = this.f294376l;
        Activity activity = this.f293574a;
        C98963o oVar = this.f293575b;
        bVar.getClass();
        SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        bVar.f294312b = dVar;
        if (snsInfo != null) {
            bVar.f294313c = snsInfo;
        }
        if (activity != null) {
            bVar.f294314d = activity;
        }
        if (oVar != null) {
            bVar.f294315e = oVar;
        }
        SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        Log.m105924i("BreakFrameAdBusiness", "onRefresh called");
        C100151a.C100155d dVar2 = this.f293576c;
        ViewTreeObserver viewTreeObserver = null;
        View view = dVar2 != null ? dVar2.f293353I : null;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/fullcard/business/breakFrameCard/BreakFrameAdBusiness", "onRefresh", "(ILcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/storage/ADXml$AdFullCardInfo;Landroid/view/ViewGroup$LayoutParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/item/fullcard/business/breakFrameCard/BreakFrameAdBusiness", "onRefresh", "(ILcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/storage/ADXml$AdFullCardInfo;Landroid/view/ViewGroup$LayoutParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f294375k == 1) {
            C100151a.C100155d dVar3 = this.f293576c;
            View view3 = dVar3 != null ? dVar3.f293353I : null;
            if (view3 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/fullcard/business/breakFrameCard/BreakFrameAdBusiness", "onRefresh", "(ILcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/storage/ADXml$AdFullCardInfo;Landroid/view/ViewGroup$LayoutParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/item/fullcard/business/breakFrameCard/BreakFrameAdBusiness", "onRefresh", "(ILcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/storage/ADXml$AdFullCardInfo;Landroid/view/ViewGroup$LayoutParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        SnsAdBreakFrameVideoView snsAdBreakFrameVideoView = this.f293576c.f293370o;
        if (snsAdBreakFrameVideoView != null) {
            snsAdBreakFrameVideoView.setDetachedListener(new C100481c(this));
        }
        if (((C58052j1) this.f294376l.mo139967h()).getValue() != null) {
            ((C58052j1) this.f294376l.mo139967h()).setValue(null);
        }
        SnsMethodCalculate.markStartTimeMs("triggerReadyToMeasureViews", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        if (!this.f294378n) {
            C8478d0 d0Var = new C8478d0();
            SnsAdBreakFrameVideoView snsAdBreakFrameVideoView2 = this.f293576c.f293370o;
            if (snsAdBreakFrameVideoView2 != null) {
                viewTreeObserver = snsAdBreakFrameVideoView2.getViewTreeObserver();
            }
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnPreDrawListener(new C100482f(this, d0Var));
            }
            this.f294378n = true;
        }
        SnsMethodCalculate.markEndTimeMs("triggerReadyToMeasureViews", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        SnsMethodCalculate.markEndTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
    }

    /* renamed from: g */
    public void mo139502g(long j, int i) {
        SnsMethodCalculate.markStartTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        SnsMethodCalculate.markEndTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
    }

    /* renamed from: p */
    public final C100464b mo139977p() {
        SnsMethodCalculate.markStartTimeMs("getController", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        C100464b bVar = this.f294376l;
        SnsMethodCalculate.markEndTimeMs("getController", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        return bVar;
    }

    /* renamed from: q */
    public final View mo139978q() {
        View view;
        SnsMethodCalculate.markStartTimeMs("getShowComment", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        View view2 = null;
        if (this.f294375k == 1) {
            C100151a.C100155d dVar = this.f293576c;
            if (dVar != null) {
                view2 = dVar.f293348D;
            }
            SnsMethodCalculate.markEndTimeMs("getShowComment", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
            return view2;
        }
        C100151a.C100155d dVar2 = this.f293576c;
        if (!(dVar2 == null || (view = dVar2.f293377v) == null)) {
            view2 = view.findViewById(C0966R.C0970id.f5746nh);
        }
        SnsMethodCalculate.markEndTimeMs("getShowComment", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        return view2;
    }

    /* renamed from: r */
    public final int mo139979r() {
        SnsMethodCalculate.markStartTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        C98963o oVar = this.f293575b;
        int i = oVar != null ? oVar != null ? oVar.f290131k : 0 : 1;
        SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        return i;
    }
}
