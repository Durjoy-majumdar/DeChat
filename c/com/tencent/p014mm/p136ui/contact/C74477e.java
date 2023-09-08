package com.tencent.p014mm.p136ui.contact;

import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.p136ui.contact.AddressUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44655f;
import com.tencent.p014mm.storage.C72996z1;
import eo3.C75635b;

/* renamed from: com.tencent.mm.ui.contact.e */
public class C74477e implements AdapterView.OnItemLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ AddressUI.AddressUIFragment f219001d;

    public C74477e(AddressUI.AddressUIFragment addressUIFragment) {
        this.f219001d = addressUIFragment;
    }

    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        int i2 = i;
        Log.m105924i("MicroMsg.AddressUI", "onItemLongClick, targetview is SearchBar::ListView, pos = " + i);
        if (i2 < this.f219001d.f218434o.getHeaderViewsCount()) {
            Log.m105928w("MicroMsg.AddressUI", "on item long click, but match header view");
            return true;
        }
        AddressUI.AddressUIFragment addressUIFragment = this.f219001d;
        C75635b bVar = addressUIFragment.f218437r;
        if (bVar != null && bVar.f222213x) {
            return true;
        }
        C44655f fVar = (C44655f) addressUIFragment.f218436q.getItem(i2 - addressUIFragment.f218434o.getHeaderViewsCount());
        if (fVar == null) {
            Log.m105921e("MicroMsg.AddressUI", "cont is null. position:%d, header count:%d", Integer.valueOf(i), Integer.valueOf(this.f219001d.f218434o.getHeaderViewsCount()));
            return true;
        }
        String d = fVar.mo69642d();
        if (!C72996z1.m85841l5(d) && !C72996z1.m85833d5(d)) {
            AddressUI.AddressUIFragment addressUIFragment2 = this.f219001d;
            addressUIFragment2.f218440u = d;
            addressUIFragment2.f218418H.mo108272g(view, i, j, addressUIFragment2, addressUIFragment2.f218428S, addressUIFragment2.f218419I, addressUIFragment2.f218420J);
        }
        return true;
    }
}
