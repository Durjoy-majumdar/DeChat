package sf0;

import com.tencent.p014mm.platformtools.ExportFileUtil;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p1174c5.C113242b;
import p1174c5.C113245c;
import p1174c5.C113247e;
import p1174c5.C113248f;
import p1174c5.C113251h;
import p1174c5.C113252i;
import p329d3.C86165a;

/* renamed from: sf0.t */
public class C118281t implements C86165a<Boolean> {

    /* renamed from: a */
    public final /* synthetic */ Callable f353522a;

    /* renamed from: b */
    public final /* synthetic */ C86165a f353523b;

    public C118281t(Callable callable, C86165a aVar) {
        this.f353522a = callable;
        this.f353523b = aVar;
    }

    public void accept(Object obj) {
        C118280s sVar = new C118280s(this, (Boolean) obj);
        Executor executor = C113248f.f338847g;
        C113252i iVar = new C113252i();
        try {
            ((C113242b.C113244b) executor).execute(new C113251h((C113245c) null, iVar, sVar));
        } catch (Exception e) {
            iVar.mo165796a(new C113247e(e));
        }
        C113248f<TResult> fVar = iVar.f338862a;
        C118279r rVar = new C118279r(this);
        Executor executor2 = ExportFileUtil.f267555a;
        if (executor2 == null) {
            executor2 = C113248f.f338848h;
        }
        fVar.mo165791b(rVar, executor2, (C113245c) null).mo165791b(new C118278q(this), C113248f.f338848h, (C113245c) null);
    }
}
