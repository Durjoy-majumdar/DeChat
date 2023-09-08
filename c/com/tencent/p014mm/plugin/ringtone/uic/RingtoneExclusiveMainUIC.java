package com.tencent.p014mm.plugin.ringtone.uic;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import bl3.C54492n;
import ck2.C54883d0;
import ck2.C54894g;
import ck2.C54897h;
import ck2.C54911i;
import ck2.C54914j0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d14.C45253g;
import d14.C58050i1;
import d14.C58052j1;
import di3.C86312j;
import dk2.C58318a;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60898l;
import jq3.C60905o;
import kotlin.ResultKt;
import nj2.C61759g;
import pj2.C62318a;
import qc0.C101093a;
import r13.C63358c;
import rc0.C63389c;
import rj2.C63447a;
import rj2.C63451c;
import rx3.C13598b0;
import rx3.C13600d;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wj2.C66132f;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.ringtone.uic.RingtoneExclusiveMainUIC */
public final class RingtoneExclusiveMainUIC extends UIComponent {

    /* renamed from: d */
    public final C13601g f164085d = C36568h.m40985a(new C57294b(this));

    /* renamed from: e */
    public LinearLayoutManager f164086e;

    /* renamed from: f */
    public final C13601g f164087f = C36568h.m40985a(new C57293a(this));

    /* renamed from: g */
    public final C13601g f164088g = C36568h.m40985a(new C57297e(this));

    /* renamed from: h */
    public final C13601g f164089h = C36568h.m40985a(new C57295c(this));

    /* renamed from: i */
    public final C13601g f164090i = C36568h.m40985a(new C57296d(this));

    /* renamed from: j */
    public WxRecyclerAdapter<C62318a> f164091j;

    /* renamed from: com.tencent.mm.plugin.ringtone.uic.RingtoneExclusiveMainUIC$a */
    public static final class C57293a extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ RingtoneExclusiveMainUIC f164092d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57293a(RingtoneExclusiveMainUIC ringtoneExclusiveMainUIC) {
            super(0);
            this.f164092d = ringtoneExclusiveMainUIC;
        }

