package u73;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import te3.lz4;

/* renamed from: u73.n0 */
public class C14133n0 {

    /* renamed from: a */
    public int f39539a;

    /* renamed from: b */
    public String f39540b;

    /* renamed from: c */
    public long f39541c;

    /* renamed from: d */
    public long f39542d;

    /* renamed from: e */
    public int f39543e;

    public C14133n0() {
        this.f39539a = 0;
        this.f39540b = "";
        this.f39541c = 0;
        this.f39542d = 0;
        this.f39543e = 0;
    }

    /* renamed from: a */
    public static String m13465a(int i) {
        String currentLanguage = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());
        return "SearchGuide_" + i + "-" + currentLanguage;
    }

    public C14133n0(int i, lz4 lz4, int i2) {
        this.f39540b = "";
        this.f39541c = 0;
        this.f39542d = 0;
        this.f39543e = 0;
        this.f39539a = i;
        this.f39540b = lz4.f137732d;
        this.f39541c = (long) lz4.f137733e;
        this.f39542d = System.currentTimeMillis() / 1000;
        this.f39543e = i2;
    }
}
