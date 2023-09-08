package com.tencent.p014mm.plugin.finder.profile.uic;

import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import cm1.C0782u0;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Iterator;
import sk1.C63947a;
import te3.C64273c21;

/* renamed from: com.tencent.mm.plugin.finder.profile.uic.k */
public final class C3535k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ DataBuffer<C0740i2> f16391d;

    /* renamed from: e */
    public final /* synthetic */ FinderProfileReplayLiveUIC f16392e;

    /* renamed from: f */
    public final /* synthetic */ long f16393f;

    public C3535k(DataBuffer<C0740i2> dataBuffer, FinderProfileReplayLiveUIC finderProfileReplayLiveUIC, long j) {
        this.f16391d = dataBuffer;
        this.f16392e = finderProfileReplayLiveUIC;
        this.f16393f = j;
    }

    public final void run() {
        FinderObject finderObject;
        String str;
        FinderObject finderObject2;
        C64273c21 c212;
        DataBuffer<C0740i2> dataBuffer = this.f16391d;
        long j = this.f16393f;
        Iterator<E> it = dataBuffer.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            finderObject = null;
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            C0740i2 i2Var = (C0740i2) it.next();
            C0782u0 u0Var = i2Var instanceof C0782u0 ? (C0782u0) i2Var : null;
            if ((u0Var == null || (finderObject2 = u0Var.f1833d) == null || (c212 = finderObject2.liveInfo) == null || c212.f182392d != j) ? false : true) {
                break;
            }
            i++;
        }
        if (i >= 0 && i < this.f16391d.size()) {
            z = true;
        }
        if (z) {
            C0740i2 remove = this.f16391d.remove(i);
            C87412m.m108593f(remove, "dataList.removeAt(deleteIndex)");
            C0740i2 i2Var2 = remove;
            RecyclerView.C16613e adapter = this.f16392e.mo3850d3().getAdapter();
            if (adapter != null) {
                adapter.notifyItemRemoved(i);
            }
            C63947a aVar = C63947a.f181274a;
            C0782u0 u0Var2 = i2Var2 instanceof C0782u0 ? (C0782u0) i2Var2 : null;
            if (u0Var2 != null) {
                finderObject = u0Var2.f1833d;
            }
            str = aVar.mo88735u(finderObject, i);
        } else {
            str = "fail,live:" + this.f16393f + ",pos:" + i;
        }
        Log.m105924i(this.f16392e.f16339o, "delete replay " + str);
    }
}
