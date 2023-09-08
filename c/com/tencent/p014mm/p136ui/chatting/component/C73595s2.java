package com.tencent.p014mm.p136ui.chatting.component;

import androidx.core.widget.NestedScrollView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.chatting.component.s2 */
public class C73595s2 implements NestedScrollView.C67086b {

    /* renamed from: a */
    public final /* synthetic */ GroupToolsComponet f216109a;

    public C73595s2(GroupToolsComponet groupToolsComponet) {
        this.f216109a = groupToolsComponet;
    }

    /* renamed from: a */
    public void mo91164a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        if (i2 == 0) {
            Log.m105918d("MicroMsg.roomtools.GroupToolsComponet", "TOP SCROLL");
            this.f216109a.f215607r.setVisibility(8);
            return;
        }
        Log.m105918d("MicroMsg.roomtools.GroupToolsComponet", "no TOP SCROLL");
        this.f216109a.f215607r.setVisibility(0);
    }
}
