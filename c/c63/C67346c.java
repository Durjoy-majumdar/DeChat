package c63;

import com.tencent.p014mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.p014mm.plugin.wallet_core.model.mall.MallNews;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import l20.C21388a;
import p327ct.C30914c;

/* renamed from: c63.c */
public class C67346c {

    /* renamed from: b */
    public static C67346c f193198b;

    /* renamed from: a */
    public Map<String, MallNews> f193199a;

    public C67346c() {
        HashMap hashMap = new HashMap();
        this.f193199a = hashMap;
        hashMap.clear();
        C86709a0.m107528h();
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(270339, "");
        Log.m105918d("MicroMsg.MallNewsManager", "data : " + str);
        for (String e : Util.stringsToList(str.split(";"))) {
            MallNews e2 = m79700e(e);
            if (e2 != null) {
                this.f193199a.put(e2.f209745f, e2);
            }
        }
    }

    /* renamed from: a */
    public static void m79698a() {
        Log.m105918d("MicroMsg.MallNewsManager", "clearMallNew ");
        ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33499h(262156, 266248);
    }

    /* renamed from: b */
    public static C67346c m79699b() {
        if (f193198b == null) {
            f193198b = new C67346c();
        }
        return f193198b;
    }

    /* renamed from: e */
    public static MallNews m79700e(String str) {
        Map<String, String> parseXml;
        if (Util.isNullOrNil(str) || (parseXml = XmlParser.parseXml(str, "sysmsg", (String) null)) == null) {
            return null;
        }
        try {
            MallNews mallNews = new MallNews(parseXml.get(".sysmsg.mallactivity.functionid"));
            mallNews.f209746g = parseXml.get(".sysmsg.mallactivity.activityid");
            mallNews.f209747h = parseXml.get(".sysmsg.mallactivity.ticket");
            mallNews.f209757u = parseXml.get(".sysmsg.mallactivity.type");
            mallNews.f209758v = Util.getInt(parseXml.get(".sysmsg.mallactivity.showtype"), 0);
            mallNews.f209759w = Util.getInt(parseXml.get(".sysmsg.mallactivity.walletregion"), 0);
            if (parseXml.containsKey(".sysmsg.mallactivity.showflag")) {
                mallNews.f209743d = parseXml.get(".sysmsg.mallactivity.showflag");
            } else {
                mallNews.f209743d = "0";
            }
            if (parseXml.containsKey(".sysmsg.mallactivity.newsTipFlag")) {
                mallNews.f209744e = parseXml.get(".sysmsg.mallactivity.newsTipFlag");
            } else {
                mallNews.f209744e = "0";
            }
            mallNews.f209754r = str;
            if (Util.isNullOrNil(mallNews.f209745f)) {
                return null;
            }
            return mallNews;
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.MallNewsManager", "cmdid error");
            return null;
        }
    }

    /* renamed from: c */
    public String mo91479c(String str) {
        MallNews mallNews = (MallNews) ((HashMap) this.f193199a).get(str);
        if (mallNews == null || Util.isNullOrNil(mallNews.f209747h)) {
            return null;
        }
        return mallNews.f209747h;
    }

    /* renamed from: d */
    public void mo91480d(MallFunction mallFunction) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_MALL_NEWS_MARKED_STRING_SYNC;
        try {
            if (!Util.isNullOrNil(mallFunction.f209739o.f209746g)) {
                C86709a0.m107528h();
                ArrayList<String> stringsToList = Util.stringsToList(((String) C86709a0.m107535s().mo121142i().mo119685f(aVar, "")).split(","));
                while (stringsToList.size() > 20) {
                    stringsToList.remove(0);
                }
                if (!stringsToList.contains(mallFunction.f209739o.f209746g)) {
                    stringsToList.add(mallFunction.f209739o.f209746g);
                    String listToString = Util.listToString(stringsToList, ",");
                    Log.m105925i("MicroMsg.MallNewsManager", "doSelectFunction %s, markedString %s", mallFunction.f209739o.f209746g, listToString);
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, listToString);
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MallNewsManager", e, "error in markedFunction", new Object[0]);
        }
    }

    /* renamed from: f */
    public MallNews mo91481f(String str) {
        Log.m105918d("MicroMsg.MallNewsManager", "removeNewsInIndexUI : " + str);
        if (Util.isNullOrNil(str) || !((HashMap) this.f193199a).containsKey(str)) {
            return null;
        }
        MallNews mallNews = (MallNews) ((HashMap) this.f193199a).get(str);
        if ("0".equals(mallNews.f209743d)) {
            mallNews.f209743d = "1";
            mo91482g();
        }
        return mallNews;
    }

    /* renamed from: g */
    public boolean mo91482g() {
        Log.m105918d("MicroMsg.MallNewsManager", "notifyNewsMap.size : " + ((HashMap) this.f193199a).size());
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : ((HashMap) this.f193199a).keySet()) {
            if (!Util.isNullOrNil(str)) {
                MallNews mallNews = (MallNews) ((HashMap) this.f193199a).get(str);
                stringBuffer.append(mallNews.f209754r.replace("</mallactivity></sysmsg>", "").replaceAll("<showflag>([^<]*)</showflag>", "").replaceAll("<newsTipFlag>([^<]*)</newsTipFlag>", "") + "<showflag>" + mallNews.f209743d + "</showflag><newsTipFlag>" + mallNews.f209744e + "</newsTipFlag></mallactivity></sysmsg>;");
            }
        }
        Log.m105918d("MicroMsg.MallNewsManager", "save data  : " + stringBuffer.toString());
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119676J(270339, stringBuffer.toString());
        return true;
    }
}
