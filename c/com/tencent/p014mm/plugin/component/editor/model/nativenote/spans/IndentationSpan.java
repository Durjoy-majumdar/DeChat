package com.tencent.p014mm.plugin.component.editor.model.nativenote.spans;

import android.text.style.LeadingMarginSpan;
import w21.C102309g;
import w21.C102310h;

/* renamed from: com.tencent.mm.plugin.component.editor.model.nativenote.spans.IndentationSpan */
public class IndentationSpan extends LeadingMarginSpan.Standard implements C102310h<Integer>, C102309g<Integer> {

    /* renamed from: d */
    public final int f268171d;

    /* renamed from: e */
    public final boolean f268172e;

    public IndentationSpan(int i, boolean z) {
        super(i);
        this.f268171d = i;
        this.f268172e = z;
    }

    /* renamed from: a */
    public C102309g mo127577a() {
        return new IndentationSpan(this.f268171d, this.f268172e);
    }

    public int getLeadingMargin(boolean z) {
        if (this.f268172e) {
            return 0;
        }
        return this.f268171d;
    }

    public Object getValue() {
        return Integer.valueOf(this.f268171d);
    }
}
