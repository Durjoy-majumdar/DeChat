package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74059i7;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import uk3.C78222a;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.i7$a$$h */
public class i7$a$$h implements MMNeat7extView.C74954d {

    /* renamed from: a */
    public final /* synthetic */ C74059i7.C74068g f217358a;

    public i7$a$$h(C74059i7.C74060a aVar, C74059i7.C74068g gVar) {
        this.f217358a = gVar;
    }

    /* renamed from: a */
    public void mo103126a(CharSequence charSequence, TextView.BufferType bufferType) {
        if (((Boolean) this.f217358a.f217322b.getTag(C0966R.C0970id.f357681b72)).booleanValue()) {
            C78222a.m94508a().getClass();
            C78222a.C78223a.TEXT_CALLBACK.mo108242a(charSequence, bufferType, ((Long) this.f217358a.f217322b.getTag(C0966R.C0970id.f357682b73)).longValue());
        }
    }
}
