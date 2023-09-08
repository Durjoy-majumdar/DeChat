package com.tencent.p014mm.plugin.gallery.p473ui;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.tencent.mm.plugin.gallery.ui.SpeedyLinearLayoutManager */
public class SpeedyLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: v */
    public float f271532v = 50.0f;

    /* renamed from: com.tencent.mm.plugin.gallery.ui.SpeedyLinearLayoutManager$a */
    public class C94048a extends C54256s {
        public C94048a(Context context) {
            super(context);
        }

        /* renamed from: a */
        public PointF mo17380a(int i) {
            return SpeedyLinearLayoutManager.this.mo16988f(i);
        }

        /* renamed from: k */
        public float mo3227k(DisplayMetrics displayMetrics) {
            return SpeedyLinearLayoutManager.this.f271532v / ((float) displayMetrics.densityDpi);
        }
    }

    public SpeedyLinearLayoutManager(Context context) {
        super(context);
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C16628w wVar, int i) {
        C94048a aVar = new C94048a(recyclerView.getContext());
        aVar.f44872a = i;
        startSmoothScroll(aVar);
    }

    public SpeedyLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
