package pc0;

/* renamed from: pc0.f */
public class C100765f {

    /* renamed from: a */
    public long f295213a = -1;

    /* renamed from: b */
    public long f295214b = 0;

    /* renamed from: c */
    public String f295215c = "";

    /* renamed from: d */
    public String f295216d = null;

    /* renamed from: e */
    public String f295217e = null;

    /* renamed from: f */
    public String f295218f = null;

    /* renamed from: a */
    public C100765f mo140199a(long j) {
        this.f295214b = j;
        return this;
    }

    /* renamed from: b */
    public C100765f mo140200b(String str) {
        this.f295216d = str;
        return this;
    }

    /* renamed from: c */
    public C100765f mo140201c(String str) {
        this.f295215c = str;
        return this;
    }

    public String toString() {
        return "ForwardInfo{forwardFromImgId=" + this.f295213a + ", forwardMsgId=" + this.f295214b + ", forwardSnsLocalId='" + this.f295215c + '\'' + ", forwardMsgUuid='" + this.f295216d + '\'' + ", forwardMsgSvrId='" + this.f295217e + '\'' + ", talkerUsername='" + this.f295218f + '\'' + '}';
    }
}
