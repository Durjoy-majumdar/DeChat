package com.tencent.p014mm.plugin.component.editor.adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.C93083b;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: com.tencent.mm.plugin.component.editor.adapter.EditorLinearLayoutManager */
public class EditorLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: v */
    public final int f268101v = KeyBoardUtil.getKeyBordHeightPx(MMApplicationContext.getContext(), true);

    /* renamed from: w */
    public int f268102w = -1;

    /* renamed from: x */
    public boolean f268103x = false;

    public EditorLinearLayoutManager(Context context) {
        super(context);
    }

    /* renamed from: M */
    public int mo16966M(RecyclerView.C16628w wVar) {
        int i = this.f268102w;
        if (i > 0) {
            return i;
        }
        return 900;
    }

    public void onLayoutChildren(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        try {
            super.onLayoutChildren(rVar, wVar);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.CollectEditorLinearLayoutManager", e, "", new Object[0]);
        }
    }

    public int scrollVerticallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        if (!this.f268103x) {
            return super.scrollVerticallyBy(i, rVar, wVar);
        }
        boolean z = true;
        boolean z2 = i < 0 && TypedValue.applyDimension(1, 49.0f, C93083b.f268164g) <= ((float) Math.abs(i));
        if (i > 0) {
            if (((float) this.f268101v) + TypedValue.applyDimension(1, 49.0f, C93083b.f268164g) >= ((float) i)) {
                z = false;
            }
            z2 = z;
        }
        if (z2 && this.f268103x) {
            return 0;
        }
        try {
            return super.scrollVerticallyBy(i, rVar, wVar);
        } catch (Exception unused) {
            return 0;
        }
    }

    public EditorLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
