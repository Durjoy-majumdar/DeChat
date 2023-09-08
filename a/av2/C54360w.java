package av2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.smiley.C96963p0;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import nl3.C47276a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wx3.C15601d;

/* renamed from: av2.w */
public final class C54360w extends C47276a {

    /* renamed from: D */
    public static final /* synthetic */ int f152530D = 0;

    /* renamed from: A */
    public final C13601g f152531A = C36568h.m40985a(C54362b.f152543d);

    /* renamed from: B */
    public final ArrayList<C72996z1> f152532B = new ArrayList<>();

    /* renamed from: C */
    public final C13601g f152533C = C36568h.m40985a(new C54361a(this));

    /* renamed from: s */
    public final Context f152534s;

    /* renamed from: t */
    public String f152535t;

    /* renamed from: u */
    public final C0000n0 f152536u = C53930o0.m60555b();

    /* renamed from: v */
    public SpannableStringBuilder f152537v = new SpannableStringBuilder("");

    /* renamed from: w */
    public final C13601g f152538w = C36568h.m40985a(new C54365f(this));

    /* renamed from: x */
    public final C13601g f152539x = C36568h.m40985a(new C54364e(this));

    /* renamed from: y */
    public final C13601g f152540y = C36568h.m40985a(new C54366g(this));

    /* renamed from: z */
    public final C13601g f152541z = C36568h.m40985a(new C54363d(this));

    /* renamed from: av2.w$c */
    public static final class C0223c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C54360w f755d;

        public C0223c(C54360w wVar) {
            this.f755d = wVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/sheet/SnsLabelDetailDialog$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$initContentView$1");
            this.f755d.cancel();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$initContentView$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/sheet/SnsLabelDetailDialog$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: av2.w$a */
    public static final class C54361a extends C87413o implements C32224a<C54359v> {

        /* renamed from: d */
        public final /* synthetic */ C54360w f152542d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54361a(C54360w wVar) {
            super(0);
            this.f152542d = wVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$adapter$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$adapter$2");
            C54359v vVar = new C54359v(this.f152542d);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$adapter$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$adapter$2");
            return vVar;
        }
    }

    /* renamed from: av2.w$b */
    public static final class C54362b extends C87413o implements C32224a<C44668u3> {

        /* renamed from: d */
        public static final C54362b f152543d = new C54362b();

        public C54362b() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$cstg$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$cstg$2");
            C44668u3 Ni = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni();
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$cstg$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$cstg$2");
            return Ni;
        }
    }

    /* renamed from: av2.w$d */
    public static final class C54363d extends C87413o implements C32224a<WxLinearLayoutManager> {

        /* renamed from: d */
        public final /* synthetic */ C54360w f152544d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54363d(C54360w wVar) {
            super(0);
            this.f152544d = wVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$layoutManager$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$layoutManager$2");
            WxLinearLayoutManager wxLinearLayoutManager = new WxLinearLayoutManager(this.f152544d.getContext());
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$layoutManager$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$layoutManager$2");
            return wxLinearLayoutManager;
        }
    }

