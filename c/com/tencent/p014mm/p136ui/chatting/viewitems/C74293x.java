package com.tencent.p014mm.p136ui.chatting.viewitems;

import com.tencent.p014mm.p136ui.chatting.viewitems.C74244u;
import p203mi.C24982c0;
import qo3.C77407n;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.x */
public class C74293x implements C77407n.C47880p {

    /* renamed from: a */
    public final /* synthetic */ C74244u.C74253h f218193a;

    /* renamed from: b */
    public final /* synthetic */ String f218194b;

    /* renamed from: c */
    public final /* synthetic */ int f218195c;

    /* renamed from: d */
    public final /* synthetic */ boolean f218196d;

    /* renamed from: e */
    public final /* synthetic */ String f218197e;

    /* renamed from: f */
    public final /* synthetic */ String f218198f;

    public C74293x(C74244u.C74253h hVar, String str, int i, boolean z, String str2, String str3) {
        this.f218193a = hVar;
        this.f218194b = str;
        this.f218195c = i;
        this.f218196d = z;
        this.f218197e = str2;
        this.f218198f = str3;
    }

    public void onDismiss() {
        if (!this.f218193a.f218011a) {
            C24982c0.m31599c(this.f218194b, 1, this.f218195c, this.f218196d ? 1 : 2, 1, this.f218197e, this.f218198f);
        }
    }
}
