package e21;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C118447nw2;
import te3.C118466sp;
import te3.C51136rp;

/* renamed from: e21.h0 */
public class C116641h0 extends C75123k0 {

    /* renamed from: d */
    public C47350c f349747d;

    /* renamed from: e */
    public C118466sp f349748e;

    /* renamed from: f */
    public C11385n f349749f;

    public C116641h0() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51136rp();
        bVar.f127067b = new C118466sp();
        bVar.f127069d = 5174;
        bVar.f127068c = "/cgi-bin/mmpay-bin/busif2fgetqrcodev2";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f349747d = a;
        C51136rp rpVar = (C51136rp) a.f127055a.f127080a;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f349749f = nVar;
        return dispatch(gVar, this.f349747d, this);
    }

    public int getType() {
        return 5174;
    }

    /* renamed from: j1 */
    public final JSONObject mo180643j1(C118447nw2 nw22) {
        if (!(nw22 != null && !Util.isNullOrNil(nw22.f354150e))) {
            Log.m105928w("MicroMsg.NetSceneF2fQrcode", "empty menu item");
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", nw22.f354149d);
            jSONObject.put("wording", nw22.f354150e);
            jSONObject.put("url", nw22.f354151f);
            jSONObject.put("waapp_username", nw22.f354152g);
            jSONObject.put("waapp_path", nw22.f354153h);
            return jSONObject;
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.NetSceneF2fQrcode", e, "", new Object[0]);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r5, int r6, int r7, java.lang.String r8, com.tencent.p014mm.network.C114799u r9, byte[] r10, long r11) {
        /*
            r4 = this;
            ob0.c r9 = (ob0.C47350c) r9
            ob0.c$d r5 = r9.f127056b
            pe3.a r5 = r5.f127083a
            te3.sp r5 = (te3.C118466sp) r5
            r4.f349748e = r5
            r5 = 3
            java.lang.Object[] r9 = new java.lang.Object[r5]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            r11 = 0
            r9[r11] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r12 = 1
            r9[r12] = r10
            r10 = 2
            r9[r10] = r8
            java.lang.String r0 = "MicroMsg.NetSceneF2fQrcode"
            java.lang.String r1 = "errType: %d, errCode: %d, errMsg: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r9)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            te3.sp r9 = r4.f349748e
            java.lang.String r1 = r9.f354375f
            r5[r11] = r1
            java.lang.String r1 = r9.f354377h
            r5[r12] = r1
            java.lang.String r9 = r9.f354380n
            r5[r10] = r9
            java.lang.String r9 = "payurl: %s, true_name: %s, bottom_icon_url: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r9, r5)
            te3.sp r5 = r4.f349748e
            java.lang.String r5 = r5.f354375f
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x0059
            f40.C86709a0.m107528h()
            f40.o r5 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r5 = r5.mo121142i()
            com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_F2F_COLLECT_PAY_URL_STRING_SYNC
            te3.sp r10 = r4.f349748e
            java.lang.String r10 = r10.f354375f
            r5.mo119677K(r9, r10)
        L_0x0059:
            f40.C86709a0.m107528h()
            f40.o r5 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r5 = r5.mo121142i()
            com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_F2F_COLLECT_PAY_URL_ERROR_LEVEL_INT_SYNC
            te3.sp r10 = r4.f349748e
            int r10 = r10.f354376g
            int r10 = com.tencent.p014mm.wallet_core.model.C75157y0.m90138a(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r5.mo119677K(r9, r10)
            te3.sp r5 = r4.f349748e
            java.lang.String r5 = r5.f354377h
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x0093
            f40.C86709a0.m107528h()
            f40.o r5 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r5 = r5.mo121142i()
            com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_F2F_COLLECT_TRUE_NAME_STRING_SYNC
            te3.sp r10 = r4.f349748e
            java.lang.String r10 = r10.f354377h
            r5.mo119677K(r9, r10)
        L_0x0093:
            f40.C86709a0.m107528h()
            f40.o r5 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r5 = r5.mo121142i()
            com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_F2F_COLLECT_BOTTOM_LEFT_ICON_URL_STRING_SYNC
            te3.sp r10 = r4.f349748e
            java.lang.String r10 = r10.f354380n
            r5.mo119677K(r9, r10)
            te3.sp r5 = r4.f349748e
            te3.nw2 r5 = r5.f354379j
            org.json.JSONObject r5 = r4.mo180643j1(r5)
            te3.sp r9 = r4.f349748e
            java.util.LinkedList<te3.nw2> r9 = r9.f354378i
            org.json.JSONArray r10 = new org.json.JSONArray
            r10.<init>()
            r1 = 0
            if (r9 == 0) goto L_0x00e4
            int r2 = r9.size()
            if (r2 != 0) goto L_0x00c2
            goto L_0x00e4
        L_0x00c2:
            r2 = 0
        L_0x00c3:
            int r3 = r9.size()     // Catch:{ JSONException -> 0x00db }
            if (r2 >= r3) goto L_0x00ea
            java.lang.Object r3 = r9.get(r2)     // Catch:{ JSONException -> 0x00db }
            te3.nw2 r3 = (te3.C118447nw2) r3     // Catch:{ JSONException -> 0x00db }
            org.json.JSONObject r3 = r4.mo180643j1(r3)     // Catch:{ JSONException -> 0x00db }
            if (r3 == 0) goto L_0x00d8
            r10.put(r2, r3)     // Catch:{ JSONException -> 0x00db }
        L_0x00d8:
            int r2 = r2 + 1
            goto L_0x00c3
        L_0x00db:
            r9 = move-exception
            java.lang.Object[] r10 = new java.lang.Object[r11]
            java.lang.String r2 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r9, r2, r10)
            goto L_0x00e9
        L_0x00e4:
            java.lang.String r9 = "empty menu items"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r9)
        L_0x00e9:
            r10 = r1
        L_0x00ea:
            if (r5 == 0) goto L_0x010d
            java.lang.Object[] r9 = new java.lang.Object[r12]
            java.lang.String r1 = r5.toString()
            r9[r11] = r1
            java.lang.String r1 = "bottom: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r1, r9)
            f40.C86709a0.m107528h()
            f40.o r9 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r9 = r9.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_F2F_COLLECT_BOTTOM_MENU_STRING_SYNC
            java.lang.String r5 = r5.toString()
            r9.mo119677K(r1, r5)
        L_0x010d:
            if (r10 == 0) goto L_0x0131
            java.lang.Object[] r5 = new java.lang.Object[r12]
            java.lang.String r9 = r10.toString()
            r5[r11] = r9
            java.lang.String r9 = "upright: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r9, r5)
            f40.C86709a0.m107528h()
            f40.o r5 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r5 = r5.mo121142i()
            com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_F2F_COLLECT_UPRIGHT_MENU_STRING_SYNC
            java.lang.String r10 = r10.toString()
            r5.mo119677K(r9, r10)
        L_0x0131:
            ob0.n r5 = r4.f349749f
            if (r5 == 0) goto L_0x0138
            r5.onSceneEnd(r6, r7, r8, r4)
        L_0x0138:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e21.C116641h0.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[], long):void");
    }
}
