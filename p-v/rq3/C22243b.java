package rq3;

/* renamed from: rq3.b */
public enum C22243b {
    LoadFinish(2, false, false, true, false),
    LoadReleased(2, false, false, false, false),
    Loading(2, false, true, false, false),
    None(0, false, false, false, false),
    PullDownCanceled(1, false, false, false, false),
    PullDownToRefresh(1, true, false, false, false),
    PullUpCanceled(2, false, false, false, false),
    PullUpToLoad(2, true, false, false, false),
    RefreshFinish(1, false, false, true, false),
    RefreshReleased(1, false, false, false, false),
    Refreshing(1, false, true, false, false),
    ReleaseToLoad(2, true, false, false, true),
    ReleaseToRefresh(1, true, false, false, true);
    

    /* renamed from: d */
    public final boolean f63044d;

    /* renamed from: e */
    public final boolean f63045e;

    /* renamed from: f */
    public final boolean f63046f;

    /* renamed from: g */
    public final boolean f63047g;

    /* renamed from: h */
    public final boolean f63048h;

    /* renamed from: i */
    public final boolean f63049i;

    /* access modifiers changed from: public */
    C22243b(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        this.f63044d = i == 1;
        this.f63045e = i == 2 ? true : z5;
        this.f63046f = z;
        this.f63047g = z2;
        this.f63048h = z3;
        this.f63049i = z4;
    }
}
