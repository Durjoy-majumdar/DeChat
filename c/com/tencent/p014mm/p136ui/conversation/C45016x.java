package com.tencent.p014mm.p136ui.conversation;

import android.graphics.Point;
import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.p136ui.conversation.C44947a1;
import com.tencent.p014mm.p136ui.conversation.EnterpriseConversationUI;
import ml3.C47079n;

/* renamed from: com.tencent.mm.ui.conversation.x */
public class C45016x implements AdapterView.OnItemLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ Point f122110d;

    /* renamed from: e */
    public final /* synthetic */ EnterpriseConversationUI.EnterpriseConversationFmUI f122111e;

    public C45016x(EnterpriseConversationUI.EnterpriseConversationFmUI enterpriseConversationFmUI, Point point) {
        this.f122111e = enterpriseConversationFmUI;
        this.f122110d = point;
    }

    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        C44947a1.C44951d s = this.f122111e.f121791i.getItem(i);
        C47079n K = EnterpriseConversationUI.EnterpriseConversationFmUI.m49786K(this.f122111e, s);
        if (K == null) {
            return false;
        }
        return K.mo72211a(view, this.f122110d, i, j, s);
    }
}
