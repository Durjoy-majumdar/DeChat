package com.tencent.p014mm.smiley;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.emotion.SmileyInfo;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.smiley.m0 */
public final class C96958m0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C96945j0 f284057d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList<SmileyInfo> f284058e;

    public C96958m0(C96945j0 j0Var, ArrayList<SmileyInfo> arrayList) {
        this.f284057d = j0Var;
        this.f284058e = arrayList;
    }

    public final void run() {
        C96945j0 j0Var = this.f284057d;
        String str = j0Var.f284000a + j0Var.f284005f;
        if (!C86013q1.m106450k(str)) {
            if (!C86013q1.m106450k(this.f284057d.f284000a)) {
                C86013q1.m106461v(this.f284057d.f284000a);
            }
            C86013q1.m106442c(this.f284057d.f284002c + this.f284057d.f284005f, str);
            Log.m105924i("MicroMsg.QQSmileyManager", "saveSmileyResFile success, localNewSmileyConfig:" + str);
        } else {
            Log.m105924i("MicroMsg.QQSmileyManager", "saveSmileyResFile localNewSmileyConfig exists");
        }
        ArrayList<SmileyInfo> arrayList = this.f284058e;
        C96945j0 j0Var2 = this.f284057d;
        for (SmileyInfo smileyInfo : arrayList) {
            if (!C86013q1.m106450k(j0Var2.f284000a + smileyInfo.field_fileName)) {
                C86013q1.m106442c(j0Var2.f284002c + smileyInfo.field_fileName, j0Var2.f284000a + smileyInfo.field_fileName);
            }
        }
        C96945j0 j0Var3 = this.f284057d;
        if (j0Var3.f284006g.length != j0Var3.f284008i.length) {
            Log.m105924i("MicroMsg.QQSmileyManager", "saveSmileyResFile read smiley array failed.");
        } else if (C86013q1.m106461v(j0Var3.f284001b)) {
            C96945j0 j0Var4 = this.f284057d;
            C86013q1.m106441b(j0Var4.f284003d, j0Var4.f284001b);
            Log.m105924i("MicroMsg.QQSmileyManager", "saveSmileyResFile success, localQQSmileyDir:" + this.f284057d.f284001b);
        }
    }
}
