package sf0;

import android.text.TextUtils;
import p159gw.C98250h;
import p329d3.C86165a;

/* renamed from: sf0.o */
public class C101603o implements C86165a<String> {

    /* renamed from: a */
    public final /* synthetic */ C98250h.C98251a f297440a;

    /* renamed from: b */
    public final /* synthetic */ String f297441b;

    /* renamed from: c */
    public final /* synthetic */ String f297442c;

    public C101603o(C98250h.C98251a aVar, String str, String str2) {
        this.f297440a = aVar;
        this.f297441b = str;
        this.f297442c = str2;
    }

    public void accept(Object obj) {
        String str = (String) obj;
        if (this.f297440a == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.f297440a.mo2055a(this.f297441b, str);
        } else {
            this.f297440a.mo2056b(this.f297441b, this.f297442c);
        }
    }
}
