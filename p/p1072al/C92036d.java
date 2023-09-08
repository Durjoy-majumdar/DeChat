package p1072al;

import com.tencent.p014mm.api.IEmojiInfo;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: al.d */
public final class C92036d extends C92043g<C13598b0> {

    /* renamed from: c */
    public final C92042f f263556c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92036d(IEmojiInfo iEmojiInfo, C92042f fVar) {
        super(iEmojiInfo);
        C87412m.m108594g(iEmojiInfo, "emojiInfo");
        this.f263556c = fVar;
    }

    /* renamed from: c */
    public void mo126009c(boolean z) {
        C92042f fVar = this.f263556c;
        if (fVar != null) {
            fVar.mo55799a(z);
        }
    }

    /* renamed from: f */
    public void mo126010f(boolean z) {
        if (this.f263567a.mo62633C1()) {
            mo126009c(true);
        } else {
            mo126013d(z);
        }
    }
}
