package com.tencent.p014mm.plugin.address.p879ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.tencent.p014mm.sdk.platformtools.Log;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.address.ui.MMScrollView */
public class MMScrollView extends ScrollView implements View.OnFocusChangeListener {

    /* renamed from: com.tencent.mm.plugin.address.ui.MMScrollView$a */
    public class C68535a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f196900d;

        public C68535a(View view) {
            this.f196900d = view;
        }

        public void run() {
            MMScrollView.this.scrollTo(0, this.f196900d.getTop() - C76577a.m92151b(MMScrollView.this.getContext(), 10));
        }
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.MMScrollView$b */
    public interface C68536b {
        /* renamed from: a */
        void mo94163a(boolean z);
    }

    public MMScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo94158a(ViewGroup viewGroup, View.OnFocusChangeListener onFocusChangeListener) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AddrEditView) {
                childAt.setOnFocusChangeListener(onFocusChangeListener);
            } else if (childAt instanceof ViewGroup) {
                mo94158a((ViewGroup) childAt, onFocusChangeListener);
            }
        }
    }

    public void onFocusChange(View view, boolean z) {
        Log.m105918d("MicroMsg.MMScrollView", "onFocusChange:" + z);
        if (z) {
            postDelayed(new C68535a(view), 200);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setOnSizeChangeListener(C68536b bVar) {
    }

    public MMScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
