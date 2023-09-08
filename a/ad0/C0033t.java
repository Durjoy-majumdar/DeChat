package ad0;

/* renamed from: ad0.t */
public class C0033t {

    /* renamed from: a */
    public StringBuffer f38a = new StringBuffer();

    /* renamed from: b */
    public StringBuffer f39b = new StringBuffer();

    /* renamed from: c */
    public int f40c = 0;

    /* renamed from: a */
    public void mo32a(String str, Object obj) {
        StringBuffer stringBuffer = this.f38a;
        stringBuffer.append(str + "->" + obj + "\n");
        this.f39b.append(obj);
    }

    /* renamed from: b */
    public void mo33b(String str, Object obj) {
        StringBuffer stringBuffer = this.f38a;
        stringBuffer.append(this.f40c + " " + str + "->" + obj + "\n");
        this.f39b.append(obj);
        this.f40c = this.f40c + 1;
    }

    /* renamed from: c */
    public String mo34c() {
        this.f40c = 0;
        this.f38a.append("--end--\n\n");
        return this.f38a.toString();
    }

    public String toString() {
        return this.f39b.toString();
    }
}
