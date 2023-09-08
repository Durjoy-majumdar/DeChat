package q53;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.sdk.platformtools.Log;
import p53.C11828a;
import r53.C12953c;

/* renamed from: q53.f */
public final class C12066f<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C12041a f35149d;

    public C12066f(C12041a aVar) {
        this.f35149d = aVar;
    }

    public void onChanged(Object obj) {
        C11828a aVar = (C11828a) obj;
        C12041a aVar2 = this.f35149d;
        aVar2.getClass();
        Log.m105918d("MicroMsg.BuyGoodsBottomDialog", "showErrorMsg: " + aVar);
        C12953c.m12395d(aVar2.f35061a, aVar, new C12097n(aVar, aVar2));
    }
}
