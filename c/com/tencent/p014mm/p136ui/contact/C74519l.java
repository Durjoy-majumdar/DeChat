package com.tencent.p014mm.p136ui.contact;

import android.view.View;
import com.tencent.p014mm.p136ui.base.MMSlideDelView;
import com.tencent.p014mm.p136ui.contact.AddressUI;

/* renamed from: com.tencent.mm.ui.contact.l */
public class C74519l implements MMSlideDelView.C73185e {

    /* renamed from: a */
    public final /* synthetic */ AddressUI.AddressUIFragment f219087a;

    public C74519l(AddressUI.AddressUIFragment addressUIFragment) {
        this.f219087a = addressUIFragment;
    }

    /* renamed from: a */
    public int mo96224a(View view) {
        View view2 = view;
        while (true) {
            try {
                View view3 = (View) view2.getParent();
                if (view3 != null && !view3.equals(this.f219087a.f218434o)) {
                    view2 = view3;
                }
            } catch (ClassCastException unused) {
                return -1;
            }
        }
        if (view2.getParent() == null) {
            return -1;
        }
        return this.f219087a.f218434o.getPositionForView(view);
    }
}
