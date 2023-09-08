package jb2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import eb0.C31543z5;
import gy3.C8480h;
import java.util.HashMap;
import ob0.C117747y;

/* renamed from: jb2.a */
public abstract class C46455a extends C117747y implements C1311n {

    /* renamed from: h */
    public static final HashMap<Integer, C46456c> f125135h = new HashMap<>();

    /* renamed from: d */
    public final int f125136d;

    /* renamed from: e */
    public long f125137e;

    /* renamed from: f */
    public long f125138f;

    /* renamed from: g */
    public long f125139g;

    public C46455a() {
        this(0, 1, (C8480h) null);
    }

    public C46455a(int i) {
        this.f125136d = i;
        this.f125137e = C31543z5.m39453c();
        this.f125138f = C31543z5.m39453c();
        this.f125139g = C31543z5.m39453c();
    }

    public int dispatch(C114770g gVar, C114799u uVar, C1311n nVar) {
        this.f125138f = C31543z5.m39453c();
        return super.dispatch(gVar, uVar, nVar);
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        this.f125139g = C31543z5.m39453c();
        f125135h.put(Integer.valueOf(getType()), new C46456c(getType(), this.f125137e, this.f125138f, this.f125139g));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C46455a(int i, int i2, C8480h hVar) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
