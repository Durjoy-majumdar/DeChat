package n50;

import java.io.Serializable;

/* renamed from: n50.b */
public class C61619b implements Serializable {

    /* renamed from: d */
    public String f175221d;

    /* renamed from: e */
    public int f175222e;

    /* renamed from: f */
    public boolean f175223f;

    /* renamed from: g */
    public boolean f175224g;

    /* renamed from: h */
    public int f175225h;

    /* renamed from: i */
    public String f175226i;

    /* renamed from: j */
    public boolean f175227j;

    /* renamed from: n */
    public int f175228n;

    public C61619b(String str) {
        this.f175222e = 0;
        this.f175223f = true;
        this.f175224g = true;
        this.f175225h = 50;
        this.f175226i = "";
        this.f175227j = false;
        this.f175221d = str;
    }

    public String toString() {
        return "RemoteUserConfig{mUserName='" + this.f175221d + '\'' + ", mSeatPosition=" + this.f175228n + '}';
    }

    public C61619b(String str, int i) {
        this.f175223f = true;
        this.f175224g = true;
        this.f175225h = 50;
        this.f175226i = "";
        this.f175227j = false;
        this.f175221d = str;
        this.f175222e = i;
    }
}
