package com.tencent.p014mm.contact;

import android.database.Cursor;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40010n1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import java.util.HashMap;
import p749xh.C53339k1;
import p823sg.C77710q;

/* renamed from: com.tencent.mm.contact.d */
public class C40294d extends C53339k1 {

    /* renamed from: T1 */
    public static IAutoDBItem.MAutoDBInfo f108318T1 = C53339k1.initAutoDBInfo(C40294d.class);

    /* renamed from: U1 */
    public static C40295a f108319U1 = null;

    /* renamed from: R1 */
    public long f108320R1;

    /* renamed from: S1 */
    public int f108321S1 = 0;

    /* renamed from: com.tencent.mm.contact.d$a */
    public interface C40295a {
    }

    public C40294d() {
        super.setUsername("");
        super.mo62878U2("");
        super.mo62882W2("");
        super.mo62884X2("");
        super.mo62857I2("");
        super.mo62860K2("");
        super.mo62864M2("");
        super.mo62862L2("");
        super.mo62872R2("");
        super.mo62896e3(0);
        super.mo62899f3("");
        super.mo62886Y2(0);
        super.setType(0);
        mo73961b3(0);
        super.mo62894d3(0);
        super.mo73957J2(0);
        super.mo62867O2("");
        this.f149500H = 0;
        this.f149522X = "";
        this.f149524Y = 0;
        this.f149503K = 0;
        this.f149504L = "";
        this.f149505M = "";
        this.f149506N = 0;
        this.f149507P = 0;
        this.f149508Q = "";
        this.f149510R = "";
        this.f149512S = 1;
        this.f149499G = 0;
        this.f149514T = 0;
        this.f149516U = "";
        this.f149518V = "";
        this.f149520W = "";
        this.f149526Z = 0;
        this.f149554x0 = "";
        this.f149545p0 = "";
        this.f149502J = 0;
        this.f149501I = "";
        this.f149556y0 = "";
        this.f149509Q0 = 0;
        this.f149517U0 = "";
        this.f149519V0 = "";
        this.f149521W0 = "";
        this.f149527Z0 = "";
        this.f149550u = true;
        mo73960Q2("");
        super.mo62880V2("");
        mo73962c3(0);
        super.mo62874S2("");
        this.f149528a1 = 0;
        this.f149550u = true;
        this.f108321S1 = 0;
    }

    /* renamed from: A2 */
    public int mo62845A2() {
        return mo62932t3() ? mo62901g3() : super.mo62845A2();
    }

    /* renamed from: A3 */
    public boolean mo62846A3() {
        return (getType() & 8388608) != 0;
    }

    /* renamed from: A4 */
    public void mo62847A4() {
        setType(getType() & -131073);
    }

    /* renamed from: B3 */
    public void mo62848B3(String str) {
        if (!Util.isEqual(this.f149527Z0, str)) {
            this.f149527Z0 = str;
            this.f149550u = true;
            mo62914l3();
        }
    }

    /* renamed from: B4 */
    public void mo62849B4() {
        setType(getType() & -262145);
    }

    /* renamed from: C3 */
    public void mo62850C3() {
        setType(getType() & Integer.MAX_VALUE);
    }

    /* renamed from: C4 */
    public void mo62851C4() {
        setType(getType() & -524289);
    }

    /* renamed from: D3 */
    public void mo62852D3(int i) {
        if (!Util.isEqual(this.f149511R0, i)) {
            this.f149511R0 = i;
            this.f149550u = true;
            mo62914l3();
        }
    }

    /* renamed from: E3 */
    public void mo62853E3() {
        setType(getType() | 8);
    }

    /* renamed from: F3 */
    public void mo62854F3() {
        setType(getType() | 32768);
    }

    /* renamed from: G3 */
    public void mo62855G3() {
        setType(getType() | 2);
    }

    /* renamed from: H3 */
    public void mo62856H3(long j) {
        if (!Util.isEqual(this.f149536f1, j)) {
            this.f149536f1 = j;
            this.f149550u = true;
            mo62914l3();
        }
    }

