package ht1;

import com.tencent.p014mm.sdk.storage.MStorage;
import di3.C7335d;
import java.util.List;

/* renamed from: ht1.r4 */
public interface C60197r4 extends C7335d {

    /* renamed from: ht1.r4$a */
    public interface C33072a {
        void onDone(List<C33073b> list);
    }

    /* renamed from: ht1.r4$b */
    public static final class C33073b {

        /* renamed from: a */
        public final long f89796a;

        /* renamed from: b */
        public int f89797b;

        /* renamed from: c */
        public int f89798c;

        /* renamed from: d */
        public String f89799d;

        /* renamed from: e */
        public String f89800e;

        public C33073b(long j) {
            this.f89796a = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C33073b) && this.f89796a == ((C33073b) obj).f89796a;
        }

        public int hashCode() {
            long j = this.f89796a;
            return (int) (j ^ (j >>> 32));
        }

        public String toString() {
            return "TriggerInfo(localId=" + this.f89796a + ')';
        }
    }

    /* renamed from: g */
    void mo57051g(MStorage.IOnStorageChange iOnStorageChange);

    /* renamed from: i */
    void mo57052i(MStorage.IOnStorageChange iOnStorageChange);

    void ix0(C33072a aVar);
}
