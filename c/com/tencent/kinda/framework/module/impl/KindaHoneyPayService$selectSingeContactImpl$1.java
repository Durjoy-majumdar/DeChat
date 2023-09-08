package com.tencent.kinda.framework.module.impl;

import android.content.Intent;
import com.tencent.kinda.gen.VoidStringCallback;
import com.tencent.p014mm.p136ui.MMActivity;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"", "requestCode", "resultCode", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "data", "Lrx3/b0;", "mmOnActivityResult", "(IILandroid/content/Intent;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
public final class KindaHoneyPayService$selectSingeContactImpl$1 implements MMActivity.C6739d {
    public final /* synthetic */ VoidStringCallback $resultCallback;

    public KindaHoneyPayService$selectSingeContactImpl$1(VoidStringCallback voidStringCallback) {
        this.$resultCallback = voidStringCallback;
    }

    public final void mmOnActivityResult(int i, int i2, Intent intent) {
        if (i == 101 && i2 == -1) {
            String stringExtra = intent.getStringExtra("Select_Conv_User");
            VoidStringCallback voidStringCallback = this.$resultCallback;
            if (voidStringCallback != null) {
                voidStringCallback.call(stringExtra);
            }
        }
    }
}
