package mq2;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94851d1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import jp2.C98963o;
import kg3.C76577a;
import lo2.C99529d0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;
import up2.C102064e;

/* renamed from: mq2.b */
public final class C99945b {

    /* renamed from: a */
    public final ViewGroup f292854a;

    /* renamed from: b */
    public final Activity f292855b;

    /* renamed from: c */
    public final SnsInfo f292856c;

    /* renamed from: d */
    public final C98963o f292857d;

    /* renamed from: e */
    public final int f292858e;

    /* renamed from: f */
    public final C32224a<Boolean> f292859f;

    /* renamed from: g */
    public final C32224a<Boolean> f292860g;

    /* renamed from: h */
    public final C94851d1 f292861h;

    /* renamed from: i */
    public final C13601g f292862i = C36568h.m40985a(new C99953h(this));

    /* renamed from: j */
    public final C13601g f292863j = C36568h.m40985a(new C99947b(this));

    /* renamed from: k */
    public final C13601g f292864k = C36568h.m40985a(new C99952g(this));

    /* renamed from: l */
    public final C13601g f292865l = C36568h.m40985a(new C99949d(this));

    /* renamed from: m */
    public final C13601g f292866m = C36568h.m40985a(new C99950e(this));

    /* renamed from: n */
    public final C13601g f292867n = C36568h.m40985a(new C99951f(this));

    /* renamed from: o */
    public final C13601g f292868o = C36568h.m40985a(new C99948c(this));

    /* renamed from: mq2.b$a */
    public enum C99946a {
        Playing,
        Loading,
        Error,
        Pause,
        PauseAndErrorTv
    }

