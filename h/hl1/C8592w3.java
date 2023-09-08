package hl1;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import qo3.C47883u;
import vk1.C65762c;

/* renamed from: hl1.w3 */
public final class C8592w3 implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ C59988k f27683a;

    public C8592w3(C59988k kVar) {
        this.f27683a = kVar;
    }

    /* renamed from: a */
    public final void mo353a(boolean z, String str) {
        C65762c cVar = this.f27683a.f166848f;
        if (cVar != null) {
            C58124b.C7172a.m7372a(cVar, C58124b.C58125b.QUIT_LIVE, (Bundle) null, 2, (Object) null);
        }
        String str2 = this.f27683a.f171222i;
        Log.m105924i(str2, "showAlertDialog click bOk:" + z);
    }
}
