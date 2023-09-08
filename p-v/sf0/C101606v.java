package sf0;

import android.text.TextUtils;
import p159gw.C98250h;
import p329d3.C86165a;

/* renamed from: sf0.v */
public class C101606v implements C86165a<String> {

    /* renamed from: a */
    public final /* synthetic */ C98250h.C98251a f297447a;

    /* renamed from: b */
    public final /* synthetic */ String f297448b;

    /* renamed from: c */
    public final /* synthetic */ String f297449c;

    public C101606v(C98250h.C98251a aVar, String str, String str2) {
        this.f297447a = aVar;
        this.f297448b = str;
        this.f297449c = str2;
    }

    public void accept(Object obj) {
        String str = (String) obj;
        if (this.f297447a == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.f297447a.mo2055a(this.f297448b, str);
        } else {
            this.f297447a.mo2056b(this.f297448b, this.f297449c);
        }
    }
}
