package fk3;

import android.content.Context;
import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import kg3.C76577a;
import p248ug.C65347o0;
import rx3.C13598b0;

/* renamed from: fk3.l */
public final class C8100l {

    /* renamed from: a */
    public RecyclerView f26957a;

    /* renamed from: b */
    public Context f26958b;

    /* renamed from: c */
    public C8097j f26959c;

    /* renamed from: fk3.l$a */
    public static final class C8101a extends RecyclerView.C0129l {

        /* renamed from: d */
        public Context f26960d;

        public C8101a(Context context) {
            C87412m.m108594g(context, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            this.f26960d = context;
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            if (recyclerView.mo17029N0(view) == 0) {
                rect.left = C76577a.m92155f(this.f26960d, C0966R.dimen.f3723cd);
            }
            rect.right = C76577a.m92155f(this.f26960d, C0966R.dimen.f3766df);
        }
    }

    /* renamed from: fk3.l$b */
    public static final class C8102b extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<String, C13598b0> f26961d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList<Pair<String, ArrayList<String>>> f26962e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8102b(C32226l<? super String, C13598b0> lVar, ArrayList<Pair<String, ArrayList<String>>> arrayList) {
            super(1);
            this.f26961d = lVar;
            this.f26962e = arrayList;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            C32226l<String, C13598b0> lVar = this.f26961d;
            Object obj2 = this.f26962e.get(intValue).first;
            C87412m.m108593f(obj2, "sugList[position].first");
            lVar.invoke(obj2);
            return C13598b0.f38549a;
        }
    }

    public C8100l(RecyclerView recyclerView, Context context) {
        C87412m.m108594g(recyclerView, "sugRv");
        C87412m.m108594g(context, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f26957a = recyclerView;
        this.f26958b = context;
        recyclerView.mo17085h0(new C8101a(context));
    }

    /* renamed from: a */
    public final void mo9175a(C32226l<? super String, C13598b0> lVar, C32226l<? super ArrayList<Pair<String, ArrayList<String>>>, C13598b0> lVar2) {
        C87412m.m108594g(lVar, "callback");
        ArrayList<Pair<String, ArrayList<String>>> Kc = ((C65347o0) C86312j.m106911c(C65347o0.class)).mo89073Kc();
        if (Kc.isEmpty()) {
            this.f26957a.setVisibility(8);
        } else {
            this.f26957a.setVisibility(0);
        }
        if (lVar2 != null) {
            lVar2.invoke(Kc);
        }
        this.f26959c = new C8097j(Kc, new C8102b(lVar, Kc));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f26958b);
        linearLayoutManager.mo16974W(0);
        this.f26957a.setLayoutManager(linearLayoutManager);
        this.f26957a.setAdapter(this.f26959c);
    }
}
