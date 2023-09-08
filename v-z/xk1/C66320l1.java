package xk1;

import ak1.C54108o;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import c30.C104289g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.appbrand.jsapi.contact.JsApiUpdateAppContact;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.finder.live.view.FinderMaxSizeLayout;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveTaskBannerView;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d60.C58124b;
import di3.C86312j;
import er1.C58739j4;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import ik1.C60333i;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kr0.C76630x0;
import nj3.C76912y0;
import p165hr.C60106t;
import p749xh.C66276va;
import rk1.C77534a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C64580ne1;
import z04.C112551y;

/* renamed from: xk1.l1 */
public final class C66320l1 extends UIComponent {

    /* renamed from: d */
    public final String f190915d = "FinderLiveMentionUIC";

    /* renamed from: e */
    public View f190916e;

    /* renamed from: f */
    public C58124b f190917f;

    /* renamed from: g */
    public final C13601g f190918g = C36568h.m40985a(new C66325e(this));

    /* renamed from: h */
    public final C13601g f190919h;

    /* renamed from: i */
    public final C13601g f190920i;

    /* renamed from: j */
    public final int f190921j;

    /* renamed from: n */
    public int f190922n;

    /* renamed from: o */
    public final LinkedList<C66276va> f190923o;

    /* renamed from: p */
    public final LinkedList<C66276va> f190924p;

    /* renamed from: q */
    public final C13601g f190925q;

    /* renamed from: xk1.l1$a */
    public final class C66321a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final View f190926A;

        /* renamed from: B */
        public final View f190927B;

        /* renamed from: C */
        public final View f190928C;

