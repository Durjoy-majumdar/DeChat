package d00;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import e00.C7574m0;
import ei3.C86522b;
import gy3.C87412m;
import java.util.ArrayList;
import t83.C13853i;
import t83.C13862n1;

@C86522b
/* renamed from: d00.y0 */
public final class C7158y0 extends C86301e implements C7574m0 {
    /* renamed from: P6 */
    public void mo8344P6(C13853i iVar) {
        C87412m.m108594g(iVar, "jsApiPool");
        C13862n1 n1Var = C13862n1.f39019a;
        ArrayList arrayList = (ArrayList) C13862n1.f39020b;
        if (arrayList.contains(iVar)) {
            arrayList.remove(iVar);
            Log.m105927v("MicroMsg.WebViewJsApiPoolManager", "removeJsApiPool size: %s, removed: %s", Integer.valueOf(arrayList.size()), iVar);
        }
    }

    /* renamed from: PO */
    public void mo8345PO(C13853i iVar) {
        C87412m.m108594g(iVar, "jsApiPool");
        C13862n1 n1Var = C13862n1.f39019a;
        ArrayList arrayList = (ArrayList) C13862n1.f39020b;
        if (!arrayList.contains(iVar)) {
            arrayList.add(iVar);
            Log.m105927v("MicroMsg.WebViewJsApiPoolManager", "addJsApiPool size: %s, added: %s", Integer.valueOf(arrayList.size()), iVar);
        }
    }
}
