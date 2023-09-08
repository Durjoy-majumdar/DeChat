package dj0;

import com.google.android.gms.common.server.response.FastJsonResponse;

/* renamed from: dj0.i */
public class C86333i extends C86328e {

    /* renamed from: f */
    public String f251029f;

    public C86333i(String str, String str2, String str3) {
        super(str, str2);
        this.f251029f = str3;
        mo120723f("SOAPACTION", FastJsonResponse.QUOTE + str2 + "#" + this.f251020b + FastJsonResponse.QUOTE);
        mo120724g();
    }

    /* renamed from: a */
    public String mo120718a() {
        String str = this.f251029f;
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\"?><s:Envelope s:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:s=\"http://schemas.xmlsoap.org/soap/envelope/\"><s:Body>");
        sb.append("<u:" + this.f251020b + " xmlns:u=\"" + this.f251022d + "\">\n <InstanceID>" + 0 + "</InstanceID>\n <Unit>" + "REL_TIME" + "</Unit>\n <Target>" + str + "</Target>\n</u:" + this.f251020b + ">\n");
        sb.append("</s:Body></s:Envelope>");
        return sb.toString();
    }

    /* renamed from: b */
    public String mo120719b() {
        return "Seek";
    }
}
