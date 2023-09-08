package fg1;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import ok1.C62042e;
import qo3.C12925w;
import qo3.w$$d;
import rx3.C13598b0;

/* renamed from: fg1.a */
public class C8022a {

    /* renamed from: a */
    public final Context f26705a;

    /* renamed from: b */
    public C12925w f26706b;

    /* renamed from: c */
    public View f26707c;

    /* renamed from: d */
    public RelativeLayout f26708d;

    /* renamed from: e */
    public FrameLayout f26709e;

    /* renamed from: f */
    public View f26710f;

    /* renamed from: g */
    public WeImageView f26711g;

    /* renamed from: h */
    public FrameLayout f26712h;

    /* renamed from: i */
    public TextView f26713i;

    /* renamed from: j */
    public TextView f26714j;

    /* renamed from: k */
    public TextView f26715k;

    /* renamed from: l */
    public FrameLayout f26716l;

    /* renamed from: m */
    public TextView f26717m;

    /* renamed from: n */
    public C32224a<C13598b0> f26718n;

    /* renamed from: o */
    public C32224a<C13598b0> f26719o;

    /* renamed from: fg1.a$a */
    public static final class C8023a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C8022a f26720d;

        public C8023a(C8022a aVar) {
            this.f26720d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/actionsheet/FinderLiveBottomSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f26720d.f26706b.mo5085n();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/actionsheet/FinderLiveBottomSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: fg1.a$b */
    public static final class C8024b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C8022a f26721d;

        public C8024b(C8022a aVar) {
            this.f26721d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/actionsheet/FinderLiveBottomSheet$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f26721d.getClass();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/actionsheet/FinderLiveBottomSheet$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: fg1.a$c */
    public static final class C8025c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C8022a f26722d;

        public C8025c(C8022a aVar) {
            this.f26722d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/actionsheet/FinderLiveBottomSheet$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f26722d.getClass();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/actionsheet/FinderLiveBottomSheet$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: fg1.a$d */
    public static final class C8026d implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C8022a f26723d;

        public C8026d(C8022a aVar) {
            this.f26723d = aVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            C32224a<C13598b0> aVar = this.f26723d.f26718n;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: fg1.a$e */
    public static final class C8027e implements w$$d {

        /* renamed from: a */
        public final /* synthetic */ C8022a f26724a;

        public C8027e(C8022a aVar) {
            this.f26724a = aVar;
        }

        public final void onDismiss() {
            C32224a<C13598b0> aVar = this.f26724a.f26719o;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public C8022a(Context context, boolean z) {
        C87412m.m108594g(context, "context");
        this.f26705a = context;
        this.f26706b = new C12925w(context, 0, false, z);
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.cok, (ViewGroup) null);
        C87412m.m108593f(inflate, "from(context).inflate(R.…alog_bottom_layout, null)");
        this.f26707c = inflate;
        View findViewById = inflate.findViewById(C0966R.C0970id.mal);
        C87412m.m108593f(findViewById, "rootView.findViewById(R.…ttom_sheet_layout_header)");
        this.f26708d = (RelativeLayout) findViewById;
        View findViewById2 = this.f26707c.findViewById(C0966R.C0970id.mak);
        C87412m.m108593f(findViewById2, "rootView.findViewById(R.…tom_sheet_layout_content)");
        this.f26709e = (FrameLayout) findViewById2;
        View findViewById3 = this.f26707c.findViewById(C0966R.C0970id.mcj);
        C87412m.m108593f(findViewById3, "rootView.findViewById(R.…live_left_back_btn_group)");
        this.f26710f = findViewById3;
        View findViewById4 = this.f26707c.findViewById(C0966R.C0970id.mck);
        C87412m.m108593f(findViewById4, "rootView.findViewById(R.id.finder_live_left_btn)");
        this.f26711g = (WeImageView) findViewById4;
        View findViewById5 = this.f26707c.findViewById(C0966R.C0970id.m0j);
        C87412m.m108593f(findViewById5, "rootView.findViewById(R.…der_live_left_btn_layout)");
        this.f26712h = (FrameLayout) findViewById5;
        View findViewById6 = this.f26707c.findViewById(C0966R.C0970id.mcp);
        C87412m.m108593f(findViewById6, "rootView.findViewById(R.id.finder_live_title_text)");
        this.f26713i = (TextView) findViewById6;
        View findViewById7 = this.f26707c.findViewById(C0966R.C0970id.iz5);
        C87412m.m108593f(findViewById7, "rootView.findViewById(R.…der_live_main_title_text)");
        this.f26714j = (TextView) findViewById7;
        View findViewById8 = this.f26707c.findViewById(C0966R.C0970id.izb);
        C87412m.m108593f(findViewById8, "rootView.findViewById(R.…r_live_second_title_text)");
        this.f26715k = (TextView) findViewById8;
        View findViewById9 = this.f26707c.findViewById(C0966R.C0970id.mcn);
        C87412m.m108593f(findViewById9, "rootView.findViewById(R.…finder_live_right_layout)");
        this.f26716l = (FrameLayout) findViewById9;
        View findViewById10 = this.f26707c.findViewById(C0966R.C0970id.mco);
        C87412m.m108593f(findViewById10, "rootView.findViewById(R.id.finder_live_right_text)");
        this.f26717m = (TextView) findViewById10;
        this.f26710f.setOnClickListener(new C8023a(this));
        C62042e.m72803Q1(C62042e.f176370a, this.f26712h, 0, 0, 6, (Object) null);
        this.f26712h.setOnClickListener(new C8024b(this));
        this.f26716l.setOnClickListener(new C8025c(this));
        this.f26706b.mo12471k(this.f26707c);
        if (context.getResources().getConfiguration().orientation == 2) {
            ViewGroup.LayoutParams layoutParams = this.f26707c.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = C75044y4.m89990b(context).y;
                layoutParams.height = -1;
            }
            this.f26706b.f36920A = C75044y4.m89990b(context).y;
            this.f26706b.mo12472l(Boolean.TRUE);
        }
        this.f26706b.mo12473m(true);
        C12925w wVar = this.f26706b;
        wVar.f36933o = true;
        C8026d dVar = new C8026d(this);
        Dialog dialog = wVar.f36925d;
        if (dialog != null) {
            dialog.setOnCancelListener(dVar);
        }
        this.f26706b.f36937s = new C8027e(this);
    }

    /* renamed from: a */
    public final void mo9110a(String str, String str2) {
        C87412m.m108594g(str, "mainTitle");
        C87412m.m108594g(str2, "secondTitle");
        boolean z = true;
        if (!(str.length() == 0)) {
            if (str2.length() != 0) {
                z = false;
            }
            if (!z) {
                this.f26714j.setText(str);
                this.f26714j.setVisibility(0);
                this.f26715k.setText(str2);
                this.f26715k.setVisibility(0);
                this.f26713i.setVisibility(8);
                return;
            }
        }
        this.f26714j.setVisibility(8);
        this.f26715k.setVisibility(8);
    }
}
