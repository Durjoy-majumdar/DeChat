package com.tencent.p014mm.p136ui;

import android.view.MenuItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.coremedia.TimeUtil;

/* renamed from: com.tencent.mm.ui.a2 */
public abstract class C44701a2 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public long f121223d = -1;

    /* renamed from: a */
    public abstract void mo62772a(MenuItem menuItem);

    public boolean onMenuItemClick(MenuItem menuItem) {
        Log.m105924i("MicroMsg.MMCustomMenuItemClickListener", "button onclick");
        if (this.f121223d != -1) {
            long nanoTime = (System.nanoTime() - this.f121223d) / TimeUtil.SECOND_TO_US;
            if (nanoTime < 500) {
                Log.m105925i("MicroMsg.MMCustomMenuItemClickListener", "click time limited limitetime:%d, delaytime:%d", Long.valueOf(nanoTime), 500L);
                return false;
            }
        }
        this.f121223d = System.nanoTime();
        mo62772a(menuItem);
        return false;
    }
}
