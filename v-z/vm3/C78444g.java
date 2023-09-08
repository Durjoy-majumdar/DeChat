package vm3;

import a14.C0000n0;
import a14.C53934p0;
import android.os.Bundle;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d14.C58085t0;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kv1.C61173o;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C99664b;
import lv1.C99672i;
import lv1.C99681n;
import om3.C77020b;
import p278yh.C79115l;
import qm3.C77374a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;
import tm3.C78064o;
import tm3.C78069w;
import wx3.C15601d;
import xx3.C15911a;
import yb2.C15946a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: vm3.g */
public final class C78444g extends C15946a {

    /* renamed from: d */
    public final C13601g f229821d = C36568h.m40985a(C78447b.f229829d);

    /* renamed from: e */
    public ArrayList<C99664b> f229822e = new ArrayList<>();

    /* renamed from: f */
    public final C13601g f229823f = C36568h.m40985a(new C78449d(this));

    /* renamed from: vm3.g$a */
    public final class C78445a implements C61173o {

        /* renamed from: d */
        public final C58085t0<C10656l> f229824d;

        /* renamed from: e */
        public final /* synthetic */ C78444g f229825e;

        @C91590f(mo125468c = "com.tencent.mm.ui.mvvm.uic.addressbook.SelectContactAddressBookSearchUIC$FTSResultListener$onFTSSearchEnd$2$1", mo125469f = "SelectContactAddressBookSearchUIC.kt", mo125470l = {240}, mo125471m = "invokeSuspend")
        /* renamed from: vm3.g$a$a */
        public static final class C78446a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f229826d;

            /* renamed from: e */
            public final /* synthetic */ C78445a f229827e;

