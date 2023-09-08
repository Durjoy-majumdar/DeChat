package com.tencent.p014mm.plugin.finder.live.view;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.live.view.s0 */
public final class C56096s0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f159958d;

    /* renamed from: e */
    public final /* synthetic */ FinderLiveMiniView f159959e;

    /* renamed from: com.tencent.mm.plugin.finder.live.view.s0$a */
    public static final class C56097a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveMiniView f159960d;

        /* renamed from: e */
        public final /* synthetic */ Bitmap f159961e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56097a(FinderLiveMiniView finderLiveMiniView, Bitmap bitmap) {
            super(0);
            this.f159960d = finderLiveMiniView;
            this.f159961e = bitmap;
        }

        public Object invoke() {
            this.f159960d.f159787h.setImageDrawable(new BitmapDrawable(this.f159960d.getContext().getResources(), this.f159961e));
            Log.m105924i(this.f159960d.getTAG(), "loadBackgroundImage success!");
            return C13598b0.f38549a;
        }
    }

    public C56096s0(Bitmap bitmap, FinderLiveMiniView finderLiveMiniView) {
        this.f159958d = bitmap;
        this.f159959e = finderLiveMiniView;
    }

    public final void run() {
        int height = (int) (((float) this.f159958d.getHeight()) / (((float) C85875k4.m106184h(MMApplicationContext.getContext()).y) / ((float) C85875k4.m106184h(MMApplicationContext.getContext()).x)));
        Bitmap bitmap = this.f159958d;
        C61926c.m72668M(new C56097a(this.f159959e, BitmapUtil.extractThumbNail(bitmap, bitmap.getHeight(), height, true, false)));
    }
}
