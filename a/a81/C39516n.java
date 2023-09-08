package a81;

import com.tencent.p014mm.plugin.exdevice.service.C18693i;
import com.tencent.p014mm.sdk.platformtools.Log;
import junit.framework.Assert;
import n71.C47172c;

/* renamed from: a81.n */
public class C39516n extends C18693i.C18694a {

    /* renamed from: e */
    public C47172c f106097e = null;

    public C39516n(C47172c cVar) {
        Assert.assertNotNull(cVar);
        this.f106097e = cVar;
    }

    public int Km0() {
        return this.f106097e.mo72251b();
    }

    public long getDeviceId() {
        Log.m105924i("MicroMsg.exdevice.RemoteExDeviceTaskRequest", "getDeviceId : " + this.f106097e.f126719a);
        return this.f106097e.f126719a;
    }

    /* renamed from: gh */
    public int mo23534gh() {
        return this.f106097e.mo72250a();
    }

    /* renamed from: qq */
    public byte[] mo23535qq() {
        return this.f106097e.mo72252c();
    }

    /* renamed from: rX */
    public int mo23536rX() {
        return this.f106097e.f126720b;
    }
}
