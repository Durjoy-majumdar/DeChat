package com.tencent.p014mm.plugin.game.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import pe3.C47465a;
import py1.C47565d3;
import py1.C47587g4;
import py1.C47662r2;
import py1.C47676t2;
import py1.C47683u2;
import py1.C47688v1;
import sw1.C48484q;
import uy1.C52644e;

/* renamed from: com.tencent.mm.plugin.game.model.h0 */
public class C42062h0 extends C42056f0 {

    /* renamed from: a */
    public C47688v1 f113323a;

    /* renamed from: b */
    public boolean f113324b;

    /* renamed from: c */
    public C42039b f113325c;

    /* renamed from: d */
    public C42066i0 f113326d;

    /* renamed from: com.tencent.mm.plugin.game.model.h0$a */
    public static class C42063a {

        /* renamed from: a */
        public String f113327a;

        /* renamed from: b */
        public String f113328b;

        /* renamed from: c */
        public String f113329c;
    }

    /* renamed from: com.tencent.mm.plugin.game.model.h0$b */
    public static class C42064b {

        /* renamed from: a */
        public String f113330a;

        /* renamed from: b */
        public String f113331b;

        /* renamed from: c */
        public String f113332c;

        /* renamed from: d */
        public String f113333d;
    }

    public C42062h0(C47465a aVar) {
        if (aVar == null) {
            this.f113323a = new C47688v1();
            return;
        }
        this.f113323a = (C47688v1) aVar;
        this.f113324b = false;
        mo66034c();
    }

    /* renamed from: b */
    public LinkedList<C42064b> mo66033b() {
        C47688v1 v1Var = this.f113323a;
        C47662r2 r2Var = v1Var.f128081q;
        if (r2Var == null || r2Var.f127973f == null) {
            C47676t2 t2Var = v1Var.f128076i;
            if (t2Var == null || t2Var.f128023e == null) {
                return null;
            }
            LinkedList<C42064b> linkedList = new LinkedList<>();
            Iterator<C47683u2> it = this.f113323a.f128076i.f128023e.iterator();
            while (it.hasNext()) {
                C47683u2 next = it.next();
                C42064b bVar = new C42064b();
                bVar.f113330a = next.f128055d;
                bVar.f113331b = next.f128056e;
                bVar.f113332c = next.f128057f;
                bVar.f113333d = next.f128058g;
                linkedList.add(bVar);
            }
            return linkedList;
        }
        LinkedList<C42064b> linkedList2 = new LinkedList<>();
        Iterator<C47565d3> it4 = this.f113323a.f128081q.f127973f.iterator();
        while (it4.hasNext()) {
            C47565d3 next2 = it4.next();
            C42064b bVar2 = new C42064b();
            bVar2.f113330a = next2.f127640d;
            bVar2.f113332c = next2.f127641e;
            linkedList2.add(bVar2);
        }
        return linkedList2;
    }

    /* renamed from: c */
    public final void mo66034c() {
        C42039b a = C42056f0.m45762a(this.f113323a.f128071d);
        if (a != null) {
            a.f113254G1 = 12;
            a.f113255H1 = 1201;
        }
        this.f113325c = a;
        if (this.f113324b) {
            this.f113326d = new C42066i0(a.field_appId);
        } else {
            String str = a.field_appId;
            C47587g4 g4Var = this.f113323a.f128077j;
            this.f113326d = new C42066i0(str, g4Var != null ? g4Var.f127716e : null);
        }
        if (!this.f113324b) {
            C52644e.m59021b(this.f113325c);
            ((C48484q) C86312j.m106911c(C48484q.class)).mo66106SL().mo57119qq(this.f113325c.field_appId, this.f113323a);
        }
    }

    public C42062h0(byte[] bArr) {
        C47688v1 v1Var = new C47688v1();
        this.f113323a = v1Var;
        if (bArr != null && bArr.length != 0) {
            try {
                v1Var.parseFrom(bArr);
            } catch (IOException e) {
                Log.m105921e("MicroMsg.GamePBDataDetail", "Parsing Failed: %s", e.getMessage());
            }
            this.f113324b = true;
            mo66034c();
        }
    }
}
