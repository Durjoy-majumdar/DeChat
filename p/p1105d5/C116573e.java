package p1105d5;

import android.content.Context;
import android.os.StatFs;
import d24.C106982e;
import d24.C20389c;
import d24.C20425v;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.io.File;
import my3.C61595o;
import p1105d5.C106994f;

/* renamed from: d5.e */
public final class C116573e extends C87413o implements C32224a<C106982e.C106983a> {

    /* renamed from: d */
    public final /* synthetic */ C106994f.C106995a f349589d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C116573e(C106994f.C106995a aVar) {
        super(0);
        this.f349589d = aVar;
    }

    public Object invoke() {
        long j;
        C20425v.C20427b bVar = new C20425v.C20427b();
        Context context = this.f349589d.f320263a;
        C87412m.m108594g(context, "context");
        File file = new File(context.getCacheDir(), "image_cache");
        file.mkdirs();
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j = C61595o.m72298f((long) (((double) statFs.getBlockCountLong()) * 0.02d * ((double) statFs.getBlockSizeLong())), 10485760, 262144000);
        } catch (Exception unused) {
            j = 10485760;
        }
        bVar.f57316i = new C20389c(file, j);
        return new C20425v(bVar);
    }
}
