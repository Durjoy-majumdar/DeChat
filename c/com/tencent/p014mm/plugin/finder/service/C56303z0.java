package com.tencent.p014mm.plugin.finder.service;

import android.content.Context;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C46111l4;
import ht1.C60179k4;
import it1.C60625c;
import java.util.LinkedList;
import je1.C33556k4;
import je1.C60796c2;
import nr3.C89059e;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C50946qd1;
import up1.C52599l0;
import z04.C112551y;

@C86522b
/* renamed from: com.tencent.mm.plugin.finder.service.z0 */
public final class C56303z0 extends C86301e implements C60179k4 {

    /* renamed from: d */
    public final C13601g f160911d = C36568h.m40985a(C30023f.f81257d);

    /* renamed from: com.tencent.mm.plugin.finder.service.z0$f */
    public static final class C30023f extends C87413o implements C32224a<C52599l0> {

        /* renamed from: d */
        public static final C30023f f81257d = new C30023f();

        public C30023f() {
            super(0);
        }

        public Object invoke() {
            return ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).mo76736Au();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.service.z0$a */
    public static final class C56304a extends C87413o implements C32229r<String, Integer, Integer, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60179k4.C60180a f160912d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56304a(C60179k4.C60180a aVar) {
            super(4);
            this.f160912d = aVar;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            String str = (String) obj;
            C87412m.m108594g(str, "sessionIdServer");
            this.f160912d.mo83611a(str, ((Number) obj2).intValue(), ((Number) obj3).intValue(), (String) obj4);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.service.z0$b */
    public static final class C56305b extends C87413o implements C32229r<String, Integer, Integer, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60179k4.C60180a f160913d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56305b(C60179k4.C60180a aVar) {
            super(4);
            this.f160913d = aVar;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            String str = (String) obj;
            C87412m.m108594g(str, "sessionIdServer");
            this.f160913d.mo83611a(str, ((Number) obj2).intValue(), ((Number) obj3).intValue(), (String) obj4);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.service.z0$c */
    public static final class C56306c extends C87413o implements C32229r<String, Integer, Integer, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60179k4.C60180a f160914d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56306c(C60179k4.C60180a aVar) {
            super(4);
            this.f160914d = aVar;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            String str = (String) obj;
            C87412m.m108594g(str, "sessionIdServer");
            this.f160914d.mo83611a(str, ((Number) obj2).intValue(), ((Number) obj3).intValue(), (String) obj4);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.service.z0$d */
    public static final class C56307d extends C87413o implements C32229r<String, Integer, Integer, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60179k4.C60180a f160915d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56307d(C60179k4.C60180a aVar) {
            super(4);
            this.f160915d = aVar;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            String str = (String) obj;
            C87412m.m108594g(str, "sessionIdServer");
            this.f160915d.mo83611a(str, ((Number) obj2).intValue(), ((Number) obj3).intValue(), (String) obj4);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.service.z0$e */
    public static final class C56308e extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C56308e f160916d = new C56308e();

        public C56308e() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return "[field_senderUserName] is empty";
        }
    }

    public static void vx0(C56303z0 z0Var, Context context, int i, String str, String str2, long j, long j2, boolean z, String str3, C46111l4.C33059a aVar, Integer num, boolean z2, boolean z3, C32229r rVar, int i2, Object obj) {
        C60796c2 c2Var;
        Context context2 = context;
        int i3 = i;
        String str4 = str;
        int i4 = i2;
        String str5 = (i4 & 8) != 0 ? null : str2;
        long j3 = (i4 & 16) != 0 ? 0 : j;
        long j4 = (i4 & 32) != 0 ? 0 : j2;
        boolean z4 = (i4 & 64) != 0 ? false : z;
        String str6 = (i4 & 128) != 0 ? "" : str3;
        C46111l4.C33059a aVar2 = (i4 & 256) != 0 ? C46111l4.C33059a.GET_SESSION_ID : aVar;
        Integer num2 = (i4 & 512) != 0 ? null : num;
        boolean z5 = (i4 & 1024) != 0 ? false : z2;
        boolean z6 = (i4 & 2048) != 0 ? false : z3;
        z0Var.getClass();
        if (str5 != null) {
            c2Var = new C60796c2(str5);
            C60625c.m70894l(c2Var, context, (String) null, 1500, 2, (Object) null);
        } else {
            int i5 = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
            if (i5 != 0 && j4 != 0 && !z5) {
                c2Var = new C60796c2(i, str, j3, j4);
                C60625c.m70894l(c2Var, context, (String) null, 1500, 2, (Object) null);
            } else if (i5 != 0 && z6) {
                c2Var = new C60796c2(i3, str4, j3);
                C60625c.m70894l(c2Var, context, (String) null, 1500, 2, (Object) null);
            } else if (z4) {
                c2Var = new C60796c2(i, str, str6, j3, num2);
                C60625c.m70894l(c2Var, context, (String) null, 1500, 2, (Object) null);
            } else {
                c2Var = new C60796c2(i3, str4);
                C60625c.m70894l(c2Var, context, (String) null, 1500, 2, (Object) null);
            }
        }
        C89059e i6 = c2Var.mo9225i();
        i6.mo123419C(new C41488d1(z0Var, i, str, str5, j3, j4, aVar2, rVar));
        C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        i6.mo11397F((MMFragmentActivity) context2);
    }