    /* renamed from: I2 */
    public void mo62857I2(String str) {
        if (!Util.isEqual(mo62913l2(), str)) {
            super.mo62857I2(str);
            mo62914l3();
        }
    }

    /* renamed from: I3 */
    public void mo62858I3(int i, int i2) {
        int m2 = (i & i2) | (mo73968m2() & (~i));
        if (!Util.isEqual(mo73968m2(), m2)) {
            super.mo73957J2(m2);
            mo62914l3();
        }
    }

    /* renamed from: J3 */
    public void mo62859J3(long j) {
        if (!Util.isEqual(this.f149538g1, j)) {
            this.f149538g1 = j;
            this.f149550u = true;
            mo62914l3();
        }
    }

    /* renamed from: K2 */
    public void mo62860K2(String str) {
        if (!Util.isEqual(mo73969n2(), str)) {
            super.mo62860K2(str);
            mo62914l3();
        }
    }

    /* renamed from: K3 */
    public void mo62861K3(int i) {
        if (!Util.isEqual(this.f149512S, i)) {
            this.f149512S = i;
            this.f149550u = true;
            mo62914l3();
        }
    }

    /* renamed from: L2 */
    public void mo62862L2(String str) {
        if (!Util.isEqual(mo73970o2(), str)) {
            super.mo62862L2(str);
            mo62914l3();
        }
    }

    /* renamed from: L3 */
    public void mo62863L3(int i) {
        if (!Util.isEqual(this.f149509Q0, i)) {
            this.f149509Q0 = i;
            this.f149550u = true;
            mo62914l3();
        }
    }

    /* renamed from: M2 */
    public void mo62864M2(String str) {
        if (!Util.isEqual(mo73971p2(), str)) {
            super.mo62864M2(str);
            mo62914l3();
        }
    }

    /* renamed from: M3 */
    public void mo62865M3(String str) {
        if (!Util.isEqual(getCity(), str)) {
            this.f149520W = str;
            this.f149550u = true;
            mo62914l3();
        }
    }

    /* renamed from: N3 */
    public void mo62866N3(int i) {
        if (!Util.isEqual(this.f149507P, i)) {
            this.f149507P = i;
            this.f149550u = true;
            mo62914l3();
        }
    }

    /* renamed from: O2 */
    public void mo62867O2(String str) {
        if (!Util.isEqual(mo73974r2(), str)) {
            super.mo62867O2(str);
            mo62914l3();
        }
    }

    /* renamed from: O3 */
    public void mo62868O3() {
        setType(getType() | 1);
    }

    /* renamed from: P2 */
    public void mo62869P2(int i) {
        if (!Util.isEqual(mo73975s2(), i)) {
            super.mo62869P2(i);
            mo62914l3();
        }
    }

    /* renamed from: P3 */
    public void mo62870P3(String str) {
        if (!Util.isEqual(this.f149522X, str)) {
            this.f149522X = str;
            this.f149550u = true;
            mo62914l3();
        }
    }

    /* renamed from: Q3 */
    public void mo62871Q3() {
        setType(getType() | 64);
    }

    /* renamed from: R2 */
    public void mo62872R2(String str) {
        if (!Util.isEqual(mo73977u2(), str)) {
            super.mo62872R2(str);
            mo62914l3();
        }
    }

    /* renamed from: R3 */
    public void mo62873R3(long j) {
        if (!Util.isEqual(this.f149502J, j)) {
            this.f149502J = j;
            this.f149550u = true;
            mo62914l3();
        }
    }

    /* renamed from: S2 */
    public void mo62874S2(String str) {
        if (!Util.isEqual(mo73978v2(), str)) {
            super.mo62874S2(str);
            mo62914l3();
        }
    }

    /* renamed from: S3 */
    public void mo62875S3(String str) {
        if (!Util.isEqual(this.f149501I, str)) {
            this.f149501I = str;
            this.f149550u = true;
            mo62914l3();
        }
    }

    /* renamed from: T2 */
    public void mo62876T2(byte[] bArr) {
        if (!Util.isEqual(mo73979w2(), bArr)) {
            super.mo62876T2(bArr);
            mo62914l3();
        }
    }

