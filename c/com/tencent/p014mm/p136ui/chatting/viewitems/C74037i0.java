package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74090l0;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import kg3.C76577a;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.i0 */
public class C74037i0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C74090l0.C74091a f217248d;

    /* renamed from: e */
    public final /* synthetic */ boolean f217249e;

    public C74037i0(C74090l0.C74091a aVar, boolean z) {
        this.f217248d = aVar;
        this.f217249e = z;
    }

    public void run() {
        int height = this.f217248d.clickArea.getHeight();
        this.f217248d.clickArea.getWidth();
        ViewGroup.LayoutParams layoutParams = this.f217248d.f217444g.getLayoutParams();
        layoutParams.height = height;
        this.f217248d.f217444g.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f217248d.f217463z.getLayoutParams();
        layoutParams2.height = height;
        this.f217248d.f217463z.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = this.f217248d.f217462y.getLayoutParams();
        layoutParams3.height = height;
        this.f217248d.f217462y.setLayoutParams(layoutParams3);
        int height2 = (int) (((float) this.f217248d.clickArea.getHeight()) * 1.45f);
        int i = (int) (((float) height2) * 1.25f);
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f217248d.f217448k.getLayoutParams();
        layoutParams4.height = height2;
        layoutParams4.width = i;
        this.f217248d.f217448k.setLayoutParams(layoutParams4);
        C74090l0.C74091a aVar = this.f217248d;
        aVar.f217459v = (int) ((((double) aVar.clickArea.getHeight()) * 0.45d) / 2.0d);
        C74090l0.C74091a aVar2 = this.f217248d;
        aVar2.f217460w = aVar2.clickArea.getWidth() - (i + C76577a.m92151b(MMApplicationContext.getContext(), 4));
        C74090l0.C74091a aVar3 = this.f217248d;
        C74090l0.m88117f(aVar3, aVar3.f217459v, this.f217249e);
    }
}
