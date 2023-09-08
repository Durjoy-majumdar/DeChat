package com.tencent.p014mm.p136ui.tools;

import a70.C112760b;
import android.content.Intent;
import android.content.SharedPreferences;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p823sg.C90193h;

/* renamed from: com.tencent.mm.ui.tools.i0 */
public class C116153i0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CropImageNewUI f348605d;

    public C116153i0(CropImageNewUI cropImageNewUI) {
        this.f348605d = cropImageNewUI;
    }

    public void run() {
        CropImageNewUI cropImageNewUI = this.f348605d;
        if (cropImageNewUI.f348466f != null) {
            if (cropImageNewUI.getIntent().getBooleanExtra("CropImage_DirectlyIntoFilter", false)) {
                SharedPreferences.Editor edit = this.f348605d.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).edit();
                edit.putBoolean("CropImage_Filter_Show", this.f348605d.f348466f.findViewById(C0966R.C0970id.bww).getVisibility() == 0);
                edit.commit();
            }
            String stringExtra = this.f348605d.getIntent().getStringExtra("CropImage_OutputPath");
            if (stringExtra == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(C112760b.m154240l());
                sb.append(C90193h.m112878f((this.f348605d.f348472o + System.currentTimeMillis()).getBytes()));
                sb.append("_fiter.jpg");
                stringExtra = sb.toString();
            }
            Intent intent = new Intent();
            intent.putExtra("CropImage_Compress_Img", true);
            FilterImageView filterImageView = this.f348605d.f348466f;
            if (filterImageView != null) {
                intent.putExtra("CropImage_filterId", filterImageView.getFilterId());
            }
            if (this.f348605d.f348466f.getFilterId() == 0) {
                intent.putExtra("CropImage_OutputPath", this.f348605d.f348472o);
                this.f348605d.setResult(-1, intent);
            } else {
                CropImageNewUI cropImageNewUI2 = this.f348605d;
                if (cropImageNewUI2.mo177434M7(cropImageNewUI2.f348466f.getFilterBmp(), stringExtra, false)) {
                    intent.putExtra("CropImage_OutputPath", stringExtra);
                    this.f348605d.setResult(-1, intent);
                } else {
                    this.f348605d.setResult(-1);
                }
            }
            this.f348605d.finish();
        }
    }
}
