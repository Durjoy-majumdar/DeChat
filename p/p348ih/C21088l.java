package p348ih;

/* renamed from: ih.l */
public class C21088l implements Runnable, Comparable<C21088l> {

    /* renamed from: d */
    public String f59643d;

    /* renamed from: e */
    public final int f59644e;

    /* renamed from: f */
    public long f59645f = System.currentTimeMillis();

    public C21088l(String str, int i) {
        this.f59643d = str;
        this.f59644e = i;
    }

    /* renamed from: a */
    public void mo32806a() {
    }

    public int compareTo(Object obj) {
        C21088l lVar = (C21088l) obj;
        int abs = (int) (Math.abs(System.currentTimeMillis() - this.f59645f) / ((long) 1000));
        int i = this.f59644e;
        if (abs > 0) {
            i += abs;
        }
        return lVar.f59644e - i;
    }

    public void run() {
    }
}
