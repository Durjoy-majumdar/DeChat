package p284zb;

import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.plugin.appbrand.utils.C84754j1;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.pointers.PInt;
import js0.C9514m;

/* renamed from: zb.b$$g */
public class b$$g implements C84754j1.C84757c {

    /* renamed from: a */
    public final /* synthetic */ PBool f262521a;

    /* renamed from: b */
    public final /* synthetic */ C9514m f262522b;

    /* renamed from: c */
    public final /* synthetic */ PInt f262523c;

    public b$$g(C91631b bVar, PBool pBool, C9514m mVar, PInt pInt) {
        this.f262521a = pBool;
        this.f262522b = mVar;
        this.f262523c = pInt;
    }

    /* renamed from: a */
    public void mo117481a(C80669j.C80676g gVar) {
        this.f262522b.f29691a = gVar;
        this.f262523c.value = gVar.sourceLength;
    }

    /* renamed from: b */
    public void mo114825b(String str) {
        this.f262521a.value = false;
    }

    public void onSuccess(String str) {
        this.f262521a.value = true;
    }
}
