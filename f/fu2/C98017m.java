package fu2;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.C96085n8;
import com.tencent.p014mm.plugin.sns.p106ui.listener.C96049p0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gu2.C98214b;
import gy3.C87412m;
import gy3.C87413o;
import l31.C99333f;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: fu2.m */
public final class C98017m extends C97987a {

    /* renamed from: h */
    public final C13601g f287431h;

    /* renamed from: fu2.m$a */
    public static final class C98018a extends C87413o implements C32224a<C98016l> {

        /* renamed from: d */
        public final /* synthetic */ C98017m f287432d;

        /* renamed from: e */
        public final /* synthetic */ Context f287433e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98018a(C98017m mVar, Context context) {
            super(0);
            this.f287432d = mVar;
            this.f287433e = context;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick$finderMediaMenuListener$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick$finderMediaMenuListener$2");
            C98016l lVar = new C98016l(this.f287432d, this.f287433e);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick$finderMediaMenuListener$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick$finderMediaMenuListener$2");
            return lVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98017m(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        this.f287431h = C36568h.m40985a(new C98018a(this, context));
    }

    /* renamed from: a */
    public void mo71269a(View view) {
        Class cls = C99333f.class;
        SnsMethodCalculate.markStartTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick");
        C98214b c = mo137310c();
        if (c == null) {
            SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick");
        } else if (view == null) {
            SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick");
        } else {
            Log.m105924i("MicroMsg.Improve.FinderMedia", "perform click");
            view.setTag(c.mo137509G2());
            C96085n8.m123097e(view);
            ((C99333f) C86312j.m106911c(cls)).mo138726rL(12076, "ClickFinderFeedCnt", c.mo137504B2());
            ((C99333f) C86312j.m106911c(cls)).um0(12076, "FinderFeedTime");
            SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick");
        }
    }

    /* renamed from: d */
    public View.OnCreateContextMenuListener mo137311d() {
        SnsMethodCalculate.markStartTimeMs("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick");
        SnsMethodCalculate.markStartTimeMs("getFinderMediaMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick");
        C96049p0 p0Var = (C96049p0) ((C36570n) this.f287431h).getValue();
        SnsMethodCalculate.markEndTimeMs("getFinderMediaMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick");
        SnsMethodCalculate.markEndTimeMs("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick");
        return p0Var;
    }
}
