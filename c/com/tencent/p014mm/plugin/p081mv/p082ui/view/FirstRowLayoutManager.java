package com.tencent.p014mm.plugin.p081mv.p082ui.view;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.tencent.mm.plugin.mv.ui.view.FirstRowLayoutManager */
public class FirstRowLayoutManager extends GridLayoutManager {

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.FirstRowLayoutManager$a */
    public static class C57075a extends C54256s {
        public C57075a(Context context) {
            super(context);
        }

        /* renamed from: h */
        public int mo6715h(int i, int i2, int i3, int i4, int i5) {
            return i3 - i;
        }

        /* renamed from: k */
        public float mo3227k(DisplayMetrics displayMetrics) {
            return 50.0f / ((float) displayMetrics.densityDpi);
        }
    }

    public FirstRowLayoutManager(Context context, int i) {
        super(context, i);
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C16628w wVar, int i) {
        C57075a aVar = new C57075a(recyclerView.getContext());
        aVar.f44872a = i;
        startSmoothScroll(aVar);
    }
}
