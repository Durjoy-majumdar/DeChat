package p453bl;

import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p260wk.C102457e;
import p465cl.C92426d;
import p833zk.C103045g;
import p833zk.C103047h;
import rx3.C13598b0;

/* renamed from: bl.b */
public class C92271b extends C92273c {

    /* renamed from: p */
    public final String f264095p = "MicroMsg.EmojiLoadTask";

    /* renamed from: bl.b$a */
    public static final class C92272a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C92271b f264096d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92272a(C92271b bVar) {
            super(1);
            this.f264096d = bVar;
        }

        public Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            String str = this.f264096d.f264095p;
            Log.m105924i(str, this.f264096d.f264097f.getMd5() + " fetch " + booleanValue);
            if (booleanValue) {
                C92426d dVar = C92426d.f264475a;
                IEmojiInfo iEmojiInfo = this.f264096d.f264097f;
                C87412m.m108592e(iEmojiInfo, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
                boolean a = dVar.mo126427a((EmojiInfo) iEmojiInfo);
                String str2 = this.f264096d.f264095p;
                Log.m105924i(str2, this.f264096d.f264097f.getMd5() + " verify " + a);
                this.f264096d.mo126263f(a);
            } else {
                this.f264096d.mo126263f(false);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92271b(EmojiInfo emojiInfo) {
        super(emojiInfo);
        C87412m.m108594g(emojiInfo, "emojiInfo");
    }

    /* renamed from: e */
    public String mo126262e() {
        String md5 = this.f264097f.getMd5();
        C87412m.m108593f(md5, "emojiInfo.md5");
        return md5;
    }

    public void run() {
        this.f264099h = true;
        if (this.f264097f.mo62633C1()) {
            mo126263f(true);
            return;
        }
        C102457e eVar = C102457e.f301712a;
        if (C102457e.f301715d) {
            String str = this.f264095p;
            Log.m105928w(str, this.f264097f.getMd5() + ": mock download fail");
            mo126263f(false);
            return;
        }
        IEmojiInfo iEmojiInfo = this.f264097f;
        C87412m.m108592e(iEmojiInfo, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
        EmojiInfo emojiInfo = (EmojiInfo) iEmojiInfo;
        new C103045g(emojiInfo, new C103047h(emojiInfo, new C92272a(this)));
    }
}
