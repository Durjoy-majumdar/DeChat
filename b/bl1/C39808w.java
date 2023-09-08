package bl1;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import te3.C64311db1;
import tf1.C13914m;

/* renamed from: bl1.w */
public final class C39808w extends C39775b {

    /* renamed from: i */
    public String f106818i;

    /* renamed from: j */
    public C64311db1 f106819j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C39808w(boolean r4, te3.C52013xs0 r5) {
        /*
            r3 = this;
            java.lang.String r0 = "source"
            gy3.C87412m.m108594g(r5, r0)
            r3.<init>(r4, r5)
            te3.lu0 r4 = new te3.lu0
            r4.<init>()
            pe3.b r5 = r5.f144906h
            r0 = 0
            if (r5 == 0) goto L_0x0018
            byte[] r5 = r5.mo123703f()
            goto L_0x0019
        L_0x0018:
            r5 = r0
        L_0x0019:
            java.lang.String r1 = ""
            if (r5 != 0) goto L_0x001e
            goto L_0x002e
        L_0x001e:
            r4.parseFrom(r5)     // Catch:{ Exception -> 0x0022 }
            goto L_0x002f
        L_0x0022:
            r4 = move-exception
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r2 = 0
            r5[r2] = r4
            java.lang.String r4 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r4, r1, r5)
        L_0x002e:
            r4 = r0
        L_0x002f:
            if (r4 == 0) goto L_0x0045
            java.lang.String r5 = r4.f137643e
            if (r5 != 0) goto L_0x0036
            r5 = r1
        L_0x0036:
            r3.f106818i = r5
            te3.db1 r4 = r4.f137642d
            if (r4 != 0) goto L_0x0041
            te3.db1 r4 = new te3.db1
            r4.<init>()
        L_0x0041:
            r3.f106819j = r4
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0045:
            if (r0 != 0) goto L_0x0055
            te3.lu0 r4 = new te3.lu0
            r4.<init>()
            r3.f106818i = r1
            te3.db1 r4 = new te3.db1
            r4.<init>()
            r3.f106819j = r4
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bl1.C39808w.<init>(boolean, te3.xs0):void");
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        if (mVar instanceof C39808w) {
            return super.mo76f(mVar);
        }
        return -1;
    }

    public String getContent() {
        String str = mo62427j().f182663f;
        String str2 = this.f106818i;
        if (str2 != null) {
            if (str2.length() == 0) {
                if (!(str == null || str.length() == 0)) {
                    String string = MMApplicationContext.getContext().getString(C0966R.string.djn, new Object[]{str});
                    C87412m.m108593f(string, "{\n            MMApplicat…ied_city, city)\n        }");
                    return string;
                }
            }
            String str3 = this.f106818i;
            if (str3 != null) {
                return str3;
            }
            C87412m.m108603p("msgContent");
            throw null;
        }
        C87412m.m108603p("msgContent");
        throw null;
    }

    /* renamed from: i */
    public String mo62406i() {
        StringBuilder sb = new StringBuilder();
        sb.append("LocationBoxMsg content:");
        String str = this.f106818i;
        if (str != null) {
            sb.append(str);
            sb.append(", location:");
            sb.append(mo62427j().f182663f);
            sb.append(super.mo62406i());
            return sb.toString();
        }
        C87412m.m108603p("msgContent");
        throw null;
    }

    /* renamed from: j */
    public final C64311db1 mo62427j() {
        C64311db1 db12 = this.f106819j;
        if (db12 != null) {
            return db12;
        }
        C87412m.m108603p(FirebaseAnalytics.C113379b.LOCATION);
        throw null;
    }
}
