package c63;

import com.tencent.p014mm.plugin.wallet_core.model.mall.MallNews;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import f40.C86709a0;
import java.util.HashMap;
import java.util.Map;

/* renamed from: c63.d */
public class C67347d {

    /* renamed from: b */
    public static C67347d f193200b;

    /* renamed from: a */
    public Map<String, MallNews> f193201a;

    public C67347d() {
        Map<String, String> parseXml;
        HashMap hashMap = new HashMap();
        this.f193201a = hashMap;
        hashMap.clear();
        C86709a0.m107528h();
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(270341, "");
        Log.m105918d("MicroMsg.MallNewsManagerNewVersion", "data : " + str);
        for (String next : Util.stringsToList(str.split(";"))) {
            MallNews mallNews = null;
            if (!Util.isNullOrNil(next) && (parseXml = XmlParser.parseXml(next, "sysmsg", (String) null)) != null) {
                try {
                    MallNews mallNews2 = new MallNews(parseXml.get(".sysmsg.mallactivitynew.functionid"));
                    mallNews2.f209746g = parseXml.get(".sysmsg.mallactivitynew.activityid");
                    mallNews2.f209757u = parseXml.get(".sysmsg.mallactivitynew.type");
                    mallNews2.f209758v = Util.getInt(parseXml.get(".sysmsg.mallactivitynew.showtype"), 0);
                    if (parseXml.containsKey(".sysmsg.mallactivitynew.showflag")) {
                        mallNews2.f209743d = parseXml.get(".sysmsg.mallactivitynew.showflag");
                    } else {
                        mallNews2.f209743d = "0";
                    }
                    if (parseXml.containsKey(".sysmsg.mallactivitynew.newsTipFlag")) {
                        mallNews2.f209744e = parseXml.get(".sysmsg.mallactivitynew.newsTipFlag");
                    } else {
                        mallNews2.f209744e = "0";
                    }
                    mallNews2.f209754r = next;
                    if (!Util.isNullOrNil(mallNews2.f209745f)) {
                        mallNews = mallNews2;
                    }
                } catch (Exception unused) {
                    Log.m105920e("MicroMsg.MallNewsManagerNewVersion", "cmdid error");
                }
            }
            if (mallNews != null) {
                this.f193201a.put(mallNews.f209745f, mallNews);
            }
        }
    }

    /* renamed from: b */
    public static C67347d m79705b() {
        if (f193200b == null) {
            f193200b = new C67347d();
        }
        return f193200b;
    }

    /* renamed from: a */
    public void mo91483a(MallNews mallNews) {
        if (mallNews == null) {
            Log.m105928w("MicroMsg.MallNewsManagerNewVersion", "null obj");
            return;
        }
        mallNews.f209754r = "<sysmsg><mallactivitynew><functionid>" + mallNews.f209745f + "</functionid><activityid>" + mallNews.f209746g + "</activityid><type>" + mallNews.f209757u + "</type><showflag>" + mallNews.f209743d + "</showflag><newsTipFlag>" + mallNews.f209744e + "</newsTipFlag></mallactivitynew></sysmsg>;";
        ((HashMap) this.f193201a).put(mallNews.f209745f, mallNews);
        mo91486e();
    }

    /* renamed from: c */
    public MallNews mo91484c(String str) {
        return (MallNews) ((HashMap) this.f193201a).get(str);
    }

    /* renamed from: d */
    public MallNews mo91485d(String str) {
        Log.m105918d("MicroMsg.MallNewsManagerNewVersion", "removeNewsInIndexUI : " + str);
        if (Util.isNullOrNil(str) || !((HashMap) this.f193201a).containsKey(str)) {
            return null;
        }
        MallNews mallNews = (MallNews) ((HashMap) this.f193201a).get(str);
        if ("0".equals(mallNews.f209743d)) {
            mallNews.f209743d = "1";
            mo91486e();
        }
        return mallNews;
    }

    /* renamed from: e */
    public boolean mo91486e() {
        Log.m105918d("MicroMsg.MallNewsManagerNewVersion", "notifyNewsMap.size : " + ((HashMap) this.f193201a).size());
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : ((HashMap) this.f193201a).keySet()) {
            if (!Util.isNullOrNil(str)) {
                MallNews mallNews = (MallNews) ((HashMap) this.f193201a).get(str);
                stringBuffer.append(mallNews.f209754r.replace("</mallactivitynew></sysmsg>;", "").replaceAll("<activityid>([^<]*)</activityid>", "").replaceAll("<type>([^<]*)</type>", "").replaceAll("<showflag>([^<]*)</showflag>", "").replaceAll("<newsTipFlag>([^<]*)</newsTipFlag>", "") + "<activityid>" + mallNews.f209746g + "</activityid><type>" + mallNews.f209757u + "</type><showflag>" + mallNews.f209743d + "</showflag><newsTipFlag>" + mallNews.f209744e + "</newsTipFlag></mallactivitynew></sysmsg>;");
            }
        }
        Log.m105918d("MicroMsg.MallNewsManagerNewVersion", "save data  : " + stringBuffer.toString());
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119676J(270341, stringBuffer.toString());
        return true;
    }
}
