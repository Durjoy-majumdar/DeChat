package com.tencent.p014mm.plugin.finder.live.view.finderlivelogo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import kotlin.Metadata;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import te3.C51587ur2;
import up1.C27696y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/finderlivelogo/FinderLiveLogoItemView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoItemView */
public final class FinderLiveLogoItemView extends LinearLayout {

    /* renamed from: d */
    public final ImageView f15335d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FinderLiveLogoItemView(Context context, AttributeSet attributeSet, int i, C8480h hVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* renamed from: a */
    public final void mo3385a(C51587ur2 ur22) {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(ur22, "task");
        String str = ur22.f143043e;
        if (!(str == null || str.length() == 0)) {
            ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85957c(new C11984n0(ur22.f143043e, C27696y.THUMB_IMAGE), this.f15335d, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.DEFAULT));
            this.f15335d.setVisibility(0);
            return;
        }
        this.f15335d.setVisibility(8);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveLogoItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        View findViewById = View.inflate(context, C0966R.C0971layout.f359732ct3, this).findViewById(C0966R.C0970id.f2a);
        C87412m.m108593f(findViewById, "parent.findViewById(R.id.icon_iv)");
        this.f15335d = (ImageView) findViewById;
    }
}
