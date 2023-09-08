package p756xt;

import android.os.Handler;
import com.tencent.p014mm.app.C114661d0;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;

/* renamed from: xt.e */
public final class C66442e implements C114661d0 {

    /* renamed from: d */
    public final String f191199d = "MicroMsg.LiveAppForegroundStaticListener";

    public Handler getHandler() {
        return null;
    }

    public void onAppBackground(String str) {
        if (C86709a0.m107522a()) {
            String str2 = this.f191199d;
            StringBuilder sb = new StringBuilder();
            sb.append("onAppBackground liveId:");
            RoomLiveService roomLiveService = RoomLiveService.f157190a;
            sb.append(RoomLiveService.f157197h.f133050d);
            sb.append(" liveName:");
            sb.append(RoomLiveService.f157197h.f133051e);
            Log.m105924i(str2, sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0031, code lost:
        r1 = r1.f166252c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAppForeground(java.lang.String r4) {
        /*
            r3 = this;
            boolean r4 = f40.C86709a0.m107522a()
            if (r4 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.String r4 = r3.f191199d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onAppForeground liveId:"
            r0.append(r1)
            com.tencent.mm.live.model.RoomLiveService r1 = com.tencent.p014mm.live.model.RoomLiveService.f157190a
            te3.ep2 r1 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            long r1 = r1.f133050d
            r0.append(r1)
            java.lang.String r1 = " liveName:"
            r0.append(r1)
            te3.ep2 r1 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            java.lang.String r1 = r1.f133051e
            r0.append(r1)
            java.lang.String r1 = " jumpName:"
            r0.append(r1)
            d50.h r1 = com.tencent.p014mm.live.model.RoomLiveService.f157201l
            if (r1 == 0) goto L_0x0038
            d50.d r1 = r1.f166252c
            if (r1 == 0) goto L_0x0038
            java.lang.String r1 = r1.f166190a
            goto L_0x0039
        L_0x0038:
            r1 = 0
        L_0x0039:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p756xt.C66442e.onAppForeground(java.lang.String):void");
    }
}
