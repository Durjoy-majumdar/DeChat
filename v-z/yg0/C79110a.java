package yg0;

import com.tencent.p014mm.sdk.platformtools.Log;
import i12.C76254a;
import i12.C76255b;

/* renamed from: yg0.a */
public class C79110a {

    /* renamed from: a */
    public C76254a f232271a = new C76254a();

    /* renamed from: a */
    public void mo109034a(C76255b bVar) {
        String str = bVar.f223379e;
        if (str == null || !str.equals("0")) {
            String str2 = bVar.f223379e;
            if (str2 != null && str2.equals("1")) {
                bVar.f223381g = bVar.f223380f;
                bVar.f223380f = "";
                bVar.f223386o = "";
                bVar.f223382h = "";
                bVar.f223383i = "";
                bVar.f223384j = "";
                bVar.f223389r = "";
                this.f232271a.f223377d.add(bVar);
            }
        } else {
            bVar.f223381g = "";
            bVar.f223387p = "";
            bVar.f223388q = "";
            this.f232271a.f223377d.add(bVar);
        }
        Log.m105924i("MicroMsg.InvoiceMgr", "type is error..");
    }
}
