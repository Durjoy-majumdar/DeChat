package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75875l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kb0.C88132b;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.v3 */
public final class C84699v3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandVideoPreviewUI f247082d;

    public C84699v3(AppBrandVideoPreviewUI appBrandVideoPreviewUI) {
        this.f247082d = appBrandVideoPreviewUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/AppBrandVideoPreviewUI$initVideoView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        String str = this.f247082d.f49812d;
        Log.m105924i(str, "hy: request start to appid " + this.f247082d.f49821p);
        C75875l LE = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE();
        Long l = this.f247082d.f49822q;
        C87412m.m108591d(l);
        C72963f4 b002 = ((C72972g4) LE).b00(l.longValue());
        Bundle bundle = new Bundle();
        bundle.putInt("stat_scene", 11);
        bundle.putString("stat_msg_id", "msg_" + Long.toString(b002.mo108774y2()));
        bundle.putString("stat_chat_talker_username", this.f247082d.f49823r);
        bundle.putString("stat_send_msg_user", this.f247082d.f49824s);
        String str2 = this.f247082d.f49823r;
        C87412m.m108591d(str2);
        String str3 = this.f247082d.f49824s;
        C87412m.m108591d(str3);
        C88132b.m109734e(str2, str3, 1136, (String) null, C68070l.C68072b.m80422u(b002.getContent(), (String) null), bundle);
        this.f247082d.mo22496H7(5);
        this.f247082d.finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandVideoPreviewUI$initVideoView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
