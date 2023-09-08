package p203mi;

import java.util.Calendar;

/* renamed from: mi.a */
public class C109628a {

    /* renamed from: a */
    public Calendar f328198a;

    /* renamed from: b */
    public int f328199b;

    /* renamed from: c */
    public int f328200c;

    /* renamed from: d */
    public int f328201d;

    /* renamed from: e */
    public long f328202e;

    /* renamed from: f */
    public long f328203f;

    public C109628a() {
        mo160854a(System.currentTimeMillis());
    }

    /* renamed from: a */
    public final void mo160854a(long j) {
        this.f328202e = j;
        if (this.f328198a == null) {
            this.f328198a = Calendar.getInstance();
        }
        this.f328198a.setTimeInMillis(j);
        this.f328200c = this.f328198a.get(2);
        this.f328201d = this.f328198a.get(1);
        this.f328199b = this.f328198a.get(5);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C109628a) {
            C109628a aVar = (C109628a) obj;
            return aVar.f328199b == this.f328199b && aVar.f328200c == this.f328200c && aVar.f328201d == this.f328201d;
        }
    }

    public String toString() {
        return "{ year: " + this.f328201d + ", month: " + this.f328200c + ", day: " + this.f328199b + " }";
    }

    public C109628a(int i, int i2, int i3) {
        this.f328201d = i;
        this.f328200c = i2;
        this.f328199b = i3;
    }

    public C109628a(long j) {
        this.f328202e = j;
        mo160854a(j);
    }
}
