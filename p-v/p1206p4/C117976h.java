package p1206p4;

import android.content.Context;
import android.text.TextUtils;
import p1188d4.C116563c;
import p1191e4.C116686c;

/* renamed from: p4.h */
public class C117976h implements C116563c.C116566c {

    /* renamed from: a */
    public final /* synthetic */ Context f352598a;

    public C117976h(Context context) {
        this.f352598a = context;
    }

    /* renamed from: a */
    public C116563c mo180546a(C116563c.C116565b bVar) {
        Context context = this.f352598a;
        String str = bVar.f349580b;
        C116563c.C116564a aVar = bVar.f349581c;
        if (aVar == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        } else if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        } else if (!TextUtils.isEmpty(str)) {
            C116563c.C116565b bVar2 = new C116563c.C116565b(context, str, aVar, true);
            return new C116686c(bVar2.f349579a, bVar2.f349580b, bVar2.f349581c, bVar2.f349582d);
        } else {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
    }
}
