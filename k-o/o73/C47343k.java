package o73;

import com.tencent.p014mm.plugin.wear.model.C43457b;
import java.io.IOException;
import te3.i15;

/* renamed from: o73.k */
public class C47343k extends C47335c {

    /* renamed from: d */
    public int f127039d;

    /* renamed from: e */
    public String f127040e;

    public C47343k(int i, String str) {
        this.f127039d = i;
        this.f127040e = str;
    }

    /* renamed from: b */
    public String mo67621b() {
        return "WearPushPayResponseTask";
    }

    /* renamed from: c */
    public void mo67622c() {
        i15 i15 = new i15();
        int i = this.f127039d;
        if (i != 0) {
            switch (i) {
                case 6:
                    i15.f135027d = 196610;
                    break;
                case 7:
                    i15.f135027d = 196615;
                    break;
                case 8:
                    i15.f135027d = 196614;
                    break;
                case 9:
                    i15.f135027d = 196613;
                    break;
            }
        } else {
            i15.f135027d = 0;
        }
        i15.f135028e = this.f127040e;
        try {
            C43457b.zx0().mo72270b(20016, i15.toByteArray(), true);
        } catch (IOException unused) {
        }
    }
}
