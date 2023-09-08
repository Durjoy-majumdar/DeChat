package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import f40.C86709a0;
import f62.C75700k0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import rb0.C48009v0;
import te3.C51455tw;
import te3.lg4;
import te3.mg4;
import te3.pg4;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.b0 */
public class C18453b0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f51225d;

    /* renamed from: e */
    public C47350c f51226e;

    public C18453b0() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new lg4();
        bVar.f127067b = new mg4();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/bizattr/timeline_often_read_biz";
        bVar.f127069d = 2768;
        int i = 0;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f51226e = a;
        lg4 lg4 = (lg4) a.f127055a.f127080a;
        mg4 a2 = C29763t.m38870a();
        LinkedList<C51455tw> linkedList = null;
        if (a2 != null) {
            LinkedList<pg4> linkedList2 = a2.f184323d;
            if (!Util.isNullOrNil((List) linkedList2)) {
                linkedList = new LinkedList<>();
                Iterator<pg4> it = linkedList2.iterator();
                while (it.hasNext()) {
                    pg4 next = it.next();
                    if (next != null) {
                        C51455tw twVar = new C51455tw();
                        twVar.f142446d = next.f354229d;
                        C19623o0 LL = C48009v0.Jx0().mo25784LL(((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69715n3(next.f354229d));
                        if (LL != null) {
                            twVar.f142447e = (int) (LL.field_createTime / 1000);
                        }
                        linkedList.add(twVar);
                    }
                }
            }
        }
        lg4.f137413d = linkedList;
        boolean z = C29762i.f80770a;
        if (C29762i.f80770a && C29762i.f80771b) {
            i = 1;
        }
        lg4.f137414e = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f51225d = nVar;
        return dispatch(gVar, this.f51226e, this);
    }

    public int getType() {
        return 2768;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        this.f51225d.onSceneEnd(i2, i3, str, this);
    }
}
