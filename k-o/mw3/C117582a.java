package mw3;

import android.content.Context;
import android.text.TextUtils;
import gw3.C116997a;
import rv3.C118243f;
import tv3.C118547b;

/* renamed from: mw3.a */
public class C117582a {

    /* renamed from: a */
    public Context f351739a;

    /* renamed from: b */
    public C118547b f351740b = null;

    public C117582a(Context context, int i) {
        this.f351739a = context;
    }

    /* renamed from: a */
    public final C118547b mo182316a(C116997a aVar) {
        if (this.f351740b == null) {
            C118547b bVar = new C118547b();
            this.f351740b = bVar;
            bVar.f354777o = 91;
            bVar.f354784v = (int) aVar.f350597h;
            bVar.f354774i = String.valueOf(aVar.f350594e);
            C118547b bVar2 = this.f351740b;
            bVar2.f354773h = aVar.f350607u;
            bVar2.f354781s = 0;
            bVar2.f354783u = aVar.f350611y;
            bVar2.f354769d = TextUtils.isEmpty(aVar.f350589C) ? "" : aVar.f350589C;
            C118547b bVar3 = this.f351740b;
            bVar3.f354780r = aVar.f350609w;
            bVar3.f354782t = 0;
        }
        C118547b bVar4 = this.f351740b;
        int i = 2;
        try {
            if (C118243f.m166797a(this.f351739a) != 0) {
                i = 1;
            }
        } catch (Throwable unused) {
        }
        bVar4.f354776n = i;
        return this.f351740b;
    }
}
