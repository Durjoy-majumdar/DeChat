package mm3;

import a11.C39479c;
import a14.C0000n0;
import a14.C53934p0;
import ac2.C39534d;
import ac2.C53996a;
import ac2.C53998c;
import androidx.appcompat.app.AppCompatActivity;
import bi3.C0289a;
import c14.C54624g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d14.C45252f;
import d14.C58017a1;
import d14.C58085t0;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import he0.C76158j;
import i40.C46166d;
import java.util.ArrayList;
import java.util.LinkedList;
import kotlin.ResultKt;
import lv1.C99671h;
import lv1.C99672i;
import om3.C77020b;
import pm3.C77113a;
import pm3.C77118d;
import rm3.C77540a;
import rx3.C13598b0;
import rx3.C36568h;
import tm3.C78069w;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: mm3.b */
public final class C76785b extends C53996a<C77020b> {

    /* renamed from: d */
    public final AppCompatActivity f224598d;

    /* renamed from: e */
    public final String f224599e;

    /* renamed from: f */
    public final String f224600f;

    /* renamed from: g */
    public final String f224601g;

    /* renamed from: h */
    public C44661m1 f224602h;

    /* renamed from: i */
    public LinkedList<String> f224603i = new LinkedList<>();

    @C91590f(mo125468c = "com.tencent.mm.ui.mvvm.datasource.chatroommember.QuoteFromDataSource$getData$2", mo125469f = "QuoteFromDataSource.kt", mo125470l = {78}, mo125471m = "invokeSuspend")
    /* renamed from: mm3.b$b */
    public static final class C61500b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f174840d;

        /* renamed from: e */
        public final /* synthetic */ C58085t0<C39534d<C77020b>> f174841e;

