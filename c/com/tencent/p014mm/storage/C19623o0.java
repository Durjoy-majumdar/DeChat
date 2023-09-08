package com.tencent.p014mm.storage;

import android.util.Base64;
import com.tencent.p014mm.pluginsdk.model.C19465u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import jw0.C21290c;
import org.json.JSONObject;
import p749xh.C118880v0;
import te3.C22508lo3;
import te3.me4;
import te3.re4;

/* renamed from: com.tencent.mm.storage.o0 */
public class C19623o0 extends C118880v0 {

    /* renamed from: y1 */
    public static IAutoDBItem.MAutoDBInfo f55516y1 = C118880v0.initAutoDBInfo(C19623o0.class);

    /* renamed from: b1 */
    public boolean f55517b1 = false;

    /* renamed from: c1 */
    public boolean f55518c1 = false;

    /* renamed from: d1 */
    public boolean f55519d1 = false;

    /* renamed from: e1 */
    public boolean f55520e1 = false;

    /* renamed from: f1 */
    public boolean f55521f1 = false;

    /* renamed from: g1 */
    public C19465u f55522g1 = new C19465u();

    /* renamed from: h1 */
    public int f55523h1 = -1;

    /* renamed from: i1 */
    public int f55524i1 = -1;

    /* renamed from: j1 */
    public boolean f55525j1 = false;

    /* renamed from: k1 */
    public long f55526k1 = 0;

    /* renamed from: l1 */
    public boolean f55527l1 = false;

    /* renamed from: m1 */
    public boolean f55528m1 = false;

    /* renamed from: n1 */
    public int f55529n1 = 0;

    /* renamed from: o1 */
    public re4 f55530o1 = null;

    /* renamed from: p1 */
    public String f55531p1 = null;

    /* renamed from: q1 */
    public C19614i0 f55532q1 = null;

    /* renamed from: r1 */
    public String f55533r1 = "";

    /* renamed from: s1 */
    public JSONObject f55534s1 = null;

    /* renamed from: t1 */
    public String f55535t1 = "";

    /* renamed from: u1 */
    public String f55536u1 = "";

    /* renamed from: v1 */
    public String f55537v1 = "";

    /* renamed from: w1 */
    public String f55538w1 = null;

    /* renamed from: x1 */
    public C22508lo3 f55539x1 = null;

    /* renamed from: A2 */
    public boolean mo25753A2() {
        return this.field_type == 637534257;
    }

    /* renamed from: B2 */
    public boolean mo25754B2() {
        return this.field_type == 285212721;
    }

    /* renamed from: C2 */
    public boolean mo25755C2() {
        return this.field_type == 318767153;
    }

    /* renamed from: D2 */
    public boolean mo25756D2() {
        int i = this.field_type;
        return i == 3 || i == 13 || i == 23 || i == 33 || i == 39;
    }

    /* renamed from: E2 */
    public boolean mo25757E2() {
        return this.field_type == 10100;
    }

    /* renamed from: F2 */
    public boolean mo25758F2() {
        return this.field_type == 620757041;
    }

    /* renamed from: G2 */
    public boolean mo25759G2() {
        return this.f55529n1 == 2;
    }

    /* renamed from: H2 */
    public boolean mo25760H2() {
        int i = this.field_type;
        return i == 1 || i == 11 || i == 21 || i == 31 || i == 36 || i == 1107296305;
    }

