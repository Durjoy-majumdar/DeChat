package p1081gi;

/* renamed from: gi.f */
public class C98123f extends C98124g {

    /* renamed from: Q0 */
    public int f287630Q0 = -1;

    /* renamed from: R */
    public String f287631R;

    /* renamed from: R0 */
    public int f287632R0 = 0;

    /* renamed from: S */
    public String f287633S;

    /* renamed from: T */
    public String f287634T;

    /* renamed from: U */
    public String f287635U;

    /* renamed from: V */
    public String[] f287636V;

    /* renamed from: W */
    public String[] f287637W;

    /* renamed from: X */
    public int f287638X;

    /* renamed from: Y */
    public int f287639Y;

    /* renamed from: Z */
    public boolean f287640Z;

    /* renamed from: p0 */
    public String f287641p0;

    /* renamed from: x0 */
    public String f287642x0;

    /* renamed from: y0 */
    public String f287643y0 = "";

    public C98123f() {
        this.f287646C = true;
    }

    /* renamed from: c */
    public final String mo137412c(String[] strArr) {
        String str = "";
        if (!(strArr == null || strArr.length == 0)) {
            for (String str2 : strArr) {
                str = str + str2 + ",";
            }
        }
        return str;
    }

    public String toString() {
        return String.format("mediaId:%s, url:%s, host:%s, referer:%s, savepath:%s, iplist:%s, slaveIplist:%siplistSource:%d, dcSource:%d, isColdSnsData:%b, signalQuality:%s, snsScene:%s", new Object[]{this.field_mediaId, this.f287631R, this.f287633S, this.f287634T, this.f287635U, mo137412c(this.f287636V), mo137412c(this.f287637W), Integer.valueOf(this.f287638X), Integer.valueOf(this.f287639Y), Boolean.valueOf(this.f287640Z), this.f287641p0, this.f287642x0});
    }
}
