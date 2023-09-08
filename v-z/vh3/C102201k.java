package vh3;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import jp3.C9486a;
import jp3.C9487b;
import te3.C51193s22;

/* renamed from: vh3.k */
public final class C102201k extends C102199i implements C9486a {

    /* renamed from: d */
    public C102198h f300898d;

    /* renamed from: vh3.k$a */
    public static final class C102202a<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C102201k f300899d;

        public C102202a(C102201k kVar) {
            this.f300899d = kVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            int i = bundle.getInt("err_type");
            int i2 = bundle.getInt("err_code");
            C51193s22 s222 = new C51193s22();
            byte[] byteArray = bundle.getByteArray("response");
            if (byteArray != null) {
                s222.parseFrom(byteArray);
            }
            Log.m105924i("MicroMsg.GetLensListTask", "ipc callback: " + i + ' ' + i2);
            C102198h hVar = this.f300899d.f300898d;
            if (hVar != null) {
                hVar.mo126170a(i, i2, s222);
            }
        }
    }

    public C102201k(int i, byte[] bArr, byte[] bArr2, C9487b<C9486a> bVar, C102198h hVar) {
        this.f300898d = hVar;
        if (bVar != null) {
            bVar.keep(this);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("type", i);
        bundle.putByteArray("page_buff", bArr);
        bundle.putByteArray("ctx_buff", bArr2);
        C80907o.m98781d(MMApplicationContext.getPackageName(), bundle, C102206o.class, new C102202a(this));
    }

    public void dead() {
        this.f300898d = null;
    }
}
