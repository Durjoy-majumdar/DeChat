package com.tencent.p014mm.p136ui.chatting;

import android.view.MenuItem;
import com.tencent.p014mm.p136ui.chatting.C73852u1;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.ui.chatting.w1 */
public class C74333w1 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C73852u1.C73861i f218359d;

    public C74333w1(C73852u1.C73861i iVar) {
        this.f218359d = iVar;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            C73852u1.this.mo102896m();
        } else if (itemId == 2) {
            C73852u1.this.mo102897n();
        }
    }
}
