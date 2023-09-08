package com.tencent.luggage.sdk.processes;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.luggage.sdk.processes.C80250c;
import com.tencent.luggage.sdk.processes.C80278n;
import com.tencent.luggage.sdk.processes.main.RuntimeInfo;
import com.tencent.p014mm.plugin.appbrand.utils.C2039g2;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k20.C9556a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C64175a0;
import zt3.C119157j;

/* renamed from: com.tencent.luggage.sdk.processes.f */
public abstract class C80254f<PROCESS extends C80250c<PARAMS>, PARAMS extends C80278n> {

    /* renamed from: e */
    public static C80254f<C80250c<C80278n>, C80278n> f234946e;

    /* renamed from: d */
    public final C13601g f234947d = C36568h.m40985a(new C80255a(this));

    /* renamed from: com.tencent.luggage.sdk.processes.f$a */
    public static final class C80255a extends C87413o implements C32224a<CopyOnWriteArrayList<PROCESS>> {

        /* renamed from: d */
        public final /* synthetic */ C80254f<PROCESS, PARAMS> f234948d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C80255a(C80254f<PROCESS, PARAMS> fVar) {
            super(0);
            this.f234948d = fVar;
        }

        public Object invoke() {
            return new CopyOnWriteArrayList(this.f234948d.mo111400o());
        }
    }

    /* renamed from: com.tencent.luggage.sdk.processes.f$b */
    public static final class C80256b extends C87413o implements C32226l<C80264l, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ArrayList<C80264l> f234949d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C80256b(ArrayList<C80264l> arrayList) {
            super(1);
            this.f234949d = arrayList;
        }

