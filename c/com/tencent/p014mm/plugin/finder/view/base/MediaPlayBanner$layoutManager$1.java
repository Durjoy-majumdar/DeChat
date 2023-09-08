package com.tencent.p014mm.plugin.finder.view.base;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/view/base/MediaPlayBanner$layoutManager$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.base.MediaPlayBanner$layoutManager$1 */
public final class MediaPlayBanner$layoutManager$1 extends LinearLayoutManager {

    /* renamed from: v */
    public final /* synthetic */ MediaPlayBanner f52586v;

    /* renamed from: com.tencent.mm.plugin.finder.view.base.MediaPlayBanner$layoutManager$1$a */
    public static final class C18788a extends C54256s {

        /* renamed from: n */
        public final /* synthetic */ MediaPlayBanner f52587n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18788a(MediaPlayBanner mediaPlayBanner, Context context) {
            super(context);
            this.f52587n = mediaPlayBanner;
        }

        /* renamed from: k */
        public float mo3227k(DisplayMetrics displayMetrics) {
            C87412m.m108594g(displayMetrics, "displayMetrics");
            return this.f52587n.getSmoothScrollerSpeed() / ((float) displayMetrics.densityDpi);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaPlayBanner$layoutManager$1(MediaPlayBanner mediaPlayBanner, Context context) {
        super(context);
        this.f52586v = mediaPlayBanner;
    }

    /* renamed from: M */
    public int mo16966M(RecyclerView.C16628w wVar) {
        return 1;
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C16628w wVar, int i) {
        C18788a aVar = new C18788a(this.f52586v, this.f52586v.getContext());
        aVar.f44872a = i;
        startSmoothScroll(aVar);
    }
}
