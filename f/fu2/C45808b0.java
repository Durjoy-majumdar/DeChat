package fu2;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import au2.C39636a;
import com.tencent.p014mm.plugin.sns.p106ui.C43162z1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32224a;
import gu2.C98214b;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import vr2.C52988j;

/* renamed from: fu2.b0 */
public final class C45808b0 extends C97987a {

    /* renamed from: h */
    public final C13601g f123710h = C36568h.m40985a(new C45810b(this));

    /* renamed from: i */
    public final C13601g f123711i;

    /* renamed from: fu2.b0$a */
    public static final class C45809a extends C87413o implements C32224a<C43162z1> {

        /* renamed from: d */
        public final /* synthetic */ Context f123712d;

        /* renamed from: e */
        public final /* synthetic */ C45808b0 f123713e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45809a(Context context, C45808b0 b0Var) {
            super(0);
            this.f123712d = context;
            this.f123713e = b0Var;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick$openIMUnlikeHelper$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick$openIMUnlikeHelper$2");
            Context context = this.f123712d;
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            View decorView = ((Activity) context).getWindow().getDecorView();
            C87412m.m108593f(decorView, "context as Activity).window.decorView");
            Context context2 = this.f123712d;
            C45808b0 b0Var = this.f123713e;
            SnsMethodCalculate.markStartTimeMs("access$getOpenimTagUnlikeClickListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick");
            b0Var.getClass();
            SnsMethodCalculate.markStartTimeMs("getOpenimTagUnlikeClickListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick");
            SnsMethodCalculate.markEndTimeMs("getOpenimTagUnlikeClickListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick");
            SnsMethodCalculate.markEndTimeMs("access$getOpenimTagUnlikeClickListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick");
            C43162z1 z1Var = new C43162z1(context2, (View.OnClickListener) ((C36570n) b0Var.f123710h).getValue(), (FrameLayout) decorView, (View) null);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick$openIMUnlikeHelper$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick$openIMUnlikeHelper$2");
            return z1Var;
        }
    }

    /* renamed from: fu2.b0$b */
    public static final class C45810b extends C87413o implements C32224a<View.OnClickListener> {

        /* renamed from: d */
        public final /* synthetic */ C45808b0 f123714d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45810b(C45808b0 b0Var) {
            super(0);
            this.f123714d = b0Var;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick$openimTagUnlikeClickListener$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick$openimTagUnlikeClickListener$2");
            C97997c0 c0Var = new C97997c0(this.f123714d);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick$openimTagUnlikeClickListener$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick$openimTagUnlikeClickListener$2");
            return c0Var;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45808b0(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        this.f123711i = C36568h.m40985a(new C45809a(context, this));
    }

    /* renamed from: a */
    public void mo71269a(View view) {
        C43162z1 z1Var;
        SnsMethodCalculate.markStartTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick");
        C98214b c = mo137310c();
        if (c == null) {
            SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick");
        } else if (view == null) {
            SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick");
        } else {
            view.setTag(new C52988j(view, c.mo137503A2()));
            C43162z1 n = mo71270n();
            n.getClass();
            SnsMethodCalculate.markStartTimeMs("setIsFullScreen", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
            n.f116772h = true;
            SnsMethodCalculate.markEndTimeMs("setIsFullScreen", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
            mo71270n().mo67389b(view, false, false);
            C43162z1 n2 = mo71270n();
            SnsMethodCalculate.markStartTimeMs("setOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveGlobalInstance");
            if (!C87412m.m108589b(C39636a.f106397a, n2) && (z1Var = C39636a.f106397a) != null) {
                z1Var.mo67390c();
            }
            C39636a.f106397a = n2;
            SnsMethodCalculate.markEndTimeMs("setOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveGlobalInstance");
            SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick");
        }
    }

    /* renamed from: n */
    public final C43162z1 mo71270n() {
        SnsMethodCalculate.markStartTimeMs("getOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick");
        C43162z1 z1Var = (C43162z1) ((C36570n) this.f123711i).getValue();
        SnsMethodCalculate.markEndTimeMs("getOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick");
        return z1Var;
    }
}
