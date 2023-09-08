package nw3;

import java.util.TimerTask;

/* renamed from: nw3.h */
public class C109800h extends TimerTask {

    /* renamed from: d */
    public final /* synthetic */ C109782f f328703d;

    public C109800h(C109782f fVar) {
        this.f328703d = fVar;
    }

    public void run() {
        C109782f fVar = this.f328703d;
        if (!fVar.f328572R0) {
            int i = fVar.f328599u + 1;
            fVar.f328599u = i;
            int i2 = fVar.f328555B;
            if (i2 == 3 || i2 == 2) {
                int i3 = fVar.f328600v + 1;
                fVar.f328600v = i3;
                fVar.f328563J.f328695s = i3;
            }
            C109799g0 g0Var = fVar.f328563J;
            g0Var.f328691o = i * 1000;
            g0Var.f328694r = i;
        }
    }
}
