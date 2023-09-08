package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.luckymoney.model.C69251n1;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import ob0.C47350c;
import te3.C51018qv3;
import te3.C64727tg2;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.p0 */
public class C56848p0 implements C69251n1.C69252a {

    /* renamed from: a */
    public final /* synthetic */ boolean f162882a;

    /* renamed from: b */
    public final /* synthetic */ String f162883b;

    public C56848p0(boolean z, String str) {
        this.f162882a = z;
        this.f162883b = str;
    }

    /* renamed from: a */
    public int mo80266a(C47350c cVar, C1311n nVar) {
        String str;
        C64727tg2 tg22 = (C64727tg2) cVar.f127056b.f127083a;
        String string = MMApplicationContext.getContext().getString(C0966R.string.gf7);
        if (this.f162882a) {
            str = String.format("{\"retcode\":0,\"retmsg\":\"ok\",\"sendId\":\"1000039401201911277000281247819\",\"wishing\":\"%s\",\"isSender\":0,\"receiveStatus\":0,\"hbStatus\":2,\"statusMess\":\"给你发了一个红包\",\"hbType\":0,\"watermark\":\"\",\"scenePicSwitch\":1,\"preStrainFlag\":1,\"agree_duty\":{\"title\":\"\",\"service_protocol_wording\":\"\",\"service_protocol_url\":\"\",\"button_wording\":\"\",\"delay_expired_time\":0,\"agreed_flag\":1},\"sendUserName\":\"1@fackuser\",\"timingIdentifier\":\"BC1985F636763728826336B3251529F4\",\"showYearExpression\":1,\"expression_md5\":\"%s\",\"expression_type\":\"2\",\"showRecNormalExpression\":1}", new Object[]{string, this.f162883b});
        } else {
            str = String.format("{\"retcode\":0,\"retmsg\":\"ok\",\"sendId\":\"1000039401201911277000281247819\",\"wishing\":\"%s\",\"isSender\":0,\"receiveStatus\":0,\"hbStatus\":2,\"statusMess\":\"给你发了一个红包\",\"hbType\":0,\"watermark\":\"\",\"scenePicSwitch\":1,\"preStrainFlag\":1,\"agree_duty\":{\"title\":\"\",\"service_protocol_wording\":\"\",\"service_protocol_url\":\"\",\"button_wording\":\"\",\"delay_expired_time\":0,\"agreed_flag\":1},\"sendUserName\":\"1@fackuser\",\"timingIdentifier\":\"BC1985F636763728826336B3251529F4\",\"showYearExpression\":1,\"expression_md5\":\"\",\"showRecNormalExpression\":1}", new Object[]{string});
        }
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(str.getBytes());
        tg22.f185557d = qv32;
        nVar.onGYNetEnd(0, 0, 0, "", cVar, (byte[]) null);
        return 0;
    }

    /* renamed from: b */
    public boolean mo80267b() {
        return true;
    }
}
