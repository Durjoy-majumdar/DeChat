package wf1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.MaxHeightWxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import er1.C7919x;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import ht1.C8802s1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import je1.C46523h2;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import l60.C99342a;
import l60.C99344b;
import lp3.C88629c;
import nr3.C89059e;
import o40.C61926c;
import ob0.C47350c;
import ob0.C89132b;
import ok1.C62042e;
import pl1.C100810g0;
import pl1.C11984n0;
import pl1.C11990s0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import te3.C48769aw;
import te3.C50767p11;
import te3.C50852pn2;
import te3.C52149yp0;
import te3.C52291zp0;
import tj1.C13931b;
import up1.C27696y;
import wk1.C15465r;
import wk1.C15483x;
import wk1.C15484y;

/* renamed from: wf1.l */
public final class C15193l extends UIComponent {

    /* renamed from: N */
    public static int f41362N = 0;

    /* renamed from: P */
    public static byte[] f41363P = null;

    /* renamed from: Q */
    public static long f41364Q = 0;

    /* renamed from: R */
    public static long f41365R = 0;

    /* renamed from: S */
    public static int f41366S = 2;

    /* renamed from: T */
    public static String f41367T = "";

    /* renamed from: A */
    public final C13601g f41368A = C36568h.m40985a(new C15198e(this));

    /* renamed from: B */
    public final C13601g f41369B = C36568h.m40985a(new C15215u(this));

    /* renamed from: C */
    public final ArrayList<Integer> f41370C = new ArrayList<>();

    /* renamed from: D */
    public LinkedList<C48769aw> f41371D = new LinkedList<>();

    /* renamed from: E */
    public LinkedHashMap<String, C50767p11> f41372E = new LinkedHashMap<>();

    /* renamed from: F */
    public long f41373F;

    /* renamed from: G */
    public String f41374G = "";

    /* renamed from: H */
    public long f41375H;

    /* renamed from: I */
    public LinkedList<C50852pn2> f41376I = new LinkedList<>();

    /* renamed from: J */
    public long f41377J;

    /* renamed from: K */
    public long f41378K;

    /* renamed from: L */
    public int f41379L = 40;

    /* renamed from: M */
    public KeyboardHeightProvider f41380M;

    /* renamed from: d */
    public final String f41381d = "FinderLiveGiftPkgUIC";

    /* renamed from: e */
    public final C13601g f41382e = C36568h.m40985a(new C15200g(this));

    /* renamed from: f */
    public final C13601g f41383f = C36568h.m40985a(new C15209p(this));

    /* renamed from: g */
    public final C13601g f41384g = C36568h.m40985a(new C15203j(this));

    /* renamed from: h */
    public final C13601g f41385h = C36568h.m40985a(new C15204k(this));

    /* renamed from: i */
    public final C13601g f41386i = C36568h.m40985a(new C15202i(this));

    /* renamed from: j */
    public final C13601g f41387j = C36568h.m40985a(new C15207n(this));

    /* renamed from: n */
    public final C13601g f41388n = C36568h.m40985a(new C15208o(this));

    /* renamed from: o */
    public final C13601g f41389o = C36568h.m40985a(new C15205l(this));

    /* renamed from: p */
    public final C13601g f41390p = C36568h.m40985a(new C15196c(this));

    /* renamed from: q */
    public final C13601g f41391q = C36568h.m40985a(new C15206m(this));

    /* renamed from: r */
    public final C13601g f41392r = C36568h.m40985a(new C15213s(this));

    /* renamed from: s */
    public final C13601g f41393s = C36568h.m40985a(new C15216v(this));

    /* renamed from: t */
    public final C13601g f41394t = C36568h.m40985a(new C15218x(this));

    /* renamed from: u */
    public final C13601g f41395u = C36568h.m40985a(new C15217w(this));

    /* renamed from: v */
    public final C13601g f41396v = C36568h.m40985a(new C15212r(this));

    /* renamed from: w */
    public final C13601g f41397w = C36568h.m40985a(new C15201h(this));

    /* renamed from: x */
    public final int f41398x = 4;

    /* renamed from: y */
    public final C13601g f41399y = C36568h.m40985a(new C15197d(this));

    /* renamed from: z */
    public final C13601g f41400z = C36568h.m40985a(new C15199f(this));

    /* renamed from: wf1.l$a */
    public static final class C15194a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final TextView f41401A;

        /* renamed from: B */
        public final TextView f41402B;

        /* renamed from: C */
        public final TextView f41403C;

