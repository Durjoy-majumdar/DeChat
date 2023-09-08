package com.tencent.p014mm.p136ui;

import android.view.View;
import android.view.WindowInsets;
import com.tencent.p014mm.sdk.platformtools.SyncTask;

/* renamed from: com.tencent.mm.ui.l4 */
public class C85877l4 extends SyncTask<WindowInsets> {

    /* renamed from: a */
    public final /* synthetic */ View f250183a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85877l4(long j, WindowInsets windowInsets, View view) {
        super(j, windowInsets);
        this.f250183a = view;
    }

    public Object run() {
        return this.f250183a.getRootWindowInsets();
    }
}
