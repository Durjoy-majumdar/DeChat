package jk2;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import kotlin.Metadata;
import q20.C89449a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Ljk2/i;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "<init>", "()V", "feature-exdevice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C89449a
/* renamed from: jk2.i */
public final class C21250i implements C80883e<Bundle, IPCInteger> {
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void invoke(java.lang.Object r9, com.tencent.p014mm.ipcinvoker.C1256g r10) {
        /*
            r8 = this;
            android.os.Bundle r9 = (android.os.Bundle) r9
            java.lang.String r0 = "MicroMsg.Rtos.IPCASyncInvokeTask_HandleStartUpCheck"
            java.lang.String r1 = "invoke handle startup check"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r0 = 0
            if (r9 == 0) goto L_0x0014
            java.lang.String r1 = "mac"
            java.lang.String r1 = r9.getString(r1)
            goto L_0x0015
        L_0x0014:
            r1 = r0
        L_0x0015:
            if (r9 == 0) goto L_0x001f
            java.lang.String r2 = "username"
            java.lang.String r9 = r9.getString(r2)
            goto L_0x0020
        L_0x001f:
            r9 = r0
        L_0x0020:
            nk2.f$b r2 = nk2.C21641f.f61259l
            nk2.f r2 = r2.mo33911a()
            r2.getClass()
            java.lang.Class<jk2.s> r3 = jk2.C33588s.class
            boolean r4 = r2.f61264d
            java.lang.String r5 = "MicroMsg.Rtos.RtosWatchService"
            if (r4 != 0) goto L_0x0038
            java.lang.String r9 = "handleStartUpCheck but not init"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r9)
            goto L_0x0112
        L_0x0038:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "handleStartUpCheck "
            r4.append(r6)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            ik2.a r4 = r2.f61261a
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L_0x005c
            com.tencent.mm.plugin.rtos.bluetooth.RtosBCChannel r4 = (com.tencent.p014mm.plugin.rtos.bluetooth.RtosBCChannel) r4
            boolean r4 = r4.mo24191i()
            if (r4 != 0) goto L_0x005c
            r4 = 1
            goto L_0x005d
        L_0x005c:
            r4 = 0
        L_0x005d:
            if (r4 == 0) goto L_0x0065
            java.lang.String r1 = "bluetooth is not enable"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r1)
            goto L_0x0097
        L_0x0065:
            ik2.a r4 = r2.f61261a
            if (r4 == 0) goto L_0x0070
            com.tencent.mm.plugin.rtos.bluetooth.RtosBCChannel r4 = (com.tencent.p014mm.plugin.rtos.bluetooth.RtosBCChannel) r4
            java.lang.String r1 = r4.mo24188f(r1)
            goto L_0x0071
        L_0x0070:
            r1 = r0
        L_0x0071:
            ik2.a r4 = r2.f61261a
            if (r4 == 0) goto L_0x007d
            gy3.C87412m.m108591d(r1)
            com.tencent.mm.plugin.rtos.bluetooth.RtosBCChannel r4 = (com.tencent.p014mm.plugin.rtos.bluetooth.RtosBCChannel) r4
            r4.init(r1)
        L_0x007d:
            ik2.a r1 = r2.f61261a
            if (r1 == 0) goto L_0x008b
            com.tencent.mm.plugin.rtos.bluetooth.RtosBCChannel r1 = (com.tencent.p014mm.plugin.rtos.bluetooth.RtosBCChannel) r1
            boolean r1 = r1.mo24199o()
            if (r1 != r6) goto L_0x008b
            r1 = 1
            goto L_0x008c
        L_0x008b:
            r1 = 0
        L_0x008c:
            if (r1 == 0) goto L_0x00f8
            ik2.a r1 = r2.f61261a
            if (r1 == 0) goto L_0x0097
            com.tencent.mm.plugin.rtos.bluetooth.RtosBCChannel r1 = (com.tencent.p014mm.plugin.rtos.bluetooth.RtosBCChannel) r1
            r1.mo24197m()
        L_0x0097:
            if (r9 == 0) goto L_0x00a7
            int r1 = r9.length()
            if (r1 != 0) goto L_0x00a1
            r1 = 1
            goto L_0x00a2
        L_0x00a1:
            r1 = 0
        L_0x00a2:
            if (r1 == 0) goto L_0x00a5
            goto L_0x00a7
        L_0x00a5:
            r1 = 0
            goto L_0x00a8
        L_0x00a7:
            r1 = 1
        L_0x00a8:
            r2.f61271k = r1
            com.tencent.wechat.rtos.WeChatApi r1 = r2.f61262b
            if (r1 == 0) goto L_0x00b2
            int r7 = r1.tryAutoLogin(r9)
        L_0x00b2:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "try auto login "
            r9.append(r1)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r9)
            if (r7 < 0) goto L_0x00d4
            if (r10 == 0) goto L_0x0112
            com.tencent.mm.ipcinvoker.type.IPCInteger r9 = new com.tencent.mm.ipcinvoker.type.IPCInteger
            r9.<init>(r6)
            r10.mo894a(r9)
            goto L_0x0112
        L_0x00d4:
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN
            com.tencent.mm.ipcinvoker.type.IPCVoid r1 = new com.tencent.mm.ipcinvoker.type.IPCVoid
            r1.<init>()
            com.tencent.p014mm.ipcinvoker.C80907o.m98783f(r9, r1, r3)
            r9 = 8
            if (r10 == 0) goto L_0x00ea
            com.tencent.mm.ipcinvoker.type.IPCInteger r1 = new com.tencent.mm.ipcinvoker.type.IPCInteger
            r1.<init>(r9)
            r10.mo894a(r1)
        L_0x00ea:
            nk2.f$g r9 = r2.f61269i
            if (r9 == 0) goto L_0x00f4
            r9.mo33915a()
            r2.f61269i = r0
            goto L_0x0112
        L_0x00f4:
            r2.mo33907a()
            goto L_0x0112
        L_0x00f8:
            java.lang.String r9 = "unBonded need logout and clearBindInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r9)
            com.tencent.wechat.rtos.WeChatApi r9 = r2.f61262b
            if (r9 == 0) goto L_0x0105
            r9.logout()
        L_0x0105:
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN
            com.tencent.mm.ipcinvoker.type.IPCVoid r10 = new com.tencent.mm.ipcinvoker.type.IPCVoid
            r10.<init>()
            com.tencent.p014mm.ipcinvoker.C80907o.m98783f(r9, r10, r3)
            r2.mo33907a()
        L_0x0112:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jk2.C21250i.invoke(java.lang.Object, com.tencent.mm.ipcinvoker.g):void");
    }
}
