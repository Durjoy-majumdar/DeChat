package com.tencent.p014mm.plugin.game.widget;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.game.widget.GameGridLayoutManager */
public class GameGridLayoutManager extends GridLayoutManager {
    public GameGridLayoutManager(Context context, int i) {
        super(context, i);
    }

    public void onLayoutChildren(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        try {
            super.onLayoutChildren(rVar, wVar);
        } catch (IndexOutOfBoundsException unused) {
            Log.m105920e("MicroMsg.GameGridLayoutManager", "meet a IOOBE in RecyclerView");
        }
    }

    public GameGridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i, i2, z);
    }
}
