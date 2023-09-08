package com.tencent.liteav.videobase.videobase;

import android.view.View;

/* renamed from: com.tencent.liteav.videobase.videobase.b */
final /* synthetic */ class C17254b implements Runnable {

    /* renamed from: a */
    private final View f46647a;

    /* renamed from: b */
    private final int f46648b;

    private C17254b(View view, int i) {
        this.f46647a = view;
        this.f46648b = i;
    }

    /* renamed from: a */
    public static Runnable m17146a(View view, int i) {
        return new C17254b(view, i);
    }

    public final void run() {
        DisplayTarget.lambda$setVisibility$0(this.f46647a, this.f46648b);
    }
}
