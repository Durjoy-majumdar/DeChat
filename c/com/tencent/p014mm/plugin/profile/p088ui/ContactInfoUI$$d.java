package com.tencent.p014mm.plugin.profile.p088ui;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.listview.PullDownListView;
import com.tencent.p014mm.sdk.platformtools.Log;
import qy2.C63347a;
import qy2.C77451h;

/* renamed from: com.tencent.mm.plugin.profile.ui.ContactInfoUI$$d */
public class ContactInfoUI$$d implements View.OnLayoutChangeListener {

    /* renamed from: d */
    public final /* synthetic */ ContactInfoUI f202550d;

    public ContactInfoUI$$d(ContactInfoUI contactInfoUI) {
        this.f202550d = contactInfoUI;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C77451h hVar;
        int i9 = i4 - i2;
        Log.m105919d("MicroMsg.ContactInfoUI", "onLayoutChange: oldHeight:%s, newHeight:%s", Integer.valueOf(i8 - i6), Integer.valueOf(i9));
        ContactInfoUI contactInfoUI = this.f202550d;
        int i15 = ContactInfoUI.f202514P;
        contactInfoUI.mo96577H7(i9);
        int b = C63347a.m74684b(this.f202550d.getContext(), view);
        ContactInfoUI contactInfoUI2 = this.f202550d;
        if (contactInfoUI2.f202548z != b && (hVar = contactInfoUI2.f202517C) != null && contactInfoUI2.f202526L != null && contactInfoUI2.f202541s != null) {
            contactInfoUI2.f202548z = b;
            hVar.mo107624l(b);
            ContactInfoUI contactInfoUI3 = this.f202550d;
            int i16 = contactInfoUI3.f202548z;
            PullDownListView pullDownListView = contactInfoUI3.f202541s;
            int i17 = C63347a.m74683a(contactInfoUI3)[1];
            pullDownListView.f220648e = true;
            pullDownListView.f220669z = i16;
            pullDownListView.f220649f = false;
            pullDownListView.f220623A = i17;
            contactInfoUI3.f202541s.setTranslationListener(new C70252b0(contactInfoUI3, i16));
        }
    }
}
