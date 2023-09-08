package t30;

import java.util.Calendar;
import java.util.Date;
import p749xh.C78810h1;

/* renamed from: t30.k */
public class C77845k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f226823d;

    /* renamed from: e */
    public final /* synthetic */ boolean f226824e;

    /* renamed from: f */
    public final /* synthetic */ String f226825f;

    /* renamed from: g */
    public final /* synthetic */ C77846l f226826g;

    public C77845k(C77846l lVar, long j, boolean z, String str) {
        this.f226826g = lVar;
        this.f226823d = j;
        this.f226824e = z;
        this.f226825f = str;
    }

    public void run() {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(currentTimeMillis));
        int i = instance.get(7);
        int i2 = instance.get(11);
        C78810h1 h1Var = new C78810h1();
        h1Var.field_msgid = this.f226823d;
        h1Var.field_timestamp = currentTimeMillis;
        h1Var.field_dayOfWeek = i;
        h1Var.field_hourOfDay = i2;
        h1Var.field_isfrom = this.f226824e ? 1 : 0;
        h1Var.field_type = 2;
        h1Var.field_action = 2;
        h1Var.field_talker = this.f226825f;
        this.f226826g.f226827a.f226829a.mo107789Lo(h1Var);
    }
}
