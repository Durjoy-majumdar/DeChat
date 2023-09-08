package g23;

import com.tencent.p014mm.plugin.vlog.model.C96533c0;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: g23.b */
public abstract class C107697b {

    /* renamed from: a */
    public int f322211a;

    /* renamed from: b */
    public int f322212b;

    /* renamed from: c */
    public int f322213c;

    /* renamed from: d */
    public final C96533c0 f322214d;

    /* renamed from: e */
    public boolean f322215e;

    /* renamed from: f */
    public int f322216f;

    /* renamed from: g */
    public int f322217g;

    /* renamed from: h */
    public int f322218h;

    /* renamed from: i */
    public int f322219i;

    /* renamed from: j */
    public int f322220j;

    /* renamed from: k */
    public int f322221k;

    /* renamed from: l */
    public int f322222l;

    /* renamed from: m */
    public boolean f322223m;

    /* renamed from: n */
    public boolean f322224n;

    /* renamed from: o */
    public boolean f322225o;

    public C107697b(int i, int i2, int i3, C96533c0 c0Var, boolean z) {
        C87412m.m108594g(c0Var, "material");
        this.f322211a = i;
        this.f322212b = i2;
        this.f322213c = i3;
        this.f322214d = c0Var;
        this.f322215e = z;
        this.f322218h = -1;
        this.f322219i = -1;
        this.f322220j = -1;
        this.f322221k = -1;
    }

    /* renamed from: a */
    public abstract void mo158103a(boolean z);

    /* renamed from: b */
    public abstract void mo158104b(long j, boolean z);

    /* renamed from: c */
    public abstract void mo158105c();

    /* renamed from: d */
    public abstract void mo158106d(long j);

    /* renamed from: e */
    public abstract void mo158107e();

    /* renamed from: f */
    public abstract void mo158108f();

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C107697b(int i, int i2, int i3, C96533c0 c0Var, boolean z, int i4, C8480h hVar) {
        this(i, i2, i3, c0Var, (i4 & 16) != 0 ? true : z);
    }
}
