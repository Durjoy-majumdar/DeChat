package com.tencent.p014mm.feature.emoji;

import android.graphics.Bitmap;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.emoji.decode.MMGIFJNIFactory;
import com.tencent.p014mm.feature.emoji.api.IGIFJNIFactoryService;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import kotlin.Metadata;
import p384tk.C101900d;

@C86522b
@Metadata(mo182092bv = {}, mo182093d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J$\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\tH\u0016J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0016J-\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0011J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/feature/emoji/GIFJNIFactoryFeatureService;", "Ldi3/e;", "Lcom/tencent/mm/feature/emoji/api/IGIFJNIFactoryService;", "Lcom/tencent/mm/api/IEmojiInfo;", "emojiInfo", "Landroid/graphics/Bitmap;", "decodeThumb", "", "byteArray", "", "cacheKey", "", "isWxEmoji", "md5", "Ltk/d;", "getDecoder", "bytes", "([BLjava/lang/String;Ljava/lang/Boolean;)Ltk/d;", "<init>", "()V", "plugin-emojisdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.feature.emoji.GIFJNIFactoryFeatureService */
public final class GIFJNIFactoryFeatureService extends C86301e implements IGIFJNIFactoryService {
    public Bitmap decodeThumb(IEmojiInfo iEmojiInfo) {
        C87412m.m108594g(iEmojiInfo, "emojiInfo");
        return MMGIFJNIFactory.Companion.decodeThumb((EmojiInfo) iEmojiInfo);
    }

    public C101900d getDecoder(String str) {
        C87412m.m108594g(str, "md5");
        return MMGIFJNIFactory.Companion.getDecoder(str);
    }

    public Bitmap decodeThumb(byte[] bArr) {
        return MMGIFJNIFactory.Companion.decodeThumb(bArr);
    }

    public C101900d getDecoder(byte[] bArr) {
        return MMGIFJNIFactory.Companion.getDecoder(bArr);
    }

    public Bitmap decodeThumb(byte[] bArr, String str, boolean z) {
        C87412m.m108594g(str, "cacheKey");
        return MMGIFJNIFactory.Companion.decodeThumb(bArr, str, z);
    }

    public C101900d getDecoder(byte[] bArr, String str, Boolean bool) {
        return MMGIFJNIFactory.Companion.getDecoder(bArr, str, bool);
    }

    public C101900d getDecoder(IEmojiInfo iEmojiInfo) {
        C87412m.m108594g(iEmojiInfo, "emojiInfo");
        return MMGIFJNIFactory.Companion.getDecoder((EmojiInfo) iEmojiInfo);
    }
}
