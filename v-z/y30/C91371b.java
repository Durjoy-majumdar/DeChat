package y30;

import com.tencent.p014mm.vfs.VFSStrategy;

/* renamed from: y30.b */
public class C91371b extends C91370a {
    static {
        VFSStrategy.m163776d("PublicResource");
    }

    public C91371b(String str) {
        this.f262055c = str;
    }

    /* renamed from: b */
    public String mo125342b() {
        return mo125343c();
    }

    /* renamed from: c */
    public String mo125343c() {
        return C91374g.f262062c + "/" + this.f262055c + ".json";
    }

    /* renamed from: d */
    public boolean mo125344d() {
        return true;
    }

    public String toString() {
        return "FewshotModel{moduleName='" + this.f262055c + '}';
    }
}
