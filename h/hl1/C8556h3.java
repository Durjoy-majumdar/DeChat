package hl1;

import al1.C54130j;
import android.app.Activity;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import cj1.C54795n5;
import cl1.C54963d0;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import vk1.C65762c;

/* renamed from: hl1.h3 */
public final class C8556h3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C59988k f27634d;

    /* renamed from: e */
    public final /* synthetic */ Integer f27635e;

    public C8556h3(C59988k kVar, Integer num) {
        this.f27634d = kVar;
        this.f27635e = num;
    }

    public final void onClick(View view) {
        T t;
        C65762c cVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC$onStatusChanged$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        List<C54130j> list = ((C54963d0) this.f27634d.mo83051g(C54963d0.class)).f154074q;
        C87412m.m108593f(list, "business(LiveLinkMicSlic…).audienceLinkMicUserList");
        C59988k kVar = this.f27634d;
        synchronized (list) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (Util.isEqual(((C54130j) t).f151997a, ((C54991o) kVar.mo83051g(C54991o.class)).mo76015n4())) {
                    break;
                }
            }
        }
        boolean z = t != null;
        if (z) {
            C59988k kVar2 = this.f27634d;
            AppCompatActivity appCompatActivity = kVar2.f166847e;
            if ((appCompatActivity instanceof Activity) && (cVar = kVar2.f166848f) != null) {
                C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type android.app.Activity");
                C56032b.showAlertDialog$default(cVar, appCompatActivity, "", this.f27634d.f166847e.getResources().getString(C0966R.string.e_w), "", false, 16, (Object) null);
            }
        } else {
            C54795n5 k = this.f27634d.mo83048k();
            if (k != null) {
                AppCompatActivity appCompatActivity2 = this.f27634d.f166847e;
                C87412m.m108592e(appCompatActivity2, "null cannot be cast to non-null type android.app.Activity");
                k.mo75713Q(appCompatActivity2, false);
            }
        }
        String str = this.f27634d.f171222i;
        Log.m105924i(str, "scene:" + this.f27635e + ", click ok linking:" + z);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC$onStatusChanged$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
