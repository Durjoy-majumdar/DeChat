package xr0;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.appusage.C68585h1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import di3.C86312j;
import nj3.C76879j;
import qo3.C77398g;
import wt0.C78650e;

/* renamed from: xr0.i */
public class C78972i {
    /* renamed from: a */
    public static boolean m95479a(boolean z, Context context, String str, int i) {
        Class cls = C68585h1.class;
        if (z) {
            try {
                if (((C68585h1) C86312j.m106911c(cls)).mo94244mJ(str, i)) {
                    C78650e eVar = new C78650e(context);
                    eVar.mo108614a(context.getResources().getString(C0966R.string.f7910vz));
                    eVar.mo108615b(1500);
                    return true;
                }
                MMHandlerThread.postToMainThread(new C15879h(context, z));
            } catch (Exception e) {
                Log.m105921e("MicroMsg.CollectionModifyInteractLogic", "performClick, (%s %d) added = %b, modify e = %s", str, Integer.valueOf(i), Boolean.valueOf(z), e);
                MMHandlerThread.postToMainThread(new C15879h(context, z));
            }
        } else {
            int rg02 = ((C68585h1) C86312j.m106911c(cls)).rg0(str, i);
            if (rg02 == 0) {
                C78650e eVar2 = new C78650e(context);
                eVar2.mo108614a(context.getResources().getString(C0966R.string.f7909vy));
                eVar2.mo108615b(1500);
                return true;
            } else if (rg02 == -2) {
                int Tk = ((C68585h1) C86312j.m106911c(cls)).mo94241Tk();
                C77398g y = C76879j.m92754y(context, context.getResources().getString(C0966R.string.f7659my, new Object[]{Integer.valueOf(Tk)}), "", context.getResources().getString(C0966R.string.a18), (DialogInterface.OnClickListener) null);
                if (y != null) {
                    y.setCanceledOnTouchOutside(false);
                    y.mo107530l(true);
                }
            } else if (rg02 == -3) {
                C77398g y2 = C76879j.m92754y(context, context.getResources().getString(C0966R.string.f7600kw), "", context.getResources().getString(C0966R.string.a18), (DialogInterface.OnClickListener) null);
                if (y2 != null) {
                    y2.setCanceledOnTouchOutside(false);
                    y2.mo107530l(true);
                }
            } else {
                MMHandlerThread.postToMainThread(new C15879h(context, z));
            }
        }
        return false;
    }
}
