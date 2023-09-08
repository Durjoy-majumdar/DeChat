package fu2;

import android.app.Activity;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.plugin.sns.model.C94895m2;
import com.tencent.p014mm.plugin.sns.p106ui.listener.C96014c;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32224a;
import gu2.C98214b;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import nj3.C11184p0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import uo3.C78253a;

/* renamed from: fu2.a */
public abstract class C97987a {

    /* renamed from: a */
    public Context f287380a;

    /* renamed from: b */
    public View f287381b;

    /* renamed from: c */
    public C98214b f287382c;

    /* renamed from: d */
    public C60905o f287383d;

    /* renamed from: e */
    public final C13601g f287384e = C36568h.m40985a(new C97989b(this));

    /* renamed from: f */
    public boolean f287385f;

    /* renamed from: g */
    public final C13601g f287386g = C36568h.m40985a(new C97988a(this));

    /* renamed from: fu2.a$a */
    public static final class C97988a extends C87413o implements C32224a<C96014c> {

        /* renamed from: d */
        public final /* synthetic */ C97987a f287387d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97988a(C97987a aVar) {
            super(0);
            this.f287387d = aVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick$onMenuItemSelectedListener$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick$onMenuItemSelectedListener$2");
            C94895m2 m2Var = new C94895m2(1);
            Context b = this.f287387d.mo137309b();
            C87412m.m108592e(b, "null cannot be cast to non-null type android.app.Activity");
            C96014c cVar = new C96014c((Activity) b, 0, m2Var);
            cVar.mo133553a();
            C97987a aVar = this.f287387d;
            SnsMethodCalculate.markStartTimeMs("access$setHadInitListener$p", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
            aVar.f287385f = true;
            SnsMethodCalculate.markEndTimeMs("access$setHadInitListener$p", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick$onMenuItemSelectedListener$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick$onMenuItemSelectedListener$2");
            return cVar;
        }
    }

    /* renamed from: fu2.a$b */
    public static final class C97989b extends C87413o implements C32224a<C78253a> {

        /* renamed from: d */
        public final /* synthetic */ C97987a f287388d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97989b(C97987a aVar) {
            super(0);
            this.f287388d = aVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick$popupMenu$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick$popupMenu$2");
            C78253a aVar = new C78253a(this.f287388d.mo137309b());
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick$popupMenu$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick$popupMenu$2");
            return aVar;
        }
    }

    /* renamed from: fu2.a$c */
    public static final class C97990c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C97987a f287389d;

        /* renamed from: e */
        public final /* synthetic */ View f287390e;

        public C97990c(C97987a aVar, View view) {
            this.f287389d = aVar;
            this.f287390e = view;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/item/click/BaseImproveClick$register$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick$register$1");
            this.f287389d.mo71269a(this.f287390e);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick$register$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/improve/item/click/BaseImproveClick$register$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: fu2.a$d */
    public static final class C97991d implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C97987a f287391d;

        public C97991d(C97987a aVar) {
            this.f287391d = aVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick$register$2");
            C87412m.m108594g(menuItem, "menuItem");
            if (!this.f287391d.mo137315i(menuItem, i)) {
                this.f287391d.mo137312e().onMMMenuItemSelected(menuItem, i);
            }
            SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick$register$2");
        }
    }

    /* renamed from: fu2.a$e */
    public static final class C97992e implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C97987a f287392d;

        public C97992e(C97987a aVar) {
            this.f287392d = aVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick$register$3");
            C87412m.m108594g(menuItem, "menuItem");
            if (!this.f287392d.mo137315i(menuItem, i)) {
                this.f287392d.mo137312e().onMMMenuItemSelected(menuItem, i);
            }
            SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick$register$3");
        }
    }

    public C97987a(Context context) {
        C87412m.m108594g(context, "context");
        this.f287380a = context;
    }

    /* renamed from: g */
    public static final String m126563g() {
        SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick$Companion");
        SnsMethodCalculate.markStartTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        SnsMethodCalculate.markEndTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick$Companion");
        SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        return "MicroMsg.Improve.Click";
    }

