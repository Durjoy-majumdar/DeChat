package f53;

import com.tencent.p014mm.pluginsdk.wallet.PayInfo;

/* renamed from: f53.h */
public class C75689h extends C75687f {
    public C75689h(PayInfo payInfo, int i) {
        super(payInfo, i);
    }

    public int getFuncId() {
        return 1569;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/sns_qrcodeusebindquery";
    }
}
