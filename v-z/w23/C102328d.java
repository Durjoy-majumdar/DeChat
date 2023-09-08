package w23;

import android.content.Context;
import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.xeffect.effect.IStickerDecoder;
import com.tencent.p014mm.xeffect.effect.IStickerDecoderFactory;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.tmassistantsdk.downloadservice.ByteRange;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: w23.d */
public final class C102328d implements IStickerDecoderFactory {

    /* renamed from: a */
    public Context f301374a;

    public C102328d() {
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        this.f301374a = context;
    }

    public IStickerDecoder getDecoder(byte[] bArr) {
        C87412m.m108594g(bArr, ByteRange.BYTES_UNIT);
        return new C102327c(APMidasPayAPI.ENV_TEST);
    }

    public IStickerDecoder getDecoder(String str) {
        C87412m.m108594g(str, "path");
        try {
            String optString = new JSONObject(str).optString("scheme");
            if (C87412m.m108589b(optString, MimeTypes.BASE_TYPE_TEXT)) {
                return new C102326b(this.f301374a, str);
            }
            if (C87412m.m108589b(optString, "emoji")) {
                return new C102327c(str);
            }
            return new C102325a();
        } catch (Exception unused) {
        }
    }
}