            /* renamed from: f */
            public final /* synthetic */ C10656l f229828f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C78446a(C78445a aVar, C10656l lVar, C15601d<? super C78446a> dVar) {
                super(2, dVar);
                this.f229827e = aVar;
                this.f229828f = lVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C78446a(this.f229827e, this.f229828f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C78446a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f229826d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C58085t0<C10656l> t0Var = this.f229827e.f229824d;
                    C10656l lVar = this.f229828f;
                    this.f229826d = 1;
                    if (t0Var.emit(lVar, this) == aVar) {
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

        public C78445a(C78444g gVar, C78064o oVar, C58085t0<C10656l> t0Var, int i, boolean z) {
            C87412m.m108594g(oVar, "request");
            C87412m.m108594g(t0Var, "searchFlow");
            this.f229825e = gVar;
            this.f229824d = t0Var;
        }

        /* renamed from: H0 */
        public void mo293H0(C10656l lVar) {
            LifecycleScope c3;
            if (lVar != null) {
                C78444g gVar = this.f229825e;
                Log.m105924i("MicroMsg.SelectContactAddressBookSearchUIC", "onFTSSearchEnd " + lVar.f32073b.hashCode());
                boolean z = false;
                Iterator<T> it = gVar.f229822e.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C87412m.m108589b((C99664b) it.next(), lVar.f32073b)) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if ((z ? lVar : null) != null) {
                    C78444g gVar2 = this.f229825e;
                    if (lVar.f32074c == 0 && (c3 = gVar2.mo14597c3()) != null) {
                        LifecycleScope.launchDefault$default(c3, (C53934p0) null, new C78446a(this, lVar, (C15601d<? super C78446a>) null), 1, (Object) null);
                    }
                }
            }
        }
    }

    /* renamed from: vm3.g$b */
    public static final class C78447b extends C87413o implements C32224a<MMHandler> {

        /* renamed from: d */
        public static final C78447b f229829d = new C78447b();

        public C78447b() {
            super(0);
        }

        public Object invoke() {
            return new MMHandler(Looper.getMainLooper());
        }
    }

    /* renamed from: vm3.g$c */
    public static final class C78448c extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C78444g f229830d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78448c(C78444g gVar) {
            super(1);
            this.f229830d = gVar;
        }

        /* JADX WARNING: type inference failed for: r8v33, types: [java.lang.Throwable] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r36) {
            /*
                r35 = this;
                r0 = r35
                r1 = r36
                tm3.w r1 = (tm3.C78069w) r1
                java.lang.String r2 = "state"
                gy3.C87412m.m108594g(r1, r2)
                java.lang.Class<tm3.n> r2 = tm3.C64958n.class
                com.tencent.mm.sdk.statecenter.IStateAction r2 = r1.checkAction(r2)
                tm3.n r2 = (tm3.C64958n) r2
                r4 = 1
                r5 = 0
                r6 = 0
                r7 = 2
                if (r2 == 0) goto L_0x0227
                vm3.g r15 = r0.f229830d
                java.lang.String r8 = r2.f187041b
                boolean r8 = z04.C112551y.m153811k(r8)
                r8 = r8 ^ r4
                if (r8 == 0) goto L_0x0206
                com.tencent.mm.sdk.statecenter.IStateActionResult r2 = r2.getResult()
                if (r2 == 0) goto L_0x01ec
                boolean r8 = r2 instanceof tm3.C78064o
                if (r8 == 0) goto L_0x01ec
                tm3.o r2 = (tm3.C78064o) r2
                r15.getClass()
                java.lang.Class<kv1.q> r17 = kv1.C99260q.class
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r14 = "startSearch "
                r8.append(r14)
                java.lang.String r9 = r2.f228810b
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                java.lang.String r13 = "MicroMsg.SelectContactAddressBookSearchUIC"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r8)
                java.util.ArrayList<lv1.b> r8 = r15.f229822e
                java.util.Iterator r8 = r8.iterator()
            L_0x0055:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto L_0x006b
                java.lang.Object r9 = r8.next()
                lv1.b r9 = (lv1.C99664b) r9
                di3.d r10 = di3.C86312j.m106911c(r17)
                kv1.q r10 = (kv1.C99260q) r10
                r10.mo128757ki(r9)
                goto L_0x0055
            L_0x006b:
                java.util.ArrayList<lv1.b> r8 = r15.f229822e
                r8.clear()
                java.util.HashMap r18 = new java.util.HashMap
                r18.<init>()
                boolean r8 = r2.f228812d
                r12 = 16
                r11 = 7
                if (r8 == 0) goto L_0x0168
                d14.t0 r19 = d14.C58017a1.m67173b(r6, r6, r5, r11, r5)
                java.util.ArrayList r20 = new java.util.ArrayList
                r20.<init>()
                java.util.List<java.lang.String> r8 = r2.f228811c
                java.util.Iterator r21 = r8.iterator()
                r14 = 0
            L_0x008c:
                boolean r8 = r21.hasNext()
                if (r8 == 0) goto L_0x0148
                java.lang.Object r8 = r21.next()
                int r22 = r14 + 1
                if (r14 < 0) goto L_0x0143
                java.lang.String r8 = (java.lang.String) r8
                boolean r9 = z04.C112551y.m153811k(r8)
                r9 = r9 ^ r4
                if (r9 == 0) goto L_0x0133
                d14.t0 r16 = d14.C58017a1.m67173b(r6, r6, r5, r11, r5)
                lv1.k r10 = new lv1.k
                r10.<init>()
                r10.f224468c = r8
                r10.f224467b = r12
                nv1.b r8 = nv1.C100219b.f293645d
                r10.f224477l = r8
                rx3.g r8 = r15.f229821d
                rx3.n r8 = (rx3.C36570n) r8
                java.lang.Object r8 = r8.getValue()
                com.tencent.mm.sdk.platformtools.MMHandler r8 = (com.tencent.p014mm.sdk.platformtools.MMHandler) r8
                r10.f224479n = r8
                int[] r8 = new int[r4]
                r9 = 131072(0x20000, float:1.83671E-40)
                r8[r6] = r9
                r10.f224472g = r8
                vm3.g$a r9 = new vm3.g$a
                r23 = 1
                r8 = r9
                r3 = r9
                r9 = r15
                r6 = r10
                r10 = r2
                r11 = r16
                r12 = r14
                r5 = r13
                r13 = r23
                r8.<init>(r9, r10, r11, r12, r13)
                r6.f224478m = r3
                r6.f224481p = r4
                java.util.HashSet<java.lang.String> r3 = r6.f224475j
                java.util.HashSet<java.lang.String> r8 = r1.f228827o
                r3.addAll(r8)
                di3.d r3 = di3.C86312j.m106911c(r17)
                kv1.q r3 = (kv1.C99260q) r3
                lv1.b r3 = r3.Xn0(r7, r6)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r8 = "startSearch multi "
                r6.append(r8)
                int r8 = r3.hashCode()
                r6.append(r8)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
                java.util.ArrayList<lv1.b> r6 = r15.f229822e
                r6.add(r3)
                com.tencent.mm.sdk.coroutines.LifecycleScope r3 = r15.mo14597c3()
                if (r3 == 0) goto L_0x012f
                vm3.h r6 = new vm3.h
                r23 = 0
                r8 = r6
                r9 = r16
                r10 = r18
                r11 = r14
                r12 = r15
                r13 = r2
                r14 = r20
                r24 = r15
                r15 = r19
                r16 = r23
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
                r8 = 0
                com.tencent.p014mm.sdk.coroutines.LifecycleScope.launchDefault$default(r3, r8, r6, r4, r8)
                goto L_0x0137
            L_0x012f:
                r24 = r15
                r8 = 0
                goto L_0x0137
            L_0x0133:
                r8 = r5
                r5 = r13
                r24 = r15
            L_0x0137:
                r13 = r5
                r5 = r8
                r14 = r22
                r15 = r24
                r6 = 0
                r11 = 7
                r12 = 16
                goto L_0x008c
            L_0x0143:
                r8 = r5
                sx3.C64197v.m75542k()
                throw r8
            L_0x0148:
                r24 = r15
                com.tencent.mm.sdk.coroutines.LifecycleScope r3 = r24.mo14597c3()
                if (r3 == 0) goto L_0x0163
                vm3.i r5 = new vm3.i
                r13 = 0
                r8 = r5
                r9 = r19
                r10 = r24
                r11 = r2
                r12 = r18
                r8.<init>(r9, r10, r11, r12, r13)
                r6 = 0
                com.tencent.p014mm.sdk.coroutines.LifecycleScope.launchDefault$default(r3, r6, r5, r4, r6)
                goto L_0x0164
            L_0x0163:
                r6 = 0
            L_0x0164:
                r15 = r24
                goto L_0x01ec
            L_0x0168:
                r6 = r5
                r5 = r13
                r24 = r15
                r3 = 7
                r8 = 0
                d14.t0 r3 = d14.C58017a1.m67173b(r8, r8, r6, r3, r6)
                lv1.k r6 = new lv1.k
                r6.<init>()
                java.lang.String r8 = r2.f228810b
                r6.f224468c = r8
                r8 = 16
                r6.f224467b = r8
                nv1.b r8 = nv1.C100219b.f293645d
                r6.f224477l = r8
                rx3.g r8 = r15.f229821d
                rx3.n r8 = (rx3.C36570n) r8
                java.lang.Object r8 = r8.getValue()
                com.tencent.mm.sdk.platformtools.MMHandler r8 = (com.tencent.p014mm.sdk.platformtools.MMHandler) r8
                r6.f224479n = r8
                int[] r8 = new int[r7]
                r8 = {131072, 131081} // fill-array
                r6.f224472g = r8
                vm3.g$a r13 = new vm3.g$a
                r12 = 0
                r16 = 0
                r8 = r13
                r9 = r15
                r10 = r2
                r11 = r3
                r7 = r13
                r13 = r16
                r8.<init>(r9, r10, r11, r12, r13)
                r6.f224478m = r7
                r6.f224481p = r4
                java.util.HashSet<java.lang.String> r7 = r6.f224475j
                java.util.HashSet<java.lang.String> r8 = r1.f228827o
                r7.addAll(r8)
                di3.d r7 = di3.C86312j.m106911c(r17)
                kv1.q r7 = (kv1.C99260q) r7
                r8 = 2
                lv1.b r6 = r7.Xn0(r8, r6)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r14)
                int r8 = r6.hashCode()
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)
                java.util.ArrayList<lv1.b> r5 = r15.f229822e
                r5.add(r6)
                com.tencent.mm.sdk.coroutines.LifecycleScope r5 = r15.mo14597c3()
                if (r5 == 0) goto L_0x01ec
                vm3.j r6 = new vm3.j
                r13 = 0
                r8 = r6
                r9 = r3
                r10 = r18
                r11 = r15
                r12 = r2
                r8.<init>(r9, r10, r11, r12, r13)
                r2 = 0
                com.tencent.p014mm.sdk.coroutines.LifecycleScope.launchDefault$default(r5, r2, r6, r4, r2)
            L_0x01ec:
                yh.l r2 = vm3.C78444g.m94751i3(r15)
                com.tencent.mm.view.recyclerview.WxRecyclerView r2 = r2.mo109049g()
                r3 = 8
                r2.setVisibility(r3)
                yh.l r2 = vm3.C78444g.m94751i3(r15)
                com.tencent.mm.view.recyclerview.WxRecyclerView r2 = r2.mo109047e()
                r5 = 0
                r2.setVisibility(r5)
                goto L_0x0227
            L_0x0206:
                r3 = 8
                r5 = 0
                yh.l r6 = vm3.C78444g.m94751i3(r15)
                com.tencent.mm.view.recyclerview.WxRecyclerView r6 = r6.mo109049g()
                r6.setVisibility(r5)
                yh.l r5 = vm3.C78444g.m94751i3(r15)
                com.tencent.mm.view.recyclerview.WxRecyclerView r5 = r5.mo109047e()
                r5.setVisibility(r3)
                r15.mo108389j3()
                fy3.a<rx3.b0> r2 = r2.f187042c
                r2.invoke()
            L_0x0227:
                java.lang.Class<tm3.l> r2 = tm3.C78062l.class
                com.tencent.mm.sdk.statecenter.IStateAction r2 = r1.checkAction(r2)
                tm3.l r2 = (tm3.C78062l) r2
                if (r2 == 0) goto L_0x0277
                vm3.g r3 = r0.f229830d
                java.lang.String r5 = r2.f228805b
                boolean r5 = z04.C112551y.m153811k(r5)
                r5 = r5 ^ r4
                if (r5 == 0) goto L_0x0256
                yh.l r2 = vm3.C78444g.m94751i3(r3)
                com.tencent.mm.view.recyclerview.WxRecyclerView r2 = r2.mo109049g()
                r5 = 8
                r2.setVisibility(r5)
                yh.l r2 = vm3.C78444g.m94751i3(r3)
                com.tencent.mm.view.recyclerview.WxRecyclerView r2 = r2.mo109047e()
                r6 = 0
                r2.setVisibility(r6)
                goto L_0x0277
            L_0x0256:
                r5 = 8
                r6 = 0
                yh.l r7 = vm3.C78444g.m94751i3(r3)
                com.tencent.mm.view.recyclerview.WxRecyclerView r7 = r7.mo109049g()
                r7.setVisibility(r6)
                yh.l r6 = vm3.C78444g.m94751i3(r3)
                com.tencent.mm.view.recyclerview.WxRecyclerView r6 = r6.mo109047e()
                r6.setVisibility(r5)
                r3.mo108389j3()
                fy3.a<rx3.b0> r2 = r2.f228806c
                r2.invoke()
            L_0x0277:
                vm3.g r2 = r0.f229830d
                com.tencent.mm.sdk.statecenter.IStateAction r3 = r1.getAction()
                if (r3 == 0) goto L_0x03b5
                boolean r5 = r3 instanceof tm3.C78063m
                if (r5 == 0) goto L_0x03b5
                tm3.m r3 = (tm3.C78063m) r3
                om3.b r5 = r3.f228807a
                pm3.b r5 = r5.f225009h
                java.lang.String r6 = "null cannot be cast to non-null type com.tencent.mm.ui.mvvm.item.extension.addressbook.SelectContactAddressBookListItemExtension"
                gy3.C87412m.m108592e(r5, r6)
                qm3.a r5 = (qm3.C77374a) r5
                java.util.HashMap<java.lang.Integer, java.lang.Object> r1 = r1.f228830r
                if (r1 == 0) goto L_0x03b5
                int r6 = r5.f225589c
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Object r1 = r1.get(r6)
                if (r1 == 0) goto L_0x03b5
                boolean r6 = r1 instanceof lv1.C10656l
                if (r6 == 0) goto L_0x02a8
                lv1.l r1 = (lv1.C10656l) r1
                r8 = r1
                goto L_0x02a9
            L_0x02a8:
                r8 = 0
            L_0x02a9:
                if (r8 == 0) goto L_0x03b5
                om3.b r1 = r3.f228807a
                boolean r1 = r1.f225019u
                r6 = 45
                r7 = 10
                r9 = 3
                if (r1 == 0) goto L_0x0352
                java.util.List<lv1.n> r1 = r8.f32076e
                int r10 = r1.size()
                java.util.List r1 = r1.subList(r9, r10)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                java.util.Iterator r1 = r1.iterator()
                r10 = 0
            L_0x02ca:
                boolean r11 = r1.hasNext()
                if (r11 == 0) goto L_0x0349
                java.lang.Object r11 = r1.next()
                int r12 = r10 + 1
                if (r10 < 0) goto L_0x0344
                lv1.n r11 = (lv1.C99681n) r11
                java.lang.Class<f62.k0> r13 = f62.C75700k0.class
                k40.a r13 = f40.C86709a0.m107533q(r13)
                f62.k0 r13 = (f62.C75700k0) r13
                com.tencent.mm.storage.u3 r13 = r13.mo96097Ni()
                java.lang.String r14 = r11.f292151e
                com.tencent.mm.storage.z1 r13 = r13.get(r14)
                qm3.a r14 = new qm3.a
                lv1.i r15 = r8.f32075d
                int r4 = r5.f225589c
                int r28 = r10 + 3
                r29 = 0
                r30 = 0
                r31 = 0
                r32 = 1
                r33 = 112(0x70, float:1.57E-43)
                r34 = 0
                r24 = r14
                r25 = r11
                r26 = r15
                r27 = r4
                r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
                java.lang.String r4 = r13.getUsername()
                java.lang.String r10 = "contact.username"
                gy3.C87412m.m108593f(r4, r10)
                int r10 = r14.f225589c
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r4)
                r11.append(r6)
                r11.append(r7)
                r11.append(r6)
                r11.append(r10)
                java.lang.String r26 = r11.toString()
                qm3.a$a r24 = qm3.C77374a.f225586i
                androidx.appcompat.app.AppCompatActivity r25 = r2.getActivity()
                r28 = 10
                r27 = r13
                r29 = r14
                om3.b r4 = r24.mo107495a(r25, r26, r27, r28, r29)
                r9.add(r4)
                r10 = r12
                r4 = 1
                goto L_0x02ca
            L_0x0344:
                sx3.C64197v.m75542k()
                r1 = 0
                throw r1
            L_0x0349:
                com.tencent.mm.plugin.mvvmlist.MvvmList<om3.b> r1 = r3.f228808b
                if (r1 == 0) goto L_0x039d
                r2 = 0
                r1.mo129607j(r9, r2)
                goto L_0x039d
            L_0x0352:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.List<lv1.n> r2 = r8.f32076e
                int r4 = r2.size()
                java.util.List r2 = r2.subList(r9, r4)
                java.util.Iterator r2 = r2.iterator()
            L_0x0365:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L_0x0396
                java.lang.Object r4 = r2.next()
                lv1.n r4 = (lv1.C99681n) r4
                java.lang.String r4 = r4.f292151e
                java.lang.String r8 = "it.auxIndex"
                gy3.C87412m.m108593f(r4, r8)
                int r8 = r5.f225589c
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r4)
                r9.append(r6)
                r9.append(r7)
                r9.append(r6)
                r9.append(r8)
                java.lang.String r4 = r9.toString()
                r1.add(r4)
                goto L_0x0365
            L_0x0396:
                com.tencent.mm.plugin.mvvmlist.MvvmList<om3.b> r2 = r3.f228808b
                if (r2 == 0) goto L_0x039d
                r2.mo129611o(r1)
            L_0x039d:
                om3.b r1 = r3.f228807a
                zb2.d r1 = r1.mo90777Ow()
                om3.b r1 = (om3.C77020b) r1
                boolean r2 = r1.f225019u
                r4 = 1
                r2 = r2 ^ r4
                r1.f225019u = r2
                com.tencent.mm.plugin.mvvmlist.MvvmList<om3.b> r2 = r3.f228808b
                if (r2 == 0) goto L_0x03b5
                r3 = 0
                r4 = 0
                r5 = 2
                com.tencent.p014mm.plugin.mvvmlist.MvvmList.m119210t(r2, r1, r4, r5, r3)
            L_0x03b5:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: vm3.C78444g.C78448c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: vm3.g$d */
    public static final class C78449d extends C87413o implements C32224a<C79115l> {

        /* renamed from: d */
        public final /* synthetic */ C78444g f229831d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78449d(C78444g gVar) {
            super(0);
            this.f229831d = gVar;
        }

        public Object invoke() {
            return new C79115l(this.f229831d.getRootView());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78444g(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: g3 */
    public static final List m94750g3(C78444g gVar, int i, boolean z, C10656l lVar) {
        int i2 = i;
        C10656l lVar2 = lVar;
        gVar.getClass();
        List<C99681n> subList = (!z || lVar2.f32076e.size() <= 3) ? lVar2.f32076e : lVar2.f32076e.subList(0, 3);
        ArrayList arrayList = new ArrayList();
        C87412m.m108593f(subList, "showList");
        int i3 = 0;
        for (T next : subList) {
            int i4 = i3 + 1;
            String str = null;
            if (i3 >= 0) {
                C99681n nVar = (C99681n) next;
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(nVar.f292151e);
                if (!z1Var.mo62932t3()) {
                    C77374a aVar = new C77374a(nVar, lVar2.f32075d, i, i3, 0, 0, (String) null, z, 112, (C8480h) null);
                    String username = z1Var.getUsername();
                    C87412m.m108593f(username, "contact.username");
                    C77020b a = C77374a.f225586i.mo107495a(gVar.getActivity(), username + '-' + 10 + '-' + i2, z1Var, 10, aVar);
                    if (i3 == 0 && z) {
                        a.f225012n = true;
                        C99672i iVar = lVar2.f32075d;
                        if (iVar != null) {
                            str = iVar.f292120a;
                        }
                        if (str == null) {
                            str = "";
                        }
                        a.f225013o = str;
                    }
                    arrayList.add(a);
                }
                i3 = i4;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        if (z && lVar2.f32076e.size() > 3) {
            C72996z1 z1Var2 = new C72996z1();
            z1Var2.setUsername(i2 + "_collapse");
            C77374a aVar2 = new C77374a((C99681n) null, (C99672i) null, i, Integer.MAX_VALUE, 0, 0, (String) null, z, 115, (C8480h) null);
            String username2 = z1Var2.getUsername();
            C87412m.m108593f(username2, "collapseContact.username");
            arrayList.add(C77374a.f225586i.mo107495a(gVar.getActivity(), username2 + '-' + 11 + '-' + i2, z1Var2, 11, aVar2));
        }
        return arrayList;
    }

    /* renamed from: i3 */
    public static final C79115l m94751i3(C78444g gVar) {
        return (C79115l) ((C36570n) gVar.f229823f).getValue();
    }

    /* renamed from: j3 */
    public final void mo108389j3() {
        Log.m105924i("MicroMsg.SelectContactAddressBookSearchUIC", "stopSearch");
        for (C99664b ki : this.f229822e) {
            ((C99260q) C86312j.m106911c(C99260q.class)).mo128757ki(ki);
        }
        this.f229822e.clear();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        UIStateCenter e3 = mo14599e3();
        if (e3 != null) {
            e3.observe((C0125s) getActivity(), new C78448c(this));
        }
    }

    public void onDestroy() {
        for (C99664b ki : this.f229822e) {
            ((C99260q) C86312j.m106911c(C99260q.class)).mo128757ki(ki);
        }
        this.f229822e.clear();
    }
}
