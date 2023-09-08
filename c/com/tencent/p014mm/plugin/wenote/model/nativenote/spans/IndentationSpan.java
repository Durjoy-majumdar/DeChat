package com.tencent.p014mm.plugin.wenote.model.nativenote.spans;

import android.text.style.LeadingMarginSpan;
import db3.C97462f;
import db3.C97463g;

/* renamed from: com.tencent.mm.plugin.wenote.model.nativenote.spans.IndentationSpan */
public class IndentationSpan extends LeadingMarginSpan.Standard implements C97463g<Integer>, C97462f<Integer> {

    /* renamed from: d */
    public final int f283205d;

    /* renamed from: e */
    public final boolean f283206e;

    public IndentationSpan(int i, boolean z) {
        super(i);
        this.f283205d = i;
        this.f283206e = z;
    }

    /* renamed from: a */
    public C97462f mo134917a() {
        return new IndentationSpan(this.f283205d, this.f283206e);
    }

    public int getLeadingMargin(boolean z) {
        if (this.f283206e) {
            return 0;
        }
        return this.f283205d;
    }

    public Object getValue() {
        return Integer.valueOf(this.f283205d);
    }
}
