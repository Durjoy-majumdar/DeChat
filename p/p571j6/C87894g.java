package p571j6;

/* renamed from: j6.g */
public class C87894g extends C87895h {

    /* renamed from: d */
    public final String f254416d;

    public C87894g(String str) {
        if (str != null) {
            this.f254416d = str;
            return;
        }
        throw new NullPointerException("string is null");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C87894g.class == obj.getClass()) {
            return this.f254416d.equals(((C87894g) obj).f254416d);
        }
        return false;
    }

    public int hashCode() {
        return this.f254416d.hashCode();
    }

    /* renamed from: i */
    public void mo122334i(C87896i iVar) {
        String str = this.f254416d;
        iVar.f254425a.write(34);
        iVar.mo122366d(str);
        iVar.f254425a.write(34);
    }
}
