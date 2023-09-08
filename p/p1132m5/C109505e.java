package p1132m5;

import android.graphics.Bitmap;
import coil.memory.MemoryCache$Key;
import gy3.C87412m;
import p1132m5.C109518n;
import p864t5.C110902a;

/* renamed from: m5.e */
public final class C109505e implements C109527r {

    /* renamed from: b */
    public final C109530u f327746b;

    public C109505e(C109530u uVar) {
        C87412m.m108594g(uVar, "weakMemoryCache");
        this.f327746b = uVar;
    }

    /* renamed from: a */
    public void mo160731a(int i) {
    }

    /* renamed from: b */
    public C109518n.C109519a mo160732b(MemoryCache$Key memoryCache$Key) {
        C87412m.m108594g(memoryCache$Key, "key");
        return null;
    }

    /* renamed from: c */
    public void mo160733c(MemoryCache$Key memoryCache$Key, Bitmap bitmap, boolean z) {
        C87412m.m108594g(memoryCache$Key, "key");
        C87412m.m108594g(bitmap, "bitmap");
        this.f327746b.mo160736c(memoryCache$Key, bitmap, z, C110902a.m151198a(bitmap));
    }
}
