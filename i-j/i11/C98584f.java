package i11;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116300h1;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C97318g1;
import gy3.C87412m;
import i11.C98581d;
import java.util.Set;

/* renamed from: i11.f */
public final class C98584f implements C98581d.C98582a, C116300h1 {

    /* renamed from: a */
    public final /* synthetic */ Set<String> f289063a;

    /* renamed from: b */
    public final /* synthetic */ Set<String> f289064b;

    /* renamed from: c */
    public final /* synthetic */ Set<String> f289065c;

    /* renamed from: d */
    public final /* synthetic */ Set<String> f289066d;

    /* renamed from: e */
    public final /* synthetic */ Set<String> f289067e;

    /* renamed from: f */
    public final /* synthetic */ Set<String> f289068f;

    /* renamed from: g */
    public final /* synthetic */ byte[] f289069g;

    /* renamed from: h */
    public final /* synthetic */ long f289070h;

    /* renamed from: i */
    public final /* synthetic */ C98580c f289071i;

    public C98584f(Set<String> set, Set<String> set2, Set<String> set3, Set<String> set4, Set<String> set5, Set<String> set6, byte[] bArr, long j, C98580c cVar) {
        this.f289063a = set;
        this.f289064b = set2;
        this.f289065c = set3;
        this.f289066d = set4;
        this.f289067e = set5;
        this.f289068f = set6;
        this.f289069g = bArr;
        this.f289070h = j;
        this.f289071i = cVar;
    }

    /* renamed from: a */
    public void mo137951a(boolean z) {
        C98580c cVar = this.f289071i;
        if (cVar != null) {
            cVar.mo137949a(z);
        }
    }

    /* renamed from: b */
    public void mo137952b(C97318g1 g1Var) {
        C87412m.m108594g(g1Var, "entry");
        int i = g1Var.f285613a;
        int a = C98585g.m128098a(i, g1Var.f285615c.f250476f);
        int i2 = i & 4095;
        byte[] bArr = this.f289069g;
        if (i2 >= 16) {
            i2 = 0;
        }
        byte b = bArr[i2];
        String str = g1Var.f285614b;
        C86001b0 b0Var = g1Var.f285615c;
        boolean z = true;
        boolean z2 = (i & 16384) != 0;
        Log.m105918d("MicroMsg.CleanWxTask", "LIST [" + a + "] " + g1Var);
        if (b <= 1 || b0Var.f250475e <= this.f289070h) {
            if (str != null) {
                String str2 = b0Var.f250471a;
                C87412m.m108593f(str2, "fe.relPath");
                if (str2.length() != 0) {
                    z = false;
                }
                if (z || this.f289063a.contains(str)) {
                    return;
                }
                if (this.f289064b.contains(str) && !z2) {
                    return;
                }
                if (this.f289065c.contains(str) && z2) {
                    return;
                }
                if (this.f289066d.contains(str) || ((this.f289067e.contains(str) && !z2) || (this.f289068f.contains(str) && z2))) {
                    Log.m105918d("MicroMsg.CleanWxTask", "DELETE [" + a + "] " + g1Var);
                    b0Var.mo119955b(false);
                    return;
                }
            }
            if (a >= b) {
                Log.m105918d("MicroMsg.CleanWxTask", "DELETE [" + a + "] " + g1Var);
                b0Var.mo119955b(false);
            }
        }
    }

    /* renamed from: c */
    public boolean mo137953c(int i, String str, C86001b0 b0Var) {
        C87412m.m108594g(b0Var, "entry");
        if (str == null) {
            return true;
        }
        boolean z = (i & 16384) != 0;
        if (this.f289063a.contains(str)) {
            return false;
        }
        if (this.f289064b.contains(str) && !z) {
            return false;
        }
        if (this.f289065c.contains(str) && z) {
            return false;
        }
        if (this.f289066d.contains(str)) {
            return true;
        }
        if (this.f289067e.contains(str) && !z) {
            return true;
        }
        if (this.f289068f.contains(str) && z) {
            return true;
        }
        int a = C98585g.m128098a(i, false);
        int i2 = i & 4095;
        byte[] bArr = this.f289069g;
        if (i2 >= 16) {
            i2 = 0;
        }
        return a >= bArr[i2];
    }
}