    public void A50(Context context, int i, String str, int i2, C60179k4.C60180a aVar) {
        String str2 = str;
        C60179k4.C60180a aVar2 = aVar;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar2, "callable");
        if (str2 == null || str.length() == 0) {
            aVar2.mo83611a("", 0, 0, "");
            Log.m105920e("Finder.SessionInfoService", "[getSessionId] username=" + str2 + " is invalid, just return.");
            return;
        }
        C56307d dVar = r1;
        C56307d dVar2 = new C56307d(aVar2);
        vx0(this, context, i, str, (String) null, 0, 0, false, (String) null, (C46111l4.C33059a) null, (Integer) null, false, false, dVar, 4088, (Object) null);
    }

    public void H70(Context context, String str, String str2, C60179k4.C60180a aVar) {
        String str3 = str2;
        C60179k4.C60180a aVar2 = aVar;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar2, "callable");
        boolean z = true;
        if (str3 == null || str2.length() == 0) {
            aVar2.mo83611a("", 0, 0, "");
            Log.m105920e("Finder.SessionInfoService", "[getSessionId] username=" + str3 + " is invalid, just return.");
            return;
        }
        String str4 = wx0().mo71553G2(str).field_sessionId;
        if (!(str4 == null || str4.length() == 0)) {
            z = false;
        }
        if (z) {
            C56306c cVar = r1;
            C56306c cVar2 = new C56306c(aVar2);
            vx0(this, context, 1, str2, (String) null, 0, 0, false, (String) null, (C46111l4.C33059a) null, (Integer) null, false, false, cVar, 4088, (Object) null);
            return;
        }
        aVar2.mo83611a(str4, 0, 0, "");
    }

    public void Hp0(LinkedList<C50946qd1> linkedList, C60179k4.C46110b bVar) {
        C87412m.m108594g(linkedList, "reqItems");
        C41489f1 f1Var = C41489f1.f111738d;
        C41489f1.f111739e = bVar;
        C86709a0.m107524d().mo123455a(6218, f1Var);
        C86709a0.m107524d().mo123460f(new C33556k4(linkedList));
    }

    public void Rm0(Context context, String str, String str2, Long l, Long l2, boolean z, C60179k4.C60180a aVar) {
        String str3 = str2;
        C60179k4.C60180a aVar2 = aVar;
        long longValue = l.longValue();
        long longValue2 = l2.longValue();
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str3, "username");
        C87412m.m108594g(aVar2, "callable");
        if (longValue == 0 || longValue2 == 0) {
            aVar2.mo83611a("", 0, 0, "");
            Log.m105920e("Finder.SessionInfoService", "[getSessionId] username=" + str3 + " objectId=" + longValue + " or commentId=" + longValue2 + " is invalid, just return.");
            return;
        }
        String str4 = wx0().mo71553G2(str).field_sessionId;
        if (str4 == null || str4.length() == 0) {
            C56277a1 a1Var = r1;
            C56277a1 a1Var2 = new C56277a1(aVar2);
            vx0(this, context, 1, str2, (String) null, longValue, longValue2, false, (String) null, (C46111l4.C33059a) null, (Integer) null, z, false, a1Var, 3016, (Object) null);
            return;
        }
        aVar2.mo83611a(str4, 0, 0, "");
    }

