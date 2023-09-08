package com.tencent.p014mm.plugin.finder.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderRetransmitSourceUI;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import di3.C86312j;
import er1.C58684b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import te3.C51538uf1;

/* renamed from: com.tencent.mm.plugin.finder.view.k0 */
public final class C4083k0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderBaseMediaBanner<View> f18213d;

    public C4083k0(FinderBaseMediaBanner<View> finderBaseMediaBanner) {
        this.f18213d = finderBaseMediaBanner;
    }

    public final void onClick(View view) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderBaseMediaBanner$refreshRefUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        C51538uf1 refFeedInfo = this.f18213d.getRefFeedInfo();
        C87412m.m108591d(refFeedInfo);
        intent.putExtra("KEY_REF_OBJ_ID", refFeedInfo.f142829e);
        C51538uf1 refFeedInfo2 = this.f18213d.getRefFeedInfo();
        C87412m.m108591d(refFeedInfo2);
        intent.putExtra("KEY_REF_OBJ_NONCE_ID", refFeedInfo2.f142831g);
        C51538uf1 refFeedInfo3 = this.f18213d.getRefFeedInfo();
        C87412m.m108591d(refFeedInfo3);
        FinderContact finderContact = refFeedInfo3.f142830f;
        String str3 = "";
        if (finderContact == null || (str = finderContact.username) == null) {
            str = str3;
        }
        intent.putExtra("KEY_TARGET_USERNAME", str);
        C51538uf1 refFeedInfo4 = this.f18213d.getRefFeedInfo();
        C87412m.m108591d(refFeedInfo4);
        FinderContact finderContact2 = refFeedInfo4.f142830f;
        if (!(finderContact2 == null || (str2 = finderContact2.nickname) == null)) {
            str3 = str2;
        }
        intent.putExtra("KEY_TARGET_NICKNAME", str3);
        Context context = this.f18213d.getContext();
        C87412m.m108593f(context, "context");
        ((C58684b) C86312j.m106911c(C58684b.class)).getClass();
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, FinderRetransmitSourceUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderRetransmitSourceUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderRetransmitSourceUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderBaseMediaBanner$refreshRefUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
