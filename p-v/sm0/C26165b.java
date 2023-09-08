package sm0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82835n;
import com.tenpay.tsm.TSMTypes;

/* renamed from: sm0.b */
public interface C26165b extends C82835n {

    /* renamed from: sm0.b$a */
    public interface C26166a {
        /* renamed from: a */
        boolean mo53083a(String str, byte[] bArr, String str2, byte[] bArr2, TSMTypes.SM2SignFormat sM2SignFormat);

        /* renamed from: b */
        byte[] mo53084b(String str, byte[] bArr, String str2, TSMTypes.SM2SignFormat sM2SignFormat);

        /* renamed from: c */
        byte[] mo53085c(String str, byte[] bArr, TSMTypes.SM2CipherFormat sM2CipherFormat);

        /* renamed from: d */
        byte[] mo53086d(String str, byte[] bArr, TSMTypes.SM2CipherFormat sM2CipherFormat);
    }

    /* renamed from: sm0.b$b */
    public interface C26167b {
        /* renamed from: a */
        byte[] mo53087a(String str, byte[] bArr, byte[] bArr2);

        /* renamed from: b */
        byte[][] mo53088b(String str, byte[] bArr, byte[] bArr2, byte[] bArr3);

        /* renamed from: c */
        byte[] mo53089c(String str, byte[] bArr);

        /* renamed from: d */
        byte[] mo53090d(String str, byte[] bArr, byte[] bArr2);

        /* renamed from: e */
        byte[] mo53091e(String str, byte[] bArr);

        /* renamed from: f */
        byte[] mo53092f(String str, byte[] bArr, byte[] bArr2);

        /* renamed from: g */
        byte[] mo53093g(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

        /* renamed from: h */
        byte[] mo53094h(String str, byte[] bArr, byte[] bArr2);
    }

    /* renamed from: B */
    void mo53064B(String str, String str2, TSMTypes.TSMStorageSM2KeyFormat tSMStorageSM2KeyFormat);

    /* renamed from: D */
    boolean mo53065D(String str);

    /* renamed from: E */
    String[] mo53066E(String str, TSMTypes.TSMStorageSM2KeyFormat tSMStorageSM2KeyFormat);

    /* renamed from: F */
    void mo53067F(String str);

    /* renamed from: G */
    void mo53068G(String str);

    /* renamed from: I */
    void mo53069I(String str, String str2, TSMTypes.TSMStorageSM2KeyFormat tSMStorageSM2KeyFormat);

    /* renamed from: K */
    void mo53070K(String str);

    /* renamed from: L */
    byte[] mo53071L(String str);

    /* renamed from: N */
    String mo53072N(String str, TSMTypes.TSMStorageSM2KeyFormat tSMStorageSM2KeyFormat);

    /* renamed from: R */
    void mo53073R(String str, String str2, TSMTypes.TSMStorageSM2KeyFormat tSMStorageSM2KeyFormat);

    /* renamed from: U */
    boolean mo53074U(String str);

    /* renamed from: X */
    void mo53075X(String str);

    /* renamed from: Y */
    C26167b mo53076Y();

    /* renamed from: Z */
    C26166a mo53077Z();

    /* renamed from: g */
    boolean mo53078g(String str);

    /* renamed from: m */
    void mo53079m(String str, byte[] bArr);

    /* renamed from: p */
    void mo53080p(String str);

    /* renamed from: r */
    void mo53081r(String str, String str2, TSMTypes.TSMStorageSM2KeyFormat tSMStorageSM2KeyFormat);

    /* renamed from: z */
    void mo53082z(String str, byte[] bArr);
}
