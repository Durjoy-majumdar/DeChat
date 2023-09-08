package dj0;

/* renamed from: dj0.h */
public class C86332h implements C86327d {

    /* renamed from: a */
    public boolean f251028a;

    public C86332h(boolean z) {
        this.f251028a = z;
    }

    /* renamed from: a */
    public String mo120718a() {
        return this.f251028a ? mo120725b("ssdp:all", "[FF0x::C]") : mo120725b("ssdp:all", "239.255.255.250");
    }

    /* renamed from: b */
    public String mo120725b(String str, String str2) {
        return "M-SEARCH * HTTP/1.1\r\nST:" + str + "\r\nHOST: " + str2 + ":1900\r\nMX: 3\r\nMAN: \"ssdp:discover\"\r\n\r\n";
    }
}
