package n63;

import com.tencent.p014mm.opensdk.modelpay.PayReq;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82872p6;

/* renamed from: n63.j */
public class C76840j extends C76838h {
    public C76840j(PayReq payReq, String str, String str2, String str3, String str4) {
        super(payReq, str, str2, str3, str4);
    }

    public int getType() {
        return C82872p6.CTRL_INDEX;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/snspayauthapp";
    }
}
