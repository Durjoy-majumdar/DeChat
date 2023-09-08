package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Context;
import android.widget.Button;
import android.widget.TextView;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import p011cm.C39989b;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.y0 */
public final class C68775y0 implements C39989b.C0705b {

    /* renamed from: d */
    public final /* synthetic */ BizTLRecCardItem f197578d;

    public C68775y0(BizTLRecCardItem bizTLRecCardItem) {
        this.f197578d = bizTLRecCardItem;
    }

    /* renamed from: a */
    public final void mo677a(boolean z, boolean z2, String str, String str2) {
        WeakReference<Context> weakReference;
        C87412m.m108594g(str, "respUsername");
        C87412m.m108594g(str2, "googleItemID");
        if (z && (weakReference = this.f197578d.f50320o) != null && weakReference.get() != null) {
            TextView textView = this.f197578d.f50319n;
            if (textView != null) {
                textView.setVisibility(0);
                Button button = this.f197578d.f50318m;
                if (button != null) {
                    button.setVisibility(8);
                } else {
                    C87412m.m108603p("followType3");
                    throw null;
                }
            } else {
                C87412m.m108603p("followAlready");
                throw null;
            }
        }
    }
}
