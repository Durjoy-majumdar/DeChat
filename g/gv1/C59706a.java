package gv1;

import android.content.Context;
import android.os.PowerManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.forcenotify.p058ui.MsgWindow$onShowWindow$2;
import com.tencent.p014mm.plugin.forcenotify.p058ui.view.StackLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import di3.C86312j;
import ev1.C58838a;
import ev1.C58842g;
import fy3.C32224a;
import gv1.C59712c;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import p206nj.C11171e;
import p447aw.C103918d;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import zt3.C119157j;

/* renamed from: gv1.a */
public abstract class C59706a implements View.OnKeyListener {

    /* renamed from: d */
    public final C13601g f170564d = C36568h.m40985a(C59707a.f170570d);

    /* renamed from: e */
    public View f170565e;

    /* renamed from: f */
    public boolean f170566f;

    /* renamed from: g */
    public boolean f170567g;

    /* renamed from: h */
    public final C13601g f170568h = C36568h.m40985a(new C59708b(this));

    /* renamed from: i */
    public final C13601g f170569i = C36568h.m40985a(new C59710d(this));

    /* renamed from: gv1.a$a */
    public static final class C59707a extends C87413o implements C32224a<Context> {

        /* renamed from: d */
        public static final C59707a f170570d = new C59707a();

        public C59707a() {
            super(0);
        }

        public Object invoke() {
            return MMApplicationContext.getContext();
        }
    }

    /* renamed from: gv1.a$b */
    public static final class C59708b extends C87413o implements C32224a<PowerManager> {

        /* renamed from: d */
        public final /* synthetic */ C59706a f170571d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59708b(C59706a aVar) {
            super(0);
            this.f170571d = aVar;
        }

        public Object invoke() {
            Object systemService = this.f170571d.mo84681g().getSystemService("power");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            return (PowerManager) systemService;
        }
    }

    /* renamed from: gv1.a$c */
    public static final class C59709c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C59706a f170572d;

        public C59709c(C59706a aVar) {
            this.f170572d = aVar;
        }

