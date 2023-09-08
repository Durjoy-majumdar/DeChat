package je0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49810i73;
import te3.C51195s3;
import te3.C51336t3;
import te3.C51487u3;

/* renamed from: je0.f */
public final class C46473f extends C117747y implements C1311n {

    /* renamed from: d */
    public int f125203d;

    /* renamed from: e */
    public String f125204e;

    /* renamed from: f */
    public C11385n f125205f;

    /* renamed from: g */
    public C47350c f125206g;

    public C46473f(String str, C51195s3 s3Var, byte[] bArr) {
        C87412m.m108594g(s3Var, "addContactContext");
        String str2 = "";
        this.f125204e = str2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51336t3();
        bVar.f127067b = new C51487u3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/addopenimkefucontact";
        bVar.f127069d = 6849;
        C47350c a = bVar.mo72403a();
        this.f125206g = a;
        this.f125204e = str != null ? str : str2;
        C51336t3 t3Var = (C51336t3) a.f127055a.f127080a;
        if (t3Var != null) {
            t3Var.f141912d = str;
        }
        if (t3Var != null) {
            t3Var.f141913e = s3Var;
        }
        if (bArr != null) {
            if ((!(bArr.length == 0)) && t3Var != null) {
                t3Var.f141914f = C89349b.m111674a(bArr);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("alvinluo addOpenImKefuContact username: ");
        sb.append(str);
        sb.append(", url: ");
        sb.append(s3Var.f141285d);
        sb.append(", ticket: ");
        sb.append(s3Var.f141287f);
        sb.append(", scene: ");
        C49810i73 i732 = s3Var.f141288g;
        String str3 = null;
        sb.append(i732 != null ? Integer.valueOf(i732.f135154d) : null);
        sb.append(", entityId: ");
        C49810i73 i733 = s3Var.f141288g;
        sb.append(i733 != null ? i733.f135155e : str3);
        sb.append(" spamContext:");
        sb.append(bArr);
        Log.m105924i("MicroMsg.NetSceneAddOpenIMKefuContact", sb.toString());
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125205f = nVar;
        return dispatch(gVar, this.f125206g, this);
    }

    public int getType() {
        return 6849;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0096  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r6, int r7, int r8, java.lang.String r9, com.tencent.p014mm.network.C114799u r10, byte[] r11) {
        /*
            r5 = this;
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LIVE_KEFU_ENC_USERNAME_STRING_SYNC
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "alvinluo addOpenImKefuContact onGYNetEnd errType: "
            r10.append(r11)
            r10.append(r7)
            java.lang.String r11 = ", errCode: "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r11 = ", errMsg: "
            r10.append(r11)
            r10.append(r9)
            java.lang.String r11 = ", type: "
            r10.append(r11)
            r11 = 6849(0x1ac1, float:9.597E-42)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "MicroMsg.NetSceneAddOpenIMKefuContact"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            if (r7 != 0) goto L_0x00a3
            if (r8 == 0) goto L_0x0038
            goto L_0x00a3
        L_0x0038:
            ob0.c r10 = r5.f125206g
            r0 = 0
            if (r10 == 0) goto L_0x0042
            ob0.c$d r10 = r10.f127056b
            pe3.a r10 = r10.f127083a
            goto L_0x0043
        L_0x0042:
            r10 = r0
        L_0x0043:
            te3.u3 r10 = (te3.C51487u3) r10
            r1 = 0
            if (r10 == 0) goto L_0x0081
            te3.h73 r2 = r10.f142573e
            if (r2 == 0) goto L_0x0081
            java.lang.String r2 = r2.f134476d
            if (r2 == 0) goto L_0x0081
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0058
            r3 = 1
            goto L_0x0059
        L_0x0058:
            r3 = 0
        L_0x0059:
            if (r3 == 0) goto L_0x005c
            goto L_0x005d
        L_0x005c:
            r2 = r0
        L_0x005d:
            if (r2 == 0) goto L_0x0081
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()
            r3.mo119677K(r6, r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "NetSceneAddOpenIMKefuContact encUserName = "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0082
        L_0x0081:
            r2 = r0
        L_0x0082:
            if (r2 != 0) goto L_0x0094
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            r2.mo119677K(r6, r0)
            java.lang.String r6 = "NetSceneAddOpenIMKefuContact encUserName is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r6)
        L_0x0094:
            if (r10 == 0) goto L_0x0098
            int r1 = r10.f142572d
        L_0x0098:
            r5.f125203d = r1
            ob0.n r6 = r5.f125205f
            gy3.C87412m.m108591d(r6)
            r6.onSceneEnd(r7, r8, r9, r5)
            return
        L_0x00a3:
            ob0.n r6 = r5.f125205f
            gy3.C87412m.m108591d(r6)
            r6.onSceneEnd(r7, r8, r9, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je0.C46473f.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }
}
