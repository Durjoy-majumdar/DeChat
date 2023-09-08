package p490dl;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gy3.C87412m;
import i61.C98602h;
import p911ml.C99917g;
import z51.C39315g;
import zc3.C39343a;

/* renamed from: dl.q */
public final class C97493q {

    /* renamed from: a */
    public EmojiInfo f286146a;

    /* renamed from: b */
    public C97494a f286147b;

    /* renamed from: c */
    public final C39343a f286148c;

    /* renamed from: dl.q$a */
    public interface C97494a {
        /* renamed from: a */
        void mo136778a(int i, String str, String str2);
    }

    public C97493q(EmojiInfo emojiInfo, C97494a aVar) {
        C87412m.m108594g(emojiInfo, "emojiInfo");
        this.f286146a = emojiInfo;
        this.f286147b = aVar;
        C39343a cm = ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm();
        this.f286148c = cm;
        boolean z = false;
        if (!C86013q1.m106450k(this.f286146a.mo62640K1())) {
            C97494a aVar2 = this.f286147b;
            if (aVar2 != null) {
                aVar2.mo136778a(10, (String) null, (String) null);
            }
        } else {
            if (C86013q1.m106451l(this.f286146a.mo62640K1()) > ((long) ((C98602h) cm).mo137998F(this.f286146a, true))) {
                C97494a aVar3 = this.f286147b;
                if (aVar3 != null) {
                    aVar3.mo136778a(2, (String) null, (String) null);
                }
            } else {
                C97491p pVar = C97491p.f286143a;
                pVar.mo136773a(false);
                if (pVar.mo136774c().getBoolean("capture_full", false)) {
                    EmojiInfo emojiInfo2 = this.f286146a;
                    int i = emojiInfo2.field_captureUploadCounter;
                    if (i < 5) {
                        emojiInfo2.field_captureUploadCounter = i + 1;
                        C97494a aVar4 = this.f286147b;
                        if (aVar4 != null) {
                            aVar4.mo136778a(3, (String) null, (String) null);
                        }
                    } else {
                        C97494a aVar5 = this.f286147b;
                        if (aVar5 != null) {
                            aVar5.mo136778a(9, (String) null, (String) null);
                        }
                    }
                } else {
                    z = true;
                }
            }
        }
        if (z) {
            Log.m105924i("MicroMsg.EmojiUploadLogic", "start upload emoji");
            EmojiInfo emojiInfo3 = this.f286146a;
            C97495r rVar = new C97495r(this);
            C87412m.m108594g(emojiInfo3, "emojiInfo");
            new C99917g(emojiInfo3, true, rVar);
        }
    }
}
