package ye2;

import com.tencent.p014mm.plugin.priority.model.c2c.img.C94293b;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import ke2.C99129c;
import p749xh.C102676x0;
import re2.C101373b;
import re2.C101374c;
import se2.C101590c;
import xe2.C102631b;

/* renamed from: ye2.d */
public class C102841d extends C102838a {

    /* renamed from: d */
    public String f303578d;

    public C102841d(String str) {
        this.f303578d = str;
    }

    /* renamed from: a */
    public String mo129622a() {
        return "PriorityDeleteContactTask";
    }

    public void run() {
        Class cls = C99129c.class;
        if (((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f303578d).mo62927s3()) {
            Log.m105925i("MicroMsg.Priority.PriorityDeleteContactTask", "%s is Contact", this.f303578d);
            return;
        }
        C99129c cVar = (C99129c) C86312j.m106911c(cls);
        cVar.requireAccountInitialized();
        C94293b bVar = cVar.f290661n;
        String str = this.f303578d;
        bVar.f272424d.bindString(1, str);
        Log.m105925i("MicroMsg.Priority.C2CMsgAutoDownloadImgStorage", "delete %d img %s", Integer.valueOf(bVar.f272423c.executeUpdateDelete()), str);
        C99129c cVar2 = (C99129c) C86312j.m106911c(cls);
        cVar2.requireAccountInitialized();
        cVar2.f290663p.mo140560c(this.f303578d);
        C99129c cVar3 = (C99129c) C86312j.m106911c(cls);
        cVar3.requireAccountInitialized();
        C101590c cVar4 = cVar3.f290662o;
        String str2 = this.f303578d;
        cVar4.f297411d.bindString(1, str2);
        Log.m105925i("MicroMsg.Priority.C2CMsgAutoDownloadFileStorage", "delete %d file %s", Integer.valueOf(cVar4.f297410c.executeUpdateDelete()), str2);
        C99129c cVar5 = (C99129c) C86312j.m106911c(cls);
        cVar5.requireAccountInitialized();
        cVar5.f290664q.mo140560c(this.f303578d);
        C99129c cVar6 = (C99129c) C86312j.m106911c(cls);
        cVar6.requireAccountInitialized();
        C101373b bVar2 = cVar6.f290666s;
        String str3 = this.f303578d;
        bVar2.getClass();
        String format = String.format("DELETE FROM %s WHERE chat = ?", new Object[]{"C2CChatUsageResult"});
        bVar2.f296950a.mo140222d(format, new String[]{str3});
        C99129c cVar7 = (C99129c) C86312j.m106911c(cls);
        cVar7.requireAccountInitialized();
        C101374c cVar8 = cVar7.f290665r;
        String str4 = this.f303578d;
        cVar8.getClass();
        String format2 = String.format("DELETE FROM %s WHERE chat = ?", new Object[]{"C2CChatUsage"});
        cVar8.f296951a.mo140222d(format2, new String[]{str4});
        C99129c cVar9 = (C99129c) C86312j.m106911c(cls);
        cVar9.requireAccountInitialized();
        C102631b bVar3 = cVar9.f290673z;
        String str5 = this.f303578d;
        bVar3.getClass();
        C87412m.m108594g(str5, "userName");
        int run = C102676x0.f303129u.delete().log("MicroMsg.C2CPreDownloadStorage").where(C102676x0.f303132x.equal(str5)).build().run(bVar3.getDbProvider().getDB());
        Log.m105924i("MicroMsg.C2CPreDownloadStorage", "deleteByMsgUserName >> userName:" + str5 + ", result:" + run);
    }
}
