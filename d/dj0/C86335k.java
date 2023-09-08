package dj0;

import com.google.android.gms.common.server.response.FastJsonResponse;

/* renamed from: dj0.k */
public class C86335k extends C86328e {

    /* renamed from: f */
    public int f251031f;

    public C86335k(String str, String str2, int i) {
        super(str, str2);
        this.f251031f = i;
        mo120723f("SOAPACTION", FastJsonResponse.QUOTE + str2 + "#" + this.f251020b + FastJsonResponse.QUOTE);
    }

    /* renamed from: a */
    public String mo120718a() {
        int i = this.f251031f;
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\"?><s:Envelope s:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:s=\"http://schemas.xmlsoap.org/soap/envelope/\"><s:Body>");
        sb.append("<u:" + this.f251020b + " xmlns:u=\"" + this.f251022d + "\">\n<InstanceID>" + 0 + "</InstanceID>\n<Channel>" + "Master" + "</Channel>\n<DesiredVolume>" + i + "</DesiredVolume>\n</u:" + this.f251020b + ">\n");
        sb.append("</s:Body></s:Envelope>");
        return sb.toString();
    }

    /* renamed from: b */
    public String mo120719b() {
        return "SetVolume";
    }
}
