package p571j6;

/* renamed from: j6.d */
public class C87888d extends C87895h {

    /* renamed from: d */
    public final String f254397d;

    public C87888d(String str) {
        if (str != null) {
            this.f254397d = str;
            return;
        }
        throw new NullPointerException("string is null");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C87888d.class == obj.getClass()) {
            return this.f254397d.equals(((C87888d) obj).f254397d);
        }
        return false;
    }

    public int hashCode() {
        return this.f254397d.hashCode();
    }

    /* renamed from: i */
    public void mo122334i(C87896i iVar) {
        iVar.f254425a.write(this.f254397d);
    }

    public String toString() {
        return this.f254397d;
    }
}
