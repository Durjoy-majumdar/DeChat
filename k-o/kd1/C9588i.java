package kd1;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import di3.C86312j;
import er1.C58684b;
import j20.C117292a;
import java.util.ArrayList;
import rs1.C13442s8;

/* renamed from: kd1.i */
public final class C9588i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Activity f29827d;

    /* renamed from: e */
    public final /* synthetic */ C4191v0 f29828e;

    public C9588i(Activity activity, C4191v0 v0Var) {
        this.f29827d = activity;
        this.f29828e = v0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/activity/FinderActivityUtils$showAccountBottomSheet$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(this.f29827d);
        if (castActivityOrNull != null) {
            Intent intent = new Intent();
            C13442s8.C13443a.m12791e(C13442s8.f38060Q0, castActivityOrNull, intent, 0, (String) null, 0, 0, false, 0, 128, (Object) null);
            intent.putExtra("key_create_scene", 11);
            ((C58684b) C86312j.m106911c(C58684b.class)).b30(castActivityOrNull, intent, 20000);
        }
        this.f29828e.mo5072g();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/activity/FinderActivityUtils$showAccountBottomSheet$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
