package p284zb;

import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.plugin.appbrand.utils.C84754j1;
import com.tencent.p014mm.pointers.PBool;
import js0.C9514m;

/* renamed from: zb.c */
public class C91632c implements C84754j1.C84757c {

    /* renamed from: a */
    public final /* synthetic */ C9514m f262529a;

    /* renamed from: b */
    public final /* synthetic */ PBool f262530b;

    public C91632c(C91631b bVar, C9514m mVar, PBool pBool) {
        this.f262529a = mVar;
        this.f262530b = pBool;
    }

    /* renamed from: a */
    public void mo117481a(C80669j.C80676g gVar) {
        this.f262529a.f29691a = gVar;
    }

    /* renamed from: b */
    public void mo114825b(String str) {
        this.f262530b.value = false;
    }

    public void onSuccess(String str) {
        this.f262530b.value = true;
    }
}