        public Object invoke(Object obj) {
            C80264l lVar = (C80264l) obj;
            C87412m.m108594g(lVar, LocaleUtil.ITALIAN);
            this.f234949d.add(lVar);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.luggage.sdk.processes.f$c */
    public static final class C80257c extends C87413o implements C32226l<C80264l, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f234950d;

        /* renamed from: e */
        public final /* synthetic */ C80254f<PROCESS, PARAMS> f234951e;

        /* renamed from: f */
        public final /* synthetic */ String f234952f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C80257c(boolean z, C80254f<PROCESS, PARAMS> fVar, String str) {
            super(1);
            this.f234950d = z;
            this.f234951e = fVar;
            this.f234952f = str;
        }

        public Object invoke(Object obj) {
            PROCESS process;
            C80264l lVar = (C80264l) obj;
            C87412m.m108594g(lVar, "record");
            if (this.f234950d) {
                this.f234951e.mo111382D(lVar);
            } else {
                this.f234951e.mo111381C(lVar);
            }
            if (lVar.f234968d) {
                C80254f<PROCESS, PARAMS> fVar = this.f234951e;
                String str = this.f234952f;
                fVar.getClass();
                C87412m.m108594g(str, "appId");
                fVar.mo111393h(str, -1, C80263k.f234964d);
            } else {
                C80254f<PROCESS, PARAMS> fVar2 = this.f234951e;
                fVar2.getClass();
                try {
                    process = fVar2.mo111389d(lVar);
                } catch (C80280p unused) {
                    process = null;
                }
                if (process != null) {
                    process.mo111358c(lVar);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.luggage.sdk.processes.f$d */
    public static final class C80258d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f234953d;

        /* renamed from: e */
        public final /* synthetic */ Intent f234954e;

        /* renamed from: f */
        public final /* synthetic */ C80279o f234955f;

        /* renamed from: g */
        public final /* synthetic */ C80264l f234956g;

        public C80258d(Context context, Intent intent, C80279o oVar, C80264l lVar) {
            this.f234953d = context;
            this.f234954e = intent;
            this.f234955f = oVar;
            this.f234956g = lVar;
        }

        public final void run() {
            Context context = this.f234953d;
            Intent intent = this.f234954e;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/luggage/sdk/processes/LuggageMiniProgramProcessManager$onStartWxaApp$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/luggage/sdk/processes/LuggageMiniProgramProcessManager$onStartWxaApp$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            Log.m105924i("Luggage.LuggageMiniProgramProcessManager", "onStartWxaApp--END-- strategy:" + this.f234955f + ", app:" + this.f234956g);
        }
    }

    /* renamed from: H */
    public static /* synthetic */ boolean m97661H(C80254f fVar, String str, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = -1;
            }
            return fVar.mo111385G(str, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: taskAlive");
    }

    /* renamed from: v */
    public static /* synthetic */ void m97662v(C80254f fVar, String str, int i, boolean z, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = -1;
            }
            if ((i2 & 4) != 0) {
                z = false;
            }
            fVar.mo111408u(str, i, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: killByAppId");
    }

    /* renamed from: A */
    public final void mo111379A(Runnable runnable) {
        C87412m.m108594g(runnable, "runnable");
        if (C2039g2.m1987a()) {
            runnable.run();
        } else {
            ((C119157j) C119157j.f356862d).mo183895z(runnable);
        }
    }

    /* renamed from: B */
    public abstract void mo111380B(C80264l lVar);

    /* renamed from: C */
    public abstract void mo111381C(C80264l lVar);

    /* renamed from: D */
    public abstract void mo111382D(C80264l lVar);

    /* renamed from: E */
    public final C80279o mo111383E(Context context, PARAMS params) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(params, "params");
        String str = params.f234998a;
        boolean q = mo111404q(params);
        C13604l p = mo111401p(params, q);
        C80279o oVar = (C80279o) p.f38555d;
        C80250c cVar = (C80250c) p.f38556e;
        C80264l a = cVar.mo111356a(params.f234998a, params.f235000c, "", q);
        Class<? extends Activity> g = q ? cVar.mo111362g() : cVar.mo111364i();
        Intent intent = new Intent(context, g);
        int i = 268435456;
        if (AndroidContextUtil.castActivityOrNull(context) != null && q) {
            i = 0;
        }
        intent.addFlags(i);
        int q2 = mo111403q(cVar);
        intent.putExtra("key_index", q2);
        Log.m105925i("Luggage.LuggageMiniProgramProcessManager", "startApp: appId:[%s] strategy:[%s] index:[%d] process:[%s],isPersistent:[%b],versionType:[%d],uiClass:[%s]", str, oVar.name(), Integer.valueOf(q2), cVar.mo111363h(), Boolean.valueOf(q), Integer.valueOf(params.f235000c), g.getName());
        mo111411y(context, intent, params, oVar, a);
        C87412m.m108594g(str, "appId");
        mo111393h(str, -1, C80263k.f234964d);
        return oVar;
    }

    /* renamed from: F */
    public final boolean mo111384F(String str) {
        C87412m.m108594g(str, "appId");
        return m97661H(this, str, 0, 2, (Object) null);
    }

    /* renamed from: G */
    public final boolean mo111385G(String str, int i) {
        C87412m.m108594g(str, "appId");
        C80264l g = mo111392g(str, i);
        if (g == null) {
            return false;
        }
        return mo111389d(g).mo111367l();
    }

    /* renamed from: a */
    public final List<C80264l> mo111386a() {
        List<C80250c> j = mo111395j();
        ArrayList arrayList = new ArrayList();
        for (C80250c f : j) {
            C64175a0.m75508p(arrayList, f.mo111361f());
        }
        return arrayList;
    }

    /* renamed from: b */
    public final C80264l mo111387b(String str, int i) {
        C87412m.m108594g(str, "appId");
        C80264l g = mo111392g(str, i);
        if (g == null) {
            return null;
        }
        if (mo111389d(g).mo111367l()) {
            return g;
        }
        return null;
    }

    /* renamed from: c */
    public final PROCESS mo111388c(int i) {
        return (C80250c) mo111395j().get(i);
    }

    /* renamed from: d */
    public final PROCESS mo111389d(C80264l lVar) {
        PROCESS process;
        C87412m.m108594g(lVar, "record");
        Iterator it = mo111395j().iterator();
        while (true) {
            if (!it.hasNext()) {
                process = null;
                break;
            }
            process = it.next();
            if (((ArrayList) ((C80250c) process).mo111361f()).contains(lVar)) {
                break;
            }
        }
        PROCESS process2 = (C80250c) process;
        if (process2 != null) {
            return process2;
        }
        throw new C80280p();
    }

    /* renamed from: e */
    public final PROCESS mo111390e(String str) {
        PROCESS process;
        C87412m.m108594g(str, "appId");
        Iterator it = mo111395j().iterator();
        while (true) {
            if (!it.hasNext()) {
                process = null;
                break;
            }
            process = it.next();
            if (((ArrayList) ((C80250c) process).mo111360e()).contains(str)) {
                break;
            }
        }
        return (C80250c) process;
    }

    /* renamed from: f */
    public final List<PROCESS> mo111391f(C32226l<? super PROCESS, Boolean> lVar) {
        C87412m.m108594g(lVar, "predicate");
        List j = mo111395j();
        ArrayList arrayList = new ArrayList();
        for (Object next : j) {
            if (lVar.invoke((C80250c) next).booleanValue()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public final C80264l mo111392g(String str, int i) {
        Object obj;
        boolean z = i < 0;
        List j = mo111395j();
        ArrayList arrayList = new ArrayList();
        Iterator it = j.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            C80264l d = ((C80250c) it.next()).mo111359d(str);
            if (d != null && (z || d.f234966b == i)) {
                obj = d;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        Iterator it4 = arrayList.iterator();
        if (it4.hasNext()) {
            obj = it4.next();
            if (it4.hasNext()) {
                char c = ((C80264l) obj).f234968d;
                do {
                    Object next = it4.next();
                    char c2 = ((C80264l) next).f234968d;
                    if (c > c2) {
                        obj = next;
                        c = c2;
                    }
                } while (it4.hasNext());
            }
        }
        return (C80264l) obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.tencent.luggage.sdk.processes.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.tencent.luggage.sdk.processes.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.tencent.luggage.sdk.processes.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: com.tencent.luggage.sdk.processes.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo111393h(java.lang.String r9, int r10, fy3.C32226l<? super com.tencent.luggage.sdk.processes.C80264l, rx3.C13598b0> r11) {
        /*
            r8 = this;
            java.lang.String r0 = "appId"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "command"
            gy3.C87412m.m108594g(r11, r0)
            java.util.List r0 = r8.mo111395j()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0017:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            com.tencent.luggage.sdk.processes.c r2 = (com.tencent.luggage.sdk.processes.C80250c) r2
            com.tencent.luggage.sdk.processes.l r2 = r2.mo111359d(r9)
            if (r2 == 0) goto L_0x0017
            r1.add(r2)
            goto L_0x0017
        L_0x002d:
            boolean r0 = r1.isEmpty()
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0047
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r2] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r0[r4] = r9
            java.lang.String r9 = "Luggage.LuggageMiniProgramProcessManager"
            java.lang.String r5 = "findRecords: ([%s][%s]) not found"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r9, r5, r0)
        L_0x0047:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r0 = r1.iterator()
        L_0x0050:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0065
            java.lang.Object r5 = r0.next()
            r6 = r5
            com.tencent.luggage.sdk.processes.l r6 = (com.tencent.luggage.sdk.processes.C80264l) r6
            boolean r6 = r6.f234968d
            if (r6 == 0) goto L_0x0050
            r9.add(r5)
            goto L_0x0050
        L_0x0065:
            int r9 = r9.size()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r1.iterator()
        L_0x0072:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0088
            java.lang.Object r6 = r5.next()
            r7 = r6
            com.tencent.luggage.sdk.processes.l r7 = (com.tencent.luggage.sdk.processes.C80264l) r7
            boolean r7 = r7.f234968d
            r7 = r7 ^ r4
            if (r7 == 0) goto L_0x0072
            r0.add(r6)
            goto L_0x0072
        L_0x0088:
            int r0 = r0.size()
            int r5 = r1.size()
            if (r5 > r3) goto L_0x0096
            if (r9 > r4) goto L_0x0096
            if (r0 <= r4) goto L_0x009e
        L_0x0096:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r5 != 0) goto L_0x00ec
            boolean r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r5 != 0) goto L_0x00ec
        L_0x009e:
            java.util.Iterator r9 = r1.iterator()
        L_0x00a2:
            boolean r0 = r9.hasNext()
            r2 = 0
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r0 = r9.next()
            r3 = r0
            com.tencent.luggage.sdk.processes.l r3 = (com.tencent.luggage.sdk.processes.C80264l) r3
            boolean r3 = r3.f234968d
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x00a2
            goto L_0x00b7
        L_0x00b6:
            r0 = r2
        L_0x00b7:
            com.tencent.luggage.sdk.processes.l r0 = (com.tencent.luggage.sdk.processes.C80264l) r0
            if (r0 == 0) goto L_0x00c5
            if (r10 < 0) goto L_0x00c1
            int r9 = r0.f234966b
            if (r9 != r10) goto L_0x00c6
        L_0x00c1:
            r11.invoke(r0)
            goto L_0x00c6
        L_0x00c5:
            r0 = r2
        L_0x00c6:
            if (r0 != 0) goto L_0x00eb
            java.util.Iterator r9 = r1.iterator()
        L_0x00cc:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00de
            java.lang.Object r0 = r9.next()
            r1 = r0
            com.tencent.luggage.sdk.processes.l r1 = (com.tencent.luggage.sdk.processes.C80264l) r1
            boolean r1 = r1.f234968d
            if (r1 == 0) goto L_0x00cc
            r2 = r0
        L_0x00de:
            com.tencent.luggage.sdk.processes.l r2 = (com.tencent.luggage.sdk.processes.C80264l) r2
            if (r2 == 0) goto L_0x00eb
            if (r10 < 0) goto L_0x00e8
            int r9 = r2.f234966b
            if (r9 != r10) goto L_0x00eb
        L_0x00e8:
            r11.invoke(r2)
        L_0x00eb:
            return
        L_0x00ec:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r11 = 3
            java.lang.Object[] r5 = new java.lang.Object[r11]
            int r1 = r1.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5[r2] = r1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r5[r4] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r5[r3] = r9
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r5, r11)
            java.lang.String r11 = "records size[%d] persistent size[%d] !persistent size[%d]"
            java.lang.String r9 = java.lang.String.format(r11, r9)
            java.lang.String r11 = "format(format, *args)"
            gy3.C87412m.m108593f(r9, r11)
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.luggage.sdk.processes.C80254f.mo111393h(java.lang.String, int, fy3.l):void");
    }

    /* renamed from: i */
    public final C80264l[] mo111394i(String str, int i) {
        C87412m.m108594g(str, "appId");
        ArrayList arrayList = new ArrayList();
        mo111393h(str, i, new C80256b(arrayList));
        Object[] array = arrayList.toArray(new C80264l[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (C80264l[]) array;
    }

    /* renamed from: j */
    public final List<PROCESS> mo111395j() {
        return (List) ((C36570n) this.f234947d).getValue();
    }

    /* renamed from: k */
    public final PROCESS mo111396k(List<? extends PROCESS> list, LuggageServiceType luggageServiceType) {
        PROCESS process;
        Class<? extends Activity> i;
        PROCESS process2;
        PROCESS process3;
        Class<? extends Activity> i2;
        LuggageServiceType luggageServiceType2 = LuggageServiceType.NIL;
        C87412m.m108594g(list, "availableProcess");
        C87412m.m108594g(luggageServiceType, "serviceType");
        if (luggageServiceType != luggageServiceType2) {
            ArrayList arrayList = new ArrayList();
            for (T next : list) {
                C80250c cVar = (C80250c) next;
                if (luggageServiceType == cVar.f234942c && cVar.mo111366k()) {
                    arrayList.add(next);
                }
            }
            String str = null;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        process3 = null;
                        break;
                    }
                    process3 = it.next();
                    if (((C80250c) process3).mo111367l()) {
                        break;
                    }
                }
                process = (C80250c) process3;
                if (process == null) {
                    process = (C80250c) C110818d0.m150914L(arrayList);
                }
                Object[] objArr = new Object[2];
                objArr[0] = (process == null || (i2 = process.mo111364i()) == null) ? null : i2.getSimpleName();
                objArr[1] = luggageServiceType;
                Log.m105925i("Luggage.LuggageMiniProgramProcessManager", "getAvailableTaskToPreload found empty task[%s], which can be used as [%s]", objArr);
            } else {
                process = null;
            }
            if (process == null) {
                ArrayList arrayList2 = new ArrayList();
                for (T next2 : list) {
                    C80250c cVar2 = (C80250c) next2;
                    if (cVar2.f234942c == luggageServiceType2 && cVar2.mo111374t(luggageServiceType)) {
                        arrayList2.add(next2);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    Iterator it4 = arrayList2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            process2 = null;
                            break;
                        }
                        process2 = it4.next();
                        if (((C80250c) process2).mo111367l()) {
                            break;
                        }
                    }
                    PROCESS process4 = (C80250c) process2;
                    process = process4 == null ? (C80250c) C110818d0.m150914L(arrayList2) : process4;
                }
                Object[] objArr2 = new Object[2];
                objArr2[0] = luggageServiceType;
                if (!(process == null || (i = process.mo111364i()) == null)) {
                    str = i.getSimpleName();
                }
                if (str == null) {
                    str = "null";
                }
                objArr2[1] = str;
                Log.m105925i("Luggage.LuggageMiniProgramProcessManager", "tryPreloadNextTaskProcess serviceType = [%s] not reached max limit , got ui task = [%s]", objArr2);
            }
            return process;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: l */
    public PROCESS mo111397l(String str, PARAMS params, LuggageServiceType luggageServiceType) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(params, "params");
        C87412m.m108594g(luggageServiceType, "type");
        return mo111398m(mo111395j(), str, params, luggageServiceType);
    }

    /* renamed from: m */
    public final PROCESS mo111398m(List<? extends PROCESS> list, String str, PARAMS params, LuggageServiceType luggageServiceType) {
        PROCESS process;
        PROCESS process2;
        PROCESS process3;
        boolean z;
        LuggageServiceType luggageServiceType2;
        boolean z2;
        LuggageServiceType luggageServiceType3;
        LuggageServiceType luggageServiceType4 = LuggageServiceType.NIL;
        C87412m.m108594g(list, "availableProcess");
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(params, "params");
        C87412m.m108594g(luggageServiceType, "type");
        PROCESS e = mo111390e(str);
        if (e != null) {
            return e;
        }
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            C80250c cVar = (C80250c) next;
            boolean t = cVar.mo111374t(luggageServiceType);
            if (t) {
                cVar.mo111365j();
            }
            if (t) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            process = null;
            if (!it.hasNext()) {
                process2 = null;
                break;
            }
            process2 = it.next();
            C80250c cVar2 = (C80250c) process2;
            if (!cVar2.mo111366k() || !cVar2.mo111367l() || !((luggageServiceType3 = cVar2.f234942c) == luggageServiceType4 || luggageServiceType3 == luggageServiceType)) {
                z2 = false;
                continue;
            } else {
                z2 = true;
                continue;
            }
            if (z2) {
                break;
            }
        }
        PROCESS process4 = (C80250c) process2;
        if (process4 == null) {
            Iterator it4 = arrayList.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    process3 = null;
                    break;
                }
                process3 = it4.next();
                C80250c cVar3 = (C80250c) process3;
                if (!cVar3.mo111366k() || !((luggageServiceType2 = cVar3.f234942c) == luggageServiceType4 || luggageServiceType2 == luggageServiceType)) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            process4 = (C80250c) process3;
        }
        if (process4 != null) {
            return process4;
        }
        Iterator it5 = arrayList.iterator();
        if (it5.hasNext()) {
            process = it5.next();
            if (it5.hasNext()) {
                Collection<C80264l> f = ((C80250c) process).mo111361f();
                ArrayList arrayList2 = new ArrayList(C36907w.m41090l(f, 10));
                for (C80264l lVar : f) {
                    arrayList2.add(Long.valueOf(lVar.f234970f));
                }
                Long l = (Long) C110818d0.m150929a0(arrayList2);
                long longValue = l != null ? l.longValue() : 0;
                do {
                    PROCESS next2 = it5.next();
                    Collection<C80264l> f2 = ((C80250c) next2).mo111361f();
                    ArrayList arrayList3 = new ArrayList(C36907w.m41090l(f2, 10));
                    for (C80264l lVar2 : f2) {
                        arrayList3.add(Long.valueOf(lVar2.f234970f));
                    }
                    Long l2 = (Long) C110818d0.m150929a0(arrayList3);
                    long longValue2 = l2 != null ? l2.longValue() : 0;
                    if (longValue > longValue2) {
                        process = next2;
                        longValue = longValue2;
                    }
                } while (it5.hasNext());
            }
        }
        C87412m.m108591d(process);
        return (C80250c) process;
    }

    /* renamed from: n */
    public PROCESS mo111399n(String str, PARAMS params) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(params, "params");
        return mo111397l(str, params, params.f234999b ? LuggageServiceType.WAGAME : LuggageServiceType.WASERVICE);
    }

    /* renamed from: o */
    public abstract PROCESS[] mo111400o();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: rx3.l<com.tencent.luggage.sdk.processes.o, PROCESS>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public rx3.C13604l<com.tencent.luggage.sdk.processes.C80279o, PROCESS> mo111401p(PARAMS r11, boolean r12) {
        /*
            r10 = this;
            java.lang.String r0 = "params"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = r11.f234998a
            int r1 = r11.f235000c
            boolean r2 = r11.f234999b
            if (r2 == 0) goto L_0x0011
            com.tencent.luggage.sdk.processes.LuggageServiceType r2 = com.tencent.luggage.sdk.processes.LuggageServiceType.WAGAME
            goto L_0x0013
        L_0x0011:
            com.tencent.luggage.sdk.processes.LuggageServiceType r2 = com.tencent.luggage.sdk.processes.LuggageServiceType.WASERVICE
        L_0x0013:
            com.tencent.luggage.sdk.processes.l[] r1 = r10.mo111394i(r0, r1)
            com.tencent.luggage.sdk.processes.i r3 = new com.tencent.luggage.sdk.processes.i
            r3.<init>()
            java.util.List r1 = sx3.C110823p.m150995U(r1, r3)
            com.tencent.luggage.sdk.processes.j r3 = new com.tencent.luggage.sdk.processes.j
            r3.<init>(r10, r0, r11, r2)
            rx3.g r3 = rx3.C36568h.m40985a(r3)
            boolean r4 = r1.isEmpty()
            r5 = 1
            r4 = r4 ^ r5
            r6 = 0
            if (r12 == 0) goto L_0x0036
            if (r4 != 0) goto L_0x0036
            r7 = 1
            goto L_0x0037
        L_0x0036:
            r7 = 0
        L_0x0037:
            if (r5 != r7) goto L_0x0046
            rx3.l r12 = new rx3.l
            com.tencent.luggage.sdk.processes.o r1 = com.tencent.luggage.sdk.processes.C80279o.CREATE_NEW
            com.tencent.luggage.sdk.processes.c r11 = r10.mo111399n(r0, r11)
            r12.<init>(r1, r11)
            goto L_0x00e1
        L_0x0046:
            if (r12 == 0) goto L_0x004c
            if (r4 == 0) goto L_0x004c
            r7 = 1
            goto L_0x004d
        L_0x004c:
            r7 = 0
        L_0x004d:
            java.lang.String r8 = "getStartStrategyAndTask("
            java.lang.String r9 = "Luggage.LuggageMiniProgramProcessManager"
            if (r5 != r7) goto L_0x00a1
            java.util.Iterator r12 = r1.iterator()
        L_0x0057:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L_0x0069
            java.lang.Object r3 = r12.next()
            r4 = r3
            com.tencent.luggage.sdk.processes.l r4 = (com.tencent.luggage.sdk.processes.C80264l) r4
            boolean r4 = r4.f234968d
            if (r4 == 0) goto L_0x0057
            goto L_0x006a
        L_0x0069:
            r3 = 0
        L_0x006a:
            com.tencent.luggage.sdk.processes.l r3 = (com.tencent.luggage.sdk.processes.C80264l) r3
            if (r3 != 0) goto L_0x009c
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r8)
            r12.append(r0)
            java.lang.String r0 = "): stash task lost (localRecords.size:"
            r12.append(r0)
            int r0 = r1.size()
            r12.append(r0)
            java.lang.String r0 = ") fallback"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r12)
            java.lang.Object r12 = sx3.C110818d0.m150914L(r1)
            com.tencent.luggage.sdk.processes.l r12 = (com.tencent.luggage.sdk.processes.C80264l) r12
            rx3.l r12 = r10.mo111412z(r12, r11)
            goto L_0x00e1
        L_0x009c:
            rx3.l r12 = r10.mo111412z(r3, r11)
            goto L_0x00e1
        L_0x00a1:
            if (r12 != 0) goto L_0x00a7
            if (r4 != 0) goto L_0x00a7
            r11 = 1
            goto L_0x00a8
        L_0x00a7:
            r11 = 0
        L_0x00a8:
            if (r5 != r11) goto L_0x00b4
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r11 = r3.getValue()
            r12 = r11
            rx3.l r12 = (rx3.C13604l) r12
            goto L_0x00e1
        L_0x00b4:
            if (r12 != 0) goto L_0x00b9
            if (r4 == 0) goto L_0x00b9
            r6 = 1
        L_0x00b9:
            if (r5 != r6) goto L_0x00eb
            rx3.l r11 = r10.mo111402p(r1)     // Catch:{ p -> 0x00c1 }
        L_0x00bf:
            r12 = r11
            goto L_0x00e1
        L_0x00c1:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r8)
            r11.append(r0)
            java.lang.String r12 = "): commit failed. fallback to create new strategy"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r11)
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r11 = r3.getValue()
            rx3.l r11 = (rx3.C13604l) r11
            goto L_0x00bf
        L_0x00e1:
            B r11 = r12.f38556e
            com.tencent.luggage.sdk.processes.c r11 = (com.tencent.luggage.sdk.processes.C80250c) r11
            r11.getClass()
            r11.f234942c = r2
            return r12
        L_0x00eb:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "never!"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.luggage.sdk.processes.C80254f.mo111401p(com.tencent.luggage.sdk.processes.n, boolean):rx3.l");
    }

    /* renamed from: q */
    public final int mo111403q(PROCESS process) {
        C87412m.m108594g(process, "process");
        return mo111395j().indexOf(process);
    }

    /* renamed from: q */
    public abstract boolean mo111404q(PARAMS params);

    /* renamed from: r */
    public final void mo111405r(C80249b bVar) {
        C87412m.m108594g(bVar, "killType");
        if (bVar == C80249b.KILL_TYPE_SILENT_IF_INACTIVE) {
            mo111409w();
            return;
        }
        for (C80250c m : mo111395j()) {
            m.mo111368m(bVar);
        }
    }

    /* renamed from: s */
    public final void mo111406s() {
        C80250c cVar;
        for (C80250c f : mo111395j()) {
            Iterator it = ((ArrayList) f.mo111361f()).iterator();
            while (it.hasNext()) {
                C80264l lVar = (C80264l) it.next();
                mo111381C(lVar);
                C87412m.m108594g(lVar, "record");
                try {
                    cVar = mo111389d(lVar);
                } catch (C80280p unused) {
                    cVar = null;
                }
                if (cVar != null) {
                    cVar.mo111358c(lVar);
                }
            }
        }
    }

    /* renamed from: t */
    public final void mo111407t(String str, int i) {
        C87412m.m108594g(str, "appId");
        m97662v(this, str, i, false, 4, (Object) null);
    }

    /* renamed from: u */
    public final void mo111408u(String str, int i, boolean z) {
        C87412m.m108594g(str, "appId");
        mo111393h(str, i, new C80257c(z, this, str));
    }

    /* renamed from: w */
    public void mo111409w() {
        Object obj;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (C80250c cVar : mo111395j()) {
            String h = cVar.mo111363h();
            if (h != null) {
                if (cVar.mo111366k()) {
                    concurrentHashMap.putIfAbsent(h, Boolean.TRUE);
                } else {
                    Boolean bool = Boolean.FALSE;
                    C87412m.m108593f(bool, "FALSE");
                    concurrentHashMap.put(h, bool);
                }
            }
        }
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            String str = (String) entry.getKey();
            if (((Boolean) entry.getValue()).booleanValue()) {
                Log.m105925i("Luggage.LuggageMiniProgramProcessManager", "killAll SILENT_IF_INACTIVE kill process(%s)", str);
                Iterator it = mo111395j().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C87412m.m108589b(((C80250c) obj).mo111363h(), str)) {
                        break;
                    }
                }
                C80250c cVar2 = (C80250c) obj;
                if (cVar2 != null) {
                    cVar2.mo111369n();
                }
            }
        }
        Log.m105924i("Luggage.LuggageMiniProgramProcessManager", "killAll SILENT_IF_INACTIVE");
    }

    /* renamed from: x */
    public abstract void mo111410x(RuntimeInfo runtimeInfo);

    /* renamed from: y */
    public void mo111411y(Context context, Intent intent, PARAMS params, C80279o oVar, C80264l lVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(params, "params");
        C87412m.m108594g(oVar, "strategy");
        C87412m.m108594g(lVar, "appRecord");
        Log.m105924i("Luggage.LuggageMiniProgramProcessManager", "onStartWxaApp--START-- strategy:" + oVar + ", app:" + lVar);
        mo111379A(new C80258d(context, intent, oVar, lVar));
    }

    /* renamed from: z */
    public C13604l<C80279o, PROCESS> mo111412z(C80264l lVar, PARAMS params) {
        C87412m.m108594g(lVar, "record");
        C87412m.m108594g(params, "params");
        C80250c d = mo111389d(lVar);
        C80279o oVar = C80279o.RESUME_EXISTED;
        lVar.f234968d = true;
        return new C13604l<>(oVar, d);
    }

    /* renamed from: p */
    public final C13604l<C80279o, PROCESS> mo111402p(List<? extends C80264l> list) {
        T t;
        T t2;
        C80279o oVar = C80279o.RESUME_EXISTED;
        Iterator<T> it = list.iterator();
        while (true) {
            t = null;
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            if (((C80264l) t2).f234968d) {
                break;
            }
        }
        C80264l lVar = (C80264l) t2;
        if (lVar == null) {
            return new C13604l<>(oVar, mo111389d((C80264l) C110818d0.m150914L(list)));
        }
        Iterator<T> it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            T next = it4.next();
            if (((C80264l) next).f234968d) {
                t = next;
                break;
            }
        }
        C87412m.m108591d(t);
        C80250c d = mo111389d((C80264l) t);
        lVar.f234968d = false;
        return new C13604l<>(oVar, d);
    }
}
