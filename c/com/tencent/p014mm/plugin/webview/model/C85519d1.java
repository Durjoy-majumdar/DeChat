package com.tencent.p014mm.plugin.webview.model;

import com.tencent.p014mm.opensdk.modelmsg.SendAuth;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.pluginsdk.model.app.C72691t1;
import qo3.C47883u;

/* renamed from: com.tencent.mm.plugin.webview.model.d1 */
public class C85519d1 implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ SendAuth.Options f249213a;

    /* renamed from: b */
    public final /* synthetic */ String f249214b;

    /* renamed from: c */
    public final /* synthetic */ int f249215c;

    /* renamed from: d */
    public final /* synthetic */ boolean f249216d;

    /* renamed from: e */
    public final /* synthetic */ int f249217e;

    /* renamed from: f */
    public final /* synthetic */ String f249218f;

    /* renamed from: g */
    public final /* synthetic */ C85518c1 f249219g;

    public C85519d1(C85518c1 c1Var, SendAuth.Options options, String str, int i, boolean z, int i2, String str2) {
        this.f249219g = c1Var;
        this.f249213a = options;
        this.f249214b = str;
        this.f249215c = i;
        this.f249216d = z;
        this.f249217e = i2;
        this.f249218f = str2;
    }

    /* renamed from: a */
    public void mo353a(boolean z, String str) {
        this.f249219g.mo118910c(-2, this.f249213a, this.f249214b, this.f249215c, this.f249216d);
        C72688j0.m85015a(this.f249217e, this.f249218f, this.f249214b, 1, C72691t1.C72692a.m85046a(this.f249215c), 4);
    }
}
