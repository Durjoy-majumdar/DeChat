package fb3;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kj2.C61103a;
import z04.C112551y;

/* renamed from: fb3.a */
public final class C97855a {

    /* renamed from: a */
    public static final C97855a f287023a = new C97855a();

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo137181a() {
        /*
            r10 = this;
            i00.b r0 = wa3.C102364c.vx0()
            wa3.e r0 = r0.mo137946Rd()
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            wa3.f r1 = r0.f301472i
            java.lang.String r2 = r0.mo141945g()
            java.lang.String r1 = r1.mo141954a(r2)
            boolean r2 = r0.mo141944f()
            cb3.k r3 = cb3.C92400k.m116191h()
            boolean r4 = cb3.C92400k.f264411N
            r5 = 1
            if (r4 == 0) goto L_0x0028
            boolean r3 = r3.f264424a
            if (r3 == 0) goto L_0x002b
            r3 = 1
            goto L_0x002c
        L_0x0028:
            r3.getClass()
        L_0x002b:
            r3 = 0
        L_0x002c:
            wa3.f r4 = r0.f301472i
            int r6 = r4.f301480b
            int r4 = r4.f301481c
            if (r6 != 0) goto L_0x0035
            return
        L_0x0035:
            com.tencent.mm.autogen.mmdata.rpt.FavoriteNoteOpenReportStruct r7 = new com.tencent.mm.autogen.mmdata.rpt.FavoriteNoteOpenReportStruct
            r7.<init>()
            long r8 = (long) r6
            r7.f265566d = r8
            wa3.f r0 = r0.f301472i
            java.lang.String r0 = r0.f301479a
            java.lang.String r6 = "sessionID"
            java.lang.String r0 = r7.mo86045b(r6, r0, r5)
            r7.f265567e = r0
            java.lang.String r0 = "noteid"
            java.lang.String r0 = r7.mo86045b(r0, r1, r5)
            r7.f265568f = r0
            r7.f265569g = r2
            r7.f265570h = r3
            r7.f265571i = r4
            r7.mo86054n()
            fb3.a r0 = f287023a
            r0.mo137182b(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fb3.C97855a.mo137181a():void");
    }

    /* renamed from: b */
    public final void mo137182b(C61103a aVar) {
        if (Log.getLogLevel() <= 1) {
            String q = aVar.mo1006q();
            C87412m.m108593f(q, "struct.toShowString()");
            Log.m105925i("MicroMsg.WNNoteReporter", "report%s %s", Integer.valueOf(aVar.mo1004j()), C112551y.m153814n(q, APLogFileUtil.SEPARATOR_LINE, " ", false));
        }
    }
}
