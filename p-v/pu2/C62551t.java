package pu2;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import kg3.C76577a;
import lc3.C10485b;

/* renamed from: pu2.t */
public final class C62551t implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ SnsInfo f177653d;

    /* renamed from: e */
    public final /* synthetic */ C100954s f177654e;

    public C62551t(SnsInfo snsInfo, C100954s sVar) {
        this.f177653d = snsInfo;
        this.f177654e = sVar;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        SnsMethodCalculate.markStartTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick$popPermissionMenuWindow$1");
        C72996z1 H3 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69656H3(this.f177653d.getUserName());
        SnsMethodCalculate.markStartTimeMs("popMenuPermissionWordingSwitch", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        boolean z = true;
        boolean z2 = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("MMSocialBlackListFlag", 1) == 1;
        SnsMethodCalculate.markEndTimeMs("popMenuPermissionWordingSwitch", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        if (H3 == null || !C72996z1.m85843n5(this.f177653d.getUserName()) || !C87412m.m108589b("3552365301", H3.mo73980x2())) {
            contextMenu.add(0, 0, 0, z2 ? C76577a.m92166q(this.f177654e.getContext(), C0966R.string.bos) : C76577a.m92166q(this.f177654e.getContext(), C0966R.string.bot));
        } else {
            contextMenu.add(0, 0, 0, z2 ? C76577a.m92166q(this.f177654e.getContext(), C0966R.string.bos) : C76577a.m92166q(this.f177654e.getContext(), C0966R.string.bou));
        }
        contextMenu.add(1, 1, 0, this.f177654e.getContext().getString(C0966R.string.jip));
        if (!BuildInfo.DEBUG) {
            if (!(BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED || BuildInfo.CLIENT_VERSION_INT == 788529167) && !WeChatEnvironment.hasDebugger()) {
                z = false;
            }
        }
        if (z) {
            contextMenu.add(2, 2, 0, this.f177654e.getContext().getString(C0966R.string.n5r));
        }
        SnsMethodCalculate.markEndTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick$popPermissionMenuWindow$1");
    }
}