    /* renamed from: T3 */
    public void mo62877T3() {
        setType(getType() | 32);
    }

    /* renamed from: U2 */
    public void mo62878U2(String str) {
        if (!Util.isEqual(getNickname(), str)) {
            super.mo62878U2(str);
            mo62914l3();
        }
    }

    /* renamed from: U3 */
    public void mo62879U3(int i) {
        if (!Util.isEqual(this.f149499G, i)) {
            this.f149499G = i;
            this.f149550u = true;
            mo62914l3();
        }
    }

    /* renamed from: V2 */
    public void mo62880V2(String str) {
        if (!Util.isEqual(mo73980x2(), str)) {
            super.mo62880V2(str);
            mo62914l3();
        }
    }

    /* renamed from: V3 */
    public void mo62881V3(String str) {
        if (!Util.isEqual(this.f149517U0, str)) {
            this.f149517U0 = str;
            this.f149550u = true;
            mo62914l3();
        }
    }

    /* renamed from: W2 */
    public void mo62882W2(String str) {
        if (!Util.isEqual(mo62942y2(), str)) {
            super.mo62882W2(str);
            mo62914l3();
        }
    }

    /* renamed from: W3 */
    public void mo62883W3(String str) {
        if (!Util.isEqual(this.f149519V0, str)) {
            this.f149519V0 = str;
            this.f149550u = true;
            mo62914l3();
        }
    }

    /* renamed from: X2 */
    public void mo62884X2(String str) {
        if (!Util.isEqual(mo62945z2(), str)) {
            super.mo62884X2(str);
            mo62914l3();
        }
    }

    /* renamed from: X3 */
    public void mo62885X3(String str) {
        if (!Util.isEqual(this.f149521W0, str)) {
            this.f149521W0 = str;
            this.f149550u = true;
            mo62914l3();
        }
    }

    /* renamed from: Y2 */
    public void mo62886Y2(int i) {
        if (!Util.isEqual(mo62845A2(), i)) {
            super.mo62886Y2(i);
            mo62914l3();
        }
    }

    /* renamed from: Y3 */
    public void mo62887Y3() {
        setType(getType() | 512);
    }

    /* renamed from: Z2 */
    public void mo62888Z2(String str) {
        if (!Util.isEqual(mo73950B2(), str)) {
            super.mo62888Z2(str);
            mo62914l3();
        }
    }

    /* renamed from: Z3 */
    public void mo62889Z3(int i) {
        if (!Util.isEqual(this.f149514T, i)) {
            this.f149514T = i;
            this.f149550u = true;
            mo62914l3();
        }
    }

    /* renamed from: a3 */
    public void mo62890a3(String str) {
        if (!Util.isEqual(mo73958K(), str)) {
            super.mo62890a3(str);
            mo62914l3();
        }
    }

    /* renamed from: a4 */
    public void mo62891a4(String str) {
        if (!Util.isEqual(this.f149525Y0, str)) {
            this.f149525Y0 = str;
            this.f149550u = true;
            mo62914l3();
        }
    }

    /* renamed from: b4 */
    public void mo62892b4(String str) {
        if (!Util.isEqual(getProvince(), str)) {
            this.f149518V = str;
            this.f149550u = true;
            mo62914l3();
        }
    }

    /* renamed from: c4 */
    public void mo62893c4(String str) {
        if (!Util.isEqual(this.f149556y0, str)) {
            this.f149556y0 = str;
            this.f149550u = true;
            mo62914l3();
        }
    }

    public void convertFrom(Cursor cursor) {
        super.convertFrom(cursor);
        this.f108320R1 = this.systemRowid;
        super.mo62876T2((byte[]) null);
    }

    /* renamed from: d3 */
    public void mo62894d3(int i) {
        if (!Util.isEqual(mo73953E2(), i)) {
            super.mo62894d3(i);
            mo62914l3();
        }
    }

    /* renamed from: d4 */
    public void mo62895d4(String str) {
        if (!Util.isEqual(this.f149513S0, str)) {
            this.f149513S0 = str;
            this.f149550u = true;
            mo62914l3();
        }
    }

