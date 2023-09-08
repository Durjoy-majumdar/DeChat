package uj1;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C54219z;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveExtendReadingEditView;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveMultiNoticeView;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.view.TouchableLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import dh1.C7329b;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import nj3.C11184p0;
import nj3.C76912y0;
import pe3.C89349b;
import qk1.C63238n;
import qk1.C63244o;
import qo3.C47883u;
import qo3.C77407n;
import qo3.C77426q;
import rj1.C63446c;
import rp1.C63486a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49098d51;
import te3.C50585ns0;
import te3.C51059r51;
import te3.C64699s51;
import uo3.C78253a;

/* renamed from: uj1.a */
public final class C65374a implements C11184p0 {

    /* renamed from: d */
    public final View f188162d;

    /* renamed from: e */
    public C63486a f188163e;

    /* renamed from: f */
    public C50585ns0 f188164f;

    /* renamed from: g */
    public final C13601g f188165g = C36568h.m40985a(new C65391q(this));

    /* renamed from: h */
    public final C13601g f188166h;

    /* renamed from: i */
    public final C13601g f188167i;

    /* renamed from: j */
    public final C13601g f188168j;

    /* renamed from: n */
    public final C13601g f188169n;

    /* renamed from: o */
    public final C13601g f188170o;

    /* renamed from: p */
    public C77407n f188171p;

    /* renamed from: q */
    public final int f188172q;

    /* renamed from: r */
    public final int f188173r;

    /* renamed from: s */
    public final int f188174s;

    /* renamed from: t */
    public final int f188175t;

    /* renamed from: u */
    public final int f188176u;

    /* renamed from: v */
    public final int f188177v;

    /* renamed from: w */
    public final int f188178w;

    /* renamed from: x */
    public final List<Integer> f188179x;

    /* renamed from: uj1.a$a */
    public static final class C65375a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C65374a f188180d;

        public C65375a(C65374a aVar) {
            this.f188180d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveAnchorPromoteView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f188180d.mo89473c().getVisibility() == 0) {
                this.f188180d.mo89473c().mo3333e();
            } else {
                this.f188180d.mo89474d();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveAnchorPromoteView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: uj1.a$b */
    public static final class C65376b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C65374a f188181d;

        public C65376b(C65374a aVar) {
            this.f188181d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveAnchorPromoteView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f188181d.mo89474d();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveAnchorPromoteView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: uj1.a$c */
    public static final class C65377c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C65374a f188182d;

        public C65377c(C65374a aVar) {
            this.f188182d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveAnchorPromoteView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C65374a aVar = this.f188182d;
            if (aVar.f188171p == null) {
                aVar.f188171p = new C77407n(aVar.f188162d.getContext(), 1, false);
            }
            C77407n nVar = aVar.f188171p;
            if (nVar != null) {
                nVar.f225771i = new C65398f(aVar);
            }
            if (nVar != null) {
                nVar.f225782p = aVar;
            }
            if (nVar != null) {
                nVar.f225761d = new C65399g(aVar);
            }
            if (nVar != null) {
                nVar.mo107573q();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveAnchorPromoteView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: uj1.a$d */
    public static final class C65378d extends C87413o implements C32228q<C51059r51, View, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65374a f188183d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65378d(C65374a aVar) {
            super(3);
            this.f188183d = aVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C51059r51 r512 = (C51059r51) obj;
            View view = (View) obj2;
            int intValue = ((Number) obj3).intValue();
            C87412m.m108594g(r512, "info");
            C87412m.m108594g(view, "view");
            if (!this.f188183d.f188179x.contains(Integer.valueOf(r512.f140706e))) {
                C78253a aVar = new C78253a(view.getContext());
                C65374a aVar2 = this.f188183d;
                aVar.mo108272g(view, intValue, 0, new C65394b(aVar2), new C65395c(aVar2, r512), TouchableLayout.f24959d, TouchableLayout.f24960e);
                aVar.mo70679m();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: uj1.a$e */
    public static final class C65379e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65374a f188184d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65379e(C65374a aVar) {
            super(0);
            this.f188184d = aVar;
        }

        public Object invoke() {
            ((LiveBottomSheetPanel) ((C36570n) this.f188184d.f188165g).getValue()).mo78804d();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: uj1.a$f */
    public static final class C65380f extends C87413o implements C32224a<C63238n> {

        /* renamed from: d */
        public final /* synthetic */ C65374a f188185d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65380f(C65374a aVar) {
            super(0);
            this.f188185d = aVar;
        }

        public Object invoke() {
            Context context = this.f188185d.f188162d.getContext();
            C87412m.m108593f(context, "root.context");
            return new C63238n(context);
        }
    }

    /* renamed from: uj1.a$g */
    public static final class C65381g extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C65374a f188186d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65381g(C65374a aVar) {
            super(0);
            this.f188186d = aVar;
        }

        public Object invoke() {
            return this.f188186d.f188162d.findViewById(C0966R.C0970id.dd6);
        }
    }

    /* renamed from: uj1.a$h */
    public static final class C65382h extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C65374a f188187d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65382h(C65374a aVar) {
            super(0);
            this.f188187d = aVar;
        }

        public Object invoke() {
            return this.f188187d.f188162d.findViewById(C0966R.C0970id.f358220dx3);
        }
    }

    /* renamed from: uj1.a$i */
    public static final class C65383i extends C87413o implements C32224a<FinderLiveExtendReadingEditView> {

        /* renamed from: d */
        public final /* synthetic */ C65374a f188188d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65383i(C65374a aVar) {
            super(0);
            this.f188188d = aVar;
        }

        public Object invoke() {
            FinderLiveExtendReadingEditView finderLiveExtendReadingEditView = (FinderLiveExtendReadingEditView) this.f188188d.f188162d.findViewById(C0966R.C0970id.dxk);
            finderLiveExtendReadingEditView.setOnSuccData(new C65396d(this.f188188d));
            return finderLiveExtendReadingEditView;
        }
    }

    /* renamed from: uj1.a$j */
    public static final class C65384j extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C65374a f188189d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65384j(C65374a aVar) {
            super(0);
            this.f188189d = aVar;
        }

        public Object invoke() {
            return (TextView) this.f188189d.f188162d.findViewById(C0966R.C0970id.mcm);
        }
    }

    /* renamed from: uj1.a$k */
    public static final class C65385k extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C65374a f188190d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65385k(C65374a aVar) {
            super(0);
            this.f188190d = aVar;
        }

        public Object invoke() {
            return this.f188190d.f188162d.findViewById(C0966R.C0970id.dxl);
        }
    }

    /* renamed from: uj1.a$l */
    public static final class C65386l extends C87413o implements C32224a<WxRecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ C65374a f188191d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65386l(C65374a aVar) {
            super(0);
            this.f188191d = aVar;
        }

        public Object invoke() {
            View findViewById = this.f188191d.f188162d.findViewById(C0966R.C0970id.i8_);
            C65374a aVar = this.f188191d;
            WxRecyclerView wxRecyclerView = (WxRecyclerView) findViewById;
            Context context = aVar.f188162d.getContext();
            C87412m.m108593f(context, "root.context");
            wxRecyclerView.setLayoutManager(new FinderLinearLayoutManager(context));
            wxRecyclerView.setAdapter(aVar.mo89471a());
            return wxRecyclerView;
        }
    }

    /* renamed from: uj1.a$m */
    public static final class C65387m extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C65374a f188192d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65387m(C65374a aVar) {
            super(0);
            this.f188192d = aVar;
        }

        public Object invoke() {
            return (TextView) this.f188192d.f188162d.findViewById(C0966R.C0970id.dai);
        }
    }

    /* renamed from: uj1.a$n */
    public static final class C65388n extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C65374a f188193d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65388n(C65374a aVar) {
            super(0);
            this.f188193d = aVar;
        }

        public Object invoke() {
            return (TextView) this.f188193d.f188162d.findViewById(C0966R.C0970id.dxu);
        }
    }

