package t52;

import c63.C67346c;
import com.tencent.p014mm.plugin.wallet_core.model.mall.MallNews;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import eb0.C86497v5;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.HashMap;
import l20.C21388a;
import ob0.C35136m;
import p327ct.C30914c;
import s52.C36626n;
import sf0.C48374j0;

/* renamed from: t52.d */
public class C36952d implements C86497v5.C31521b {

    /* renamed from: t52.d$a */
    public class C36953a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f98024d;

        public C36953a(C36952d dVar, String str) {
            this.f98024d = str;
        }

        public void run() {
            C67346c b = C67346c.m79699b();
            String str = this.f98024d;
            b.getClass();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WALLET_ENTRY_REDDOT_WALLET_REGION_TYPE_INT_SYNC;
            C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_WALLET_ENTRY_REDDOT_WALLET_REGION_INT_SYNC;
            C72994y1.C72995a aVar3 = C72994y1.C72995a.USERINFO_WALLET_ENTRY_REDDOT_PUSH_DATE_LONG_SYNC;
            Class cls = C30914c.class;
            MallNews e = C67346c.m79700e(str);
            if (e == null) {
                return;
            }
            if (!"2".equals(e.f209757u)) {
                ((HashMap) b.f193199a).put(e.f209745f, e);
                Log.m105924i("MicroMsg.MallNewsManager", "onRecieveMsg : " + str);
                b.mo91482g();
                C86709a0.m107528h();
                String str2 = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_MALL_NEWS_MARKED_STRING_SYNC, "");
                ArrayList<String> stringsToList = Util.stringsToList(str2.split(","));
                Log.m105925i("MicroMsg.MallNewsManager", "tryCheckOutOfDateRedDot markedString %s", str2);
                if (!Util.isNullOrNil(e.f209746g) && stringsToList.contains(e.f209746g)) {
                    Log.m105924i("MicroMsg.MallNewsManager", "set OutOfDateRedDot");
                    return;
                }
                int i = e.f209758v;
                if (i == 0) {
                    int i2 = e.f209759w;
                    if (i2 == 0 || i2 == 1) {
                        Log.m105924i("MicroMsg.MallNewsManager", "showType New");
                        ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33509r(262156, true);
                        C86709a0.m107528h();
                        C86709a0.m107535s().mo121142i().mo119677K(aVar3, Long.valueOf(System.currentTimeMillis()));
                    } else {
                        Log.m105925i("MicroMsg.MallNewsManager", "showType New with wallet region:%d", Integer.valueOf(i2));
                        C86709a0.m107528h();
                        C86709a0.m107535s().mo121142i().mo119677K(aVar2, Integer.valueOf(e.f209759w));
                        C86709a0.m107528h();
                        C86709a0.m107535s().mo121142i().mo119677K(aVar, 1);
                    }
                } else if (i == 1) {
                    int i3 = e.f209759w;
                    if (i3 == 0 || i3 == 1) {
                        Log.m105918d("MicroMsg.MallNewsManager", "showType Dot");
                        ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33507p(262156, true);
                        C86709a0.m107528h();
                        C86709a0.m107535s().mo121142i().mo119677K(aVar3, Long.valueOf(System.currentTimeMillis()));
                    } else {
                        Log.m105925i("MicroMsg.MallNewsManager", "showType dot with wallet region:%d", Integer.valueOf(i3));
                        C86709a0.m107528h();
                        C86709a0.m107535s().mo121142i().mo119677K(aVar2, Integer.valueOf(e.f209759w));
                        C86709a0.m107528h();
                        C86709a0.m107535s().mo121142i().mo119677K(aVar, 2);
                    }
                }
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LQT_WALLET_RED_DOT_WORDING_STRING, "");
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LQT_WALLET_RED_DOT_INT, -1);
                return;
            }
            Log.m105918d("MicroMsg.MallNewsManager", "removeNews : " + e);
            MallNews mallNews = (MallNews) ((HashMap) b.f193199a).get(e.f209745f);
            if (mallNews == null || !mallNews.f209746g.equals(e.f209746g) || !mallNews.f209747h.equals(e.f209747h)) {
                Log.m105924i("MicroMsg.MallNewsManager", "onRecieveMsg cancel not found!");
                return;
            }
            Log.m105924i("MicroMsg.MallNewsManager", "onRecieveMsg remove : " + e.f209745f);
            ((HashMap) b.f193199a).remove(e.f209745f);
        }
    }

    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
    }

    /* renamed from: Y */
    public void mo9066Y(C35136m.C35137a aVar) {
        String g = C48374j0.m53718g(aVar.f94242a.f227631h);
        Log.m105918d("MallActivityNewXmlListener", "WalletNotifyConfXml:" + g);
        C36626n.vx0().f97368e.post(new C36953a(this, g));
    }
}
