package p1081gi;

import com.tencent.mars.cdn.CdnLogic;

/* renamed from: gi.h */
public class C98127h extends C98124g {

    /* renamed from: Q0 */
    public long f287680Q0 = 0;

    /* renamed from: R */
    public long f287681R;

    /* renamed from: R0 */
    public String f287682R0 = "";

    /* renamed from: S */
    public String f287683S;

    /* renamed from: S0 */
    public boolean f287684S0 = false;

    /* renamed from: T */
    public String f287685T;

    /* renamed from: T0 */
    public String f287686T0 = "";

    /* renamed from: U */
    public int f287687U;

    /* renamed from: U0 */
    public String f287688U0 = "";

    /* renamed from: V */
    public int f287689V;

    /* renamed from: V0 */
    public String f287690V0 = "";

    /* renamed from: W */
    public String f287691W;

    /* renamed from: W0 */
    public int f287692W0 = 0;

    /* renamed from: X */
    public String f287693X;

    /* renamed from: X0 */
    public long f287694X0 = 0;

    /* renamed from: Y */
    public int f287695Y;

    /* renamed from: Y0 */
    public int f287696Y0 = 1;

    /* renamed from: Z */
    public int f287697Z;

    /* renamed from: Z0 */
    public int f287698Z0 = 1;

    /* renamed from: a1 */
    public String f287699a1;

    /* renamed from: b1 */
    public String f287700b1;

    /* renamed from: c1 */
    public boolean f287701c1;

    /* renamed from: d1 */
    public boolean f287702d1;

    /* renamed from: e1 */
    public String f287703e1;

    /* renamed from: f1 */
    public C98128a f287704f1;

    /* renamed from: p0 */
    public String f287705p0;

    /* renamed from: x0 */
    public String f287706x0;

    /* renamed from: y0 */
    public long f287707y0 = 0;

    /* renamed from: gi.h$a */
    public interface C98128a {
        /* renamed from: e */
        void mo17917e(String str, long j, long j2);

        /* renamed from: g */
        void mo17918g(String str, int i, C98121d dVar);

        void onDataAvailable(String str, long j, long j2);

        void onM3U8Ready(String str, String str2);

        void onMoovReady(String str, long j, long j2, CdnLogic.VideoInfo videoInfo);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{");
        stringBuffer.append("isPlayMode: ");
        stringBuffer.append(this.f287689V);
        stringBuffer.append(" videoFormat: ");
        stringBuffer.append(this.field_requestVideoFormat);
        stringBuffer.append(" initialDownloadLength : ");
        stringBuffer.append(this.f287669p);
        stringBuffer.append(" initialDownloadOffset : ");
        stringBuffer.append(this.f287670q);
        stringBuffer.append(" videoXmlTotalLen : ");
        stringBuffer.append(this.f287687U);
        stringBuffer.append(" videoTaskType : ");
        stringBuffer.append(this.f287655L);
        stringBuffer.append(" filename : ");
        stringBuffer.append(this.f287683S);
        if (mo137414b()) {
            stringBuffer.append(" url : ");
            stringBuffer.append(this.f287705p0);
            stringBuffer.append(" host : ");
            stringBuffer.append((String) null);
            stringBuffer.append(" referer : ");
            stringBuffer.append(this.f287706x0);
            stringBuffer.append(" ip size : ");
            stringBuffer.append(0);
            stringBuffer.append(" isColdSnsData : ");
            stringBuffer.append(this.f287684S0);
            stringBuffer.append(" signalQuality : ");
            stringBuffer.append(this.f287686T0);
            stringBuffer.append(" snsScene : ");
            stringBuffer.append(this.f287688U0);
            stringBuffer.append(" snsId : ");
            stringBuffer.append(this.f287682R0);
        } else {
            stringBuffer.append(" field_mediaId : ");
            stringBuffer.append(this.field_mediaId);
        }
        stringBuffer.append(" fileid : ");
        stringBuffer.append(this.field_fileId);
        stringBuffer.append(" fileaeskey: ");
        stringBuffer.append(this.field_aesKey);
        stringBuffer.append(" field_preloadRatio:");
        stringBuffer.append(this.field_preloadRatio);
        stringBuffer.append(" newmd5: ");
        stringBuffer.append(this.f287690V0);
        stringBuffer.append(" snsCipherKey: ");
        stringBuffer.append(this.f287700b1);
        stringBuffer.append(" snsMediaId: ");
        stringBuffer.append(this.f287703e1);
        stringBuffer.append("}");
        return stringBuffer.toString();
    }
}
