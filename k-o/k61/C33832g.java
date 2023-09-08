package k61;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiGroupInfo;
import di3.C86312j;
import eb0.C86497v5;
import java.util.ArrayList;
import java.util.Map;
import ob0.C35136m;
import p441aq.C92054g;
import sf0.C48374j0;
import te3.C77949j3;
import wh3.C102450c;

/* renamed from: k61.g */
public class C33832g implements C86497v5.C31521b {
    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
    }

    /* renamed from: Y */
    public void mo9066Y(C35136m.C35137a aVar) {
        Class cls = C92054g.class;
        C77949j3 j3Var = aVar.f94242a;
        int i = j3Var.f227630g;
        if (i == 10002) {
            String g = C48374j0.m53718g(j3Var.f227631h);
            if (Util.isNullOrNil(g)) {
                Log.m105928w("MicroMsg.emoji.EmojiRecommnedSysCmdMsgListener", "msg content is null");
                return;
            }
            Map<String, String> parseXml = XmlParser.parseXml(g, "sysmsg", (String) null);
            if (parseXml != null && parseXml.size() > 0) {
                String str = parseXml.get(".sysmsg.$type");
                if (Util.isNullOrNil(str) || !str.equalsIgnoreCase("NewRecommendEmotion")) {
                    Log.m105920e("MicroMsg.emoji.EmojiRecommnedSysCmdMsgListener", "not emoji message type :" + str);
                    return;
                }
                ArrayList<EmojiGroupInfo> a = C99106f.m129077a(g);
                ((C92054g) C86312j.m106911c(cls)).getClass();
                C30790w2.m39221h().mo57715b().f301702d.delete("EmojiGroupInfo", "recommand=? and type!=? and status!=?", new String[]{"1", "2", "7"});
                ((C92054g) C86312j.m106911c(cls)).getClass();
                C102450c b = C30790w2.m39221h().mo57715b();
                b.getClass();
                Log.m105924i("MicroMsg.emoji.EmojiGroupInfoStorage", "[insertRecommendEmojiGroupInfo]");
                b.mo142033uP(a);
                return;
            }
            return;
        }
        Log.m105925i("MicroMsg.emoji.EmojiRecommnedSysCmdMsgListener", "not new xml type:%d ", Integer.valueOf(i));
    }
}
