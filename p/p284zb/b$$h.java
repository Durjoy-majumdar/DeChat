package p284zb;

import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g;
import com.tencent.p014mm.plugin.appbrand.utils.C84754j1;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.platformtools.Log;
import js0.C9514m;

/* renamed from: zb.b$$h */
public class b$$h implements C84754j1.C84757c {

    /* renamed from: a */
    public final /* synthetic */ C9514m f262524a;

    /* renamed from: b */
    public final /* synthetic */ PBool f262525b;

    /* renamed from: c */
    public final /* synthetic */ C40480g f262526c;

    /* renamed from: d */
    public final /* synthetic */ String f262527d;

    /* renamed from: e */
    public final /* synthetic */ PString f262528e;

    public b$$h(C91631b bVar, C9514m mVar, PBool pBool, C40480g gVar, String str, PString pString) {
        this.f262524a = mVar;
        this.f262525b = pBool;
        this.f262526c = gVar;
        this.f262527d = str;
        this.f262528e = pString;
    }

    /* renamed from: a */
    public void mo117481a(C80669j.C80676g gVar) {
        this.f262524a.f29691a = gVar;
    }

    /* renamed from: b */
    public void mo114825b(String str) {
        Log.m105921e("MicroMsg.AppBrandJSContextInterface[multicontext]", "injectSdkScript-injectWithFd, contextId:%d, path:%s, onFailure:%s", Integer.valueOf(this.f262526c.getContextId()), this.f262527d, str);
        this.f262528e.value = str;
        this.f262525b.value = false;
    }

    public void onSuccess(String str) {
        this.f262525b.value = true;
    }
}
