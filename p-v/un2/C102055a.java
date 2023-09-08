package un2;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: un2.a */
public class C102055a {

    /* renamed from: a */
    public LinkedList<C102056a> f300539a = new LinkedList<>();

    /* renamed from: a */
    public static C102056a m134442a(Map<String, String> map, int i, String str) {
        C102056a aVar = new C102056a(i);
        aVar.f300541b = Util.nullAsNil(map.get(str + ".title"));
        aVar.f300542c = Util.nullAsNil(map.get(str + ".summary"));
        String str2 = str + ".thumburl";
        int i2 = 0;
        while (i2 < 100) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(i2 > 0 ? Integer.valueOf(i2) : "");
            String str3 = map.get(sb.toString());
            if (Util.isNullOrNil(str3)) {
                break;
            }
            ((ArrayList) aVar.f300544e).add(str3);
            i2++;
        }
        if (i == 3) {
            aVar.f300543d = Util.nullAsNil(map.get(str + ".h5url.link"));
            aVar.f300545f = Util.nullAsNil(map.get(str + ".h5url.title"));
            aVar.f300546g = Util.nullAsNil(map.get(str + ".h5url.username"));
        } else if (i == 4) {
            aVar.f300543d = Util.nullAsNil(map.get(str + ".bizprofile.username"));
            aVar.f300545f = Util.nullAsNil(map.get(str + ".bizprofile.showchat"));
        } else if (i == 5) {
            aVar.f300543d = Util.nullAsNil(map.get(str + ".nativepay.wx_pay_url"));
        } else if (i == 6) {
            aVar.f300543d = Util.nullAsNil(map.get(str + ".product.product_id"));
        }
        return aVar;
    }

    /* renamed from: un2.a$a */
    public static class C102056a {

        /* renamed from: a */
        public int f300540a;

        /* renamed from: b */
        public String f300541b;

        /* renamed from: c */
        public String f300542c;

        /* renamed from: d */
        public String f300543d;

        /* renamed from: e */
        public List<String> f300544e = new ArrayList();

        /* renamed from: f */
        public String f300545f = "";

        /* renamed from: g */
        public String f300546g = "";

        public C102056a() {
        }

        public C102056a(int i) {
            this.f300540a = i;
        }
    }
}
