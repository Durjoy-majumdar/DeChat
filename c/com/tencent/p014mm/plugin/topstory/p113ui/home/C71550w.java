package com.tencent.p014mm.plugin.topstory.p113ui.home;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import hc0.C20937c;

/* renamed from: com.tencent.mm.plugin.topstory.ui.home.w */
public class C71550w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TopStoryUploadUI f207331d;

    public C71550w(TopStoryUploadUI topStoryUploadUI) {
        this.f207331d = topStoryUploadUI;
    }

    public void run() {
        WeImageView weImageView;
        TopStoryUploadUI topStoryUploadUI = this.f207331d;
        C20937c cVar = TopStoryUploadUI.f207300D;
        MMActivityController mMActivityController = topStoryUploadUI.mController;
        if (mMActivityController != null) {
            String string = topStoryUploadUI.getResources().getString(C0966R.string.f7368e5);
            if (mMActivityController.f348065F != null && (weImageView = mMActivityController.f348069J) != null) {
                weImageView.setContentDescription(string);
            }
        }
    }
}