        /* renamed from: z */
        public final ImageView f41404z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15194a(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f41404z = (ImageView) view.findViewById(C0966R.C0970id.jau);
            this.f41401A = (TextView) view.findViewById(C0966R.C0970id.l76);
            this.f41402B = (TextView) view.findViewById(C0966R.C0970id.j4x);
            this.f41403C = (TextView) view.findViewById(C0966R.C0970id.f358153dn3);
        }
    }

    /* renamed from: wf1.l$b */
    public final class C15195b extends RecyclerView.C16613e<C15194a> {

        /* renamed from: d */
        public LinkedList<C48769aw> f41405d = new LinkedList<>();

        public C15195b() {
        }

        /* renamed from: F4 */
        public final void mo14136F4() {
            LinkedList<C48769aw> linkedList = C15193l.this.f41371D;
            ArrayList arrayList = new ArrayList();
            for (T next : linkedList) {
                if (((C48769aw) next).f130787e > 0) {
                    arrayList.add(next);
                }
            }
            this.f41405d = new LinkedList<>(arrayList);
            notifyDataSetChanged();
            C15193l lVar = C15193l.this;
            lVar.mo14132i3().post(new C15220m(lVar));
        }

        public int getItemCount() {
            return this.f41405d.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            String str;
            C15194a aVar = (C15194a) zVar;
            C87412m.m108594g(aVar, "holder");
            C48769aw awVar = this.f41405d.get(i);
            C87412m.m108593f(awVar, "dataList.get(position)");
            C48769aw awVar2 = awVar;
            C50767p11 p112 = C15193l.this.f41372E.get(awVar2.f130786d);
            Integer num = null;
            C99344b<C100810g0, Bitmap> a = ((C11990s0) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C11990s0.class)).mo11871f2().mo85955a(new C11984n0(p112 != null ? p112.f139509f : null, C27696y.THUMB_IMAGE));
            ImageView imageView = aVar.f41404z;
            C87412m.m108593f(imageView, "holder.giftThumb");
            ((C99342a) a).mo85954d(imageView);
            TextView textView = aVar.f41403C;
            if (p112 != null) {
                num = Integer.valueOf((int) p112.f139516p);
            }
            textView.setText(String.valueOf(num));
            C62042e eVar = C62042e.f176370a;
            TextView textView2 = aVar.f41401A;
            C87412m.m108593f(textView2, "holder.giftCntTv");
            eVar.mo87033P1(textView2);
            TextView textView3 = aVar.f41401A;
            StringBuilder sb = new StringBuilder();
            sb.append('x');
            sb.append(awVar2.f130787e);
            textView3.setText(sb.toString());
            TextView textView4 = aVar.f41402B;
            if (p112 == null || (str = p112.f139515o) == null) {
                str = "";
            }
            textView4.setText(str);
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.c5a, (ViewGroup) null);
            C87412m.m108593f(inflate, "inflate(\n               …   null\n                )");
            return new C15194a(inflate);
        }
    }

    /* renamed from: wf1.l$c */
    public static final class C15196c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C15193l f41407d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15196c(C15193l lVar) {
            super(0);
            this.f41407d = lVar;
        }

        public Object invoke() {
            return this.f41407d.findViewById(C0966R.C0970id.gra);
        }
    }

    /* renamed from: wf1.l$d */
    public static final class C15197d extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C15193l f41408d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15197d(C15193l lVar) {
            super(0);
            this.f41408d = lVar;
        }

        public Object invoke() {
            return Integer.valueOf(C76577a.m92157h(this.f41408d.getContext(), C0966R.dimen.f3722cc));
        }
    }

    /* renamed from: wf1.l$e */
    public static final class C15198e extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C15193l f41409d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15198e(C15193l lVar) {
            super(0);
            this.f41409d = lVar;
        }

        public Object invoke() {
            return Integer.valueOf(C76577a.m92157h(this.f41409d.getContext(), C0966R.dimen.f3743cv));
        }
    }

    /* renamed from: wf1.l$f */
    public static final class C15199f extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C15193l f41410d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15199f(C15193l lVar) {
            super(0);
            this.f41410d = lVar;
        }

        public Object invoke() {
            return Integer.valueOf(C76577a.m92157h(this.f41410d.getContext(), C0966R.dimen.f3703bv));
        }
    }

    /* renamed from: wf1.l$g */
    public static final class C15200g extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C15193l f41411d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15200g(C15193l lVar) {
            super(0);
            this.f41411d = lVar;
        }

        public Object invoke() {
            return this.f41411d.findViewById(C0966R.C0970id.jb8);
        }
    }

    /* renamed from: wf1.l$h */
    public static final class C15201h extends C87413o implements C32224a<C13931b> {

        /* renamed from: d */
        public final /* synthetic */ C15193l f41412d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15201h(C15193l lVar) {
            super(0);
            this.f41412d = lVar;
        }

        public Object invoke() {
            View findViewById = this.f41412d.findViewById(C0966R.C0970id.jsg);
            C87412m.m108593f(findViewById, "findViewById<View>(R.id.…echoose_gift_pkg_ui_root)");
            C13931b bVar = new C13931b(findViewById);
            C15193l lVar = this.f41412d;
            bVar.f39143i = new C15226n(lVar);
            bVar.f39144j = new C15228o(lVar);
            return bVar;
        }
    }

    /* renamed from: wf1.l$i */
    public static final class C15202i extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C15193l f41413d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15202i(C15193l lVar) {
            super(0);
            this.f41413d = lVar;
        }

        public Object invoke() {
            return (TextView) this.f41413d.findViewById(C0966R.C0970id.grc);
        }
    }

    /* renamed from: wf1.l$j */
    public static final class C15203j extends C87413o implements C32224a<MaxHeightWxRecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ C15193l f41414d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15203j(C15193l lVar) {
            super(0);
            this.f41414d = lVar;
        }

        public Object invoke() {
            return (MaxHeightWxRecyclerView) this.f41414d.findViewById(C0966R.C0970id.jap);
        }
    }

    /* renamed from: wf1.l$k */
    public static final class C15204k extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C15193l f41415d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15204k(C15193l lVar) {
            super(0);
            this.f41415d = lVar;
        }

        public Object invoke() {
            return (TextView) this.f41415d.findViewById(C0966R.C0970id.f358153dn3);
        }
    }

    /* renamed from: wf1.l$l */
    public static final class C15205l extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C15193l f41416d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15205l(C15193l lVar) {
            super(0);
            this.f41416d = lVar;
        }

        public Object invoke() {
            return this.f41416d.findViewById(C0966R.C0970id.jb4);
        }
    }

    /* renamed from: wf1.l$m */
    public static final class C15206m extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C15193l f41417d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15206m(C15193l lVar) {
            super(0);
            this.f41417d = lVar;
        }

        public Object invoke() {
            return this.f41417d.findViewById(C0966R.C0970id.jla);
        }
    }

    /* renamed from: wf1.l$n */
    public static final class C15207n extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C15193l f41418d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15207n(C15193l lVar) {
            super(0);
            this.f41418d = lVar;
        }

        public Object invoke() {
            return (ImageView) this.f41418d.findViewById(C0966R.C0970id.jcf);
        }
    }

    /* renamed from: wf1.l$o */
    public static final class C15208o extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C15193l f41419d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15208o(C15193l lVar) {
            super(0);
            this.f41419d = lVar;
        }

        public Object invoke() {
            return (ImageView) this.f41419d.findViewById(C0966R.C0970id.jb9);
        }
    }

    /* renamed from: wf1.l$p */
    public static final class C15209p extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C15193l f41420d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15209p(C15193l lVar) {
            super(0);
            this.f41420d = lVar;
        }

        public Object invoke() {
            return (TextView) this.f41420d.findViewById(C0966R.C0970id.f358161jb3);
        }
    }

    /* renamed from: wf1.l$q */
    public static final class C15210q implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C15193l f41421d;

        /* renamed from: wf1.l$q$a */
        public static final class C15211a implements C7020t0 {

            /* renamed from: d */
            public final /* synthetic */ C15193l f41422d;

            public C15211a(C15193l lVar) {
                this.f41422d = lVar;
            }

            /* JADX WARNING: type inference failed for: r1v7, types: [android.view.ViewGroup$LayoutParams] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* renamed from: Q1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo531Q1(int r12, boolean r13) {
                /*
                    r11 = this;
                    wf1.l r0 = r11.f41422d
                    java.lang.String r0 = r0.f41381d
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "onKeyboardHeightChanged, height:"
                    r1.append(r2)
                    r1.append(r12)
                    java.lang.String r2 = ", isResized:"
                    r1.append(r2)
                    r1.append(r13)
                    java.lang.String r13 = r1.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r13)
                    wf1.l r13 = r11.f41422d
                    rx3.g r13 = r13.f41397w
                    rx3.n r13 = (rx3.C36570n) r13
                    java.lang.Object r13 = r13.getValue()
                    tj1.b r13 = (tj1.C13931b) r13
                    rx3.g r0 = r13.f39137c
                    rx3.n r0 = (rx3.C36570n) r0
                    java.lang.Object r0 = r0.getValue()
                    com.tencent.mm.ui.widget.LiveBottomSheetPanel r0 = (com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel) r0
                    boolean r0 = r0.f165501h
                    if (r0 == 0) goto L_0x00fc
                    int r0 = r13.f39156v
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    int r1 = r0.intValue()
                    r2 = 0
                    if (r1 < 0) goto L_0x0059
                    rx3.g r3 = r13.f39142h
                    rx3.n r3 = (rx3.C36570n) r3
                    java.lang.Object r3 = r3.getValue()
                    tj1.b$d r3 = (tj1.C13931b.C13935d) r3
                    int r3 = r3.getItemCount()
                    if (r1 >= r3) goto L_0x0059
                    r1 = 1
                    goto L_0x005a
                L_0x0059:
                    r1 = 0
                L_0x005a:
                    r3 = 0
                    if (r1 == 0) goto L_0x005e
                    goto L_0x005f
                L_0x005e:
                    r0 = r3
                L_0x005f:
                    if (r0 == 0) goto L_0x00fc
                    int r0 = r0.intValue()
                    rx3.g r1 = r13.f39141g
                    rx3.n r1 = (rx3.C36570n) r1
                    java.lang.Object r1 = r1.getValue()
                    com.tencent.mm.view.recyclerview.WxRecyclerView r1 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r1
                    android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                    boolean r4 = r1 instanceof android.widget.LinearLayout.LayoutParams
                    if (r4 == 0) goto L_0x007a
                    r3 = r1
                    android.widget.LinearLayout$LayoutParams r3 = (android.widget.LinearLayout.LayoutParams) r3
                L_0x007a:
                    if (r3 == 0) goto L_0x00fc
                    java.lang.String r1 = r13.f39136b
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    java.lang.String r5 = "[onKeyBoardChange], height = "
                    r4.append(r5)
                    r4.append(r12)
                    java.lang.String r5 = ", pos = "
                    r4.append(r5)
                    r4.append(r0)
                    java.lang.String r4 = r4.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
                    int r1 = r3.leftMargin
                    int r4 = r3.topMargin
                    int r5 = r3.rightMargin
                    r3.setMargins(r1, r4, r5, r12)
                    rx3.g r1 = r13.f39141g
                    rx3.n r1 = (rx3.C36570n) r1
                    java.lang.Object r1 = r1.getValue()
                    com.tencent.mm.view.recyclerview.WxRecyclerView r1 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r1
                    r1.setLayoutParams(r3)
                    if (r12 <= 0) goto L_0x00fc
                    rx3.g r12 = r13.f39141g
                    rx3.n r12 = (rx3.C36570n) r12
                    java.lang.Object r12 = r12.getValue()
                    com.tencent.mm.view.recyclerview.WxRecyclerView r12 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r12
                    k20.a r13 = new k20.a
                    r13.<init>()
                    java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    r13.mo10233c(r0)
                    java.lang.Object[] r4 = r13.mo10232b()
                    java.lang.String r5 = "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView"
                    java.lang.String r6 = "onKeyBoardChange"
                    java.lang.String r7 = "(I)V"
                    java.lang.String r8 = "Undefined"
                    java.lang.String r9 = "scrollToPosition"
                    java.lang.String r10 = "(I)V"
                    r3 = r12
                    j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
                    java.lang.Object r13 = r13.mo10231a(r2)
                    java.lang.Integer r13 = (java.lang.Integer) r13
                    int r13 = r13.intValue()
                    r12.mo17115r1(r13)
                    java.lang.String r4 = "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView"
                    java.lang.String r5 = "onKeyBoardChange"
                    java.lang.String r6 = "(I)V"
                    java.lang.String r7 = "Undefined"
                    java.lang.String r8 = "scrollToPosition"
                    java.lang.String r9 = "(I)V"
                    j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
                L_0x00fc:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: wf1.C15193l.C15210q.C15211a.mo531Q1(int, boolean):void");
            }
        }

        public C15210q(C15193l lVar) {
            this.f41421d = lVar;
        }

        public final void run() {
            C15193l lVar = this.f41421d;
            if (lVar.f41380M == null) {
                lVar.f41380M = new KeyboardHeightProvider(lVar.getActivity());
                C15193l lVar2 = this.f41421d;
                KeyboardHeightProvider keyboardHeightProvider = lVar2.f41380M;
                if (keyboardHeightProvider != null) {
                    keyboardHeightProvider.f220015b = new C15211a(lVar2);
                }
            }
            KeyboardHeightProvider keyboardHeightProvider2 = this.f41421d.f41380M;
            if (keyboardHeightProvider2 != null) {
                keyboardHeightProvider2.mo104022e();
            }
        }
    }

    /* renamed from: wf1.l$r */
    public static final class C15212r extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C15193l f41423d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15212r(C15193l lVar) {
            super(0);
            this.f41423d = lVar;
        }

        public Object invoke() {
            return this.f41423d.findViewById(C0966R.C0970id.f358152jb1);
        }
    }

    /* renamed from: wf1.l$s */
    public static final class C15213s extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C15193l f41424d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15213s(C15193l lVar) {
            super(0);
            this.f41424d = lVar;
        }

        public Object invoke() {
            return this.f41424d.findViewById(C0966R.C0970id.jan);
        }
    }

    /* renamed from: wf1.l$t */
    public static final class C15214t implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C15193l f41425d;

        public C15214t(C15193l lVar) {
            this.f41425d = lVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$refreshEditLevelView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C15193l lVar = this.f41425d;
            C7045j jVar = new C7045j((Context) lVar.getActivity(), (ArrayList<String>) new ArrayList(lVar.mo14133j3().keySet()));
            jVar.mo8106i(lVar.f41370C.indexOf(Integer.valueOf(lVar.f41379L)));
            jVar.f24854B = new C15192k0(lVar);
            jVar.f24869t = new C15219l0(lVar, jVar);
            View inflate = LayoutInflater.from(lVar.getActivity()).inflate(C0966R.C0971layout.c5w, (ViewGroup) null);
            C87412m.m108593f(inflate, "from(activity)\n         …evel_picker_header, null)");
            int color = lVar.getActivity().getResources().getColor(C0966R.color.f3424sc);
            Button button = jVar.f24862j;
            if (button != null) {
                button.setTextColor(color);
            }
            jVar.mo8105h(2);
            Button button2 = jVar.f24861i;
            if (button2 != null) {
                button2.setBackgroundResource(C0966R.C0969drawable.f5153yk);
            }
            String string = lVar.getActivity().getResources().getString(C0966R.string.n8i);
            Button button3 = jVar.f24861i;
            if (button3 != null) {
                button3.setText(string);
            }
            jVar.mo8104g(inflate);
            C104428a aVar = jVar.f24856d;
            if (aVar != null) {
                aVar.getWindow().setDimAmount(0.0f);
            }
            jVar.mo8109l();
            C62042e.f176370a.mo87013I1(2);
            View view2 = (View) ((C36570n) lVar.f41391q).getValue();
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC", "showChooseTargetLevelDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC", "showChooseTargetLevelDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View g3 = lVar.mo14131g3();
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(4);
            View view4 = g3;
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC", "showChooseTargetLevelDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            g3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC", "showChooseTargetLevelDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            lVar.mo14135l3(lVar.f41370C.get(jVar.mo8099b()));
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$refreshEditLevelView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: wf1.l$u */
    public static final class C15215u extends C87413o implements C32224a<C15195b> {

        /* renamed from: d */
        public final /* synthetic */ C15193l f41426d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15215u(C15193l lVar) {
            super(0);
            this.f41426d = lVar;
        }

        public Object invoke() {
            return new C15195b();
        }
    }

    /* renamed from: wf1.l$v */
    public static final class C15216v extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C15193l f41427d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15216v(C15193l lVar) {
            super(0);
            this.f41427d = lVar;
        }

        public Object invoke() {
            return this.f41427d.findViewById(C0966R.C0970id.jaq);
        }
    }

    /* renamed from: wf1.l$w */
    public static final class C15217w extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C15193l f41428d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15217w(C15193l lVar) {
            super(0);
            this.f41428d = lVar;
        }

        public Object invoke() {
            return this.f41428d.findViewById(C0966R.C0970id.jar);
        }
    }

    /* renamed from: wf1.l$x */
    public static final class C15218x extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C15193l f41429d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15218x(C15193l lVar) {
            super(0);
            this.f41429d = lVar;
        }

        public Object invoke() {
            return this.f41429d.findViewById(C0966R.C0970id.jav);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15193l(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public static final int m14278c3(C15193l lVar) {
        return ((Number) ((C36570n) lVar.f41400z).getValue()).intValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* renamed from: d3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m14279d3(wf1.C15193l r17, wx3.C15601d r18) {
        /*
            r0 = r17
            r1 = r18
            r17.getClass()
            boolean r2 = r1 instanceof wf1.C15248x
            if (r2 == 0) goto L_0x001a
            r2 = r1
            wf1.x r2 = (wf1.C15248x) r2
            int r3 = r2.f41490n
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001a
            int r3 = r3 - r4
            r2.f41490n = r3
            goto L_0x001f
        L_0x001a:
            wf1.x r2 = new wf1.x
            r2.<init>(r0, r1)
        L_0x001f:
            java.lang.Object r1 = r2.f41488i
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r2.f41490n
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r4 == 0) goto L_0x0091
            if (r4 == r8) goto L_0x0077
            if (r4 == r7) goto L_0x005e
            if (r4 == r6) goto L_0x0049
            if (r4 != r5) goto L_0x0041
            java.lang.Object r0 = r2.f41484e
            bi1.e r0 = (bi1.C0287e) r0
            java.lang.Object r0 = r2.f41483d
            gy3.f0 r0 = (gy3.C8479f0) r0
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x01c8
        L_0x0041:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0049:
            java.lang.Object r0 = r2.f41486g
            bi1.e r0 = (bi1.C0287e) r0
            java.lang.Object r4 = r2.f41485f
            gy3.f0 r4 = (gy3.C8479f0) r4
            java.lang.Object r6 = r2.f41484e
            gy3.f0 r6 = (gy3.C8479f0) r6
            java.lang.Object r7 = r2.f41483d
            gy3.f0 r7 = (gy3.C8479f0) r7
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x01a5
        L_0x005e:
            java.lang.Object r0 = r2.f41487h
            bi1.e r0 = (bi1.C0287e) r0
            java.lang.Object r4 = r2.f41486g
            gy3.f0 r4 = (gy3.C8479f0) r4
            java.lang.Object r7 = r2.f41485f
            gy3.f0 r7 = (gy3.C8479f0) r7
            java.lang.Object r8 = r2.f41484e
            gy3.f0 r8 = (gy3.C8479f0) r8
            java.lang.Object r10 = r2.f41483d
            wf1.l r10 = (wf1.C15193l) r10
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x017e
        L_0x0077:
            java.lang.Object r0 = r2.f41486g
            gy3.f0 r0 = (gy3.C8479f0) r0
            java.lang.Object r4 = r2.f41485f
            gy3.f0 r4 = (gy3.C8479f0) r4
            java.lang.Object r8 = r2.f41484e
            gy3.f0 r8 = (gy3.C8479f0) r8
            java.lang.Object r10 = r2.f41483d
            wf1.l r10 = (wf1.C15193l) r10
            kotlin.ResultKt.throwOnFailure(r1)
            r16 = r10
            r10 = r0
            r0 = r16
            goto L_0x0154
        L_0x0091:
            kotlin.ResultKt.throwOnFailure(r1)
            gy3.f0 r1 = new gy3.f0
            r1.<init>()
            gy3.f0 r4 = new gy3.f0
            r4.<init>()
            a14.s1 r10 = a14.C0001s1.f0d
            a14.h0 r11 = a14.C53872d1.f151117a
            a14.k2 r11 = f14.C58901s.f168555a
            r12 = 0
            wf1.a0 r13 = new wf1.a0
            r13.<init>(r0, r1, r9)
            r14 = 2
            r15 = 0
            a14.z1 r10 = a14.C53895h.m60466d(r10, r11, r12, r13, r14, r15)
            r4.f27484d = r10
            java.util.UUID r10 = java.util.UUID.randomUUID()
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "randomUUID().toString()"
            gy3.C87412m.m108593f(r10, r11)
            r0.f41374G = r10
            java.lang.String r10 = r0.f41381d
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "[FinderMakePackageOrderRequest] requestId = "
            r11.append(r12)
            java.lang.String r12 = r0.f41374G
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
            gy3.f0 r10 = new gy3.f0
            r10.<init>()
            te3.qb1 r11 = new te3.qb1
            r11.<init>()
            je1.h2 r12 = je1.C46523h2.f125330a
            r13 = 7372(0x1ccc, float:1.033E-41)
            te3.ig0 r12 = r12.mo71859a(r13)
            r11.f140226d = r12
            int r12 = r0.f41379L
            r11.f140227e = r12
            java.util.LinkedList<te3.aw> r12 = r0.f41371D
            r11.f140228f = r12
            long r14 = r0.f41375H
            r11.f140229g = r14
            pe3.b r12 = new pe3.b
            byte[] r14 = f41363P
            r12.<init>(r14)
            r11.f140231i = r12
            long r14 = f41364Q
            r11.f140232j = r14
            long r14 = f41365R
            r11.f140233n = r14
            java.lang.String r12 = r0.f41374G
            r11.f140230h = r12
            zc1.b r12 = zc1.C66785b.f191882e
            java.lang.String r12 = r12.mo90662O5()
            r11.f140234o = r12
            ob0.c$b r12 = new ob0.c$b
            r12.<init>()
            r12.f127069d = r13
            java.lang.String r13 = "/cgi-bin/micromsg-bin/findermakepackageorder"
            r12.f127068c = r13
            r12.f127066a = r11
            te3.rb1 r11 = new te3.rb1
            r11.<init>()
            r12.f127067b = r11
            ob0.c r11 = r12.mo72403a()
            java.lang.Class<ht1.s1> r12 = ht1.C8802s1.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            ht1.s1 r12 = (ht1.C8802s1) r12
            ob0.b r12 = r12.mo9632ui()
            r12.mo123453j(r11)
            r2.f41483d = r0
            r2.f41484e = r1
            r2.f41485f = r4
            r2.f41486g = r10
            r2.f41490n = r8
            java.lang.Object r8 = bi1.C0283d.m245c(r12, r9, r2, r8, r9)
            if (r8 != r3) goto L_0x014f
            goto L_0x01ca
        L_0x014f:
            r16 = r8
            r8 = r1
            r1 = r16
        L_0x0154:
            bi1.e r1 = (bi1.C0287e) r1
            boolean r11 = r1 instanceof bi1.C0288f
            if (r11 == 0) goto L_0x017a
            wx3.f r11 = r1.f854a
            if (r11 != 0) goto L_0x0162
            wx3.f r11 = r2.getContext()
        L_0x0162:
            wf1.w r12 = new wf1.w
            r12.<init>(r1, r9, r0, r10)
            r2.f41483d = r0
            r2.f41484e = r8
            r2.f41485f = r4
            r2.f41486g = r10
            r2.f41487h = r1
            r2.f41490n = r7
            java.lang.Object r7 = a14.C53895h.m60469g(r11, r12, r2)
            if (r7 != r3) goto L_0x017a
            goto L_0x01ca
        L_0x017a:
            r7 = r4
            r4 = r10
            r10 = r0
            r0 = r1
        L_0x017e:
            boolean r1 = r0 instanceof bi1.C0281b
            if (r1 == 0) goto L_0x01a7
            wx3.f r1 = r0.f854a
            if (r1 != 0) goto L_0x018b
            wx3.f r1 = r2.getContext()
        L_0x018b:
            wf1.u r11 = new wf1.u
            r11.<init>(r0, r9, r10)
            r2.f41483d = r8
            r2.f41484e = r7
            r2.f41485f = r4
            r2.f41486g = r0
            r2.f41487h = r9
            r2.f41490n = r6
            java.lang.Object r1 = a14.C53895h.m60469g(r1, r11, r2)
            if (r1 != r3) goto L_0x01a3
            goto L_0x01ca
        L_0x01a3:
            r6 = r7
            r7 = r8
        L_0x01a5:
            r8 = r7
            r7 = r6
        L_0x01a7:
            wx3.f r1 = r0.f854a
            if (r1 != 0) goto L_0x01af
            wx3.f r1 = r2.getContext()
        L_0x01af:
            wf1.v r6 = new wf1.v
            r6.<init>(r9, r7, r8)
            r2.f41483d = r4
            r2.f41484e = r0
            r2.f41485f = r9
            r2.f41486g = r9
            r2.f41487h = r9
            r2.f41490n = r5
            java.lang.Object r0 = a14.C53895h.m60469g(r1, r6, r2)
            if (r0 != r3) goto L_0x01c7
            goto L_0x01ca
        L_0x01c7:
            r0 = r4
        L_0x01c8:
            T r3 = r0.f27484d
        L_0x01ca:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wf1.C15193l.m14279d3(wf1.l, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r10v1, types: [androidx.appcompat.app.AppCompatActivity] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: e3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m14280e3(wf1.C15193l r10) {
        /*
            r10.getClass()
            ok1.e r0 = ok1.C62042e.f176370a
            android.app.Activity r1 = r10.getContext()
            wf1.b0 r2 = new wf1.b0
            r2.<init>(r10)
            java.lang.String r3 = "FinderLiveLegalPromot1"
            boolean r0 = r0.mo87098n(r1, r3, r2)
            if (r0 == 0) goto L_0x0018
            goto L_0x00da
        L_0x0018:
            long r0 = r10.f41375H
            long r2 = r10.f41377J
            r4 = 1
            r5 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x004c
            androidx.appcompat.app.AppCompatActivity r0 = r10.getActivity()
            androidx.appcompat.app.AppCompatActivity r1 = r10.getActivity()
            r2 = 2131827540(0x7f111b54, float:1.9287996E38)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.Class<tf0.q1> r4 = tf0.C13887q1.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            tf0.q1 r4 = (tf0.C13887q1) r4
            long r6 = r10.f41377J
            r10 = 10
            long r8 = (long) r10
            long r6 = r6 / r8
            java.lang.String r10 = r4.Gc0(r6)
            r3[r5] = r10
            java.lang.String r10 = r1.getString(r2, r3)
            nj3.C76912y0.m92773l(r0, r10)
            goto L_0x00da
        L_0x004c:
            java.util.LinkedList<te3.aw> r0 = r10.f41371D
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0057:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0071
            java.lang.Object r2 = r0.next()
            r3 = r2
            te3.aw r3 = (te3.C48769aw) r3
            int r3 = r3.f130787e
            if (r3 <= 0) goto L_0x006a
            r3 = 1
            goto L_0x006b
        L_0x006a:
            r3 = 0
        L_0x006b:
            if (r3 == 0) goto L_0x0057
            r1.add(r2)
            goto L_0x0057
        L_0x0071:
            int r0 = r1.size()
            long r0 = (long) r0
            long r2 = r10.f41378K
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0099
            androidx.appcompat.app.AppCompatActivity r0 = r10.getActivity()
            androidx.appcompat.app.AppCompatActivity r1 = r10.getActivity()
            r2 = 2131827544(0x7f111b58, float:1.9288004E38)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            long r6 = r10.f41378K
            java.lang.Long r10 = java.lang.Long.valueOf(r6)
            r3[r5] = r10
            java.lang.String r10 = r1.getString(r2, r3)
            nj3.C76912y0.m92773l(r0, r10)
            goto L_0x00da
        L_0x0099:
            gy3.f0 r0 = new gy3.f0
            r0.<init>()
            gy3.f0 r1 = new gy3.f0
            r1.<init>()
            a14.s1 r2 = a14.C0001s1.f0d
            r3 = 0
            r4 = 0
            wf1.d0 r5 = new wf1.d0
            r8 = 0
            r5.<init>(r10, r0, r8)
            r6 = 3
            r7 = 0
            a14.z1 r2 = a14.C53895h.m60466d(r2, r3, r4, r5, r6, r7)
            r1.f27484d = r2
            te3.hz0 r2 = new te3.hz0
            r2.<init>()
            ob0.b r2 = r2.mo73341b()
            nr3.e r2 = r2.mo9225i()
            wf1.c0 r3 = new wf1.c0
            r3.<init>(r0, r1, r10)
            r2.mo123420E(r3)
            androidx.appcompat.app.AppCompatActivity r10 = r10.getActivity()
            boolean r0 = r10 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r0 == 0) goto L_0x00d5
            r8 = r10
            com.tencent.mm.ui.MMActivity r8 = (com.tencent.p014mm.p136ui.MMActivity) r8
        L_0x00d5:
            if (r8 == 0) goto L_0x00da
            r2.mo11397F(r8)
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wf1.C15193l.m14280e3(wf1.l):void");
    }

    /* renamed from: f3 */
    public static final void m14281f3(C15193l lVar, String str) {
        String str2 = lVar.f41381d;
        Log.m105924i(str2, "refreshGiftPkg, target_level:" + lVar.f41379L + ", scene:" + str);
        lVar.f41371D.clear();
        View view = (View) ((C36570n) lVar.f41393s).getValue();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC", "refreshGiftPkg", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC", "refreshGiftPkg", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        lVar.mo14132i3().setVisibility(8);
        View view2 = (View) ((C36570n) lVar.f41394t).getValue();
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(4);
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC", "refreshGiftPkg", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC", "refreshGiftPkg", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view3 = (View) ((C36570n) lVar.f41396v).getValue();
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(4);
        C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC", "refreshGiftPkg", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC", "refreshGiftPkg", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((TextView) ((C36570n) lVar.f41386i).getValue()).setEnabled(false);
        lVar.mo14134k3(false);
        C52149yp0 yp02 = new C52149yp0();
        yp02.f145450d = C46523h2.f125330a.mo71859a(8970);
        yp02.f145451e = lVar.f41379L;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 8970;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findergetuplevelproduct";
        bVar.f127066a = yp02;
        bVar.f127067b = new C52291zp0();
        C47350c a = bVar.mo72403a();
        C89132b ui = ((C8802s1) C86312j.m106911c(C8802s1.class)).mo9632ui();
        ui.mo123453j(a);
        C89059e i = ui.mo9225i();
        C87412m.m108593f(i, "FinderGetUpLevelProductR…      }.createCgi().run()");
        C88629c J = C61926c.m72665J(i, new C15176e0(lVar, str));
        AppCompatActivity activity = lVar.getActivity();
        MMActivity mMActivity = activity instanceof MMActivity ? (MMActivity) activity : null;
        if (mMActivity != null) {
            J.mo11397F(mMActivity);
        }
    }

    /* renamed from: g3 */
    public final View mo14131g3() {
        return (View) ((C36570n) this.f41382e).getValue();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cbr;
    }

    /* renamed from: i3 */
    public final MaxHeightWxRecyclerView mo14132i3() {
        return (MaxHeightWxRecyclerView) ((C36570n) this.f41384g).getValue();
    }

    /* renamed from: j3 */
    public final LinkedHashMap<String, Integer> mo14133j3() {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        int i = ((C50852pn2) C110818d0.m150914L(this.f41376I)).f139839d;
        int i2 = ((C50852pn2) C110818d0.m150923U(this.f41376I)).f139839d;
        int i3 = f41362N + 1;
        if (i3 > i) {
            i = i3;
        }
        this.f41370C.clear();
        if (i <= i2) {
            while (true) {
                String string = getActivity().getString(C0966R.string.n9l, new Object[]{Integer.valueOf(i)});
                C87412m.m108593f(string, "activity.getString(R.str…_gift_level_item_text, i)");
                linkedHashMap.put(string, Integer.valueOf(i));
                this.f41370C.add(Integer.valueOf(i));
                if (i == i2) {
                    break;
                }
                i++;
            }
        }
        return linkedHashMap;
    }

    /* renamed from: k3 */
    public final void mo14134k3(boolean z) {
        if (z) {
            View g3 = mo14131g3();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = g3;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC", "refreshEditLevelView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            g3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC", "refreshEditLevelView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo14131g3().setOnClickListener(new C15214t(this));
            return;
        }
        View g35 = mo14131g3();
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(4);
        View view2 = g35;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC", "refreshEditLevelView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        g35.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC", "refreshEditLevelView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo14131g3().setOnClickListener((View.OnClickListener) null);
    }

    /* renamed from: l3 */
    public final void mo14135l3(Integer num) {
        int intValue = num != null ? num.intValue() : this.f41379L;
        ((TextView) ((C36570n) this.f41383f).getValue()).setText(String.valueOf(intValue));
        ((View) ((C36570n) this.f41389o).getValue()).setBackground(getActivity().getResources().getDrawable(new C15465r(C15483x.MODE_DARK, C15484y.SIZE_LARGE).mo14282k(intValue)));
        Resources resources = getActivity().getResources();
        C15465r.C15476k kVar = C15465r.f41958c;
        ((ImageView) ((C36570n) this.f41388n).getValue()).setImageDrawable(resources.getDrawable(kVar.mo14283a(intValue)));
        ((ImageView) ((C36570n) this.f41387j).getValue()).setImageDrawable(getActivity().getResources().getDrawable(kVar.mo14283a(intValue)));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f41379L = f41362N + 1;
        mo14135l3((Integer) null);
        TextView textView = (TextView) ((C36570n) this.f41385h).getValue();
        C87412m.m108593f(textView, "giftTotalPrice");
        C7919x.m8091a(textView);
        ((TextView) ((C36570n) this.f41385h).getValue()).setText("");
        ((TextView) ((C36570n) this.f41386i).getValue()).post(new C15230p(this));
        MaxHeightWxRecyclerView i3 = mo14132i3();
        i3.setLayoutManager(new GridLayoutManager(getActivity(), this.f41398x));
        i3.mo17085h0(new C15232q(this));
        i3.setAdapter((C15195b) ((C36570n) this.f41369B).getValue());
        ((View) ((C36570n) this.f41390p).getValue()).setOnClickListener(new C15234r(this));
        ((View) ((C36570n) this.f41392r).getValue()).setOnClickListener(new C15236s(this));
        ((TextView) ((C36570n) this.f41386i).getValue()).setOnClickListener(new C15239t(this));
        mo14135l3((Integer) null);
    }

    public void onPause() {
        super.onPause();
        KeyboardHeightProvider keyboardHeightProvider = this.f41380M;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104021d();
        }
    }

    public void onResume() {
        View decorView;
        super.onResume();
        C62042e.f176370a.mo87013I1(1);
        Window window = getActivity().getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.post(new C15210q(this));
        }
    }
}
