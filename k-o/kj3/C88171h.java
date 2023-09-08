package kj3;

import com.tencent.p014mm.sdk.platformtools.Log;
import kj3.C88158f;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: kj3.h */
public class C88171h implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C88158f f254964d;

    public C88171h(C88158f fVar) {
        this.f254964d = fVar;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        C88158f.C88169i iVar = this.f254964d.f254946c;
        if (iVar == null) {
            Log.m105920e("MicroMsg.AppBrandServiceActionSheet", "resetOnCreateMenuListener, state is null");
        } else {
            iVar.onCreateMMMenu(e0Var);
        }
    }
}
