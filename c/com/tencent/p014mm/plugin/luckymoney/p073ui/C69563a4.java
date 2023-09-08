package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ir3.C76371a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.a4 */
public class C69563a4 extends RecyclerView.C0129l {

    /* renamed from: d */
    public final int f200859d = C76371a.m91795a(4);

    /* renamed from: e */
    public final int f200860e = C76371a.m91795a(8);

    /* renamed from: f */
    public final /* synthetic */ LuckyMoneyPickEnvelopeUI f200861f;

    public C69563a4(LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI) {
        this.f200861f = luckyMoneyPickEnvelopeUI;
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        int ceil = (int) Math.ceil((double) (((float) ((ArrayList) this.f200861f.f200555s).size()) / 3.0f));
        int N0 = recyclerView.mo17029N0(view);
        int ceil2 = (int) Math.ceil((double) (((float) (N0 + 1)) / 3.0f));
        if (ceil2 == 0) {
            int i = this.f200859d;
            rect.top = i * 2;
            rect.bottom = i * 2;
        } else if (ceil2 == ceil) {
            int i2 = this.f200859d;
            rect.top = i2;
            rect.bottom = i2 * 2;
        } else {
            int i3 = this.f200859d;
            rect.top = i3;
            rect.bottom = i3;
        }
        int i4 = N0 % 3;
        if (i4 == 0) {
            int i5 = this.f200860e;
            rect.left = i5;
            rect.right = i5 / 3;
        } else if (i4 == 1) {
            int i6 = this.f200860e;
            rect.left = (i6 * 2) / 3;
            rect.right = (i6 * 2) / 3;
        } else {
            int i7 = this.f200860e;
            rect.left = i7 / 3;
            rect.right = i7;
        }
    }
}
