package y30;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.vfs.C86009m1;

/* renamed from: y30.a */
public class C91370a {

    /* renamed from: a */
    public String f262053a;

    /* renamed from: b */
    public String f262054b;

    /* renamed from: c */
    public String f262055c;

    /* renamed from: d */
    public String f262056d;

    /* renamed from: a */
    public String mo125341a() {
        return this.f262055c + "_" + this.f262056d + "_" + this.f262054b;
    }

    /* renamed from: b */
    public String mo125342b() {
        if (TextUtils.isEmpty(mo125343c())) {
            return "";
        }
        C86009m1 m1Var = new C86009m1(mo125343c());
        return m1Var.mo119967g() ? m1Var.getName() : "";
    }

    /* renamed from: c */
    public String mo125343c() {
        return C91374g.f262061b + "/" + mo125341a();
    }

    /* renamed from: d */
    public boolean mo125344d() {
        if (TextUtils.isEmpty(this.f262056d)) {
            return false;
        }
        return !TextUtils.isEmpty(this.f262055c) && !TextUtils.isEmpty(this.f262054b) && ((Long.parseLong(BuildInfo.CLIENT_VERSION.replace("0x", ""), 16) > Long.parseLong(this.f262056d.replace("0x", ""), 16) ? 1 : (Long.parseLong(BuildInfo.CLIENT_VERSION.replace("0x", ""), 16) == Long.parseLong(this.f262056d.replace("0x", ""), 16) ? 0 : -1)) >= 0);
    }

    public String toString() {
        return "BaseModel{url='" + this.f262053a + '\'' + ", md5='" + this.f262054b + '\'' + ", moduleName='" + this.f262055c + '\'' + ", minVersion='" + this.f262056d + '\'' + '}';
    }
}
