package com.tencent.p014mm.plugin.game.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import pe3.C47465a;
import py1.C47545a4;
import py1.C47561d;
import py1.C47575f;
import py1.C47606j2;
import py1.C47642o3;
import py1.C47714z3;
import sw1.C48484q;
import uy1.C52644e;

/* renamed from: com.tencent.mm.plugin.game.model.l0 */
public class C42075l0 extends C42056f0 {

    /* renamed from: a */
    public C47606j2 f113366a;

    /* renamed from: b */
    public LinkedList<C42039b> f113367b;

    /* renamed from: c */
    public LinkedList<C42039b> f113368c;

    /* renamed from: d */
    public int f113369d = 0;

    public C42075l0(C47465a aVar, boolean z, boolean z2, int i) {
        if (aVar == null) {
            this.f113366a = new C47606j2();
            return;
        }
        this.f113366a = (C47606j2) aVar;
        this.f113369d = i;
        this.f113367b = mo66041c();
        this.f113368c = mo66040b();
        if (z) {
            ((C48484q) C86312j.m106911c(C48484q.class)).mo66106SL().mo57119qq("pb_library", aVar);
        }
        if (z2) {
            C52644e.m59022c(this.f113367b);
            C52644e.m59022c(this.f113368c);
        }
    }

    /* renamed from: b */
    public final LinkedList<C42039b> mo66040b() {
        C47561d dVar;
        LinkedList<C42039b> linkedList = new LinkedList<>();
        LinkedList<C47575f> linkedList2 = this.f113366a.f127809e;
        if (linkedList2 == null) {
            return linkedList;
        }
        int i = this.f113369d;
        int i2 = i + 1;
        int i3 = (i / 15) + 901;
        Iterator<C47575f> it = linkedList2.iterator();
        while (it.hasNext()) {
            C47575f next = it.next();
            C42039b bVar = null;
            int i4 = next.f127677d;
            if (i4 == 1) {
                bVar = C42056f0.m45762a(next.f127678e);
                if (bVar != null) {
                    bVar.f113256I1 = i2;
                    i2++;
                }
            } else if (!(i4 != 2 || (dVar = next.f127679f) == null || (bVar = C42056f0.m45762a(dVar.f127629d)) == null)) {
                bVar.f113271z1 = 1;
                C47561d dVar2 = next.f127679f;
                bVar.f113250C1 = dVar2.f127631f;
                bVar.f113251D1 = dVar2.f127630e;
                bVar.f113256I1 = i3;
                i3++;
            }
            if (bVar != null) {
                bVar.f113254G1 = 11;
                bVar.f113255H1 = 1111;
                linkedList.add(bVar);
            }
        }
        return linkedList;
    }

    /* renamed from: c */
    public final LinkedList<C42039b> mo66041c() {
        C47714z3 z3Var;
        LinkedList<C47545a4> linkedList;
        LinkedList<C42039b> linkedList2 = new LinkedList<>();
        C47642o3 o3Var = this.f113366a.f127808d;
        if (!(o3Var == null || (z3Var = o3Var.f127903e) == null || (linkedList = z3Var.f128184d) == null)) {
            Iterator<C47545a4> it = linkedList.iterator();
            int i = 1;
            while (it.hasNext()) {
                C47545a4 next = it.next();
                C42039b a = C42056f0.m45762a(next.f127561d);
                if (a != null) {
                    a.f113259L1 = next.f127561d.f127739t;
                    a.f113254G1 = 11;
                    a.f113255H1 = 1110;
                    a.f113256I1 = i;
                    linkedList2.add(a);
                    i++;
                }
            }
        }
        return linkedList2;
    }

    public C42075l0(byte[] bArr) {
        C47606j2 j2Var = new C47606j2();
        this.f113366a = j2Var;
        if (bArr != null && bArr.length != 0) {
            try {
                j2Var.parseFrom(bArr);
            } catch (IOException e) {
                Log.m105921e("MicroMsg.GamePBDataLibrary", "Parsing Failed: %s", e.getMessage());
            }
            this.f113367b = mo66041c();
            this.f113368c = mo66040b();
            C52644e.m59022c(this.f113367b);
            C52644e.m59022c(this.f113368c);
        }
    }
}
