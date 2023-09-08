package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import p441aq.C92054g;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI$$k */
public class CustomSmileyPreviewUI$$k implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ CustomSmileyPreviewUI f268378d;

    public CustomSmileyPreviewUI$$k(CustomSmileyPreviewUI customSmileyPreviewUI) {
        this.f268378d = customSmileyPreviewUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        CustomSmileyPreviewUI customSmileyPreviewUI = this.f268378d;
        int i = CustomSmileyPreviewUI.f268306a1;
        customSmileyPreviewUI.getClass();
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        EmojiInfo TO = C30790w2.m39221h().mo57717d().mo142044TO(customSmileyPreviewUI.f268364z.getMd5());
        if (TO != null) {
            customSmileyPreviewUI.f268364z = TO;
        }
        C77407n nVar = new C77407n((Context) customSmileyPreviewUI, 1, false);
        nVar.f225771i = new C93188h(customSmileyPreviewUI);
        nVar.f225782p = new C93190i(customSmileyPreviewUI);
        nVar.mo107573q();
        return true;
    }
}
