package rd0;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import java.util.List;
import xd0.C23073a;

/* renamed from: rd0.c */
public interface C22222c {

    /* renamed from: rd0.c$a */
    public static final class C22223a {
        /* renamed from: a */
        public static /* synthetic */ void m25749a(C22222c cVar, String str, List list, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if (obj == null) {
                cVar.mo35361b(str, list, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, z3);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLocalSubscribeStatus");
        }
    }

    /* renamed from: rd0.c$b */
    public interface C22224b {
        /* renamed from: a */
        void mo35378a();

        /* renamed from: b */
        void mo35379b(String str, C22225c cVar);
    }

    /* renamed from: rd0.c$c */
    public static final class C22225c {

        /* renamed from: a */
        public boolean f62963a;

        /* renamed from: b */
        public boolean f62964b;

        /* renamed from: c */
        public boolean f62965c;

        /* renamed from: d */
        public boolean f62966d;

        public C22225c(boolean z, boolean z2) {
            this.f62963a = z;
            this.f62964b = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C22225c)) {
                return false;
            }
            C22225c cVar = (C22225c) obj;
            return this.f62963a == cVar.f62963a && this.f62964b == cVar.f62964b;
        }

        public int hashCode() {
            boolean z = this.f62963a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.f62964b;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        public String toString() {
            return "SubscribeStatusResult(isSubscribed=" + this.f62963a + ", isSwitchOpened=" + this.f62964b + ')';
        }
    }

    /* renamed from: a */
    boolean mo35360a(String str);

    /* renamed from: b */
    void mo35361b(String str, List<SubscribeMsgTmpItem> list, boolean z, boolean z2, boolean z3);

    /* renamed from: c */
    SubscribeMsgTmpItem mo35362c(String str, String str2);

    /* renamed from: d */
    void mo35363d(String str, String str2);

    /* renamed from: e */
    void mo35364e(String str, String str2, long j);

    /* renamed from: f */
    C23073a mo35365f();

    /* renamed from: g */
    void mo35366g(Context context, int i, String str, String str2);

    /* renamed from: h */
    long mo35367h(String str, String str2, List<String> list, String str3, C22226d dVar);

    /* renamed from: i */
    void mo35368i(long j);

    /* renamed from: j */
    void mo35369j(String str, C22226d dVar);

    /* renamed from: k */
    long mo35370k(C22227f fVar);

    /* renamed from: l */
    void mo35371l(Context context, String str, String str2, Bundle bundle);

    /* renamed from: m */
    void mo35372m(String str, SubscribeMsgTmpItem subscribeMsgTmpItem, C22224b bVar);

    /* renamed from: n */
    long mo35373n(String str, String str2, List<String> list, String str3, C22226d dVar);

    /* renamed from: o */
    void mo35374o(String str, boolean z);

    /* renamed from: p */
    void mo35375p(Context context, int i, int i2, String str, Bundle bundle);

    /* renamed from: q */
    void mo35376q(String str, C22226d dVar);

    /* renamed from: r */
    void mo35377r(String str, List<String> list, C22226d dVar);
}
