package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.widget.FrameLayout;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74071j2;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.j2$b$$b */
public class j2$b$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C74071j2.C74072a f217395d;

    public j2$b$$b(C74071j2.C74073b bVar, C74071j2.C74072a aVar) {
        this.f217395d = aVar;
    }

    public void run() {
        this.f217395d.f217382b.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f217395d.f217388h.setLayoutParams(new FrameLayout.LayoutParams(this.f217395d.f217382b.getWidth(), this.f217395d.f217382b.getHeight()));
    }
}
