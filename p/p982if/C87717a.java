package p982if;

import com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo;
import java.io.File;
import p425ze.C91671f;
import p723vf.C118672d;
import p955df.C86263c;
import p987jf.C87954a;

/* renamed from: if.a */
public class C87717a extends C87719c {
    public C87717a(C87954a aVar) {
        super(aVar);
    }

    /* renamed from: b */
    public boolean mo112104b(DestroyedActivityInfo destroyedActivityInfo) {
        if (this.f253998b == null) {
            this.f253998b = new C86263c(this.f253997a.f261442f);
        }
        File a = this.f253998b.mo120671a(true);
        if (a != null) {
            this.f253997a.mo125242b(destroyedActivityInfo.mActivityName, true);
            this.f253997a.mo122416c();
            C91671f fVar = new C91671f(a, destroyedActivityInfo.mKey, destroyedActivityInfo.mActivityName);
            if (this.f253999c == null) {
                this.f253999c = new C87718b(this);
            }
            ((C87718b) this.f253999c).mo122136a(fVar);
        } else {
            C118672d.m167353c("Matrix.LeakProcessor.AutoDump", "heap dump for further analyzing activity with key [%s] was failed, just ignore.", destroyedActivityInfo.mKey);
        }
        return true;
    }
}
