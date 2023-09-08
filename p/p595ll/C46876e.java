package p595ll;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import fy3.C32226l;
import hp3.C87581a;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C101776f80;
import te3.C49978jd3;
import te3.C50892pz1;
import z51.C39315g;

/* renamed from: ll.e */
public final class C46876e<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ String f126067a;

    /* renamed from: b */
    public final /* synthetic */ C32226l<Integer, C13598b0> f126068b;

    public C46876e(String str, C32226l<? super Integer, C13598b0> lVar) {
        this.f126067a = str;
        this.f126068b = lVar;
    }

    public Object call(Object obj) {
        C49978jd3 jd32;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        int i = cVar.f256793a;
        int i2 = cVar.f256794b;
        Log.m105924i("MicroMsg.EmojiPackSyncManager", "CgiGetEmotionDetail end: " + i + ", " + i2);
        C50892pz1 pz12 = (C50892pz1) cVar.f256796d;
        if (i == 0 && i2 == 0) {
            ((C39315g) C86312j.m106911c(C39315g.class)).mo58034O6().mo57719f().mo61537Lo(this.f126067a, pz12, LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext()));
            C101776f80 f802 = pz12.f140062d;
            if (!(f802 == null || (jd32 = f802.f298229E) == null)) {
                this.f126068b.invoke(Integer.valueOf(jd32.f136019d));
            }
        }
        return C13598b0.f38549a;
    }
}
