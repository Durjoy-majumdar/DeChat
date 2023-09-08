package n63;

import com.tencent.p014mm.opensdk.modelpay.PayReq;

/* renamed from: n63.m */
public class C76843m extends C76838h {
    public C76843m(PayReq payReq, String str, String str2, String str3, String str4) {
        super(payReq, str, str2, str3, str4);
    }

    public int getType() {
        return 2655;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/unipayauthapp";
    }
}
