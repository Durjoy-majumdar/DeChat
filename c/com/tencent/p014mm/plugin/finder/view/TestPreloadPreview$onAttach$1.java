package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/view/TestPreloadPreview$onAttach$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.TestPreloadPreview$onAttach$1 */
public final class TestPreloadPreview$onAttach$1 extends LinearLayoutManager {
    public TestPreloadPreview$onAttach$1(Context context) {
        super(context);
    }

    public void onLayoutChildren(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        try {
            super.onLayoutChildren(rVar, wVar);
        } catch (Throwable th) {
            Log.m105921e("TestPreloadView", "onLayoutChildren:", th);
        }
    }

    public int scrollVerticallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        try {
            return super.scrollVerticallyBy(i, rVar, wVar);
        } catch (Throwable th) {
            Log.m105921e("TestPreloadView", "scrollVerticallyBy:", th);
            return 0;
        }
    }
}
