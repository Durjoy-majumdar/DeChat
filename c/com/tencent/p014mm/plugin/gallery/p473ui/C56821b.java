package com.tencent.p014mm.plugin.gallery.p473ui;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import com.tencent.p014mm.plugin.gallery.p473ui.C94049a;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.gallery.ui.b */
public class C56821b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f162826d;

    /* renamed from: e */
    public final /* synthetic */ View f162827e;

    public C56821b(C94049a.C94051h hVar, View view, View view2) {
        this.f162826d = view;
        this.f162827e = view2;
    }

    public void run() {
        Rect rect = new Rect();
        this.f162826d.getHitRect(rect);
        rect.left -= C76577a.m92151b(this.f162826d.getContext(), 20);
        rect.top -= C76577a.m92151b(this.f162826d.getContext(), 20);
        rect.right += C76577a.m92151b(this.f162826d.getContext(), 20);
        rect.bottom += C76577a.m92151b(this.f162826d.getContext(), 20);
        this.f162827e.setTouchDelegate(new TouchDelegate(rect, this.f162826d));
    }
}
