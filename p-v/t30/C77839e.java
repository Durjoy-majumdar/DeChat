package t30;

import java.util.Calendar;
import java.util.Date;
import p749xh.C78810h1;

/* renamed from: t30.e */
public class C77839e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f226808d;

    /* renamed from: e */
    public final /* synthetic */ boolean f226809e;

    /* renamed from: f */
    public final /* synthetic */ String f226810f;

    /* renamed from: g */
    public final /* synthetic */ C77840f f226811g;

    public C77839e(C77840f fVar, long j, boolean z, String str) {
        this.f226811g = fVar;
        this.f226808d = j;
        this.f226809e = z;
        this.f226810f = str;
    }

    public void run() {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(currentTimeMillis));
        int i = instance.get(7);
        int i2 = instance.get(11);
        C78810h1 h1Var = new C78810h1();
        h1Var.field_msgid = this.f226808d;
        h1Var.field_timestamp = currentTimeMillis;
        h1Var.field_dayOfWeek = i;
        h1Var.field_hourOfDay = i2;
        boolean z = this.f226809e;
        h1Var.field_isfrom = z ? 1 : 0;
        h1Var.field_type = 1;
        h1Var.field_action = 1;
        h1Var.field_talker = this.f226810f;
        if (z) {
            this.f226811g.f226812a.f226829a.mo107789Lo(h1Var);
        }
    }
}
