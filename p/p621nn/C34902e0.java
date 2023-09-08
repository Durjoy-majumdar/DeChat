package p621nn;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import eb0.C86497v5;
import f40.C86709a0;
import java.util.Map;
import ob0.C35136m;
import sf0.C48374j0;
import y72.C102823h;

/* renamed from: nn.e0 */
public class C34902e0 implements C86497v5.C31521b {

    /* renamed from: nn.e0$a */
    public class C34903a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f93729d;

        /* renamed from: e */
        public final /* synthetic */ String f93730e;

        /* renamed from: f */
        public final /* synthetic */ byte[] f93731f;

        public C34903a(C34902e0 e0Var, String str, String str2, byte[] bArr) {
            this.f93729d = str;
            this.f93730e = str2;
            this.f93731f = bArr;
        }

        public void run() {
            Log.m105924i("MicroMsg.BackupCore.MsgSynchronize", "start MsgSynchronizeServer");
            if (C102823h.f303546f == null) {
                C102823h.f303546f = new C102823h();
            }
            C102823h.f303546f.mo142554d(this.f93729d, this.f93730e, this.f93731f, "");
        }
    }

    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
    }

    /* renamed from: Y */
    public void mo9066Y(C35136m.C35137a aVar) {
        Log.m105924i("MicroMsg.BackupCore.MsgSynchronize", "appMsgListener onreceive appmsg");
        String g = C48374j0.m53718g(aVar.f94242a.f227631h);
        Map<String, String> parseXml = XmlParser.parseXml(g, "appmsg", (String) null);
        Log.m105919d("MicroMsg.BackupCore.MsgSynchronize", "BackupCore msgcontent:%s", g);
        if (parseXml.get(".appmsg.action").equals("phone")) {
            Log.m105924i("MicroMsg.BackupCore.MsgSynchronize", "this appmsg is from phone, ignore.");
            return;
        }
        C86709a0.m107525e().postToWorker(new C34903a(this, parseXml.get(".appmsg.messageaction"), parseXml.get(".appmsg.extinfo"), parseXml.get(".appmsg.appattach.aeskey").getBytes()));
    }
}
