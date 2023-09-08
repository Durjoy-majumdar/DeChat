package p441aq;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C96985s2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import p008bq.C39833l0;
import p1072al.C92042f;

/* renamed from: aq.h */
public class C67097h implements C92042f {

    /* renamed from: a */
    public final /* synthetic */ C96985s2 f192686a;

    /* renamed from: b */
    public final /* synthetic */ EmojiInfo f192687b;

    /* renamed from: c */
    public final /* synthetic */ C92054g f192688c;

    public C67097h(C92054g gVar, C96985s2 s2Var, EmojiInfo emojiInfo) {
        this.f192688c = gVar;
        this.f192686a = s2Var;
        this.f192687b = emojiInfo;
    }

    /* renamed from: a */
    public void mo55799a(boolean z) {
        this.f192688c.Bx0(this.f192686a);
        C39833l0.C39834a aVar = this.f192688c.f263579n;
        if (aVar != null) {
            aVar.mo62471a(z, this.f192687b);
        } else {
            Log.m105924i("MicroMsg.EmojiFeatureService", "doCDNDownloadScene callback is null");
        }
    }
}
