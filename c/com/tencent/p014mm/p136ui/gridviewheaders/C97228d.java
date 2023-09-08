package com.tencent.p014mm.p136ui.gridviewheaders;

import android.view.View;
import com.tencent.p014mm.p136ui.gridviewheaders.GridHeadersGridView;

/* renamed from: com.tencent.mm.ui.gridviewheaders.d */
public class C97228d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f285298d;

    /* renamed from: e */
    public final /* synthetic */ GridHeadersGridView.C97218f f285299e;

    /* renamed from: f */
    public final /* synthetic */ GridHeadersGridView f285300f;

    public C97228d(GridHeadersGridView gridHeadersGridView, View view, GridHeadersGridView.C97218f fVar) {
        this.f285300f = gridHeadersGridView;
        this.f285298d = view;
        this.f285299e = fVar;
    }

    public void run() {
        this.f285300f.f285249J = -1;
        this.f285298d.setPressed(false);
        this.f285300f.setPressed(false);
        this.f285300f.getClass();
        this.f285299e.run();
    }
}
