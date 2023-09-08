package y30;

import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86011o1;

/* renamed from: y30.f */
public class C91373f implements C86011o1 {

    /* renamed from: a */
    public final /* synthetic */ C91370a f262059a;

    public C91373f(C91370a aVar) {
        this.f262059a = aVar;
    }

    public boolean accept(C86009m1 m1Var) {
        String name = m1Var.getName();
        return name.endsWith(".zst") && name.contains(this.f262059a.f262055c) && name.contains(this.f262059a.f262054b) && name.contains(this.f262059a.f262056d);
    }
}
