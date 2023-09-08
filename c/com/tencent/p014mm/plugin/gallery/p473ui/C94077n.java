package com.tencent.p014mm.plugin.gallery.p473ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.gallery.ui.n */
public class C94077n implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ SmartGalleryUI f271644d;

    public C94077n(SmartGalleryUI smartGalleryUI) {
        this.f271644d = smartGalleryUI;
    }

    public void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        Log.m105919d("MicroMsg.SmartGalleryUI", "cur txt: %s.", obj);
        this.f271644d.f271482i.f271531g = obj;
        if (Util.isNullOrNil(obj)) {
            SmartGalleryUI smartGalleryUI = this.f271644d;
            smartGalleryUI.f271487q = false;
            smartGalleryUI.f271477d.setAdapter(smartGalleryUI.f271479f);
            SmartGalleryUI smartGalleryUI2 = this.f271644d;
            smartGalleryUI2.f271477d.mo17085h0(smartGalleryUI2.f271489s);
            this.f271644d.f271479f.notifyDataSetChanged();
            return;
        }
        SmartGalleryUI.m118867H7(this.f271644d, obj, false);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
