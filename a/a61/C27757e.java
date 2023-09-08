package a61;

import com.tencent.p014mm.autogen.events.CheckLanguageChangeEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30764p2;
import di3.C86312j;
import p441aq.C92054g;
import p490dl.C97489o;

/* renamed from: a61.e */
public class C27757e extends IStaticListener<CheckLanguageChangeEvent> {
    public boolean callback(IEvent iEvent) {
        CheckLanguageChangeEvent checkLanguageChangeEvent = (CheckLanguageChangeEvent) iEvent;
        C30764p2 Cd = ((C92054g) C86312j.m106911c(C92054g.class)).mo126027Cd();
        Cd.getClass();
        String lowerCase = LocaleUtil.getApplicationLanguage().toLowerCase();
        Log.m105925i("MicroMsg.emoji.EmojiDescNewMgr", "[cpan] language change Current Language:%s LastLanguage:%s", lowerCase, Cd.f82720b);
        if (!Cd.f82719a || (!Util.isNullOrNil(Cd.f82720b) && !Cd.f82720b.equalsIgnoreCase(lowerCase))) {
            Cd.mo57680g();
        }
        C97489o.m125592g().mo136772n(true);
        return false;
    }
}
