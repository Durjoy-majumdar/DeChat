package cp3;

import android.content.Context;
import p148ei.C7660a;
import p148ei.C7662f;
import qo3.C77426q;

/* renamed from: cp3.c */
public final class C7123c {

    /* renamed from: a */
    public static final C7123c f25086a = new C7123c();

    /* renamed from: a */
    public final boolean mo8286a(Context context, C7660a aVar) {
        C7662f fVar;
        if (aVar == null || aVar.f26002c != 4 || (fVar = aVar.f26004e) == null || fVar.f26012d != 1) {
            return false;
        }
        String str = aVar.f26003d;
        String str2 = aVar.f26001b;
        String str3 = fVar.f26014f;
        String str4 = aVar.f26000a;
        if (context == null) {
            return true;
        }
        C77426q qVar = new C77426q(context);
        if (str == null) {
            str = "";
        }
        qVar.mo107606r(str);
        if (str2 == null) {
            str2 = "";
        }
        qVar.mo107595g(str2);
        if (str3 == null) {
            str3 = "";
        }
        qVar.mo107602n(str3);
        qVar.mo107589a(true);
        qVar.mo107590b(new C7122b(context, str4));
        qVar.mo107603o();
        return true;
    }
}
