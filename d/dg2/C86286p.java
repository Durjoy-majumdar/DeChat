package dg2;

import ag2.C79544u;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.qqmail.p090ui.ReadMailUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import java.util.Map;

/* renamed from: dg2.p */
public class C86286p implements C1256g<IPCString> {

    /* renamed from: d */
    public final /* synthetic */ ReadMailUI f250902d;

    public C86286p(ReadMailUI readMailUI) {
        this.f250902d = readMailUI;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        IPCString iPCString = (IPCString) obj;
        if (!this.f250902d.isFinishing() && !this.f250902d.isDestroyed() && iPCString != null && !Util.isNullOrNil(iPCString.f10315d)) {
            ReadMailUI readMailUI = this.f250902d;
            String str = iPCString.f10315d;
            C79544u uVar = null;
            Map<String, String> parseXml = XmlParser.parseXml(str, "msg", (String) null);
            if (parseXml == null) {
                Log.m105920e("MicroMsg.MailMsgHelper", "parse fail, maps is null");
            } else {
                Log.m105925i("MicroMsg.MailMsgHelper", "parse mail msg %s", str);
                uVar = new C79544u();
                uVar.f233213a = parseXml.get(".msg.pushmail.mailid");
                uVar.f233214b = parseXml.get(".msg.pushmail.content.date");
                uVar.f233215c = parseXml.get(".msg.pushmail.content.subject");
                int i = Util.getInt(parseXml.get(".msg.pushmail.content.fromlist.$count"), 0);
                int i2 = Util.getInt(parseXml.get(".msg.pushmail.content.tolist.$count"), 0);
                int i3 = Util.getInt(parseXml.get(".msg.pushmail.content.cclist.$count"), 0);
                for (int i4 = 0; i4 < i; i4++) {
                    Bundle bundle = new Bundle();
                    String str2 = ".msg.pushmail.content.fromlist.item";
                    if (i4 > 0) {
                        str2 = str2 + i4;
                    }
                    bundle.putString(FirebaseAnalytics.C113379b.ITEM_NAME, parseXml.get(str2 + ".name"));
                    bundle.putString("item_addr", parseXml.get(str2 + ".addr"));
                    uVar.f233216d.add(bundle);
                }
                for (int i5 = 0; i5 < i2; i5++) {
                    Bundle bundle2 = new Bundle();
                    String str3 = ".msg.pushmail.content.tolist.item";
                    if (i5 > 0) {
                        str3 = str3 + i5;
                    }
                    bundle2.putString(FirebaseAnalytics.C113379b.ITEM_NAME, parseXml.get(str3 + ".name"));
                    bundle2.putString("item_addr", parseXml.get(str3 + ".addr"));
                    uVar.f233217e.add(bundle2);
                }
                for (int i6 = 0; i6 < i3; i6++) {
                    Bundle bundle3 = new Bundle();
                    String str4 = ".msg.pushmail.content.cclist.item";
                    if (i6 > 0) {
                        str4 = str4 + i6;
                    }
                    bundle3.putString(FirebaseAnalytics.C113379b.ITEM_NAME, parseXml.get(str4 + ".name"));
                    bundle3.putString("item_addr", parseXml.get(str4 + ".addr"));
                    uVar.f233218f.add(bundle3);
                }
            }
            readMailUI.f248818e = uVar;
            if (this.f250902d.f248818e != null) {
                MMHandlerThread.postToMainThread(new C86278h(this));
            }
        }
    }
}