        public final void run() {
            C59706a aVar = this.f170572d;
            if (!aVar.f170566f) {
                aVar.f170567g = C85875k4.m106211z();
                C59706a aVar2 = this.f170572d;
                LayoutInflater b = C85868k2.m106137b(aVar2.mo84681g());
                this.f170572d.getClass();
                aVar2.f170565e = b.inflate(C0966R.C0971layout.asi, (ViewGroup) null);
                C59706a aVar3 = this.f170572d;
                C87412m.m108591d(aVar3.f170565e);
                C59712c cVar = (C59712c) aVar3;
                View view = cVar.f170565e;
                cVar.f170586n = (RecyclerView) (view != null ? view.findViewById(C0966R.C0970id.ixh) : null);
                View view2 = cVar.f170565e;
                cVar.f170587o = view2 != null ? view2.findViewById(C0966R.C0970id.jfe) : null;
                View view3 = cVar.f170565e;
                cVar.f170588p = view3 != null ? view3.findViewById(C0966R.C0970id.c79) : null;
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                C59706a aVar4 = this.f170572d;
                layoutParams.type = C11171e.m11046c(26) ? 2038 : 2002;
                layoutParams.format = -2;
                layoutParams.packageName = aVar4.mo84681g().getPackageName();
                layoutParams.gravity = 48;
                layoutParams.flags = 1064;
                layoutParams.horizontalMargin = (float) aVar4.mo84681g().getResources().getDimensionPixelSize(C0966R.dimen.f3766df);
                layoutParams.width = -1;
                layoutParams.height = -2;
                View view4 = this.f170572d.f170565e;
                if (view4 != null) {
                    C9556a aVar5 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar5.mo10233c(0);
                    C117292a.m165358d(view4, aVar5.mo10232b(), "com/tencent/mm/plugin/forcenotify/ui/BaseWindow$show$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/forcenotify/ui/BaseWindow$show$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                try {
                    ((WindowManager) ((C36570n) this.f170572d.f170569i).getValue()).addView(this.f170572d.f170565e, layoutParams);
                } catch (Exception unused) {
                    this.f170572d.getClass();
                    Log.m105920e("ForceNotify.BaseWindow", "attach to window failed!");
                }
                C59712c cVar2 = (C59712c) this.f170572d;
                View view5 = cVar2.f170565e;
                if (view5 != null) {
                    view5.setFocusableInTouchMode(true);
                }
                View view6 = cVar2.f170565e;
                if (view6 != null) {
                    view6.setOnKeyListener(cVar2);
                }
                RecyclerView recyclerView = cVar2.f170586n;
                if (recyclerView != null) {
                    recyclerView.setItemAnimator((RecyclerView.C16616j) null);
                }
                C58838a aVar6 = (C58838a) C110818d0.m150925W(cVar2.f170589q);
                if (aVar6 == null || aVar6.mo75c() != -1) {
                    cVar2.f170589q.add(C58842g.f168451h);
                }
                ArrayList<C58838a> arrayList = cVar2.f170589q;
                ArrayList arrayList2 = new ArrayList();
                Iterator<C58838a> it = arrayList.iterator();
                while (it.hasNext()) {
                    C58838a next = it.next();
                    if (next.mo75c() != -1) {
                        arrayList2.add(next);
                    }
                }
                cVar2.f170589q.removeAll(arrayList2);
                int i = 8;
                StackLayoutManager stackLayoutManager = new StackLayoutManager(2, C76577a.m92151b(cVar2.mo84681g(), 8), 0.1f, true, new C59734f(cVar2));
                cVar2.f170585j = stackLayoutManager;
                C59712c.C59721i iVar = cVar2.f170584H;
                C87412m.m108594g(iVar, "animator");
                if (!((ArrayList) stackLayoutManager.f52651s).contains(iVar)) {
                    ((ArrayList) stackLayoutManager.f52651s).add(iVar);
                }
                RecyclerView recyclerView2 = cVar2.f170586n;
                if (recyclerView2 != null) {
                    recyclerView2.setLayoutManager(cVar2.f170585j);
                }
                RecyclerView recyclerView3 = cVar2.f170586n;
                if (recyclerView3 != null) {
                    WxRecyclerAdapter wxRecyclerAdapter = new WxRecyclerAdapter(new MsgWindow$onShowWindow$2(), cVar2.f170589q, false);
                    wxRecyclerAdapter.f173488o = new C59735h(wxRecyclerAdapter, cVar2);
                    recyclerView3.setAdapter(wxRecyclerAdapter);
                }
                View view7 = cVar2.f170587o;
                if (view7 != null) {
                    if (!cVar2.f170567g) {
                        i = 0;
                    }
                    C9556a aVar7 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar7.mo10233c(Integer.valueOf(i));
                    View view8 = view7;
                    C117292a.m165358d(view8, aVar7.mo10232b(), "com/tencent/mm/plugin/forcenotify/ui/MsgWindow", "onShowWindow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view7.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                    C117292a.m165359e(view8, "com/tencent/mm/plugin/forcenotify/ui/MsgWindow", "onShowWindow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                RecyclerView recyclerView4 = cVar2.f170586n;
                if (recyclerView4 != null) {
                    recyclerView4.post(new C59736i(arrayList2, cVar2));
                }
                this.f170572d.f170566f = true;
            }
        }
    }

    /* renamed from: gv1.a$d */
    public static final class C59710d extends C87413o implements C32224a<WindowManager> {

        /* renamed from: d */
        public final /* synthetic */ C59706a f170573d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59710d(C59706a aVar) {
            super(0);
            this.f170573d = aVar;
        }

        public Object invoke() {
            Object systemService = this.f170573d.mo84681g().getSystemService("window");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            return (WindowManager) systemService;
        }
    }

    /* renamed from: g */
    public final Context mo84681g() {
        Object value = ((C36570n) this.f170564d).getValue();
        C87412m.m108593f(value, "<get-context>(...)");
        return (Context) value;
    }

    public void show() {
        if (((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(mo84681g())) {
            ((C119157j) C119157j.f356862d).mo183895z(new C59709c(this));
        }
    }
}
