package rh0;

import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import f40.C86709a0;
import gy3.C8480h;
import i40.C60247c;
import java.util.Set;
import nh0.C100114a;
import sx3.C22415w0;

/* renamed from: rh0.a */
public final class C101376a extends C60247c {

    /* renamed from: i */
    public static final C101377a f296957i = new C101377a((C8480h) null);

    /* renamed from: rh0.a$a */
    public static final class C101377a {
        public C101377a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C101376a mo140861a() {
            C39622i0 a;
            Class cls = C101376a.class;
            synchronized (C60247c.f171776h) {
                C86709a0.m107523b().mo121108c();
                if (C60247c.class.isAssignableFrom(cls)) {
                    a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
                } else {
                    throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
            }
            return (C101376a) a;
        }
    }

    /* renamed from: e3 */
    public boolean mo75299e3() {
        return false;
    }

    public Set<IAutoDBItem> getAutoDBItemSet() {
        return C22415w0.m26092a(new C100114a());
    }
}
