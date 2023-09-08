package p1160w4;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C113063a;
import java.util.HashMap;
import java.util.HashSet;
import p1221x4.C118847o;
import p1221x4.C118850q;

/* renamed from: w4.b */
public class C118740b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WorkDatabase f355275d;

    /* renamed from: e */
    public final /* synthetic */ String f355276e;

    /* renamed from: f */
    public final /* synthetic */ C113063a f355277f;

    public C118740b(C113063a aVar, WorkDatabase workDatabase, String str) {
        this.f355277f = aVar;
        this.f355275d = workDatabase;
        this.f355276e = str;
    }

    public void run() {
        C118847o i = ((C118850q) this.f355275d.mo165532n()).mo183560i(this.f355276e);
        if (i != null && i.mo183545b()) {
            synchronized (this.f355277f.f338432g) {
                ((HashMap) this.f355277f.f338435j).put(this.f355276e, i);
                ((HashSet) this.f355277f.f338436n).add(i);
                C113063a aVar = this.f355277f;
                aVar.f338437o.mo183175b(aVar.f338436n);
            }
        }
    }
}
