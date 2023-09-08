package dn3;

import a14.C53934p0;
import ac2.C39534d;
import ac2.C53998c;
import ac2.C54000f;
import androidx.appcompat.app.AppCompatActivity;
import bc2.C0262a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import eb0.C45628s0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import nm3.C76940d;
import om3.C77020b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64186f0;
import tm3.C64957k;
import tm3.C78056e;
import tm3.C78069w;
import wx3.C15601d;
import z04.C112550d0;
import z04.C112551y;
import z04.C66723k;

/* renamed from: dn3.c */
public final class C7396c extends C0262a<C77020b> {

    /* renamed from: d */
    public final int f25535d = C74560s1.m89278g(1, 2);

    /* renamed from: e */
    public final C13601g f25536e = C36568h.m40985a(new C7398b(this));

    /* renamed from: f */
    public final C13601g f25537f;

    /* renamed from: g */
    public final C13601g f25538g;

    /* renamed from: h */
    public final C13601g f25539h;

    /* renamed from: i */
    public final C13601g f25540i;

    /* renamed from: j */
    public final C13601g f25541j;

    /* renamed from: n */
    public final C13601g f25542n;

    /* renamed from: dn3.c$a */
    public static final class C7397a extends C87413o implements C32224a<HashSet<String>> {

        /* renamed from: d */
        public final /* synthetic */ C7396c f25543d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7397a(C7396c cVar) {
            super(0);
            this.f25543d = cVar;
        }

        public Object invoke() {
            String[] strArr;
            HashSet hashSet = new HashSet();
            hashSet.addAll(C74560s1.m89273b());
            String stringExtra = this.f25543d.getIntent().getStringExtra("Select_block_List");
            if (!Util.isNullOrNil(stringExtra)) {
                if (stringExtra != null) {
                    Object[] array = new C66723k(",").mo90760e(stringExtra, 0).toArray(new String[0]);
                    C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    strArr = (String[]) array;
                } else {
                    strArr = null;
                }
                hashSet.addAll(Util.stringsToList(strArr));
            }
            if (C74560s1.m89275d(((Number) ((C36570n) this.f25543d.f25539h).getValue()).intValue(), 2)) {
                HashSet<String> h = C45628s0.m50776h();
                h.remove("filehelper");
                hashSet.addAll(h);
            }
            return hashSet;
        }
    }

    /* renamed from: dn3.c$b */
    public static final class C7398b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C7396c f25544d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7398b(C7396c cVar) {
            super(0);
            this.f25544d = cVar;
        }

