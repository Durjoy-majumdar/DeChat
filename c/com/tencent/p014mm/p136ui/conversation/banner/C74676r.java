package com.tencent.p014mm.p136ui.conversation.banner;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75590o4;
import eb0.C75598w3;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import uc3.C78146a;

/* renamed from: com.tencent.mm.ui.conversation.banner.r */
public class C74676r implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f219542d;

    /* renamed from: e */
    public final /* synthetic */ int f219543e;

    /* renamed from: f */
    public final /* synthetic */ C74665a0 f219544f;

    public C74676r(C74665a0 a0Var, int i, int i2) {
        this.f219544f = a0Var;
        this.f219542d = i;
        this.f219543e = i2;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/conversation/banner/MainFrameBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C75598w3.m90816e().mo105950b(this.f219542d, this.f219543e);
        Context context = this.f219544f.f230570g.get();
        if (context != null) {
            C115669n.INSTANCE.mo160131h(ErrorCode.ERROR_OUTOF_MEMORY, 5, 1);
            boolean nullAsFalse = Util.nullAsFalse((Boolean) C97625j3.m125812b().mo105906u().mo119684e(4103, (Object) null));
            new Intent().putExtra("KEnterFromBanner", true);
            if (!nullAsFalse) {
                C88144b.m109789g(context, "nearby", ".ui.NearbyFriendsIntroUI");
            } else {
                C75590o4 b = C75590o4.m90741b();
                if (b == null) {
                    C88144b.m109789g(context, "nearby", ".ui.NearbyPersonalInfoUI");
                } else {
                    String nullAsNil = Util.nullAsNil(b.mo105937d());
                    int nullAs = Util.nullAs(Integer.valueOf(b.f222065b), 0);
                    if (Util.isNullOrNil(nullAsNil) || nullAs == 0) {
                        C88144b.m109789g(context, "nearby", ".ui.NearbyPersonalInfoUI");
                    } else {
                        LauncherUI instance = LauncherUI.getInstance();
                        if (instance != null) {
                            instance.mo101375O7().mo101428l("tab_find_friend");
                        }
                        C78146a.m94352a(context, new Intent());
                    }
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/conversation/banner/MainFrameBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
