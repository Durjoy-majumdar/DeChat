package com.tencent.p014mm.plugin.game;

import com.tencent.p014mm.plugin.appbrand.utils.C2039g2;
import oy1.C11781a;
import qo3.C89779i0;
import qy1.C47890b;
import sw1.C48478n;

/* renamed from: com.tencent.mm.plugin.game.m */
public class C42018m implements C11781a {

    /* renamed from: a */
    public final /* synthetic */ C89779i0 f113181a;

    /* renamed from: b */
    public final /* synthetic */ C48478n.C48481f f113182b;

    /* renamed from: c */
    public final /* synthetic */ int f113183c;

    /* renamed from: d */
    public final /* synthetic */ C48478n.C13793h f113184d;

    public C42018m(C41877l lVar, C89779i0 i0Var, C48478n.C48481f fVar, int i, C48478n.C13793h hVar) {
        this.f113181a = i0Var;
        this.f113182b = fVar;
        this.f113183c = i;
        this.f113184d = hVar;
    }

    /* renamed from: a */
    public void mo11674a(String str) {
        C48478n.C48481f fVar = this.f113182b;
        if (fVar != null) {
            fVar.mo6931a(str);
        }
        C2039g2.m1988b(new m$$a(this.f113181a));
        if (this.f113183c == 2) {
            C48478n.C13793h hVar = this.f113184d;
            C47890b.m53201b(hVar.f38917a, 3, 102, 10, 1, hVar.f38920d, hVar.f38924h, hVar.f38923g);
            return;
        }
        C48478n.C13793h hVar2 = this.f113184d;
        C47890b.m53201b(hVar2.f38917a, 3, 101, 10, 1, hVar2.f38920d, hVar2.f38924h, hVar2.f38923g);
    }

    /* renamed from: b */
    public void mo11675b(String str, String str2) {
    }

    /* renamed from: c */
    public void mo11676c() {
        C2039g2.m1988b(new m$$b(this.f113181a));
    }

    public void onCancel() {
        C48478n.C48481f fVar = this.f113182b;
        if (fVar != null) {
            fVar.onCancel();
        }
    }

    public void onSuccess() {
        C48478n.C48481f fVar = this.f113182b;
        if (fVar != null) {
            fVar.onSuccess();
        }
        if (this.f113183c == 2) {
            C48478n.C13793h hVar = this.f113184d;
            C47890b.m53201b(hVar.f38917a, 3, 102, 10, 0, hVar.f38920d, hVar.f38924h, hVar.f38923g);
            return;
        }
        C48478n.C13793h hVar2 = this.f113184d;
        C47890b.m53201b(hVar2.f38917a, 3, 101, 10, 0, hVar2.f38920d, hVar2.f38924h, hVar2.f38923g);
    }
}
