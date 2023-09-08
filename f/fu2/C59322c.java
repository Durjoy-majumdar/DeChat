package fu2;

import android.content.Context;
import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import gu2.C98214b;
import gy3.C87412m;
import kg3.C76577a;
import lc3.C10485b;

/* renamed from: fu2.c */
public final class C59322c implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ C97998d f169623d;

    /* renamed from: e */
    public final /* synthetic */ Context f169624e;

    public C59322c(C97998d dVar, Context context) {
        this.f169623d = dVar;
        this.f169624e = context;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        SnsMethodCalculate.markStartTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick$menuCreator$2$1");
        C98214b c = this.f169623d.mo137310c();
        String userName = c != null ? c.getUserName() : null;
        if (userName == null) {
            SnsMethodCalculate.markEndTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick$menuCreator$2$1");
            return;
        }
        C72996z1 H3 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69656H3(userName);
        SnsMethodCalculate.markStartTimeMs("popMenuPermissionWordingSwitch", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        boolean z = true;
        boolean z2 = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("MMSocialBlackListFlag", 1) == 1;
        SnsMethodCalculate.markEndTimeMs("popMenuPermissionWordingSwitch", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        if (H3 == null || !C72996z1.m85843n5(userName) || !C87412m.m108589b("3552365301", H3.mo73980x2())) {
            contextMenu.add(0, 0, 0, z2 ? C76577a.m92166q(this.f169624e, C0966R.string.bos) : C76577a.m92166q(this.f169624e, C0966R.string.bot));
        } else {
            contextMenu.add(0, 0, 0, z2 ? C76577a.m92166q(this.f169624e, C0966R.string.bos) : C76577a.m92166q(this.f169624e, C0966R.string.bou));
        }
        contextMenu.add(1, 1, 0, this.f169624e.getString(C0966R.string.jip));
        if (!BuildInfo.DEBUG) {
            if (!(BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED || BuildInfo.CLIENT_VERSION_INT == 788529167) && !WeChatEnvironment.hasDebugger()) {
                z = false;
            }
        }
        if (z) {
            contextMenu.add(2, 2, 0, this.f169624e.getString(C0966R.string.n5r));
        }
        SnsMethodCalculate.markEndTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick$menuCreator$2$1");
    }
}
