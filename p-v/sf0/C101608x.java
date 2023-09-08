package sf0;

import android.text.TextUtils;
import p159gw.C98250h;
import p329d3.C86165a;

/* renamed from: sf0.x */
public class C101608x implements C86165a<String> {

    /* renamed from: a */
    public final /* synthetic */ C98250h.C98251a f297452a;

    /* renamed from: b */
    public final /* synthetic */ String f297453b;

    /* renamed from: c */
    public final /* synthetic */ String f297454c;

    public C101608x(C98250h.C98251a aVar, String str, String str2) {
        this.f297452a = aVar;
        this.f297453b = str;
        this.f297454c = str2;
    }

    public void accept(Object obj) {
        String str = (String) obj;
        if (this.f297452a == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.f297452a.mo2055a(this.f297453b, str);
        } else {
            this.f297452a.mo2056b(this.f297453b, this.f297454c);
        }
    }
}
