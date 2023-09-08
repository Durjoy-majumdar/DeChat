package wo2;

import android.os.IBinder;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.sns.p104ad.remote.ipc.impl.IPCRemoteProxy;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.remoteservice.C96899b;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.Map;
import op2.C100372b;
import pp2.C47518b;
import qp2.C101232a;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: wo2.g */
public final class C102471g implements C100372b {

    /* renamed from: d */
    public static final C102472a f301748d = new C102472a((C8480h) null);

    /* renamed from: e */
    public static final Map<String, C32226l<Parcelable, C13598b0>> f301749e = new LinkedHashMap();

    /* renamed from: f */
    public static C47518b f301750f;

    /* renamed from: wo2.g$a */
    public static final class C102472a {
        public C102472a(C8480h hVar) {
        }

        /* renamed from: a */
        public final boolean mo142081a(C47518b bVar) {
            C96899b bVar2;
            IBinder asBinder;
            SnsMethodCalculate.markStartTimeMs("isAlive", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdMMIPCProxy$Companion");
            boolean z = false;
            try {
                C101232a aVar = (C101232a) bVar;
                aVar.getClass();
                SnsMethodCalculate.markStartTimeMs("getClientCallback", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
                IPCRemoteProxy iPCRemoteProxy = aVar.f296419c;
                if (iPCRemoteProxy == null || (bVar2 = iPCRemoteProxy.f283897e) == null) {
                    bVar2 = null;
                    SnsMethodCalculate.markEndTimeMs("getClientCallback", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
                } else {
                    SnsMethodCalculate.markEndTimeMs("getClientCallback", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
                }
                if (!(bVar2 == null || (asBinder = bVar2.asBinder()) == null)) {
                    z = asBinder.isBinderAlive();
                }
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("isAlive", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdMMIPCProxy$Companion");
            return z;
        }
    }

    /* renamed from: b */
    public static final void m135256b(Parcelable parcelable) {
        SnsMethodCalculate.markStartTimeMs("callOnSubThread", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdMMIPCProxy");
        SnsMethodCalculate.markStartTimeMs("callOnSubThread", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdMMIPCProxy$Companion");
        C87412m.m108594g(parcelable, "obj");
        ((C119157j) C119157j.f356862d).mo183884o(new C102470f(parcelable));
        SnsMethodCalculate.markEndTimeMs("callOnSubThread", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdMMIPCProxy$Companion");
        SnsMethodCalculate.markEndTimeMs("callOnSubThread", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdMMIPCProxy");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (r2 == true) goto L_0x0022;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Bundle mo67224a(pp2.C47518b r9, android.os.Bundle r10) {
        /*
            r8 = this;
            java.lang.String r0 = "onServerCall"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdMMIPCProxy"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            pp2.b r2 = f301750f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0021
            wo2.g$a r5 = f301748d
            java.lang.String r6 = "access$isAlive"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdMMIPCProxy$Companion"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            boolean r2 = r5.mo142081a(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
            if (r2 != r3) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r3 = 0
        L_0x0022:
            java.lang.String r2 = "AdLandingIPCCall"
            if (r3 != 0) goto L_0x002e
            f301750f = r9
            java.lang.String r3 = "onServerCall() get callback binder!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
        L_0x002e:
            r3 = 0
            if (r10 == 0) goto L_0x005f
            java.lang.String r5 = "obj"
            android.os.Parcelable r5 = r10.getParcelable(r5)     // Catch:{ all -> 0x005d }
            if (r5 != 0) goto L_0x003b
            goto L_0x005f
        L_0x003b:
            java.lang.Class r6 = r5.getClass()     // Catch:{ all -> 0x005d }
            java.lang.String r6 = r6.getName()     // Catch:{ all -> 0x005d }
            java.util.Map<java.lang.String, fy3.l<android.os.Parcelable, rx3.b0>> r7 = f301749e     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap r7 = (java.util.LinkedHashMap) r7     // Catch:{ all -> 0x005d }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x005d }
            fy3.l r6 = (fy3.C32226l) r6     // Catch:{ all -> 0x005d }
            if (r6 != 0) goto L_0x0053
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)     // Catch:{ all -> 0x005d }
            return r3
        L_0x0053:
            r6.invoke(r5)     // Catch:{ all -> 0x005d }
            java.lang.String r5 = "onServerCall() call success~"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)     // Catch:{ all -> 0x005d }
            goto L_0x006a
        L_0x005d:
            r5 = move-exception
            goto L_0x0063
        L_0x005f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)     // Catch:{ all -> 0x005d }
            return r3
        L_0x0063:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r6 = "call with error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r5, r6, r4)
        L_0x006a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "onServerCall() called with: callbackResponse = "
            r4.append(r5)
            r4.append(r9)
            java.lang.String r9 = ", params = "
            r4.append(r9)
            r4.append(r10)
            java.lang.String r9 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wo2.C102471g.mo67224a(pp2.b, android.os.Bundle):android.os.Bundle");
    }
}
