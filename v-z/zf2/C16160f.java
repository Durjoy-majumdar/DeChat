package zf2;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCLong;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72972g4;
import f40.C86709a0;
import f62.C75700k0;

/* renamed from: zf2.f */
public class C16160f implements C80883e<IPCLong, IPCString> {
    public void invoke(Object obj, C1256g gVar) {
        String str;
        IPCLong iPCLong = (IPCLong) obj;
        Log.m105925i("MicroMsg.GetMailMsgTask", "get mail msg %d", Long.valueOf(iPCLong.f10314d));
        if (iPCLong.f10314d != 0) {
            str = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(iPCLong.f10314d).getContent();
        } else {
            str = "";
        }
        gVar.mo894a(new IPCString(str));
    }
}
