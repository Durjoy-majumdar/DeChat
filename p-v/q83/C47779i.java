package q83;

import com.tencent.p014mm.sdk.platformtools.SyncTask;

/* renamed from: q83.i */
public class C47779i extends SyncTask<Boolean> {

    /* renamed from: a */
    public final /* synthetic */ int f128304a;

    /* renamed from: b */
    public final /* synthetic */ float[] f128305b;

    /* renamed from: c */
    public final /* synthetic */ int f128306c;

    /* renamed from: d */
    public final /* synthetic */ C101058l f128307d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47779i(C101058l lVar, long j, Boolean bool, int i, float[] fArr, int i2) {
        super(j, bool);
        this.f128307d = lVar;
        this.f128304a = i;
        this.f128305b = fArr;
        this.f128306c = i2;
    }

    public Object run() {
        return Boolean.valueOf(this.f128307d.mo140518f(this.f128304a, this.f128305b, this.f128306c));
    }
}
