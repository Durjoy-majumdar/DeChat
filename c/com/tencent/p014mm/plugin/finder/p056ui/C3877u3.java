package com.tencent.p014mm.plugin.finder.p056ui;

import android.app.Dialog;
import android.content.Context;
import bd1.C39759i;
import bd1.C54446b;
import bd1.C54447c;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import ht1.C8794p5;
import nj3.C76912y0;
import te3.C50542nh0;
import te3.C64553md1;
import zc1.C66783a;
import zc1.C66785b;

/* renamed from: com.tencent.mm.plugin.finder.ui.u3 */
public final class C3877u3 implements C8794p5<C64553md1> {

    /* renamed from: d */
    public final /* synthetic */ FinderSettingPrivacyUI f17431d;

    public C3877u3(FinderSettingPrivacyUI finderSettingPrivacyUI) {
        this.f17431d = finderSettingPrivacyUI;
    }

    /* renamed from: c5 */
    public void mo705c5(Object obj, C50542nh0 nh02) {
        C64553md1 md12 = (C64553md1) obj;
        C87412m.m108594g(md12, "req");
        C87412m.m108594g(nh02, "ret");
        Dialog dialog = this.f17431d.f17096d;
        if (dialog != null) {
            dialog.dismiss();
        }
        int i = 0;
        if (nh02.f138603e == 0) {
            C66785b bVar = C66785b.f191882e;
            C54446b a = C66783a.C66784a.m78798a(bVar, bVar.mo90662O5(), false, 2, (Object) null);
            if (a != null) {
                i = a.field_extFlag;
            }
            int i2 = md12.f184311w == 1 ? i | 2048 : i & -2049;
            C54447c cVar = new C54447c(bVar.mo90662O5());
            cVar.field_extFlag = i2;
            bVar.mo90672m1(cVar, C39759i.MODIFY_USER);
            return;
        }
        FinderSettingPrivacyUI finderSettingPrivacyUI = this.f17431d;
        C76912y0.makeText((Context) finderSettingPrivacyUI, (CharSequence) finderSettingPrivacyUI.getString(C0966R.string.et6), 0).show();
    }
}