    /* renamed from: e3 */
    public void mo62896e3(int i) {
        if (!Util.isEqual(mo73955G2(), i)) {
            super.mo62896e3(i);
            mo62914l3();
        }
    }

    /* renamed from: e4 */
    public void mo62897e4(String str) {
        if (!Util.isEqual(this.f149515T0, str)) {
            this.f149515T0 = str;
            this.f149550u = true;
            mo62914l3();
        }
    }

    /* renamed from: f */
    public String mo62898f() {
        return (mo73969n2() == null || mo73969n2().trim().equals("")) ? mo62909j3() : mo73969n2();
    }

    /* renamed from: f3 */
    public void mo62899f3(String str) {
        if (!Util.isEqual(mo73956H2(), str)) {
            super.mo62899f3(str);
            mo62914l3();
        }
    }

    /* renamed from: f4 */
    public void mo62900f4(int i) {
        if (!Util.isEqual(this.f149500H, i)) {
            this.f149500H = i;
            this.f149550u = true;
            mo62914l3();
        }
    }

    /* renamed from: g3 */
    public int mo62901g3() {
        char c;
        if (mo73971p2() != null && !mo73971p2().equals("")) {
            c = mo73971p2().charAt(0);
        } else if (mo73970o2() != null && !mo73970o2().equals("")) {
            c = mo73970o2().charAt(0);
        } else if (mo62932t3()) {
            c = 'Y';
        } else if (super.mo62942y2() != null && !super.mo62942y2().equals("")) {
            c = super.mo62942y2().charAt(0);
        } else if (super.mo62945z2() == null || super.mo62945z2().equals("")) {
            boolean z = true;
            if (super.getNickname() != null && !super.getNickname().equals("")) {
                char charAt = super.getNickname().charAt(0);
                if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
                    c = super.getNickname().charAt(0);
                }
            }
            if (getUsername() != null && !getUsername().equals("")) {
                char charAt2 = getUsername().charAt(0);
                if ((charAt2 < 'A' || charAt2 > 'Z') && (charAt2 < 'a' || charAt2 > 'z')) {
                    z = false;
                }
                if (z) {
                    c = getUsername().charAt(0);
                }
            }
            c = ' ';
        } else {
            c = super.mo62945z2().charAt(0);
        }
        if (c >= 'a' && c <= 'z') {
            return (char) (c - ' ');
        }
        if (c < 'A' || c > 'Z') {
            return 123;
        }
        return c;
    }

    /* renamed from: g4 */
    public void mo62902g4(String str) {
        if (!Util.isEqual(this.f149516U, str)) {
            this.f149516U = str;
            this.f149550u = true;
            mo62914l3();
        }
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f108318T1;
    }

    public String getNickname() {
        return mo62932t3() ? MMApplicationContext.getContext().getString(C0966R.string.mb8) : super.getNickname();
    }

    public int getSource() {
        return this.f149526Z % 1000000;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
    /* renamed from: h3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo62905h3() {
        /*
            r5 = this;
            java.lang.String r0 = r5.getUsername()
            java.lang.String r1 = com.tencent.p014mm.storage.C72994y1.f212832a
            java.lang.String r1 = "MicroMsg.ConstantsStorage"
            if (r0 == 0) goto L_0x0022
            int r2 = r0.length()
            if (r2 > 0) goto L_0x0011
            goto L_0x0022
        L_0x0011:
            java.lang.String r2 = "@"
            boolean r3 = r0.contains(r2)
            if (r3 == 0) goto L_0x0027
            int r2 = r0.indexOf(r2)
            java.lang.String r2 = r0.substring(r2)
            goto L_0x0029
        L_0x0022:
            java.lang.String r2 = "calculateReverseUserName failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
        L_0x0027:
            java.lang.String r2 = ""
        L_0x0029:
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r2
            r4 = 1
            r3[r4] = r0
            java.lang.String r0 = "calculateUserNameFlag key:%s, username:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r0, r3)
            java.util.HashMap<java.lang.String, java.lang.Long> r0 = com.tencent.p014mm.storage.C72994y1.f212836e
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x004c
            java.util.HashMap<java.lang.String, java.lang.Long> r0 = com.tencent.p014mm.storage.C72994y1.f212836e
            java.lang.Object r0 = r0.get(r2)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            goto L_0x0058
        L_0x004c:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r0 != 0) goto L_0x0056
            r0 = 33554432(0x2000000, double:1.6578092E-316)
            goto L_0x0058
        L_0x0056:
            r0 = 0
        L_0x0058:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.contact.C40294d.mo62905h3():long");
    }

    /* renamed from: h4 */
    public void mo62906h4() {
        setType(getType() | 256);
    }

    /* renamed from: i3 */
    public int mo62907i3() {
        return (int) this.f108320R1;
    }

    /* renamed from: i4 */
    public void mo62908i4() {
        setType(getType() | 1048576);
    }

    /* renamed from: j3 */
    public String mo62909j3() {
        C40295a aVar = f108319U1;
        String a = aVar != null ? ((C40010n1) aVar).mo62699a(getUsername()) : null;
        return a != null ? a : (getNickname() == null || getNickname().length() <= 0) ? mo62911k3() : getNickname();
    }

    /* renamed from: j4 */
    public void mo62910j4() {
        setType(getType() | 8388608);
    }

    /* renamed from: k3 */
    public String mo62911k3() {
        String l2 = mo62913l2();
        if (!Util.isNullOrNil(l2)) {
            return l2;
        }
        String username = getUsername();
        if (username == null) {
            username = null;
        } else if (username.toLowerCase().endsWith("@t.qq.com")) {
            username = "@" + username.replace("@t.qq.com", "");
        } else if (username.toLowerCase().endsWith("@qqim")) {
            username = username.replace("@qqim", "");
            long longValue = Long.valueOf(username).longValue();
            if (longValue < 0) {
                username = new C77710q(longValue).toString();
            }
        } else if (username.toLowerCase().endsWith("@stranger")) {
            username = " ";
        }
        return (username == null || username.length() == 0) ? getUsername() : username;
    }

    /* renamed from: k4 */
    public void mo62912k4(int i) {
        if (!Util.isEqual(this.f149526Z, i)) {
            this.f149526Z = i;
            this.f149550u = true;
            mo62914l3();
        }
    }

    /* renamed from: l2 */
    public String mo62913l2() {
        if (mo62932t3()) {
            return "";
        }
        C40295a aVar = f108319U1;
        String str = null;
        if (aVar != null) {
            String username = getUsername();
            C40010n1 n1Var = (C40010n1) aVar;
            if (((HashMap) n1Var.f107258b).containsKey(username)) {
                str = n1Var.f107259c.getString(((Integer) ((HashMap) n1Var.f107258b).get(username)).intValue());
            }
        }
        return str == null ? super.mo62913l2() : str;
    }

    /* renamed from: l3 */
    public final int mo62914l3() {
        int i = this.f108321S1 + 1;
        this.f108321S1 = i;
        return i;
    }

    /* renamed from: l4 */
    public void mo62915l4() {
        setType(getType() | 131072);
    }

    /* renamed from: m3 */
    public boolean mo62916m3() {
        return (mo73953E2() & 8) > 0;
    }

    /* renamed from: m4 */
    public void mo62917m4() {
        setType(getType() | 262144);
    }

    /* renamed from: n3 */
    public boolean mo62918n3() {
        return this.f149511R0 == 1;
    }

    /* renamed from: n4 */
    public void mo62919n4(int i) {
        if (!Util.isEqual(getType(), i)) {
            super.setType(i);
            mo62914l3();
        }
    }

    /* renamed from: o3 */
    public boolean mo62920o3() {
        return (getType() & 8) != 0;
    }

    /* renamed from: o4 */
    public void mo62921o4(int i) {
        if (!Util.isEqual(this.f149503K, i)) {
            this.f149503K = i;
            this.f149550u = true;
            mo62914l3();
        }
    }

    /* renamed from: p3 */
    public boolean mo62922p3() {
        return (getType() & 32768) != 0;
    }

    /* renamed from: p4 */
    public void mo62923p4(long j) {
        if (!Util.isEqual(mo73952D2(), j)) {
            mo73962c3(j);
            mo62914l3();
        }
    }

    /* renamed from: q3 */
    public boolean mo62924q3() {
        return (getType() & 4) != 0;
    }

    /* renamed from: q4 */
    public void mo62925q4(String str) {
        if (!Util.isEqual(this.f149554x0, str)) {
            this.f149554x0 = str;
            this.f149550u = true;
            mo62914l3();
        }
    }

    /* renamed from: r4 */
    public void mo62926r4() {
        setType(getType() | 524288);
    }

    /* renamed from: s3 */
    public boolean mo62927s3() {
        return (getType() & 1) != 0;
    }

    /* renamed from: s4 */
    public void mo62928s4(String str) {
        if (!Util.isEqual(this.f149545p0, str)) {
            this.f149545p0 = str;
            this.f149550u = true;
            mo62914l3();
        }
    }

    public void setFromType(int i) {
        if (!Util.isEqual(this.f149524Y, i)) {
            this.f149524Y = i;
            this.f149550u = true;
            mo62914l3();
        }
    }

    public void setType(int i) {
        if (!Util.isEqual(getType(), i)) {
            Log.m105925i("MicroMsg.RContact", "setType %s old:%s new:%s", Util.nullAs(getUsername(), "null"), Integer.valueOf(getType()), Integer.valueOf(i));
            super.setType(i);
            mo62914l3();
        }
    }

    public void setUsername(String str) {
        if (!Util.isEqual(getUsername(), str)) {
            super.setUsername(str);
            mo62914l3();
        }
        mo62923p4(mo62905h3());
    }

    /* renamed from: t3 */
    public boolean mo62932t3() {
        return mo73975s2() == 1;
    }

    /* renamed from: t4 */
    public void mo62933t4() {
        setType(getType() & -9);
    }

    /* renamed from: u3 */
    public boolean mo62934u3() {
        return (getType() & 64) != 0;
    }

    /* renamed from: u4 */
    public void mo62935u4() {
        Log.m105929w("MicroMsg.RContact", "unSetContact!! user:%s oldType:%d [%s]", getUsername(), Integer.valueOf(getType()), Util.getStack());
        setType(getType() & -2);
    }

    /* renamed from: v3 */
    public boolean mo62936v3() {
        return (getType() & 32) != 0;
    }

    /* renamed from: v4 */
    public void mo62937v4() {
        setType(getType() & -65);
    }

    /* renamed from: w3 */
    public boolean mo62938w3() {
        return (getType() & 268435456) != 0;
    }

    /* renamed from: w4 */
    public void mo62939w4() {
        setType(getType() & -513);
    }

    /* renamed from: x3 */
    public boolean mo62940x3() {
        return (getType() & 2048) != 0;
    }

    /* renamed from: x4 */
    public void mo62941x4() {
        setType(getType() | Integer.MIN_VALUE);
    }

    /* renamed from: y2 */
    public String mo62942y2() {
        return mo62932t3() ? "YZXDWXYH" : (super.mo62942y2() == null || super.mo62942y2().length() < 0) ? mo62945z2() : super.mo62942y2();
    }

    /* renamed from: y3 */
    public boolean mo62943y3() {
        return (getType() & 256) != 0;
    }

    /* renamed from: y4 */
    public void mo62944y4() {
        setType(getType() & -257);
    }

    /* renamed from: z2 */
    public String mo62945z2() {
        return mo62932t3() ? "YIZHUXIAODEWEIXINYONGHU" : (super.mo62945z2() == null || super.mo62945z2().length() < 0) ? getNickname() : super.mo62945z2();
    }

    /* renamed from: z3 */
    public boolean mo62946z3() {
        return (getType() & 65536) != 0;
    }

    /* renamed from: z4 */
    public void mo62947z4() {
        setType(getType() & -1048577);
    }
}
