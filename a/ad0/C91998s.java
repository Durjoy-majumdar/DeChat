package ad0;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.atomic.AtomicInteger;
import te3.ya4;

/* renamed from: ad0.s */
public class C91998s {

    /* renamed from: l */
    public static final /* synthetic */ int f263358l = 0;

    /* renamed from: a */
    public Object f263359a = null;

    /* renamed from: b */
    public int f263360b = 1;

    /* renamed from: c */
    public int f263361c = 0;

    /* renamed from: d */
    public long f263362d;

    /* renamed from: e */
    public int f263363e;

    /* renamed from: f */
    public int f263364f;

    /* renamed from: g */
    public int f263365g;

    /* renamed from: h */
    public StringBuffer f263366h = new StringBuffer();

    /* renamed from: i */
    public StringBuffer f263367i = new StringBuffer();

    /* renamed from: j */
    public StringBuffer f263368j = new StringBuffer();

    /* renamed from: k */
    public StringBuffer f263369k = new StringBuffer();

    static {
        new AtomicInteger(0);
    }

    public C91998s(int i, int i2) {
        this.f263361c = i;
        this.f263365g = i2;
    }

    /* renamed from: b */
    public static C91998s m115548b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        ya4 ya4 = new ya4();
        try {
            ya4.parseFrom(bArr);
            C91998s sVar = new C91998s(ya4.f299934d, ya4.f299935e);
            sVar.f263360b = ya4.f299936f;
            sVar.f263362d = ya4.f299937g;
            sVar.f263363e = ya4.f299938h;
            sVar.f263364f = ya4.f299939i;
            sVar.f263366h = new StringBuffer(ya4.f299940j);
            sVar.f263369k = new StringBuffer(ya4.f299941n);
            sVar.f263367i = new StringBuffer(ya4.f299942o);
            sVar.f263368j = new StringBuffer(ya4.f299943p);
            return sVar;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.StatisticsOplog", "putIntent " + e.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    public static C91998s m115549c(int i) {
        return new C91998s(i, 4);
    }

    /* renamed from: d */
    public static C91998s m115550d(int i) {
        return new C91998s(i, 1);
    }

    /* renamed from: f */
    public static C91998s m115551f(Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("intent_key_StatisticsOplog");
        if (byteArrayExtra == null) {
            return null;
        }
        return m115548b(byteArrayExtra);
    }

    /* renamed from: a */
    public boolean mo125840a(int i) {
        this.f263359a = Integer.valueOf(i);
        return true;
    }

    /* renamed from: e */
    public byte[] mo125841e() {
        ya4 ya4 = new ya4();
        ya4.f299934d = this.f263361c;
        ya4.f299935e = this.f263365g;
        ya4.f299936f = this.f263360b;
        ya4.f299937g = this.f263362d;
        ya4.f299938h = this.f263363e;
        ya4.f299939i = this.f263364f;
        ya4.f299940j = this.f263366h.toString();
        ya4.f299941n = this.f263369k.toString();
        ya4.f299942o = this.f263367i.toString();
        ya4.f299943p = this.f263368j.toString();
        try {
            return ya4.toByteArray();
        } catch (Exception e) {
            Log.m105920e("MicroMsg.StatisticsOplog", "putIntent " + e.getMessage());
            return null;
        }
    }

    /* renamed from: g */
    public void mo125842g(Intent intent) {
        byte[] e = mo125841e();
        if (e != null) {
            intent.putExtra("intent_key_StatisticsOplog", e);
        }
    }
}
