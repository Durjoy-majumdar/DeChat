package r33;

import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import f40.C86709a0;
import gy3.C8480h;
import i40.C60247c;
import java.util.Set;
import p749xh.C112150i9;
import sx3.C22415w0;

/* renamed from: r33.a */
public final class C63359a extends C60247c {

    /* renamed from: j */
    public static final C63360a f179730j = new C63360a((C8480h) null);

    /* renamed from: i */
    public boolean f179731i;

    /* renamed from: r33.a$a */
    public static final class C63360a {
        public C63360a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C63359a mo88266a() {
            C39622i0 a;
            Class cls = C63359a.class;
            synchronized (C60247c.f171776h) {
                C86709a0.m107523b().mo121108c();
                if (C60247c.class.isAssignableFrom(cls)) {
                    a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
                } else {
                    throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
            }
            C63359a aVar = (C63359a) a;
            if (!aVar.f179731i && C86709a0.m107522a()) {
                aVar.f179731i = aVar.mo85232c3(C86709a0.m107535s().f251807e + "/VoIPDB-8.db");
            }
            return aVar;
        }
    }

    /* renamed from: e3 */
    public boolean mo75299e3() {
        return false;
    }

    public Set<IAutoDBItem> getAutoDBItemSet() {
        return C22415w0.m26092a(new C112150i9());
    }
}
