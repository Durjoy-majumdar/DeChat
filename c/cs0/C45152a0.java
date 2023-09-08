package cs0;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import rx3.C13598b0;
import te3.C50331lz2;
import te3.C51309sw3;
import te3.v75;
import te3.w75;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: cs0.a0 */
public final class C45152a0 {

    /* renamed from: a */
    public static final C45152a0 f122426a = new C45152a0();

    /* renamed from: b */
    public static final Map<String, v75> f122427b = new HashMap();

    @C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.ui.privacy.revoke.UserInfoRevokeRepository", mo125469f = "UserInfoRevokeRepository.kt", mo125470l = {54}, mo125471m = "getUsageInfo")
    /* renamed from: cs0.a0$a */
    public static final class C45153a extends C66704d {

        /* renamed from: d */
        public Object f122428d;

        /* renamed from: e */
        public /* synthetic */ Object f122429e;

        /* renamed from: f */
        public final /* synthetic */ C45152a0 f122430f;

        /* renamed from: g */
        public int f122431g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45153a(C45152a0 a0Var, C15601d<? super C45153a> dVar) {
            super(dVar);
            this.f122430f = a0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f122429e = obj;
            this.f122431g |= Integer.MIN_VALUE;
            return this.f122430f.mo70656a((String) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo70656a(java.lang.String r5, wx3.C15601d<? super te3.v75> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof cs0.C45152a0.C45153a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            cs0.a0$a r0 = (cs0.C45152a0.C45153a) r0
            int r1 = r0.f122431g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f122431g = r1
            goto L_0x0018
        L_0x0013:
            cs0.a0$a r0 = new cs0.a0$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f122429e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f122431g
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.f122428d
            java.lang.String r5 = (java.lang.String) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x00a4
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r2 = "getUsageInfo, appId: "
            r6.append(r2)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            java.lang.String r2 = "MicroMsg.AppBrand.UserInfoRevokeRepository"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
            java.util.Map<java.lang.String, te3.v75> r6 = f122427b
            java.util.HashMap r6 = (java.util.HashMap) r6
            java.lang.Object r6 = r6.get(r5)
            te3.v75 r6 = (te3.v75) r6
            if (r6 == 0) goto L_0x005e
            java.lang.String r5 = "getUsageInfo, cache hit"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)
            return r6
        L_0x005e:
            r0.f122428d = r5
            r0.f122431g = r3
            wx3.h r6 = new wx3.h
            wx3.d r0 = xx3.C66447b.m78392b(r0)
            r6.<init>(r0)
            ob0.c$b r0 = new ob0.c$b
            r0.<init>()
            java.lang.String r2 = "/cgi-bin/mmbiz-bin/wxaapp_getauthinfo"
            r0.f127068c = r2
            r2 = 1115(0x45b, float:1.562E-42)
            r0.f127069d = r2
            te3.r45 r2 = new te3.r45
            r2.<init>()
            r2.f140693d = r5
            wi0.v r3 = wi0.C53173v.f148355a
            int r3 = r3.mo73862a(r5)
            r2.f140694e = r3
            r0.f127066a = r2
            te3.s45 r2 = new te3.s45
            r2.<init>()
            r0.f127067b = r2
            ob0.c r0 = r0.mo72403a()
            cs0.g r2 = new cs0.g
            r2.<init>(r6)
            r3 = 0
            ob0.C89144l0.m111429e(r0, r2, r3)
            java.lang.Object r6 = r6.mo90314b()
            if (r6 != r1) goto L_0x00a4
            return r1
        L_0x00a4:
            te3.s45 r6 = (te3.s45) r6
            te3.v75 r6 = r6.f141328f
            if (r6 == 0) goto L_0x00b2
            java.util.Map<java.lang.String, te3.v75> r0 = f122427b
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r5, r6)
            return r6
        L_0x00b2:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r6 = "use_user_info is null"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: cs0.C45152a0.mo70656a(java.lang.String, wx3.d):java.lang.Object");
    }

    /* renamed from: b */
    public final boolean mo70657b(C51309sw3 sw32) {
        if (sw32 == null) {
            return false;
        }
        String str = sw32.f141804d;
        if (str == null || str.length() == 0) {
            return false;
        }
        int i = sw32.f141806f;
        return i == 0 || 1 == i || 7 == i;
    }

