package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import c30.C104289g;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.p056ui.FinderActivityPostUI;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import dp1.C7458x0;
import er1.C58684b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import zc1.C66785b;

/* renamed from: com.tencent.mm.plugin.finder.view.u1 */
public final class C4184u1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderExtendActivityView f18441d;

    /* renamed from: e */
    public final /* synthetic */ C4191v0 f18442e;

    public C4184u1(FinderExtendActivityView finderExtendActivityView, C4191v0 v0Var) {
        this.f18441d = finderExtendActivityView;
        this.f18442e = v0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderExtendActivityView$showPostActivitySheet$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f18441d.f17685z) {
            C7458x0.f25666a.mo8608a(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN, C66785b.f191882e.mo90662O5(), new C104289g().put("vst_id", this.f18441d.getVstId()));
            FinderExtendActivityView finderExtendActivityView = this.f18441d;
            finderExtendActivityView.getClass();
            Intent intent = new Intent();
            finderExtendActivityView.setIntentParam(intent);
            Context context = finderExtendActivityView.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            MMActivity mMActivity = (MMActivity) context;
            ((C58684b) C86312j.m106911c(C58684b.class)).getClass();
            intent.setClass(mMActivity, FinderActivityPostUI.class);
            mMActivity.startActivityForResult(intent, 20002);
            this.f18442e.mo5072g();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderExtendActivityView$showPostActivitySheet$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
