package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.C106690i4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.f0 */
public final class C96869f0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ FileSelectorUI f283844d;

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.f0$a */
    public static final class C96870a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FileSelectorUI f283845d;

        public C96870a(FileSelectorUI fileSelectorUI) {
            this.f283845d = fileSelectorUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            Log.m105924i("MicroMsg.FileSelectorUI", "backBtn");
            FileSelectorUI fileSelectorUI = this.f283845d;
            FileSelectorUI.C72909b bVar = FileSelectorUI.f283702y;
            fileSelectorUI.mo135137M7(true);
            return false;
        }
    }

    public C96869f0(FileSelectorUI fileSelectorUI) {
        this.f283844d = fileSelectorUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        Log.m105924i("MicroMsg.FileSelectorUI", "backBtn");
        C106690i4 i4Var = this.f283844d.f283718v;
        if (i4Var != null) {
            i4Var.removeAllViews();
        }
        View contentView = this.f283844d.getContentView();
        C87412m.m108592e(contentView, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) contentView).removeView(this.f283844d.f283718v);
        FileSelectorUI fileSelectorUI = this.f283844d;
        fileSelectorUI.setBackBtn(new C96870a(fileSelectorUI), C0966R.raw.actionbar_quit_webview_icon);
        DropdownListView dropdownListView = this.f283844d.f283713q;
        if (dropdownListView != null) {
            dropdownListView.setVisibility(0);
            FileSelectorUI fileSelectorUI2 = this.f283844d;
            fileSelectorUI2.getClass();
            fileSelectorUI2.setActionBarOperationAreaClickListener(new C96873h0(fileSelectorUI2));
            FileSelectorUI fileSelectorUI3 = this.f283844d;
            fileSelectorUI3.initActionBarOperationArea();
            fileSelectorUI3.initActionBarOperationAreaTxt(fileSelectorUI3.getString(C0966R.string.cuv), C0966R.color.FG_0, C0966R.color.FG_0, C0966R.C0969drawable.f5022uf, C0966R.C0969drawable.f5021ue);
            FileSelectorUI fileSelectorUI4 = this.f283844d;
            fileSelectorUI4.addSearchMenu(true, fileSelectorUI4.f283709j);
            this.f283844d.f283719w = false;
            Log.m105924i("MicroMsg.ScreenProjectReportHelper", "markExitDuringProfileUI");
            C115669n.INSTANCE.mo175913w(1538, 2, 1);
            return false;
        }
        C87412m.m108603p("dropdownListView");
        throw null;
    }
}