        public Object invoke() {
            String stringExtra = this.f25544d.getIntent().getStringExtra("key_chatroomSessionWord");
            if (stringExtra != null) {
                if (!(!C112551y.m153811k(stringExtra))) {
                    stringExtra = null;
                }
                if (stringExtra != null) {
                    return stringExtra;
                }
            }
            return this.f25544d.getString(C0966R.string.mpm);
        }
    }

    /* renamed from: dn3.c$c */
    public static final class C7399c extends C87413o implements C32224a<C76940d> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f25545d;

        /* renamed from: e */
        public final /* synthetic */ C7396c f25546e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7399c(AppCompatActivity appCompatActivity, C7396c cVar) {
            super(0);
            this.f25545d = appCompatActivity;
            this.f25546e = cVar;
        }

        public Object invoke() {
            String str = (String) ((C36570n) this.f25546e.f25537f).getValue();
            C87412m.m108593f(str, "selectShowHeadDisplay");
            String str2 = (String) ((C36570n) this.f25546e.f25536e).getValue();
            C87412m.m108593f(str2, "chatroomSessionWord");
            return new C76940d(this.f25545d, (HashSet) ((C36570n) this.f25546e.f25540i).getValue(), (List) ((C36570n) this.f25546e.f25538g).getValue(), str, str2);
        }
    }

    /* renamed from: dn3.c$d */
    public static final class C7400d extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C7396c f25547d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7400d(C7396c cVar) {
            super(1);
            this.f25547d = cVar;
        }

        public Object invoke(Object obj) {
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            C7396c cVar = this.f25547d;
            IStateAction action = wVar.getAction();
            if (action != null && (action instanceof C78056e)) {
                C78056e eVar = (C78056e) action;
                LifecycleScope c3 = cVar.mo14597c3();
                if (c3 != null) {
                    LifecycleScope.launchDefault$default(c3, (C53934p0) null, new C7406d(cVar, eVar, (C15601d<? super C7406d>) null), 1, (Object) null);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dn3.c$e */
    public static final class C7401e extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C7396c f25548d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7401e(C7396c cVar) {
            super(1);
            this.f25548d = cVar;
        }

        public Object invoke(Object obj) {
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            C7396c cVar = this.f25548d;
            IStateAction action = wVar.getAction();
            if (action != null && (action instanceof C64957k)) {
                C64957k kVar = (C64957k) action;
                List<C77020b> list = kVar.f187039c;
                ArrayList arrayList = new ArrayList();
                for (T next : list) {
                    C77020b bVar = (C77020b) next;
                    List<String> list2 = ((C76940d) ((C36570n) cVar.f25542n).getValue()).f224850j;
                    boolean z = true;
                    if (list2 == null || !list2.contains(bVar.f225007f)) {
                        z = false;
                    }
                    if (z) {
                        arrayList.add(next);
                    }
                }
                kVar.f187039c = arrayList;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dn3.c$f */
    public static final class C7402f extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f25549d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7402f(AppCompatActivity appCompatActivity) {
            super(0);
            this.f25549d = appCompatActivity;
        }

        public Object invoke() {
            return this.f25549d.getResources().getString(C0966R.string.mtw);
        }
    }

    /* renamed from: dn3.c$g */
    public static final class C7403g extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C7396c f25550d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7403g(C7396c cVar) {
            super(0);
            this.f25550d = cVar;
        }

        public Object invoke() {
            return Integer.valueOf(this.f25550d.getIntent().getIntExtra("Select_Conv_Type", this.f25550d.f25535d));
        }
    }

    /* renamed from: dn3.c$h */
    public static final class C7404h extends C87413o implements C32224a<List<? extends String>> {

        /* renamed from: d */
        public final /* synthetic */ C7396c f25551d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7404h(C7396c cVar) {
            super(0);
            this.f25551d = cVar;
        }

        public Object invoke() {
            String stringExtra = this.f25551d.getIntent().getStringExtra("chatroomlist");
            if (stringExtra != null) {
                if (!(!C112551y.m153811k(stringExtra))) {
                    stringExtra = null;
                }
                String str = stringExtra;
                if (str != null) {
                    return C112550d0.m153785U(str, new String[]{","}, false, 0, 6, (Object) null);
                }
            }
            return C64186f0.f181907d;
        }
    }

    /* renamed from: dn3.c$i */
    public static final class C7405i extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C7396c f25552d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7405i(C7396c cVar) {
            super(0);
            this.f25552d = cVar;
        }

        public Object invoke() {
            return this.f25552d.getIntent().getStringExtra("key_tipWord");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7396c(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f25537f = C36568h.m40985a(new C7402f(appCompatActivity));
        this.f25538g = C36568h.m40985a(new C7404h(this));
        this.f25539h = C36568h.m40985a(new C7403g(this));
        this.f25540i = C36568h.m40985a(new C7397a(this));
        this.f25541j = C36568h.m40985a(new C7405i(this));
        this.f25542n = C36568h.m40985a(new C7399c(appCompatActivity, this));
    }

    /* renamed from: g3 */
    public C54000f<C77020b, C53998c<C77020b>, C39534d<C77020b>> mo302g3() {
        return (C76940d) ((C36570n) this.f25542n).getValue();
    }

    /* JADX WARNING: type inference failed for: r4v18, types: [com.tencent.mm.sdk.statecenter.BaseState] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        r4 = r4.getStateCenter();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onCreate(r4)
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity r4 = r3.mo14598d3()
            if (r4 == 0) goto L_0x001b
            com.tencent.mm.sdk.statecenter.UIStateCenter r4 = r4.getStateCenter()
            if (r4 == 0) goto L_0x001b
            androidx.appcompat.app.AppCompatActivity r0 = r3.getActivity()
            dn3.c$d r1 = new dn3.c$d
            r1.<init>(r3)
            r4.observe((androidx.lifecycle.C0125s) r0, r1)
        L_0x001b:
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity r4 = r3.mo14598d3()
            if (r4 == 0) goto L_0x0033
            com.tencent.mm.sdk.statecenter.UIStateCenter r4 = r4.getStateCenter()
            if (r4 == 0) goto L_0x0033
            androidx.appcompat.app.AppCompatActivity r0 = r3.getActivity()
            dn3.c$e r1 = new dn3.c$e
            r1.<init>(r3)
            r4.process((androidx.lifecycle.C0125s) r0, r1)
        L_0x0033:
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity r4 = r3.mo14598d3()
            r0 = 0
            if (r4 == 0) goto L_0x0047
            com.tencent.mm.sdk.statecenter.UIStateCenter r4 = r4.getStateCenter()
            if (r4 == 0) goto L_0x0047
            com.tencent.mm.sdk.statecenter.BaseState r4 = r4.getInitState()
            tm3.w r4 = (tm3.C78069w) r4
            goto L_0x0048
        L_0x0047:
            r4 = r0
        L_0x0048:
            if (r4 != 0) goto L_0x004b
            goto L_0x004e
        L_0x004b:
            r1 = 1
            r4.f228833u = r1
        L_0x004e:
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity r4 = r3.mo14598d3()
            if (r4 == 0) goto L_0x0061
            com.tencent.mm.sdk.statecenter.UIStateCenter r4 = r4.getStateCenter()
            if (r4 == 0) goto L_0x0061
            com.tencent.mm.sdk.statecenter.BaseState r4 = r4.getInitState()
            tm3.w r4 = (tm3.C78069w) r4
            goto L_0x0062
        L_0x0061:
            r4 = r0
        L_0x0062:
            if (r4 != 0) goto L_0x0065
            goto L_0x0077
        L_0x0065:
            rx3.g r1 = r3.f25537f
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "selectShowHeadDisplay"
            gy3.C87412m.m108593f(r1, r2)
            r4.f228834v = r1
        L_0x0077:
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity r4 = r3.mo14598d3()
            if (r4 == 0) goto L_0x008a
            com.tencent.mm.sdk.statecenter.UIStateCenter r4 = r4.getStateCenter()
            if (r4 == 0) goto L_0x008a
            com.tencent.mm.sdk.statecenter.BaseState r4 = r4.getInitState()
            r0 = r4
            tm3.w r0 = (tm3.C78069w) r0
        L_0x008a:
            if (r0 != 0) goto L_0x008d
            goto L_0x009e
        L_0x008d:
            rx3.g r4 = r3.f25536e
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r1 = "chatroomSessionWord"
            gy3.C87412m.m108593f(r4, r1)
            r0.f228835w = r4
        L_0x009e:
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity r4 = r3.mo14598d3()
            if (r4 == 0) goto L_0x00c3
            com.tencent.mm.sdk.statecenter.UIStateCenter r4 = r4.getStateCenter()
            if (r4 == 0) goto L_0x00c3
            com.tencent.mm.sdk.statecenter.BaseState r4 = r4.getInitState()
            tm3.w r4 = (tm3.C78069w) r4
            if (r4 == 0) goto L_0x00c3
            java.util.HashSet<java.lang.String> r4 = r4.f228827o
            if (r4 == 0) goto L_0x00c3
            rx3.g r0 = r3.f25540i
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.util.HashSet r0 = (java.util.HashSet) r0
            r4.addAll(r0)
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dn3.C7396c.onCreate(android.os.Bundle):void");
    }
}
