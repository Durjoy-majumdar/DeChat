package p384tk;

import android.graphics.Bitmap;
import com.tencent.p014mm.jni.emojihelper.WxamDecoderJni;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.downloadservice.ByteRange;
import gy3.C87412m;
import p206nj.C88957l;

/* renamed from: tk.g */
public final class C22542g implements C101900d {

    /* renamed from: a */
    public WxamDecoderJni f64851a = new WxamDecoderJni();

    /* renamed from: b */
    public Bitmap f64852b;

    public C22542g(byte[] bArr, String str, boolean z) {
        C87412m.m108594g(bArr, ByteRange.BYTES_UNIT);
        C87412m.m108594g(str, "cacheKeyString");
        C88957l.m111078n("voipComm");
        C88957l.m111078n("voipChannel");
        C88957l.m111078n("voipCodec");
        C88957l.m111078n("emojihelper");
        if (C87412m.m108589b(str, "")) {
            Log.m105918d("MicroMsg.MMWXAMDecoder", "create WxamDecoderJni no cache");
            WxamDecoderJni wxamDecoderJni = this.f64851a;
            if (wxamDecoderJni != null) {
                wxamDecoderJni.mo21770a(bArr, bArr.length);
            }
        } else {
            Log.m105918d("MicroMsg.MMWXAMDecoder", "create WxamDecoderJni with cache");
            WxamDecoderJni wxamDecoderJni2 = this.f64851a;
            if (wxamDecoderJni2 != null) {
                wxamDecoderJni2.mo21771b(bArr, bArr.length, str, z);
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(mo35632c(), mo35630a(), Bitmap.Config.ARGB_8888);
        C87412m.m108593f(createBitmap, "createBitmap(frameWidth(… Bitmap.Config.ARGB_8888)");
        this.f64852b = createBitmap;
    }

    /* renamed from: a */
    public int mo35630a() {
        WxamDecoderJni wxamDecoderJni = this.f64851a;
        if (wxamDecoderJni != null) {
            return wxamDecoderJni.mo21776g();
        }
        return 0;
    }

    /* renamed from: b */
    public void mo35631b() {
        WxamDecoderJni wxamDecoderJni = this.f64851a;
        if (wxamDecoderJni != null) {
            wxamDecoderJni.mo21772c();
        }
        Bitmap bitmap = this.f64852b;
        WxamDecoderJni wxamDecoderJni2 = this.f64851a;
        Integer valueOf = wxamDecoderJni2 != null ? Integer.valueOf(wxamDecoderJni2.mo21773d(bitmap)) : null;
        if (valueOf != null) {
            valueOf.intValue();
        }
    }

    /* renamed from: c */
    public int mo35632c() {
        WxamDecoderJni wxamDecoderJni = this.f64851a;
        if (wxamDecoderJni != null) {
            return wxamDecoderJni.mo21777h();
        }
        return 0;
    }

    /* renamed from: d */
    public int mo35633d() {
        WxamDecoderJni wxamDecoderJni = this.f64851a;
        if (wxamDecoderJni != null) {
            return wxamDecoderJni.mo21775f();
        }
        return 0;
    }

    public void destroy() {
        WxamDecoderJni wxamDecoderJni = this.f64851a;
        if (wxamDecoderJni != null) {
            wxamDecoderJni.mo21778i();
        }
    }

    /* renamed from: e */
    public int mo35635e() {
        WxamDecoderJni wxamDecoderJni = this.f64851a;
        if (wxamDecoderJni != null) {
            return wxamDecoderJni.mo21774e();
        }
        return 0;
    }

    public Bitmap getFrame() {
        return this.f64852b;
    }

    public void seekTo(long j) {
    }
}
