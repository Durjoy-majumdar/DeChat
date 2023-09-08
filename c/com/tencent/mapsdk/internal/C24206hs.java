package com.tencent.mapsdk.internal;

import java.util.ArrayList;
import java.util.Iterator;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.hs */
public final class C24206hs extends C24204hq {

    /* renamed from: g */
    private ArrayList<C24204hq> f69294g = new ArrayList<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C24206hs(C24204hq... hqVarArr) {
        super(0);
        long j = 0;
        for (int i = 0; i < hqVarArr.length; i++) {
            this.f69294g.add(hqVarArr[i]);
            j = Math.max(j, hqVarArr[i].mo40956a());
        }
        this.f69287e = j;
    }

    /* renamed from: a */
    public final void mo40958a(GL10 gl10, long j) {
        ArrayList<C24204hq> arrayList = this.f69294g;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<C24204hq> it = this.f69294g.iterator();
            while (it.hasNext()) {
                C24204hq next = it.next();
                if (!next.mo40960c()) {
                    next.mo40957a(gl10);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo40959b() {
        super.mo40959b();
        Iterator<C24204hq> it = this.f69294g.iterator();
        while (it.hasNext()) {
            it.next().mo40959b();
        }
    }

    /* renamed from: d */
    public final void mo40961d() {
        super.mo40961d();
        Iterator<C24204hq> it = this.f69294g.iterator();
        while (it.hasNext()) {
            it.next().mo40959b();
        }
    }
}
