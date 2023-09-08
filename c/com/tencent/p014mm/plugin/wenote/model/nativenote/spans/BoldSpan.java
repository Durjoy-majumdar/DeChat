package com.tencent.p014mm.plugin.wenote.model.nativenote.spans;

import android.text.style.StyleSpan;
import db3.C97463g;

/* renamed from: com.tencent.mm.plugin.wenote.model.nativenote.spans.BoldSpan */
public class BoldSpan extends StyleSpan implements C97463g<Boolean> {
    public BoldSpan() {
        super(1);
    }

    public Object getValue() {
        return Boolean.TRUE;
    }
}
