package vh3;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import te3.C101814mn2;

/* renamed from: vh3.l */
public final class C102203l implements C102191c {

    /* renamed from: a */
    public final /* synthetic */ C1256g<Bundle> f300900a;

    public C102203l(C1256g<Bundle> gVar) {
        this.f300900a = gVar;
    }

    /* renamed from: a */
    public void mo125818a(int i, C101814mn2 mn22) {
        Bundle bundle = new Bundle();
        bundle.putInt("err_type", i);
        if (mn22 == null) {
            C1256g<Bundle> gVar = this.f300900a;
            if (gVar != null) {
                gVar.mo894a(bundle);
                return;
            }
            return;
        }
        bundle.putByteArray("result", mn22.toByteArray());
        C1256g<Bundle> gVar2 = this.f300900a;
        if (gVar2 != null) {
            gVar2.mo894a(bundle);
        }
    }
}
