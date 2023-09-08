package t30;

import java.util.Calendar;
import java.util.Date;
import p749xh.C78810h1;

/* renamed from: t30.c */
public class C77837c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f226803d;

    /* renamed from: e */
    public final /* synthetic */ boolean f226804e;

    /* renamed from: f */
    public final /* synthetic */ String f226805f;

    /* renamed from: g */
    public final /* synthetic */ C77838d f226806g;

    public C77837c(C77838d dVar, long j, boolean z, String str) {
        this.f226806g = dVar;
        this.f226803d = j;
        this.f226804e = z;
        this.f226805f = str;
    }

    public void run() {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(currentTimeMillis));
        int i = instance.get(7);
        int i2 = instance.get(11);
        C78810h1 h1Var = new C78810h1();
        h1Var.field_msgid = this.f226803d;
        h1Var.field_timestamp = currentTimeMillis;
        h1Var.field_dayOfWeek = i;
        h1Var.field_hourOfDay = i2;
        h1Var.field_isfrom = this.f226804e ? 1 : 0;
        h1Var.field_type = 3;
        h1Var.field_action = 2;
        h1Var.field_talker = this.f226805f;
        this.f226806g.f226807a.f226829a.mo107789Lo(h1Var);
    }
}
