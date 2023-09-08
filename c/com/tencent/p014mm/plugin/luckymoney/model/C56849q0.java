package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.luckymoney.model.C69251n1;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import ob0.C47350c;
import te3.C51018qv3;
import te3.C64727tg2;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.q0 */
public class C56849q0 implements C69251n1.C69252a {

    /* renamed from: a */
    public final /* synthetic */ boolean f162884a;

    /* renamed from: b */
    public final /* synthetic */ String f162885b;

    public C56849q0(boolean z, String str) {
        this.f162884a = z;
        this.f162885b = str;
    }

    /* renamed from: a */
    public int mo80266a(C47350c cVar, C1311n nVar) {
        String str;
        C64727tg2 tg22 = (C64727tg2) cVar.f127056b.f127083a;
        String string = MMApplicationContext.getContext().getString(C0966R.string.gf7);
        String string2 = MMApplicationContext.getContext().getString(C0966R.string.gim);
        String string3 = MMApplicationContext.getContext().getString(C0966R.string.gik);
        if (this.f162884a) {
            str = String.format("{\"retcode\":0,\"retmsg\":\"ok\",\"sendId\":\"1000039401201911277000281247819\",\"amount\":888,\"recNum\":1,\"recAmount\":1,\"totalNum\":1,\"totalAmount\":888,\"hasWriteAnswer\":0,\"hbType\":0,\"isSender\":0,\"isContinue\":0,\"receiveStatus\":2,\"hbStatus\":4,\"statusMess\":\"\",\"wishing\":\"%s\",\"receiveId\":\"1000039401000911277000281247819\",\"headTitle\":\"\",\"canShare\":0,\"operationHeader\":[],\"record\":[],\"watermark\":\"\",\"jumpChange\":1,\"changeWording\":\"%s\",\"sendUserName\":\"1@fackuser\",\"changeUrl\":\"weixin:\\/\\/wxpay\\/change\",\"real_name_info\":{\"guide_flag\":0},\"sessionUserName\":\"1@fackuser\",\"jumpChangeType\":1,\"changeIconUrl\":\"\",\"showSourceOpen\":{\"source\":{\"subType\":0,\"sourceObject\":{\"detailImage\":\"\",\"detailImageMd5\":\"\"}, \"detail_link_type\":\"%s\",\"detail_link_appname\":\"%s\",\"detail_link_url\":\"%s\",\"detail_link_title\":\"%s\"},\"operation\":{\"name\":\"%s\",\"type\":\"Text\",\"content\":\"%s\",\"enable\":1,\"iconUrl\":\"\",\"ossKey\":4294967295}},\"expression_md5\":\"%s\",\"expression_type\":0,\"showYearExpression\":1,\"showOpenNormalExpression\":1,\"enableAnswerByExpression\":1,\"enableAnswerBySelfie\":0}", new Object[]{string, string2, "0", "", "", "", string3, "", this.f162885b});
        } else {
            str = String.format("{\"retcode\":0,\"retmsg\":\"ok\",\"sendId\":\"1000039401201911277000281247819\",\"amount\":888,\"recNum\":1,\"recAmount\":1,\"totalNum\":1,\"totalAmount\":888,\"hasWriteAnswer\":0,\"hbType\":0,\"isSender\":0,\"isContinue\":0,\"receiveStatus\":2,\"hbStatus\":4,\"statusMess\":\"\",\"wishing\":\"%s\",\"receiveId\":\"1000039401000911277000281247819\",\"headTitle\":\"\",\"canShare\":0,\"operationHeader\":[],\"record\":[],\"watermark\":\"\",\"jumpChange\":1,\"changeWording\":\"%s\",\"sendUserName\":\"1@fackuser\",\"changeUrl\":\"weixin:\\/\\/wxpay\\/change\",\"real_name_info\":{\"guide_flag\":0},\"sessionUserName\":\"1@fackuser\",\"jumpChangeType\":1,\"changeIconUrl\":\"\",\"showSourceOpen\":{\"source\":{\"subType\":0,\"sourceObject\":{\"detailImage\":\"\",\"detailImageMd5\":\"\"},\"detail_link_type\":\"%s\",\"detail_link_appname\":\"%s\",\"detail_link_url\":\"%s\",\"detail_link_title\":\"%s\"},\"operation\":{\"name\":\"%s\",\"type\":\"Text\",\"content\":\"%s\",\"enable\":1,\"iconUrl\":\"\",\"ossKey\":4294967295}},\"expression_md5\":\"\",\"expression_type\":0,\"showYearExpression\":1,\"showOpenNormalExpression\":1,\"enableAnswerByExpression\":1,\"enableAnswerBySelfie\":0}", new Object[]{string, string2, "0", "", "", "", string3, ""});
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
