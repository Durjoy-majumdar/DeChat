package p813fl;

import com.tencent.p014mm.api.IEmojiInfo;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: fl.g */
public final class C97904g extends C97927q0 {

    /* renamed from: b */
    public final IEmojiInfo f287200b;

    /* renamed from: c */
    public final int f287201c;

    /* renamed from: d */
    public final String f287202d;

    /* renamed from: e */
    public final int f287203e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C97904g(com.tencent.p014mm.api.IEmojiInfo r4, int r5, java.lang.String r6, int r7) {
        /*
            r3 = this;
            java.lang.String r0 = "emojiInfo"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "sosDocId"
            gy3.C87412m.m108594g(r6, r0)
            com.tencent.mm.api.IEmojiInfo$a r0 = r4.mo62647T1()
            r1 = -1
            if (r0 != 0) goto L_0x0014
            r0 = -1
            goto L_0x001c
        L_0x0014:
            int[] r2 = p813fl.C97931s0.f287260a
            int r0 = r0.ordinal()
            r0 = r2[r0]
        L_0x001c:
            if (r0 == r1) goto L_0x0023
            r1 = 1
            if (r0 == r1) goto L_0x0023
            r0 = 6
            goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            r3.<init>(r0)
            r3.f287200b = r4
            r3.f287201c = r5
            r3.f287202d = r6
            r3.f287203e = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p813fl.C97904g.<init>(com.tencent.mm.api.IEmojiInfo, int, java.lang.String, int):void");
    }

    /* renamed from: a */
    public boolean mo136854a(Object obj) {
        if (equals(obj) && (obj instanceof C97904g)) {
            C97904g gVar = (C97904g) obj;
            return gVar.f287200b.mo62647T1() == this.f287200b.mo62647T1() && gVar.f287200b.getIndex() == this.f287200b.getIndex() && gVar.f287200b.mo62648U1() == this.f287200b.mo62648U1() && gVar.f287201c == this.f287201c;
        }
    }

    public boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof C97904g)) {
            C97904g gVar = (C97904g) obj;
            if (C87412m.m108589b(gVar.f287200b.getMd5(), this.f287200b.getMd5()) || (this.f287200b.mo62688q0() != 0 && gVar.f287200b.mo62688q0() == this.f287200b.mo62688q0())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C97904g(IEmojiInfo iEmojiInfo, int i, String str, int i2, int i3, C8480h hVar) {
        this(iEmojiInfo, i, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? 0 : i2);
    }
}
