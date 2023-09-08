package com.tencent.p014mm.plugin.finder.live;

import al1.C54127h;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FinderLiveUninterestedEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8478d0;
import java.util.ArrayList;
import java.util.Iterator;
import nj3.C76912y0;

/* renamed from: com.tencent.mm.plugin.finder.live.a */
public final class C55895a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ArrayList<C54127h> f159260d;

    /* renamed from: e */
    public final /* synthetic */ FinderLiveViewCallback f159261e;

    /* renamed from: f */
    public final /* synthetic */ C8478d0 f159262f;

    /* renamed from: g */
    public final /* synthetic */ FinderLiveUninterestedEvent f159263g;

    /* renamed from: h */
    public final /* synthetic */ long f159264h;

    public C55895a(ArrayList<C54127h> arrayList, FinderLiveViewCallback finderLiveViewCallback, C8478d0 d0Var, FinderLiveUninterestedEvent finderLiveUninterestedEvent, long j) {
        this.f159260d = arrayList;
        this.f159261e = finderLiveViewCallback;
        this.f159262f = d0Var;
        this.f159263g = finderLiveUninterestedEvent;
        this.f159264h = j;
    }

    public final void run() {
        ArrayList<C54127h> arrayList = this.f159260d;
        long j = this.f159264h;
        Iterator<C54127h> it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().f151977d.f157075s == j) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            FinderLiveViewCallback.m63697v(this.f159261e, i, this.f159260d);
        }
        Log.m105924i("Finder.FinderLiveViewCallback", "FinderLiveUninterestedEvent: newCurIndex=" + i + ", curIndex=" + this.f159262f.f27483d);
        if (this.f159263g.f9222d.f9224b) {
            MMActivity mMActivity = this.f159261e.f159212f;
            C76912y0.m92769h(mMActivity, mMActivity.getResources().getString(C0966R.string.fyg), C0966R.raw.icons_filled_done);
        }
    }
}
