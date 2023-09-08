package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.vfs.C86013q1;
import p159gw.C98250h;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.v */
public class C5403v implements C98250h.C98251a {

    /* renamed from: a */
    public final /* synthetic */ PreviewHdHeadImg f21089a;

    public C5403v(PreviewHdHeadImg previewHdHeadImg) {
        this.f21089a = previewHdHeadImg;
    }

    /* renamed from: a */
    public void mo2055a(String str, String str2) {
        AndroidMediaUtil.refreshMediaScanner(str2, this.f21089a.getContext());
        C76701a.makeText((Context) this.f21089a.getContext(), (CharSequence) this.f21089a.getContext().getString(C0966R.string.fen, new Object[]{AndroidMediaUtil.getSysCameraDirPath()}), 1).show();
    }

    /* renamed from: b */
    public void mo2056b(String str, String str2) {
        int i;
        AppCompatActivity appCompatActivity;
        if (C86013q1.m106450k(this.f21089a.f205628g)) {
            appCompatActivity = this.f21089a.getContext();
            i = C0966R.string.iak;
        } else {
            appCompatActivity = this.f21089a.getContext();
            i = C0966R.string.iqs;
        }
        C76701a.makeText((Context) this.f21089a.getContext(), (CharSequence) appCompatActivity.getString(i), 1).show();
    }
}
