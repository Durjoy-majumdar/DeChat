package p1223z3;

import android.content.Context;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import p1188d4.C116563c;
import p1223z3.C119038g;

/* renamed from: z3.a */
public class C119028a {

    /* renamed from: a */
    public final C116563c.C116566c f356490a;

    /* renamed from: b */
    public final Context f356491b;

    /* renamed from: c */
    public final String f356492c;

    /* renamed from: d */
    public final C119038g.C119042d f356493d;

    /* renamed from: e */
    public final List<C119038g.C119040b> f356494e;

    /* renamed from: f */
    public final Executor f356495f;

    /* renamed from: g */
    public final Executor f356496g;

    /* renamed from: h */
    public final boolean f356497h;

    /* renamed from: i */
    public final boolean f356498i;

    public C119028a(Context context, String str, C116563c.C116566c cVar, C119038g.C119042d dVar, List<C119038g.C119040b> list, boolean z, C119038g.C119041c cVar2, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file) {
        this.f356490a = cVar;
        this.f356491b = context;
        this.f356492c = str;
        this.f356493d = dVar;
        this.f356494e = list;
        this.f356495f = executor;
        this.f356496g = executor2;
        this.f356497h = z3;
        this.f356498i = z4;
    }

    /* renamed from: a */
    public boolean mo183688a(int i, int i2) {
        return (!(i > i2) || !this.f356498i) && this.f356497h;
    }
}
