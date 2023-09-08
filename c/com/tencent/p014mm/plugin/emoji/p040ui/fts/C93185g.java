package com.tencent.p014mm.plugin.emoji.p040ui.fts;

import android.app.Dialog;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import c00.C92330r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import di3.C86312j;
import java.util.ArrayList;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.emoji.ui.fts.g */
public class C93185g implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ FTSEmojiDetailPageUI f268741d;

    public C93185g(FTSEmojiDetailPageUI fTSEmojiDetailPageUI) {
        this.f268741d = fTSEmojiDetailPageUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        FTSEmojiDetailPageUI fTSEmojiDetailPageUI = this.f268741d;
        int i = FTSEmojiDetailPageUI.f268694P;
        fTSEmojiDetailPageUI.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (fTSEmojiDetailPageUI.f268718p) {
            arrayList.add(1);
            arrayList2.add(fTSEmojiDetailPageUI.getString(C0966R.string.iaq));
        }
        arrayList.add(2);
        arrayList2.add(fTSEmojiDetailPageUI.getString(C0966R.string.c88));
        if (fTSEmojiDetailPageUI.f268716n == null) {
            fTSEmojiDetailPageUI.f268716n = new C45082x0(fTSEmojiDetailPageUI.getContext());
        }
        C45082x0 x0Var = fTSEmojiDetailPageUI.f268716n;
        x0Var.f122287f = new C68862i(fTSEmojiDetailPageUI, arrayList, arrayList2);
        x0Var.f122288g = fTSEmojiDetailPageUI.f268708N;
        C93179a aVar = new C93179a(fTSEmojiDetailPageUI);
        x0Var.f122289h = aVar;
        x0Var.f122286e.f225761d = aVar;
        AppCompatActivity context = fTSEmojiDetailPageUI.getContext();
        fTSEmojiDetailPageUI.f268716n.mo70439e();
        C76879j.m92730a(context, (Dialog) null);
        ((C92330r) C86312j.m106911c(C92330r.class)).mo126126PR(fTSEmojiDetailPageUI.f268723u, fTSEmojiDetailPageUI.f268724v, fTSEmojiDetailPageUI.f268726x, 7, 0, 0, fTSEmojiDetailPageUI.f268725w);
        return true;
    }
}
