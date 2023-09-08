package com.tencent.p014mm.pluginsdk.p133ui.tools;

import com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import f40.C86709a0;
import nd3.C47223a;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.j */
public class C19565j implements C47223a {

    /* renamed from: a */
    public final /* synthetic */ AppChooserUI f55375a;

    public C19565j(AppChooserUI appChooserUI) {
        this.f55375a = appChooserUI;
    }

    /* renamed from: a */
    public void mo6947a(boolean z) {
        if (z) {
            this.f55375a.mo25301M7(AppChooserUI.C19511s.DOWNLOADED);
            AppChooserUI.C19507n nVar = this.f55375a.f55148e;
            if (nVar != null) {
                nVar.notifyDataSetChanged();
            }
            WxRecyclerAdapter<AppChooserUI.C19509p> wxRecyclerAdapter = this.f55375a.f55151h;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyDataSetChanged();
                return;
            }
            return;
        }
        C85801v1 i = C86709a0.m107535s().mo121142i();
        AppChooserUI appChooserUI = this.f55375a;
        i.mo119676J(AppChooserUI.m20897I7(274560, appChooserUI.f55128G, appChooserUI.f55161t), 0L);
        this.f55375a.mo25301M7(AppChooserUI.C19511s.UNINSTALL);
        AppChooserUI.C19507n nVar2 = this.f55375a.f55148e;
        if (nVar2 != null) {
            nVar2.notifyDataSetChanged();
        }
        WxRecyclerAdapter<AppChooserUI.C19509p> wxRecyclerAdapter2 = this.f55375a.f55151h;
        if (wxRecyclerAdapter2 != null) {
            wxRecyclerAdapter2.notifyDataSetChanged();
        }
    }
}
