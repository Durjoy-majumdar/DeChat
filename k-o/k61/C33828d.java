package k61;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import eb0.C86497v5;
import f40.C86709a0;
import j61.C33522n;
import java.util.Map;
import l20.C21388a;
import ob0.C35136m;
import p327ct.C30914c;
import sf0.C48374j0;
import te3.C77949j3;

/* renamed from: k61.d */
public class C33828d implements C86497v5.C31521b {

    /* renamed from: k61.d$a */
    public class C33829a {

        /* renamed from: a */
        public int f91444a;

        /* renamed from: b */
        public int f91445b;

        /* renamed from: c */
        public String f91446c;

        public C33829a(C33828d dVar, int i, int i2, String str, String str2) {
            this.f91444a = i;
            this.f91445b = i2;
            this.f91446c = str;
        }
    }

    /* renamed from: d */
    public static void m40153d(C33829a aVar) {
        Class cls = C30914c.class;
        if (aVar == null) {
            Log.m105928w("MicroMsg.emoji.EmojiNewFreeSysCmdMsgListener", "xml is null.");
            return;
        }
        if (aVar.f91444a > 0) {
            C86709a0.m107535s().mo121142i().mo119676J(208899, Boolean.TRUE);
            ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33509r(262147, true);
        }
        if (aVar.f91445b > 0) {
            C86709a0.m107535s().mo121142i().mo119676J(208913, Boolean.TRUE);
            ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33509r(262149, true);
        }
        if (!Util.isNullOrNil(aVar.f91446c)) {
            Log.m105919d("MicroMsg.emoji.EmojiNewFreeSysCmdMsgListener", "Thumb URL %s", aVar.f91446c);
            C86709a0.m107535s().mo121142i().mo119676J(229633, aVar.f91446c);
            C85801v1 i = C86709a0.m107535s().mo121142i();
            i.mo119676J(229634, System.currentTimeMillis() + "");
            return;
        }
        C86709a0.m107535s().mo121142i().mo119676J(229633, "");
        C86709a0.m107535s().mo121142i().mo119676J(229634, "");
    }

    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
    }

    /* renamed from: Y */
    public void mo9066Y(C35136m.C35137a aVar) {
        C77949j3 j3Var = aVar.f94242a;
        int i = j3Var.f227630g;
        if (i == 10002) {
            String g = C48374j0.m53718g(j3Var.f227631h);
            if (Util.isNullOrNil(g)) {
                Log.m105928w("MicroMsg.emoji.EmojiNewFreeSysCmdMsgListener", "msg content is null");
                return;
            }
            Map<String, String> parseXml = XmlParser.parseXml(g, "sysmsg", (String) null);
            if (parseXml != null && parseXml.size() > 0) {
                String str = parseXml.get(".sysmsg.$type");
                if (Util.isNullOrNil(str) || !str.equalsIgnoreCase("emotionstore")) {
                    Log.m105920e("MicroMsg.emoji.EmojiNewFreeSysCmdMsgListener", "not emoji message type :" + str);
                    return;
                }
                try {
                    String str2 = parseXml.get(".sysmsg.emotionstore.productid");
                    String str3 = parseXml.get(".sysmsg.emotionstore.newcount");
                    String str4 = parseXml.get(".sysmsg.emotionstore.freecount");
                    C33829a aVar2 = new C33829a(this, !Util.isNullOrNil(str3) ? Integer.valueOf(str3).intValue() : 0, !TextUtils.isEmpty(str4) ? Integer.valueOf(str4).intValue() : 0, parseXml.get(".sysmsg.emotionstore.thumburl"), str2);
                    if (!Util.isNullOrNil(str2)) {
                        Log.m105925i("MicroMsg.emoji.EmojiNewFreeSysCmdMsgListener", "new xml productid is %s. now try to get download flag", str2);
                        C86709a0.m107529k().f251779b.mo123460f(new C33522n(str2, aVar2));
                    } else {
                        m40153d(aVar2);
                    }
                    String str5 = parseXml.get(".sysmsg.personalemotion.newcount");
                    if (!Util.isNullOrNil(str5) && Integer.valueOf(str5).intValue() > 0) {
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_EMOJI_STORE_NEW_ORIGINAL_BOOLEAN, Boolean.TRUE);
                    }
                    String str6 = parseXml.get(".sysmsg.personalemoji.emojicount");
                    if (!Util.isNullOrNil(str6) && Integer.valueOf(str6).intValue() > 0) {
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_EMOJI_STORE_NEW_DESIGNER_EMOJI_BOOLEAN, Boolean.TRUE);
                    }
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.emoji.EmojiNewFreeSysCmdMsgListener", "onRecieveMsg:%s", Util.stackTraceToString(e));
                }
            }
        } else {
            Log.m105925i("MicroMsg.emoji.EmojiNewFreeSysCmdMsgListener", "not new xml type:%d ", Integer.valueOf(i));
        }
    }
}
