package com.tencent.p014mm.plugin.topstory.p113ui.home;

import android.text.Editable;
import android.text.TextWatcher;
import hc0.C20937c;

/* renamed from: com.tencent.mm.plugin.topstory.ui.home.u */
public class C71547u implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ TopStoryUploadUI f207328d;

    public C71547u(TopStoryUploadUI topStoryUploadUI) {
        this.f207328d = topStoryUploadUI;
    }

    public void afterTextChanged(Editable editable) {
        TopStoryUploadUI topStoryUploadUI = this.f207328d;
        C20937c cVar = TopStoryUploadUI.f207300D;
        topStoryUploadUI.mo98660J7();
        TopStoryUploadUI topStoryUploadUI2 = this.f207328d;
        if (topStoryUploadUI2.f207321x.getText().toString().length() <= 200) {
            topStoryUploadUI2.enableOptionMenu(0, true);
        } else {
            topStoryUploadUI2.enableOptionMenu(0, false);
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
