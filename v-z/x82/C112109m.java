package x82;

import android.content.Context;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;

/* renamed from: x82.m */
public final class C112109m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C112102l f335656d;

    /* renamed from: e */
    public final /* synthetic */ String f335657e;

    public C112109m(C112102l lVar, String str) {
        this.f335656d = lVar;
        this.f335657e = str;
    }

    public final void run() {
        RelativeLayout relativeLayout = this.f335656d.f335629a;
        StringBuilder sb = new StringBuilder();
        Context context = this.f335656d.f335638j;
        Long l = null;
        sb.append(context != null ? context.getString(C0966R.string.bcm) : null);
        sb.append(',');
        sb.append(((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f335657e).getNickname());
        relativeLayout.setContentDescription(sb.toString());
        if (!C87412m.m108589b(this.f335656d.f335636h, this.f335657e)) {
            C112102l lVar = this.f335656d;
            String str = this.f335657e;
            if (str != null) {
                lVar.getClass();
                l = Long.valueOf(Util.currentTicks());
            }
            lVar.f335637i = l;
            lVar.f335635g = str;
            lVar.f335636h = str;
            this.f335656d.f335637i = Long.valueOf(Util.currentTicks());
        }
    }
}
