package sm0;

import com.tenpay.ndk.WxSmCryptoUtil;
import com.tenpay.tsm.TSMTypes;
import gy3.C8480h;

/* renamed from: sm0.h */
public enum C26168h {
    ;
    

    /* renamed from: g */
    public static final C26169a f73102g = null;

    /* renamed from: d */
    public final int f73104d;

    /* renamed from: e */
    public final WxSmCryptoUtil.SM2CipherMode f73105e;

    /* renamed from: f */
    public final TSMTypes.SM2CipherFormat f73106f;

    /* renamed from: sm0.h$a */
    public static final class C26169a {
        public C26169a(C8480h hVar) {
        }
    }

    /* access modifiers changed from: public */
    static {
        f73102g = new C26169a((C8480h) null);
    }

    /* access modifiers changed from: public */
    C26168h(int i, WxSmCryptoUtil.SM2CipherMode sM2CipherMode, TSMTypes.SM2CipherFormat sM2CipherFormat) {
        this.f73104d = i;
        this.f73105e = sM2CipherMode;
        this.f73106f = sM2CipherFormat;
    }
}
