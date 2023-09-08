package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import c02.C92331c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.handoff.model.AbsHandOffFile;
import com.tencent.p014mm.plugin.handoff.model.HandOffFile;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C19569p0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.QBFileMenuBottomSheetHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import gy3.C87412m;
import java.util.Arrays;
import nj3.C11182m0;
import nj3.C76874e0;
import p262wm.C22921c;
import qo3.C77407n;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.h1 */
public final class C19562h1 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ QBFileMenuBottomSheetHelper f55372d;

    public C19562h1(QBFileMenuBottomSheetHelper qBFileMenuBottomSheetHelper, C77407n nVar) {
        this.f55372d = qBFileMenuBottomSheetHelper;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        boolean z;
        QBFileMenuBottomSheetHelper qBFileMenuBottomSheetHelper = this.f55372d;
        C87412m.m108593f(e0Var, "menu");
        qBFileMenuBottomSheetHelper.getClass();
        QBFileMenuBottomSheetHelper.C19539b[] bVarArr = QBFileMenuBottomSheetHelper.C19539b.f55293e;
        e0Var.mo107146h(0, qBFileMenuBottomSheetHelper.f55282a.getString(C0966R.string.mti), C0966R.raw.icons_filled_share, qBFileMenuBottomSheetHelper.f55282a.getResources().getColor(C0966R.color.f2939n));
        if (qBFileMenuBottomSheetHelper.f55285d != null) {
            e0Var.mo107146h(1, qBFileMenuBottomSheetHelper.f55282a.getString(C0966R.string.mtb), C0966R.raw.bottomsheet_icon_fav, 0);
        }
        if (((C92331c) C86312j.m106911c(C92331c.class)).mo58357LH()) {
            C19569p0.C19570a aVar = qBFileMenuBottomSheetHelper.f55283b;
            if (aVar.f55379b != null) {
                HandOffFile.C94143b bVar = HandOffFile.Companion;
                String str = aVar.f55380c;
                bVar.getClass();
                if (AbsHandOffFile.Companion.mo23889a(str)) {
                    e0Var.mo107146h(2, qBFileMenuBottomSheetHelper.f55282a.getString(C0966R.string.cvp), C0966R.raw.icons_outlined_colorful_handoff, 0);
                }
            }
        }
        if (qBFileMenuBottomSheetHelper.f55283b.f55385h) {
            e0Var.mo107146h(3, qBFileMenuBottomSheetHelper.f55282a.getString(C0966R.string.dqu), C0966R.raw.icons_filled_colorful_other_device, 0);
        }
        String str2 = ((IPCString) C80907o.m98783f(WeChatProcess.PROCESS_MAIN, new IPCString(qBFileMenuBottomSheetHelper.f55283b.f55384g), QBFileMenuBottomSheetHelper.C19541a.class)).f10315d;
        C87412m.m108593f(str2, "invokeSync(\n            …lass.java\n        ).value");
        qBFileMenuBottomSheetHelper.f55290i = str2;
        if (!(str2.length() == 0)) {
            try {
                ApplicationInfo applicationInfo = qBFileMenuBottomSheetHelper.f55282a.getPackageManager().getApplicationInfo(qBFileMenuBottomSheetHelper.f55290i, 0);
                qBFileMenuBottomSheetHelper.f55291j = applicationInfo.loadIcon(qBFileMenuBottomSheetHelper.f55282a.getPackageManager());
                qBFileMenuBottomSheetHelper.f55292k = applicationInfo.loadLabel(qBFileMenuBottomSheetHelper.f55282a.getPackageManager()).toString();
                z = true;
            } catch (PackageManager.NameNotFoundException e) {
                Log.m105920e("MicroMsg.QBMenuBottomSheetHelper", "load default icon error!! defaultPkgName:" + qBFileMenuBottomSheetHelper.f55290i);
                Log.printErrStackTrace("MicroMsg.QBMenuBottomSheetHelper", e, "", new Object[0]);
                ((C22921c) C86312j.m106911c(C22921c.class)).mo35891mQ(qBFileMenuBottomSheetHelper.f55283b.f55384g, 0);
            }
            if (!(!z || qBFileMenuBottomSheetHelper.f55291j == null || qBFileMenuBottomSheetHelper.f55292k == null)) {
                QBFileMenuBottomSheetHelper.C19539b[] bVarArr2 = QBFileMenuBottomSheetHelper.C19539b.f55293e;
                String string = qBFileMenuBottomSheetHelper.f55282a.getString(C0966R.string.mqe);
                C87412m.m108593f(string, "context.getString(com.te…download_open_by_default)");
                String format = String.format(string, Arrays.copyOf(new Object[]{qBFileMenuBottomSheetHelper.f55292k}, 1));
                C87412m.m108593f(format, "format(format, *args)");
                e0Var.mo107153m(4, format, qBFileMenuBottomSheetHelper.f55291j, 0);
            }
            QBFileMenuBottomSheetHelper.C19539b[] bVarArr3 = QBFileMenuBottomSheetHelper.C19539b.f55293e;
            e0Var.mo107146h(5, qBFileMenuBottomSheetHelper.f55282a.getString(C0966R.string.mtf), C0966R.raw.icons_filled_otherapp, qBFileMenuBottomSheetHelper.f55282a.getResources().getColor(C0966R.color.f2933h));
            this.f55372d.getClass();
        }
        z = false;
        QBFileMenuBottomSheetHelper.C19539b[] bVarArr22 = QBFileMenuBottomSheetHelper.C19539b.f55293e;
        String string2 = qBFileMenuBottomSheetHelper.f55282a.getString(C0966R.string.mqe);
        C87412m.m108593f(string2, "context.getString(com.te…download_open_by_default)");
        String format2 = String.format(string2, Arrays.copyOf(new Object[]{qBFileMenuBottomSheetHelper.f55292k}, 1));
        C87412m.m108593f(format2, "format(format, *args)");
        e0Var.mo107153m(4, format2, qBFileMenuBottomSheetHelper.f55291j, 0);
        QBFileMenuBottomSheetHelper.C19539b[] bVarArr32 = QBFileMenuBottomSheetHelper.C19539b.f55293e;
        e0Var.mo107146h(5, qBFileMenuBottomSheetHelper.f55282a.getString(C0966R.string.mtf), C0966R.raw.icons_filled_otherapp, qBFileMenuBottomSheetHelper.f55282a.getResources().getColor(C0966R.color.f2933h));
        this.f55372d.getClass();
    }
}
