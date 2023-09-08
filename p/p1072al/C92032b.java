package p1072al;

import android.graphics.Bitmap;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import p1072al.C92043g;
import p1089xk.C102688b;
import p260wk.C102457e;
import p453bl.C92273c;
import rx3.C13598b0;

/* renamed from: al.b */
public final class C92032b extends C92043g<Bitmap> {

    /* renamed from: c */
    public final C92043g.C92044a<Bitmap> f263547c;

    /* renamed from: d */
    public final String f263548d = "MicroMsg.EmojiCoverBitmapRequest";

    /* renamed from: al.b$a */
    public static final class C92033a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f263549d;

        /* renamed from: e */
        public final /* synthetic */ Bitmap f263550e;

        /* renamed from: f */
        public final /* synthetic */ C92032b f263551f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92033a(boolean z, Bitmap bitmap, C92032b bVar) {
            super(0);
            this.f263549d = z;
            this.f263550e = bitmap;
            this.f263551f = bVar;
        }

        public Object invoke() {
            Bitmap bitmap;
            if (!this.f263549d || (bitmap = this.f263550e) == null) {
                C92032b bVar = this.f263551f;
                C92043g.C92044a<Bitmap> aVar = bVar.f263547c;
                if (aVar != null) {
                    aVar.mo65752a(-1, bVar.f263567a, null);
                }
            } else {
                C92032b bVar2 = this.f263551f;
                C92043g.C92044a<Bitmap> aVar2 = bVar2.f263547c;
                if (aVar2 != null) {
                    aVar2.mo65752a(1, bVar2.f263567a, bitmap);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92032b(EmojiInfo emojiInfo, C92043g.C92044a<Bitmap> aVar) {
        super(emojiInfo);
        C87412m.m108594g(emojiInfo, "emojiInfo");
        this.f263547c = aVar;
    }

    /* renamed from: b */
    public C92273c mo126011b() {
        C102457e eVar = C102457e.f301712a;
        IEmojiInfo iEmojiInfo = this.f263567a;
        C87412m.m108592e(iEmojiInfo, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
        return eVar.mo142069a((EmojiInfo) iEmojiInfo);
    }

    /* renamed from: c */
    public void mo126009c(boolean z) {
        C61926c.m72668M(new C92033a(z, C102688b.f303300a.mo142498a(this.f263567a.getMd5()), this));
    }

    /* renamed from: f */
    public void mo126010f(boolean z) {
        Bitmap a = C102688b.f303300a.mo142498a(this.f263567a.getMd5());
        String str = this.f263548d;
        Log.m105918d(str, "start: " + this.f263567a.getMd5() + ", " + a);
        if (a != null) {
            mo126009c(true);
            return;
        }
        C92043g.C92044a<Bitmap> aVar = this.f263547c;
        if (aVar != null) {
            aVar.mo65752a(0, this.f263567a, null);
        }
        C92043g.m115671e(this, false, 1, (Object) null);
    }
}
