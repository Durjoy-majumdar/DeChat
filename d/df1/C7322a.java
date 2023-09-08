package df1;

import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import di3.C86312j;
import ef1.C58553c;
import ef1.C7637b;
import ef1.C7638e;
import gy3.C87412m;
import tf0.C64916p1;

/* renamed from: df1.a */
public final class C7322a extends C7638e<Object> {

    /* renamed from: df1.a$a */
    public static final class C7323a extends C7637b {

        /* renamed from: b */
        public final int f25435b;

        /* renamed from: c */
        public final long f25436c;

        /* renamed from: d */
        public FinderItem f25437d;

        public C7323a(int i, long j) {
            this.f25435b = i;
            this.f25436c = j;
            this.f25437d = ((C64916p1) C86312j.m106911c(C64916p1.class)).Br0(j);
        }

        /* renamed from: b */
        public final long mo8495b() {
            return this.f25436c;
        }

        /* renamed from: c */
        public final int mo8496c() {
            return this.f25435b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7323a)) {
                return false;
            }
            C7323a aVar = (C7323a) obj;
            return this.f25435b == aVar.f25435b && this.f25436c == aVar.f25436c;
        }

        public int hashCode() {
            long j = this.f25436c;
            return (this.f25435b * 31) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            return "ActionEvent(type=" + this.f25435b + ", feedId=" + this.f25436c + ')';
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7322a(C58553c cVar) {
        super(cVar);
        C87412m.m108594g(cVar, "eventDispatcher");
    }
}
