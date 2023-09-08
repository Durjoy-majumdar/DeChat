package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.y3 */
public final class C40808y3 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BizTimeLineSettingUI f109678d;

    /* renamed from: e */
    public final /* synthetic */ String f109679e;

    public C40808y3(BizTimeLineSettingUI bizTimeLineSettingUI, String str) {
        this.f109678d = bizTimeLineSettingUI;
        this.f109679e = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        ((CheckBoxPreference) ((C36570n) this.f109678d.f109273d).getValue()).mo6808N(this.f109678d.f109275f.f131482d);
        ((CheckBoxPreference) ((C36570n) this.f109678d.f109274e).getValue()).mo6808N(this.f109678d.f109275f.f131483e);
        BizTimeLineSettingUI bizTimeLineSettingUI = this.f109678d;
        bizTimeLineSettingUI.mo63585J7(bizTimeLineSettingUI.f109275f, this.f109679e);
        BizTimeLineSettingUI.m43920H7(this.f109678d);
    }
}
