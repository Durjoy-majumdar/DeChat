package com.tencent.p014mm.network;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.tencent.p014mm.network.C81040l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.network.n0 */
public final class C114787n0 extends C81040l.C81041a {

    /* renamed from: e */
    public int f344175e = 4;

    /* renamed from: f */
    public int f344176f = 0;

    /* renamed from: g */
    public final RemoteCallbackList<C29060q> f344177g = new RemoteCallbackList<>();

    /* renamed from: h */
    public MTimerHandler f344178h = new MTimerHandler(new C114788a(), false);

    /* renamed from: com.tencent.mm.network.n0$a */
    public class C114788a implements MTimerHandler.CallBack {
        public C114788a() {
        }

        public boolean onTimerExpired() {
            int beginBroadcast = C114787n0.this.f344177g.beginBroadcast();
            Log.m105925i("MicroMsg.NetworkEvent", "listeners ct : %d", Integer.valueOf(beginBroadcast));
            while (true) {
                beginBroadcast--;
                if (beginBroadcast >= 0) {
                    try {
                        C114787n0.this.f344177g.getBroadcastItem(beginBroadcast).onNetworkChange(C114787n0.this.f344175e);
                    } catch (RemoteException e) {
                        Log.m105921e("MicroMsg.NetworkEvent", "exception:%s", Util.stackTraceToString(e));
                    }
                } else {
                    C114787n0.this.f344177g.finishBroadcast();
                    return false;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004b  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo174443c(int r7) {
        /*
            r6 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "MicroMsg.NetworkEvent"
            java.lang.String r4 = "networkChange : %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r1)
            int r1 = r6.f344175e
            r2 = 4
            if (r7 != r1) goto L_0x0018
        L_0x0016:
            r0 = 0
            goto L_0x0048
        L_0x0018:
            r4 = 3
            r5 = 2
            if (r4 != r7) goto L_0x0022
            if (r1 == r5) goto L_0x001f
            goto L_0x0016
        L_0x001f:
            r6.f344175e = r7
            goto L_0x0048
        L_0x0022:
            if (r5 != r7) goto L_0x0033
            if (r1 == 0) goto L_0x0016
            if (r1 != r0) goto L_0x0029
            goto L_0x0016
        L_0x0029:
            int r1 = r6.f344176f
            int r1 = r1 + r0
            r6.f344176f = r1
            if (r1 < r0) goto L_0x0046
            r6.f344175e = r5
            goto L_0x0048
        L_0x0033:
            if (r2 != r7) goto L_0x003a
            r6.f344176f = r3
            r6.f344175e = r2
            goto L_0x0048
        L_0x003a:
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r1 < r4) goto L_0x0046
            r1 = -1
            if (r7 != r1) goto L_0x0046
            r6.f344175e = r3
            goto L_0x0048
        L_0x0046:
            r6.f344175e = r7
        L_0x0048:
            if (r0 != 0) goto L_0x004b
            return
        L_0x004b:
            int r7 = r6.f344175e
            if (r7 == 0) goto L_0x0055
            if (r7 == r2) goto L_0x0055
            r0 = 6
            if (r7 == r0) goto L_0x0055
            return
        L_0x0055:
            com.tencent.mm.sdk.platformtools.MTimerHandler r7 = r6.f344178h
            r0 = 1000(0x3e8, double:4.94E-321)
            r7.startTimer(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.network.C114787n0.mo174443c(int):void");
    }

    /* renamed from: gY */
    public boolean mo112945gY(C29060q qVar) {
        try {
            this.f344177g.register(qVar);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.NetworkEvent", "addListener %s", e);
            Log.m105921e("MicroMsg.NetworkEvent", "exception:%s", Util.stackTraceToString(e));
        }
        return true;
    }

    /* renamed from: wL */
    public int mo112946wL() {
        int i = 0 > Util.secondsToNow(0) ? 5 : this.f344175e;
        Log.m105925i("MicroMsg.NetworkEvent", "getNowStatus = %d", Integer.valueOf(i));
        return i;
    }
}
