package com.tencent.p014mm.view.recyclerview;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/view/recyclerview/WxGridLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.view.recyclerview.WxGridLayoutManager */
public class WxGridLayoutManager extends GridLayoutManager {
    public WxGridLayoutManager(Context context, int i) {
        super(context, i);
    }

    public void onLayoutChildren(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        try {
            super.onLayoutChildren(rVar, wVar);
        } catch (IndexOutOfBoundsException unused) {
            Log.m105920e("MicroMsg.WxGridLayoutManager", "meet a IOOBE in RecyclerView");
        }
    }
}