        public Object invoke() {
            return ((View) ((C36570n) this.f164092d.f164089h).getValue()).findViewById(C0966R.C0970id.hkp);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ringtone.uic.RingtoneExclusiveMainUIC$b */
    public static final class C57294b extends C87413o implements C32224a<WxRecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ RingtoneExclusiveMainUIC f164093d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57294b(RingtoneExclusiveMainUIC ringtoneExclusiveMainUIC) {
            super(0);
            this.f164093d = ringtoneExclusiveMainUIC;
        }

        public Object invoke() {
            return (WxRecyclerView) this.f164093d.findViewById(C0966R.C0970id.clx);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ringtone.uic.RingtoneExclusiveMainUIC$c */
    public static final class C57295c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ RingtoneExclusiveMainUIC f164094d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57295c(RingtoneExclusiveMainUIC ringtoneExclusiveMainUIC) {
            super(0);
            this.f164094d = ringtoneExclusiveMainUIC;
        }

        public Object invoke() {
            return this.f164094d.findViewById(C0966R.C0970id.clv);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ringtone.uic.RingtoneExclusiveMainUIC$d */
    public static final class C57296d extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ RingtoneExclusiveMainUIC f164095d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57296d(RingtoneExclusiveMainUIC ringtoneExclusiveMainUIC) {
            super(0);
            this.f164095d = ringtoneExclusiveMainUIC;
        }

        public Object invoke() {
            return ((View) ((C36570n) this.f164095d.f164089h).getValue()).findViewById(C0966R.C0970id.etm);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ringtone.uic.RingtoneExclusiveMainUIC$e */
    public static final class C57297e extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ RingtoneExclusiveMainUIC f164096d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57297e(RingtoneExclusiveMainUIC ringtoneExclusiveMainUIC) {
            super(0);
            this.f164096d = ringtoneExclusiveMainUIC;
        }

        public Object invoke() {
            return ((View) ((C36570n) this.f164096d.f164089h).getValue()).findViewById(C0966R.C0970id.f5595jc);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.uic.RingtoneExclusiveMainUIC$onResume$1", mo125469f = "RingtoneExclusiveMainUIC.kt", mo125470l = {55}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.ringtone.uic.RingtoneExclusiveMainUIC$f */
    public static final class C57298f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f164097d;

        /* renamed from: e */
        public final /* synthetic */ RingtoneExclusiveMainUIC f164098e;

        /* renamed from: com.tencent.mm.plugin.ringtone.uic.RingtoneExclusiveMainUIC$f$a */
        public static final class C57299a<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ RingtoneExclusiveMainUIC f164099d;

            public C57299a(RingtoneExclusiveMainUIC ringtoneExclusiveMainUIC) {
                this.f164099d = ringtoneExclusiveMainUIC;
            }

            public Object emit(Object obj, C15601d dVar) {
                ((C119157j) C119157j.f356862d).mo183895z(new C57304a((C63451c.C63452a.C63453a) obj, this.f164099d));
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57298f(RingtoneExclusiveMainUIC ringtoneExclusiveMainUIC, C15601d<? super C57298f> dVar) {
            super(2, dVar);
            this.f164098e = ringtoneExclusiveMainUIC;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C57298f(this.f164098e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C57298f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C58050i1<C63451c.C63452a.C63453a> i1Var;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f164097d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C63451c cVar = ((C54883d0) C39818r.f106831a.mo62444c(this.f164098e.getActivity()).mo75002a(C54883d0.class)).f153833d;
                if (cVar == null || (i1Var = cVar.f179977f) == null) {
                    return C13598b0.f38549a;
                }
                C57299a aVar2 = new C57299a(this.f164098e);
                this.f164097d = 1;
                if (((C58052j1) i1Var).mo31880a(aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            throw new C13600d();
        }
    }

    /* renamed from: com.tencent.mm.plugin.ringtone.uic.RingtoneExclusiveMainUIC$g */
    public static final class C57300g extends RecyclerView.C16623q {
    }

    /* renamed from: com.tencent.mm.plugin.ringtone.uic.RingtoneExclusiveMainUIC$h */
    public static final class C57301h extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ RingtoneExclusiveMainUIC f164100d;

        public C57301h(RingtoneExclusiveMainUIC ringtoneExclusiveMainUIC) {
            this.f164100d = ringtoneExclusiveMainUIC;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC$reInitAdapter$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC$reInitAdapter$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC$reInitAdapter$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && i2 > 0) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                if (linearLayoutManager.mo16959E() >= linearLayoutManager.getItemCount()) {
                    C54897h hVar = (C54897h) C39818r.f106831a.mo62444c(this.f164100d.getActivity()).mo75002a(C54897h.class);
                    C53895h.m60466d(hVar.getLifecycleScope(), (C66212f) null, (C53934p0) null, new C54894g(hVar, (C15601d<? super C54894g>) null), 3, (Object) null);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC$reInitAdapter$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.ringtone.uic.RingtoneExclusiveMainUIC$i */
    public static final class C57302i implements C60898l.C9502b<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ RingtoneExclusiveMainUIC f164101d;

        public C57302i(RingtoneExclusiveMainUIC ringtoneExclusiveMainUIC) {
            this.f164101d = ringtoneExclusiveMainUIC;
        }

        /* renamed from: q */
        public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
            int i2;
            String str;
            RecyclerView.C16613e eVar2 = eVar;
            int i3 = i;
            Class cls = C54914j0.class;
            C87412m.m108594g(eVar2, "adapter");
            C87412m.m108594g(view, "view");
            C87412m.m108594g((C60905o) zVar, "holder");
            WxRecyclerAdapter wxRecyclerAdapter = (WxRecyclerAdapter) eVar2;
            if (i3 < 0 || i3 >= wxRecyclerAdapter.getItemCount() - wxRecyclerAdapter.f173486j.size()) {
                Log.m105920e(C54492n.TAG, "invalid position:" + i3);
                return;
            }
            C62318a aVar = (C62318a) wxRecyclerAdapter.getData().get(i3);
            aVar.getClass();
            boolean z = aVar.f177145e;
            boolean z2 = true;
            if (z) {
                if (C58318a.f166995b) {
                    C101093a.m132486h();
                    ((C63389c) C86312j.m106911c(C63389c.class)).mo88298vr();
                }
                C58318a.f166995b = false;
                i2 = 1;
            } else {
                i2 = C58318a.f166994a.mo83069a();
                if (i2 == 0) {
                    return;
                }
            }
            for (C62318a aVar2 : wxRecyclerAdapter.getData()) {
                if (aVar2.getItemId() != aVar.getItemId()) {
                    aVar2.f177145e = false;
                    wxRecyclerAdapter.mo85799f6(aVar2.getItemId(), Boolean.FALSE);
                }
            }
            boolean z3 = !z;
            aVar.f177145e = z3;
            C66132f a = C63447a.m74787a(aVar.getItemId());
            if (a != null && (str = aVar.f177144d.f147588d) != null) {
                if (aVar.f177145e) {
                    if (a.f190095r == null || a.mo90178i().f170150b == null || !C63358c.m74700b(a.mo90178i())) {
                        z2 = false;
                    }
                    ((C54914j0) C39818r.f106831a.mo62444c(this.f164101d.getActivity()).mo75002a(cls)).mo75845e3(a, str, z2);
                }
                if (i2 != 2) {
                    RingtoneExclusiveMainUIC ringtoneExclusiveMainUIC = this.f164101d;
                    long itemId = aVar.getItemId();
                    boolean z4 = aVar.f177145e;
                    ringtoneExclusiveMainUIC.getClass();
                    if (a.mo90179j()) {
                        C39818r rVar = C39818r.f106831a;
                        C39622i0 a2 = rVar.mo62443b(ringtoneExclusiveMainUIC.getContext()).mo75002a(RingtoneDataUIC.class);
                        C87412m.m108593f(a2, "UICProvider.of(context).…gtoneDataUIC::class.java)");
                        RingtoneDataUIC.m66025e3((RingtoneDataUIC) a2, a, 39, 23, 0, (String) null, 0, 56, (Object) null);
                        ((C54914j0) rVar.mo62443b(ringtoneExclusiveMainUIC.getContext()).mo75002a(cls)).mo75843c3(a, str);
                    } else {
                        ((C54883d0) C39818r.f106831a.mo62444c(ringtoneExclusiveMainUIC.getActivity()).mo75002a(C54883d0.class)).mo75824c3(a, itemId, z4, true, true);
                    }
                } else {
                    C119179t tVar = C119157j.f356862d;
                    C57305b bVar = new C57305b(this.f164101d);
                    C119157j jVar = (C119157j) tVar;
                    jVar.getClass();
                    jVar.mo183892w(bVar, 200, false);
                }
                wxRecyclerAdapter.mo85799f6(aVar.getItemId(), Boolean.valueOf(z3));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RingtoneExclusiveMainUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final WxRecyclerView mo80836c3() {
        return (WxRecyclerView) ((C36570n) this.f164085d).getValue();
    }

    /* renamed from: d3 */
    public final void mo80837d3(ArrayList<C62318a> arrayList) {
        this.f164091j = new WxRecyclerAdapter<>(new RingtoneExclusiveMainUIC$reInitAdapter$1(this), arrayList, true);
        mo80836c3().mo17043c(new C57301h(this));
        WxRecyclerAdapter<C62318a> wxRecyclerAdapter = this.f164091j;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.f173488o = new C57302i(this);
        }
        mo80836c3().setAdapter(this.f164091j);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 8 && i2 == -1 && intent != null) {
            String stringExtra = intent.getStringExtra("Select_Contact");
            if (stringExtra == null || stringExtra.length() == 0) {
                Log.m105928w(C54492n.TAG, "empty or null contact: " + stringExtra);
                return;
            }
            C61759g.C61760a.m72462b(C61759g.f175551f, getContext(), 2, stringExtra, ((RingtoneDataUIC) C39818r.f106831a.mo62444c(getActivity()).mo75002a(RingtoneDataUIC.class)).f164072e, false, (C66132f) null, 48, (Object) null);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (C58318a.f166995b) {
            C101093a.m132486h();
            ((C63389c) C86312j.m106911c(C63389c.class)).mo88298vr();
        }
        C58318a.f166995b = false;
    }

    public void onResume() {
        super.onResume();
        C53895h.m60466d(getLifecycleScope(), (C66212f) null, (C53934p0) null, new C57298f(this, (C15601d<? super C57298f>) null), 3, (Object) null);
        this.f164086e = new LinearLayoutManager(getActivity());
        mo80836c3().setLayoutManager(this.f164086e);
        WxRecyclerView c3 = mo80836c3();
        C57300g gVar = new C57300g();
        gVar.mo17336e(2, 10);
        c3.setRecycledViewPool(gVar);
        mo80836c3().setNestedScrollingEnabled(false);
        C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C54911i(this, (C15601d<? super C54911i>) null), 3, (Object) null);
        mo80837d3(new ArrayList());
    }
}
