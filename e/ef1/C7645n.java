package ef1;

import cm1.C0740i2;
import java.util.LinkedList;
import java.util.List;

/* renamed from: ef1.n */
public final class C7645n extends C7642k {

    /* renamed from: l */
    public long f25964l = -1;

    /* renamed from: m */
    public int f25965m = -1;

    /* renamed from: n */
    public int f25966n = -1;

    /* renamed from: o */
    public List<C58564i> f25967o;

    /* renamed from: p */
    public List<C58564i> f25968p;

    /* renamed from: q */
    public LinkedList<C0740i2> f25969q;

    public C7645n(int i) {
        super(i);
    }

    /* renamed from: f */
    public final List<C58564i> mo8776f() {
        return this.f25967o;
    }

    /* renamed from: g */
    public final long mo8777g() {
        return this.f25964l;
    }

    /* renamed from: h */
    public final int mo8778h() {
        return this.f25965m;
    }

    /* renamed from: i */
    public final int mo8779i() {
        return this.f25966n;
    }

    /* renamed from: j */
    public final List<C58564i> mo8780j() {
        return this.f25968p;
    }

    /* renamed from: k */
    public final LinkedList<C0740i2> mo8781k() {
        return this.f25969q;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ScrollEvent(type=");
        sb.append(this.f25951b);
        sb.append(", ");
        sb.append(this.f25952c);
        sb.append(", ");
        sb.append(this.f25953d);
        sb.append(", ");
        sb.append(this.f25954e);
        sb.append(", ");
        sb.append(this.f25955f);
        sb.append(", itemCount=");
        sb.append(this.f25956g);
        sb.append(", newState=");
        sb.append(this.f25957h);
        sb.append(") idleAcrossFeedList=");
        List<C58564i> list = this.f25967o;
        sb.append(list != null ? Integer.valueOf(list.size()) : null);
        return sb.toString();
    }
}
