package p571j6;

/* renamed from: j6.c */
public class C87887c extends C87895h {

    /* renamed from: d */
    public final String f254396d;

    public C87887c(String str) {
        this.f254396d = str;
        "null".equals(str);
        "true".equals(str);
        "false".equals(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C87887c.class == obj.getClass()) {
            return this.f254396d.equals(((C87887c) obj).f254396d);
        }
        return false;
    }

    public int hashCode() {
        return this.f254396d.hashCode();
    }

    /* renamed from: i */
    public void mo122334i(C87896i iVar) {
        iVar.f254425a.write(this.f254396d);
    }

    public String toString() {
        return this.f254396d;
    }
}
