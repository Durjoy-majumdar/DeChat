package xx0;

import java.util.HashMap;
import ob0.C11385n;
import wx3.C15601d;

/* renamed from: xx0.f */
public final class C53464f implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ C15601d<String> f150380d;

    /* renamed from: e */
    public final /* synthetic */ HashMap<String, String> f150381e;

    public C53464f(C15601d<? super String> dVar, HashMap<String, String> hashMap) {
        this.f150380d = dVar;
        this.f150381e = hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004f A[Catch:{ Exception -> 0x008d }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f A[Catch:{ Exception -> 0x008d }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0033 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0033 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSceneEnd(int r6, int r7, java.lang.String r8, ob0.C117747y r9) {
        /*
            r5 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r2 = 0
            r0[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r3 = 1
            r0[r3] = r1
            r1 = 2
            r0[r1] = r8
            java.lang.String r8 = "MicroMsg.Preload.TmplInfoManager"
            java.lang.String r1 = "[processTmplInfo]errType:%d, errCode:%d errMsg:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r1, r0)
            r9.setHasCallbackToQueue(r3)
            if (r6 != 0) goto L_0x0081
            if (r7 != 0) goto L_0x0081
            vs.e r9 = (p728vs.C52991e) r9     // Catch:{ Exception -> 0x008d }
            java.util.List r6 = r9.getHttpHeader()     // Catch:{ Exception -> 0x008d }
            java.lang.String r7 = "netSceneGetA8Key.httpHeader"
            gy3.C87412m.m108593f(r6, r7)     // Catch:{ Exception -> 0x008d }
            java.util.HashMap<java.lang.String, java.lang.String> r7 = r5.f150381e     // Catch:{ Exception -> 0x008d }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x008d }
        L_0x0033:
            boolean r0 = r6.hasNext()     // Catch:{ Exception -> 0x008d }
            if (r0 == 0) goto L_0x0071
            java.lang.Object r0 = r6.next()     // Catch:{ Exception -> 0x008d }
            te3.bh2 r0 = (te3.C48857bh2) r0     // Catch:{ Exception -> 0x008d }
            java.lang.String r1 = r0.f131120d     // Catch:{ Exception -> 0x008d }
            if (r1 == 0) goto L_0x004c
            int r1 = r1.length()     // Catch:{ Exception -> 0x008d }
            if (r1 != 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r1 = 0
            goto L_0x004d
        L_0x004c:
            r1 = 1
        L_0x004d:
            if (r1 != 0) goto L_0x0033
            java.lang.String r1 = r0.f131121e     // Catch:{ Exception -> 0x008d }
            if (r1 == 0) goto L_0x005c
            int r1 = r1.length()     // Catch:{ Exception -> 0x008d }
            if (r1 != 0) goto L_0x005a
            goto L_0x005c
        L_0x005a:
            r1 = 0
            goto L_0x005d
        L_0x005c:
            r1 = 1
        L_0x005d:
            if (r1 != 0) goto L_0x0033
            java.lang.String r1 = r0.f131120d     // Catch:{ Exception -> 0x008d }
            java.lang.String r4 = "it.Key"
            gy3.C87412m.m108593f(r1, r4)     // Catch:{ Exception -> 0x008d }
            java.lang.String r0 = r0.f131121e     // Catch:{ Exception -> 0x008d }
            java.lang.String r4 = "it.Value"
            gy3.C87412m.m108593f(r0, r4)     // Catch:{ Exception -> 0x008d }
            r7.put(r1, r0)     // Catch:{ Exception -> 0x008d }
            goto L_0x0033
        L_0x0071:
            wx3.d<java.lang.String> r6 = r5.f150380d     // Catch:{ Exception -> 0x008d }
            kotlin.Result$Companion r7 = kotlin.Result.Companion     // Catch:{ Exception -> 0x008d }
            java.lang.String r7 = r9.mo63062R()     // Catch:{ Exception -> 0x008d }
            java.lang.Object r7 = kotlin.Result.m168114constructorimpl(r7)     // Catch:{ Exception -> 0x008d }
            r6.resumeWith(r7)     // Catch:{ Exception -> 0x008d }
            goto L_0x00a6
        L_0x0081:
            wx3.d<java.lang.String> r6 = r5.f150380d     // Catch:{ Exception -> 0x008d }
            java.lang.String r7 = ""
            java.lang.Object r7 = kotlin.Result.m168114constructorimpl(r7)     // Catch:{ Exception -> 0x008d }
            r6.resumeWith(r7)     // Catch:{ Exception -> 0x008d }
            goto L_0x00a6
        L_0x008d:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "NetSceneGetA8Key ex "
            r7.append(r9)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r6)
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xx0.C53464f.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
