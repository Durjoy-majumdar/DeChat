package com.tencent.p014mm.message;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import p1081gi.C98121d;

/* renamed from: com.tencent.mm.message.k */
public class C55268k extends C68066g {

    /* renamed from: b */
    public int f157426b = 0;

    /* renamed from: c */
    public String f157427c;

    /* renamed from: d */
    public String f157428d;

    /* renamed from: a */
    public C68066g mo7615a() {
        return new C55268k();
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
    }

    /* renamed from: d */
    public void mo7617d(Map<String, String> map, C68070l.C68072b bVar) {
        int i = bVar.f195582i;
        if (i == 2000 || i == 2011) {
            this.f157426b = Util.getInt(map.get(".msg.appmsg.wcpayinfo.has_transfer_address"), 0);
            this.f157427c = Util.nullAs(map.get(".msg.appmsg.wcpayinfo.receiver_username"), "");
            this.f157428d = Util.nullAs(map.get(".msg.appmsg.wcpayinfo.payer_username"), "");
            Log.m105925i("MicroMsg.AppContentTransferMsgPiece", "hasTransferAddress: %s", Integer.valueOf(this.f157426b));
        }
    }
}
