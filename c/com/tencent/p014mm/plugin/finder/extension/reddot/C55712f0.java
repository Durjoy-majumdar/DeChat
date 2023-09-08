package com.tencent.p014mm.plugin.finder.extension.reddot;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.f0 */
public final class C55712f0<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ FinderRedDotExpiredHandler f158576d;

    public C55712f0(FinderRedDotExpiredHandler finderRedDotExpiredHandler) {
        this.f158576d = finderRedDotExpiredHandler;
    }

    public void onChanged(Object obj) {
        C2479n0.C2480a aVar = (C2479n0.C2480a) obj;
        boolean z = false;
        if (aVar != null && !aVar.f12908a) {
            z = true;
        }
        if (z) {
            FinderRedDotExpiredHandler finderRedDotExpiredHandler = this.f158576d;
            finderRedDotExpiredHandler.getClass();
            Log.m105924i("Finder.RedDotExpiredHandler", "clearCheckDoSync");
            finderRedDotExpiredHandler.f158520e.post(C29943e0.f81099d);
        }
    }
}
