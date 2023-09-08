package oo1;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import eb0.C31543z5;
import er1.C58684b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kd1.C9584f;
import p823sg.C101614i;
import rs1.C13442s8;
import te3.C52271zj0;

/* renamed from: oo1.b */
public final class C11601b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f34006d;

    /* renamed from: e */
    public final /* synthetic */ C11587a f34007e;

    public C11601b(String str, C11587a aVar) {
        this.f34006d = str;
        this.f34007e = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/profile/widget/HeaderActivityWidget$initActivity$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C101614i<String, FinderProfileHeaderUIC.C3463b> iVar = FinderProfileHeaderUIC.f16192h1;
        FinderProfileHeaderUIC.C3463b bVar = (FinderProfileHeaderUIC.C3463b) FinderProfileHeaderUIC.f16192h1.get(this.f34006d);
        C52271zj0 zj02 = bVar != null ? bVar.f16268g : null;
        if (zj02 != null) {
            C11587a aVar = this.f34007e;
            Intent intent = new Intent();
            intent.putExtra("key_activity_id", zj02.f146005d);
            intent.putExtra("key_activity_name", zj02.f146007f);
            Log.m105924i("Finder.FinderProfileHeaderUIC", "eventTopicId :" + zj02.f146005d + " eventName:" + zj02.f146007f);
            C13442s8.C13443a.m12791e(C13442s8.f38060Q0, aVar.f33980a, intent, 0, (String) null, 0, 0, false, 0, 128, (Object) null);
            intent.putExtra("key_activity_profile_src_type", "2");
            C9584f.f29822a.mo10262a(intent, C31543z5.m39453c(), 2);
            C7335d c = C86312j.m106911c(C58684b.class);
            C87412m.m108593f(c, "getService(ActivityRouter::class.java)");
            ((C58684b) c).vx0(aVar.f33980a, intent, false);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/widget/HeaderActivityWidget$initActivity$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
