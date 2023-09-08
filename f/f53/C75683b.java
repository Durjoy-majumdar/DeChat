package f53;

import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.xweb.util.WXWebReporter;

/* renamed from: f53.b */
public class C75683b extends C75687f {
    public C75683b(PayInfo payInfo, int i) {
        super(payInfo, i);
    }

    public int getFuncId() {
        return WXWebReporter.WXWEB_IDKEY_FR_OFFICE_WORD_ID;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/dc_qrcodeusebindquery";
    }
}
