package ra2;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C102658n6;
import qc0.C101106m;

/* renamed from: ra2.a */
public class C101365a extends C102658n6 {

    /* renamed from: H1 */
    public static IAutoDBItem.MAutoDBInfo f296935H1 = C102658n6.initAutoDBInfo(C101365a.class);

    /* renamed from: B1 */
    public String f296936B1;

    /* renamed from: C1 */
    public String f296937C1;

    /* renamed from: D1 */
    public String f296938D1;

    /* renamed from: E1 */
    public boolean f296939E1;

    /* renamed from: F1 */
    public boolean f296940F1 = false;

    /* renamed from: G1 */
    public boolean f296941G1 = true;

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f296935H1;
    }

    /* renamed from: l2 */
    public boolean mo140849l2() {
        return (this.field_songBgColor == 0 || this.field_songLyricColor == 0) ? false : true;
    }

    /* renamed from: m2 */
    public C101106m mo140850m2() {
        C101106m mVar = new C101106m();
        mVar.f295960e = this.field_originMusicId;
        mVar.f295959d = this.field_musicType;
        mVar.f295972t = this.field_appId;
        mVar.f295964i = this.field_songAlbum;
        mVar.f295973u = this.field_songAlbumType;
        mVar.f295965j = this.field_songAlbumUrl;
        mVar.f295976x = this.field_songHAlbumUrl;
        mVar.f295969q = this.field_songLyric;
        mVar.f295966n = this.field_songWifiUrl;
        mVar.f295962g = this.field_songName;
        mVar.f295963h = this.field_songSinger;
        mVar.f295967o = this.field_songWapLinkUrl;
        mVar.f295968p = this.field_songWebUrl;
        mVar.f295970r = this.field_songAlbumLocalPath;
        mVar.f295975w = this.field_songMediaId;
        mVar.f295977y = this.field_songSnsAlbumUser;
        mVar.f295978z = this.field_songSnsShareUser;
        mVar.f295941B = this.field_hideBanner;
        mVar.f295942C = this.field_jsWebUrlDomain;
        mVar.f295943D = this.field_startTime;
        mVar.f295944E = this.f296936B1;
        mVar.f295945F = this.field_protocol;
        mVar.f295946G = this.field_barBackToWebView;
        mVar.f295947H = this.field_musicbar_url;
        mVar.f295955Q = this.f296937C1;
        mVar.f295948I = this.field_srcUsername;
        mVar.f295950K = this.field_playbackRate;
        mVar.f295956R = this.f296938D1;
        mVar.f295958T = this.f296939E1;
        mVar.f295952M = this.f296940F1;
        mVar.f295953N = this.f296941G1;
        mVar.f295954P = this.field_mid;
        return mVar;
    }
}
