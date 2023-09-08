package fu2;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.sns.p106ui.C96085n8;
import com.tencent.p014mm.plugin.sns.p106ui.listener.C96049p0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.n8$$g0;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import di3.C86312j;
import fy3.C32224a;
import gu2.C98214b;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import l31.C99333f;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C101789j00;
import z31.C102972b;

/* renamed from: fu2.t */
public final class C98027t extends C98024r {

    /* renamed from: i */
    public final C13601g f287439i = C36568h.m40985a(new C98028a(this));

    /* renamed from: j */
    public String f287440j = "";

    /* renamed from: fu2.t$a */
    public static final class C98028a extends C87413o implements C32224a<C98026s> {

        /* renamed from: d */
        public final /* synthetic */ C98027t f287441d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98028a(C98027t tVar) {
            super(0);
            this.f287441d = tVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMVClick$linkMenuListner$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMVClick$linkMenuListner$2");
            C98026s sVar = new C98026s(this.f287441d);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMVClick$linkMenuListner$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMVClick$linkMenuListner$2");
            return sVar;
        }
    }

    /* renamed from: fu2.t$b */
    public static final class C98029b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C98027t f287442d;

        /* renamed from: fu2.t$b$a */
        public static final class C98030a implements n8$$g0 {

            /* renamed from: a */
            public static final C98030a f287443a = new C98030a();

            /* renamed from: a */
            public final void mo132640a() {
                SnsMethodCalculate.markStartTimeMs("onDataChange", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMVClick$register$1$1");
                SnsMethodCalculate.markEndTimeMs("onDataChange", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMVClick$register$1$1");
            }
        }

        public C98029b(C98027t tVar) {
            this.f287442d = tVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/item/click/ImproveMVClick$register$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMVClick$register$1");
            view.setTag(this.f287442d.mo137330n());
            C96085n8.m123098f(view, 0, C98030a.f287443a);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMVClick$register$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/improve/item/click/ImproveMVClick$register$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98027t(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public void mo71269a(View view) {
        TimeLineObject G2;
        C101789j00 j002;
        Class cls = C99333f.class;
        SnsMethodCalculate.markStartTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMVClick");
        super.mo71269a(view);
        C98214b c = mo137310c();
        this.f287440j = c != null ? c.mo137504B2() : "";
        if (view != null) {
            view.setTag(mo137330n());
        }
        C96085n8.m123099g(view);
        C98214b c2 = mo137310c();
        Integer valueOf = (c2 == null || (G2 = c2.mo137509G2()) == null || (j002 = G2.ContentObj) == null) ? null : Integer.valueOf(j002.f298424e);
        if (valueOf != null && valueOf.intValue() == 42) {
            ((C99333f) C86312j.m106911c(cls)).mo138726rL(12076, "ClickMuiscPlayerFeedCount", this.f287440j);
            ((C99333f) C86312j.m106911c(cls)).um0(12076, "MusicPlayerFeedTime");
        } else {
            ((C99333f) C86312j.m106911c(cls)).mo138726rL(12076, "ClickMusicFeedCount", this.f287440j);
        }
        SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMVClick");
        C102972b.f303874a.mo142713g(12076, "ClickImageFeedCount", this.f287440j);
    }

    /* renamed from: d */
    public View.OnCreateContextMenuListener mo137311d() {
        SnsMethodCalculate.markStartTimeMs("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMVClick");
        SnsMethodCalculate.markStartTimeMs("getLinkMenuListner", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMVClick");
        C96049p0 p0Var = (C96049p0) ((C36570n) this.f287439i).getValue();
        SnsMethodCalculate.markEndTimeMs("getLinkMenuListner", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMVClick");
        SnsMethodCalculate.markEndTimeMs("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMVClick");
        return p0Var;
    }

    /* renamed from: k */
    public void mo137317k(View view, boolean z, boolean z2, boolean z3) {
        WeImageView weImageView;
        SnsMethodCalculate.markStartTimeMs("register", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMVClick");
        super.mo137317k(view, z, z2, z3);
        if (!(view == null || (weImageView = (WeImageView) view.findViewById(C0966R.C0970id.b7u)) == null)) {
            weImageView.setOnClickListener(new C98029b(this));
        }
        SnsMethodCalculate.markEndTimeMs("register", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMVClick");
    }
}