    /* renamed from: WT */
    public void mo78767WT(Context context, String str, String str2, C60179k4.C60180a aVar) {
        String str3 = str2;
        C60179k4.C60180a aVar2 = aVar;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar2, "callable");
        boolean z = true;
        if (str3 == null || str2.length() == 0) {
            aVar2.mo83611a("", 0, 0, "");
            Log.m105920e("Finder.SessionInfoService", "[getSessionId] fansId=" + str3 + " is invalid, just return.");
            return;
        }
        String str4 = wx0().mo71553G2(str).field_sessionId;
        if (!(str4 == null || str4.length() == 0)) {
            z = false;
        }
        if (z) {
            C56305b bVar = r1;
            C56305b bVar2 = new C56305b(aVar2);
            vx0(this, context, 1, "", str2, 0, 0, false, (String) null, (C46111l4.C33059a) null, (Integer) null, false, false, bVar, 4080, (Object) null);
            return;
        }
        aVar2.mo83611a(str4, 0, 0, "");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if ((r1.length() > 0) == true) goto L_0x001d;
     */
    /* renamed from: d3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo78768d3(java.lang.String r10) {
        /*
            r9 = this;
            up1.l0 r0 = r9.wx0()
            ue1.f0 r10 = r0.mo71553G2(r10)
            ft1.a r0 = ft1.C59319a.f169618b
            java.lang.String r1 = r10.field_senderUserName
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001c
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0018
            r1 = 1
            goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            if (r1 != r2) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r2 = 0
        L_0x001d:
            r3 = 0
            r4 = 0
            r5 = 0
            com.tencent.mm.plugin.finder.service.z0$e r6 = com.tencent.p014mm.plugin.finder.service.C56303z0.C56308e.f160916d
            r7 = 28
            r8 = 0
            java.lang.String r1 = "getSessionSender"
            o40.C11348f.C11349a.m11178b(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r10 = r10.field_senderUserName
            if (r10 != 0) goto L_0x0030
            java.lang.String r10 = ""
        L_0x0030:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.service.C56303z0.mo78768d3(java.lang.String):java.lang.String");
    }

    public String ds0(String str, int i) {
        return wx0().mo73556Lo(str, i);
    }

    /* renamed from: n */
    public String mo78770n(String str) {
        String str2 = wx0().mo71553G2(str).field_talker;
        return str2 == null ? "" : str2;
    }

    public boolean p70(String str) {
        if (str != null) {
            return C112551y.m153808h(str, "@findermsg", false, 2, (Object) null);
        }
        return false;
    }

    /* renamed from: uE */
    public int mo78772uE(String str) {
        C87412m.m108594g(str, "sessionId");
        return wx0().mo71553G2(str).field_actionPermission;
    }

    /* renamed from: vl */
    public void mo78773vl(Context context, int i, String str, String str2, Long l, int i2, C60179k4.C60180a aVar) {
        String str3 = str;
        C60179k4.C60180a aVar2 = aVar;
        long longValue = l.longValue();
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str2, "lotteryId");
        C87412m.m108594g(aVar2, "callable");
        if (str3 == null || str.length() == 0) {
            aVar2.mo83611a("", 0, 0, "");
            Log.m105920e("Finder.SessionInfoService", "[getSessionId] username=" + str3 + " is invalid, just return.");
            return;
        }
        Integer valueOf = Integer.valueOf(i2);
        C56279c1 c1Var = r1;
        C56279c1 c1Var2 = new C56279c1(aVar2);
        vx0(this, context, i, str, (String) null, longValue, 0, true, str2, (C46111l4.C33059a) null, valueOf, false, false, c1Var, 3368, (Object) null);
    }

    /* renamed from: wP */
    public void mo78774wP(Context context, String str, String str2, Long l, C60179k4.C60180a aVar) {
        String str3 = str2;
        C60179k4.C60180a aVar2 = aVar;
        long longValue = l.longValue();
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str3, "username");
        C87412m.m108594g(aVar2, "callable");
        if (longValue == 0) {
            aVar2.mo83611a("", 0, 0, "");
            Log.m105920e("Finder.SessionInfoService", "[getSessionId] username=" + str3 + " objectId=" + longValue + " is invalid, just return.");
            return;
        }
        String str4 = wx0().mo71553G2(str).field_sessionId;
        if (str4 == null || str4.length() == 0) {
            C56278b1 b1Var = r1;
            C56278b1 b1Var2 = new C56278b1(aVar2);
            vx0(this, context, 1, str2, (String) null, longValue, 0, false, (String) null, (C46111l4.C33059a) null, (Integer) null, false, true, b1Var, 2024, (Object) null);
            return;
        }
        aVar2.mo83611a(str4, 0, 0, "");
    }

    public final C52599l0 wx0() {
        return (C52599l0) ((C36570n) this.f160911d).getValue();
    }

    /* renamed from: zG */
    public void mo78776zG(Context context, int i, String str, int i2, C60179k4.C60180a aVar) {
        String str2 = str;
        C60179k4.C60180a aVar2 = aVar;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar2, "callable");
        boolean z = true;
        if (str2 == null || str.length() == 0) {
            aVar2.mo83611a("", 0, 0, "");
            Log.m105920e("Finder.SessionInfoService", "[getSessionId] username=" + str2 + " is invalid, just return.");
            return;
        }
        String ds02 = ds0(str2, i2);
        if (ds02.length() != 0) {
            z = false;
        }
        if (z) {
            C56304a aVar3 = r1;
            C56304a aVar4 = new C56304a(aVar2);
            vx0(this, context, i, str, (String) null, 0, 0, false, (String) null, (C46111l4.C33059a) null, (Integer) null, false, false, aVar3, 4088, (Object) null);
            return;
        }
        aVar2.mo83611a(ds02, 0, 0, "");
    }
}