    /* renamed from: I2 */
    public void mo25761I2() {
        JSONObject p2 = mo25766p2();
        if (p2 != null && Util.isNullOrNil(this.f55535t1)) {
            try {
                this.f55535t1 = p2.optString("aid");
                this.f55537v1 = p2.optString("traceid");
                this.f55536u1 = p2.optString("path_type", "ad");
            } catch (Exception e) {
                Log.m105929w("MicroMsg.BizTimeLineInfo", "getAId ex %s", e.getMessage());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0022  */
    /* renamed from: J2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25762J2(te3.re4 r6) {
        /*
            r5 = this;
            r5.f55530o1 = r6
            r0 = 0
            r1 = 1
            r2 = 0
            if (r6 != 0) goto L_0x0009
        L_0x0007:
            r6 = r2
            goto L_0x001f
        L_0x0009:
            byte[] r6 = r6.toByteArray()     // Catch:{ IOException -> 0x000e }
            goto L_0x001f
        L_0x000e:
            r6 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r6 = r6.getMessage()
            r3[r0] = r6
            java.lang.String r6 = "MicroMsg.BizTimeLineInfo"
            java.lang.String r4 = "getTLRecCardBytes toByteArray ex %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r6, r4, r3)
            goto L_0x0007
        L_0x001f:
            if (r6 != 0) goto L_0x0022
            return
        L_0x0022:
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r0)
            r5.field_content = r6
            r5.f356047G = r2
            r5.f356057o = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C19623o0.mo25762J2(te3.re4):void");
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f55516y1;
    }

    /* renamed from: m2 */
    public boolean mo25763m2(int i) {
        return (i & this.field_bitFlag) != 0;
    }

    /* renamed from: n2 */
    public String mo25764n2() {
        if (!Util.isNullOrNil(this.f55535t1)) {
            return this.f55535t1;
        }
        mo25761I2();
        return this.f55535t1;
    }

    /* renamed from: o2 */
    public String mo25765o2() {
        if (!mo25753A2()) {
            return null;
        }
        if (!Util.isNullOrNil(this.f55533r1)) {
            return this.f55533r1;
        }
        JSONObject p2 = mo25766p2();
        if (p2 != null) {
            this.f55533r1 = p2.toString();
        }
        return this.f55533r1;
    }

    /* renamed from: p2 */
    public JSONObject mo25766p2() {
        if (!mo25753A2()) {
            return null;
        }
        JSONObject jSONObject = this.f55534s1;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject d = C19627t.f55586a.mo25830d(this.field_content);
        this.f55534s1 = d;
        return d;
    }

    /* renamed from: q2 */
    public long mo25767q2() {
        return (this.field_orderFlag & -4294967296L) >> 32;
    }

    /* renamed from: r2 */
    public String mo25768r2() {
        String str = this.f55531p1;
        if (str != null) {
            return str;
        }
        if (mo25759G2()) {
            this.f55531p1 = "recFeed:" + this.field_orderFlag;
        } else {
            boolean z = true;
            if (this.f55529n1 != 1) {
                z = false;
            }
            if (z) {
                this.f55531p1 = "newMsgLine";
            } else {
                this.f55531p1 = "msg:" + this.field_orderFlag;
            }
        }
        return this.f55531p1;
    }

    /* renamed from: s2 */
    public String mo25769s2() {
        if (!mo25758F2()) {
            return mo25768r2();
        }
        return this.field_msgId + "-" + this.field_recommendCardId;
    }

    /* renamed from: t2 */
    public String mo25770t2() {
        if (!Util.isNullOrNil(this.f55536u1)) {
            return this.f55536u1;
        }
        mo25761I2();
        return this.f55536u1;
    }

    /* renamed from: u2 */
    public C19614i0 mo25771u2() {
        C19614i0 i0Var = this.f55532q1;
        if (i0Var != null) {
            return i0Var;
        }
        C19614i0 a = C21290c.f60147a.mo33268a(this.field_content);
        this.f55532q1 = a;
        return a;
    }

    /* renamed from: v2 */
    public String mo25772v2() {
        C22508lo3 lo32;
        if (mo25759G2() && (lo32 = this.f55539x1) != null) {
            String str = this.f55538w1;
            if (str != null) {
                return str;
            }
            try {
                String str2 = new String(Base64.encode(lo32.toByteArray(), 2), StandardCharsets.UTF_8);
                this.f55538w1 = str2;
                return str2;
            } catch (IOException e) {
                Log.m105929w("MicroMsg.BizTimeLineInfo", "getRecFeedData ex %s", e.getMessage());
            }
        }
        return "";
    }

    /* renamed from: w2 */
    public me4 mo25773w2() {
        re4 x2 = mo25774x2();
        if (x2 == null) {
            return null;
        }
        return x2.f64515d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005e A[SYNTHETIC, Splitter:B:21:0x005e] */
    /* renamed from: x2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public te3.re4 mo25774x2() {
        /*
            r7 = this;
            boolean r0 = r7.mo25758F2()
            r1 = 0
            java.lang.String r2 = "MicroMsg.BizTimeLineInfo"
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x001b
            java.lang.Object[] r0 = new java.lang.Object[r3]
            long r5 = r7.field_msgId
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r0[r4] = r3
            java.lang.String r3 = "not RecommendCard，msgId = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r3, r0)
            return r1
        L_0x001b:
            byte[] r0 = r7.f356047G
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r0)
            if (r0 == 0) goto L_0x002c
            java.lang.String r0 = r7.field_content
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x002c
            return r1
        L_0x002c:
            te3.re4 r0 = r7.f55530o1
            if (r0 == 0) goto L_0x0031
            return r0
        L_0x0031:
            te3.re4 r0 = new te3.re4
            r0.<init>()
            r7.f55530o1 = r0
            java.lang.String r0 = r7.field_content
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x005b
            java.lang.String r0 = r7.field_content     // Catch:{ Exception -> 0x004d }
            byte[] r0 = android.util.Base64.decode(r0, r4)     // Catch:{ Exception -> 0x004d }
            te3.re4 r5 = r7.f55530o1     // Catch:{ Exception -> 0x004d }
            r5.parseFrom(r0)     // Catch:{ Exception -> 0x004d }
            r0 = 1
            goto L_0x005c
        L_0x004d:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r0 = r0.getMessage()
            r5[r4] = r0
            java.lang.String r0 = "[TRACE_BIZRECCARD] getTLRecCard parseFrom content ex %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r5)
        L_0x005b:
            r0 = 0
        L_0x005c:
            if (r0 != 0) goto L_0x0076
            te3.re4 r0 = r7.f55530o1     // Catch:{ Exception -> 0x0066 }
            byte[] r5 = r7.f356047G     // Catch:{ Exception -> 0x0066 }
            r0.parseFrom(r5)     // Catch:{ Exception -> 0x0066 }
            goto L_0x0076
        L_0x0066:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r0 = r0.getMessage()
            r3[r4] = r0
            java.lang.String r0 = "getTLRecCard parseFrom ex %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r3)
            r7.f55530o1 = r1
        L_0x0076:
            te3.re4 r0 = r7.f55530o1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C19623o0.mo25774x2():te3.re4");
    }

    /* renamed from: y2 */
    public String mo25775y2() {
        if (!Util.isNullOrNil(this.f55537v1)) {
            return this.f55537v1;
        }
        mo25761I2();
        return this.f55537v1;
    }

    /* renamed from: z2 */
    public long mo25776z2() {
        return (this.field_orderFlag & 4278190080L) >> 24;
    }
}
