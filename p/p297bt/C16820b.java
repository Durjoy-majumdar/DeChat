package p297bt;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import l20.C21388a;
import l20.C21389b;
import p327ct.C20362d;
import p327ct.C30914c;

@C86522b
/* renamed from: bt.b */
public class C16820b extends C86301e implements C30914c {
    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        C21388a g = C21388a.m24108g();
        g.f60496b.clear();
        C21389b bVar = g.f60495a;
        bVar.getClass();
        Log.m105918d("MicroMsg.NewBadgeDecoder", "[carl] decoder.clear()");
        bVar.f60510a.clear();
        bVar.f60512c.clear();
        bVar.f60511b.clear();
        bVar.f60513d.clear();
        g.f60497c = false;
    }

    /* renamed from: sM */
    public C20362d mo17862sM() {
        return C21388a.m24108g();
    }
}
