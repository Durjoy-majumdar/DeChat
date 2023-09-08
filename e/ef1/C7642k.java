package ef1;

import com.tencent.p014mm.plugin.finder.storage.FeedData;

/* renamed from: ef1.k */
public class C7642k extends C7637b {

    /* renamed from: b */
    public int f25951b;

    /* renamed from: c */
    public int f25952c = -1;

    /* renamed from: d */
    public int f25953d = -1;

    /* renamed from: e */
    public int f25954e = -1;

    /* renamed from: f */
    public int f25955f = -1;

    /* renamed from: g */
    public int f25956g;

    /* renamed from: h */
    public int f25957h;

    /* renamed from: i */
    public long f25958i = -1;

    /* renamed from: j */
    public int f25959j = -1;

    /* renamed from: k */
    public FeedData f25960k;

    public C7642k(int i) {
        this.f25951b = i;
    }

    /* renamed from: b */
    public final long mo8771b() {
        return this.f25958i;
    }

    /* renamed from: c */
    public final int mo8772c() {
        return this.f25953d;
    }

    /* renamed from: d */
    public final int mo8773d() {
        return this.f25955f;
    }

    /* renamed from: e */
    public final int mo8774e() {
        return this.f25951b;
    }

    public String toString() {
        return "ScrollEvent(type=" + this.f25951b + ", firstCompletelyVisibleItemPosition=" + this.f25952c + ", firstVisibleItemPosition=" + this.f25953d + ", lastCompletelyVisibleItemPosition=" + this.f25954e + ", lastVisibleItemPosition=" + this.f25955f + ", itemCount=" + this.f25956g + ", newState=" + this.f25957h + ')';
    }
}
