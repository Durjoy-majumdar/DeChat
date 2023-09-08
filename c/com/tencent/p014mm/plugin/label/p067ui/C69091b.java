package com.tencent.p014mm.plugin.label.p067ui;

import com.tencent.p014mm.sdk.platformtools.Util;
import e22.C75516l0;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.label.ui.b */
public final class C69091b implements C75516l0.C75520c {

    /* renamed from: a */
    public final /* synthetic */ ContactEditLabel f198677a;

    public C69091b(ContactEditLabel contactEditLabel) {
        this.f198677a = contactEditLabel;
    }

    /* renamed from: a */
    public void mo95165a(String str) {
        C87412m.m108594g(str, "Str");
        ContactEditLabel contactEditLabel = this.f198677a;
        contactEditLabel.f198456h = str;
        contactEditLabel.getClass();
        contactEditLabel.enableOptionMenu(!Util.isNullOrNil(str));
    }
}