    /* renamed from: av2.w$e */
    public static final class C54364e extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C54360w f152545d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54364e(C54360w wVar) {
            super(0);
            this.f152545d = wVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$progress$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$progress$2");
            View view = this.f152545d.f126905i;
            View findViewById = view != null ? view.findViewById(C0966R.C0970id.nqc) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$progress$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$progress$2");
            return findViewById;
        }
    }

    /* renamed from: av2.w$f */
    public static final class C54365f extends C87413o implements C32224a<WxRecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ C54360w f152546d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54365f(C54360w wVar) {
            super(0);
            this.f152546d = wVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$recyclerView$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$recyclerView$2");
            View view = this.f152546d.f126905i;
            WxRecyclerView wxRecyclerView = view != null ? (WxRecyclerView) view.findViewById(C0966R.C0970id.nqb) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$recyclerView$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$recyclerView$2");
            return wxRecyclerView;
        }
    }

    /* renamed from: av2.w$g */
    public static final class C54366g extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C54360w f152547d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54366g(C54360w wVar) {
            super(0);
            this.f152547d = wVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$titleView$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$titleView$2");
            View view = this.f152547d.f126905i;
            TextView textView = view != null ? (TextView) view.findViewById(C0966R.C0970id.kpm) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$titleView$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$titleView$2");
            return textView;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54360w(Context context, String str) {
        super(context);
        C87412m.m108594g(context, "uiContext");
        C87412m.m108594g(str, "labelName");
        this.f152534s = context;
        this.f152535t = str;
    }

    /* renamed from: L */
    public static final /* synthetic */ ArrayList m61051L(C54360w wVar) {
        SnsMethodCalculate.markStartTimeMs("access$getContacts$p", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
        ArrayList<C72996z1> arrayList = wVar.f152532B;
        SnsMethodCalculate.markEndTimeMs("access$getContacts$p", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
        return arrayList;
    }

    /* renamed from: G */
    public View mo6265G() {
        SnsMethodCalculate.markStartTimeMs("inflateContentView", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f360007d31, (ViewGroup) null);
        C87412m.m108593f(inflate, "from(context).inflate(R.…abel_detail_dialog, null)");
        SnsMethodCalculate.markEndTimeMs("inflateContentView", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
        return inflate;
    }

    /* renamed from: H */
    public void mo6266H() {
        View findViewById;
        SnsMethodCalculate.markStartTimeMs("initContentView", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
        super.mo6266H();
        View view = this.f126905i;
        if (!(view == null || (findViewById = view.findViewById(C0966R.C0970id.bec)) == null)) {
            findViewById.setOnClickListener(new C0223c(this));
        }
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
        WxRecyclerView M = mo75131M();
        if (M != null) {
            SnsMethodCalculate.markStartTimeMs("getLayoutManager", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
            SnsMethodCalculate.markEndTimeMs("getLayoutManager", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
            M.setLayoutManager((WxLinearLayoutManager) ((C36570n) this.f152541z).getValue());
        }
        WxRecyclerView M2 = mo75131M();
        if (M2 != null) {
            SnsMethodCalculate.markStartTimeMs("getAdapter", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
            SnsMethodCalculate.markEndTimeMs("getAdapter", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
            M2.setAdapter((C54359v) ((C36570n) this.f152533C).getValue());
        }
        WxRecyclerView M3 = mo75131M();
        if (M3 != null) {
            M3.mo17085h0(new C0224x(this));
        }
        this.f152537v.append(C96963p0.wx0().mo83004M(MMApplicationContext.getContext(), this.f152535t));
        SnsMethodCalculate.markStartTimeMs("getTitleView", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
        TextView textView = (TextView) ((C36570n) this.f152540y).getValue();
        SnsMethodCalculate.markEndTimeMs("getTitleView", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
        if (textView != null) {
            textView.setText(this.f152537v);
        }
        C53895h.m60466d(this.f152536u, C53872d1.f151119c, (C53934p0) null, new C54367y(this, (C15601d<? super C54367y>) null), 2, (Object) null);
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
        SnsMethodCalculate.markEndTimeMs("initContentView", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
    }

    /* renamed from: J */
    public void mo68876J() {
        SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
        super.mo68876J();
        C53930o0.m60558e(this.f152536u, (CancellationException) null, 1, (Object) null);
        SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
    }

    /* renamed from: M */
    public final WxRecyclerView mo75131M() {
        SnsMethodCalculate.markStartTimeMs("getRecyclerView", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
        WxRecyclerView wxRecyclerView = (WxRecyclerView) ((C36570n) this.f152538w).getValue();
        SnsMethodCalculate.markEndTimeMs("getRecyclerView", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
        return wxRecyclerView;
    }
}
