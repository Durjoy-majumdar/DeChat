package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.content.DialogInterface;
import com.tencent.p014mm.autogen.events.DeleteFavoriteEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.c1 */
public class C94165c1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C94163b1 f272009d;

    public C94165c1(C94163b1 b1Var) {
        this.f272009d = b1Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        long longExtra = this.f272009d.mo129361n().getLongExtra("kFavInfoLocalId", -1);
        DeleteFavoriteEvent deleteFavoriteEvent = new DeleteFavoriteEvent();
        DeleteFavoriteEvent.C92471a aVar = deleteFavoriteEvent.f264667d;
        aVar.f264669a = longExtra;
        aVar.f264670b = 9;
        deleteFavoriteEvent.publish();
        boolean nullAs = Util.nullAs(Boolean.valueOf(deleteFavoriteEvent.f264668e.f264671a), false);
        Log.m105919d("MicroMsg.ViewMapUI", "do del fav voice, local id %d, result %B", Long.valueOf(longExtra), Boolean.valueOf(nullAs));
        if (nullAs) {
            this.f272009d.f271948d.finish();
        }
    }
}