        /* renamed from: z */
        public final TextView f190929z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66321a(C66320l1 l1Var, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f190929z = (TextView) view.findViewById(C0966R.C0970id.o75);
            this.f190926A = view.findViewById(C0966R.C0970id.f358186o72);
            this.f190927B = view.findViewById(C0966R.C0970id.f358187o73);
            this.f190928C = view.findViewById(C0966R.C0970id.o74);
        }
    }

    /* renamed from: xk1.l1$b */
    public static final class C66322b extends C87413o implements C32224a<C66337n1> {

        /* renamed from: d */
        public final /* synthetic */ C66320l1 f190930d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66322b(C66320l1 l1Var) {
            super(0);
            this.f190930d = l1Var;
        }

        public Object invoke() {
            return new C66337n1(this.f190930d);
        }
    }

    /* renamed from: xk1.l1$c */
    public static final class C66323c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C66320l1 f190931d;

        public C66323c(C66320l1 l1Var) {
            this.f190931d = l1Var;
        }

        public final void run() {
            if (this.f190931d.f190923o.size() == 1) {
                RecyclerView.C16631z I0 = this.f190931d.mo90433g3().mo17023I0(0);
                C66321a aVar = I0 instanceof C66321a ? (C66321a) I0 : null;
                if (aVar != null) {
                    this.f190931d.mo90437l3(aVar);
                }
            }
        }
    }

    /* renamed from: xk1.l1$d */
    public static final class C66324d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C66320l1 f190932d;

        public C66324d(C66320l1 l1Var) {
            this.f190932d = l1Var;
        }

        public final void run() {
            RecyclerView.C16631z I0 = this.f190932d.mo90433g3().mo17023I0(0);
            C66321a aVar = I0 instanceof C66321a ? (C66321a) I0 : null;
            if (aVar != null) {
                C66320l1.m78231c3(this.f190932d, aVar);
            }
            this.f190932d.mo90433g3().setHasFixedSize(false);
        }
    }

    /* renamed from: xk1.l1$e */
    public static final class C66325e extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C66320l1 f190933d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66325e(C66320l1 l1Var) {
            super(0);
            this.f190933d = l1Var;
        }

        public Object invoke() {
            View view = this.f190933d.f190916e;
            if (view != null) {
                return view.findViewById(C0966R.C0970id.o7e);
            }
            C87412m.m108603p("parentLayout");
            throw null;
        }
    }

    /* renamed from: xk1.l1$f */
    public static final class C66326f extends C87413o implements C32224a<WxRecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ C66320l1 f190934d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66326f(C66320l1 l1Var) {
            super(0);
            this.f190934d = l1Var;
        }

        public Object invoke() {
            View view = this.f190934d.f190916e;
            if (view != null) {
                WxRecyclerView wxRecyclerView = (WxRecyclerView) view.findViewById(C0966R.C0970id.o7d);
                wxRecyclerView.setAdapter(this.f190934d.mo90432f3());
                wxRecyclerView.setLayoutManager(new LinearLayoutManager(this.f190934d.getContext(), 1, false));
                wxRecyclerView.setItemAnimator(new C77534a());
                return wxRecyclerView;
            }
            C87412m.m108603p("parentLayout");
            throw null;
        }
    }

    /* renamed from: xk1.l1$g */
    public static final class C66327g extends C87413o implements C32224a<FinderMaxSizeLayout> {

        /* renamed from: d */
        public final /* synthetic */ C66320l1 f190935d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66327g(C66320l1 l1Var) {
            super(0);
            this.f190935d = l1Var;
        }

        public Object invoke() {
            View view = this.f190935d.f190916e;
            if (view != null) {
                return (FinderMaxSizeLayout) view.findViewById(C0966R.C0970id.o76);
            }
            C87412m.m108603p("parentLayout");
            throw null;
        }
    }

    /* renamed from: xk1.l1$h */
    public static final class C66328h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C66320l1 f190936d;

        /* renamed from: e */
        public final /* synthetic */ C66321a f190937e;

        public C66328h(C66320l1 l1Var, C66321a aVar) {
            this.f190936d = l1Var;
            this.f190937e = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveMentionUIC$setExpand$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            int N0 = this.f190936d.mo90433g3().mo17029N0(this.f190937e.f44854d);
            Integer valueOf = Integer.valueOf(N0);
            C66320l1 l1Var = this.f190936d;
            int intValue = valueOf.intValue();
            boolean z = intValue >= 0 && intValue < l1Var.f190923o.size();
            C13598b0 b0Var = null;
            if (!z) {
                valueOf = null;
            }
            if (valueOf != null) {
                C66320l1 l1Var2 = this.f190936d;
                int intValue2 = valueOf.intValue();
                l1Var2.mo90435j3("2", l1Var2.f190923o.get(intValue2));
                C64580ne1 ne12 = l1Var2.f190923o.get(intValue2).field_notify;
                if (ne12 != null) {
                    int i = ne12.f184468f;
                    if (i == 1) {
                        Activity context = l1Var2.getContext();
                        String str = ne12.f184470h;
                        String str2 = ne12.f184469g;
                        AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
                        appBrandStatObject.f245533f = JsApiUpdateAppContact.CTRL_INDEX;
                        C13598b0 b0Var2 = C13598b0.f38549a;
                        ((C76630x0) C86312j.m106911c(C76630x0.class)).Ko0(context, str, "", 0, 0, str2, appBrandStatObject);
                        b0Var = C13598b0.f38549a;
                    } else if (i != 2) {
                        if (i == 6) {
                            FinderJumpInfo finderJumpInfo = ne12.f184473n;
                            if (finderJumpInfo != null) {
                                ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76780ML(l1Var2.getContext(), finderJumpInfo, 0);
                            }
                        }
                        b0Var = C13598b0.f38549a;
                    } else {
                        Intent intent = new Intent();
                        intent.putExtra("rawUrl", ne12.f184469g);
                        C88144b.m109791i(l1Var2.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                        b0Var = C13598b0.f38549a;
                    }
                }
            }
            if (b0Var == null) {
                C66320l1 l1Var3 = this.f190936d;
                String str3 = "get pos = " + N0 + ", is not in 0 until " + l1Var3.f190923o.size() + ", return";
                Log.m105924i(l1Var3.f190915d, str3);
                if (C58739j4.f168176a.mo83692U()) {
                    C76912y0.makeText((Context) l1Var3.getActivity(), (CharSequence) str3, 0).show();
                }
            }
            C66320l1.m78232d3(this.f190936d, N0);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveMentionUIC$setExpand$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: xk1.l1$i */
    public static final class C66329i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C66320l1 f190938d;

        /* renamed from: e */
        public final /* synthetic */ C66321a f190939e;

        public C66329i(C66320l1 l1Var, C66321a aVar) {
            this.f190938d = l1Var;
            this.f190939e = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveMentionUIC$setExpand$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f190938d.mo90433g3().setHasFixedSize(false);
            int N0 = this.f190938d.mo90433g3().mo17029N0(this.f190939e.f44854d);
            Integer valueOf = Integer.valueOf(N0);
            C66320l1 l1Var = this.f190938d;
            int intValue = valueOf.intValue();
            boolean z = intValue >= 0 && intValue < l1Var.f190923o.size();
            C13598b0 b0Var = null;
            if (!z) {
                valueOf = null;
            }
            if (valueOf != null) {
                C66320l1 l1Var2 = this.f190938d;
                int intValue2 = valueOf.intValue();
                l1Var2.mo90435j3("3", l1Var2.f190923o.get(intValue2));
                C66320l1.m78232d3(l1Var2, intValue2);
                l1Var2.f190923o.remove(intValue2);
                l1Var2.f190924p.remove(intValue2);
                l1Var2.mo90432f3().notifyItemRemoved(intValue2);
                l1Var2.mo90431e3();
                l1Var2.mo90434i3();
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                C66320l1 l1Var3 = this.f190938d;
                String str = "get pos = " + N0 + ", is not in 0 until " + l1Var3.f190923o.size() + ", return";
                Log.m105924i(l1Var3.f190915d, str);
                if (C58739j4.f168176a.mo83692U()) {
                    C76912y0.makeText((Context) l1Var3.getActivity(), (CharSequence) str, 0).show();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveMentionUIC$setExpand$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: xk1.l1$j */
    public static final class C66330j extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C66320l1 f190940d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66330j(C66320l1 l1Var) {
            super(0);
            this.f190940d = l1Var;
        }

        public Object invoke() {
            View view = this.f190940d.f190916e;
            if (view != null) {
                View findViewById = view.findViewById(C0966R.C0970id.o7f);
                findViewById.setOnClickListener(new C66343q1(this.f190940d));
                return findViewById;
            }
            C87412m.m108603p("parentLayout");
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66320l1(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C36568h.m40985a(new C66327g(this));
        this.f190919h = C36568h.m40985a(new C66326f(this));
        this.f190920i = C36568h.m40985a(new C66330j(this));
        this.f190921j = 1;
        this.f190922n = 0;
        this.f190923o = new LinkedList<>();
        this.f190924p = new LinkedList<>();
        this.f190925q = C36568h.m40985a(new C66322b(this));
    }

    /* renamed from: c3 */
    public static final void m78231c3(C66320l1 l1Var, C66321a aVar) {
        if (l1Var.f190923o.size() > 1) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aVar.f190927B, "alpha", new float[]{0.0f, 1.0f});
            ofFloat.setDuration(200);
            ofFloat.start();
        }
        View view = aVar.f190926A;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveMentionUIC", "setFold", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/FinderLiveMentionUIC$MentionViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveMentionUIC", "setFold", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/FinderLiveMentionUIC$MentionViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        aVar.f190928C.setOnClickListener(new C66341p1(l1Var));
    }

    /* renamed from: d3 */
    public static final void m78232d3(C66320l1 l1Var, int i) {
        l1Var.getClass();
        Integer valueOf = Integer.valueOf(i);
        int intValue = valueOf.intValue();
        if (!(intValue >= 0 && intValue < l1Var.f190923o.size())) {
            valueOf = null;
        }
        if (valueOf != null) {
            long j = l1Var.f190923o.get(valueOf.intValue()).field_id;
            C60333i iVar = (C60333i) ((C36570n) ((C60106t) C86312j.m106911c(C60106t.class)).f171524x).getValue();
            iVar.getClass();
            boolean execSQL = iVar.execSQL(iVar.getTableName(), "DELETE FROM " + iVar.getTableName() + " WHERE id=" + j);
            String str = iVar.f171981d;
            Log.m105924i(str, "[delById] id:" + j + ", succ:" + execSQL);
        }
    }

    /* renamed from: e3 */
    public final void mo90431e3() {
        View view = (View) ((C36570n) this.f190920i).getValue();
        int i = (this.f190922n != this.f190921j || this.f190923o.size() <= 1) ? 8 : 0;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveMentionUIC", "checkZipBtnVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveMentionUIC", "checkZipBtnVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: f3 */
    public final C66337n1 mo90432f3() {
        return (C66337n1) ((C36570n) this.f190925q).getValue();
    }

    /* renamed from: g3 */
    public final WxRecyclerView mo90433g3() {
        return (WxRecyclerView) ((C36570n) this.f190919h).getValue();
    }

    /* renamed from: i3 */
    public final void mo90434i3() {
        FinderLiveTaskBannerView finderLiveTaskBannerView;
        if (this.f190923o.isEmpty()) {
            View view = (View) ((C36570n) this.f190918g).getValue();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveMentionUIC", "refreshUIOnEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveMentionUIC", "refreshUIOnEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C66297d2 d2Var = (C66297d2) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C66297d2.class);
            if (d2Var.f190845F == 0 && (finderLiveTaskBannerView = d2Var.f190865x) != null) {
                finderLiveTaskBannerView.setVisibility(0);
            }
        }
    }

    /* renamed from: j3 */
    public final void mo90435j3(String str, C66276va vaVar) {
        C104289g gVar = new C104289g();
        if (vaVar != null) {
            gVar.mo145954o("msg_id", vaVar.field_id);
        }
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "JSONObject().apply {\n   …d) }\n        }.toString()");
        String n = C112551y.m153814n(gVar2, ",", ";", false);
        String str2 = this.f190915d;
        Log.m105924i(str2, "[report] actionStr:" + str + " , chnlExtra:" + n);
        ((C54108o) C86312j.m106911c(C54108o.class)).tw0(28, str, n);
    }

    /* renamed from: k3 */
    public final void mo90436k3(int i) {
        this.f190922n = i;
        mo90431e3();
        if (this.f190922n == 0) {
            if (this.f190924p.isEmpty()) {
                this.f190924p.add(this.f190923o.getFirst());
                mo90432f3().notifyDataSetChanged();
                mo90433g3().post(new C66323c(this));
            } else {
                int size = this.f190923o.size();
                for (int i2 = 1; i2 < size; i2++) {
                    this.f190924p.remove(1);
                }
                mo90433g3().setHasFixedSize(true);
                mo90432f3().notifyItemRangeRemoved(1, this.f190923o.size() - 1);
                mo90433g3().postDelayed(new C66324d(this), 200);
            }
            for (C66276va j3 : this.f190923o) {
                mo90435j3("1", j3);
            }
            return;
        }
        this.f190924p.clear();
        this.f190924p.addAll(this.f190923o);
        RecyclerView.C16631z I0 = mo90433g3().mo17023I0(0);
        C66321a aVar = I0 instanceof C66321a ? (C66321a) I0 : null;
        if (aVar != null) {
            mo90437l3(aVar);
        }
        mo90432f3().notifyItemRangeInserted(1, this.f190923o.size() - 1);
    }

    /* renamed from: l3 */
    public final void mo90437l3(C66321a aVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aVar.f190927B, "alpha", new float[]{1.0f, 0.0f});
        ofFloat.setDuration(200);
        ofFloat.start();
        View view = aVar.f190926A;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveMentionUIC", "setExpand", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/FinderLiveMentionUIC$MentionViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveMentionUIC", "setExpand", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/FinderLiveMentionUIC$MentionViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        aVar.f190928C.setOnClickListener(new C66328h(this, aVar));
        aVar.f190926A.setOnClickListener(new C66329i(this, aVar));
    }
}
