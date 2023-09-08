package p490dl;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import gy3.C87412m;
import i61.C98602h;
import p384tk.C101897a;
import p490dl.C97493q;
import p911ml.C99914f;
import z51.C39315g;
import zc3.C39343a;

/* renamed from: dl.r */
public final class C97495r implements C99914f.C99915a {

    /* renamed from: a */
    public final /* synthetic */ C97493q f286149a;

    public C97495r(C97493q qVar) {
        this.f286149a = qVar;
    }

    /* renamed from: a */
    public final void mo91183a(int i, String str) {
        Class cls = C39315g.class;
        if (i == 0) {
            C97493q qVar = this.f286149a;
            qVar.getClass();
            Log.m105924i("MicroMsg.EmojiUploadLogic", "deal success " + str);
            if (str != null && !C87412m.m108589b(str, qVar.f286146a.getMd5())) {
                EmojiInfo G = ((C98602h) qVar.f286148c).mo137999G(str);
                C87412m.m108593f(G, "emojiMgr.getEmojiByMd5(gifMd5)");
                qVar.f286146a = G;
            }
            C39343a aVar = qVar.f286148c;
            EmojiInfo emojiInfo = qVar.f286146a;
            ((C98602h) aVar).getClass();
            C101897a.m134075e().mo141394c(emojiInfo, false);
            ((C39315g) C86312j.m106911c(cls)).getProvider().mo138029o(qVar.f286146a);
            C97493q.C97494a aVar2 = qVar.f286147b;
            if (aVar2 != null) {
                aVar2.mo136778a(0, str, qVar.f286146a.field_activityid);
                return;
            }
            return;
        }
        if (!(i == 2 || i == 11)) {
            switch (i) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    EmojiInfo emojiInfo2 = this.f286149a.f286146a;
                    int i2 = emojiInfo2.field_captureUploadCounter;
                    if (i2 >= 5) {
                        i = 9;
                        break;
                    } else {
                        emojiInfo2.field_captureUploadCounter = i2 + 1;
                        ((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo138019f(this.f286149a.f286146a);
                        if (i != 3) {
                            i = 1;
                            break;
                        } else {
                            i = 3;
                            break;
                        }
                    }
            }
        }
        C97493q.C97494a aVar3 = this.f286149a.f286147b;
        if (aVar3 != null) {
            aVar3.mo136778a(i, (String) null, (String) null);
        }
    }
}
