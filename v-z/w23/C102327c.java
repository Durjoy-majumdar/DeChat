package w23;

import android.graphics.Bitmap;
import android.util.Size;
import com.tencent.p014mm.emoji.decode.MMGIFJNIFactory;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.xeffect.effect.IStickerDecoder;
import di3.C86312j;
import gy3.C87412m;
import i61.C98602h;
import org.json.JSONObject;
import p384tk.C101898b;
import p384tk.C101900d;
import z51.C39315g;

/* renamed from: w23.c */
public final class C102327c implements IStickerDecoder {

    /* renamed from: a */
    public C101900d f301373a = new C101898b();

    public C102327c(String str) {
        C87412m.m108594g(str, "value");
        new EmojiInfo();
        try {
            EmojiInfo G = ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo137999G(new JSONObject(str).optString("emoji_md5"));
            C87412m.m108593f(G, "getService(IEmojiMgrProv….getEmojiInfoFromMD5(md5)");
            this.f301373a = MMGIFJNIFactory.Companion.getDecoder(G);
        } catch (Exception unused) {
        }
    }

    public void destroy() {
        this.f301373a.destroy();
    }

    public long duration() {
        return 1073741824;
    }

    public Bitmap getFrame() {
        this.f301373a.mo35631b();
        return this.f301373a.getFrame();
    }

    public void seekTo(long j) {
    }

    public Size size() {
        return new Size(this.f301373a.mo35632c(), this.f301373a.mo35630a());
    }
}
