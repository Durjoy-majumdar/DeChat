package a81;

import com.tencent.p014mm.plugin.exdevice.service.C18693i;
import com.tencent.p014mm.plugin.exdevice.service.C41194g;
import com.tencent.p014mm.plugin.exdevice.service.C41200j;
import junit.framework.Assert;
import n71.C47172c;

/* renamed from: a81.m */
public class C39515m extends C41200j.C41201a {

    /* renamed from: e */
    public C39516n f106095e = null;

    /* renamed from: f */
    public C39512l f106096f = null;

    public C39515m(C47172c cVar, C39503c cVar2) {
        Assert.assertNotNull(cVar);
        Assert.assertNotNull(cVar2);
        this.f106095e = new C39516n(cVar);
        this.f106096f = new C39512l(cVar2);
    }

    /* renamed from: e */
    public C39512l mo62119e() {
        Assert.assertNotNull(this.f106096f);
        return this.f106096f;
    }

    public C18693i getReqObj() {
        Assert.assertNotNull(this.f106095e);
        return this.f106095e;
    }

    public C41194g wb0() {
        Assert.assertNotNull(this.f106096f);
        return this.f106096f;
    }
}
