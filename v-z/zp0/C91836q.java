package zp0;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Locale;
import lp3.C46888b;
import ob0.C47350c;
import pe3.C47465a;
import rp0.C90077a;
import te3.C49335eu3;
import zp0.C91829i;

/* renamed from: zp0.q */
public class C91836q implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ C46888b f262951a;

    /* renamed from: b */
    public final /* synthetic */ C91837r f262952b;

    public C91836q(C91837r rVar, C46888b bVar) {
        this.f262952b = rVar;
        this.f262951a = bVar;
    }

    /* renamed from: a */
    public void mo288a(int i, int i2, String str, C47350c cVar) {
        C91829i iVar;
        Log.m105925i("MicroMsg.WxaCgiServiceWC", "syncPipeline cgi[%s] errType[%d] errCode[%d] errMsg[%s]", this.f262952b.f262954b, Integer.valueOf(i), Integer.valueOf(i2), str);
        C47465a aVar = cVar.f127056b.f127083a;
        if (!(aVar instanceof C49335eu3)) {
            this.f262951a.mo72091a(new Exception(String.format(Locale.ENGLISH, "Invalid ResponseProtoBuf, %d %d %s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str})));
        } else if (C90077a.m112678a(i, i2, (C49335eu3) aVar)) {
            this.f262951a.mo72093c(cVar.f127056b.f127083a);
        } else {
            switch (i) {
                case 0:
                case 4:
                    iVar = new C91829i(C91829i.C91830a.SERVER, i2, str);
                    break;
                case 1:
                case 2:
                case 7:
                case 8:
                    iVar = new C91829i(C91829i.C91830a.NETWORK, i2, str);
                    break;
                case 5:
                    iVar = new C91829i(C91829i.C91830a.DECODE, i2, str);
                    break;
                case 6:
                    iVar = new C91829i(C91829i.C91830a.ENCODE, i2, str);
                    break;
                default:
                    iVar = new C91829i(C91829i.C91830a.SEND, i2, str);
                    break;
            }
            this.f262951a.mo72091a(iVar);
        }
    }
}
