package p441aq;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.pluginsdk.p133ui.emoji.ChattingEmojiView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import gy3.C87412m;
import o40.C61926c;
import p008bq.C92289q0;
import p1072al.C92028a;
import p1072al.C92036d;
import p1072al.C92042f;
import p1072al.C92043g;
import p260wk.C102457e;
import p453bl.C92271b;
import p453bl.C92273c;
import p453bl.C92275e;
import u60.C65222f;
import u60.C65230i;

@C86522b
/* renamed from: aq.n */
public final class C92057n extends C86301e implements C92289q0 {
    /* renamed from: BA */
    public C92036d mo126041BA(IEmojiInfo iEmojiInfo, C92042f fVar) {
        C87412m.m108594g(iEmojiInfo, "emojiInfo");
        return C102457e.f301712a.mo142073e((EmojiInfo) iEmojiInfo, fVar);
    }

    /* renamed from: CQ */
    public void mo126042CQ(View view) {
        C87412m.m108594g(view, "view");
        C102457e.f301712a.mo142070b(view);
    }

    public C92273c En0(IEmojiInfo iEmojiInfo) {
        C87412m.m108594g(iEmojiInfo, "emojiInfo");
        C102457e eVar = C102457e.f301712a;
        EmojiInfo emojiInfo = (EmojiInfo) iEmojiInfo;
        C92273c cVar = C102457e.f301713b.get(emojiInfo.getMd5());
        return cVar == null ? C86709a0.m107531m().mo58407a().mo71804b() ? new C92271b(emojiInfo) : new C92275e(emojiInfo) : cVar;
    }

    /* renamed from: cM */
    public void mo126044cM(IEmojiInfo iEmojiInfo, ChattingEmojiView chattingEmojiView, String str) {
        C87412m.m108594g(iEmojiInfo, "emojiInfo");
        C87412m.m108594g(chattingEmojiView, "emojiView");
        C87412m.m108594g(str, "cacheKey");
        C102457e eVar = C102457e.f301712a;
        EmojiInfo emojiInfo = (EmojiInfo) iEmojiInfo;
        Log.m105918d("MicroMsg.EmojiLoader", "load emoji " + emojiInfo.getMd5());
        C92043g.m115672g(new C92028a(emojiInfo, chattingEmojiView, str), false, 1, (Object) null);
    }

    /* renamed from: e1 */
    public void mo126045e1(String str) {
        C87412m.m108594g(str, "key");
        C102457e eVar = C102457e.f301712a;
        Log.m105924i("MicroMsg.EmojiLoader", "removeTask: " + str);
        C92273c remove = C102457e.f301713b.remove(str);
        if (remove != null) {
            C65222f<C92273c> fVar = C102457e.f301714c;
            fVar.getClass();
            C61926c.m72668M(new C65230i(fVar, remove));
        }
    }

    public void ma0(IEmojiInfo iEmojiInfo, C92043g.C92044a<Bitmap> aVar) {
        C87412m.m108594g(iEmojiInfo, "emojiInfo");
        C102457e.f301712a.mo142071c((EmojiInfo) iEmojiInfo, aVar);
    }

    /* renamed from: to */
    public void mo126047to(String str, C92273c cVar, boolean z) {
        C87412m.m108594g(str, "key");
        C87412m.m108594g(cVar, "task");
        C102457e eVar = C102457e.f301712a;
        Log.m105924i("MicroMsg.EmojiLoader", "addTask: " + str + ' ' + z);
        C102457e.f301713b.put(str, cVar);
        if (z) {
            C102457e.f301714c.mo89348b(cVar);
        } else {
            cVar.run();
        }
    }
}
