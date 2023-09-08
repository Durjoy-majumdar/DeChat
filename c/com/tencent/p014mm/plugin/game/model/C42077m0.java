package com.tencent.p014mm.plugin.game.model;

import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C44579p;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import p763ym.C53543s;
import pe3.C47465a;
import py1.C47578f2;
import py1.C47586g3;
import py1.C47589h;
import py1.C47593h3;
import py1.C47612k1;
import py1.C47619l1;
import py1.C47635n3;
import py1.C47645p;
import qy1.C12934a;
import sw1.C48483p;
import uy1.C52644e;

/* renamed from: com.tencent.mm.plugin.game.model.m0 */
public class C42077m0 extends C42056f0 {

    /* renamed from: a */
    public C47578f2 f113371a;

    /* renamed from: b */
    public boolean f113372b;

    /* renamed from: c */
    public LinkedList<C42039b> f113373c;

    /* renamed from: d */
    public HashMap<String, Integer> f113374d = new HashMap<>();

    public C42077m0(C47465a aVar, boolean z) {
        if (aVar == null) {
            this.f113371a = new C47578f2();
            return;
        }
        this.f113371a = (C47578f2) aVar;
        this.f113372b = z;
        mo66042b();
    }

    /* renamed from: b */
    public final void mo66042b() {
        LinkedList<C47593h3> linkedList;
        LinkedList<C47612k1> linkedList2;
        C42039b a;
        String str;
        LinkedList<C42039b> linkedList3 = new LinkedList<>();
        C47645p pVar = this.f113371a.f127691f;
        if (!(pVar == null || (linkedList2 = pVar.f127915d) == null)) {
            Iterator<C47612k1> it = linkedList2.iterator();
            int i = 1;
            while (it.hasNext()) {
                C47612k1 next = it.next();
                C47589h hVar = next.f127825d;
                if (!(hVar == null || (a = C42056f0.m45762a(hVar)) == null)) {
                    C47635n3 n3Var = next.f127825d.f127745z;
                    if (n3Var != null) {
                        String str2 = n3Var.f127888d;
                        if (str2 == null || (str = n3Var.f127889e) == null) {
                            a.f113263P1 = C12934a.m12382d(next.f127828g);
                        } else {
                            a.f113261N1 = str2;
                            a.f113262O1 = str;
                            a.f113263P1 = C12934a.m12379a(next.f127828g, "label", str2);
                        }
                    } else {
                        a.f113263P1 = C12934a.m12382d(next.f127828g);
                    }
                    LinkedList<C47619l1> linkedList4 = next.f127827f;
                    if (linkedList4 != null) {
                        Iterator<C47619l1> it4 = linkedList4.iterator();
                        while (it4.hasNext()) {
                            C47619l1 next2 = it4.next();
                            if (next2 != null) {
                                LinkedList<String> linkedList5 = next2.f127851e;
                                if (linkedList5 == null || linkedList5.size() == 0) {
                                    a.f113258K1.add("");
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    for (int i2 = 0; i2 < next2.f127851e.size(); i2++) {
                                        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(next2.f127851e.get(i2));
                                        if (z1Var == null || z1Var.f108320R1 == 0) {
                                            sb.append(next2.f127851e.get(i2));
                                        } else {
                                            sb.append(z1Var.mo62898f());
                                        }
                                        if (i2 < next2.f127851e.size() - 1) {
                                            sb.append("、");
                                        }
                                    }
                                    sb.append(" ");
                                    a.f113258K1.add(sb.toString());
                                }
                                a.f113258K1.add(next2.f127850d);
                            }
                        }
                    }
                    a.f113254G1 = 10;
                    a.f113255H1 = 1004;
                    a.f113256I1 = i;
                    linkedList3.add(a);
                    i++;
                }
            }
        }
        this.f113373c = linkedList3;
        if (this.f113372b) {
            C52644e.m59022c(linkedList3);
            Class cls = C53543s.class;
            this.f113374d = new HashMap<>();
            C47586g3 g3Var = this.f113371a.f127692g;
            if (!(g3Var == null || (linkedList = g3Var.f127713e) == null)) {
                Iterator<C47593h3> it5 = linkedList.iterator();
                while (it5.hasNext()) {
                    C47593h3 next3 = it5.next();
                    C42039b a2 = C42056f0.m45762a(next3.f127755d);
                    if (a2 != null) {
                        this.f113374d.put(a2.field_appId, Integer.valueOf(a2.f113257J1));
                        C44561j Lo = ((C44579p) ((C53543s) C86312j.m106911c(cls)).Gk0()).mo69371Lo(a2.field_appId);
                        if (Lo != null) {
                            Lo.f149245M = next3.f127756e;
                            Lo.f149233A = true;
                            if (!((C44579p) ((C53543s) C86312j.m106911c(cls)).Gk0()).update(Lo, new String[0])) {
                                Log.m105921e("MicroMsg.GamePBDataOverSea", "Store rank info failed, AppID: %s", Lo.field_appId);
                            }
                        }
                    }
                }
            }
            ((C48483p) C86312j.m106911c(C48483p.class)).xg0().mo65971b(MMApplicationContext.getContext());
        }
    }

    public C42077m0(byte[] bArr, boolean z) {
        C47578f2 f2Var = new C47578f2();
        this.f113371a = f2Var;
        if (bArr != null && bArr.length != 0) {
            try {
                f2Var.parseFrom(bArr);
            } catch (IOException e) {
                Log.m105921e("MicroMsg.GamePBDataOverSea", "Parsing Failed: %s", e.getMessage());
            }
            this.f113372b = z;
            mo66042b();
        }
    }
}
