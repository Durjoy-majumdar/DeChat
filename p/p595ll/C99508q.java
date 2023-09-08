package p595ll;

import com.tencent.p014mm.storage.emotion.EmojiInfo;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import p260wk.C102457e;
import p595ll.C99504p;
import rx3.C13598b0;

/* renamed from: ll.q */
public final class C99508q extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C99504p f291739d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99508q(C99504p pVar) {
        super(0);
        this.f291739d = pVar;
    }

    public Object invoke() {
        while (this.f291739d.f291732a.size() > 0) {
            int size = this.f291739d.f291733b.size();
            this.f291739d.getClass();
            if (size >= 3) {
                break;
            }
            C99504p.C99505a removeFirst = this.f291739d.f291732a.removeFirst();
            HashMap<String, C99504p.C99505a> hashMap = this.f291739d.f291733b;
            String md5 = removeFirst.f291736a.getMd5();
            C87412m.m108593f(md5, "emojiInfo.emojiInfo.md5");
            hashMap.put(md5, removeFirst);
            C99504p pVar = this.f291739d;
            EmojiInfo emojiInfo = removeFirst.f291736a;
            pVar.getClass();
            C102457e.f301712a.mo142071c(emojiInfo, pVar.f291735d);
        }
        return C13598b0.f38549a;
    }
}
