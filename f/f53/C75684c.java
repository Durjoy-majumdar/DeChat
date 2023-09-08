package f53;

import com.tencent.p014mm.pluginsdk.wallet.PayInfo;

/* renamed from: f53.c */
public class C75684c extends C75687f {
    public C75684c(PayInfo payInfo, int i) {
        super(payInfo, i);
    }

    public int getFuncId() {
        return 1543;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/sns_ff_qrcodeusebindquery";
    }
}