    /* renamed from: uj1.a$o */
    public static final class C65389o extends C87413o implements C32224a<FinderLiveMultiNoticeView> {

        /* renamed from: d */
        public final /* synthetic */ C65374a f188194d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65389o(C65374a aVar) {
            super(0);
            this.f188194d = aVar;
        }

        public Object invoke() {
            return (FinderLiveMultiNoticeView) this.f188194d.f188162d.findViewById(C0966R.C0970id.f358198m13);
        }
    }

    /* renamed from: uj1.a$p */
    public static final class C65390p extends C87413o implements C32226l<C49098d51, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65374a f188195d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65390p(C65374a aVar) {
            super(1);
            this.f188195d = aVar;
        }

        public Object invoke(Object obj) {
            C49098d51 d512 = (C49098d51) obj;
            C87412m.m108594g(d512, "info");
            C63486a aVar = this.f188195d.f188163e;
            if (aVar != null) {
                C64699s51 s512 = new C64699s51();
                s512.f185341d = 1;
                s512.f185342e = 1;
                s512.f185343f = new C89349b(d512.toByteArray());
                C63486a.C63487a.m74824a(aVar, s512, (Boolean) null, 2, (Object) null);
                C63486a aVar2 = this.f188195d.f188163e;
                if (aVar2 != null) {
                    C45795b S2 = aVar2.mo87856S2();
                    if (S2 != null) {
                        C7329b.m7473b(C7329b.f25441a, S2, 3, 1, (String) null, 0, 24, (Object) null);
                    }
                    return C13598b0.f38549a;
                }
                C87412m.m108603p("presenter");
                throw null;
            }
            C87412m.m108603p("presenter");
            throw null;
        }
    }

    /* renamed from: uj1.a$q */
    public static final class C65391q extends C87413o implements C32224a<LiveBottomSheetPanel> {

        /* renamed from: d */
        public final /* synthetic */ C65374a f188196d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65391q(C65374a aVar) {
            super(0);
            this.f188196d = aVar;
        }

        public Object invoke() {
            LiveBottomSheetPanel liveBottomSheetPanel = (LiveBottomSheetPanel) this.f188196d.f188162d.findViewById(C0966R.C0970id.dd7);
            liveBottomSheetPanel.setOnVisibilityListener(new C65397e(this.f188196d));
            return liveBottomSheetPanel;
        }
    }

    /* renamed from: uj1.a$r */
    public static final class C65392r<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C65374a f188197d;

        public C65392r(C65374a aVar) {
            this.f188197d = aVar;
        }

        public void onChanged(Object obj) {
            C63446c cVar = (C63446c) obj;
            C50585ns0 ns02 = cVar.f179956e;
            if (ns02 != null) {
                this.f188197d.f188164f = ns02;
            }
            int i = cVar.f179953b;
            boolean z = true;
            if (i != 1) {
                if (i == 2) {
                    int i2 = cVar.f179952a;
                    if (i2 == -200146) {
                        C51059r51 r512 = cVar.f179955d;
                        if (r512 == null || r512.f140706e != 7) {
                            z = false;
                        }
                        if (z) {
                            FinderLiveExtendReadingEditView b = this.f188197d.mo89472b();
                            String string = this.f188197d.f188162d.getContext().getString(C0966R.string.m4a);
                            C87412m.m108593f(string, "root.context.getString(R…ket_anchor_same_one_tips)");
                            b.getClass();
                            TextView textView = b.f159715i;
                            if (textView != null) {
                                textView.setText(string);
                                TextView textView2 = b.f159715i;
                                if (textView2 != null) {
                                    textView2.setTextColor(b.getContext().getResources().getColor(C0966R.color.Red_100));
                                    TextView textView3 = b.f159715i;
                                    if (textView3 != null) {
                                        textView3.setOnClickListener((View.OnClickListener) null);
                                        TextView textView4 = b.f159715i;
                                        if (textView4 != null) {
                                            textView4.setVisibility(0);
                                        } else {
                                            C87412m.m108603p("tipsTv");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("tipsTv");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("tipsTv");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("tipsTv");
                                throw null;
                            }
                        } else {
                            C76912y0.makeText(this.f188197d.f188162d.getContext(), (CharSequence) this.f188197d.f188162d.getContext().getString(C0966R.string.e4o), 0).show();
                        }
                        this.f188197d.mo89474d();
                    } else if (i2 != 0) {
                        String str = cVar.f179957f;
                        if (!(str == null || str.length() == 0)) {
                            z = false;
                        }
                        String string2 = z ? this.f188197d.f188162d.getContext().getString(C0966R.string.e4k) : cVar.f179957f;
                        C87412m.m108593f(string2, "if(result.errMsg.isNullO…                        }");
                        C76912y0.makeText(this.f188197d.f188162d.getContext(), (CharSequence) string2, 0).show();
                        this.f188197d.mo89474d();
                    } else {
                        C51059r51 r513 = cVar.f179955d;
                        if (r513 != null) {
                            C65374a aVar = this.f188197d;
                            WxRecyclerView wxRecyclerView = (WxRecyclerView) ((C36570n) aVar.f188169n).getValue();
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar2.mo10233c(0);
                            WxRecyclerView wxRecyclerView2 = wxRecyclerView;
                            C117292a.m165358d(wxRecyclerView2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveAnchorPromoteView$register$1", "onChanged", "(Lcom/tencent/mm/plugin/finder/live/plugin/model/promote/IAnchorPromoteModel$Result;)V", "Undefined", "scrollToPosition", "(I)V");
                            wxRecyclerView.mo17115r1(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(wxRecyclerView2, "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveAnchorPromoteView$register$1", "onChanged", "(Lcom/tencent/mm/plugin/finder/live/plugin/model/promote/IAnchorPromoteModel$Result;)V", "Undefined", "scrollToPosition", "(I)V");
                            C63238n a = aVar.mo89471a();
                            a.getClass();
                            if (a.f179453f == null) {
                                a.f179453f = new LinkedList<>();
                            }
                            LinkedList<C51059r51> linkedList = a.f179453f;
                            C87412m.m108591d(linkedList);
                            C51059r51 r514 = new C51059r51();
                            r514.f140706e = -1000;
                            C13598b0 b0Var = C13598b0.f38549a;
                            linkedList.add(0, r514);
                            a.notifyItemInserted(0);
                            RecyclerView recyclerView = a.f179454g;
                            if (recyclerView != null) {
                                recyclerView.postDelayed(new C63244o(a, r513), 1000);
                            }
                            aVar.mo89476f(false);
                            aVar.mo89472b().mo77902b();
                        }
                    }
                } else if (i != 3) {
                    if (i == 4) {
                        if (cVar.f179952a == 0) {
                            C51059r51 r515 = cVar.f179955d;
                            if (r515 != null) {
                                C65374a aVar3 = this.f188197d;
                                if (r515.f140708g) {
                                    C76912y0.m92769h(aVar3.f188162d.getContext(), aVar3.f188162d.getContext().getResources().getString(C0966R.string.e5_), C0966R.raw.icons_filled_done);
                                }
                            }
                            this.f188197d.mo89474d();
                            return;
                        }
                        String str2 = cVar.f179957f;
                        if (!(str2 == null || str2.length() == 0)) {
                            z = false;
                        }
                        String string3 = z ? this.f188197d.f188162d.getContext().getString(C0966R.string.dnr) : cVar.f179957f;
                        C87412m.m108593f(string3, "if(result.errMsg.isNullO…                        }");
                        C76912y0.makeText(this.f188197d.f188162d.getContext(), (CharSequence) string3, 0).show();
                    }
                } else if (cVar.f179952a == 0) {
                    C51059r51 r516 = cVar.f179955d;
                    if (r516 != null) {
                        C65374a aVar4 = this.f188197d;
                        C63238n a2 = aVar4.mo89471a();
                        a2.getClass();
                        LinkedList<C51059r51> linkedList2 = a2.f179453f;
                        if (!(linkedList2 == null || linkedList2.isEmpty())) {
                            LinkedList<C51059r51> linkedList3 = a2.f179453f;
                            if (linkedList3 != null) {
                                Iterator<C51059r51> it = linkedList3.iterator();
                                int i3 = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        i3 = -1;
                                        break;
                                    }
                                    if (r516.f140705d == it.next().f140705d) {
                                        break;
                                    }
                                    i3++;
                                }
                                LinkedList<C51059r51> linkedList4 = a2.f179453f;
                                if (linkedList4 != null) {
                                    C51059r51 remove = linkedList4.remove(i3);
                                }
                                a2.notifyItemRemoved(i3);
                            }
                            LinkedList<C51059r51> linkedList5 = a2.f179453f;
                            if (linkedList5 != null) {
                                linkedList5.isEmpty();
                            }
                        }
                        aVar4.mo89473c().mo3333e();
                        aVar4.mo89474d();
                    }
                } else {
                    String str3 = cVar.f179957f;
                    if (!(str3 == null || str3.length() == 0)) {
                        z = false;
                    }
                    String string4 = z ? this.f188197d.f188162d.getContext().getString(C0966R.string.dnr) : cVar.f179957f;
                    C87412m.m108593f(string4, "if(result.errMsg.isNullO…                        }");
                    C76912y0.makeText(this.f188197d.f188162d.getContext(), (CharSequence) string4, 0).show();
                }
            } else if (cVar.f179952a == 0) {
                C65374a aVar5 = this.f188197d;
                LinkedList<C51059r51> linkedList6 = cVar.f179954c;
                if (linkedList6 == null || linkedList6.size() != 0) {
                    z = false;
                }
                aVar5.mo89476f(z);
                LinkedList<C51059r51> linkedList7 = cVar.f179954c;
                if (linkedList7 != null) {
                    C63238n a3 = this.f188197d.mo89471a();
                    a3.getClass();
                    a3.f179453f = linkedList7;
                    a3.notifyDataSetChanged();
                }
            } else {
                String str4 = cVar.f179957f;
                if (!(str4 == null || str4.length() == 0)) {
                    z = false;
                }
                String string5 = z ? this.f188197d.f188162d.getContext().getString(C0966R.string.dnr) : cVar.f179957f;
                C87412m.m108593f(string5, "if(result.errMsg.isNullO…                        }");
                C76912y0.makeText(this.f188197d.f188162d.getContext(), (CharSequence) string5, 0).show();
                this.f188197d.mo89474d();
            }
        }
    }

    /* renamed from: uj1.a$s */
    public static final class C65393s implements C47883u {

        /* renamed from: a */
        public static final C65393s f188198a = new C65393s();

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x010e, code lost:
        r9 = r9.field_authInfo;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C65374a(android.view.View r9) {
        /*
            r8 = this;
            java.lang.String r0 = "root"
            gy3.C87412m.m108594g(r9, r0)
            r8.<init>()
            r8.f188162d = r9
            uj1.a$q r9 = new uj1.a$q
            r9.<init>(r8)
            rx3.g r9 = rx3.C36568h.m40985a(r9)
            r8.f188165g = r9
            uj1.a$h r9 = new uj1.a$h
            r9.<init>(r8)
            rx3.g r9 = rx3.C36568h.m40985a(r9)
            uj1.a$n r0 = new uj1.a$n
            r0.<init>(r8)
            rx3.C36568h.m40985a(r0)
            uj1.a$m r0 = new uj1.a$m
            r0.<init>(r8)
            rx3.g r0 = rx3.C36568h.m40985a(r0)
            uj1.a$k r1 = new uj1.a$k
            r1.<init>(r8)
            rx3.g r1 = rx3.C36568h.m40985a(r1)
            r8.f188166h = r1
            uj1.a$g r1 = new uj1.a$g
            r1.<init>(r8)
            rx3.g r1 = rx3.C36568h.m40985a(r1)
            uj1.a$j r2 = new uj1.a$j
            r2.<init>(r8)
            rx3.g r2 = rx3.C36568h.m40985a(r2)
            uj1.a$o r3 = new uj1.a$o
            r3.<init>(r8)
            rx3.g r3 = rx3.C36568h.m40985a(r3)
            r8.f188167i = r3
            uj1.a$f r3 = new uj1.a$f
            r3.<init>(r8)
            rx3.g r3 = rx3.C36568h.m40985a(r3)
            r8.f188168j = r3
            uj1.a$l r3 = new uj1.a$l
            r3.<init>(r8)
            rx3.g r3 = rx3.C36568h.m40985a(r3)
            r8.f188169n = r3
            uj1.a$i r3 = new uj1.a$i
            r3.<init>(r8)
            rx3.g r3 = rx3.C36568h.m40985a(r3)
            r8.f188170o = r3
            r3 = 1
            r8.f188172q = r3
            r4 = 2
            r8.f188173r = r4
            r5 = 3
            r8.f188174s = r5
            r5 = 4
            r8.f188175t = r5
            r5 = 5
            r8.f188176u = r5
            r5 = 6
            r8.f188177v = r5
            r5 = 7
            r8.f188178w = r5
            java.lang.Integer[] r5 = new java.lang.Integer[r4]
            r6 = 8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 0
            r5[r7] = r6
            r6 = 13
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r3] = r6
            java.util.List r5 = sx3.C64197v.m75537f(r5)
            r8.f188179x = r5
            rx3.n r9 = (rx3.C36570n) r9
            java.lang.Object r9 = r9.getValue()
            android.view.View r9 = (android.view.View) r9
            uj1.a$a r5 = new uj1.a$a
            r5.<init>(r8)
            r9.setOnClickListener(r5)
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r9 = r1.getValue()
            android.view.View r9 = (android.view.View) r9
            uj1.a$b r1 = new uj1.a$b
            r1.<init>(r8)
            r9.setOnClickListener(r1)
            r9 = r0
            rx3.n r9 = (rx3.C36570n) r9
            java.lang.Object r9 = r9.getValue()
            android.widget.TextView r9 = (android.widget.TextView) r9
            android.text.TextPaint r9 = r9.getPaint()
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r9, r1)
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r9 = r0.getValue()
            android.widget.TextView r9 = (android.widget.TextView) r9
            uj1.a$c r0 = new uj1.a$c
            r0.<init>(r8)
            r9.setOnClickListener(r0)
            qk1.n r9 = r8.mo89471a()
            uj1.a$d r0 = new uj1.a$d
            r0.<init>(r8)
            r9.f179459o = r0
            com.tencent.mm.plugin.finder.live.view.FinderLiveExtendReadingEditView r9 = r8.mo89472b()
            uj1.a$e r0 = new uj1.a$e
            r0.<init>(r8)
            r9.setOnDimissListener(r0)
            fe1.d$b r9 = fe1.C58961d.f168673a
            zc1.b r0 = zc1.C66785b.f191882e
            java.lang.String r0 = r0.mo90662O5()
            fe1.q r9 = r9.mo84155b(r0)
            if (r9 == 0) goto L_0x0117
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r9 = r9.field_authInfo
            if (r9 == 0) goto L_0x0117
            int r9 = r9.authIconType
            if (r9 != r4) goto L_0x0117
            goto L_0x0118
        L_0x0117:
            r3 = 0
        L_0x0118:
            if (r3 == 0) goto L_0x013a
            r9 = r2
            rx3.n r9 = (rx3.C36570n) r9
            java.lang.Object r9 = r9.getValue()
            android.widget.TextView r9 = (android.widget.TextView) r9
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r0 = r2.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.content.Context r0 = r0.getContext()
            r1 = 2131828612(0x7f111f84, float:1.929017E38)
            java.lang.String r0 = r0.getString(r1)
            r9.setText(r0)
            goto L_0x0159
        L_0x013a:
            r9 = r2
            rx3.n r9 = (rx3.C36570n) r9
            java.lang.Object r9 = r9.getValue()
            android.widget.TextView r9 = (android.widget.TextView) r9
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r0 = r2.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.content.Context r0 = r0.getContext()
            r1 = 2131828611(0x7f111f83, float:1.9290168E38)
            java.lang.String r0 = r0.getString(r1)
            r9.setText(r0)
        L_0x0159:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uj1.C65374a.<init>(android.view.View):void");
    }

    /* renamed from: a */
    public final C63238n mo89471a() {
        return (C63238n) this.f188168j.getValue();
    }

    /* renamed from: b */
    public final FinderLiveExtendReadingEditView mo89472b() {
        return (FinderLiveExtendReadingEditView) this.f188170o.getValue();
    }

    /* renamed from: c */
    public final FinderLiveMultiNoticeView mo89473c() {
        return (FinderLiveMultiNoticeView) ((C36570n) this.f188167i).getValue();
    }

    /* renamed from: d */
    public final void mo89474d() {
        if (((LiveBottomSheetPanel) ((C36570n) this.f188165g).getValue()).f165501h) {
            ((LiveBottomSheetPanel) ((C36570n) this.f188165g).getValue()).mo78802a();
        }
        if (mo89473c().getVisibility() == 0) {
            mo89473c().mo3333e();
        }
    }

    /* renamed from: e */
    public void mo89475e(C63486a aVar, C54219z<C63446c> zVar) {
        C87412m.m108594g(aVar, "p");
        C87412m.m108594g(zVar, "liveData");
        this.f188163e = aVar;
        mo89471a().f179458n = aVar;
        Context context = this.f188162d.getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        zVar.observe((MMActivity) context, new C65392r(this));
    }

    /* renamed from: f */
    public void mo89476f(boolean z) {
        if (z) {
            View view = (View) ((C36570n) this.f188166h).getValue();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveAnchorPromoteView", "showOrHideEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveAnchorPromoteView", "showOrHideEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((WxRecyclerView) ((C36570n) this.f188169n).getValue()).setVisibility(8);
            return;
        }
        View view3 = (View) ((C36570n) this.f188166h).getValue();
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveAnchorPromoteView", "showOrHideEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveAnchorPromoteView", "showOrHideEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((WxRecyclerView) ((C36570n) this.f188169n).getValue()).setVisibility(0);
    }

    /* renamed from: g */
    public final void mo89477g(int i) {
        C77426q qVar = new C77426q(this.f188162d.getContext());
        qVar.mo107595g(this.f188162d.getContext().getString(i));
        qVar.mo107602n(this.f188162d.getContext().getString(C0966R.string.e5a));
        qVar.mo107600l(C65393s.f188198a);
        qVar.mo107603o();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02af, code lost:
        if (r9.f185342e == 1) goto L_0x02b3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:224:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0149  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMMMenuItemSelected(android.view.MenuItem r19, int r20) {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r0 = "menuItem"
            r2 = r19
            gy3.C87412m.m108594g(r2, r0)
            int r0 = r19.getItemId()
            int r2 = r1.f188172q
            java.lang.String r3 = "safeParser"
            java.lang.String r4 = "presenter"
            java.lang.String r5 = ""
            r6 = 2
            r7 = 0
            r8 = 1
            r9 = 0
            if (r0 != r2) goto L_0x01b0
            te3.ns0 r0 = r1.f188164f
            if (r0 == 0) goto L_0x0146
            java.util.LinkedList<te3.s51> r0 = r0.f138744e
            if (r0 == 0) goto L_0x0146
            java.util.Iterator r0 = r0.iterator()
        L_0x0027:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x003e
            java.lang.Object r2 = r0.next()
            r10 = r2
            te3.s51 r10 = (te3.C64699s51) r10
            int r10 = r10.f185341d
            if (r10 != r8) goto L_0x003a
            r10 = 1
            goto L_0x003b
        L_0x003a:
            r10 = 0
        L_0x003b:
            if (r10 == 0) goto L_0x0027
            goto L_0x003f
        L_0x003e:
            r2 = r9
        L_0x003f:
            te3.s51 r2 = (te3.C64699s51) r2
            if (r2 == 0) goto L_0x0146
            pe3.b r0 = r2.f185343f
            if (r0 == 0) goto L_0x0049
            r0 = 1
            goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            if (r0 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r2 = r9
        L_0x004e:
            if (r2 == 0) goto L_0x0146
            gg1.a r0 = gg1.C32444a.f86121a
            pe1.c<java.lang.Integer> r0 = gg1.C32444a.f86128b2
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r8) goto L_0x011d
            fe1.d$b r0 = fe1.C58961d.f168673a
            zc1.b r2 = zc1.C66785b.f191882e
            java.lang.String r2 = r2.mo90662O5()
            fe1.q r0 = r0.mo84155b(r2)
            if (r0 == 0) goto L_0x0146
            com.tencent.mm.protocal.protobuf.FinderContact r2 = fe1.C58960c.m68835g(r0)
            com.tencent.mm.plugin.finder.live.view.FinderLiveMultiNoticeView r4 = r18.mo89473c()
            qk1.n r0 = r18.mo89471a()
            java.util.LinkedList<te3.r51> r0 = r0.f179453f
            if (r0 == 0) goto L_0x00e6
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0087:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x00a1
            java.lang.Object r11 = r0.next()
            r12 = r11
            te3.r51 r12 = (te3.C51059r51) r12
            int r12 = r12.f140706e
            if (r12 != r8) goto L_0x009a
            r12 = 1
            goto L_0x009b
        L_0x009a:
            r12 = 0
        L_0x009b:
            if (r12 == 0) goto L_0x0087
            r10.add(r11)
            goto L_0x0087
        L_0x00a1:
            java.util.ArrayList r11 = new java.util.ArrayList
            r0 = 10
            int r0 = sx3.C36907w.m41090l(r10, r0)
            r11.<init>(r0)
            java.util.Iterator r10 = r10.iterator()
        L_0x00b0:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00e7
            java.lang.Object r0 = r10.next()
            te3.r51 r0 = (te3.C51059r51) r0
            te3.d51 r12 = new te3.d51
            r12.<init>()
            pe3.b r0 = r0.f140707f
            if (r0 == 0) goto L_0x00ca
            byte[] r0 = r0.mo123703f()
            goto L_0x00cb
        L_0x00ca:
            r0 = r9
        L_0x00cb:
            if (r0 != 0) goto L_0x00ce
            goto L_0x00db
        L_0x00ce:
            r12.parseFrom(r0)     // Catch:{ Exception -> 0x00d2 }
            goto L_0x00db
        L_0x00d2:
            r0 = move-exception
            r13 = r0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r7] = r13
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r3, r5, r0)
        L_0x00db:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            java.lang.String r0 = r12.f132122h
            if (r0 != 0) goto L_0x00e2
            r0 = r5
        L_0x00e2:
            r11.add(r0)
            goto L_0x00b0
        L_0x00e6:
            r11 = r9
        L_0x00e7:
            uj1.a$p r0 = new uj1.a$p
            r0.<init>(r1)
            r4.getClass()
            r4.f15287g = r2
            r4.f15292o = r0
            r4.f15288h = r11
            float[] r0 = new float[r6]
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = com.tencent.p014mm.p136ui.C85875k4.m106196n(r2)
            float r2 = (float) r2
            r0[r7] = r2
            r2 = 0
            r0[r8] = r2
            java.lang.String r2 = "translationX"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r4, r2, r0)
            r2 = 200(0xc8, double:9.9E-322)
            r0.setDuration(r2)
            com.tencent.mm.plugin.finder.live.view.e1 r2 = new com.tencent.mm.plugin.finder.live.view.e1
            r2.<init>(r4)
            r0.addListener(r2)
            r0.start()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0147
        L_0x011d:
            rp1.a r0 = r1.f188163e
            if (r0 == 0) goto L_0x0142
            rp1.C63486a.C63487a.m74824a(r0, r2, r9, r6, r9)
            rp1.a r0 = r1.f188163e
            if (r0 == 0) goto L_0x013e
            fj1.b r11 = r0.mo87856S2()
            if (r11 == 0) goto L_0x0146
            dh1.b r10 = dh1.C7329b.f25441a
            r12 = 3
            r13 = 1
            r14 = 0
            r15 = 0
            r16 = 24
            r17 = 0
            dh1.C7329b.m7473b(r10, r11, r12, r13, r14, r15, r16, r17)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0147
        L_0x013e:
            gy3.C87412m.m108603p(r4)
            throw r9
        L_0x0142:
            gy3.C87412m.m108603p(r4)
            throw r9
        L_0x0146:
            r0 = r9
        L_0x0147:
            if (r0 != 0) goto L_0x032c
            gg1.a r0 = gg1.C32444a.f86121a
            pe1.c<java.lang.Integer> r0 = gg1.C32444a.f86128b2
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r8) goto L_0x01a3
            fe1.d$b r0 = fe1.C58961d.f168673a
            zc1.b r2 = zc1.C66785b.f191882e
            java.lang.String r3 = r2.mo90662O5()
            fe1.q r0 = r0.mo84155b(r3)
            if (r0 == 0) goto L_0x01a9
            com.tencent.mm.protocal.protobuf.FinderContact r13 = fe1.C58960c.m68835g(r0)
            bd1.b r0 = zc1.C66783a.C66784a.m78800c(r2, r7, r8, r9)
            if (r0 == 0) goto L_0x0177
            te3.dr2 r0 = r0.mo75251m2()
            te3.jp1 r9 = r0.f132486C
        L_0x0177:
            r16 = r9
            java.lang.Class<tf0.o1> r0 = tf0.C13883o1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            r10 = r0
            tf0.o1 r10 = (tf0.C13883o1) r10
            android.view.View r0 = r1.f188162d
            android.content.Context r0 = r0.getContext()
            java.lang.String r2 = "null cannot be cast to non-null type android.app.Activity"
            gy3.C87412m.m108592e(r0, r2)
            r11 = r0
            android.app.Activity r11 = (android.app.Activity) r11
            android.content.Intent r12 = new android.content.Intent
            r12.<init>()
            java.lang.String r0 = "KEY_FINDER_LIVE_NOTICE_IS_FROM_LIVE"
            r12.putExtra(r0, r8)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            r14 = 1012(0x3f4, float:1.418E-42)
            r15 = 1
            r10.mo13289tu(r11, r12, r13, r14, r15, r16)
            goto L_0x01a9
        L_0x01a3:
            r0 = 2131828603(0x7f111f7b, float:1.9290152E38)
            r1.mo89477g(r0)
        L_0x01a9:
            r18.mo89474d()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x032c
        L_0x01b0:
            int r2 = r1.f188176u
            if (r0 != r2) goto L_0x01c2
            r18.mo89474d()
            com.tencent.mm.plugin.finder.live.view.FinderLiveExtendReadingEditView r0 = r18.mo89472b()
            int r2 = com.tencent.p014mm.plugin.finder.live.view.FinderLiveExtendReadingEditView.f159709s
            r0.mo77905e(r6)
            goto L_0x032c
        L_0x01c2:
            int r2 = r1.f188173r
            if (r0 != r2) goto L_0x01d4
            r18.mo89474d()
            com.tencent.mm.plugin.finder.live.view.FinderLiveExtendReadingEditView r0 = r18.mo89472b()
            int r2 = com.tencent.p014mm.plugin.finder.live.view.FinderLiveExtendReadingEditView.f159709s
            r0.mo77905e(r8)
            goto L_0x032c
        L_0x01d4:
            int r2 = r1.f188174s
            if (r0 != r2) goto L_0x027c
            te3.ns0 r0 = r1.f188164f
            if (r0 == 0) goto L_0x0270
            java.util.LinkedList<te3.s51> r0 = r0.f138744e
            if (r0 == 0) goto L_0x0270
            java.util.Iterator r0 = r0.iterator()
        L_0x01e4:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x01fc
            java.lang.Object r2 = r0.next()
            r10 = r2
            te3.s51 r10 = (te3.C64699s51) r10
            int r10 = r10.f185341d
            r11 = 3
            if (r10 != r11) goto L_0x01f8
            r10 = 1
            goto L_0x01f9
        L_0x01f8:
            r10 = 0
        L_0x01f9:
            if (r10 == 0) goto L_0x01e4
            goto L_0x01fd
        L_0x01fc:
            r2 = r9
        L_0x01fd:
            te3.s51 r2 = (te3.C64699s51) r2
            if (r2 == 0) goto L_0x0270
            pe3.b r0 = r2.f185343f
            if (r0 == 0) goto L_0x0240
            te3.u51 r10 = new te3.u51
            r10.<init>()
            pe3.b r0 = r2.f185343f
            gy3.C87412m.m108591d(r0)
            byte[] r0 = r0.mo123703f()
            r10.parseFrom(r0)     // Catch:{ Exception -> 0x0217 }
            goto L_0x0220
        L_0x0217:
            r0 = move-exception
            r11 = r0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r7] = r11
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r3, r5, r0)
        L_0x0220:
            java.lang.String r0 = r10.f185717g
            if (r0 == 0) goto L_0x0225
            r5 = r0
        L_0x0225:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            if (r0 == 0) goto L_0x0236
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0231
            r0 = 1
            goto L_0x0232
        L_0x0231:
            r0 = 0
        L_0x0232:
            if (r0 != r8) goto L_0x0236
            r0 = 1
            goto L_0x0237
        L_0x0236:
            r0 = 0
        L_0x0237:
            if (r0 == 0) goto L_0x0240
            int r0 = r2.f185342e
            if (r0 != r8) goto L_0x0240
            r14 = r5
            r7 = 1
            goto L_0x0241
        L_0x0240:
            r14 = r5
        L_0x0241:
            if (r7 == 0) goto L_0x0244
            goto L_0x0245
        L_0x0244:
            r2 = r9
        L_0x0245:
            if (r2 == 0) goto L_0x0270
            rp1.a r0 = r1.f188163e
            if (r0 == 0) goto L_0x026c
            rp1.C63486a.C63487a.m74824a(r0, r2, r9, r6, r9)
            rp1.a r0 = r1.f188163e
            if (r0 == 0) goto L_0x0268
            fj1.b r11 = r0.mo87856S2()
            if (r11 == 0) goto L_0x0270
            dh1.b r10 = dh1.C7329b.f25441a
            r12 = 3
            r13 = 3
            r15 = 0
            r16 = 16
            r17 = 0
            dh1.C7329b.m7473b(r10, r11, r12, r13, r14, r15, r16, r17)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            r9 = r0
            goto L_0x0270
        L_0x0268:
            gy3.C87412m.m108603p(r4)
            throw r9
        L_0x026c:
            gy3.C87412m.m108603p(r4)
            throw r9
        L_0x0270:
            if (r9 != 0) goto L_0x032c
            r0 = 2131828604(0x7f111f7c, float:1.9290154E38)
            r1.mo89477g(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x032c
        L_0x027c:
            int r2 = r1.f188177v
            if (r0 != r2) goto L_0x02d7
            te3.ns0 r0 = r1.f188164f
            if (r0 == 0) goto L_0x02b2
            java.util.LinkedList<te3.s51> r0 = r0.f138744e
            if (r0 == 0) goto L_0x02b2
            java.util.Iterator r0 = r0.iterator()
        L_0x028c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x02a9
            java.lang.Object r2 = r0.next()
            r3 = r2
            te3.s51 r3 = (te3.C64699s51) r3
            int r4 = r3.f185341d
            r5 = 8
            if (r4 != r5) goto L_0x02a5
            int r3 = r3.f185344g
            if (r3 != r6) goto L_0x02a5
            r3 = 1
            goto L_0x02a6
        L_0x02a5:
            r3 = 0
        L_0x02a6:
            if (r3 == 0) goto L_0x028c
            r9 = r2
        L_0x02a9:
            te3.s51 r9 = (te3.C64699s51) r9
            if (r9 == 0) goto L_0x02b2
            int r0 = r9.f185342e
            if (r0 != r8) goto L_0x02b2
            goto L_0x02b3
        L_0x02b2:
            r8 = 0
        L_0x02b3:
            if (r8 == 0) goto L_0x02d0
            android.view.View r0 = r1.f188162d
            android.content.Context r0 = r0.getContext()
            android.view.View r2 = r1.f188162d
            android.content.Context r2 = r2.getContext()
            r3 = 2131828590(0x7f111f6e, float:1.9290125E38)
            java.lang.String r2 = r2.getString(r3)
            android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r0, (java.lang.CharSequence) r2, (int) r7)
            r0.show()
            goto L_0x032c
        L_0x02d0:
            r0 = 2131828583(0x7f111f67, float:1.929011E38)
            r1.mo89477g(r0)
            goto L_0x032c
        L_0x02d7:
            int r2 = r1.f188178w
            if (r0 != r2) goto L_0x032c
            te3.ns0 r0 = r1.f188164f
            if (r0 == 0) goto L_0x0322
            java.util.LinkedList<te3.s51> r0 = r0.f138744e
            if (r0 == 0) goto L_0x0322
            java.util.Iterator r0 = r0.iterator()
        L_0x02e7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0300
            java.lang.Object r2 = r0.next()
            r3 = r2
            te3.s51 r3 = (te3.C64699s51) r3
            int r3 = r3.f185341d
            r5 = 13
            if (r3 != r5) goto L_0x02fc
            r3 = 1
            goto L_0x02fd
        L_0x02fc:
            r3 = 0
        L_0x02fd:
            if (r3 == 0) goto L_0x02e7
            goto L_0x0301
        L_0x0300:
            r2 = r9
        L_0x0301:
            te3.s51 r2 = (te3.C64699s51) r2
            if (r2 == 0) goto L_0x0322
            pe3.b r0 = r2.f185343f
            if (r0 == 0) goto L_0x030e
            int r0 = r2.f185342e
            if (r0 != r8) goto L_0x030e
            r7 = 1
        L_0x030e:
            if (r7 == 0) goto L_0x0311
            goto L_0x0312
        L_0x0311:
            r2 = r9
        L_0x0312:
            if (r2 == 0) goto L_0x0322
            rp1.a r0 = r1.f188163e
            if (r0 == 0) goto L_0x031e
            rp1.C63486a.C63487a.m74824a(r0, r2, r9, r6, r9)
            rx3.b0 r9 = rx3.C13598b0.f38549a
            goto L_0x0322
        L_0x031e:
            gy3.C87412m.m108603p(r4)
            throw r9
        L_0x0322:
            if (r9 != 0) goto L_0x032c
            r0 = 2131828585(0x7f111f69, float:1.9290115E38)
            r1.mo89477g(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x032c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uj1.C65374a.onMMMenuItemSelected(android.view.MenuItem, int):void");
    }
}