    /* renamed from: mq2.b$b */
    public static final class C99947b extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C99945b f292875d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99947b(C99945b bVar) {
            super(0);
            this.f292875d = bVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mErrorTv$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mErrorTv$2");
            ViewGroup f = this.f292875d.mo139298f();
            TextView textView = f != null ? (TextView) f.findViewById(C0966R.C0970id.ckr) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mErrorTv$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mErrorTv$2");
            return textView;
        }
    }

    /* renamed from: mq2.b$c */
    public static final class C99948c extends C87413o implements C32224a<List<? extends ViewGroup>> {

        /* renamed from: d */
        public final /* synthetic */ C99945b f292876d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99948c(C99945b bVar) {
            super(0);
            this.f292876d = bVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mListOfSubImages$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mListOfSubImages$2");
            ViewGroup[] viewGroupArr = new ViewGroup[3];
            ViewGroup f = this.f292876d.mo139298f();
            ViewGroup viewGroup = null;
            viewGroupArr[0] = f != null ? (ViewGroup) f.findViewById(C0966R.C0970id.npt) : null;
            ViewGroup f2 = this.f292876d.mo139298f();
            viewGroupArr[1] = f2 != null ? (ViewGroup) f2.findViewById(C0966R.C0970id.npu) : null;
            ViewGroup f3 = this.f292876d.mo139298f();
            if (f3 != null) {
                viewGroup = (ViewGroup) f3.findViewById(C0966R.C0970id.npv);
            }
            viewGroupArr[2] = viewGroup;
            List f4 = C64197v.m75537f(viewGroupArr);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mListOfSubImages$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mListOfSubImages$2");
            return f4;
        }
    }

    /* renamed from: mq2.b$d */
    public static final class C99949d extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C99945b f292877d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99949d(C99945b bVar) {
            super(0);
            this.f292877d = bVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mMainImage$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mMainImage$2");
            ViewGroup f = this.f292877d.mo139298f();
            ImageView imageView = f != null ? (ImageView) f.findViewById(C0966R.C0970id.npw) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mMainImage$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mMainImage$2");
            return imageView;
        }
    }

    /* renamed from: mq2.b$e */
    public static final class C99950e extends C87413o implements C32224a<ViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ C99945b f292878d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99950e(C99945b bVar) {
            super(0);
            this.f292878d = bVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mMainImageContainer$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mMainImageContainer$2");
            ViewGroup f = this.f292878d.mo139298f();
            ViewGroup viewGroup = f != null ? (ViewGroup) f.findViewById(C0966R.C0970id.npx) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mMainImageContainer$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mMainImageContainer$2");
            return viewGroup;
        }
    }

    /* renamed from: mq2.b$f */
    public static final class C99951f extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C99945b f292879d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99951f(C99945b bVar) {
            super(0);
            this.f292879d = bVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mMainWeAppIcon$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mMainWeAppIcon$2");
            ViewGroup f = this.f292879d.mo139298f();
            ImageView imageView = f != null ? (ImageView) f.findViewById(C0966R.C0970id.npl) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mMainWeAppIcon$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mMainWeAppIcon$2");
            return imageView;
        }
    }

    /* renamed from: mq2.b$g */
    public static final class C99952g extends C87413o implements C32224a<ViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ C99945b f292880d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99952g(C99945b bVar) {
            super(0);
            this.f292880d = bVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mVideoContainer$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mVideoContainer$2");
            ViewGroup f = this.f292880d.mo139298f();
            ViewGroup viewGroup = f != null ? (ViewGroup) f.findViewById(C0966R.C0970id.f359245nq0) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mVideoContainer$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mVideoContainer$2");
            return viewGroup;
        }
    }

    /* renamed from: mq2.b$h */
    public static final class C99953h extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C99945b f292881d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99953h(C99945b bVar) {
            super(0);
            this.f292881d = bVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mVideoStatusIV$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mVideoStatusIV$2");
            ViewGroup f = this.f292881d.mo139298f();
            ImageView imageView = f != null ? (ImageView) f.findViewById(C0966R.C0970id.k17) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mVideoStatusIV$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mVideoStatusIV$2");
            return imageView;
        }
    }

    /* renamed from: mq2.b$i */
    public static final class C99954i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f292882d;

        /* renamed from: e */
        public final /* synthetic */ TimeLineObject f292883e;

        /* renamed from: f */
        public final /* synthetic */ C99945b f292884f;

        /* renamed from: g */
        public final /* synthetic */ C102064e f292885g;

        public C99954i(String str, TimeLineObject timeLineObject, C99945b bVar, C102064e eVar) {
            this.f292882d = str;
            this.f292883e = timeLineObject;
            this.f292884f = bVar;
            this.f292885g = eVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ad/timeline/item/combinegrid/AdCombineGridCardViewLogic$updateGridUIModel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$updateGridUIModel$2");
            C99529d0 d0Var = C99529d0.f291771a;
            C87412m.m108593f(view, LocaleUtil.ITALIAN);
            String str = this.f292882d;
            TimeLineObject timeLineObject = this.f292883e;
            C99945b bVar = this.f292884f;
            bVar.getClass();
            SnsMethodCalculate.markStartTimeMs("getSnsContext", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
            C94851d1 d1Var = bVar.f292861h;
            SnsMethodCalculate.markEndTimeMs("getSnsContext", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
            C99945b bVar2 = this.f292884f;
            bVar2.getClass();
            SnsMethodCalculate.markStartTimeMs("getMActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
            Activity activity = bVar2.f292855b;
            SnsMethodCalculate.markEndTimeMs("getMActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
            C99945b bVar3 = this.f292884f;
            bVar3.getClass();
            SnsMethodCalculate.markStartTimeMs("getMSource", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
            int i = bVar3.f292858e;
            SnsMethodCalculate.markEndTimeMs("getMSource", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
            C99945b bVar4 = this.f292884f;
            bVar4.getClass();
            SnsMethodCalculate.markStartTimeMs("getMSnsAdstatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
            C98963o oVar = bVar4.f292857d;
            SnsMethodCalculate.markEndTimeMs("getMSnsAdstatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
            d0Var.mo138925a(view, str, timeLineObject, d1Var, activity, i, oVar, this.f292885g, false);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$updateGridUIModel$2");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/timeline/item/combinegrid/AdCombineGridCardViewLogic$updateGridUIModel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: mq2.b$j */
    public static final class C99955j implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f292886d;

        /* renamed from: e */
        public final /* synthetic */ TimeLineObject f292887e;

        /* renamed from: f */
        public final /* synthetic */ C99945b f292888f;

        /* renamed from: g */
        public final /* synthetic */ C102064e f292889g;

        public C99955j(String str, TimeLineObject timeLineObject, C99945b bVar, C102064e eVar) {
            this.f292886d = str;
            this.f292887e = timeLineObject;
            this.f292888f = bVar;
            this.f292889g = eVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ad/timeline/item/combinegrid/AdCombineGridCardViewLogic$updateGridUIModel$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$updateGridUIModel$4");
            C99529d0 d0Var = C99529d0.f291771a;
            C87412m.m108593f(view, LocaleUtil.ITALIAN);
            String str = this.f292886d;
            TimeLineObject timeLineObject = this.f292887e;
            C99945b bVar = this.f292888f;
            bVar.getClass();
            SnsMethodCalculate.markStartTimeMs("getSnsContext", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
            C94851d1 d1Var = bVar.f292861h;
            SnsMethodCalculate.markEndTimeMs("getSnsContext", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
            C99945b bVar2 = this.f292888f;
            bVar2.getClass();
            SnsMethodCalculate.markStartTimeMs("getMActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
            Activity activity = bVar2.f292855b;
            SnsMethodCalculate.markEndTimeMs("getMActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
            C99945b bVar3 = this.f292888f;
            bVar3.getClass();
            SnsMethodCalculate.markStartTimeMs("getMSource", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
            int i = bVar3.f292858e;
            SnsMethodCalculate.markEndTimeMs("getMSource", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
            C99945b bVar4 = this.f292888f;
            bVar4.getClass();
            SnsMethodCalculate.markStartTimeMs("getMSnsAdstatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
            C98963o oVar = bVar4.f292857d;
            SnsMethodCalculate.markEndTimeMs("getMSnsAdstatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
            d0Var.mo138925a(view, str, timeLineObject, d1Var, activity, i, oVar, this.f292889g, true);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$updateGridUIModel$4");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/timeline/item/combinegrid/AdCombineGridCardViewLogic$updateGridUIModel$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: mq2.b$k */
    public static final class C99956k implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f292890d;

        /* renamed from: e */
        public final /* synthetic */ TimeLineObject f292891e;

        /* renamed from: f */
        public final /* synthetic */ C99945b f292892f;

        /* renamed from: g */
        public final /* synthetic */ C102064e f292893g;

        public C99956k(String str, TimeLineObject timeLineObject, C99945b bVar, C102064e eVar) {
            this.f292890d = str;
            this.f292891e = timeLineObject;
            this.f292892f = bVar;
            this.f292893g = eVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ad/timeline/item/combinegrid/AdCombineGridCardViewLogic$updateGridUIModel$5$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$updateGridUIModel$5$2");
            C99529d0 d0Var = C99529d0.f291771a;
            C87412m.m108593f(view, LocaleUtil.ITALIAN);
            String str = this.f292890d;
            TimeLineObject timeLineObject = this.f292891e;
            C99945b bVar = this.f292892f;
            bVar.getClass();
            SnsMethodCalculate.markStartTimeMs("getSnsContext", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
            C94851d1 d1Var = bVar.f292861h;
            SnsMethodCalculate.markEndTimeMs("getSnsContext", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
            C99945b bVar2 = this.f292892f;
            bVar2.getClass();
            SnsMethodCalculate.markStartTimeMs("getMActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
            Activity activity = bVar2.f292855b;
            SnsMethodCalculate.markEndTimeMs("getMActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
            C99945b bVar3 = this.f292892f;
            bVar3.getClass();
            SnsMethodCalculate.markStartTimeMs("getMSource", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
            int i = bVar3.f292858e;
            SnsMethodCalculate.markEndTimeMs("getMSource", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
            C99945b bVar4 = this.f292892f;
            bVar4.getClass();
            SnsMethodCalculate.markStartTimeMs("getMSnsAdstatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
            C98963o oVar = bVar4.f292857d;
            SnsMethodCalculate.markEndTimeMs("getMSnsAdstatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
            d0Var.mo138925a(view, str, timeLineObject, d1Var, activity, i, oVar, this.f292893g, false);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$updateGridUIModel$5$2");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/timeline/item/combinegrid/AdCombineGridCardViewLogic$updateGridUIModel$5$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: mq2.b$l */
    public static final class C99957l implements C102064e.C102069c {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f292894a;

        public C99957l(ViewGroup viewGroup) {
            this.f292894a = viewGroup;
        }

        /* renamed from: a */
        public ViewGroup mo132650a() {
            SnsMethodCalculate.markStartTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$updateGridUIModel$5$adClickActionHandler$1");
            ViewGroup viewGroup = this.f292894a;
            SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$updateGridUIModel$5$adClickActionHandler$1");
            return viewGroup;
        }

        /* renamed from: b */
        public void mo132651b() {
            SnsMethodCalculate.markStartTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$updateGridUIModel$5$adClickActionHandler$1");
            SnsMethodCalculate.markEndTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$updateGridUIModel$5$adClickActionHandler$1");
        }
    }

    /* renamed from: mq2.b$m */
    public static final class C99958m implements C102064e.C102069c {

        /* renamed from: a */
        public final /* synthetic */ C99945b f292895a;

        public C99958m(C99945b bVar) {
            this.f292895a = bVar;
        }

        /* renamed from: a */
        public ViewGroup mo132650a() {
            SnsMethodCalculate.markStartTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$updateGridUIModel$adClickActionHandler$1");
            ViewGroup a = C99945b.m130583a(this.f292895a);
            SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$updateGridUIModel$adClickActionHandler$1");
            return a;
        }

        /* renamed from: b */
        public void mo132651b() {
            SnsMethodCalculate.markStartTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$updateGridUIModel$adClickActionHandler$1");
            SnsMethodCalculate.markEndTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$updateGridUIModel$adClickActionHandler$1");
        }
    }

    /* renamed from: mq2.b$n */
    public static final class C99959n implements C102064e.C102069c {

        /* renamed from: a */
        public final /* synthetic */ C99945b f292896a;

        public C99959n(C99945b bVar) {
            this.f292896a = bVar;
        }

        /* renamed from: a */
        public ViewGroup mo132650a() {
            SnsMethodCalculate.markStartTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$updateGridUIModel$adClickActionHandler$2");
            ViewGroup a = C99945b.m130583a(this.f292896a);
            SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$updateGridUIModel$adClickActionHandler$2");
            return a;
        }

        /* renamed from: b */
        public void mo132651b() {
            SnsMethodCalculate.markStartTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$updateGridUIModel$adClickActionHandler$2");
            SnsMethodCalculate.markEndTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$updateGridUIModel$adClickActionHandler$2");
        }
    }

    public C99945b(ViewGroup viewGroup, Activity activity, SnsInfo snsInfo, C98963o oVar, int i, C32224a<Boolean> aVar, C32224a<Boolean> aVar2, C94851d1 d1Var) {
        C87412m.m108594g(activity, "mActivity");
        C87412m.m108594g(aVar, "isForbidShowPlayBtn");
        C87412m.m108594g(aVar2, "isPlayingSight");
        this.f292854a = viewGroup;
        this.f292855b = activity;
        this.f292856c = snsInfo;
        this.f292857d = oVar;
        this.f292858e = i;
        this.f292859f = aVar;
        this.f292860g = aVar2;
        this.f292861h = d1Var;
    }

    /* renamed from: a */
    public static final ViewGroup m130583a(C99945b bVar) {
        SnsMethodCalculate.markStartTimeMs("access$getMMainImageContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        bVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getMMainImageContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        ViewGroup viewGroup = (ViewGroup) ((C36570n) bVar.f292866m).getValue();
        SnsMethodCalculate.markEndTimeMs("getMMainImageContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        SnsMethodCalculate.markEndTimeMs("access$getMMainImageContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        return viewGroup;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r3 = r3.ContentObj;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo139294b(com.tencent.p014mm.protocal.protobuf.TimeLineObject r3) {
        /*
            r2 = this;
            java.lang.String r0 = "getContentStyle"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            if (r3 == 0) goto L_0x0010
            te3.j00 r3 = r3.ContentObj
            if (r3 == 0) goto L_0x0010
            int r3 = r3.f298424e
            goto L_0x0011
        L_0x0010:
            r3 = 0
        L_0x0011:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: mq2.C99945b.mo139294b(com.tencent.mm.protocal.protobuf.TimeLineObject):int");
    }

    /* renamed from: c */
    public final ImageView mo139295c() {
        SnsMethodCalculate.markStartTimeMs("getMMainImage", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        ImageView imageView = (ImageView) ((C36570n) this.f292865l).getValue();
        SnsMethodCalculate.markEndTimeMs("getMMainImage", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        return imageView;
    }

    /* renamed from: d */
    public final ViewGroup mo139296d() {
        SnsMethodCalculate.markStartTimeMs("getMVideoContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        ViewGroup viewGroup = (ViewGroup) ((C36570n) this.f292864k).getValue();
        SnsMethodCalculate.markEndTimeMs("getMVideoContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        return viewGroup;
    }

    /* renamed from: e */
    public final ImageView mo139297e() {
        SnsMethodCalculate.markStartTimeMs("getMVideoStatusIV", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        ImageView imageView = (ImageView) ((C36570n) this.f292862i).getValue();
        SnsMethodCalculate.markEndTimeMs("getMVideoStatusIV", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        return imageView;
    }

    /* renamed from: f */
    public final ViewGroup mo139298f() {
        SnsMethodCalculate.markStartTimeMs("getRootContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        ViewGroup viewGroup = this.f292854a;
        SnsMethodCalculate.markEndTimeMs("getRootContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        return viewGroup;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0126, code lost:
        if (mo139294b(r11) == 15) goto L_0x012f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02d7  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo139299g(os2.C100403f r35, java.lang.Integer r36, com.tencent.p014mm.plugin.sns.storage.SnsInfo r37, te3.C101804kv2 r38, com.tencent.p014mm.protocal.protobuf.TimeLineObject r39, java.lang.String r40) {
        /*
            r34 = this;
            r0 = r34
            r10 = r37
            r7 = r38
            r11 = r39
            r12 = r40
            java.lang.String r13 = "updateGridUIModel"
            java.lang.String r14 = "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r14)
            java.lang.String r1 = "adCombinedGridInfo"
            r15 = r35
            gy3.C87412m.m108594g(r15, r1)
            java.lang.String r1 = "snsInfo"
            gy3.C87412m.m108594g(r10, r1)
            java.lang.String r1 = "tlObj"
            gy3.C87412m.m108594g(r11, r1)
            java.lang.String r8 = "AdCombineGridCardViewLogic"
            if (r7 != 0) goto L_0x0033
            java.lang.String r1 = "media is null!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r14)
            return
        L_0x0033:
            java.lang.String r1 = r11.f283893Id
            if (r1 != 0) goto L_0x0039
            java.lang.String r1 = ""
        L_0x0039:
            r9 = r1
            com.tencent.mm.plugin.sns.model.o r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            android.widget.ImageView r3 = r34.mo139295c()
            r4 = -1
            android.app.Activity r2 = r0.f292855b
            int r5 = r2.hashCode()
            com.tencent.mm.storage.o3 r6 = com.tencent.p014mm.storage.C96983o3.m124651c()
            int r2 = r11.CreateTime
            r6.f284145b = r2
            r2 = r38
            r1.mo131114e0(r2, r3, r4, r5, r6)
            android.widget.ImageView r1 = r34.mo139295c()
            if (r1 != 0) goto L_0x005d
            goto L_0x0060
        L_0x005d:
            r1.setTag(r9)
        L_0x0060:
            android.widget.ImageView r1 = r34.mo139295c()
            r9 = 1
            rq2.C101432s.m133132n(r1, r9)
            java.lang.String r1 = "getMMainWeAppIcon"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r14)
            rx3.g r2 = r0.f292867n
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r14)
            r6 = 8
            if (r2 != 0) goto L_0x007f
            goto L_0x0082
        L_0x007f:
            r2.setVisibility(r6)
        L_0x0082:
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r2 = r35.mo139843a()
            boolean r2 = r2.mo130140a()
            r5 = 0
            if (r2 == 0) goto L_0x00a3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r14)
            rx3.g r2 = r0.f292867n
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r14)
            if (r2 != 0) goto L_0x00a0
            goto L_0x00a3
        L_0x00a0:
            r2.setVisibility(r5)
        L_0x00a3:
            int r1 = r0.mo139294b(r11)
            r2 = 11
            if (r1 != r9) goto L_0x0118
            android.view.ViewGroup r1 = r34.mo139296d()
            if (r1 != 0) goto L_0x00b2
            goto L_0x00b5
        L_0x00b2:
            r1.setVisibility(r6)
        L_0x00b5:
            up2.e r8 = new up2.e
            android.app.Activity r1 = r0.f292855b
            int r7 = r0.f292858e
            jp2.o r3 = r0.f292857d
            r20 = 0
            mq2.b$m r4 = new mq2.b$m
            r4.<init>(r0)
            r16 = r8
            r17 = r1
            r18 = r7
            r19 = r3
            r21 = r4
            r16.<init>(r17, r18, r19, r20, r21)
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r3 = r35.mo139843a()
            r3.f273639a = r2
            r4 = 0
            r7 = 0
            r16 = 1
            r17 = 2
            r18 = 12
            r19 = 0
            up2.c r2 = new up2.c
            r1 = r2
            r23 = r2
            r2 = r3
            r3 = r37
            r5 = r7
            r7 = 8
            r6 = r16
            r7 = r17
            r24 = r8
            r8 = r18
            r15 = 1
            r9 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = r23
            r1 = r24
            r1.mo141561j(r2)
            android.widget.ImageView r2 = r34.mo139295c()
            if (r2 == 0) goto L_0x010f
            mq2.b$i r3 = new mq2.b$i
            r3.<init>(r12, r11, r0, r1)
            r2.setOnClickListener(r3)
        L_0x010f:
            mq2.b$a r1 = mq2.C99945b.C99946a.Playing
            r0.mo139300h(r1)
            r6 = 15
            r9 = 5
            goto L_0x0129
        L_0x0118:
            r15 = 1
            int r1 = r0.mo139294b(r11)
            r9 = 5
            if (r1 == r9) goto L_0x012d
            int r1 = r0.mo139294b(r11)
            r6 = 15
            if (r1 != r6) goto L_0x0129
            goto L_0x012f
        L_0x0129:
            r9 = r12
            r15 = 5
            goto L_0x02c4
        L_0x012d:
            r6 = 15
        L_0x012f:
            android.view.ViewGroup r1 = r34.mo139296d()
            r5 = 0
            if (r1 != 0) goto L_0x0137
            goto L_0x013a
        L_0x0137:
            r1.setVisibility(r5)
        L_0x013a:
            com.tencent.mm.plugin.sns.storage.SnsInfo r1 = r0.f292856c
            lo2.C99556n.m129940c(r1, r7)
            com.tencent.mm.plugin.sns.storage.SnsInfo r1 = r0.f292856c
            if (r1 == 0) goto L_0x0146
            long r3 = r1.field_snsId
            goto L_0x0148
        L_0x0146:
            r3 = 0
        L_0x0148:
            java.lang.String r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()
            java.lang.String r6 = r7.f298689d
            java.lang.String r1 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r1, r6)
            java.lang.String r6 = "getMediaFilePath(SnsCore…etAccSnsPath(), media.Id)"
            gy3.C87412m.m108593f(r1, r6)
            java.lang.String r6 = vr2.C102236a0.m134725T(r38)
            java.lang.String r2 = "getSnsSightName(media)"
            gy3.C87412m.m108593f(r6, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r6)
            java.lang.String r1 = r2.toString()
            float r2 = r7.f298684R
            int r2 = (int) r2
            com.tencent.mm.plugin.sns.model.o r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            long r16 = java.lang.System.nanoTime()
            boolean r6 = r6.mo131141x(r7)
            long r18 = java.lang.System.nanoTime()
            long r9 = r18 - r16
            java.lang.String r5 = "getPlayModel"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r14)
            com.tencent.mm.plugin.sns.model.o r15 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            if (r6 != 0) goto L_0x01d5
            boolean r6 = r15.mo131140w(r7)
            if (r6 == 0) goto L_0x019f
            mq2.b$a r6 = mq2.C99945b.C99946a.Loading
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r14)
            r11 = r9
            r10 = r37
            goto L_0x0224
        L_0x019f:
            r11 = r9
            r10 = r37
            int r6 = r15.mo131133p(r10)
            r9 = 5
            if (r6 != r9) goto L_0x01b3
            r15.mo131097Q(r7)
            mq2.b$a r6 = mq2.C99945b.C99946a.Loading
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r14)
            goto L_0x0224
        L_0x01b3:
            boolean r6 = r15.mo131137t(r7)
            if (r6 == 0) goto L_0x01bf
            mq2.b$a r6 = mq2.C99945b.C99946a.Error
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r14)
            goto L_0x0224
        L_0x01bf:
            r15.mo131098R(r7)
            int r6 = r15.mo131133p(r10)
            r7 = 4
            if (r6 != r7) goto L_0x01cf
            mq2.b$a r6 = mq2.C99945b.C99946a.PauseAndErrorTv
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r14)
            goto L_0x0224
        L_0x01cf:
            mq2.b$a r6 = mq2.C99945b.C99946a.Pause
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r14)
            goto L_0x0224
        L_0x01d5:
            r11 = r9
            r10 = r37
            boolean r6 = r15.mo131143z(r7)
            if (r6 == 0) goto L_0x01e4
            mq2.b$a r6 = mq2.C99945b.C99946a.Pause
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r14)
            goto L_0x0224
        L_0x01e4:
            boolean r6 = r15.mo131139v(r7)
            if (r6 == 0) goto L_0x01f0
            mq2.b$a r6 = mq2.C99945b.C99946a.Playing
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r14)
            goto L_0x0224
        L_0x01f0:
            int r6 = r15.mo131133p(r10)
            r9 = 5
            if (r6 > r9) goto L_0x021c
            fy3.a<java.lang.Boolean> r6 = r0.f292859f
            java.lang.Object r6 = r6.invoke()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x0216
            fy3.a<java.lang.Boolean> r6 = r0.f292860g
            java.lang.Object r6 = r6.invoke()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x0216
            mq2.b$a r6 = mq2.C99945b.C99946a.Pause
            goto L_0x0218
        L_0x0216:
            mq2.b$a r6 = mq2.C99945b.C99946a.Playing
        L_0x0218:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r14)
            goto L_0x0224
        L_0x021c:
            r15.mo131098R(r7)
            mq2.b$a r6 = mq2.C99945b.C99946a.Pause
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r14)
        L_0x0224:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "media videoDuration="
            r5.append(r7)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            if (r1 == 0) goto L_0x024c
            jp2.o r1 = r0.f292857d
            if (r1 == 0) goto L_0x0247
            r5 = 1
            r1.mo138292G(r3, r2, r5)
        L_0x0247:
            lo2.C99556n.m129942e()
            r5 = 0
            goto L_0x0254
        L_0x024c:
            jp2.o r1 = r0.f292857d
            r5 = 0
            if (r1 == 0) goto L_0x0254
            r1.mo138292G(r3, r2, r5)
        L_0x0254:
            com.tencent.mm.plugin.sns.model.o r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r0.f292856c
            int r1 = r1.mo131133p(r2)
            r9 = 5
            if (r1 != r9) goto L_0x0263
            r1 = 1
            goto L_0x0264
        L_0x0263:
            r1 = 0
        L_0x0264:
            jp2.o r2 = r0.f292857d
            r11 = 1
            if (r2 == 0) goto L_0x026c
            r2.mo138290E(r3, r1, r11)
        L_0x026c:
            r0.mo139300h(r6)
            up2.e r12 = new up2.e
            android.app.Activity r1 = r0.f292855b
            int r2 = r0.f292858e
            jp2.o r3 = r0.f292857d
            r19 = 0
            mq2.b$n r4 = new mq2.b$n
            r4.<init>(r0)
            r15 = r12
            r16 = r1
            r17 = r2
            r18 = r3
            r20 = r4
            r15.<init>(r16, r17, r18, r19, r20)
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r2 = r35.mo139843a()
            r1 = 11
            r2.f273639a = r1
            r4 = 0
            r6 = 0
            r7 = 1
            r8 = 1
            r15 = 12
            r16 = 0
            up2.c r3 = new up2.c
            r1 = r3
            r11 = r3
            r3 = r37
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r15
            r15 = 5
            r9 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r12.mo141561j(r11)
            android.view.ViewGroup r1 = r34.mo139296d()
            if (r1 == 0) goto L_0x02c0
            mq2.b$j r2 = new mq2.b$j
            r11 = r39
            r9 = r40
            r2.<init>(r9, r11, r0, r12)
            r1.setOnClickListener(r2)
            goto L_0x02c4
        L_0x02c0:
            r11 = r39
            r9 = r40
        L_0x02c4:
            int r1 = r0.mo139294b(r11)
            if (r1 == r15) goto L_0x02d7
            int r1 = r0.mo139294b(r11)
            r2 = 15
            if (r1 != r2) goto L_0x02d3
            goto L_0x02d7
        L_0x02d3:
            r1 = 2
            r17 = 2
            goto L_0x02d9
        L_0x02d7:
            r17 = 1
        L_0x02d9:
            java.lang.String r1 = "getMListOfSubImages"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r14)
            rx3.g r2 = r0.f292868o
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r14)
            java.util.Iterator r12 = r2.iterator()
            r4 = 0
        L_0x02f0:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x03f7
            java.lang.Object r1 = r12.next()
            int r15 = r4 + 1
            if (r4 < 0) goto L_0x03f2
            r8 = r1
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            java.util.List r1 = r35.mo139844b()
            if (r8 == 0) goto L_0x03e7
            int r2 = r1.size()
            if (r2 <= r4) goto L_0x03e7
            r2 = 2131313891(0x7f0944e3, float:1.8246192E38)
            android.view.View r2 = r8.findViewById(r2)
            r20 = r2
            android.widget.ImageView r20 = (android.widget.ImageView) r20
            if (r20 != 0) goto L_0x031c
            goto L_0x03e7
        L_0x031c:
            com.tencent.mm.plugin.sns.model.o r18 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            java.lang.Object r2 = r1.get(r4)
            os2.o r2 = (os2.C100414o) r2
            r2.getClass()
            java.lang.String r3 = "getMedia"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.storage.GridItemInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
            te3.kv2 r2 = r2.f294174a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
            r21 = -1
            android.app.Activity r3 = r0.f292855b
            int r22 = r3.hashCode()
            com.tencent.mm.storage.o3 r3 = com.tencent.p014mm.storage.C96983o3.m124651c()
            int r6 = r11.CreateTime
            r3.f284145b = r6
            r19 = r2
            r23 = r3
            r18.mo131114e0(r19, r20, r21, r22, r23)
            up2.e r7 = new up2.e
            android.app.Activity r2 = r0.f292855b
            int r3 = r0.f292858e
            jp2.o r6 = r0.f292857d
            r29 = 0
            mq2.b$l r9 = new mq2.b$l
            r9.<init>(r8)
            r25 = r7
            r26 = r2
            r27 = r3
            r28 = r6
            r30 = r9
            r25.<init>(r26, r27, r28, r29, r30)
            r2 = 2131313752(0x7f094458, float:1.824591E38)
            android.view.View r2 = r8.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            if (r2 != 0) goto L_0x0376
            r9 = 8
            goto L_0x037b
        L_0x0376:
            r9 = 8
            r2.setVisibility(r9)
        L_0x037b:
            java.lang.Object r3 = r1.get(r4)
            os2.o r3 = (os2.C100414o) r3
            r3.getClass()
            java.lang.String r6 = "getClickActionInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r5)
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r3 = r3.f294175b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r5)
            boolean r3 = r3.mo130140a()
            if (r3 == 0) goto L_0x039c
            if (r2 != 0) goto L_0x0397
            goto L_0x039c
        L_0x0397:
            r3 = 0
            r2.setVisibility(r3)
            goto L_0x039d
        L_0x039c:
            r3 = 0
        L_0x039d:
            java.lang.Object r1 = r1.get(r4)
            os2.o r1 = (os2.C100414o) r1
            r1.getClass()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r5)
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r2 = r1.f294175b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r5)
            r1 = 12
            r2.f273639a = r1
            up2.c r6 = new up2.c
            r5 = 0
            r16 = 1
            r18 = 8
            r19 = 0
            r1 = r6
            r20 = 0
            r3 = r37
            r31 = r6
            r6 = r16
            r32 = r7
            r7 = r17
            r33 = r8
            r8 = r18
            r10 = r40
            r16 = 8
            r9 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = r31
            r1 = r32
            r1.mo141561j(r2)
            mq2.b$k r2 = new mq2.b$k
            r2.<init>(r10, r11, r0, r1)
            r1 = r33
            r1.setOnClickListener(r2)
            goto L_0x03ec
        L_0x03e7:
            r10 = r9
            r16 = 8
            r20 = 0
        L_0x03ec:
            r9 = r10
            r4 = r15
            r10 = r37
            goto L_0x02f0
        L_0x03f2:
            sx3.C64197v.m75542k()
            r1 = 0
            throw r1
        L_0x03f7:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mq2.C99945b.mo139299g(os2.f, java.lang.Integer, com.tencent.mm.plugin.sns.storage.SnsInfo, te3.kv2, com.tencent.mm.protocal.protobuf.TimeLineObject, java.lang.String):void");
    }

    /* renamed from: h */
    public final void mo139300h(C99946a aVar) {
        SnsMethodCalculate.markStartTimeMs("updateVideoUIModel", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        C87412m.m108594g(aVar, "playModel");
        SnsMethodCalculate.markStartTimeMs("getMErrorTv", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        TextView textView = (TextView) ((C36570n) this.f292863j).getValue();
        SnsMethodCalculate.markEndTimeMs("getMErrorTv", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        if (textView != null) {
            textView.setVisibility(8);
        }
        ImageView e = mo139297e();
        if (e != null) {
            e.setVisibility(8);
        }
        ImageView e2 = mo139297e();
        if (e2 != null) {
            e2.setContentDescription(this.f292855b.getString(C0966R.string.f361136hk0));
        }
        int ordinal = aVar.ordinal();
        if (ordinal == 2) {
            ImageView e3 = mo139297e();
            if (e3 != null) {
                e3.setImageResource(C0966R.raw.shortvideo_play_icon_err);
            }
            ImageView e4 = mo139297e();
            if (e4 != null) {
                e4.setVisibility(0);
            }
        } else if (ordinal == 3) {
            ImageView e5 = mo139297e();
            if (e5 != null) {
                e5.setImageDrawable(C76577a.m92158i(this.f292855b, C0966R.raw.shortvideo_play_btn));
            }
            ImageView e6 = mo139297e();
            if (e6 != null) {
                e6.setVisibility(0);
            }
        } else if (ordinal == 4) {
            ImageView e7 = mo139297e();
            if (e7 != null) {
                e7.setImageDrawable(C76577a.m92158i(this.f292855b, C0966R.raw.shortvideo_play_btn));
            }
            ImageView e8 = mo139297e();
            if (e8 != null) {
                e8.setVisibility(0);
            }
            SnsMethodCalculate.markStartTimeMs("getMErrorTv", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
            TextView textView2 = (TextView) ((C36570n) this.f292863j).getValue();
            SnsMethodCalculate.markEndTimeMs("getMErrorTv", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        }
        SnsMethodCalculate.markEndTimeMs("updateVideoUIModel", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
    }
}
