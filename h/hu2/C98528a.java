package hu2;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kg3.C76577a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import ut2.C102101q;
import ut2.C102104r;
import wx3.C15601d;

/* renamed from: hu2.a */
public abstract class C98528a {

    /* renamed from: d */
    public final C102101q f288937d;

    /* renamed from: e */
    public final C13601g f288938e = C36568h.m40985a(new C98530b(this));

    /* renamed from: hu2.a$a */
    public static final class C98529a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C98528a f288939d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98529a(C98528a aVar) {
            super(0);
            this.f288939d = aVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport$actionBarHeight$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport$actionBarHeight$2");
            Integer valueOf = Integer.valueOf(C76577a.m92157h(C98528a.m128012a(this.f288939d), C0966R.dimen.f3679b9));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport$actionBarHeight$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport$actionBarHeight$2");
            return valueOf;
        }
    }

    /* renamed from: hu2.a$b */
    public static final class C98530b extends C87413o implements C32224a<AppCompatActivity> {

        /* renamed from: d */
        public final /* synthetic */ C98528a f288940d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98530b(C98528a aVar) {
            super(0);
            this.f288940d = aVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport$context$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport$context$2");
            C98528a aVar = this.f288940d;
            aVar.getClass();
            SnsMethodCalculate.markStartTimeMs("getUic", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
            C102101q qVar = aVar.f288937d;
            SnsMethodCalculate.markEndTimeMs("getUic", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
            AppCompatActivity activity = qVar.getActivity();
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport$context$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport$context$2");
            return activity;
        }
    }

    /* renamed from: hu2.a$c */
    public static final class C98531c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C98528a f288941d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98531c(C98528a aVar) {
            super(0);
            this.f288941d = aVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport$navigationBarHeight$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport$navigationBarHeight$2");
            Integer valueOf = Integer.valueOf(C75044y4.m89991c(C98528a.m128012a(this.f288941d)));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport$navigationBarHeight$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport$navigationBarHeight$2");
            return valueOf;
        }
    }

    /* renamed from: hu2.a$d */
    public static final class C98532d extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C98528a f288942d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98532d(C98528a aVar) {
            super(0);
            this.f288942d = aVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport$screenHeight$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport$screenHeight$2");
            Integer valueOf = Integer.valueOf(C75044y4.m89990b(C98528a.m128012a(this.f288942d)).y);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport$screenHeight$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport$screenHeight$2");
            return valueOf;
        }
    }

    /* renamed from: hu2.a$e */
    public static final class C98533e extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C98528a f288943d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98533e(C98528a aVar) {
            super(0);
            this.f288943d = aVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport$statusBarHeight$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport$statusBarHeight$2");
            Integer valueOf = Integer.valueOf(C75044y4.m89994f(C98528a.m128012a(this.f288943d)));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport$statusBarHeight$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport$statusBarHeight$2");
            return valueOf;
        }
    }

    public C98528a(C102101q qVar) {
        C87412m.m108594g(qVar, "uic");
        this.f288937d = qVar;
        C36568h.m40985a(new C98532d(this));
        C36568h.m40985a(new C98531c(this));
        C36568h.m40985a(new C98533e(this));
        C36568h.m40985a(new C98529a(this));
    }

    /* renamed from: a */
    public static final Context m128012a(C98528a aVar) {
        SnsMethodCalculate.markStartTimeMs("access$getContext", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        aVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        Context context = (Context) ((C36570n) aVar.f288938e).getValue();
        SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        SnsMethodCalculate.markEndTimeMs("access$getContext", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        return context;
    }

    /* renamed from: b */
    public void mo137885b(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
    }

    /* renamed from: c */
    public void mo137886c() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
    }

    /* renamed from: d */
    public void mo137887d() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
    }

    /* renamed from: e */
    public void mo137888e() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
    }

    /* renamed from: f */
    public Object mo137889f(RecyclerView recyclerView, C102104r rVar, int i, C15601d<? super C13598b0> dVar) {
        SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        SnsMethodCalculate.markStartTimeMs("onScrollStateChanged$suspendImpl", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("onScrollStateChanged$suspendImpl", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        return b0Var;
    }
}
