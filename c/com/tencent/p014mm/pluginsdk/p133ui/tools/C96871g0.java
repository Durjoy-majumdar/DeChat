package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.C106690i4;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.multitalk.model.MultiTalkManager;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import zt3.C119157j;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.g0 */
public final class C96871g0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ FileSelectorUI f283846d;

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.g0$a */
    public static final class C96872a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FileSelectorUI f283847d;

        public C96872a(FileSelectorUI fileSelectorUI) {
            this.f283847d = fileSelectorUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            Log.m105924i("MicroMsg.FileSelectorUI", "backBtn");
            FileSelectorUI fileSelectorUI = this.f283847d;
            FileSelectorUI.C72909b bVar = FileSelectorUI.f283702y;
            fileSelectorUI.mo135137M7(true);
            return false;
        }
    }

    public C96871g0(FileSelectorUI fileSelectorUI) {
        this.f283846d = fileSelectorUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        Log.m105924i("MicroMsg.FileSelectorUI", "backBtn");
        MultiTalkManager zx02 = C105851w0.zx0();
        zx02.getClass();
        ((C119157j) C119157j.f356862d).mo183894y("delayChecking");
        zx02.f314513y0 = null;
        zx02.f314475Q0.postValue(null);
        C106690i4 i4Var = this.f283846d.f283718v;
        if (i4Var != null) {
            i4Var.mo153639c();
        }
        C106690i4 i4Var2 = this.f283846d.f283718v;
        if (i4Var2 != null) {
            i4Var2.removeAllViews();
        }
        View contentView = this.f283846d.getContentView();
        C87412m.m108592e(contentView, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) contentView).removeView(this.f283846d.f283718v);
        FileSelectorUI fileSelectorUI = this.f283846d;
        fileSelectorUI.setBackBtn(new C96872a(fileSelectorUI), C0966R.raw.actionbar_quit_webview_icon);
        DropdownListView dropdownListView = this.f283846d.f283713q;
        if (dropdownListView != null) {
            dropdownListView.setVisibility(0);
            FileSelectorUI fileSelectorUI2 = this.f283846d;
            fileSelectorUI2.getClass();
            fileSelectorUI2.setActionBarOperationAreaClickListener(new C96873h0(fileSelectorUI2));
            this.f283846d.mo135138N7();
            this.f283846d.setRequestedOrientation(1);
            FileSelectorUI fileSelectorUI3 = this.f283846d;
            fileSelectorUI3.addSearchMenu(true, fileSelectorUI3.f283709j);
            this.f283846d.f283719w = false;
            Log.m105924i("MicroMsg.ScreenProjectReportHelper", "markExitDuringProfileUI");
            C115669n.INSTANCE.mo175913w(1538, 2, 1);
            return false;
        }
        C87412m.m108603p("dropdownListView");
        throw null;
    }
}
