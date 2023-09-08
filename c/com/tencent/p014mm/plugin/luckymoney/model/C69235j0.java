package com.tencent.p014mm.plugin.luckymoney.model;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.plugin.luckymoney.model.C69225h0;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.j0 */
public class C69235j0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C69225h0.C69227b f199211d;

    public C69235j0(C69225h0.C69227b bVar) {
        this.f199211d = bVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Context context = this.f199211d.f199191b;
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }
}
