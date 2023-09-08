package com.tencent.p014mm.plugin.component.editor.model.nativenote.spans;

import android.text.style.StyleSpan;
import w21.C102310h;

/* renamed from: com.tencent.mm.plugin.component.editor.model.nativenote.spans.BoldSpan */
public class BoldSpan extends StyleSpan implements C102310h<Boolean> {
    public BoldSpan() {
        super(1);
    }

    public Object getValue() {
        return Boolean.TRUE;
    }
}
