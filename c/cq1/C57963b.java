package cq1;

import ac2.C53996a;
import ac2.C53997b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.p136ui.base.AlphabetScrollBar;
import com.tencent.p014mm.p136ui.base.VerticalScrollBar;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.finder.p056ui.p799at.FinderAtSomeoneLiveList;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import jq3.C9500j;
import k20.C60958c;
import k20.C9556a;
import nl3.C47276a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;
import zb2.C103009m;
import zb2.C53769h;

/* renamed from: cq1.b */
public abstract class C57963b extends C47276a implements FTSEditTextView.C45051l {

    /* renamed from: A */
    public String f165865A;

    /* renamed from: B */
    public final C13601g f165866B;

    /* renamed from: s */
    public final Boolean f165867s;

    /* renamed from: t */
    public final C57962a f165868t;

    /* renamed from: u */
    public FTSEditTextView f165869u;

    /* renamed from: v */
    public WxRecyclerView f165870v;

    /* renamed from: w */
    public AlphabetScrollBar f165871w;

    /* renamed from: x */
    public final C13601g f165872x = C36568h.m40985a(new C57970g(this));

    /* renamed from: y */
    public final C13601g f165873y = C36568h.m40985a(new C57964a(this));

    /* renamed from: z */
    public final C13601g f165874z;

    /* renamed from: cq1.b$a */
    public static final class C57964a extends C87413o implements C32224a<C103009m<C57974g>> {

        /* renamed from: d */
        public final /* synthetic */ C57963b f165875d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57964a(C57963b bVar) {
            super(0);
            this.f165875d = bVar;
        }

        public Object invoke() {
            return new C103009m(this.f165875d.mo82769Q(), this.f165875d.mo77761L(), false, 4, (C8480h) null);
        }
    }

    /* renamed from: cq1.b$b */
    public static final class C57965b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C57963b f165876d;

