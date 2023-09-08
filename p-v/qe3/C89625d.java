package qe3;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.VersionUtilities;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import junit.framework.Assert;
import p156gj.C87200o;

/* renamed from: qe3.d */
public final class C89625d extends C12211e {

    /* renamed from: a */
    public static int f257835a = 2;

    /* renamed from: b */
    public static final String f257836b = C87200o.f252869b;

    /* renamed from: c */
    public static final String f257837c = C87200o.f252870c;

    /* renamed from: d */
    public static final String f257838d = C87200o.f252871d;

    /* renamed from: e */
    public static final String f257839e = C87200o.f252874g;

    /* renamed from: f */
    public static long f257840f;

    /* renamed from: g */
    public static int f257841g;

    /* renamed from: h */
    public static boolean f257842h = VersionUtilities.checkRCVersion(f257841g);

    /* renamed from: i */
    public static boolean f257843i = VersionUtilities.checkGPVersion(f257841g);

    /* renamed from: j */
    public static boolean f257844j = VersionUtilities.checkTestVersion(f257841g);

    /* renamed from: k */
    public static boolean f257845k = VersionUtilities.checkAlphaVersion(f257841g);

    /* renamed from: l */
    public static boolean f257846l = VersionUtilities.checkDevVersion(f257841g);

    /* renamed from: m */
    public static final String f257847m = (HttpWrapperBase.PROTOCAL_HTTP + WeChatHosts.domainString(C0966R.string.f360885fm3) + "/mp/lifedetail?bid=%s&action=list#wechat_redirect");

    /* renamed from: n */
    public static final String f257848n = (HttpWrapperBase.PROTOCAL_HTTP + WeChatHosts.domainString(C0966R.string.f360885fm3) + "/mp/lifedetail?bid=%s&tid=%s&action=list#wechat_redirect");

    static {
        f257841g = Integer.decode(BuildInfo.CLIENT_VERSION).intValue();
        Assert.assertNotNull(BuildInfo.CLIENT_VERSION);
        try {
            int i = MMApplicationContext.getContext().getPackageManager().getApplicationInfo(MMApplicationContext.getPackageName(), 128).metaData.getInt("com.tencent.mm.BuildInfo.CLIENT_VERSION");
            int i2 = f257841g;
            if (i > i2 && i - i2 < 255 && (i & 255) >= 48) {
                f257841g = i;
            }
        } catch (Exception e) {
            Log.printDebugStack("MicroMsg.ConstantsProtocal", "", e);
        }
    }

    /* renamed from: a */
    public static String m112060a() {
        return C87200o.f252868a;
    }

    /* renamed from: b */
    public static String m112061b() {
        return C87200o.f252872e;
    }

    /* renamed from: c */
    public static void m112062c(int i) {
        f257841g = i;
        f257845k = VersionUtilities.checkAlphaVersion(i);
        f257842h = VersionUtilities.checkRCVersion(f257841g);
        f257844j = VersionUtilities.checkTestVersion(f257841g);
        f257846l = VersionUtilities.checkDevVersion(f257841g);
        f257843i = VersionUtilities.checkGPVersion(f257841g);
    }
}
