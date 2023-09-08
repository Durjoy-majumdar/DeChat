package zq0;

import gy3.C8480h;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: zq0.k0 */
public final class C91891k0 {

    /* renamed from: A */
    public String f263089A;

    /* renamed from: B */
    public String f263090B;

    /* renamed from: a */
    public long f263091a;

    /* renamed from: b */
    public long f263092b;

    /* renamed from: c */
    public long f263093c;

    /* renamed from: d */
    public long f263094d;

    /* renamed from: e */
    public long f263095e;

    /* renamed from: f */
    public long f263096f;

    /* renamed from: g */
    public long f263097g;

    /* renamed from: h */
    public long f263098h;

    /* renamed from: i */
    public long f263099i;

    /* renamed from: j */
    public long f263100j;

    /* renamed from: k */
    public long f263101k;

    /* renamed from: l */
    public long f263102l;

    /* renamed from: m */
    public long f263103m;

    /* renamed from: n */
    public long f263104n;

    /* renamed from: o */
    public long f263105o;

    /* renamed from: p */
    public long f263106p;

    /* renamed from: q */
    public long f263107q;

    /* renamed from: r */
    public long f263108r;

    /* renamed from: s */
    public long f263109s;

    /* renamed from: t */
    public long f263110t;

    /* renamed from: u */
    public long f263111u;

    /* renamed from: v */
    public long f263112v;

    /* renamed from: w */
    public long f263113w;

    /* renamed from: x */
    public long f263114x;

    /* renamed from: y */
    public long f263115y;

    /* renamed from: z */
    public long f263116z;

