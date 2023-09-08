package o51;

import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import f40.C86709a0;
import gy3.C8480h;
import i40.C60247c;
import java.util.Set;
import p867wp.C66163a;
import sx3.C22415w0;

/* renamed from: o51.a */
public final class C61941a extends C60247c {

    /* renamed from: i */
    public static final C61942a f176074i = new C61942a((C8480h) null);

    /* renamed from: o51.a$a */
    public static final class C61942a {
        public C61942a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C61941a mo86856a() {
            C39622i0 a;
            Class cls = C61941a.class;
            synchronized (C60247c.f171776h) {
                C86709a0.m107523b().mo121108c();
                if (C60247c.class.isAssignableFrom(cls)) {
                    a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
                } else {
                    throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
            }
            return (C61941a) a;
        }
    }

    /* renamed from: e3 */
    public boolean mo75299e3() {
        return false;
    }

    public Set<IAutoDBItem> getAutoDBItemSet() {
        return C22415w0.m26092a(new C66163a());
    }
}
