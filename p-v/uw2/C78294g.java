package uw2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import java.util.Map;
import o90.C100308d;
import p823sg.C101611g;
import q90.C101062d;

/* renamed from: uw2.g */
public class C78294g {

    /* renamed from: h */
    public static final C101611g<Integer, C78294g> f229340h = new C100308d(100);

    /* renamed from: a */
    public int f229341a;

    /* renamed from: b */
    public int f229342b;

    /* renamed from: c */
    public String f229343c;

    /* renamed from: d */
    public int f229344d;

    /* renamed from: e */
    public int f229345e;

    /* renamed from: f */
    public String f229346f;

    /* renamed from: g */
    public int f229347g;

    /* renamed from: a */
    public static C78294g m94582a(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        int indexOf = str.indexOf(60);
        if (indexOf > 0) {
            str = str.substring(indexOf);
        }
        int hashCode = str.hashCode();
        C101611g<Integer, C78294g> gVar = f229340h;
        C78294g gVar2 = (C78294g) ((C101062d) gVar).get(Integer.valueOf(hashCode));
        if (gVar2 != null) {
            return gVar2;
        }
        Map<String, String> parseXml = XmlParser.parseXml(str, "msg", (String) null);
        if (parseXml == null) {
            Log.m105920e("MicroMsg.VoiceRemindAppMsgExInfo", "parse msg failed");
            return null;
        }
        try {
            C78294g gVar3 = new C78294g();
            gVar3.f229347g = Util.getInt(parseXml.get(".msg.appmsg.appattach.totallen"), 0);
            gVar3.f229346f = parseXml.get(".msg.appmsg.appattach.attachid");
            String str2 = parseXml.get(".msg.appmsg.appattach.fileext");
            gVar3.f229341a = Util.getInt(parseXml.get(".msg.appmsg.voicecmd.reminder.$remindtime"), 0);
            gVar3.f229342b = Util.getInt(parseXml.get(".msg.appmsg.voicecmd.reminder.$remindid"), 0);
            gVar3.f229343c = parseXml.get(".msg.appmsg.voicecmd.reminder.$remindattachid");
            gVar3.f229344d = Util.getInt(parseXml.get(".msg.appmsg.voicecmd.reminder.$remindattachtotallen"), 0);
            Util.getInt(parseXml.get(".msg.appmsg.voicecmd.reminder.$remindformat"), 0);
            Util.getInt(parseXml.get(".msg.appmsg.voicecmd.reminder.$originformat"), 0);
            gVar3.f229345e = Util.getInt(parseXml.get(".msg.appmsg.voicecmd.reminder.$msgsvrid"), 0);
            ((C101062d) gVar).mo139557c(Integer.valueOf(hashCode), gVar3);
            return gVar3;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.VoiceRemindAppMsgExInfo", "parse amessage xml failed");
            Log.printErrStackTrace("MicroMsg.VoiceRemindAppMsgExInfo", e, "", new Object[0]);
            return null;
        }
    }
}
