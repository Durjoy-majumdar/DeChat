package ij2;

import a14.C0000n0;
import a14.C53934p0;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import hj2.C59926a;
import hj2.C59927b;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import qo3.C47883u;
import qo3.C77426q;
import rx3.C13598b0;
import sx3.C110826x0;
import te3.C64563mr3;
import wx3.C15601d;
import yb2.C15946a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: ij2.b */
public final class C60307b extends C15946a {

    /* renamed from: d */
    public static final Set<String> f171939d = C110826x0.m151017e("Int", "Long", "Float", "String");

    @C91590f(mo125468c = "com.tencent.mm.plugin.repairer.ui.uic.RepairerDataUIC$onCreate$1", mo125469f = "RepairerDataUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: ij2.b$a */
    public static final class C60308a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f171940d;

        /* renamed from: e */
        public final /* synthetic */ C60307b f171941e;

        @C91590f(mo125468c = "com.tencent.mm.plugin.repairer.ui.uic.RepairerDataUIC$onCreate$1$3", mo125469f = "RepairerDataUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: ij2.b$a$a */
        public static final class C60309a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C60307b f171942d;

            /* renamed from: e */
            public final /* synthetic */ String f171943e;

            /* renamed from: ij2.b$a$a$a */
            public static final class C60310a implements C47883u {

                /* renamed from: a */
                public final /* synthetic */ C60307b f171944a;

                public C60310a(C60307b bVar) {
                    this.f171944a = bVar;
                }

                /* renamed from: a */
                public final void mo353a(boolean z, String str) {
                    this.f171944a.getActivity().finish();
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C60309a(C60307b bVar, String str, C15601d<? super C60309a> dVar) {
                super(2, dVar);
                this.f171942d = bVar;
                this.f171943e = str;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C60309a(this.f171942d, this.f171943e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C60309a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C77426q qVar = new C77426q(this.f171942d.getActivity());
                qVar.mo107595g(this.f171943e + "\n命名不合法！！");
                qVar.mo107590b(new C60310a(this.f171942d));
                qVar.mo107603o();
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60308a(C60307b bVar, C15601d<? super C60308a> dVar) {
            super(2, dVar);
            this.f171941e = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C60308a aVar = new C60308a(this.f171941e, dVar);
            aVar.f171940d = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C60308a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                kotlin.ResultKt.throwOnFailure(r14)
                java.lang.Object r14 = r13.f171940d
                a14.n0 r14 = (a14.C0000n0) r14
                gy3.f0 r14 = new gy3.f0
                r14.<init>()
                te3.mr3 r0 = new te3.mr3
                r0.<init>()
                r14.f27484d = r0
                ij2.b r0 = r13.f171941e
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r1 = "key_config_item_list"
                byte[] r0 = r0.getByteArrayExtra(r1)
                r1 = 0
                if (r0 == 0) goto L_0x002b
                T r2 = r14.f27484d
                te3.mr3 r2 = (te3.C64563mr3) r2
                pe3.a r0 = r2.parseFrom(r0)
                goto L_0x002c
            L_0x002b:
                r0 = r1
            L_0x002c:
                r2 = 1
                if (r0 != 0) goto L_0x01ea
                ij2.b r0 = r13.f171941e
                java.util.Set<java.lang.String> r3 = ij2.C60307b.f171939d
                r0.getClass()
                te3.mr3 r3 = new te3.mr3
                r3.<init>()
                java.util.HashMap r4 = new java.util.HashMap
                r4.<init>()
                rx3.g r5 = ii2.C60296d.f171927a
                rx3.n r5 = (rx3.C36570n) r5
                java.lang.Object r5 = r5.getValue()
                ii2.c r5 = (ii2.C60295c) r5
                java.util.Set r5 = r5.mo85283a()
                java.util.Iterator r5 = r5.iterator()
            L_0x0052:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L_0x018a
                java.lang.Object r6 = r5.next()
                java.lang.Class r6 = (java.lang.Class) r6
                java.lang.reflect.Constructor[] r7 = r6.getConstructors()
                r8 = 0
                r7 = r7[r8]
                java.lang.Object[] r9 = new java.lang.Object[r8]
                java.lang.Object r7 = r7.newInstance(r9)
                boolean r9 = r7 instanceof kf3.C61082e
                if (r9 == 0) goto L_0x00a5
                r9 = r7
                kf3.e r9 = (kf3.C61082e) r9
                java.lang.Class r10 = r9.mo54533d()
                boolean r10 = gy3.C87412m.m108589b(r10, r6)
                if (r10 == 0) goto L_0x007e
                r10 = r3
                goto L_0x0083
            L_0x007e:
                te3.mr3 r10 = new te3.mr3
                r10.<init>()
            L_0x0083:
                java.lang.String r11 = r9.mo54531a()
                r10.f184380d = r11
                java.lang.String r11 = r9.mo54532b()
                r10.f184381e = r11
                r10.f184382f = r2
                r10.f184387n = r8
                int r8 = r9.mo86005c()
                r10.f184391r = r8
                rx3.l r8 = new rx3.l
                java.lang.Class r9 = r9.mo54533d()
                r8.<init>(r9, r10)
                r4.put(r6, r8)
            L_0x00a5:
                boolean r8 = r7 instanceof kf3.C61079a
                r9 = 2147483647(0x7fffffff, float:NaN)
                if (r8 == 0) goto L_0x00e0
                te3.mr3 r8 = new te3.mr3
                r8.<init>()
                r10 = r7
                kf3.a r10 = (kf3.C61079a) r10
                java.lang.String r11 = r10.mo54531a()
                r8.f184380d = r11
                java.lang.String r11 = r10.mo54532b()
                r8.f184381e = r11
                r11 = 2
                r8.f184382f = r11
                java.util.LinkedList<java.lang.String> r11 = r8.f184383g
                java.lang.String r12 = r10.mo85734f()
                r11.add(r12)
                int r11 = r10.mo55679e()
                r8.f184387n = r11
                r8.f184391r = r9
                rx3.l r11 = new rx3.l
                java.lang.Class r10 = r10.mo54533d()
                r11.<init>(r10, r8)
                r4.put(r6, r11)
            L_0x00e0:
                boolean r8 = r7 instanceof kf3.C61081c
                if (r8 == 0) goto L_0x0052
                te3.mr3 r8 = new te3.mr3
                r8.<init>()
                r10 = r7
                kf3.c r10 = (kf3.C61081c) r10
                java.lang.String r11 = r10.mo86004j()
                r8.f184380d = r11
                java.lang.String r11 = r10.mo54532b()
                r8.f184381e = r11
                r11 = 3
                r8.f184382f = r11
                int r11 = r10.mo55679e()
                r8.f184387n = r11
                r8.f184391r = r9
                boolean r9 = r7 instanceof kf3.C61080b
                if (r9 == 0) goto L_0x011b
                java.util.LinkedList<java.lang.String> r9 = r8.f184383g
                kf3.b r7 = (kf3.C61080b) r7
                java.util.List r11 = r7.mo59752l()
                r9.addAll(r11)
                java.util.LinkedList<java.lang.String> r9 = r8.f184386j
                java.util.List r7 = r7.mo59751k()
                r9.addAll(r7)
            L_0x011b:
                java.lang.String r7 = r10.mo86002f()
                int r9 = r7.hashCode()
                switch(r9) {
                    case -1808118735: goto L_0x015f;
                    case 73679: goto L_0x014d;
                    case 2374300: goto L_0x013a;
                    case 67973692: goto L_0x0127;
                    default: goto L_0x0126;
                }
            L_0x0126:
                goto L_0x0172
            L_0x0127:
                java.lang.String r9 = "Float"
                boolean r7 = r7.equals(r9)
                if (r7 != 0) goto L_0x0130
                goto L_0x0172
            L_0x0130:
                java.lang.Object r7 = r10.mo54534g()
                boolean r7 = r7 instanceof java.lang.Float
                if (r7 != 0) goto L_0x0172
                goto L_0x0052
            L_0x013a:
                java.lang.String r9 = "Long"
                boolean r7 = r7.equals(r9)
                if (r7 != 0) goto L_0x0143
                goto L_0x0172
            L_0x0143:
                java.lang.Object r7 = r10.mo54534g()
                boolean r7 = r7 instanceof java.lang.Long
                if (r7 != 0) goto L_0x0172
                goto L_0x0052
            L_0x014d:
                java.lang.String r9 = "Int"
                boolean r7 = r7.equals(r9)
                if (r7 == 0) goto L_0x0172
                java.lang.Object r7 = r10.mo54534g()
                boolean r7 = r7 instanceof java.lang.Integer
                if (r7 != 0) goto L_0x0172
                goto L_0x0052
            L_0x015f:
                java.lang.String r9 = "String"
                boolean r7 = r7.equals(r9)
                if (r7 != 0) goto L_0x0168
                goto L_0x0172
            L_0x0168:
                java.lang.Object r7 = r10.mo54534g()
                boolean r7 = r7 instanceof java.lang.String
                if (r7 != 0) goto L_0x0172
                goto L_0x0052
            L_0x0172:
                java.lang.Object r7 = r10.mo54534g()
                java.lang.String r7 = r7.toString()
                r8.f184388o = r7
                rx3.l r7 = new rx3.l
                java.lang.Class r9 = r10.mo54533d()
                r7.<init>(r9, r8)
                r4.put(r6, r7)
                goto L_0x0052
            L_0x018a:
                java.util.Set r5 = r4.entrySet()
                java.util.Iterator r5 = r5.iterator()
            L_0x0192:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L_0x01d2
                java.lang.Object r6 = r5.next()
                java.util.Map$Entry r6 = (java.util.Map.Entry) r6
                java.lang.Object r7 = r6.getKey()
                java.lang.Class<gg3.n> r8 = gg3.C59435n.class
                boolean r7 = gy3.C87412m.m108589b(r7, r8)
                if (r7 != 0) goto L_0x0192
                java.lang.Object r7 = r6.getValue()
                rx3.l r7 = (rx3.C13604l) r7
                A r7 = r7.f38555d
                java.lang.Class r7 = (java.lang.Class) r7
                java.lang.Object r7 = r4.get(r7)
                rx3.l r7 = (rx3.C13604l) r7
                if (r7 == 0) goto L_0x0192
                B r7 = r7.f38556e
                te3.mr3 r7 = (te3.C64563mr3) r7
                if (r7 == 0) goto L_0x0192
                java.util.LinkedList<te3.mr3> r7 = r7.f184385i
                if (r7 == 0) goto L_0x0192
                java.lang.Object r6 = r6.getValue()
                rx3.l r6 = (rx3.C13604l) r6
                B r6 = r6.f38556e
                r7.add(r6)
                goto L_0x0192
            L_0x01d2:
                java.util.LinkedList<te3.mr3> r4 = r3.f184385i
                java.lang.String r5 = "rootRepairerItem.subItemList"
                gy3.C87412m.m108593f(r4, r5)
                r0.mo85299j3(r4)
                java.util.LinkedList<te3.mr3> r0 = r3.f184385i
                fj2.d$a r4 = fj2.C59107d.f169071a
                te3.mr3 r4 = r4.mo84304k()
                r0.add(r4)
                r14.f27484d = r3
            L_0x01ea:
                ij2.b r0 = r13.f171941e
                T r3 = r14.f27484d
                te3.mr3 r3 = (te3.C64563mr3) r3
                java.util.Set<java.lang.String> r4 = ij2.C60307b.f171939d
                java.lang.String r0 = r0.mo85297g3(r3)
                boolean r3 = z04.C112551y.m153811k(r0)
                r2 = r2 ^ r3
                if (r2 == 0) goto L_0x0216
                ij2.b r2 = r13.f171941e
                com.tencent.mm.sdk.coroutines.LifecycleScope r3 = r2.mo14597c3()
                if (r3 == 0) goto L_0x0216
                a14.h0 r2 = a14.C53872d1.f151117a
                a14.k2 r4 = f14.C58901s.f168555a
                r5 = 0
                ij2.b$a$a r6 = new ij2.b$a$a
                ij2.b r2 = r13.f171941e
                r6.<init>(r2, r0, r1)
                r7 = 2
                r8 = 0
                a14.C53895h.m60466d(r3, r4, r5, r6, r7, r8)
            L_0x0216:
                boolean r0 = f40.C86709a0.m107522a()
                if (r0 != 0) goto L_0x0225
                ij2.b r0 = r13.f171941e
                T r1 = r14.f27484d
                te3.mr3 r1 = (te3.C64563mr3) r1
                r0.mo85298i3(r1)
            L_0x0225:
                ij2.b r0 = r13.f171941e
                com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity r0 = r0.mo14598d3()
                if (r0 == 0) goto L_0x023f
                com.tencent.mm.sdk.statecenter.UIStateCenter r0 = r0.getStateCenter()
                if (r0 == 0) goto L_0x023f
                hj2.a r1 = new hj2.a
                T r14 = r14.f27484d
                te3.mr3 r14 = (te3.C64563mr3) r14
                r1.<init>(r14)
                r0.dispatch(r1)
            L_0x023f:
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: ij2.C60307b.C60308a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: ij2.b$b */
    public static final class C60311b extends C87413o implements C32226l<C59927b, C13598b0> {

        /* renamed from: d */
        public static final C60311b f171945d = new C60311b();

        public C60311b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C59927b bVar = (C59927b) obj;
            C87412m.m108594g(bVar, "state");
            IStateAction action = bVar.getAction();
            if (action != null && (action instanceof C59926a)) {
                bVar.f171035e = ((C59926a) action).f171033a;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ij2.b$c */
    public static final class C60312c implements Comparator<C64563mr3> {
        public int compare(Object obj, Object obj2) {
            C64563mr3 mr32 = (C64563mr3) obj;
            C64563mr3 mr33 = (C64563mr3) obj2;
            if (mr32 == null || mr33 == null) {
                return 0;
            }
            int i = C87412m.m108596i(mr32.f184391r, mr33.f184391r);
            if (i != 0) {
                return i;
            }
            String str = mr32.f184381e;
            String str2 = mr33.f184381e;
            C87412m.m108593f(str2, "o2.name");
            return str.compareTo(str2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60307b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: g3 */
    public final String mo85297g3(C64563mr3 mr32) {
        int i = mr32.f184382f;
        String str = "";
        if (i == 3) {
            String str2 = mr32.f184380d.toString();
            List U = C112550d0.m153785U(str2, new String[]{"_"}, false, 0, 6, (Object) null);
            return (U.size() >= 3 && C87412m.m108589b(U.get(0), "RepairerConfig") && f171939d.contains(U.get(U.size() - 1))) ? str : str2;
        } else if (i == 2) {
            String str3 = mr32.f184380d.toString();
            return !C112551y.m153820t(str3, "RepairerActivity_", false, 2, (Object) null) ? str3 : str;
        } else {
            if (i == 1) {
                String str4 = mr32.f184380d.toString();
                if (C112551y.m153820t(str4, "RepairerGroup_", false, 2, (Object) null)) {
                    LinkedList<C64563mr3> linkedList = mr32.f184385i;
                    C87412m.m108593f(linkedList, "item.subItemList");
                    for (C64563mr3 mr33 : linkedList) {
                        C87412m.m108593f(mr33, LocaleUtil.ITALIAN);
                        str = mo85297g3(mr33);
                        if (!C112551y.m153811k(str)) {
                            break;
                        }
                    }
                } else {
                    return str4;
                }
            }
            return str;
        }
    }

    /* renamed from: i3 */
    public final boolean mo85298i3(C64563mr3 mr32) {
        Iterator<C64563mr3> it = mr32.f184385i.iterator();
        C87412m.m108593f(it, "item.subItemList.iterator()");
        boolean z = true;
        while (it.hasNext()) {
            C64563mr3 next = it.next();
            if (next.f184382f == 1) {
                if (mo85298i3(next)) {
                    it.remove();
                }
            } else if (next.f184387n != 1) {
                it.remove();
            }
            z = false;
        }
        return z;
    }

    /* renamed from: j3 */
    public final void mo85299j3(List<? extends C64563mr3> list) {
        for (C64563mr3 mr32 : list) {
            LinkedList<C64563mr3> linkedList = mr32.f184385i;
            C87412m.m108593f(linkedList, "it.subItemList");
            if (!linkedList.isEmpty()) {
                LinkedList<C64563mr3> linkedList2 = mr32.f184385i;
                C87412m.m108593f(linkedList2, "it.subItemList");
                mo85299j3(linkedList2);
            }
        }
        Collections.sort(list, new C60312c());
    }

    public void onCreate(Bundle bundle) {
        UIStateCenter stateCenter;
        super.onCreate(bundle);
        LifecycleScope c3 = mo14597c3();
        if (c3 != null) {
            LifecycleScope.launchDefault$default(c3, (C53934p0) null, new C60308a(this, (C15601d<? super C60308a>) null), 1, (Object) null);
        }
        BaseMvvmActivity d3 = mo14598d3();
        if (d3 != null && (stateCenter = d3.getStateCenter()) != null) {
            stateCenter.process((C0125s) getActivity(), C60311b.f171945d);
        }
    }
}
