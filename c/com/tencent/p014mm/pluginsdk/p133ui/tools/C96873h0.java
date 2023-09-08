package com.tencent.p014mm.pluginsdk.p133ui.tools;

import com.tencent.p014mm.p136ui.widget.AlbumChooserView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.h0 */
public final class C96873h0 implements AlbumChooserView.C116178b {

    /* renamed from: a */
    public final /* synthetic */ FileSelectorUI f283848a;

    public C96873h0(FileSelectorUI fileSelectorUI) {
        this.f283848a = fileSelectorUI;
    }

    /* renamed from: a */
    public final void mo135191a() {
        Log.m105924i("MicroMsg.FileSelectorUI", "onAlbumChooserViewClick.");
        FileSelectorUI fileSelectorUI = this.f283848a;
        fileSelectorUI.f283714r = null;
        fileSelectorUI.playActionBarOperationAreaAnim();
        DropdownListView dropdownListView = this.f283848a.f283713q;
        if (dropdownListView != null) {
            dropdownListView.mo100758b();
        } else {
            C87412m.m108603p("dropdownListView");
            throw null;
        }
    }
}
