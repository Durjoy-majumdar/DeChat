package eb0;

import com.tencent.p014mm.storage.C72963f4;
import java.util.Map;
import sc0.C36652a;

/* renamed from: eb0.n4 */
public class C31494n4 extends C36652a {
    public C31494n4(Map<String, String> map, C72963f4 f4Var) {
        super(map, f4Var);
    }

    /* renamed from: b */
    public boolean mo58201b() {
        if (this.f97418a == null || !this.f97421d.equals("reportbizlocation")) {
            return false;
        }
        String str = this.f97418a.get(".sysmsg.reportbizlocation.link.text");
        String str2 = this.f97418a.get(".sysmsg.reportbizlocation.text") + str;
        this.f97424g.add(str);
        this.f97425h.addFirst(Integer.valueOf(str2.length() - str.length()));
        this.f97426i.add(Integer.valueOf(str2.length()));
        this.f97420c = str2;
        return false;
    }
}
