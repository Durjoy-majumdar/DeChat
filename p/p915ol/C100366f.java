package p915ol;

import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.emoji.view.AbsEmojiView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import p1072al.C92042f;
import p260wk.C102457e;

/* renamed from: ol.f */
public final class C100366f implements AbsEmojiView.C92683a, C92042f {

    /* renamed from: a */
    public final AbsEmojiView f293965a;

    /* renamed from: b */
    public final String f293966b = "MicroMsg.EmojiViewDelegate";

    /* renamed from: c */
    public IEmojiInfo f293967c;

    public C100366f(AbsEmojiView absEmojiView) {
        C87412m.m108594g(absEmojiView, "view");
        this.f293965a = absEmojiView;
    }

    /* renamed from: a */
    public void mo55799a(boolean z) {
        this.f293965a.setStatusNotify(z ? 1 : -1);
    }

    /* renamed from: b */
    public IEmojiInfo mo126731b() {
        return this.f293967c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
        if (r0 != 49) goto L_0x004f;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo126732c(com.tencent.p014mm.api.IEmojiInfo r6) {
        /*
            r5 = this;
            r5.f293967c = r6
            com.tencent.mm.storage.emotion.EmojiInfo r6 = (com.tencent.p014mm.storage.emotion.EmojiInfo) r6
            if (r6 == 0) goto L_0x0083
            java.lang.String r0 = r5.f293966b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "reload: "
            r1.append(r2)
            java.lang.String r2 = r6.getMd5()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.emoji.view.AbsEmojiView r0 = r5.f293965a
            boolean r0 = r0.getGameUseCover()
            r1 = 1
            if (r0 == 0) goto L_0x004f
            int r0 = r6.field_catalog
            r2 = 18
            if (r0 == r2) goto L_0x003a
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r2 = com.tencent.p014mm.storage.emotion.EmojiInfo.f284123W1
            r2 = 50
            if (r0 == r2) goto L_0x003a
            r2 = 49
            if (r0 != r2) goto L_0x004f
        L_0x003a:
            com.tencent.mm.emoji.view.AbsEmojiView r0 = r5.f293965a
            r0.setStatusNotify(r1)
            com.tencent.mm.emoji.view.AbsEmojiView r0 = r5.f293965a
            android.content.Context r1 = r0.getContext()
            r2 = 300(0x12c, float:4.2E-43)
            android.graphics.Bitmap r6 = r6.mo62657d1(r1, r2)
            r0.setImageBitmap(r6)
            goto L_0x0092
        L_0x004f:
            com.tencent.mm.emoji.view.AbsEmojiView r0 = r5.f293965a
            r2 = 0
            r0.setStatusNotify(r2)
            wk.e r0 = p260wk.C102457e.f301712a
            com.tencent.mm.emoji.view.AbsEmojiView r0 = r5.f293965a
            java.lang.String r3 = "emojiView"
            gy3.C87412m.m108594g(r0, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "load emoji "
            r3.append(r4)
            java.lang.String r4 = r6.getMd5()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.EmojiLoader"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r3)
            al.e r3 = new al.e
            r3.<init>(r6, r0, r5)
            r6 = 0
            p1072al.C92043g.m115672g(r3, r2, r1, r6)
            goto L_0x0092
        L_0x0083:
            java.lang.String r6 = r5.f293966b
            java.lang.String r0 = "reload: emojiInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            wk.e r6 = p260wk.C102457e.f301712a
            com.tencent.mm.emoji.view.AbsEmojiView r0 = r5.f293965a
            r6.mo142070b(r0)
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p915ol.C100366f.mo126732c(com.tencent.mm.api.IEmojiInfo):void");
    }

    public void destroy() {
        String str = this.f293966b;
        Log.m105924i(str, "destroy: " + this);
        C102457e.f301712a.mo142070b(this.f293965a);
        this.f293965a.setStatusListener((AbsEmojiView.C92684b) null);
    }
}
