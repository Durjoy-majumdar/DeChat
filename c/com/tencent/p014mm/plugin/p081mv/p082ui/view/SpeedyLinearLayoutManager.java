package com.tencent.p014mm.plugin.p081mv.p082ui.view;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.tencent.mm.plugin.mv.ui.view.SpeedyLinearLayoutManager */
public class SpeedyLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: v */
    public float f163661v = 50.0f;

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.SpeedyLinearLayoutManager$a */
    public class C57124a extends C54256s {
        public C57124a(Context context) {
            super(context);
        }

        /* renamed from: a */
        public PointF mo17380a(int i) {
            return SpeedyLinearLayoutManager.this.mo16988f(i);
        }

        /* renamed from: k */
        public float mo3227k(DisplayMetrics displayMetrics) {
            return SpeedyLinearLayoutManager.this.f163661v / ((float) displayMetrics.densityDpi);
        }
    }

    public SpeedyLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C16628w wVar, int i) {
        C57124a aVar = new C57124a(recyclerView.getContext());
        aVar.f44872a = i;
        startSmoothScroll(aVar);
    }

    public SpeedyLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
