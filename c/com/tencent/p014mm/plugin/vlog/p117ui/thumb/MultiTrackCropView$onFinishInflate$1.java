package com.tencent.p014mm.plugin.vlog.p117ui.thumb;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/vlog/ui/thumb/MultiTrackCropView$onFinishInflate$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView$onFinishInflate$1 */
public final class MultiTrackCropView$onFinishInflate$1 extends LinearLayoutManager {

    /* renamed from: v */
    public final /* synthetic */ MultiTrackCropView f316918v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiTrackCropView$onFinishInflate$1(MultiTrackCropView multiTrackCropView, Context context) {
        super(context, 0, false);
        this.f316918v = multiTrackCropView;
    }

    public int scrollHorizontallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        MultiTrackCropView multiTrackCropView = this.f316918v;
        int i2 = multiTrackCropView.f316898p;
        int i3 = i2 + i;
        if (multiTrackCropView.f316905w) {
            return super.scrollHorizontallyBy(i, rVar, wVar);
        }
        int i4 = multiTrackCropView.f316895j;
        int i5 = multiTrackCropView.f316894i + i4;
        if (i3 < i4) {
            i = i4 - i2;
        } else if (i3 > i5) {
            i = i5 - i2;
        }
        return super.scrollHorizontallyBy(i, rVar, wVar);
    }
}
