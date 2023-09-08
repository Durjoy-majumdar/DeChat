package xs1;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.FlowTextMixView;
import com.tencent.p014mm.plugin.finder.view.UnchangeTextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import d60.C58124b;
import er1.C7813i5;
import er1.C7919x;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import nr3.C89059e;
import ok1.C62042e;
import p849e3.C107168a0;
import p849e3.C107207u;
import qj1.C62660c;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C51215sa1;
import vs1.C15003o;
import ws1.C15591a;

/* renamed from: xs1.o */
public final class C15883o extends C62660c {

    /* renamed from: G */
    public static final C15888e f42743G = new C15888e((C8480h) null);

    /* renamed from: A */
    public C15003o f42744A;

    /* renamed from: B */
    public CountDownTimer f42745B;

    /* renamed from: C */
    public final C7813i5 f42746C;

    /* renamed from: D */
    public int f42747D;

    /* renamed from: E */
    public int f42748E;

    /* renamed from: F */
    public String f42749F;

    /* renamed from: p */
    public final C58124b f42750p;

    /* renamed from: q */
    public LinearLayout f42751q;

    /* renamed from: r */
    public UnchangeTextView f42752r;

    /* renamed from: s */
    public UnchangeTextView f42753s;

    /* renamed from: t */
    public UnchangeTextView f42754t;

    /* renamed from: u */
    public FlowTextMixView f42755u;

    /* renamed from: v */
    public WxRecyclerView f42756v;

    /* renamed from: w */
    public UnchangeTextView f42757w;

    /* renamed from: x */
    public RelativeLayout f42758x;

    /* renamed from: y */
    public TextView f42759y;

    /* renamed from: z */
    public LinearLayout f42760z;

    /* renamed from: xs1.o$a */
    public static final class C15884a extends C87413o implements C32227p<List<? extends Integer>, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C15883o f42761d;

        /* renamed from: e */
        public final /* synthetic */ ViewGroup f42762e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15884a(C15883o oVar, ViewGroup viewGroup) {
            super(2);
            this.f42761d = oVar;
            this.f42762e = viewGroup;
        }

