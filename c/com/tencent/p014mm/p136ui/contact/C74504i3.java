package com.tencent.p014mm.p136ui.contact;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: com.tencent.mm.ui.contact.i3 */
public final class C74504i3 {

    /* renamed from: a */
    public final String f219061a;

    /* renamed from: b */
    public final String f219062b;

    /* renamed from: c */
    public boolean f219063c;

    /* renamed from: d */
    public boolean f219064d;

    public C74504i3(String str, String str2, boolean z, boolean z2, int i, C8480h hVar) {
        z = (i & 4) != 0 ? false : z;
        z2 = (i & 8) != 0 ? false : z2;
        C87412m.m108594g(str, "contactUserName");
        C87412m.m108594g(str2, "displayNickName");
        this.f219061a = str;
        this.f219062b = str2;
        this.f219063c = z;
        this.f219064d = z2;
    }
}
