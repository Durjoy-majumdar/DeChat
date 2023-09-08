package com.tencent.p014mm.p136ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import p1028re.C89928a;
import p761yd.C38993b;

/* renamed from: com.tencent.mm.ui.w2 */
public class C74941w2 implements C89928a {

    /* renamed from: d */
    public final /* synthetic */ NewChattingTabUI f220333d;

    public C74941w2(NewChattingTabUI newChattingTabUI) {
        this.f220333d = newChattingTabUI;
    }

    /* renamed from: a */
    public void mo391a(int i) {
        if (C38993b.m41995e("clicfg_matrix_trim_memory_chattingtab_prepared_bitmap", false)) {
            Log.m105924i("MicroMsg.LauncherUI.NewChattingTabUI", "systemTrim: recyclePrepareBitmap");
            this.f220333d.mo101506l();
        }
    }

    /* renamed from: b */
    public void mo392b() {
        if (C38993b.m41995e("clicfg_matrix_trim_memory_chattingtab_prepared_bitmap", false)) {
            Log.m105924i("MicroMsg.LauncherUI.NewChattingTabUI", "backgroundTrim: recyclePrepareBitmap");
            this.f220333d.mo101506l();
        }
    }
}
