package p534gl;

import com.tencent.p014mm.autogen.mmdata.rpt.SuggestEmoiconWordListStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import h81.C32735h;
import p490dl.C31198d;
import p490dl.C97491p;
import rx3.C13598b0;

/* renamed from: gl.k */
public final class C32478k extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public static final C32478k f86290d = new C32478k();

    public C32478k() {
        super(0);
    }

    public Object invoke() {
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_emoji_suggest_personal_words_interval, 0);
        C97491p pVar = C97491p.f286143a;
        pVar.mo136773a(false);
        int i = pVar.mo136774c().getInt("word_list_update_time", 0);
        Log.m105924i("MicroMsg.EmojiSuggestCache", "checkWordListUpdate: config " + Qe + ", last " + i + ", running " + C32480m.f86292a);
        if (Qe > 0 && Util.secondsToNow((long) i) >= ((long) Qe) * 3600 && !C32480m.f86292a) {
            C32480m.f86292a = true;
            SuggestEmoiconWordListStruct suggestEmoiconWordListStruct = new SuggestEmoiconWordListStruct();
            suggestEmoiconWordListStruct.f79184d = Util.nowMilliSecond();
            new C31198d().mo9225i().mo123420E(new C32479l(suggestEmoiconWordListStruct));
        }
        return C13598b0.f38549a;
    }
}