    /* renamed from: c */
    public final Object mo70658c(String str, String str2, C15601d<? super C13598b0> dVar) {
        Log.m105924i("MicroMsg.AppBrand.UserInfoRevokeRepository", "revokeAppUseUserInfo, appId: " + str + ", scope: " + str2);
        if (str == null || str2 == null) {
            return C13598b0.f38549a;
        }
        C45173i iVar = C45173i.f122480a;
        C50331lz2 lz22 = new C50331lz2();
        lz22.f137726d = str;
        lz22.f137727e = null;
        lz22.f137728f = str2;
        lz22.f137729g = 7;
        Object a = iVar.mo70668a(lz22, dVar);
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        if (a != aVar) {
            a = C13598b0.f38549a;
        }
        return a == aVar ? a : C13598b0.f38549a;
    }

    /* renamed from: d */
    public final Object mo70659d(String str, String str2, String str3, C15601d<? super C13598b0> dVar) {
        Log.m105924i("MicroMsg.AppBrand.UserInfoRevokeRepository", "revokePluginUseUserInfo, appId: " + str + ", pluginAppId: " + str2 + ", scope: " + str3);
        if (str == null || str2 == null || str3 == null) {
            return C13598b0.f38549a;
        }
        C45173i iVar = C45173i.f122480a;
        C50331lz2 lz22 = new C50331lz2();
        lz22.f137726d = str;
        lz22.f137727e = str2;
        lz22.f137728f = str3;
        lz22.f137729g = 7;
        Object a = iVar.mo70668a(lz22, dVar);
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        if (a != aVar) {
            a = C13598b0.f38549a;
        }
        return a == aVar ? a : C13598b0.f38549a;
    }

    /* renamed from: e */
    public final boolean mo70660e(v75 v75) {
        boolean z;
        boolean z2;
        LinkedList<w75> linkedList;
        LinkedList<C51309sw3> linkedList2;
        LinkedList<C51309sw3> linkedList3;
        boolean z3;
        LinkedList<C51309sw3> linkedList4;
        LinkedList<C51309sw3> linkedList5;
        if (v75 == null) {
            return false;
        }
        w75 w75 = v75.f143381d;
        if (w75 == null) {
            z = false;
        } else {
            String str = w75.f143915d;
            z = !(str == null || str.length() == 0);
        }
        if (!z) {
            return false;
        }
        w75 w752 = v75.f143381d;
        if (!(w752 == null || (linkedList5 = w752.f143918g) == null)) {
            ArrayList arrayList = new ArrayList();
            for (T next : linkedList5) {
                if (f122426a.mo70657b((C51309sw3) next)) {
                    arrayList.add(next);
                }
            }
            linkedList5.clear();
            linkedList5.addAll(arrayList);
        }
        w75 w753 = v75.f143381d;
        boolean z4 = (w753 == null || (linkedList4 = w753.f143918g) == null || linkedList4.isEmpty()) ? false : true;
        LinkedList<w75> linkedList6 = v75.f143382e;
        if (!(linkedList6 != null && !linkedList6.isEmpty()) || (linkedList = v75.f143382e) == null) {
            z2 = false;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (T next2 : linkedList) {
                w75 w754 = (w75) next2;
                if (w754 == null) {
                    z3 = false;
                } else {
                    String str2 = w754.f143915d;
                    z3 = !(str2 == null || str2.length() == 0);
                }
                if (z3) {
                    arrayList2.add(next2);
                }
            }
            linkedList.clear();
            linkedList.addAll(arrayList2);
            z2 = false;
            for (w75 w755 : linkedList) {
                if (!(w755 == null || (linkedList3 = w755.f143918g) == null)) {
                    ArrayList arrayList3 = new ArrayList();
                    for (T next3 : linkedList3) {
                        if (f122426a.mo70657b((C51309sw3) next3)) {
                            arrayList3.add(next3);
                        }
                    }
                    linkedList3.clear();
                    linkedList3.addAll(arrayList3);
                }
                if ((w755 == null || (linkedList2 = w755.f143918g) == null || linkedList2.isEmpty()) ? false : true) {
                    z2 = true;
                }
            }
        }
        return z4 || z2;
    }
}
