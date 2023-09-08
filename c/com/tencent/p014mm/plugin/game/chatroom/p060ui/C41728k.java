package com.tencent.p014mm.plugin.game.chatroom.p060ui;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import gy3.C87412m;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.game.chatroom.ui.k */
public final class C41728k<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C41730m f112308d;

    public C41728k(C41730m mVar) {
        this.f112308d = mVar;
    }

    public void onChanged(Object obj) {
        List list = (List) obj;
        C41730m mVar = this.f112308d;
        C87412m.m108593f(list, LocaleUtil.ITALIAN);
        mVar.mo65447t3(list);
    }
}
