package fu2;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.listener.C96049p0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: fu2.x */
public final class C98036x extends C98024r {

    /* renamed from: i */
    public final C13601g f287448i = C36568h.m40985a(new C98037a(this));

    /* renamed from: fu2.x$a */
    public static final class C98037a extends C87413o implements C32224a<C98035w> {

        /* renamed from: d */
        public final /* synthetic */ C98036x f287449d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98037a(C98036x xVar) {
            super(0);
            this.f287449d = xVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveOtherClick$linkMenuListner$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveOtherClick$linkMenuListner$2");
            C98035w wVar = new C98035w(this.f287449d);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveOtherClick$linkMenuListner$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveOtherClick$linkMenuListner$2");
            return wVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98036x(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: d */
    public View.OnCreateContextMenuListener mo137311d() {
        SnsMethodCalculate.markStartTimeMs("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveOtherClick");
        SnsMethodCalculate.markStartTimeMs("getLinkMenuListner", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveOtherClick");
        C96049p0 p0Var = (C96049p0) ((C36570n) this.f287448i).getValue();
        SnsMethodCalculate.markEndTimeMs("getLinkMenuListner", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveOtherClick");
        SnsMethodCalculate.markEndTimeMs("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveOtherClick");
        return p0Var;
    }
}