        /* renamed from: f */
        public final /* synthetic */ C39534d<C77020b> f174842f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61500b(C58085t0<C39534d<C77020b>> t0Var, C39534d<C77020b> dVar, C15601d<? super C61500b> dVar2) {
            super(2, dVar2);
            this.f174841e = t0Var;
            this.f174842f = dVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C61500b(this.f174841e, this.f174842f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C61500b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f174840d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C58085t0<C39534d<C77020b>> t0Var = this.f174841e;
                C39534d<C77020b> dVar = this.f174842f;
                this.f174840d = 1;
                if (t0Var.emit(dVar, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: mm3.b$a */
    public static final class C76786a extends C87413o implements C32224a<C46166d> {

        /* renamed from: d */
        public static final C76786a f224604d = new C76786a();

        public C76786a() {
            super(0);
        }

        public Object invoke() {
            return new C46166d();
        }
    }

    public C76785b(AppCompatActivity appCompatActivity, String str, String str2, String str3) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(str, "chatroom");
        C87412m.m108594g(str2, "quoteMember");
        C87412m.m108594g(str3, "quoteShowHeadDisplay");
        this.f224598d = appCompatActivity;
        this.f224599e = str;
        this.f224600f = str2;
        this.f224601g = str3;
        C36568h.m40985a(C76786a.f224604d);
    }

    /* renamed from: b */
    public C45252f<C39534d<C77020b>> mo70650e(LifecycleScope lifecycleScope, C53998c<C77020b> cVar) {
        int i;
        C44661m1 m1Var;
        UIStateCenter stateCenter;
        C78069w wVar;
        String wo;
        C76785b bVar = this;
        LifecycleScope lifecycleScope2 = lifecycleScope;
        C53998c<C77020b> cVar2 = cVar;
        C87412m.m108594g(lifecycleScope2, "scope");
        C87412m.m108594g(cVar2, "request");
        C39534d dVar = new C39534d(cVar2);
        int i2 = 0;
        C58085t0 b = C58017a1.m67173b(0, 0, (C54624g) null, 7, (Object) null);
        LinkedList<String> linkedList = bVar.f224603i;
        C44661m1 m1Var2 = bVar.f224602h;
        if (!(linkedList == null || m1Var2 == null || cVar2.f151264a >= linkedList.size())) {
            int size = linkedList.size();
            int i3 = cVar2.f151264a;
            int i4 = cVar2.f151265b;
            if (size > i3 + i4) {
                dVar.f106150a = true;
                i = i3 + i4;
            } else {
                i = linkedList.size();
            }
            ArrayList arrayList = new ArrayList();
            for (int i5 = cVar2.f151264a; i5 < i; i5++) {
                arrayList.add(linkedList.get(i5));
            }
            for (C72996z1 z1Var : C0289a.f857a.mo338c(arrayList)) {
                if (((int) z1Var.f108320R1) != 0) {
                    C77540a aVar = r8;
                    m1Var = m1Var2;
                    C77540a aVar2 = new C77540a(m1Var2, (C99671h) null, (C99672i) null, 0, 0, (String) null, 62, (C8480h) null);
                    String username = z1Var.getUsername();
                    C87412m.m108593f(username, "contact.username");
                    String str = username + '-' + 3 + '-' + i2;
                    AppCompatActivity appCompatActivity = bVar.f224598d;
                    String str2 = bVar.f224601g;
                    C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                    C87412m.m108594g(str, "id");
                    C87412m.m108594g(str2, "quoteFromHeadDisplay");
                    String str3 = str2;
                    AppCompatActivity appCompatActivity2 = appCompatActivity;
                    C77118d a = C77113a.f225222a.mo107428a(appCompatActivity, z1Var, aVar.f226065b, aVar.f226066c, aVar.f226064a);
                    String username2 = z1Var.getUsername();
                    C87412m.m108593f(username2, "contact.username");
                    CharSequence charSequence = a.f225226a;
                    String str4 = "";
                    C77020b bVar2 = new C77020b(str, 3, username2, charSequence == null ? str4 : charSequence, aVar);
                    bVar2.mo107341b(a.f225227b);
                    C76158j jVar = (C76158j) C86312j.m106911c(C76158j.class);
                    if (!(jVar == null || (wo = jVar.mo106373wo(z1Var.mo73980x2(), z1Var.mo73976t2())) == null)) {
                        str4 = wo;
                    }
                    bVar2.f225010i = str4;
                    if (!Util.isNullOrNil((CharSequence) str4) && C87412m.m108589b("3552365301", z1Var.mo73980x2())) {
                        StringBuilder sb = new StringBuilder();
                        sb.append('@');
                        sb.append(bVar2.f225010i);
                        bVar2.f225010i = sb.toString();
                    }
                    if (!(!(appCompatActivity2 instanceof BaseMvvmActivity) || (stateCenter = ((BaseMvvmActivity) appCompatActivity2).getStateCenter()) == null || (wVar = (C78069w) stateCenter.getState()) == null)) {
                        bVar2.f225018t = wVar.mo108033b();
                        bVar2.f225017s = wVar.mo108034c(bVar2.f225007f);
                        bVar2.f225016r = wVar.mo108032a(bVar2.f225007f);
                    }
                    bVar2.f225012n = true;
                    bVar2.f225013o = str3;
                    bVar2.f225014p = appCompatActivity2.getResources().getColor(C0966R.color.f2929c);
                    dVar.f106151b.add(bVar2);
                } else {
                    m1Var = m1Var2;
                }
                i2 = 0;
                bVar = this;
                m1Var2 = m1Var;
            }
        }
        LifecycleScope.launchDefault$default(lifecycleScope2, (C53934p0) null, new C61500b(b, dVar, (C15601d<? super C61500b>) null), 1, (Object) null);
        return b;
    }

    /* renamed from: d */
    public int mo70649d() {
        return -1;
    }

    public void onCreate() {
        this.f224602h = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(this.f224599e);
        this.f224603i.add(this.f224600f);
    }
}
