package p911ml;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import p490dl.C97486g;
import p911ml.C99914f;

/* renamed from: ml.k */
public class C99922k extends C99914f {

    /* renamed from: g */
    public int f292782g = 0;

    /* renamed from: h */
    public String f292783h;

    public C99922k(EmojiInfo emojiInfo, boolean z, C99914f.C99915a aVar) {
        super(emojiInfo, z, aVar);
        Log.m105925i("MicroMsg.EmojiUploadCDN", "prepare: %s", emojiInfo.field_md5);
        new C97486g(this.f292771a, this.f292772b).mo9225i().mo123420E(new C99920i(this));
    }
}
