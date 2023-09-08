package com.tencent.p014mm.feature.emoji.api;

import android.graphics.Bitmap;
import com.tencent.p014mm.api.IEmojiInfo;
import di3.C7335d;
import kotlin.Metadata;
import p384tk.C101900d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J$\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bH&J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H&J/\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u000e\u0010\u0010J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/feature/emoji/api/IGIFJNIFactoryService;", "Ldi3/d;", "Lcom/tencent/mm/api/IEmojiInfo;", "emojiInfo", "Landroid/graphics/Bitmap;", "decodeThumb", "", "byteArray", "", "cacheKey", "", "isWxEmoji", "md5", "Ltk/d;", "getDecoder", "bytes", "([BLjava/lang/String;Ljava/lang/Boolean;)Ltk/d;", "emojisdk-api_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.feature.emoji.api.IGIFJNIFactoryService */
public interface IGIFJNIFactoryService extends C7335d {

    @Metadata(mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.feature.emoji.api.IGIFJNIFactoryService$DefaultImpls */
    public static final class DefaultImpls {
        public static /* synthetic */ C101900d getDecoder$default(IGIFJNIFactoryService iGIFJNIFactoryService, byte[] bArr, String str, Boolean bool, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = "";
                }
                return iGIFJNIFactoryService.getDecoder(bArr, str, bool);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDecoder");
        }
    }

    Bitmap decodeThumb(IEmojiInfo iEmojiInfo);

    Bitmap decodeThumb(byte[] bArr);

    Bitmap decodeThumb(byte[] bArr, String str, boolean z);

    C101900d getDecoder(IEmojiInfo iEmojiInfo);

    C101900d getDecoder(String str);

    C101900d getDecoder(byte[] bArr);

    C101900d getDecoder(byte[] bArr, String str, Boolean bool);
}
