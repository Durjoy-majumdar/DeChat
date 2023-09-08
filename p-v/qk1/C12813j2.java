package qk1;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import te3.C49098d51;
import tf0.C13883o1;
import zc1.C66785b;

/* renamed from: qk1.j2 */
public final class C12813j2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C49098d51 f36673d;

    /* renamed from: e */
    public final /* synthetic */ Context f36674e;

    public C12813j2(C49098d51 d512, Context context) {
        this.f36673d = d512;
        this.f36674e = context;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveNoticeAdapter$onBindViewHolder$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_CONTACT", C66785b.f191882e.mo90662O5());
        intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_INFO", this.f36673d.toByteArray());
        Context context = this.f36674e;
        C87412m.m108593f(context, "context");
        ((C13883o1) C86312j.m106911c(C13883o1.class)).mo13288tj(context, intent, 1013);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveNoticeAdapter$onBindViewHolder$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