    public C91891k0() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, (String) null, (String) null, 268435455, (C8480h) null);
    }

    public C91891k0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j15, long j16, long j17, long j18, long j19, long j25, long j26, long j27, long j28, long j29, long j35, long j36, long j37, long j38, long j39, long j44, long j45, String str, String str2, int i, C8480h hVar) {
        int i2 = i;
        long j46 = (i2 & 1) != 0 ? 0 : j;
        long j47 = (i2 & 2) != 0 ? 0 : j2;
        long j48 = (i2 & 4) != 0 ? 0 : j3;
        long j49 = (i2 & 8) != 0 ? 0 : j4;
        long j54 = (i2 & 16) != 0 ? 0 : j5;
        long j55 = (i2 & 32) != 0 ? 0 : j6;
        long j56 = (i2 & 64) != 0 ? 0 : j7;
        long j57 = (i2 & 128) != 0 ? 0 : j8;
        long j58 = (i2 & 256) != 0 ? 0 : j9;
        long j59 = (i2 & 512) != 0 ? 0 : j15;
        long j64 = (i2 & 1024) != 0 ? 0 : j16;
        long j65 = (i2 & 2048) != 0 ? 0 : j17;
        long j66 = (i2 & 4096) != 0 ? 0 : j18;
        long j67 = (i2 & 8192) != 0 ? 0 : j19;
        long j68 = (i2 & 16384) != 0 ? 0 : j25;
        long j69 = (32768 & i2) != 0 ? 0 : j26;
        long j74 = (65536 & i2) != 0 ? 0 : j27;
        long j75 = (131072 & i2) != 0 ? 0 : j28;
        long j76 = (262144 & i2) != 0 ? 0 : j29;
        long j77 = (524288 & i2) != 0 ? 0 : j35;
        long j78 = (1048576 & i2) != 0 ? 0 : j36;
        long j79 = (2097152 & i2) != 0 ? 0 : j37;
        long j84 = (4194304 & i2) != 0 ? 0 : j38;
        long j85 = (8388608 & i2) != 0 ? 0 : j39;
        long j86 = (16777216 & i2) != 0 ? 0 : j44;
        long j87 = (33554432 & i2) != 0 ? 0 : j45;
        String str3 = "";
        String str4 = (67108864 & i2) != 0 ? str3 : str;
        str3 = (i2 & 134217728) == 0 ? str2 : str3;
        C87412m.m108594g(str4, "appId");
        C87412m.m108594g(str3, "phoneNumber");
        this.f263091a = j46;
        this.f263092b = j47;
        this.f263093c = j48;
        this.f263094d = j49;
        this.f263095e = j54;
        this.f263096f = j55;
        this.f263097g = j56;
        this.f263098h = j57;
        this.f263099i = j58;
        this.f263100j = j59;
        this.f263101k = j64;
        this.f263102l = j65;
        this.f263103m = j66;
        this.f263104n = j67;
        this.f263105o = j68;
        this.f263106p = j69;
        this.f263107q = j74;
        this.f263108r = j75;
        this.f263109s = j76;
        this.f263110t = j77;
        this.f263111u = j78;
        this.f263112v = j79;
        this.f263113w = j84;
        this.f263114x = j85;
        this.f263115y = j86;
        this.f263116z = j87;
        this.f263089A = str4;
        this.f263090B = str3;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isBindPhone", this.f263091a);
        jSONObject.put("bindSuccess", this.f263092b);
        jSONObject.put("getPhoneNumberCount", this.f263093c);
        jSONObject.put("clickConfirmCount", this.f263094d);
        jSONObject.put("clickDenyCount", this.f263095e);
        jSONObject.put("clickCancelCount", this.f263096f);
        jSONObject.put("confirmBindedPhoneCount", this.f263097g);
        jSONObject.put("confirmUnBindPhoneCount", this.f263098h);
        jSONObject.put("clickInfoCount", this.f263099i);
        jSONObject.put("clickUseOtherPhoneCount", this.f263100j);
        jSONObject.put("clickManagePhoneCount", this.f263101k);
        jSONObject.put("clickGetVerifyCodeCount", this.f263102l);
        jSONObject.put("getVerifyCodeSuccessCount", this.f263103m);
        jSONObject.put("getVerifyCodeFailedCount", this.f263104n);
        jSONObject.put("clickAddPhoneDoneCount", this.f263105o);
        jSONObject.put("addPhoneSuccessCount", this.f263106p);
        jSONObject.put("addPhoneFailedCount", this.f263107q);
        jSONObject.put("addPhoneAndSaveCount", this.f263108r);
        jSONObject.put("addPhoneNotSaveCount", this.f263109s);
        jSONObject.put("clickAddPhoneOnManagePageCount", this.f263110t);
        jSONObject.put("deletePhoneCount", this.f263111u);
        jSONObject.put("deletePhoneSuccessCount", this.f263112v);
        jSONObject.put("deletePhoneFailedCount", this.f263113w);
        jSONObject.put("verifyCodeCount", this.f263114x);
        jSONObject.put("verifyCodeSuccessCount", this.f263115y);
        jSONObject.put("verifyCodeFailedCount", this.f263116z);
        jSONObject.put("appId", this.f263089A);
        jSONObject.put("phoneNumber", this.f263090B);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "jsonObject.toString()");
        return jSONObject2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C91891k0(String str) {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, (String) null, (String) null, 268435455, (C8480h) null);
        C87412m.m108594g(str, "jsonStr");
        String str2 = "";
        try {
            JSONObject jSONObject = new JSONObject(str);
            try {
                this.f263091a = jSONObject.optLong("isBindPhone", 0);
                this.f263092b = jSONObject.optLong("bindSuccess", 0);
                this.f263093c = jSONObject.optLong("getPhoneNumberCount", 0);
                this.f263094d = jSONObject.optLong("clickConfirmCount", 0);
                this.f263095e = jSONObject.optLong("clickDenyCount", 0);
                this.f263096f = jSONObject.optLong("clickCancelCount", 0);
                this.f263097g = jSONObject.optLong("confirmBindedPhoneCount", 0);
                this.f263098h = jSONObject.optLong("confirmUnBindPhoneCount", 0);
                this.f263099i = jSONObject.optLong("clickInfoCount", 0);
                this.f263100j = jSONObject.optLong("clickUseOtherPhoneCount", 0);
                this.f263101k = jSONObject.optLong("clickManagePhoneCount", 0);
                this.f263102l = jSONObject.optLong("clickGetVerifyCodeCount", 0);
                this.f263103m = jSONObject.optLong("getVerifyCodeSuccessCount", 0);
                this.f263104n = jSONObject.optLong("getVerifyCodeFailedCount", 0);
                this.f263105o = jSONObject.optLong("clickAddPhoneDoneCount", 0);
                this.f263106p = jSONObject.optLong("addPhoneSuccessCount", 0);
                this.f263107q = jSONObject.optLong("addPhoneFailedCount", 0);
                this.f263108r = jSONObject.optLong("addPhoneAndSaveCount", 0);
                this.f263109s = jSONObject.optLong("addPhoneNotSaveCount", 0);
                this.f263110t = jSONObject.optLong("clickAddPhoneOnManagePageCount", 0);
                this.f263111u = jSONObject.optLong("deletePhoneCount", 0);
                this.f263112v = jSONObject.optLong("deletePhoneSuccessCount", 0);
                this.f263113w = jSONObject.optLong("deletePhoneFailedCount", 0);
                this.f263114x = jSONObject.optLong("verifyCodeCount", 0);
                this.f263115y = jSONObject.optLong("verifyCodeSuccessCount", 0);
                this.f263116z = jSONObject.optLong("verifyCodeFailedCount", 0);
                String str3 = str2;
                String optString = jSONObject.optString("appId", str3);
                C87412m.m108593f(optString, "jsonObject.optString(\"appId\", \"\")");
                this.f263089A = optString;
                String optString2 = jSONObject.optString("phoneNumber", str3);
                C87412m.m108593f(optString2, "jsonObject.optString(\"phoneNumber\", \"\")");
                this.f263090B = optString2;
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
    }
}
