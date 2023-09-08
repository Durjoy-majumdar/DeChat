package cw0;

import android.content.Context;
import android.util.Pair;
import com.tencent.p014mm.sdk.platformtools.Log;
import df2.C75381g;
import df2.C75390h;

/* renamed from: cw0.e */
public class C75305e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ c$$k f221454d;

    /* renamed from: e */
    public final /* synthetic */ Context f221455e;

    /* renamed from: f */
    public final /* synthetic */ Pair f221456f;

    /* renamed from: g */
    public final /* synthetic */ boolean f221457g;

    public C75305e(c$$k c__k, Context context, Pair pair, boolean z) {
        this.f221454d = c__k;
        this.f221455e = context;
        this.f221456f = pair;
        this.f221457g = z;
    }

    public void run() {
        try {
            C75381g gVar = ((C75390h) this.f221454d).f221649a;
            C116541b.m164352b(gVar.f221633d, gVar.f221634e.getUsername(), true);
            C116542c.m164370g(this.f221455e, ((Integer) this.f221456f.first).intValue(), ((Integer) this.f221456f.second).intValue(), this.f221457g, (String) null, false);
        } catch (IllegalStateException e) {
            Log.m105928w("MicroMsg.ShortcutUtil", e.toString());
        }
    }
}
