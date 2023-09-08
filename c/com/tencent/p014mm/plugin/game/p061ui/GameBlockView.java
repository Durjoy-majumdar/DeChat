package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import ry1.C48130k0;
import ry1.C48131l;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.game.ui.GameBlockView */
public class GameBlockView extends LinearLayout implements C111847h {

    /* renamed from: d */
    public LayoutInflater f113654d;

    /* renamed from: e */
    public LinearLayout.LayoutParams f113655e;

    /* renamed from: f */
    public LinearLayout f113656f;

    /* renamed from: g */
    public C48130k0 f113657g;

    /* renamed from: h */
    public C42156a f113658h;

    /* renamed from: com.tencent.mm.plugin.game.ui.GameBlockView$a */
    public static class C42156a {

        /* renamed from: a */
        public ViewGroup f113659a;

        /* renamed from: b */
        public ImageView f113660b;

        /* renamed from: c */
        public TextView f113661c;

        /* renamed from: d */
        public TextView f113662d;

        /* renamed from: e */
        public GameDownloadView f113663e;

        public C42156a(C48131l lVar) {
        }
    }

    public GameBlockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        setOrientation(1);
        this.f113654d = (LayoutInflater) getContext().getSystemService("layout_inflater");
        this.f113655e = new LinearLayout.LayoutParams(-1, -2);
        this.f113656f = this;
        this.f113657g = new C48130k0();
        Log.m105924i("MicroMsg.GameBlockView", "initView finished");
    }
}
