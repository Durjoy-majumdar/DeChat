package com.tencent.p014mm.plugin.finder.video;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.modelvideo.MMVideoView;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.xweb.IXWebBroadcastListener;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/video/FinderVideoViewForTopic;", "Lcom/tencent/mm/plugin/finder/video/FinderVideoView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.video.FinderVideoViewForTopic */
public final class FinderVideoViewForTopic extends FinderVideoView {

    /* renamed from: w1 */
    public int f161939w1 = 3;

    public FinderVideoViewForTopic(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: Y */
    public boolean mo79611Y(int i, PInt pInt, PInt pInt2) {
        C87412m.m108594g(pInt, IXWebBroadcastListener.STAGE_START);
        C87412m.m108594g(pInt2, "end");
        pInt.value = Math.max(i, this.f267495W0);
        int i2 = this.f267486Q0;
        if (i2 == 1) {
            pInt.value = i;
            pInt2.value = this.f161939w1 + i + 1;
        }
        int i3 = this.f161939w1;
        MMVideoView.C55393b bVar = this.f267500b1;
        this.f161939w1 = i3 + bVar.f157764a;
        if (i2 == 2) {
            int i4 = i - 8;
            pInt.value = i4;
            if (i4 < 0) {
                pInt.value = 0;
            }
            pInt2.value = pInt.value + this.f267496X0 + 8;
        }
        if (i2 == 3 || i2 == 4) {
            pInt.value = this.f267495W0;
            int i5 = bVar.f157765b;
            pInt2.value = this.f267488S0 + 1;
        }
        int i6 = pInt2.value;
        int i7 = this.f267488S0;
        if (i6 >= i7 + 1) {
            pInt2.value = i7 + 1;
        }
        int i8 = pInt2.value;
        int i9 = pInt.value;
        if (i8 < i9) {
            pInt2.value = i9 + bVar.f157765b;
            start();
        }
        return true;
    }
}
