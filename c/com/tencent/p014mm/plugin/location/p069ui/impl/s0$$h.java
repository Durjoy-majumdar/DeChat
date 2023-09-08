package com.tencent.p014mm.plugin.location.p069ui.impl;

import com.tencent.p014mm.plugin.location.p069ui.impl.CustomIndoorPicker;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.s0$$h */
public class s0$$h implements CustomIndoorPicker.C115525a {

    /* renamed from: a */
    public final /* synthetic */ CustomIndoorPicker f272033a;

    /* renamed from: b */
    public final /* synthetic */ C94167s0 f272034b;

    public s0$$h(C94167s0 s0Var, CustomIndoorPicker customIndoorPicker) {
        this.f272034b = s0Var;
        this.f272033a = customIndoorPicker;
    }

    public void onChange() {
        if (!Util.isNullOrNil(this.f272033a.f346428I1) && !Util.isNullOrNil(this.f272033a.f346429J1)) {
            CustomIndoorPicker customIndoorPicker = this.f272033a;
            if (customIndoorPicker.f346428I1.equals(customIndoorPicker.f346425F1)) {
                CustomIndoorPicker customIndoorPicker2 = this.f272033a;
                if (customIndoorPicker2.f346429J1.equals(customIndoorPicker2.f346426G1)) {
                    this.f272034b.f271979B.mo142171a(1.0f);
                    return;
                }
            }
            this.f272034b.f271979B.mo142171a(0.5f);
        }
    }
}