    /* renamed from: l */
    public static /* synthetic */ void m126564l(C97987a aVar, View view, boolean z, boolean z2, boolean z3, int i, Object obj) {
        SnsMethodCalculate.markStartTimeMs("register$default", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            if ((i & 8) != 0) {
                z3 = true;
            }
            aVar.mo137317k(view, z, z2, z3);
            SnsMethodCalculate.markEndTimeMs("register$default", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        SnsMethodCalculate.markEndTimeMs("register$default", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        throw unsupportedOperationException;
    }

    /* renamed from: a */
    public void mo71269a(View view) {
        SnsMethodCalculate.markStartTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
    }

    /* renamed from: b */
    public final Context mo137309b() {
        SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        Context context = this.f287380a;
        SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        return context;
    }

    /* renamed from: c */
    public final C98214b mo137310c() {
        SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        C98214b bVar = this.f287382c;
        SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        return bVar;
    }

    /* renamed from: d */
    public View.OnCreateContextMenuListener mo137311d() {
        SnsMethodCalculate.markStartTimeMs("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        SnsMethodCalculate.markEndTimeMs("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        return null;
    }

    /* renamed from: e */
    public final C96014c mo137312e() {
        SnsMethodCalculate.markStartTimeMs("getOnMenuItemSelectedListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        C96014c cVar = (C96014c) ((C36570n) this.f287386g).getValue();
        SnsMethodCalculate.markEndTimeMs("getOnMenuItemSelectedListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        return cVar;
    }

    /* renamed from: f */
    public final C78253a mo137313f() {
        SnsMethodCalculate.markStartTimeMs("getPopupMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        C78253a aVar = (C78253a) ((C36570n) this.f287384e).getValue();
        SnsMethodCalculate.markEndTimeMs("getPopupMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        return aVar;
    }

    /* renamed from: h */
    public final View mo137314h() {
        SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        View view = this.f287381b;
        SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        return view;
    }

    /* renamed from: i */
    public boolean mo137315i(MenuItem menuItem, int i) {
        SnsMethodCalculate.markStartTimeMs("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        C87412m.m108594g(menuItem, "menuItem");
        SnsMethodCalculate.markEndTimeMs("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        return false;
    }

    /* renamed from: j */
    public final int mo137316j() {
        SnsMethodCalculate.markStartTimeMs("position", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        C60905o oVar = this.f287383d;
        int j = oVar != null ? oVar.mo17363j() : -1;
        SnsMethodCalculate.markEndTimeMs("position", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        return j;
    }

    /* renamed from: k */
    public void mo137317k(View view, boolean z, boolean z2, boolean z3) {
        SnsMethodCalculate.markStartTimeMs("register", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        if (view == null) {
            SnsMethodCalculate.markEndTimeMs("register", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
            return;
        }
        this.f287381b = view;
        if (z) {
            view.setOnClickListener(new C97990c(this, view));
        }
        if (z2) {
            if (z3) {
                C78253a f = mo137313f();
                View.OnCreateContextMenuListener d = mo137311d();
                if (d != null) {
                    f.mo108275j(view, d, new C97991d(this));
                } else {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("improveClick not set menu listener");
                    SnsMethodCalculate.markEndTimeMs("register", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
                    throw illegalArgumentException;
                }
            } else {
                C78253a f2 = mo137313f();
                View.OnCreateContextMenuListener d2 = mo137311d();
                if (d2 != null) {
                    f2.mo108276k(view, d2, new C97992e(this));
                } else {
                    IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("improveClick not set menu listener");
                    SnsMethodCalculate.markEndTimeMs("register", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
                    throw illegalArgumentException2;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("register", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
    }

    /* renamed from: m */
    public void mo137318m(C60905o oVar, C98214b bVar) {
        SnsMethodCalculate.markStartTimeMs("update", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(bVar, "info");
        this.f287383d = oVar;
        this.f287382c = bVar;
        SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
    }
}
