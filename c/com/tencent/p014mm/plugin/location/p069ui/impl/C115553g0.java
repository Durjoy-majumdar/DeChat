package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.view.KeyEvent;
import android.widget.TextView;
import com.tencent.p014mm.plugin.location.p069ui.impl.C115538c0;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.g0 */
public class C115553g0 implements TextView.OnEditorActionListener {

    /* renamed from: d */
    public final /* synthetic */ C115538c0 f346575d;

    public C115553g0(C115538c0 c0Var) {
        this.f346575d = c0Var;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (3 != i) {
            return false;
        }
        this.f346575d.mo175583y(C115538c0.C115548i.COLLAPSED);
        this.f346575d.f346543l1 = true;
        return false;
    }
}
