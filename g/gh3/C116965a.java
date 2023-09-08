package gh3;

import bh3.C113194y;
import com.tencent.p014mm.sdk.platformtools.Log;
import eh3.C116771c;
import eh3.C116772d;
import gy3.C87412m;
import java.lang.reflect.Method;
import java.util.HashMap;

/* renamed from: gh3.a */
public abstract class C116965a implements C116973j {

    /* renamed from: gh3.a$a */
    public static final class C116966a implements C113194y.C113197b {

        /* renamed from: a */
        public final /* synthetic */ C116965a f350533a;

        public C116966a(C116965a aVar) {
            this.f350533a = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:60:0x012b, code lost:
            if (com.tencent.p014mm.sensitive.p135ui.PermissionSwitchCheckUtil.m163124b(r12, r3, (fy3.C32226l) null, 2, (java.lang.Object) null) == true) goto L_0x012f;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public rx3.C13604l<java.lang.Boolean, java.lang.Object> mo165727a(java.lang.Object r12, java.lang.reflect.Method r13, java.lang.Object[] r14) {
            /*
                r11 = this;
                java.util.HashMap<java.lang.String, eh3.c> r12 = eh3.C116772d.f350090a
                r14 = 0
                if (r13 == 0) goto L_0x000a
                java.lang.String r0 = r13.getName()
                goto L_0x000b
            L_0x000a:
                r0 = r14
            L_0x000b:
                java.lang.Object r12 = r12.get(r0)
                eh3.c r12 = (eh3.C116771c) r12
                if (r12 == 0) goto L_0x0018
                rx3.l r12 = r12.value()
                goto L_0x0019
            L_0x0018:
                r12 = r14
            L_0x0019:
                r0 = 2
                r1 = 1
                r2 = 0
                if (r12 == 0) goto L_0x010c
                gh3.a r3 = r11.f350533a
                if (r13 == 0) goto L_0x0032
                java.lang.String r4 = r13.getName()
                if (r4 == 0) goto L_0x0032
                java.lang.String r5 = "getConnectionInfo"
                boolean r4 = r4.equals(r5)
                if (r4 != r1) goto L_0x0032
                r4 = 1
                goto L_0x0033
            L_0x0032:
                r4 = 0
            L_0x0033:
                java.lang.String r5 = "BaseHookSysServiceProcessor"
                java.lang.String r6 = ""
                java.lang.String r7 = "[onServiceMethodIntercept] methodName = "
                if (r4 == 0) goto L_0x0094
                B r4 = r12.f38556e
                boolean r4 = r4 instanceof android.net.wifi.WifiInfo
                if (r4 == 0) goto L_0x0094
                r3.getClass()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r7)
                if (r13 == 0) goto L_0x0053
                java.lang.String r8 = r13.getName()
                goto L_0x0054
            L_0x0053:
                r8 = r14
            L_0x0054:
                if (r8 != 0) goto L_0x0057
                r8 = r6
            L_0x0057:
                r4.append(r8)
                java.lang.String r8 = ", return cache: "
                r4.append(r8)
                B r8 = r12.f38556e
                java.lang.String r9 = "null cannot be cast to non-null type android.net.wifi.WifiInfo"
                gy3.C87412m.m108592e(r8, r9)
                android.net.wifi.WifiInfo r8 = (android.net.wifi.WifiInfo) r8
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "SSID:"
                r9.append(r10)
                java.lang.String r10 = r8.getSSID()
                r9.append(r10)
                java.lang.String r10 = ", BSSID:"
                r9.append(r10)
                java.lang.String r8 = r8.getBSSID()
                r9.append(r8)
                java.lang.String r8 = r9.toString()
                r4.append(r8)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r4)
                goto L_0x00c2
            L_0x0094:
                r3.getClass()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r7)
                if (r13 == 0) goto L_0x00a6
                java.lang.String r8 = r13.getName()
                goto L_0x00a7
            L_0x00a6:
                r8 = r14
            L_0x00a7:
                if (r8 != 0) goto L_0x00aa
                r8 = r6
            L_0x00aa:
                r4.append(r8)
                java.lang.String r8 = ", return cache:"
                r4.append(r8)
                B r8 = r12.f38556e
                if (r8 != 0) goto L_0x00b8
                java.lang.String r8 = "null"
            L_0x00b8:
                r4.append(r8)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r4)
            L_0x00c2:
                A r4 = r12.f38555d
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                if (r4 != 0) goto L_0x00ea
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r7)
                if (r13 == 0) goto L_0x00db
                java.lang.String r5 = r13.getName()
                goto L_0x00dc
            L_0x00db:
                r5 = r14
            L_0x00dc:
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                java.lang.String r5 = "Kenneth-methodCall"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r4)
                r4 = 1
                goto L_0x00eb
            L_0x00ea:
                r4 = 0
            L_0x00eb:
                hh3.b r5 = hh3.C117092b.f350860a
                java.lang.String r3 = r3.mo58629b()
                if (r13 == 0) goto L_0x00f8
                java.lang.String r5 = r13.getName()
                goto L_0x00f9
            L_0x00f8:
                r5 = r14
            L_0x00f9:
                if (r5 != 0) goto L_0x00fc
                goto L_0x00fd
            L_0x00fc:
                r6 = r5
            L_0x00fd:
                java.lang.String r5 = "serviceName"
                gy3.C87412m.m108594g(r3, r5)
                java.lang.String r5 = hh3.C117092b.f350861b
                hh3.d r7 = new hh3.d
                r7.<init>(r3, r6, r4)
                o40.C61926c.m72659D(r5, r2, r7, r0, r14)
            L_0x010c:
                if (r12 == 0) goto L_0x011a
                A r3 = r12.f38555d
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                if (r3 == 0) goto L_0x0119
                goto L_0x011a
            L_0x0119:
                return r12
            L_0x011a:
                if (r13 == 0) goto L_0x012e
                com.tencent.mm.sensitive.ui.PermissionSwitchCheckUtil r12 = com.tencent.p014mm.sensitive.p135ui.PermissionSwitchCheckUtil.f347926a
                java.lang.String r3 = r13.getName()
                java.lang.String r4 = "it.name"
                gy3.C87412m.m108593f(r3, r4)
                boolean r12 = com.tencent.p014mm.sensitive.p135ui.PermissionSwitchCheckUtil.m163124b(r12, r3, r14, r0, r14)
                if (r12 != r1) goto L_0x012e
                goto L_0x012f
            L_0x012e:
                r1 = 0
            L_0x012f:
                if (r1 == 0) goto L_0x0141
                rx3.l r12 = new rx3.l
                java.lang.Boolean r14 = java.lang.Boolean.FALSE
                java.lang.Class r13 = r13.getReturnType()
                java.lang.Object r13 = r13.newInstance()
                r12.<init>(r14, r13)
                return r12
            L_0x0141:
                rx3.l r12 = new rx3.l
                java.lang.Boolean r13 = java.lang.Boolean.TRUE
                r12.<init>(r13, r14)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: gh3.C116965a.C116966a.mo165727a(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):rx3.l");
        }

        /* renamed from: b */
        public void mo165728b(Method method, Object[] objArr) {
            StringBuilder sb = new StringBuilder();
            sb.append("[onServiceMethodInvoke] methodName = ");
            sb.append(method != null ? method.getName() : null);
            Log.m105918d("Kenneth-methodCall", sb.toString());
        }

        /* renamed from: c */
        public void mo165729c(Method method, Object obj) {
            String name = method != null ? method.getName() : null;
            if (name != null && obj != null) {
                HashMap<String, C116771c> hashMap = C116772d.f350090a;
                C116771c cVar = C116772d.f350090a.get(name);
                if (cVar != null) {
                    cVar.mo180748a(obj);
                }
            }
        }
    }

    /* renamed from: c */
    public C113194y.C113197b mo180949c() {
        return new C116966a(this);
    }

    /* renamed from: d */
    public void mo58630d(Object obj) {
        C87412m.m108594g(obj, "service");
    }
}
