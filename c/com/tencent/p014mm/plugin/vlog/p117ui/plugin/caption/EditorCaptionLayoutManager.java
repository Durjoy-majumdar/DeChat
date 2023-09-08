package com.tencent.p014mm.plugin.vlog.p117ui.plugin.caption;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/plugin/caption/EditorCaptionLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "a", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.plugin.caption.EditorCaptionLayoutManager */
public final class EditorCaptionLayoutManager extends LinearLayoutManager {

    /* renamed from: com.tencent.mm.plugin.vlog.ui.plugin.caption.EditorCaptionLayoutManager$a */
    public final class C5691a extends C54256s {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5691a(EditorCaptionLayoutManager editorCaptionLayoutManager, Context context) {
            super(context);
            C87412m.m108594g(context, "context");
        }

        /* renamed from: h */
        public int mo6715h(int i, int i2, int i3, int i4, int i5) {
            return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
        }

        /* renamed from: k */
        public float mo3227k(DisplayMetrics displayMetrics) {
            C87412m.m108594g(displayMetrics, "displayMetrics");
            return 200.0f / ((float) displayMetrics.densityDpi);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditorCaptionLayoutManager(Context context, int i) {
        super(context, i, false);
        C87412m.m108594g(context, "context");
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C16628w wVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        Context context = recyclerView.getContext();
        C87412m.m108593f(context, "recyclerView.context");
        C5691a aVar = new C5691a(this, context);
        aVar.f44872a = i;
        startSmoothScroll(aVar);
    }
}
