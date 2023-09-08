package p1053ve;

/* renamed from: ve.b */
public class C90769b {

    /* renamed from: a */
    public final StringBuilder f260664a = new StringBuilder();

    /* renamed from: a */
    public C90769b mo124892a(String str) {
        StringBuilder sb = this.f260664a;
        sb.append(str);
        sb.append("\n");
        return this;
    }

    /* renamed from: b */
    public C90769b mo124893b() {
        StringBuilder sb = this.f260664a;
        sb.append("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        sb.append("\n");
        return this;
    }

    /* renamed from: c */
    public C90769b mo124894c(String str, int i) {
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                this.f260664a.append("\t");
            }
        }
        StringBuilder sb = this.f260664a;
        sb.append(str);
        sb.append("\n");
        return this;
    }

    public String toString() {
        return this.f260664a.toString();
    }
}
