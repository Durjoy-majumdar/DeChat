package com.tencent.p014mm.plugin.multitask.p079ui.minusscreen;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/multitask/ui/minusscreen/MinusScreenGridLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "ui-multitask_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.multitask.ui.minusscreen.MinusScreenGridLayoutManager */
public class MinusScreenGridLayoutManager extends GridLayoutManager {

    /* renamed from: D */
    public RecyclerView f162959D;

    /* renamed from: E */
    public float f162960E;

    public MinusScreenGridLayoutManager(Context context, int i) {
        super(context, i);
    }

    /* renamed from: V */
    public void mo16973V(int i, int i2) {
        super.mo16973V(i, i2);
    }

    public void onLayoutChildren(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        try {
            super.onLayoutChildren(rVar, wVar);
        } catch (IndexOutOfBoundsException e) {
            Log.printErrStackTrace("MicroMsg.MultiTask.MinusScreenGridLayoutManager", e, "", new Object[0]);
        }
    }

    public void requestSimpleAnimationsInNextLayout() {
        super.requestSimpleAnimationsInNextLayout();
        try {
            Method declaredMethod = RecyclerView.class.getDeclaredMethod("Y0", new Class[0]);
            declaredMethod.setAccessible(true);
            Field declaredField = RecyclerView.LayoutManager.class.getDeclaredField("mRecyclerView");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            if (obj != null) {
                declaredMethod.invoke(obj, new Object[0]);
                Log.m105924i("MicroMsg.MultiTask.MinusScreenGridLayoutManager", "markItemDecorInsetsDirty");
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MultiTask.MinusScreenGridLayoutManager", e, "", new Object[0]);
        }
    }

    public void scrollToPosition(int i) {
        super.scrollToPosition(i);
    }

    public int scrollVerticallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        RecyclerView recyclerView = this.f162959D;
        float translationY = recyclerView != null ? recyclerView.getTranslationY() : 0.0f;
        boolean z = true;
        int i2 = (translationY > 0.0f ? 1 : (translationY == 0.0f ? 0 : -1));
        if ((i2 == 0) || this.f162960E * translationY < 0.0f) {
            if (i2 != 0) {
                z = false;
            }
            if (z) {
                this.f162960E = 0.0f;
            } else if (this.f162960E * translationY < 0.0f) {
                RecyclerView recyclerView2 = this.f162959D;
                if (recyclerView2 != null) {
                    recyclerView2.setTranslationY(0.0f);
                }
                this.f162960E = translationY;
            }
            Log.m105918d("MicroMsg.MultiTask.MinusScreenGridLayoutManager", "currentTransY: " + translationY + ", preTransY: " + this.f162960E);
            return super.scrollVerticallyBy(i, rVar, wVar);
        }
        this.f162960E = translationY;
        Log.m105918d("MicroMsg.MultiTask.MinusScreenGridLayoutManager", "currentTransY: " + translationY + ", preTransY: " + this.f162960E);
        return 0;
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C16628w wVar, int i) {
        super.smoothScrollToPosition(recyclerView, wVar, i);
    }
}
