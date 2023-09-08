package lz2;

import android.util.Base64;
import az2.C39674e;
import b03.C67129e;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p606mm.C99933h;
import pe3.C47465a;
import rx3.C13598b0;
import su0.C13781a;
import tz2.C78120g;
import uz2.C52678e0;
import uz2.C52690j;
import uz2.C52693k;
import uz2.C52718u;
import uz2.C78317u1;
import uz2.C78318v1;
import vz2.C78500c;

/* renamed from: lz2.b */
public final class C76738b extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f224493d;

    /* renamed from: e */
    public final C47350c f224494e;

    /* renamed from: f */
    public C52690j f224495f;

    public C76738b() {
        this((C78317u1) null);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f224493d = nVar;
        return dispatch(gVar, this.f224494e, this);
    }

    public int getType() {
        return 5293;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2;
        int i4 = i2;
        int i5 = i3;
        String str3 = str;
        C87412m.m108594g(uVar, "rr");
        boolean z = true;
        Log.m105925i("MicroMsg.TextStatus.NetSceneModTextStatus", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str3);
        if (i4 == 0 && i5 == 0) {
            C47465a aVar = this.f224494e.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.ModTextStatusResp");
            C52693k kVar = (C52693k) aVar;
            String str4 = kVar.f147149d;
            String str5 = kVar.f147150e;
            if (!(str4 == null || str4.length() == 0)) {
                if (!(str5 == null || str5.length() == 0)) {
                    z = false;
                }
                if (!z) {
                    C52718u uVar2 = new C52718u();
                    uVar2.parseFrom(Base64.decode(kVar.f147150e, 0));
                    C78120g gVar = C78120g.f228929a;
                    C78317u1 a = gVar.mo108101a();
                    C13598b0 b0Var = null;
                    if (a != null) {
                        C39674e eVar = C39674e.f106452d;
                        String a2 = C13781a.m13082a();
                        C87412m.m108593f(a2, "username()");
                        C87412m.m108593f(str4, "statusID");
                        C78317u1 u1Var = a;
                        String str6 = "onSceneEnd mod statusId:";
                        long X0 = C39674e.m42303X0(eVar, a2, str4, uVar2, 4, (String) null, 0, 48, (Object) null);
                        MultiProcessMMKV b = gVar.mo108102b();
                        if (b != null) {
                            b.clearAll();
                        }
                        String str7 = u1Var.f229458q;
                        C52678e0 e0Var = uVar2.f147238g;
                        String str8 = e0Var != null ? e0Var.f147087d : null;
                        if (str8 == null) {
                            str8 = "";
                        }
                        String str9 = kVar.f147149d;
                        if (str7 != null) {
                            ((C99933h) C86312j.m106911c(C99933h.class)).mo84406lr(8, "StatusTextPost_" + str7, C78318v1.class, new C78500c(str7, 1L, str8, str9));
                            b0Var = C13598b0.f38549a;
                        }
                        if (b0Var == null) {
                            Log.m105924i("MicroMsg.TextStatus.tsReport", "postReport: cliPostID is null");
                        }
                        StringBuilder sb = new StringBuilder();
                        str2 = str6;
                        sb.append(str2);
                        sb.append(kVar.f147149d);
                        sb.append(", expireTime:");
                        sb.append(uVar2.f147246r);
                        sb.append(" rowId:");
                        sb.append(X0);
                        sb.append(" extInfo:");
                        sb.append(C67129e.m79387b(uVar2));
                        Log.m105924i("MicroMsg.TextStatus.NetSceneModTextStatus", sb.toString());
                        b0Var = C13598b0.f38549a;
                    } else {
                        str2 = "onSceneEnd mod statusId:";
                    }
                    if (b0Var == null) {
                        Log.m105928w("MicroMsg.TextStatus.NetSceneModTextStatus", str2 + kVar.f147149d + ", this is deleted");
                    }
                }
            }
        }
        C11385n nVar = this.f224493d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i5, str3, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0034, code lost:
        r2 = r6.f229448d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C76738b(uz2.C78317u1 r6) {
        /*
            r5 = this;
            r5.<init>()
            ob0.c$b r0 = new ob0.c$b
            r0.<init>()
            r1 = 5293(0x14ad, float:7.417E-42)
            r0.f127069d = r1
            java.lang.String r1 = "/cgi-bin/micromsg-bin/modtextstatus"
            r0.f127068c = r1
            uz2.j r1 = new uz2.j
            r1.<init>()
            r0.f127066a = r1
            uz2.k r1 = new uz2.k
            r1.<init>()
            r0.f127067b = r1
            ob0.c r0 = r0.mo72403a()
            r5.f224494e = r0
            ob0.c$c r0 = r0.f127055a
            pe3.a r0 = r0.f127080a
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.ModTextStatusReq"
            gy3.C87412m.m108592e(r0, r1)
            uz2.j r0 = (uz2.C52690j) r0
            r5.f224495f = r0
            r1 = 0
            if (r6 == 0) goto L_0x003d
            uz2.u r2 = r6.f229448d
            if (r2 == 0) goto L_0x003d
            byte[] r2 = r2.toByteArray()
            goto L_0x003e
        L_0x003d:
            r2 = r1
        L_0x003e:
            r3 = 2
            byte[] r2 = android.util.Base64.encode(r2, r3)
            java.lang.String r3 = "encode(postInfo?.textSta…eArray(), Base64.NO_WRAP)"
            gy3.C87412m.m108593f(r2, r3)
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r4 = "UTF_8"
            gy3.C87412m.m108593f(r3, r4)
            java.lang.String r4 = new java.lang.String
            r4.<init>(r2, r3)
            r0.f147141d = r4
            uz2.j r0 = r5.f224495f
            if (r6 == 0) goto L_0x005d
            java.util.LinkedList<java.lang.String> r2 = r6.f229449e
            goto L_0x005e
        L_0x005d:
            r2 = r1
        L_0x005e:
            r0.f147142e = r2
            if (r6 == 0) goto L_0x0065
            java.lang.String r2 = r6.f229459r
            goto L_0x0066
        L_0x0065:
            r2 = r1
        L_0x0066:
            r0.f147143f = r2
            if (r6 == 0) goto L_0x006d
            long r2 = r6.f229461t
            goto L_0x006f
        L_0x006d:
            r2 = 0
        L_0x006f:
            r0.f147144g = r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "rowId:"
            r0.append(r2)
            if (r6 == 0) goto L_0x0084
            long r2 = r6.f229455n
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x0085
        L_0x0084:
            r2 = r1
        L_0x0085:
            r0.append(r2)
            java.lang.String r2 = " text:"
            r0.append(r2)
            if (r6 == 0) goto L_0x0096
            uz2.u r2 = r6.f229448d
            if (r2 == 0) goto L_0x0096
            java.lang.String r2 = r2.f147231J
            goto L_0x0097
        L_0x0096:
            r2 = r1
        L_0x0097:
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r2)
            r0.append(r2)
            java.lang.String r2 = " statusId:"
            r0.append(r2)
            uz2.j r2 = r5.f224495f
            java.lang.String r2 = r2.f147143f
            r0.append(r2)
            java.lang.String r2 = " option:"
            r0.append(r2)
            if (r6 == 0) goto L_0x00bc
            uz2.u r2 = r6.f229448d
            if (r2 == 0) goto L_0x00bc
            long r2 = r2.f147249u
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x00bd
        L_0x00bc:
            r2 = r1
        L_0x00bd:
            r0.append(r2)
            java.lang.String r2 = " request.mod_status_option = :"
            r0.append(r2)
            uz2.j r2 = r5.f224495f
            long r2 = r2.f147144g
            r0.append(r2)
            java.lang.String r2 = " extInfo:"
            r0.append(r2)
            if (r6 == 0) goto L_0x00db
            uz2.u r6 = r6.f229448d
            if (r6 == 0) goto L_0x00db
            java.lang.String r1 = b03.C67129e.m79387b(r6)
        L_0x00db:
            r0.append(r1)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "MicroMsg.TextStatus.NetSceneModTextStatus"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lz2.C76738b.<init>(uz2.u1):void");
    }
}
