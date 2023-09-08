package p212oe;

import com.tencent.p014mm.sdk.platformtools.Log;
import p269xe.C118872b;
import p269xe.C91179e;
import p981ie.C117178r;
import zt3.C119157j;

/* renamed from: oe.b$$d */
public class b$$d implements C117178r.C117180b {

    /* renamed from: oe.b$$d$a */
    public class C117751a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f352146d;

        /* renamed from: e */
        public final /* synthetic */ String f352147e;

        public C117751a(b$$d b__d, int i, String str) {
            this.f352146d = i;
            this.f352147e = str;
        }

        public void run() {
            int i = this.f352146d;
            String str = this.f352147e;
            if (b$$f.m166058c()) {
                String f = C118872b.m167609f();
                int c = C118872b.m167606c();
                int e = C118872b.m167608e();
                String a = C91179e.m114432a();
                Log.m105924i("Matrix.battery.BatteryReporter", "#statJiffiesParseErrorR2");
                C91179e.C91181b.m114437a(0, 5, f, str, c, e, "statError2", 0, "mode", (long) i, "", 0, a, "", 0, 0, 0, "");
            }
        }
    }

    /* renamed from: a */
    public void mo182499a(int i, String str) {
        ((C119157j) C119157j.f356862d).mo183875f(new C117751a(this, i, str));
    }
}
