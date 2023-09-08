package yj1;

import al1.C0080f;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C7851o5;
import er1.C7859p5;
import gy3.C8480h;
import gy3.C87412m;
import il1.C8961e;
import j20.C117292a;
import java.util.ArrayList;
import ok1.C11471u;
import wj1.C15419c;
import xj1.C15712a;

/* renamed from: yj1.a */
public final class C16019a extends C8961e {

    /* renamed from: h */
    public final C15712a f43091h;

    /* renamed from: i */
    public TextView f43092i;

    /* renamed from: j */
    public TextView f43093j;

    /* renamed from: n */
    public TextView f43094n;

    /* renamed from: o */
    public TextView f43095o;

    /* renamed from: p */
    public TextView f43096p;

    /* renamed from: q */
    public long f43097q;

    /* renamed from: r */
    public C0080f f43098r;

    /* renamed from: s */
    public C7851o5 f43099s = C7851o5.NORMAL_TYPE;

    /* renamed from: yj1.a$a */
    public interface C16020a {
        /* renamed from: Z */
        void mo14209Z();

        void onCancel();

        /* renamed from: x */
        void mo14212x();

        /* renamed from: z */
        void mo14213z(String str);
    }

    /* renamed from: yj1.a$b */
    public static final class C16021b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C16019a f43100d;

        public C16021b(C16019a aVar) {
            this.f43100d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/quota/widget/FinderLiveRestrictConsumeDialogWidget$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f43100d.f43091h.mo14210d().mo14212x();
            this.f43100d.mo9763a();
            C15419c.f41825a.mo14214a(C7859p5.PAUSE_SEND, this.f43100d.f43097q);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/quota/widget/FinderLiveRestrictConsumeDialogWidget$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: yj1.a$c */
    public static final class C16022c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C16019a f43101d;

        public C16022c(C16019a aVar) {
            this.f43101d = aVar;
        }

        public final void onClick(View view) {
            String str;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/quota/widget/FinderLiveRestrictConsumeDialogWidget$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C16019a aVar = this.f43101d;
            int ordinal = aVar.f43099s.ordinal();
            if (ordinal == 0) {
                aVar.f43091h.mo14210d().mo14209Z();
                C15419c.f41825a.mo14214a(C7859p5.CONTINUE_SEND, aVar.f43097q);
            } else if (ordinal == 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("consumeVerifyUrl jump: ");
                C0080f fVar = aVar.f43098r;
                sb.append(fVar != null ? fVar.f505c : null);
                Log.m105924i("RestrictConsumeDialogWidget", sb.toString());
                C0080f fVar2 = aVar.f43098r;
                if (!(fVar2 == null || (str = fVar2.f505c) == null)) {
                    aVar.f43091h.mo14210d().mo14213z(str);
                }
            }
            this.f43101d.mo9763a();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/quota/widget/FinderLiveRestrictConsumeDialogWidget$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16019a(Context context, C15712a aVar) {
        super(context, false, (C11471u.C11473b) null, 4, (C8480h) null);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "service");
        this.f43091h = aVar;
        this.f28309g.f26707c.setBackground((Drawable) null);
    }

    /* renamed from: g */
    public int mo3425g() {
        return C0966R.C0971layout.f359749d24;
    }

    /* renamed from: h */
    public int mo3426h() {
        return 8;
    }

    /* renamed from: k */
    public void mo3428k(View view) {
        C87412m.m108594g(view, "rootView");
        View findViewById = view.findViewById(C0966R.C0970id.kpi);
        C87412m.m108593f(findViewById, "rootView.findViewById(R.id.title_text)");
        this.f43092i = (TextView) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.bsg);
        C87412m.m108593f(findViewById2, "rootView.findViewById(R.id.content_text)");
        this.f43093j = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C0966R.C0970id.np9);
        C87412m.m108593f(findViewById3, "rootView.findViewById(R.id.restrict_consume_text)");
        this.f43094n = (TextView) findViewById3;
        View findViewById4 = view.findViewById(C0966R.C0970id.fmq);
        C87412m.m108593f(findViewById4, "rootView.findViewById(R.id.left_btn)");
        this.f43095o = (TextView) findViewById4;
        View findViewById5 = view.findViewById(C0966R.C0970id.itd);
        C87412m.m108593f(findViewById5, "rootView.findViewById(R.id.right_btn)");
        this.f43096p = (TextView) findViewById5;
        TextView textView = this.f43092i;
        if (textView != null) {
            C85875k4.m106191k0(textView.getPaint());
            TextView textView2 = this.f43095o;
            if (textView2 != null) {
                textView2.setOnClickListener(new C16021b(this));
                TextView textView3 = this.f43096p;
                if (textView3 != null) {
                    textView3.setOnClickListener(new C16022c(this));
                } else {
                    C87412m.m108603p("rightBtn");
                    throw null;
                }
            } else {
                C87412m.m108603p("leftBtn");
                throw null;
            }
        } else {
            C87412m.m108603p("titleText");
            throw null;
        }
    }

    /* renamed from: l */
    public void mo9450l() {
        this.f43091h.mo14210d().onCancel();
    }
}
