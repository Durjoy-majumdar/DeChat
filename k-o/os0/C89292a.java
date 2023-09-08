package os0;

import android.content.Context;
import android.net.Uri;
import gy3.C8480h;
import gy3.C87412m;
import p300c8.C79946g;
import p300c8.C79950j;
import p300c8.C79951n;
import p300c8.C79967x;

/* renamed from: os0.a */
public final class C89292a implements C79946g {

    /* renamed from: a */
    public final C89293b f257241a;

    /* renamed from: b */
    public final /* synthetic */ C79951n f257242b;

    public C89292a(Context context, C79967x xVar, C89293b bVar, C79951n nVar, int i, C8480h hVar) {
        nVar = (i & 8) != 0 ? new C79951n(context, xVar, bVar) : nVar;
        C87412m.m108594g(bVar, "baseDataSource");
        C87412m.m108594g(nVar, "realDataSource");
        this.f257241a = bVar;
        this.f257242b = nVar;
    }

    /* renamed from: b */
    public long mo110126b(C79950j jVar) {
        return this.f257242b.mo110126b(jVar);
    }

    /* renamed from: c */
    public int mo110127c(byte[] bArr, int i, int i2) {
        return this.f257242b.mo110127c(bArr, i, i2);
    }

    public void close() {
        this.f257242b.close();
    }

    public Uri getUri() {
        return this.f257242b.getUri();
    }
}
