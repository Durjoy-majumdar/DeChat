package com.tencent.p014mm.plugin.finder.view;

import ak1.C54067f0;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import di3.C86312j;
import er1.C58684b;
import ht1.C8777j5;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo182094d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "Lrx3/b0;", "onClick", "(Landroid/content/DialogInterface;I)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$Companion$showCreateFinderUserDialog$1 */
public final class C3922x2cc06e03 implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Intent $intent;
    public final /* synthetic */ int $scene;

    public C3922x2cc06e03(Intent intent, int i, Context context) {
        this.$intent = intent;
        this.$scene = i;
        this.$context = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = this.$intent;
        if (intent == null) {
            intent = new Intent();
        }
        intent.putExtra("key_create_scene", this.$scene);
        ((C58684b) C86312j.m106911c(C58684b.class)).mo13297zc(this.$context, intent);
        ((C8777j5) C86312j.m106911c(C8777j5.class)).mo9609ap(C54067f0.C0054e0.CLICK_START_LIVE);
    }
}
