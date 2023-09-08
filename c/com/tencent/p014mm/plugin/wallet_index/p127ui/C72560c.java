package com.tencent.p014mm.plugin.wallet_index.p127ui;

import com.tencent.p014mm.wallet_core.model.C57931j0;
import java.util.ArrayList;
import java.util.List;
import m63.C76750e;
import n63.C47166n;
import ob0.C117747y;
import te3.C77987qh2;
import te3.C77991rh2;

/* renamed from: com.tencent.mm.plugin.wallet_index.ui.c */
public class C72560c {

    /* renamed from: a */
    public ArrayList<String> f211087a = new ArrayList<>();

    /* renamed from: b */
    public ArrayList<String> f211088b = new ArrayList<>();

    /* renamed from: c */
    public C77991rh2 f211089c;

    /* renamed from: d */
    public C77987qh2 f211090d;

    /* renamed from: e */
    public int f211091e = 1;

    /* renamed from: f */
    public String f211092f = null;

    /* renamed from: g */
    public int f211093g = 0;

    /* renamed from: h */
    public String f211094h = null;

    /* renamed from: i */
    public String f211095i = null;

    /* renamed from: j */
    public String f211096j = null;

    /* renamed from: k */
    public List<String> f211097k = new ArrayList();

    /* renamed from: l */
    public String f211098l = null;

    /* renamed from: m */
    public int f211099m;

    /* renamed from: n */
    public boolean f211100n = false;

    /* renamed from: o */
    public String f211101o;

    /* renamed from: p */
    public String f211102p;

    /* renamed from: q */
    public String f211103q;

    /* renamed from: r */
    public int f211104r;

    /* renamed from: s */
    public int f211105s;

    /* renamed from: a */
    public C117747y mo99970a(C76750e eVar, boolean z) {
        boolean z2 = true;
        int i = z ? 2 : 1;
        if (!this.f211100n) {
            return new C57931j0(eVar.f224521c, i, this.f211099m, this.f211091e, eVar.f224522d, eVar.f224524f, eVar.f224525g, eVar.f224526h, eVar.f224527i);
        }
        int i2 = this.f211099m;
        if (i2 != 2) {
            z2 = false;
        }
        if (!z2) {
            C77987qh2 qh22 = this.f211090d;
            qh22.f228132j = eVar.f224525g;
            qh22.f228129g = eVar.f224522d;
            qh22.f228127e = eVar.f224527i;
            qh22.f228128f = eVar.f224526h;
            qh22.f228126d = eVar.f224521c;
            qh22.f228131i = eVar.f224524f;
        }
        return new C47166n(i2, i, eVar.f224521c, this.f211089c, this.f211090d);
    }
}