        public Object invoke(Object obj, Object obj2) {
            String str;
            List list = (List) obj;
            int intValue = ((Number) obj2).intValue();
            Class cls = C54991o.class;
            C87412m.m108594g(list, "choiceList");
            if (((C54991o) this.f42761d.mo87696x0(cls)).f154280X3) {
                this.f42761d.f42746C.begin();
                C39622i0 x0 = this.f42761d.mo87696x0(C55001u.class);
                C15883o oVar = this.f42761d;
                ViewGroup viewGroup = this.f42762e;
                C55001u uVar = (C55001u) x0;
                long j = uVar.f154420q.f182392d;
                long j2 = uVar.f154416j;
                String str2 = uVar.f154423t;
                C51215sa1 sa12 = ((C54991o) oVar.mo87696x0(cls)).f154275W3;
                if (sa12 == null || (str = sa12.f141393i) == null) {
                    str = "";
                }
                C89059e i = new C15591a(j, j2, str2, list, str, uVar.f154417n).mo9225i();
                i.mo123420E(new C15882n(oVar, intValue, viewGroup));
                Context context = viewGroup.getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                i.mo11397F((MMActivity) context);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: xs1.o$b */
    public static final class C15885b implements View.OnClickListener {

        /* renamed from: d */
        public static final C15885b f42763d = new C15885b();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteCardPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("FinderLiveVoteCardPlugin", "click cardlayout");
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteCardPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: xs1.o$c */
    public static final class C15886c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C15883o f42764d;

        public C15886c(C15883o oVar) {
            this.f42764d = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteCardPlugin$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f42764d.mo10792g(8);
            this.f42764d.mo14534b1(8);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteCardPlugin$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: xs1.o$d */
    public static final class C15887d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C15883o f42765d;

        public C15887d(C15883o oVar) {
            this.f42765d = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteCardPlugin$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f42765d.mo10792g(8);
            this.f42765d.mo14534b1(8);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteCardPlugin$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: xs1.o$e */
    public static final class C15888e {
        public C15888e(C8480h hVar) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15883o(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f42750p = bVar;
        C7813i5.C7814a aVar = C7813i5.f26336f;
        Context context = viewGroup.getContext();
        C87412m.m108593f(context, "root.context");
        this.f42746C = C7813i5.C7814a.m7953a(aVar, context, viewGroup.getContext().getResources().getString(C0966R.string.ett), 500, (DialogInterface.OnCancelListener) null, 8, (Object) null);
        this.f42751q = (LinearLayout) viewGroup.findViewById(C0966R.C0970id.f359533nh3);
        this.f42752r = (UnchangeTextView) viewGroup.findViewById(C0966R.C0970id.f359531nh1);
        this.f42756v = (WxRecyclerView) viewGroup.findViewById(C0966R.C0970id.f359530nh0);
        this.f42753s = (UnchangeTextView) viewGroup.findViewById(C0966R.C0970id.nh7);
        this.f42754t = (UnchangeTextView) viewGroup.findViewById(C0966R.C0970id.ngz);
        this.f42755u = (FlowTextMixView) viewGroup.findViewById(C0966R.C0970id.nh6);
        this.f42757w = (UnchangeTextView) viewGroup.findViewById(C0966R.C0970id.ngy);
        this.f42758x = (RelativeLayout) viewGroup.findViewById(C0966R.C0970id.f359532nh2);
        this.f42759y = (TextView) viewGroup.findViewById(C0966R.C0970id.nh5);
        WxRecyclerView wxRecyclerView = this.f42756v;
        if (wxRecyclerView != null) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107213g.m145235t(wxRecyclerView, false);
        }
        C15003o oVar = new C15003o(viewGroup, mo87684A0());
        this.f42744A = oVar;
        WxRecyclerView wxRecyclerView2 = this.f42756v;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setAdapter(oVar);
        }
        WxRecyclerView wxRecyclerView3 = this.f42756v;
        if (wxRecyclerView3 != null) {
            wxRecyclerView3.setLayoutManager(new LinearLayoutManager(viewGroup.getContext()));
        }
        this.f42760z = (LinearLayout) viewGroup.findViewById(C0966R.C0970id.nh4);
        C15003o oVar2 = this.f42744A;
        if (oVar2 != null) {
            oVar2.f41123g = new C15884a(this, viewGroup);
        }
        LinearLayout linearLayout = this.f42751q;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(C15885b.f42763d);
        }
        viewGroup.setOnClickListener(new C15886c(this));
        RelativeLayout relativeLayout = this.f42758x;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new C15887d(this));
        }
        UnchangeTextView unchangeTextView = this.f42753s;
        if (unchangeTextView != null) {
            C7919x.m8091a(unchangeTextView);
        }
        UnchangeTextView unchangeTextView2 = this.f42757w;
        if (unchangeTextView2 != null) {
            C7919x.m8091a(unchangeTextView2);
        }
        TextView textView = this.f42759y;
        if (textView != null) {
            C7919x.m8091a(textView);
        }
        this.f42749F = "";
    }

    /* renamed from: Z0 */
    public final boolean mo14532Z0() {
        return C62042e.f176370a.mo87027N0() || ((C54991o) mo87696x0(C54991o.class)).f154190D;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0131, code lost:
        if ((r0 != null && r0.f141392h == 4) != false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006b, code lost:
        if ((r0 != null && r0.f141392h == 4) != false) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x017c A[LOOP:0: B:148:0x0176->B:150:0x017c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* renamed from: a1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14533a1() {
        /*
            r13 = this;
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            androidx.lifecycle.i0 r0 = r13.mo87696x0(r0)
            cl1.o r0 = (cl1.C54991o) r0
            te3.sa1 r0 = r0.f154275W3
            if (r0 == 0) goto L_0x000f
            java.lang.String r1 = r0.f141393i
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            java.lang.String r2 = r13.f42749F
            boolean r1 = gy3.C87412m.m108589b(r1, r2)
            r2 = 8
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x0032
            java.lang.String r1 = r13.f42749F
            if (r1 == 0) goto L_0x0029
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            if (r1 != 0) goto L_0x0032
            r13.mo10792g(r2)
            r13.mo14534b1(r2)
        L_0x0032:
            r13.mo14536d1()
            if (r0 == 0) goto L_0x003a
            int r1 = r0.f141391g
            goto L_0x003b
        L_0x003a:
            r1 = 0
        L_0x003b:
            r5 = 3
            r6 = 4
            if (r1 > 0) goto L_0x00e4
            if (r0 == 0) goto L_0x0047
            int r1 = r0.f141392h
            if (r1 != r3) goto L_0x0047
            r1 = 1
            goto L_0x0048
        L_0x0047:
            r1 = 0
        L_0x0048:
            if (r1 != 0) goto L_0x00b2
            if (r0 == 0) goto L_0x0053
            int r1 = r0.f141392h
            r7 = 2
            if (r1 != r7) goto L_0x0053
            r1 = 1
            goto L_0x0054
        L_0x0053:
            r1 = 0
        L_0x0054:
            if (r1 == 0) goto L_0x0057
            goto L_0x00b2
        L_0x0057:
            if (r0 == 0) goto L_0x005f
            int r1 = r0.f141392h
            if (r1 != r5) goto L_0x005f
            r1 = 1
            goto L_0x0060
        L_0x005f:
            r1 = 0
        L_0x0060:
            if (r1 != 0) goto L_0x006d
            if (r0 == 0) goto L_0x006a
            int r1 = r0.f141392h
            if (r1 != r6) goto L_0x006a
            r1 = 1
            goto L_0x006b
        L_0x006a:
            r1 = 0
        L_0x006b:
            if (r1 == 0) goto L_0x0114
        L_0x006d:
            android.widget.LinearLayout r1 = r13.f42760z
            if (r1 != 0) goto L_0x0072
            goto L_0x0075
        L_0x0072:
            r1.setVisibility(r2)
        L_0x0075:
            android.widget.TextView r1 = r13.f42759y
            if (r1 != 0) goto L_0x007a
            goto L_0x007d
        L_0x007a:
            r1.setVisibility(r2)
        L_0x007d:
            com.tencent.mm.plugin.finder.view.UnchangeTextView r1 = r13.f42752r
            if (r1 != 0) goto L_0x0082
            goto L_0x0085
        L_0x0082:
            r1.setVisibility(r4)
        L_0x0085:
            com.tencent.mm.view.recyclerview.WxRecyclerView r1 = r13.f42756v
            if (r1 != 0) goto L_0x008a
            goto L_0x008d
        L_0x008a:
            r1.setVisibility(r4)
        L_0x008d:
            com.tencent.mm.plugin.finder.view.UnchangeTextView r1 = r13.f42757w
            if (r1 != 0) goto L_0x0092
            goto L_0x0095
        L_0x0092:
            r1.setVisibility(r4)
        L_0x0095:
            com.tencent.mm.ui.widget.FlowTextMixView r1 = r13.f42755u
            if (r1 != 0) goto L_0x009a
            goto L_0x009d
        L_0x009a:
            r1.setVisibility(r4)
        L_0x009d:
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LIVE_AUTO_SHOW_VOTE_STRING_SYNC
            java.lang.String r8 = r0.f141393i
            if (r8 != 0) goto L_0x00ad
            java.lang.String r8 = ""
        L_0x00ad:
            r1.mo119677K(r7, r8)
            goto L_0x0114
        L_0x00b2:
            android.widget.LinearLayout r1 = r13.f42760z
            if (r1 != 0) goto L_0x00b7
            goto L_0x00ba
        L_0x00b7:
            r1.setVisibility(r4)
        L_0x00ba:
            android.widget.TextView r1 = r13.f42759y
            if (r1 != 0) goto L_0x00bf
            goto L_0x00c2
        L_0x00bf:
            r1.setVisibility(r6)
        L_0x00c2:
            com.tencent.mm.plugin.finder.view.UnchangeTextView r1 = r13.f42752r
            if (r1 != 0) goto L_0x00c7
            goto L_0x00ca
        L_0x00c7:
            r1.setVisibility(r6)
        L_0x00ca:
            com.tencent.mm.view.recyclerview.WxRecyclerView r1 = r13.f42756v
            if (r1 != 0) goto L_0x00cf
            goto L_0x00d2
        L_0x00cf:
            r1.setVisibility(r6)
        L_0x00d2:
            com.tencent.mm.plugin.finder.view.UnchangeTextView r1 = r13.f42757w
            if (r1 != 0) goto L_0x00d7
            goto L_0x00da
        L_0x00d7:
            r1.setVisibility(r6)
        L_0x00da:
            com.tencent.mm.ui.widget.FlowTextMixView r1 = r13.f42755u
            if (r1 != 0) goto L_0x00df
            goto L_0x00e2
        L_0x00df:
            r1.setVisibility(r6)
        L_0x00e2:
            r1 = 1
            goto L_0x0115
        L_0x00e4:
            android.widget.LinearLayout r1 = r13.f42760z
            if (r1 != 0) goto L_0x00e9
            goto L_0x00ec
        L_0x00e9:
            r1.setVisibility(r2)
        L_0x00ec:
            android.widget.TextView r1 = r13.f42759y
            if (r1 != 0) goto L_0x00f1
            goto L_0x00f4
        L_0x00f1:
            r1.setVisibility(r4)
        L_0x00f4:
            com.tencent.mm.plugin.finder.view.UnchangeTextView r1 = r13.f42752r
            if (r1 != 0) goto L_0x00f9
            goto L_0x00fc
        L_0x00f9:
            r1.setVisibility(r2)
        L_0x00fc:
            com.tencent.mm.view.recyclerview.WxRecyclerView r1 = r13.f42756v
            if (r1 != 0) goto L_0x0101
            goto L_0x0104
        L_0x0101:
            r1.setVisibility(r4)
        L_0x0104:
            com.tencent.mm.plugin.finder.view.UnchangeTextView r1 = r13.f42757w
            if (r1 != 0) goto L_0x0109
            goto L_0x010c
        L_0x0109:
            r1.setVisibility(r4)
        L_0x010c:
            com.tencent.mm.ui.widget.FlowTextMixView r1 = r13.f42755u
            if (r1 != 0) goto L_0x0111
            goto L_0x0114
        L_0x0111:
            r1.setVisibility(r4)
        L_0x0114:
            r1 = 0
        L_0x0115:
            if (r0 == 0) goto L_0x011a
            int r7 = r0.f141391g
            goto L_0x011b
        L_0x011a:
            r7 = 0
        L_0x011b:
            if (r7 > 0) goto L_0x0135
            if (r0 == 0) goto L_0x0125
            int r7 = r0.f141392h
            if (r7 != r5) goto L_0x0125
            r5 = 1
            goto L_0x0126
        L_0x0125:
            r5 = 0
        L_0x0126:
            if (r5 != 0) goto L_0x0133
            if (r0 == 0) goto L_0x0130
            int r5 = r0.f141392h
            if (r5 != r6) goto L_0x0130
            r5 = 1
            goto L_0x0131
        L_0x0130:
            r5 = 0
        L_0x0131:
            if (r5 == 0) goto L_0x0135
        L_0x0133:
            r12 = 1
            goto L_0x0136
        L_0x0135:
            r12 = 0
        L_0x0136:
            boolean r5 = r13.mo14532Z0()
            if (r5 != 0) goto L_0x0152
            if (r0 == 0) goto L_0x0144
            int r5 = r0.f141399r
            if (r5 != r3) goto L_0x0144
            r5 = 1
            goto L_0x0145
        L_0x0144:
            r5 = 0
        L_0x0145:
            if (r5 == 0) goto L_0x0152
            if (r12 != 0) goto L_0x0152
            com.tencent.mm.plugin.finder.view.UnchangeTextView r1 = r13.f42757w
            if (r1 != 0) goto L_0x014e
            goto L_0x015c
        L_0x014e:
            r1.setVisibility(r2)
            goto L_0x015c
        L_0x0152:
            if (r1 != 0) goto L_0x015c
            com.tencent.mm.plugin.finder.view.UnchangeTextView r1 = r13.f42757w
            if (r1 != 0) goto L_0x0159
            goto L_0x015c
        L_0x0159:
            r1.setVisibility(r4)
        L_0x015c:
            boolean r1 = r13.mo82893g0()
            if (r1 == 0) goto L_0x016a
            com.tencent.mm.plugin.finder.view.UnchangeTextView r1 = r13.f42757w
            if (r1 != 0) goto L_0x0167
            goto L_0x016a
        L_0x0167:
            r1.setVisibility(r2)
        L_0x016a:
            r1 = 0
            if (r0 == 0) goto L_0x0187
            java.util.LinkedList<te3.yv> r5 = r0.f141390f
            if (r5 == 0) goto L_0x0187
            java.util.Iterator r5 = r5.iterator()
        L_0x0176:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0187
            java.lang.Object r6 = r5.next()
            te3.yv r6 = (te3.C52172yv) r6
            int r6 = r6.f145530g
            long r6 = (long) r6
            long r1 = r1 + r6
            goto L_0x0176
        L_0x0187:
            r8 = r1
            if (r0 == 0) goto L_0x01a6
            java.util.LinkedList<te3.yv> r7 = r0.f141390f
            if (r7 == 0) goto L_0x01a6
            vs1.o r6 = r13.f42744A
            if (r6 == 0) goto L_0x01a6
            int r1 = r0.f141388d
            if (r1 != 0) goto L_0x0198
            r10 = 1
            goto L_0x0199
        L_0x0198:
            r10 = 0
        L_0x0199:
            int r0 = r0.f141399r
            if (r0 == 0) goto L_0x01a2
            if (r12 == 0) goto L_0x01a0
            goto L_0x01a2
        L_0x01a0:
            r11 = 0
            goto L_0x01a3
        L_0x01a2:
            r11 = 1
        L_0x01a3:
            r6.mo14055O4(r7, r8, r10, r11, r12)
        L_0x01a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xs1.C15883o.mo14533a1():void");
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: b1 */
    public final void mo14534b1(int i) {
        Class cls = C54991o.class;
        if (i == 0 && this.f166287d.getVisibility() == 0) {
            C54991o oVar = (C54991o) mo87696x0(cls);
            boolean z = oVar.f154286Z;
            if (!z) {
                oVar.f154286Z = !z;
                Bundle bundle = new Bundle();
                bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", oVar.f154286Z);
                this.f42750p.statusChange(C58124b.C58125b.FINDER_LIVE_CLEAR_SCREEN, bundle);
                return;
            }
            return;
        }
        C54991o oVar2 = (C54991o) mo87696x0(cls);
        boolean z2 = oVar2.f154286Z;
        if (z2) {
            oVar2.f154286Z = !z2;
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", oVar2.f154286Z);
            this.f42750p.statusChange(C58124b.C58125b.FINDER_LIVE_CLEAR_SCREEN, bundle2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:172:0x022b, code lost:
        if ((r1 != null && r1.f141392h == 4) != false) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x014c, code lost:
        if ((r1 != null && r1.f141392h == 4) != false) goto L_0x014e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0344 A[LOOP:0: B:256:0x033e->B:258:0x0344, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x035e  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0360  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0365 A[ADDED_TO_REGION] */
    /* renamed from: c1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14535c1() {
        /*
            r18 = this;
            r0 = r18
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            androidx.lifecycle.i0 r2 = r0.mo87696x0(r1)
            cl1.o r2 = (cl1.C54991o) r2
            te3.sa1 r2 = r2.f154275W3
            if (r2 == 0) goto L_0x0378
            androidx.lifecycle.i0 r1 = r0.mo87696x0(r1)
            cl1.o r1 = (cl1.C54991o) r1
            te3.sa1 r1 = r1.f154275W3
            r2 = 0
            if (r1 == 0) goto L_0x001c
            java.lang.String r3 = r1.f141393i
            goto L_0x001d
        L_0x001c:
            r3 = r2
        L_0x001d:
            java.lang.String r4 = ""
            if (r3 != 0) goto L_0x0022
            r3 = r4
        L_0x0022:
            r0.f42749F = r3
            r18.mo14536d1()
            boolean r3 = r18.mo82893g0()
            java.lang.String r5 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            r6 = 4
            r7 = 0
            if (r3 != 0) goto L_0x00a4
            if (r1 == 0) goto L_0x003c
            java.util.LinkedList<te3.yv> r3 = r1.f141390f
            if (r3 == 0) goto L_0x003c
            int r3 = r3.size()
            goto L_0x003d
        L_0x003c:
            r3 = 0
        L_0x003d:
            r8 = 5
            if (r3 >= r8) goto L_0x0072
            com.tencent.mm.view.recyclerview.WxRecyclerView r3 = r0.f42756v
            if (r3 == 0) goto L_0x0049
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            goto L_0x004a
        L_0x0049:
            r3 = r2
        L_0x004a:
            gy3.C87412m.m108592e(r3, r5)
            android.widget.LinearLayout$LayoutParams r3 = (android.widget.LinearLayout.LayoutParams) r3
            android.view.ViewGroup r5 = r0.f166287d
            android.content.Context r5 = r5.getContext()
            if (r1 == 0) goto L_0x0060
            java.util.LinkedList<te3.yv> r8 = r1.f141390f
            if (r8 == 0) goto L_0x0060
            int r8 = r8.size()
            goto L_0x0061
        L_0x0060:
            r8 = 0
        L_0x0061:
            int r8 = r8 * 60
            int r5 = kg3.C76577a.m92151b(r5, r8)
            r3.height = r5
            com.tencent.mm.view.recyclerview.WxRecyclerView r3 = r0.f42756v
            if (r3 == 0) goto L_0x0113
            r3.setFadingEdgeLength(r7)
            goto L_0x0113
        L_0x0072:
            com.tencent.mm.view.recyclerview.WxRecyclerView r3 = r0.f42756v
            if (r3 == 0) goto L_0x007b
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            goto L_0x007c
        L_0x007b:
            r3 = r2
        L_0x007c:
            gy3.C87412m.m108592e(r3, r5)
            android.widget.LinearLayout$LayoutParams r3 = (android.widget.LinearLayout.LayoutParams) r3
            android.view.ViewGroup r5 = r0.f166287d
            android.content.Context r5 = r5.getContext()
            r8 = 262(0x106, float:3.67E-43)
            int r5 = kg3.C76577a.m92151b(r5, r8)
            r3.height = r5
            com.tencent.mm.view.recyclerview.WxRecyclerView r3 = r0.f42756v
            if (r3 == 0) goto L_0x0113
            android.view.ViewGroup r5 = r0.f166287d
            android.content.Context r5 = r5.getContext()
            r8 = 20
            int r5 = kg3.C76577a.m92151b(r5, r8)
            r3.setFadingEdgeLength(r5)
            goto L_0x0113
        L_0x00a4:
            if (r1 == 0) goto L_0x00af
            java.util.LinkedList<te3.yv> r3 = r1.f141390f
            if (r3 == 0) goto L_0x00af
            int r3 = r3.size()
            goto L_0x00b0
        L_0x00af:
            r3 = 0
        L_0x00b0:
            if (r3 >= r6) goto L_0x00e3
            com.tencent.mm.view.recyclerview.WxRecyclerView r3 = r0.f42756v
            if (r3 == 0) goto L_0x00bb
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            goto L_0x00bc
        L_0x00bb:
            r3 = r2
        L_0x00bc:
            gy3.C87412m.m108592e(r3, r5)
            android.widget.LinearLayout$LayoutParams r3 = (android.widget.LinearLayout.LayoutParams) r3
            android.view.ViewGroup r5 = r0.f166287d
            android.content.Context r5 = r5.getContext()
            if (r1 == 0) goto L_0x00d2
            java.util.LinkedList<te3.yv> r8 = r1.f141390f
            if (r8 == 0) goto L_0x00d2
            int r8 = r8.size()
            goto L_0x00d3
        L_0x00d2:
            r8 = 0
        L_0x00d3:
            int r8 = r8 * 52
            int r5 = kg3.C76577a.m92151b(r5, r8)
            r3.height = r5
            com.tencent.mm.view.recyclerview.WxRecyclerView r3 = r0.f42756v
            if (r3 == 0) goto L_0x0113
            r3.setFadingEdgeLength(r7)
            goto L_0x0113
        L_0x00e3:
            com.tencent.mm.view.recyclerview.WxRecyclerView r3 = r0.f42756v
            if (r3 == 0) goto L_0x00ec
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            goto L_0x00ed
        L_0x00ec:
            r3 = r2
        L_0x00ed:
            gy3.C87412m.m108592e(r3, r5)
            android.widget.LinearLayout$LayoutParams r3 = (android.widget.LinearLayout.LayoutParams) r3
            android.view.ViewGroup r5 = r0.f166287d
            android.content.Context r5 = r5.getContext()
            r8 = 178(0xb2, float:2.5E-43)
            int r5 = kg3.C76577a.m92151b(r5, r8)
            r3.height = r5
            com.tencent.mm.view.recyclerview.WxRecyclerView r3 = r0.f42756v
            if (r3 == 0) goto L_0x0113
            android.view.ViewGroup r5 = r0.f166287d
            android.content.Context r5 = r5.getContext()
            r8 = 16
            int r5 = kg3.C76577a.m92151b(r5, r8)
            r3.setFadingEdgeLength(r5)
        L_0x0113:
            if (r1 == 0) goto L_0x0118
            int r3 = r1.f141391g
            goto L_0x0119
        L_0x0118:
            r3 = 0
        L_0x0119:
            r5 = 3
            r8 = 2
            r9 = 8
            r10 = 1
            if (r3 > 0) goto L_0x01c5
            if (r1 == 0) goto L_0x0128
            int r3 = r1.f141392h
            if (r3 != r10) goto L_0x0128
            r3 = 1
            goto L_0x0129
        L_0x0128:
            r3 = 0
        L_0x0129:
            if (r3 != 0) goto L_0x0193
            if (r1 == 0) goto L_0x0133
            int r3 = r1.f141392h
            if (r3 != r8) goto L_0x0133
            r3 = 1
            goto L_0x0134
        L_0x0133:
            r3 = 0
        L_0x0134:
            if (r3 == 0) goto L_0x0138
            goto L_0x0193
        L_0x0138:
            if (r1 == 0) goto L_0x0140
            int r3 = r1.f141392h
            if (r3 != r5) goto L_0x0140
            r3 = 1
            goto L_0x0141
        L_0x0140:
            r3 = 0
        L_0x0141:
            if (r3 != 0) goto L_0x014e
            if (r1 == 0) goto L_0x014b
            int r3 = r1.f141392h
            if (r3 != r6) goto L_0x014b
            r3 = 1
            goto L_0x014c
        L_0x014b:
            r3 = 0
        L_0x014c:
            if (r3 == 0) goto L_0x020e
        L_0x014e:
            android.widget.LinearLayout r3 = r0.f42760z
            if (r3 != 0) goto L_0x0153
            goto L_0x0156
        L_0x0153:
            r3.setVisibility(r9)
        L_0x0156:
            android.widget.TextView r3 = r0.f42759y
            if (r3 != 0) goto L_0x015b
            goto L_0x015e
        L_0x015b:
            r3.setVisibility(r9)
        L_0x015e:
            com.tencent.mm.plugin.finder.view.UnchangeTextView r3 = r0.f42752r
            if (r3 != 0) goto L_0x0163
            goto L_0x0166
        L_0x0163:
            r3.setVisibility(r7)
        L_0x0166:
            com.tencent.mm.view.recyclerview.WxRecyclerView r3 = r0.f42756v
            if (r3 != 0) goto L_0x016b
            goto L_0x016e
        L_0x016b:
            r3.setVisibility(r7)
        L_0x016e:
            com.tencent.mm.plugin.finder.view.UnchangeTextView r3 = r0.f42757w
            if (r3 != 0) goto L_0x0173
            goto L_0x0176
        L_0x0173:
            r3.setVisibility(r7)
        L_0x0176:
            com.tencent.mm.ui.widget.FlowTextMixView r3 = r0.f42755u
            if (r3 != 0) goto L_0x017b
            goto L_0x017e
        L_0x017b:
            r3.setVisibility(r7)
        L_0x017e:
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()
            com.tencent.mm.storage.y1$a r11 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LIVE_AUTO_SHOW_VOTE_STRING_SYNC
            java.lang.String r12 = r1.f141393i
            if (r12 != 0) goto L_0x018d
            goto L_0x018e
        L_0x018d:
            r4 = r12
        L_0x018e:
            r3.mo119677K(r11, r4)
            goto L_0x020e
        L_0x0193:
            android.widget.LinearLayout r3 = r0.f42760z
            if (r3 != 0) goto L_0x0198
            goto L_0x019b
        L_0x0198:
            r3.setVisibility(r7)
        L_0x019b:
            android.widget.TextView r3 = r0.f42759y
            if (r3 != 0) goto L_0x01a0
            goto L_0x01a3
        L_0x01a0:
            r3.setVisibility(r6)
        L_0x01a3:
            com.tencent.mm.plugin.finder.view.UnchangeTextView r3 = r0.f42752r
            if (r3 != 0) goto L_0x01a8
            goto L_0x01ab
        L_0x01a8:
            r3.setVisibility(r6)
        L_0x01ab:
            com.tencent.mm.view.recyclerview.WxRecyclerView r3 = r0.f42756v
            if (r3 != 0) goto L_0x01b0
            goto L_0x01b3
        L_0x01b0:
            r3.setVisibility(r6)
        L_0x01b3:
            com.tencent.mm.plugin.finder.view.UnchangeTextView r3 = r0.f42757w
            if (r3 != 0) goto L_0x01b8
            goto L_0x01bb
        L_0x01b8:
            r3.setVisibility(r6)
        L_0x01bb:
            com.tencent.mm.ui.widget.FlowTextMixView r3 = r0.f42755u
            if (r3 != 0) goto L_0x01c0
            goto L_0x01c3
        L_0x01c0:
            r3.setVisibility(r6)
        L_0x01c3:
            r3 = 1
            goto L_0x020f
        L_0x01c5:
            android.widget.LinearLayout r3 = r0.f42760z
            if (r3 != 0) goto L_0x01ca
            goto L_0x01cd
        L_0x01ca:
            r3.setVisibility(r9)
        L_0x01cd:
            android.widget.TextView r3 = r0.f42759y
            if (r3 != 0) goto L_0x01d2
            goto L_0x01d5
        L_0x01d2:
            r3.setVisibility(r7)
        L_0x01d5:
            com.tencent.mm.plugin.finder.view.UnchangeTextView r3 = r0.f42752r
            if (r3 != 0) goto L_0x01da
            goto L_0x01dd
        L_0x01da:
            r3.setVisibility(r9)
        L_0x01dd:
            com.tencent.mm.view.recyclerview.WxRecyclerView r3 = r0.f42756v
            if (r3 != 0) goto L_0x01e2
            goto L_0x01e5
        L_0x01e2:
            r3.setVisibility(r7)
        L_0x01e5:
            com.tencent.mm.plugin.finder.view.UnchangeTextView r3 = r0.f42757w
            if (r3 != 0) goto L_0x01ea
            goto L_0x01ed
        L_0x01ea:
            r3.setVisibility(r7)
        L_0x01ed:
            com.tencent.mm.ui.widget.FlowTextMixView r3 = r0.f42755u
            if (r3 != 0) goto L_0x01f2
            goto L_0x01f5
        L_0x01f2:
            r3.setVisibility(r7)
        L_0x01f5:
            if (r1 == 0) goto L_0x01fa
            int r3 = r1.f141391g
            goto L_0x01fb
        L_0x01fa:
            r3 = 0
        L_0x01fb:
            r0.f42748E = r3
            r0.f42747D = r7
            long r3 = (long) r3
            r11 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r11
            xs1.r r11 = new xs1.r
            r11.<init>(r0, r3)
            r0.f42745B = r11
            r11.start()
        L_0x020e:
            r3 = 0
        L_0x020f:
            if (r1 == 0) goto L_0x0214
            int r4 = r1.f141391g
            goto L_0x0215
        L_0x0214:
            r4 = 0
        L_0x0215:
            if (r4 > 0) goto L_0x022f
            if (r1 == 0) goto L_0x021f
            int r4 = r1.f141392h
            if (r4 != r5) goto L_0x021f
            r4 = 1
            goto L_0x0220
        L_0x021f:
            r4 = 0
        L_0x0220:
            if (r4 != 0) goto L_0x022d
            if (r1 == 0) goto L_0x022a
            int r4 = r1.f141392h
            if (r4 != r6) goto L_0x022a
            r4 = 1
            goto L_0x022b
        L_0x022a:
            r4 = 0
        L_0x022b:
            if (r4 == 0) goto L_0x022f
        L_0x022d:
            r4 = 1
            goto L_0x0230
        L_0x022f:
            r4 = 0
        L_0x0230:
            boolean r5 = r18.mo14532Z0()
            if (r5 != 0) goto L_0x024c
            if (r1 == 0) goto L_0x023e
            int r5 = r1.f141399r
            if (r5 != r10) goto L_0x023e
            r5 = 1
            goto L_0x023f
        L_0x023e:
            r5 = 0
        L_0x023f:
            if (r5 == 0) goto L_0x024c
            if (r4 != 0) goto L_0x024c
            com.tencent.mm.plugin.finder.view.UnchangeTextView r3 = r0.f42757w
            if (r3 != 0) goto L_0x0248
            goto L_0x0256
        L_0x0248:
            r3.setVisibility(r9)
            goto L_0x0256
        L_0x024c:
            if (r3 != 0) goto L_0x0256
            com.tencent.mm.plugin.finder.view.UnchangeTextView r3 = r0.f42757w
            if (r3 != 0) goto L_0x0253
            goto L_0x0256
        L_0x0253:
            r3.setVisibility(r7)
        L_0x0256:
            boolean r3 = r18.mo82893g0()
            if (r3 == 0) goto L_0x0264
            com.tencent.mm.plugin.finder.view.UnchangeTextView r3 = r0.f42757w
            if (r3 != 0) goto L_0x0261
            goto L_0x0264
        L_0x0261:
            r3.setVisibility(r9)
        L_0x0264:
            com.tencent.mm.plugin.finder.view.UnchangeTextView r3 = r0.f42753s
            if (r3 != 0) goto L_0x0269
            goto L_0x0292
        L_0x0269:
            if (r1 == 0) goto L_0x026e
            java.lang.String r5 = r1.f141389e
            goto L_0x026f
        L_0x026e:
            r5 = r2
        L_0x026f:
            if (r5 == 0) goto L_0x027a
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0278
            goto L_0x027a
        L_0x0278:
            r5 = 0
            goto L_0x027b
        L_0x027a:
            r5 = 1
        L_0x027b:
            if (r5 == 0) goto L_0x028b
            android.view.ViewGroup r2 = r0.f166287d
            android.content.Context r2 = r2.getContext()
            r5 = 2131829019(0x7f11211b, float:1.9290995E38)
            java.lang.String r2 = r2.getString(r5)
            goto L_0x028f
        L_0x028b:
            if (r1 == 0) goto L_0x028f
            java.lang.String r2 = r1.f141389e
        L_0x028f:
            r3.setText(r2)
        L_0x0292:
            com.tencent.mm.ui.widget.FlowTextMixView r2 = r0.f42755u
            if (r2 == 0) goto L_0x029b
            int r2 = r2.mo153879b()
            goto L_0x029c
        L_0x029b:
            r2 = 0
        L_0x029c:
            if (r2 <= r8) goto L_0x02c4
            com.tencent.mm.plugin.finder.view.UnchangeTextView r2 = r0.f42753s
            if (r2 == 0) goto L_0x02ab
            float r2 = r2.getTextSize()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            goto L_0x02af
        L_0x02ab:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
        L_0x02af:
            r3 = 1099431936(0x41880000, float:17.0)
            java.lang.Float r5 = java.lang.Float.valueOf(r3)
            boolean r2 = gy3.C87412m.m108589b(r2, r5)
            if (r2 != 0) goto L_0x02e9
            com.tencent.mm.plugin.finder.view.UnchangeTextView r2 = r0.f42753s
            if (r2 != 0) goto L_0x02c0
            goto L_0x02e9
        L_0x02c0:
            r2.setTextSize(r3)
            goto L_0x02e9
        L_0x02c4:
            com.tencent.mm.plugin.finder.view.UnchangeTextView r2 = r0.f42753s
            if (r2 == 0) goto L_0x02d1
            float r2 = r2.getTextSize()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            goto L_0x02d5
        L_0x02d1:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
        L_0x02d5:
            r3 = 1102053376(0x41b00000, float:22.0)
            java.lang.Float r5 = java.lang.Float.valueOf(r3)
            boolean r2 = gy3.C87412m.m108589b(r2, r5)
            if (r2 != 0) goto L_0x02e9
            com.tencent.mm.plugin.finder.view.UnchangeTextView r2 = r0.f42753s
            if (r2 != 0) goto L_0x02e6
            goto L_0x02e9
        L_0x02e6:
            r2.setTextSize(r3)
        L_0x02e9:
            com.tencent.mm.plugin.finder.view.UnchangeTextView r2 = r0.f42754t
            if (r2 != 0) goto L_0x02ee
            goto L_0x031f
        L_0x02ee:
            if (r1 == 0) goto L_0x02f6
            int r3 = r1.f141388d
            if (r3 != 0) goto L_0x02f6
            r3 = 1
            goto L_0x02f7
        L_0x02f6:
            r3 = 0
        L_0x02f7:
            if (r3 == 0) goto L_0x030b
            android.view.ViewGroup r3 = r0.f166287d
            android.content.Context r3 = r3.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r5 = 2131829018(0x7f11211a, float:1.9290993E38)
            java.lang.String r3 = r3.getString(r5)
            goto L_0x031c
        L_0x030b:
            android.view.ViewGroup r3 = r0.f166287d
            android.content.Context r3 = r3.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r5 = 2131829017(0x7f112119, float:1.9290991E38)
            java.lang.String r3 = r3.getString(r5)
        L_0x031c:
            r2.setText(r3)
        L_0x031f:
            vs1.o r2 = r0.f42744A
            if (r2 == 0) goto L_0x032b
            java.util.ArrayList<te3.yv> r3 = r2.f41122f
            r3.clear()
            r2.notifyDataSetChanged()
        L_0x032b:
            vs1.o r2 = r0.f42744A
            if (r2 != 0) goto L_0x0330
            goto L_0x0332
        L_0x0330:
            r2.f41126j = r7
        L_0x0332:
            r2 = 0
            if (r1 == 0) goto L_0x034f
            java.util.LinkedList<te3.yv> r5 = r1.f141390f
            if (r5 == 0) goto L_0x034f
            java.util.Iterator r5 = r5.iterator()
        L_0x033e:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x034f
            java.lang.Object r6 = r5.next()
            te3.yv r6 = (te3.C52172yv) r6
            int r6 = r6.f145530g
            long r8 = (long) r6
            long r2 = r2 + r8
            goto L_0x033e
        L_0x034f:
            r13 = r2
            if (r1 == 0) goto L_0x0372
            java.util.LinkedList<te3.yv> r12 = r1.f141390f
            if (r12 == 0) goto L_0x0372
            vs1.o r11 = r0.f42744A
            if (r11 == 0) goto L_0x0372
            int r2 = r1.f141388d
            if (r2 != 0) goto L_0x0360
            r15 = 1
            goto L_0x0361
        L_0x0360:
            r15 = 0
        L_0x0361:
            int r1 = r1.f141399r
            if (r1 == 0) goto L_0x036b
            if (r4 == 0) goto L_0x0368
            goto L_0x036b
        L_0x0368:
            r16 = 0
            goto L_0x036d
        L_0x036b:
            r16 = 1
        L_0x036d:
            r17 = 0
            r11.mo14055O4(r12, r13, r15, r16, r17)
        L_0x0372:
            r0.mo10792g(r7)
            r0.mo14534b1(r7)
        L_0x0378:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xs1.C15883o.mo14535c1():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        if ((r1 != null && r1.f141392h == 4) != false) goto L_0x003a;
     */
    /* renamed from: d1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14536d1() {
        /*
            r9 = this;
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            androidx.lifecycle.i0 r1 = r9.mo87696x0(r0)
            cl1.o r1 = (cl1.C54991o) r1
            te3.sa1 r1 = r1.f154275W3
            boolean r2 = r9.mo14532Z0()
            java.lang.String r3 = "root.context.getString(R…e_count ?: 0).toString())"
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x010c
            if (r1 == 0) goto L_0x001a
            int r2 = r1.f141391g
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            r6 = 17170445(0x106000d, float:2.461195E-38)
            r7 = 33
            if (r2 > 0) goto L_0x00a4
            if (r1 == 0) goto L_0x002b
            int r2 = r1.f141392h
            r8 = 3
            if (r2 != r8) goto L_0x002b
            r2 = 1
            goto L_0x002c
        L_0x002b:
            r2 = 0
        L_0x002c:
            if (r2 != 0) goto L_0x003a
            if (r1 == 0) goto L_0x0037
            int r1 = r1.f141392h
            r2 = 4
            if (r1 != r2) goto L_0x0037
            r1 = 1
            goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            if (r1 == 0) goto L_0x00a4
        L_0x003a:
            androidx.lifecycle.i0 r0 = r9.mo87696x0(r0)
            cl1.o r0 = (cl1.C54991o) r0
            te3.sa1 r0 = r0.f154275W3
            android.view.ViewGroup r1 = r9.f166287d
            android.content.Context r1 = r1.getContext()
            r2 = 2131829010(0x7f112112, float:1.9290977E38)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            if (r0 == 0) goto L_0x0052
            int r0 = r0.f141398q
            goto L_0x0053
        L_0x0052:
            r0 = 0
        L_0x0053:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4[r5] = r0
            java.lang.String r0 = r1.getString(r2, r4)
            gy3.C87412m.m108593f(r0, r3)
            de3.u r1 = new de3.u
            r1.<init>((java.lang.String) r0)
            xs1.p r2 = new xs1.p
            r2.<init>(r9)
            int r3 = r0.length()
            int r3 = r3 + -4
            int r0 = r0.length()
            r1.mo105705b(r2, r3, r0, r7)
            com.tencent.mm.plugin.finder.view.UnchangeTextView r0 = r9.f42757w
            if (r0 != 0) goto L_0x007c
            goto L_0x008d
        L_0x007c:
            android.view.ViewGroup r2 = r9.f166287d
            android.content.Context r2 = r2.getContext()
            android.content.res.Resources r2 = r2.getResources()
            int r2 = r2.getColor(r6)
            r0.setHighlightColor(r2)
        L_0x008d:
            com.tencent.mm.plugin.finder.view.UnchangeTextView r0 = r9.f42757w
            if (r0 != 0) goto L_0x0092
            goto L_0x0099
        L_0x0092:
            android.text.method.MovementMethod r2 = android.text.method.LinkMovementMethod.getInstance()
            r0.setMovementMethod(r2)
        L_0x0099:
            com.tencent.mm.plugin.finder.view.UnchangeTextView r0 = r9.f42757w
            if (r0 != 0) goto L_0x009f
            goto L_0x0132
        L_0x009f:
            r0.setText(r1)
            goto L_0x0132
        L_0x00a4:
            androidx.lifecycle.i0 r0 = r9.mo87696x0(r0)
            cl1.o r0 = (cl1.C54991o) r0
            te3.sa1 r0 = r0.f154275W3
            android.view.ViewGroup r1 = r9.f166287d
            android.content.Context r1 = r1.getContext()
            r2 = 2131829011(0x7f112113, float:1.929098E38)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            if (r0 == 0) goto L_0x00bc
            int r8 = r0.f141398q
            goto L_0x00bd
        L_0x00bc:
            r8 = 0
        L_0x00bd:
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r4[r5] = r8
            java.lang.String r1 = r1.getString(r2, r4)
            gy3.C87412m.m108593f(r1, r3)
            de3.u r2 = new de3.u
            r2.<init>((java.lang.String) r1)
            xs1.q r3 = new xs1.q
            r3.<init>(r9, r0)
            int r0 = r1.length()
            int r0 = r0 + -4
            int r1 = r1.length()
            r2.mo105705b(r3, r0, r1, r7)
            com.tencent.mm.plugin.finder.view.UnchangeTextView r0 = r9.f42757w
            if (r0 != 0) goto L_0x00e6
            goto L_0x00f7
        L_0x00e6:
            android.view.ViewGroup r1 = r9.f166287d
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getColor(r6)
            r0.setHighlightColor(r1)
        L_0x00f7:
            com.tencent.mm.plugin.finder.view.UnchangeTextView r0 = r9.f42757w
            if (r0 != 0) goto L_0x00fc
            goto L_0x0103
        L_0x00fc:
            android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()
            r0.setMovementMethod(r1)
        L_0x0103:
            com.tencent.mm.plugin.finder.view.UnchangeTextView r0 = r9.f42757w
            if (r0 != 0) goto L_0x0108
            goto L_0x0132
        L_0x0108:
            r0.setText(r2)
            goto L_0x0132
        L_0x010c:
            android.view.ViewGroup r0 = r9.f166287d
            android.content.Context r0 = r0.getContext()
            r2 = 2131829020(0x7f11211c, float:1.9290997E38)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            if (r1 == 0) goto L_0x011c
            int r1 = r1.f141398q
            goto L_0x011d
        L_0x011c:
            r1 = 0
        L_0x011d:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r4[r5] = r1
            java.lang.String r0 = r0.getString(r2, r4)
            gy3.C87412m.m108593f(r0, r3)
            com.tencent.mm.plugin.finder.view.UnchangeTextView r1 = r9.f42757w
            if (r1 != 0) goto L_0x012f
            goto L_0x0132
        L_0x012f:
            r1.setText(r0)
        L_0x0132:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xs1.C15883o.mo14536d1():void");
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        CountDownTimer countDownTimer;
        Class cls = C54991o.class;
        int i2 = ((C54991o) mo87696x0(cls)).f154315f4;
        if (i2 == 0 || i2 == f42743G.hashCode()) {
            if (i == 0) {
                ((C54991o) mo87696x0(cls)).f154315f4 = f42743G.hashCode();
            } else {
                ((C54991o) mo87696x0(cls)).f154315f4 = 0;
            }
            if (i == 8 && (countDownTimer = this.f42745B) != null) {
                countDownTimer.cancel();
            }
            super.mo10792g(i);
        }
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        if (this.f166287d.getVisibility() != 0) {
            return false;
        }
        mo10792g(8);
        mo14534b1(8);
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 2;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 95) {
            mo14535c1();
        } else if (ordinal == 96) {
            CountDownTimer countDownTimer = this.f42745B;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            mo10792g(8);
            mo14534b1(8);
        }
        super.mo3210u0(bVar, bundle);
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        CountDownTimer countDownTimer = this.f42745B;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }
}
