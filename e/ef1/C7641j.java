package ef1;

import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;

/* renamed from: ef1.j */
public final class C7641j extends C7637b {

    /* renamed from: b */
    public final int f25947b;

    /* renamed from: c */
    public BaseFinderFeed f25948c;

    /* renamed from: d */
    public long f25949d = -1;

    /* renamed from: e */
    public long f25950e = -1;

    public C7641j(int i) {
        this.f25947b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7641j) && this.f25947b == ((C7641j) obj).f25947b;
    }

    public int hashCode() {
        return this.f25947b;
    }

    public String toString() {
        return "HorizontalVideoEvent(actionType=" + this.f25947b + ')';
    }
}
