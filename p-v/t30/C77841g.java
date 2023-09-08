package t30;

import java.util.Calendar;
import java.util.Date;
import p749xh.C78810h1;

/* renamed from: t30.g */
public class C77841g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f226813d;

    /* renamed from: e */
    public final /* synthetic */ boolean f226814e;

    /* renamed from: f */
    public final /* synthetic */ String f226815f;

    /* renamed from: g */
    public final /* synthetic */ C77842h f226816g;

    public C77841g(C77842h hVar, long j, boolean z, String str) {
        this.f226816g = hVar;
        this.f226813d = j;
        this.f226814e = z;
        this.f226815f = str;
    }

    public void run() {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(currentTimeMillis));
        int i = instance.get(7);
        int i2 = instance.get(11);
        C78810h1 h1Var = new C78810h1();
        h1Var.field_msgid = this.f226813d;
        h1Var.field_timestamp = currentTimeMillis;
        h1Var.field_dayOfWeek = i;
        h1Var.field_hourOfDay = i2;
        boolean z = this.f226814e;
        h1Var.field_isfrom = z ? 1 : 0;
        h1Var.field_type = 1;
        h1Var.field_action = 2;
        h1Var.field_talker = this.f226815f;
        if (z) {
            this.f226816g.f226817a.f226829a.mo107789Lo(h1Var);
        }
    }
}
