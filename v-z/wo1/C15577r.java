package wo1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import p001ak.C54057e;
import p006bk.C54479b;
import p464ck.C54869f;
import p629ny.C76979h;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C51343t41;
import te3.C64674r41;

/* renamed from: wo1.r */
public final class C15577r extends C54869f {

    /* renamed from: a */
    public final Context f42195a;

    /* renamed from: b */
    public final String f42196b = "ReplayTextDanmakuRender";

    /* renamed from: wo1.r$a */
    public static final class C15578a extends C54869f.C54870a {

        /* renamed from: d */
        public final View f42197d;

        /* renamed from: e */
        public final C13601g f42198e = C36568h.m40985a(C15580a.f42202d);

        /* renamed from: f */
        public final C13601g f42199f = C36568h.m40985a(new C15579b(this));

        /* renamed from: g */
        public final TextView f42200g;

        /* renamed from: wo1.r$a$b */
        public static final class C15579b extends C87413o implements C32224a<Integer> {

            /* renamed from: d */
            public final /* synthetic */ C15578a f42201d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C15579b(C15578a aVar) {
                super(0);
                this.f42201d = aVar;
            }

            public Object invoke() {
                return Integer.valueOf(View.MeasureSpec.makeMeasureSpec((int) ((Number) ((C36570n) this.f42201d.f42198e).getValue()).doubleValue(), Integer.MIN_VALUE));
            }
        }

        /* renamed from: wo1.r$a$a */
        public static final class C15580a extends C87413o implements C32224a<Double> {

            /* renamed from: d */
            public static final C15580a f42202d = new C15580a();

            public C15580a() {
                super(0);
            }

            public Object invoke() {
                int i = C54479b.m61196c().f152763j;
                int i2 = C54479b.m61196c().f152764k;
                if (i < i2) {
                    i = i2;
                }
                return Double.valueOf(((double) i) * 1.5d);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15578a(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f42197d = view;
            View findViewById = view.findViewById(C0966R.C0970id.amw);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.id.bullet_tv)");
            this.f42200g = (TextView) findViewById;
        }

        /* renamed from: d */
        public void mo14335d(int i, int i2) {
            int intValue = ((Number) ((C36570n) this.f42199f).getValue()).intValue();
            if (i < intValue) {
                i = intValue;
            }
            super.mo14335d(i, i2);
        }

        /* renamed from: e */
        public void mo14337e(boolean z, String str, Object obj) {
            C87412m.m108594g(str, "identity");
            if (z) {
                this.f42197d.setBackgroundResource(C0966R.C0969drawable.f5167yz);
            } else {
                this.f42197d.setBackground((Drawable) null);
            }
        }
    }

    public C15577r(Context context) {
        C87412m.m108594g(context, "context");
        this.f42195a = context;
    }

    /* renamed from: e */
    public int mo14332e(Object obj) {
        return 1;
    }

    /* renamed from: f */
    public void mo14333f(int i, C54869f.C54870a aVar, C54057e eVar) {
        C87412m.m108594g(aVar, "viewHolder");
        C87412m.m108594g(eVar, "danmaku");
        TextView textView = ((C15578a) aVar).f42200g;
        C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
        Context context = this.f42195a;
        DATA data = eVar.f151367x;
        C87412m.m108592e(data, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveMsgProxy");
        C64674r41 r412 = ((C51343t41) data).f141953d;
        textView.setText(hVar.mo107057T1(context, r412 != null ? r412.f185126f : null));
    }

    /* renamed from: g */
    public C54869f.C54870a mo14334g(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        View inflate = LayoutInflater.from(this.f42195a).inflate(C0966R.C0971layout.d1z, (ViewGroup) null);
        C87412m.m108593f(inflate, "from(context).inflate(R.…play_bullet_layout, null)");
        C15578a aVar = new C15578a(inflate);
        C85875k4.m106189j0(aVar.f42200g.getPaint(), 0.8f);
        String str = this.f42196b;
        Log.m105924i(str, "onCreateViewHolder: cost = " + (System.currentTimeMillis() - currentTimeMillis));
        return aVar;
    }
}
