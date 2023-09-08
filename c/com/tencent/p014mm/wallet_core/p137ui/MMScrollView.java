package com.tencent.p014mm.wallet_core.p137ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72435v;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCardImportUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.formview.EditHintPasswdView;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import kg3.C76577a;

/* renamed from: com.tencent.mm.wallet_core.ui.MMScrollView */
public class MMScrollView extends ScrollView implements View.OnFocusChangeListener {

    /* renamed from: d */
    public C75167c f221172d;

    /* renamed from: e */
    public C75166b f221173e;

    /* renamed from: com.tencent.mm.wallet_core.ui.MMScrollView$a */
    public class C75165a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f221174d;

        public C75165a(View view) {
            this.f221174d = view;
        }

        public void run() {
            MMScrollView.this.scrollTo(0, this.f221174d.getTop() - C76577a.m92151b(MMScrollView.this.getContext(), 10));
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.MMScrollView$b */
    public interface C75166b {
        void onScrollChange(View view, int i, int i2, int i3, int i4);
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.MMScrollView$c */
    public interface C75167c {
    }

    public MMScrollView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo104932a(ViewGroup viewGroup, View.OnFocusChangeListener onFocusChangeListener) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof WalletFormView) || (childAt instanceof EditHintPasswdView)) {
                childAt.setOnFocusChangeListener(onFocusChangeListener);
            } else if (childAt instanceof ViewGroup) {
                mo104932a((ViewGroup) childAt, onFocusChangeListener);
            }
        }
    }

    public void onFocusChange(View view, boolean z) {
        Log.m105918d("MicroMsg.MMScrollView", "onFocusChange:" + z);
        if (z) {
            postDelayed(new C75165a(view), 200);
        }
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C75166b bVar = this.f221173e;
        if (bVar != null) {
            bVar.onScrollChange(this, i, i2, i3, i4);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        C75167c cVar = this.f221172d;
        if (!(cVar == null || i2 == i4)) {
            int i5 = 0;
            boolean z = i2 < i4;
            WalletCardImportUI.C72240a aVar = (WalletCardImportUI.C72240a) cVar;
            aVar.getClass();
            if (z) {
                i5 = 8;
            }
            Log.m105918d("MicroMsg.WalletCardElmentUI", "onSizeChanged : " + z);
            WalletCardImportUI.this.f209978y.post(new C72435v(aVar, i5));
        }
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setOnScrollListener(C75166b bVar) {
        this.f221173e = bVar;
    }

    public void setOnSizeChangeListener(C75167c cVar) {
        if (cVar != null) {
            this.f221172d = cVar;
        }
    }

    public MMScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MMScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
