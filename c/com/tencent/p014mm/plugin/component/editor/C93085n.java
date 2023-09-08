package com.tencent.p014mm.plugin.component.editor;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.ArrayList;
import o21.C100273b;
import p21.C100618c;
import te3.C101834rc0;
import u21.C101941c;

/* renamed from: com.tencent.mm.plugin.component.editor.n */
public class C93085n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f268173d;

    /* renamed from: e */
    public final /* synthetic */ String f268174e;

    /* renamed from: f */
    public final /* synthetic */ EditorUI f268175f;

    public C93085n(EditorUI editorUI, String str, String str2) {
        this.f268175f = editorUI;
        this.f268173d = str;
        this.f268174e = str2;
    }

    public void run() {
        C86009m1 m1Var = new C86009m1(this.f268173d);
        C100618c cVar = new C100618c();
        cVar.f294820s = Util.isNullOrNil(this.f268174e) ? m1Var.getName() : this.f268174e;
        cVar.f294821t = C100273b.m131076d((float) m1Var.mo119980r());
        cVar.f294807l = C101941c.m134173q().mo141455k();
        cVar.f294811p = 5;
        cVar.f294812q = true;
        cVar.f294822u = C86013q1.m106454o(this.f268173d);
        cVar.f294810o = m1Var.mo119980r();
        cVar.f294795a = C100273b.m131073a(cVar.toString(), 18);
        this.f268175f.f268061z = new C101834rc0();
        this.f268175f.f268061z.mo141260p(8);
        this.f268175f.f268061z.mo141257m(cVar.f294795a);
        this.f268175f.f268061z.mo141261q(cVar.f294822u);
        C101834rc0 rc02 = this.f268175f.f268061z;
        cVar.f294809n = rc02;
        cVar.f294813r = C100273b.m131075c(rc02);
        C101941c q = C101941c.m134173q();
        q.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        if (!q.mo141449e(arrayList)) {
            C86013q1.m106442c(this.f268173d, cVar.f294813r);
            C101941c.m134173q().mo141461r(cVar, this.f268175f.f268048j.mo127569c(), true, true, false, true, false);
        } else {
            this.f268175f.mo127486U7();
        }
        this.f268175f.mo127491Z7(true, 100);
        this.f268175f.mo127490Y7(1, 0);
    }
}
