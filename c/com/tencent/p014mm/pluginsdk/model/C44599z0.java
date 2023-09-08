package com.tencent.p014mm.pluginsdk.model;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.pluginsdk.model.app.C44549d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C47350c;
import sf0.C48374j0;
import te3.C48980cb2;
import te3.C49120db2;
import te3.C51163rv3;

/* renamed from: com.tencent.mm.pluginsdk.model.z0 */
public class C44599z0 extends C44549d1 {

    /* renamed from: e */
    public String f120913e;

    public C44599z0(String str, LinkedList<String> linkedList) {
        int i = 0;
        Log.m105925i("MicroMsg.NetSceneGetUserInfoInApp", "appID: %s", str);
        this.f120913e = str;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48980cb2();
        bVar.f127067b = new C49120db2();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getuserinfoinapp";
        bVar.f127069d = 452;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f120809d = a;
        C48980cb2 cb22 = (C48980cb2) a.f127055a.f127080a;
        cb22.f131619d = str;
        LinkedList<C51163rv3> linkedList2 = new LinkedList<>();
        if (linkedList != null) {
            Iterator<String> it = linkedList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!Util.isNullOrNil(next)) {
                    linkedList2.add(C48374j0.m53720i(next));
                }
            }
        }
        cb22.f131621f = linkedList2;
        cb22.f131620e = linkedList != null ? linkedList.size() : i;
    }

    /* renamed from: a */
    public void mo69337a(byte[] bArr) {
        if (bArr == null) {
            Log.m105920e("MicroMsg.NetSceneGetUserInfoInApp", "buf is null");
            return;
        }
        try {
            this.f120809d.f127056b.fromProtoBuf(bArr);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.NetSceneGetUserInfoInApp", e.getMessage());
            Log.printErrStackTrace("MicroMsg.NetSceneGetUserInfoInApp", e, "", new Object[0]);
        }
    }

    /* renamed from: b */
    public int mo69338b() {
        return 14;
    }

    /* renamed from: c */
    public byte[] mo69339c() {
        try {
            return ((C47350c.C47353c) this.f120809d.getReqObj()).toProtoBuf();
        } catch (Exception e) {
            Log.m105920e("MicroMsg.NetSceneGetUserInfoInApp", e.getMessage());
            Log.printErrStackTrace("MicroMsg.NetSceneGetUserInfoInApp", e, "", new Object[0]);
            return null;
        }
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneGetUserInfoInApp", "errType = " + i2 + ", errCode = " + i3);
        if (i2 != 0 || i3 != 0) {
            Log.m105920e("MicroMsg.NetSceneGetUserInfoInApp", "errType = " + i2 + ", errCode = " + i3);
        }
    }
}
