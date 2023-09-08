package a81;

import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82262v;
import com.tencent.p014mm.plugin.exdevice.model.C2234c1;
import com.tencent.p014mm.plugin.exdevice.model.C41171u1;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import y71.C53501k;

/* renamed from: a81.k */
public class C39511k extends C41171u1 implements C11385n {

    /* renamed from: d */
    public String f106081d;

    /* renamed from: e */
    public String f106082e;

    /* renamed from: f */
    public String f106083f;

    /* renamed from: g */
    public int f106084g;

    public C39511k(String str, String str2, String str3, int i) {
        this.f106081d = str;
        this.f106082e = str2;
        this.f106083f = str3;
        this.f106084g = i;
    }

    /* renamed from: a */
    public boolean mo62113a(C53501k kVar, C39504d dVar) {
        Log.m105924i("MicroMsg.exdevice.MMWifiStatusSubscribeTaskExcuter", "execute MMWifiStatusSubscribeTaskExcuter. brandName=" + this.f106081d + ",deviceType=" + this.f106082e + ",deviceId=" + this.f106083f + ",reqType=" + this.f106084g);
        C86709a0.m107529k().f251779b.mo123455a(C82262v.CTRL_INDEX, this);
        C86709a0.m107529k().f251779b.mo123460f(new C2234c1(this.f106081d, this.f106082e, this.f106083f, this.f106084g));
        return false;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.exdevice.MMWifiStatusSubscribeTaskExcuter", "onSceneEnd. errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        C86709a0.m107529k().f251779b.mo123470p(C82262v.CTRL_INDEX, this);
    }
}
