package com.tencent.p014mm.emoji.decode;

import android.graphics.Bitmap;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import p384tk.C101898b;
import p384tk.C101900d;

@Metadata(mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/emoji/decode/MMGIFJNIFactory;", "", "()V", "Companion", "plugin-emojisdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.emoji.decode.MMGIFJNIFactory */
public final class MMGIFJNIFactory {
    public static final Companion Companion = new Companion((C8480h) null);
    /* access modifiers changed from: private */
    public static final String TAG = "MicroMsg.MMGIFJNIFactory";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\b\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ-\u0010\b\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\b\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\tJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bJ\"\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eR\u0014\u0010\u0014\u001a\u00020\u00068\u0002XD¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, mo182094d2 = {"Lcom/tencent/mm/emoji/decode/MMGIFJNIFactory$Companion;", "", "Ltk/d;", "decoder", "Landroid/graphics/Bitmap;", "decodeThumbInternal", "", "md5", "getDecoder", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "emojiInfo", "", "bytes", "cacheKey", "", "isWxEmoji", "([BLjava/lang/String;Ljava/lang/Boolean;)Ltk/d;", "isValid", "decodeThumb", "byteArray", "TAG", "Ljava/lang/String;", "<init>", "()V", "plugin-emojisdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.emoji.decode.MMGIFJNIFactory$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }

        private final Bitmap decodeThumbInternal(C101900d dVar) {
            if (!isValid(dVar)) {
                return null;
            }
            dVar.mo35631b();
            Bitmap frame = dVar.getFrame();
            dVar.destroy();
            return frame;
        }

        public static /* synthetic */ C101900d getDecoder$default(Companion companion, byte[] bArr, String str, Boolean bool, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            return companion.getDecoder(bArr, str, bool);
        }

        public final Bitmap decodeThumb(EmojiInfo emojiInfo) {
            C87412m.m108594g(emojiInfo, "emojiInfo");
            C101900d decoder = getDecoder(emojiInfo);
            if (!isValid(decoder)) {
                return null;
            }
            decoder.mo35631b();
            Bitmap frame = decoder.getFrame();
            decoder.destroy();
            return frame;
        }

        public final C101900d getDecoder(String str) {
            C87412m.m108594g(str, "md5");
            EmojiInfo TO = C30790w2.m39221h().mo57717d().mo142044TO(str);
            if (TO == null) {
                return new C101898b();
            }
            return getDecoder(TO);
        }

        public final boolean isValid(C101900d dVar) {
            return dVar != null && !(dVar instanceof C101898b);
        }

        public final C101900d getDecoder(byte[] bArr) {
            return getDecoder(bArr, (String) null, (Boolean) null);
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x0057  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x005d A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p384tk.C101900d getDecoder(byte[] r4, java.lang.String r5, java.lang.Boolean r6) {
            /*
                r3 = this;
                if (r4 == 0) goto L_0x0054
                r0 = 0
                boolean r1 = com.tencent.p014mm.sdk.platformtools.ImgUtil.isWXGF((byte[]) r4)     // Catch:{ MMGIFException -> 0x003a }
                if (r1 == 0) goto L_0x0028
                java.lang.String r1 = ""
                if (r5 == 0) goto L_0x0021
                boolean r2 = gy3.C87412m.m108589b(r5, r1)     // Catch:{ MMGIFException -> 0x003a }
                if (r2 != 0) goto L_0x0021
                tk.g r1 = new tk.g     // Catch:{ MMGIFException -> 0x003a }
                if (r6 == 0) goto L_0x001c
                boolean r6 = r6.booleanValue()     // Catch:{ MMGIFException -> 0x003a }
                goto L_0x001d
            L_0x001c:
                r6 = 0
            L_0x001d:
                r1.<init>(r4, r5, r6)     // Catch:{ MMGIFException -> 0x003a }
                goto L_0x0055
            L_0x0021:
                tk.g r5 = new tk.g     // Catch:{ MMGIFException -> 0x003a }
                r5.<init>(r4, r1, r0)     // Catch:{ MMGIFException -> 0x003a }
                r1 = r5
                goto L_0x0055
            L_0x0028:
                boolean r5 = com.tencent.p014mm.sdk.platformtools.ImgUtil.isGif((byte[]) r4)     // Catch:{ MMGIFException -> 0x003a }
                if (r5 == 0) goto L_0x0034
                tk.f r1 = new tk.f     // Catch:{ MMGIFException -> 0x003a }
                r1.<init>((byte[]) r4)     // Catch:{ MMGIFException -> 0x003a }
                goto L_0x0055
            L_0x0034:
                tk.e r1 = new tk.e     // Catch:{ MMGIFException -> 0x003a }
                r1.<init>((byte[]) r4)     // Catch:{ MMGIFException -> 0x003a }
                goto L_0x0055
            L_0x003a:
                r5 = move-exception
                java.lang.String r6 = com.tencent.p014mm.emoji.decode.MMGIFJNIFactory.TAG
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "decode bytes error"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r5, r1, r0)
                int r5 = r5.getErrorCode()
                r6 = 103(0x67, float:1.44E-43)
                if (r5 != r6) goto L_0x0054
                tk.e r1 = new tk.e
                r1.<init>((byte[]) r4)
                goto L_0x0055
            L_0x0054:
                r1 = 0
            L_0x0055:
                if (r1 != 0) goto L_0x005d
                tk.b r4 = new tk.b
                r4.<init>()
                return r4
            L_0x005d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.emoji.decode.MMGIFJNIFactory.Companion.getDecoder(byte[], java.lang.String, java.lang.Boolean):tk.d");
        }

        public final Bitmap decodeThumb(byte[] bArr) {
            return decodeThumbInternal(getDecoder(bArr));
        }

        public final Bitmap decodeThumb(byte[] bArr, String str, boolean z) {
            C87412m.m108594g(str, "cacheKey");
            return decodeThumbInternal(getDecoder(bArr, str, Boolean.valueOf(z)));
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x00a7  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00ad A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p384tk.C101900d getDecoder(com.tencent.p014mm.storage.emotion.EmojiInfo r6) {
            /*
                r5 = this;
                java.lang.Class<z51.g> r0 = z51.C39315g.class
                java.lang.String r1 = "emojiInfo"
                gy3.C87412m.m108594g(r6, r1)
                int r1 = r6.field_catalog     // Catch:{ MMGIFException -> 0x0069 }
                r2 = 18
                if (r1 == r2) goto L_0x0059
                com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r2 = com.tencent.p014mm.storage.emotion.EmojiInfo.f284123W1     // Catch:{ MMGIFException -> 0x0069 }
                r2 = 50
                if (r1 == r2) goto L_0x0059
                r2 = 49
                if (r1 != r2) goto L_0x0018
                goto L_0x0059
            L_0x0018:
                boolean r1 = r6.mo62637I0()     // Catch:{ MMGIFException -> 0x0069 }
                if (r1 == 0) goto L_0x0036
                tk.f r1 = new tk.f     // Catch:{ MMGIFException -> 0x0069 }
                android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ MMGIFException -> 0x0069 }
                java.lang.String r3 = r6.getName()     // Catch:{ MMGIFException -> 0x0069 }
                java.io.InputStream r2 = v51.C52762d.m59141a(r2, r3)     // Catch:{ MMGIFException -> 0x0069 }
                java.lang.String r3 = "getEmojiFile(MMApplicati…ontext(), emojiInfo.name)"
                gy3.C87412m.m108593f(r2, r3)     // Catch:{ MMGIFException -> 0x0069 }
                r1.<init>((java.io.InputStream) r2)     // Catch:{ MMGIFException -> 0x0069 }
                goto L_0x00a5
            L_0x0036:
                di3.d r1 = di3.C86312j.m106911c(r0)     // Catch:{ MMGIFException -> 0x0069 }
                z51.g r1 = (z51.C39315g) r1     // Catch:{ MMGIFException -> 0x0069 }
                zc3.b r1 = r1.getProvider()     // Catch:{ MMGIFException -> 0x0069 }
                byte[] r1 = r1.mo138036u(r6)     // Catch:{ MMGIFException -> 0x0069 }
                if (r1 == 0) goto L_0x00a4
                boolean r2 = com.tencent.p014mm.sdk.platformtools.ImgUtil.isWXGF((byte[]) r1)     // Catch:{ MMGIFException -> 0x0069 }
                if (r2 == 0) goto L_0x0052
                tk.h r2 = new tk.h     // Catch:{ MMGIFException -> 0x0069 }
                r2.<init>(r1)     // Catch:{ MMGIFException -> 0x0069 }
                goto L_0x0057
            L_0x0052:
                tk.f r2 = new tk.f     // Catch:{ MMGIFException -> 0x0069 }
                r2.<init>((byte[]) r1)     // Catch:{ MMGIFException -> 0x0069 }
            L_0x0057:
                r1 = r2
                goto L_0x00a5
            L_0x0059:
                tk.e r1 = new tk.e     // Catch:{ MMGIFException -> 0x0069 }
                android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ MMGIFException -> 0x0069 }
                r3 = 300(0x12c, float:4.2E-43)
                android.graphics.Bitmap r2 = r6.mo62657d1(r2, r3)     // Catch:{ MMGIFException -> 0x0069 }
                r1.<init>((android.graphics.Bitmap) r2)     // Catch:{ MMGIFException -> 0x0069 }
                goto L_0x00a5
            L_0x0069:
                r1 = move-exception
                java.lang.String r2 = com.tencent.p014mm.emoji.decode.MMGIFJNIFactory.TAG
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "decode error: "
                r3.append(r4)
                int r4 = r1.getErrorCode()
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r3)
                int r1 = r1.getErrorCode()
                r2 = 103(0x67, float:1.44E-43)
                if (r1 != r2) goto L_0x00a4
                di3.d r0 = di3.C86312j.m106911c(r0)
                z51.g r0 = (z51.C39315g) r0
                zc3.b r0 = r0.getProvider()
                byte[] r6 = r0.mo138036u(r6)
                if (r6 == 0) goto L_0x00a4
                tk.e r1 = new tk.e
                r1.<init>((byte[]) r6)
                goto L_0x00a5
            L_0x00a4:
                r1 = 0
            L_0x00a5:
                if (r1 != 0) goto L_0x00ad
                tk.b r6 = new tk.b
                r6.<init>()
                return r6
            L_0x00ad:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.emoji.decode.MMGIFJNIFactory.Companion.getDecoder(com.tencent.mm.storage.emotion.EmojiInfo):tk.d");
        }
    }
}
