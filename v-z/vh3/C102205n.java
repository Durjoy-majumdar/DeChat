package vh3;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import te3.C51193s22;

/* renamed from: vh3.n */
public final class C102205n implements C102198h {

    /* renamed from: a */
    public final /* synthetic */ C1256g<Bundle> f300901a;

    public C102205n(C1256g<Bundle> gVar) {
        this.f300901a = gVar;
    }

    /* renamed from: a */
    public void mo126170a(int i, int i2, C51193s22 s222) {
        byte[] byteArray;
        Bundle bundle = new Bundle();
        bundle.putInt("err_type", i);
        bundle.putInt("err_code", i2);
        if (!(s222 == null || (byteArray = s222.toByteArray()) == null)) {
            bundle.putByteArray("response", byteArray);
        }
        C1256g<Bundle> gVar = this.f300901a;
        if (gVar != null) {
            gVar.mo894a(bundle);
        }
    }
}
