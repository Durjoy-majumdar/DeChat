package tf1;

import com.tencent.p014mm.plugin.finder.feed.model.C55779u0;
import eb0.C31543z5;

/* renamed from: tf1.a */
public class C13891a implements C55779u0 {

    /* renamed from: a */
    public final long f39050a;

    /* renamed from: b */
    public final long f39051b = C31543z5.m39453c();

    /* renamed from: c */
    public long f39052c = 259200000;

    public C13891a(long j) {
        this.f39050a = j;
    }

    /* renamed from: id */
    public long mo13365id() {
        return this.f39050a;
    }

    public boolean isValid() {
        return C31543z5.m39453c() - this.f39051b < this.f39052c;
    }
}
