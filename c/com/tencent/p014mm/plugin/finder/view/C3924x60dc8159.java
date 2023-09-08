package com.tencent.p014mm.plugin.finder.view;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import di3.C86312j;
import er1.C58684b;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo182094d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "dialog", "", "which", "Lrx3/b0;", "onClick", "(Landroid/content/DialogInterface;I)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$Companion$showCreateFinderUserDialogOnLiveWithCallback$1 */
public final class C3924x60dc8159 implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity $context;
    public final /* synthetic */ Intent $intent;
    public final /* synthetic */ DialogInterface.OnClickListener $lok;
    public final /* synthetic */ int $requestCode;
    public final /* synthetic */ int $scene;

    public C3924x60dc8159(Intent intent, int i, Activity activity, int i2, DialogInterface.OnClickListener onClickListener) {
        this.$intent = intent;
        this.$scene = i;
        this.$context = activity;
        this.$requestCode = i2;
        this.$lok = onClickListener;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = this.$intent;
        if (intent == null) {
            intent = new Intent();
        }
        intent.putExtra("key_create_scene", this.$scene);
        ((C58684b) C86312j.m106911c(C58684b.class)).b30(this.$context, intent, this.$requestCode);
        DialogInterface.OnClickListener onClickListener = this.$lok;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i);
        }
    }
}
