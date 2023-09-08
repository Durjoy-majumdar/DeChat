package fd0;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: fd0.g */
public class C75742g {
    /* renamed from: a */
    public static void m91009a(long j, String str) {
        Log.m105925i("MicroMsg.FMessageLogic", "clearFMsgAndFConvByTalker, rowId: %d, talker: %s", Long.valueOf(j), str);
        boolean Lo = C75743h.vx0().mo101165Lo(j, str);
        Log.m105924i("MicroMsg.FMessageLogic", "clearFMsgAndFConvByTalker, delete fconversation, ret = " + Lo);
        boolean jo = C75743h.wx0().mo101191jo(str);
        Log.m105924i("MicroMsg.FMessageLogic", "clearFMsgAndFConvByTalker, delete fmsginfo, ret = " + jo);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r4 = fd0.C75743h.wx0().mo101187Ow(r4);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m91010b(java.lang.String r4, long r5) {
        /*
            if (r4 == 0) goto L_0x0012
            com.tencent.mm.storage.n3 r0 = fd0.C75743h.wx0()
            com.tencent.mm.storage.m3 r4 = r0.mo101187Ow(r4)
            if (r4 == 0) goto L_0x0012
            long r0 = r4.field_createTime
            r2 = 1
            long r0 = r0 + r2
            goto L_0x0014
        L_0x0012:
            r0 = 0
        L_0x0014:
            r2 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r2
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x001d
            return r0
        L_0x001d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fd0.C75742g.m91010b(java.lang.String, long):long");
    }
}
