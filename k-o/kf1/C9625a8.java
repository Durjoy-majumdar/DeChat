package kf1;

import android.app.Activity;
import android.content.DialogInterface;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.service.C3604o1;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import di3.C86312j;
import er1.C7794e2;
import gy3.C87412m;

/* renamed from: kf1.a8 */
public final class C9625a8 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Activity f29943d;

    /* renamed from: e */
    public final /* synthetic */ BaseFinderFeed f29944e;

    public C9625a8(Activity activity, BaseFinderFeed baseFinderFeed) {
        this.f29943d = activity;
        this.f29944e = baseFinderFeed;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Activity activity = this.f29943d;
        FinderItem o = this.f29944e.mo3513o();
        C87412m.m108594g(activity, "context");
        C87412m.m108594g(o, "feed");
        ((C3604o1) C86312j.m106911c(C3604o1.class)).Z70(o.getId(), o.getFeedObject(), o.getObjectNonceId(), true, C7794e2.f26302a);
    }
}
