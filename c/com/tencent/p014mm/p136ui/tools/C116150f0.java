package com.tencent.p014mm.p136ui.tools;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.vfs.C86013q1;
import nj3.C76879j;

/* renamed from: com.tencent.mm.ui.tools.f0 */
public class C116150f0 implements C76879j.C11180n {

    /* renamed from: a */
    public final /* synthetic */ CropImageNewUI f348603a;

    public C116150f0(CropImageNewUI cropImageNewUI) {
        this.f348603a = cropImageNewUI;
    }

    /* renamed from: j */
    public void mo782j(int i) {
        if (i == 0) {
            CropImageNewUI cropImageNewUI = this.f348603a;
            C76879j.m92750u(cropImageNewUI, cropImageNewUI.getString(C0966R.string.bwb, new Object[]{Long.toString(C86013q1.m106451l(cropImageNewUI.f348472o) / 1024)}), cropImageNewUI.getString(C0966R.string.a3h), new C116151g0(cropImageNewUI), new C116152h0(cropImageNewUI));
        }
    }
}
