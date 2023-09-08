package r22;

import c30.C26827e;
import c30.C79923f;
import com.tencent.p014mm.plugin.address.model.RcptItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import ei3.C86522b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p244tt.C118512d;
import zg0.C119113p;

@C86522b
/* renamed from: r22.b */
public class C118216b extends C86301e implements C118512d {

    /* renamed from: d */
    public C119113p f353360d = new C119113p();

    /* renamed from: e */
    public List<RcptItem> f353361e;

    /* renamed from: V6 */
    public void mo183009V6() {
        this.f353360d.mo183782g();
        this.f353361e = this.f353360d.mo183780e(0);
    }

    public String getRegionInfo(String str, String str2) {
        C26827e eVar = new C26827e();
        try {
            if (!Util.isNullOrNil(str2)) {
                eVar = new C26827e(str2);
            }
            C26827e eVar2 = new C26827e();
            if (str.equals("province")) {
                Iterator it = ((ArrayList) this.f353361e).iterator();
                while (it.hasNext()) {
                    eVar2.mo53846q(((RcptItem) it.next()).f196786d);
                }
            } else if (str.equals("city")) {
                Iterator it4 = ((ArrayList) this.f353360d.mo183781f(((RcptItem) ((ArrayList) this.f353361e).get(eVar.getInt(0))).f196787e)).iterator();
                while (it4.hasNext()) {
                    eVar2.mo53846q(((RcptItem) it4.next()).f196786d);
                }
            } else if (str.equals("region")) {
                Iterator it5 = ((ArrayList) this.f353360d.mo183781f(((RcptItem) ((ArrayList) this.f353360d.mo183781f(((RcptItem) ((ArrayList) this.f353361e).get(eVar.getInt(0))).f196787e)).get(eVar.getInt(1))).f196787e)).iterator();
                while (it5.hasNext()) {
                    eVar2.mo53846q(((RcptItem) it5.next()).f196786d);
                }
            } else if (str.equals("subDistrict")) {
                Iterator it6 = ((ArrayList) this.f353360d.mo183781f(((RcptItem) ((ArrayList) this.f353360d.mo183781f(((RcptItem) ((ArrayList) this.f353360d.mo183781f(((RcptItem) ((ArrayList) this.f353361e).get(eVar.getInt(0))).f196787e)).get(eVar.getInt(1))).f196787e)).get(eVar.getInt(2))).f196787e)).iterator();
                while (it6.hasNext()) {
                    eVar2.mo53846q(((RcptItem) it6.next()).f196786d);
                }
                if (eVar2.length() == 0) {
                    eVar2.mo53846q("-");
                }
            }
            return eVar2.toString();
        } catch (C79923f e) {
            Log.m105920e("LiteAppAddressService", e.toString());
            return "";
        }
    }
}
