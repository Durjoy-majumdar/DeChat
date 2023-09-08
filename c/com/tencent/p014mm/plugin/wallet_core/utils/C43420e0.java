package com.tencent.p014mm.plugin.wallet_core.utils;

import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.wallet_core.utils.C43423i0;
import di0.C86300q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import te3.C48661a33;
import te3.C50456mv3;
import te3.vf4;
import te3.zf4;

/* renamed from: com.tencent.mm.plugin.wallet_core.utils.e0 */
public class C43420e0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ C48661a33 f117382d;

    /* renamed from: e */
    public final /* synthetic */ C43423i0.C43428e f117383e;

    /* renamed from: f */
    public final /* synthetic */ MMActivity f117384f;

    public C43420e0(C48661a33 a332, C43423i0.C43428e eVar, MMActivity mMActivity) {
        this.f117382d = a332;
        this.f117383e = eVar;
        this.f117384f = mMActivity;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        LinkedList<vf4> linkedList;
        zf4 zf4 = this.f117382d.f130278e;
        ArrayList arrayList = new ArrayList();
        if (!(zf4 == null || (linkedList = zf4.f145863d) == null || linkedList.isEmpty())) {
            Iterator<vf4> it = zf4.f145863d.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f143465h);
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            C50456mv3 mv32 = (C50456mv3) it4.next();
            C43423i0.C43428e eVar = this.f117383e;
            if (eVar != null) {
                if (!eVar.mo66652b(mv32, menuItem)) {
                    C43423i0.m46932c(this.f117384f, mv32, (Bundle) null, (C86300q) null, (C43423i0.C43429f) null);
                    this.f117383e.mo66651a(mv32, menuItem);
                }
            }
            C43423i0.m46932c(this.f117384f, mv32, (Bundle) null, (C86300q) null, (C43423i0.C43429f) null);
        }
        return false;
    }
}
