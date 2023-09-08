package o73;

import com.tencent.p014mm.plugin.wear.model.C43457b;
import d62.C75339i;
import di3.C86312j;
import java.util.List;
import l73.C46836a;
import te3.w05;
import te3.x05;

/* renamed from: o73.h */
public class C47340h extends C47334b {

    /* renamed from: d */
    public long f127030d;

    /* renamed from: e */
    public long f127031e;

    /* renamed from: f */
    public String f127032f;

    /* renamed from: g */
    public List<String> f127033g;

    public C47340h(long j, long j2, String str, List<String> list) {
        this.f127030d = j;
        this.f127031e = j2;
        this.f127032f = str;
        this.f127033g = list;
    }

    /* renamed from: b */
    public String mo67621b() {
        return "WearLuckyReceiveTask";
    }

    /* renamed from: c */
    public void mo67622c() {
        w05 w05 = new w05();
        w05.f143802d = this.f127031e;
        w05.f143803e = this.f127030d;
        w05.f143804f = this.f127032f;
        try {
            List<String> list = this.f127033g;
            if (list != null) {
                for (String split : list) {
                    String[] split2 = split.split("=");
                    x05 x05 = new x05();
                    x05.f144382d = split2[0];
                    String str = split2[1];
                    x05.f144383e = str;
                    if (str.startsWith("wxid")) {
                        x05.f144383e = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(x05.f144383e);
                    }
                    x05.f144384f = Long.valueOf(split2[2]).longValue();
                    w05.f143805g.add(x05);
                }
            }
            C43457b.zx0().mo72270b(20015, w05.toByteArray(), true);
        } catch (Exception unused) {
        }
        if (this.f127031e > 0) {
            C46836a.m52130c(true);
        } else {
            C46836a.m52130c(false);
        }
    }
}
