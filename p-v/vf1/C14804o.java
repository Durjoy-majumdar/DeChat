package vf1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderCreateAccountStarterActivity;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import er1.C58684b;
import j20.C117292a;
import java.util.ArrayList;
import zc1.C66785b;

/* renamed from: vf1.o */
public final class C14804o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderCreateAccountStarterActivity f40790d;

    /* renamed from: e */
    public final /* synthetic */ Context f40791e;

    /* renamed from: f */
    public final /* synthetic */ C4191v0 f40792f;

    public C14804o(FinderCreateAccountStarterActivity finderCreateAccountStarterActivity, Context context, C4191v0 v0Var) {
        this.f40790d = finderCreateAccountStarterActivity;
        this.f40791e = context;
        this.f40792f = v0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderCreateAccountStarterActivity$initDialog$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!Util.isNullOrNil(C66785b.f191882e.mo90662O5())) {
            FinderCreateAccountStarterActivity.m2730N7(this.f40790d, 4);
        } else if (this.f40791e instanceof Activity) {
            Intent intent = new Intent();
            intent.putExtra("key_create_scene", this.f40790d.f14264s);
            intent.putExtra("key_router_to_profile", false);
            ((C58684b) C86312j.m106911c(C58684b.class)).mo13297zc(this.f40791e, intent);
        }
        this.f40790d.f14266u = true;
        this.f40792f.mo5072g();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderCreateAccountStarterActivity$initDialog$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
