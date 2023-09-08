package p595ll;

import com.tencent.p014mm.emoji.sync.C92668a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import gy3.C87412m;
import p595ll.C99504p;
import rx3.C13598b0;

/* renamed from: ll.m */
public final class C99501m implements C99504p.C99506b {

    /* renamed from: a */
    public final /* synthetic */ C92668a f291723a;

    public C99501m(C92668a aVar) {
        this.f291723a = aVar;
    }

    /* renamed from: a */
    public void mo138912a(int i, C99504p.C99505a aVar) {
        C87412m.m108594g(aVar, "emojiData");
        C92668a aVar2 = this.f291723a;
        synchronized (aVar2.f266719p) {
            EmojiInfo emojiInfo = aVar.f291736a;
            Log.m105924i(aVar2.f266706c, "onLoaderFin: " + emojiInfo.getMd5() + ' ' + i + ", " + aVar.f291737b);
            aVar2.f266713j.remove(emojiInfo.getMd5());
            if (aVar2.f266713j.size() <= 0) {
                aVar2.f266711h = false;
            }
            aVar2.f266716m++;
            int i2 = aVar.f291737b;
            if ((i2 % aVar2.f266705b.mo56309c() == 3) || !aVar2.f266711h) {
                int i3 = i2 + 1;
                if (aVar2.f266708e < i3) {
                    aVar2.f266708e = i3;
                }
                int i4 = aVar2.f266707d;
                int i5 = aVar2.f266716m + i4;
                aVar2.f266707d = i5;
                int i6 = aVar2.f266709f;
                if (i5 == i6 && i6 == aVar2.f266710g) {
                    aVar2.f266712i = true;
                }
                if (!aVar2.f266711h) {
                    aVar2.f266708e = i6;
                }
                for (C92668a.C92678k a : aVar2.f266714k) {
                    a.mo126716a(aVar2.f266707d - i4);
                }
                aVar2.f266716m = 0;
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }
}
