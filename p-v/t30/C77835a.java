package t30;

import java.util.Calendar;
import java.util.Date;
import p749xh.C78810h1;

/* renamed from: t30.a */
public class C77835a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f226798d;

    /* renamed from: e */
    public final /* synthetic */ boolean f226799e;

    /* renamed from: f */
    public final /* synthetic */ String f226800f;

    /* renamed from: g */
    public final /* synthetic */ C77836b f226801g;

    public C77835a(C77836b bVar, long j, boolean z, String str) {
        this.f226801g = bVar;
        this.f226798d = j;
        this.f226799e = z;
        this.f226800f = str;
    }

    public void run() {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(currentTimeMillis));
        int i = instance.get(7);
        int i2 = instance.get(11);
        C78810h1 h1Var = new C78810h1();
        h1Var.field_msgid = this.f226798d;
        h1Var.field_timestamp = currentTimeMillis;
        h1Var.field_dayOfWeek = i;
        h1Var.field_hourOfDay = i2;
        h1Var.field_isfrom = this.f226799e ? 1 : 0;
        h1Var.field_type = 3;
        h1Var.field_action = 1;
        h1Var.field_talker = this.f226800f;
        this.f226801g.f226802a.f226829a.mo107789Lo(h1Var);
    }
}