        public C57965b(C57963b bVar) {
            this.f165876d = bVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/at/BaseFinderAtSomeoneDialog$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f165876d.cancel();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/at/BaseFinderAtSomeoneDialog$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: cq1.b$c */
    public static final class C57966c implements VerticalScrollBar.C6756b {

        /* renamed from: d */
        public final /* synthetic */ C57963b f165877d;

        public C57966c(C57963b bVar) {
            this.f165877d = bVar;
        }

        /* renamed from: S0 */
        public final void mo5638S0(String str) {
            C57963b bVar = this.f165877d;
            if (!C87412m.m108589b(bVar.f165865A, str)) {
                C87412m.m108593f(str, LocaleUtil.ITALIAN);
                bVar.f165865A = str;
            }
            if (C87412m.m108589b(str, "🔍")) {
                WxLinearLayoutManager wxLinearLayoutManager = (WxLinearLayoutManager) ((C36570n) bVar.f165874z).getValue();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                aVar.mo10233c(0);
                WxLinearLayoutManager wxLinearLayoutManager2 = wxLinearLayoutManager;
                C117292a.m165358d(wxLinearLayoutManager2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/at/BaseFinderAtSomeoneDialog$initContentView$2", "onScollBarTouch", "(Ljava/lang/String;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                wxLinearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                C117292a.m165359e(wxLinearLayoutManager2, "com/tencent/mm/plugin/finder/ui/at/BaseFinderAtSomeoneDialog$initContentView$2", "onScollBarTouch", "(Ljava/lang/String;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                return;
            }
            Iterator<T> it = bVar.mo82769Q().f272353o.iterator();
            int i = 0;
            while (it.hasNext()) {
                T next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    C57974g gVar = (C57974g) next;
                    if (!C87412m.m108589b(gVar.f165891n, str) || !gVar.f165889i) {
                        i = i2;
                    } else {
                        WxLinearLayoutManager wxLinearLayoutManager3 = (WxLinearLayoutManager) ((C36570n) bVar.f165874z).getValue();
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(0);
                        aVar2.mo10233c(Integer.valueOf(i));
                        WxLinearLayoutManager wxLinearLayoutManager4 = wxLinearLayoutManager3;
                        C117292a.m165358d(wxLinearLayoutManager4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/ui/at/BaseFinderAtSomeoneDialog$initContentView$2", "onScollBarTouch", "(Ljava/lang/String;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                        wxLinearLayoutManager3.mo16973V(((Integer) aVar2.mo10231a(0)).intValue(), ((Integer) aVar2.mo10231a(1)).intValue());
                        C117292a.m165359e(wxLinearLayoutManager4, "com/tencent/mm/plugin/finder/ui/at/BaseFinderAtSomeoneDialog$initContentView$2", "onScollBarTouch", "(Ljava/lang/String;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                        return;
                    }
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
    }

    /* renamed from: cq1.b$d */
    public static final class C57967d<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C57963b f165878d;

        public C57967d(C57963b bVar) {
            this.f165878d = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r3 = r2.f165878d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onChanged(java.lang.Object r3) {
            /*
                r2 = this;
                ac2.j r3 = (ac2.C91988j) r3
                ac2.k r3 = r3.f263327a
                ac2.k r0 = ac2.C39535k.UIRefresh
                if (r3 != r0) goto L_0x0025
                cq1.b r3 = r2.f165878d
                com.tencent.mm.ui.base.AlphabetScrollBar r0 = r3.f165871w
                if (r0 == 0) goto L_0x0025
                com.tencent.mm.plugin.finder.ui.at.FinderAtSomeoneLiveList r3 = r3.mo82769Q()
                java.util.ArrayList<java.lang.String> r3 = r3.f161183z
                r1 = 0
                java.lang.String[] r1 = new java.lang.String[r1]
                java.lang.Object[] r3 = r3.toArray(r1)
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                gy3.C87412m.m108592e(r3, r1)
                java.lang.String[] r3 = (java.lang.String[]) r3
                r0.setAlphabet(r3)
            L_0x0025:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cq1.C57963b.C57967d.onChanged(java.lang.Object):void");
        }
    }

    /* renamed from: cq1.b$e */
    public static final class C57968e extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C57963b f165879d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57968e(C57963b bVar) {
            super(1);
            this.f165879d = bVar;
        }

        public Object invoke(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                this.f165879d.dismiss();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cq1.b$f */
    public static final class C57969f extends C87413o implements C32224a<WxLinearLayoutManager> {

        /* renamed from: d */
        public final /* synthetic */ Context f165880d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57969f(Context context) {
            super(0);
            this.f165880d = context;
        }

        public Object invoke() {
            return new WxLinearLayoutManager(this.f165880d);
        }
    }

    /* renamed from: cq1.b$g */
    public static final class C57970g extends C87413o implements C32224a<FinderAtSomeoneLiveList> {

        /* renamed from: d */
        public final /* synthetic */ C57963b f165881d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57970g(C57963b bVar) {
            super(0);
            this.f165881d = bVar;
        }

        public Object invoke() {
            C53996a<C57974g> N = this.f165881d.mo77763N();
            C53997b<C57974g, String> O = this.f165881d.mo77764O();
            C53769h hVar = new C53769h();
            hVar.f150921b = Integer.MAX_VALUE;
            C13598b0 b0Var = C13598b0.f38549a;
            return new FinderAtSomeoneLiveList(N, O, hVar, this.f165881d);
        }
    }

    /* renamed from: cq1.b$h */
    public static final class C57971h extends C87413o implements C32224a<C57972c> {

        /* renamed from: d */
        public final /* synthetic */ C57963b f165882d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57971h(C57963b bVar) {
            super(0);
            this.f165882d = bVar;
        }

        public Object invoke() {
            return new C57972c(this.f165882d);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57963b(Context context, Boolean bool, C57962a aVar) {
        super(context);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "callback");
        this.f165867s = bool;
        this.f165868t = aVar;
        this.f165874z = C36568h.m40985a(new C57969f(context));
        this.f165865A = "";
        this.f165866B = C36568h.m40985a(new C57971h(this));
    }

    /* renamed from: D */
    public void mo3000D(boolean z) {
    }

    /* renamed from: G */
    public View mo6265G() {
        View inflate = LayoutInflater.from(getContext()).inflate(mo77766P(), (ViewGroup) null);
        C87412m.m108593f(inflate, "from(context).inflate(getLayoutId(), null)");
        return inflate;
    }

    /* JADX WARNING: type inference failed for: r0v28, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x018b  */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6266H() {
        /*
            r6 = this;
            super.mo6266H()
            android.view.View r0 = r6.f126905i
            r1 = 2131299709(0x7f090d7d, float:1.8217427E38)
            if (r0 == 0) goto L_0x0018
            android.view.View r0 = r0.findViewById(r1)
            if (r0 == 0) goto L_0x0018
            cq1.b$b r2 = new cq1.b$b
            r2.<init>(r6)
            r0.setOnClickListener(r2)
        L_0x0018:
            android.content.Context r0 = r6.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            r2 = 2
            r3 = 0
            if (r0 != r2) goto L_0x00a1
            android.view.View r0 = r6.f126906j
            if (r0 == 0) goto L_0x0033
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            goto L_0x0034
        L_0x0033:
            r0 = r3
        L_0x0034:
            r2 = 1140850688(0x44000000, float:512.0)
            if (r0 != 0) goto L_0x0039
            goto L_0x0043
        L_0x0039:
            android.content.Context r4 = r6.getContext()
            int r4 = x50.C15626c.m14629a(r4, r2)
            r0.width = r4
        L_0x0043:
            android.view.View r0 = r6.f126906j
            if (r0 == 0) goto L_0x004c
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            goto L_0x004d
        L_0x004c:
            r0 = r3
        L_0x004d:
            boolean r4 = r0 instanceof android.widget.RelativeLayout.LayoutParams
            if (r4 == 0) goto L_0x0054
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
            goto L_0x0055
        L_0x0054:
            r0 = r3
        L_0x0055:
            r4 = 14
            if (r0 == 0) goto L_0x005c
            r0.addRule(r4)
        L_0x005c:
            android.view.View r0 = r6.f126905i
            if (r0 == 0) goto L_0x0065
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            goto L_0x0066
        L_0x0065:
            r0 = r3
        L_0x0066:
            if (r0 != 0) goto L_0x0069
            goto L_0x0073
        L_0x0069:
            android.content.Context r5 = r6.getContext()
            int r2 = x50.C15626c.m14629a(r5, r2)
            r0.width = r2
        L_0x0073:
            android.view.View r0 = r6.f126905i
            if (r0 == 0) goto L_0x007c
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            goto L_0x007d
        L_0x007c:
            r0 = r3
        L_0x007d:
            boolean r2 = r0 instanceof android.widget.RelativeLayout.LayoutParams
            if (r2 == 0) goto L_0x0084
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
            goto L_0x0085
        L_0x0084:
            r0 = r3
        L_0x0085:
            if (r0 == 0) goto L_0x008a
            r0.addRule(r4)
        L_0x008a:
            android.view.View r0 = r6.f126904h
            if (r0 == 0) goto L_0x0093
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            goto L_0x0094
        L_0x0093:
            r0 = r3
        L_0x0094:
            if (r0 != 0) goto L_0x0097
            goto L_0x00a1
        L_0x0097:
            android.content.Context r2 = r6.getContext()
            int r2 = com.tencent.p014mm.p136ui.C75044y4.m89994f(r2)
            r0.height = r2
        L_0x00a1:
            java.lang.Boolean r0 = r6.f165867s
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r0 = gy3.C87412m.m108589b(r0, r2)
            if (r0 == 0) goto L_0x00b9
            android.view.View r0 = r6.f126905i
            if (r0 == 0) goto L_0x00c7
            r4 = 2131305243(0x7f09231b, float:1.8228651E38)
            android.view.View r0 = r0.findViewById(r4)
            com.tencent.mm.ui.search.FTSEditTextView r0 = (com.tencent.p014mm.p136ui.search.FTSEditTextView) r0
            goto L_0x00c8
        L_0x00b9:
            android.view.View r0 = r6.f126905i
            if (r0 == 0) goto L_0x00c7
            r4 = 2131305242(0x7f09231a, float:1.822865E38)
            android.view.View r0 = r0.findViewById(r4)
            com.tencent.mm.ui.search.FTSEditTextView r0 = (com.tencent.p014mm.p136ui.search.FTSEditTextView) r0
            goto L_0x00c8
        L_0x00c7:
            r0 = r3
        L_0x00c8:
            r6.f165869u = r0
            if (r0 != 0) goto L_0x00cd
            goto L_0x00d1
        L_0x00cd:
            r4 = 0
            r0.setVisibility(r4)
        L_0x00d1:
            com.tencent.mm.ui.search.FTSEditTextView r0 = r6.f165869u
            if (r0 == 0) goto L_0x00d8
            r0.mo70338f()
        L_0x00d8:
            com.tencent.mm.ui.search.FTSEditTextView r0 = r6.f165869u
            if (r0 == 0) goto L_0x00df
            r0.setFtsEditTextListener(r6)
        L_0x00df:
            com.tencent.mm.ui.search.FTSEditTextView r0 = r6.f165869u
            if (r0 == 0) goto L_0x00f5
            android.content.Context r4 = r6.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131821674(0x7f11046a, float:1.9276098E38)
            java.lang.String r4 = r4.getString(r5)
            r0.setHint(r4)
        L_0x00f5:
            com.tencent.mm.ui.search.FTSEditTextView r0 = r6.f165869u
            if (r0 == 0) goto L_0x0101
            r4 = 1
            r5 = 1099431936(0x41880000, float:17.0)
            android.widget.EditText r0 = r0.f122158g
            r0.setTextSize(r4, r5)
        L_0x0101:
            android.view.View r0 = r6.f126905i
            if (r0 == 0) goto L_0x010f
            r4 = 2131299052(0x7f090aec, float:1.8216095E38)
            android.view.View r0 = r0.findViewById(r4)
            com.tencent.mm.view.recyclerview.WxRecyclerView r0 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r0
            goto L_0x0110
        L_0x010f:
            r0 = r3
        L_0x0110:
            r6.f165870v = r0
            if (r0 != 0) goto L_0x0115
            goto L_0x0122
        L_0x0115:
            rx3.g r4 = r6.f165873y
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            zb2.m r4 = (zb2.C103009m) r4
            r0.setAdapter(r4)
        L_0x0122:
            com.tencent.mm.view.recyclerview.WxRecyclerView r0 = r6.f165870v
            if (r0 != 0) goto L_0x0127
            goto L_0x0134
        L_0x0127:
            rx3.g r4 = r6.f165874z
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            com.tencent.mm.view.recyclerview.WxLinearLayoutManager r4 = (com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager) r4
            r0.setLayoutManager(r4)
        L_0x0134:
            rx3.g r0 = r6.f165873y
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            zb2.m r0 = (zb2.C103009m) r0
            rx3.g r4 = r6.f165866B
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            cq1.c r4 = (cq1.C57972c) r4
            r0.f165746y = r4
            android.view.View r0 = r6.f126905i
            if (r0 == 0) goto L_0x0158
            r4 = 2131296918(0x7f090296, float:1.8211766E38)
            android.view.View r0 = r0.findViewById(r4)
            com.tencent.mm.ui.base.AlphabetScrollBar r0 = (com.tencent.p014mm.p136ui.base.AlphabetScrollBar) r0
            goto L_0x0159
        L_0x0158:
            r0 = r3
        L_0x0159:
            r6.f165871w = r0
            if (r0 == 0) goto L_0x0165
            cq1.b$c r4 = new cq1.b$c
            r4.<init>(r6)
            r0.setOnScrollBarTouchListener(r4)
        L_0x0165:
            com.tencent.mm.ui.base.AlphabetScrollBar r0 = r6.f165871w
            if (r0 == 0) goto L_0x0175
            java.lang.String r4 = "🔍"
            java.lang.String r5 = "#"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}
            r0.setAlphabet(r4)
        L_0x0175:
            com.tencent.mm.plugin.finder.ui.at.FinderAtSomeoneLiveList r0 = r6.mo82769Q()
            androidx.lifecycle.LiveData<ac2.j<T>> r0 = r0.f272358t
            cq1.b$d r4 = new cq1.b$d
            r4.<init>(r6)
            r0.observe(r6, r4)
            java.lang.Boolean r0 = r6.f165867s
            boolean r0 = gy3.C87412m.m108589b(r0, r2)
            if (r0 == 0) goto L_0x022a
            android.view.View r0 = r6.f126906j
            if (r0 != 0) goto L_0x0190
            goto L_0x0193
        L_0x0190:
            r0.setBackground(r3)
        L_0x0193:
            android.view.View r0 = r6.f126905i
            if (r0 == 0) goto L_0x019d
            r2 = 2131233296(0x7f080a10, float:1.8082725E38)
            r0.setBackgroundResource(r2)
        L_0x019d:
            android.view.View r0 = r6.f126905i
            if (r0 == 0) goto L_0x01bb
            android.view.View r0 = r0.findViewById(r1)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r0
            if (r0 == 0) goto L_0x01bb
            android.content.Context r1 = r6.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131099940(0x7f060124, float:1.7812247E38)
            int r1 = r1.getColor(r2)
            r0.setIconColor(r1)
        L_0x01bb:
            android.view.View r0 = r6.f126905i
            if (r0 == 0) goto L_0x01d3
            r1 = 2131315432(0x7f094ae8, float:1.8249317E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x01d3
            java.lang.String r1 = "#CCFFFFFF"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setTextColor(r1)
        L_0x01d3:
            android.view.View r0 = r6.f126905i
            if (r0 == 0) goto L_0x01eb
            r1 = 2131312920(0x7f094118, float:1.8244222E38)
            android.view.View r0 = r0.findViewById(r1)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r0
            if (r0 == 0) goto L_0x01eb
            java.lang.String r1 = "#6B6B6B"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setIconColor(r1)
        L_0x01eb:
            android.view.View r0 = r6.f126905i
            if (r0 == 0) goto L_0x01fd
            int r1 = com.tencent.tavkit.C26968R.C26971id.search_bar
            android.view.View r0 = r0.findViewById(r1)
            if (r0 == 0) goto L_0x01fd
            r1 = 2131232322(0x7f080642, float:1.808075E38)
            r0.setBackgroundResource(r1)
        L_0x01fd:
            com.tencent.mm.ui.base.AlphabetScrollBar r0 = r6.f165871w
            if (r0 == 0) goto L_0x0213
            android.content.Context r1 = r6.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131099696(0x7f060030, float:1.7811752E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
        L_0x0213:
            com.tencent.mm.ui.base.AlphabetScrollBar r0 = r6.f165871w
            if (r0 == 0) goto L_0x023c
            android.content.Context r1 = r6.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131099697(0x7f060031, float:1.7811755E38)
            int r1 = r1.getColor(r2)
            r0.setSearchIconColor(r1)
            goto L_0x023c
        L_0x022a:
            android.view.View r0 = r6.f126906j
            if (r0 != 0) goto L_0x022f
            goto L_0x0232
        L_0x022f:
            r0.setBackground(r3)
        L_0x0232:
            android.view.View r0 = r6.f126905i
            if (r0 == 0) goto L_0x023c
            r1 = 2131233295(0x7f080a0f, float:1.8082723E38)
            r0.setBackgroundResource(r1)
        L_0x023c:
            android.view.View r0 = r6.f126905i
            if (r0 == 0) goto L_0x024a
            r1 = 2131303134(0x7f091ade, float:1.8224374E38)
            android.view.View r0 = r0.findViewById(r1)
            r3 = r0
            com.tencent.mm.ui.widget.LiveBottomSheetPanel r3 = (com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel) r3
        L_0x024a:
            if (r3 != 0) goto L_0x024d
            goto L_0x0255
        L_0x024d:
            cq1.b$e r0 = new cq1.b$e
            r0.<init>(r6)
            r3.setOnVisibilityListener(r0)
        L_0x0255:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cq1.C57963b.mo6266H():void");
    }

    /* renamed from: L */
    public abstract C9500j mo77761L();

    /* renamed from: M */
    public abstract String mo77762M(C72996z1 z1Var);

    /* renamed from: N */
    public abstract C53996a<C57974g> mo77763N();

    /* renamed from: O */
    public abstract C53997b<C57974g, String> mo77764O();

    /* renamed from: P */
    public abstract int mo77766P();

    /* renamed from: Q */
    public final FinderAtSomeoneLiveList mo82769Q() {
        return (FinderAtSomeoneLiveList) ((C36570n) this.f165872x).getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: b3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3001b3(java.lang.String r1, java.lang.String r2, java.util.List<com.tencent.p014mm.p136ui.search.FTSSearchView.C6996f> r3, com.tencent.p014mm.p136ui.search.FTSEditTextView.C45052m r4) {
        /*
            r0 = this;
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0023
            boolean r4 = z04.C112551y.m153811k(r1)
            r4 = r4 ^ r2
            if (r4 == 0) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r1 = r3
        L_0x000d:
            if (r1 == 0) goto L_0x0023
            com.tencent.mm.plugin.finder.ui.at.FinderAtSomeoneLiveList r4 = r0.mo82769Q()
            r4.mo80726u(r1)
            com.tencent.mm.ui.base.AlphabetScrollBar r1 = r0.f165871w
            if (r1 != 0) goto L_0x001b
            goto L_0x0020
        L_0x001b:
            r4 = 8
            r1.setVisibility(r4)
        L_0x0020:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0024
        L_0x0023:
            r1 = r3
        L_0x0024:
            if (r1 != 0) goto L_0x0046
            com.tencent.mm.plugin.finder.ui.at.FinderAtSomeoneLiveList r1 = r0.mo82769Q()
            ac2.b<T, Q> r4 = r1.f163774x
            r4.mo74668f()
            a14.z1 r1 = r1.f163775y
            if (r1 == 0) goto L_0x0036
            a14.C53973z1.C53974a.m60623a(r1, r3, r2, r3)
        L_0x0036:
            com.tencent.mm.plugin.finder.ui.at.FinderAtSomeoneLiveList r1 = r0.mo82769Q()
            r1.mo129609m()
            com.tencent.mm.ui.base.AlphabetScrollBar r1 = r0.f165871w
            if (r1 != 0) goto L_0x0042
            goto L_0x0046
        L_0x0042:
            r2 = 0
            r1.setVisibility(r2)
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cq1.C57963b.mo3001b3(java.lang.String, java.lang.String, java.util.List, com.tencent.mm.ui.search.FTSEditTextView$m):void");
    }

    /* renamed from: m7 */
    public void mo3004m7(int i, FTSSearchView.C6996f fVar) {
    }

    public void onClickClearTextBtn(View view) {
    }

    /* renamed from: y */
    public boolean mo3009y() {
        return true;
    }
}
