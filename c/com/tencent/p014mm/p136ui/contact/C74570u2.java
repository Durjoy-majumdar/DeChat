package com.tencent.p014mm.p136ui.contact;

import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.p136ui.contact.OpenIMAddressUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44655f;
import com.tencent.p014mm.storage.C72996z1;
import eo3.C75635b;

/* renamed from: com.tencent.mm.ui.contact.u2 */
public class C74570u2 implements AdapterView.OnItemLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ OpenIMAddressUI.OpenIMAddressUIFragment f219201d;

    public C74570u2(OpenIMAddressUI.OpenIMAddressUIFragment openIMAddressUIFragment) {
        this.f219201d = openIMAddressUIFragment;
    }

    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        int i2 = i;
        Log.m105924i("MicroMsg.OpenIMAddressUI", "onItemLongClick, targetview is SearchBar::ListView, pos = " + i);
        if (i2 < this.f219201d.f218695e.getHeaderViewsCount()) {
            Log.m105928w("MicroMsg.OpenIMAddressUI", "on item long click, but match header view");
            return true;
        }
        OpenIMAddressUI.OpenIMAddressUIFragment openIMAddressUIFragment = this.f219201d;
        C75635b bVar = openIMAddressUIFragment.f218697g;
        if (bVar != null && bVar.f222213x) {
            return true;
        }
        C44655f fVar = (C44655f) openIMAddressUIFragment.f218696f.getItem(i2 - openIMAddressUIFragment.f218695e.getHeaderViewsCount());
        if (fVar == null) {
            Log.m105921e("MicroMsg.OpenIMAddressUI", "cont is null. position:%d, header count:%d", Integer.valueOf(i), Integer.valueOf(this.f219201d.f218695e.getHeaderViewsCount()));
            return true;
        }
        String d = fVar.mo69642d();
        if (!C72996z1.m85841l5(d) && !C72996z1.m85833d5(d)) {
            OpenIMAddressUI.OpenIMAddressUIFragment openIMAddressUIFragment2 = this.f219201d;
            openIMAddressUIFragment2.f218698h = d;
            openIMAddressUIFragment2.f218699i.mo108272g(view, i, j, openIMAddressUIFragment2, openIMAddressUIFragment2.f218705r, openIMAddressUIFragment2.f218700j, openIMAddressUIFragment2.f218701n);
        }
        return true;
    }
}
