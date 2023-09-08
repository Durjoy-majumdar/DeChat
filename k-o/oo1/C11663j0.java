package oo1;

import android.content.Intent;
import android.view.View;
import com.tencent.mars.cdn.CdnLogic;
import di3.C86312j;
import er1.C58684b;
import j20.C117292a;
import java.util.ArrayList;
import oo1.C11614d0;

/* renamed from: oo1.j0 */
public final class C11663j0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C11614d0.C11619d f34181d;

    /* renamed from: e */
    public final /* synthetic */ C11614d0.C11618c f34182e;

    public C11663j0(C11614d0.C11619d dVar, C11614d0.C11618c cVar) {
        this.f34181d = dVar;
        this.f34182e = cVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/profile/widget/MoreLiveListWidget$RecyclerAdapter$onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_CONTACT", this.f34181d.f34067d);
        intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_INFO", this.f34182e.f34065a.toByteArray());
        ((C58684b) C86312j.m106911c(C58684b.class)).mo13288tj(this.f34181d.f34069f, intent, CdnLogic.kMediaTypeBeatificFile);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/widget/MoreLiveListWidget$RecyclerAdapter$onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
