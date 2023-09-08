package com.tencent.p014mm.plugin.finder.live.view.finderlivelogo;

import a14.C0000n0;
import a14.C53930o0;
import a14.C53973z1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import te3.C51587ur2;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\n"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/finderlivelogo/FinderLiveLogoGroupView;", "Landroid/widget/RelativeLayout;", "Lte3/ur2;", "getShowingTask", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoGroupView */
public final class FinderLiveLogoGroupView extends RelativeLayout {

    /* renamed from: d */
    public final C0000n0 f111678d = C53930o0.m60555b();

    /* renamed from: e */
    public C53973z1 f111679e;

    /* renamed from: f */
    public final RelativeLayout f111680f;

    /* renamed from: g */
    public final List<C51587ur2> f111681g;

    /* renamed from: h */
    public C51587ur2 f111682h;

    /* renamed from: i */
    public FinderLiveLogoItemView f111683i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveLogoGroupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        View findViewById = View.inflate(context, C0966R.C0971layout.f359731ct2, this).findViewById(C0966R.C0970id.kfx);
        C87412m.m108593f(findViewById, "parent.findViewById(R.id.task_progress_bucket)");
        this.f111680f = (RelativeLayout) findViewById;
        this.f111681g = new ArrayList();
    }

    public final C51587ur2 getShowingTask() {
        return this.f111682h;
    }
}
