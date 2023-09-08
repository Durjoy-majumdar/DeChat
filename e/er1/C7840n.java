package er1;

import android.content.Context;
import gy3.C8480h;
import gy3.C87412m;
import java.lang.ref.WeakReference;

/* renamed from: er1.n */
public final class C7840n {

    /* renamed from: a */
    public final long f26402a;

    /* renamed from: b */
    public final int f26403b;

    /* renamed from: c */
    public WeakReference<Context> f26404c;

    /* renamed from: d */
    public Boolean f26405d;

    public C7840n(long j, int i, WeakReference<Context> weakReference, Boolean bool, int i2, C8480h hVar) {
        i = (i2 & 2) != 0 ? 1 : i;
        weakReference = (i2 & 4) != 0 ? null : weakReference;
        bool = (i2 & 8) != 0 ? Boolean.FALSE : bool;
        this.f26402a = j;
        this.f26403b = i;
        this.f26404c = weakReference;
        this.f26405d = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7840n)) {
            return false;
        }
        C7840n nVar = (C7840n) obj;
        return this.f26402a == nVar.f26402a && this.f26403b == nVar.f26403b && C87412m.m108589b(this.f26404c, nVar.f26404c) && C87412m.m108589b(this.f26405d, nVar.f26405d);
    }

    public int hashCode() {
        long j = this.f26402a;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + this.f26403b) * 31;
        WeakReference<Context> weakReference = this.f26404c;
        int i2 = 0;
        int hashCode = (i + (weakReference == null ? 0 : weakReference.hashCode())) * 31;
        Boolean bool = this.f26405d;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "ClickExtra(feedId=" + this.f26402a + ", topicType=" + this.f26403b + ", contextRef=" + this.f26404c + ", isTopicTag=" + this.f26405d + ')';
    }
}
