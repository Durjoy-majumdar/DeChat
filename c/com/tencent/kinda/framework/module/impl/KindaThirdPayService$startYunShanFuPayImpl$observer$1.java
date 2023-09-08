package com.tencent.kinda.framework.module.impl;

import android.app.Activity;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.VoidITransmitKvDataCallback;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, mo182094d2 = {"com/tencent/kinda/framework/module/impl/KindaThirdPayService$startYunShanFuPayImpl$observer$1", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onActivityResume", "onActivityDestroy", "", "firstResume", "Z", "getFirstResume", "()Z", "setFirstResume", "(Z)V", "kinda-framework-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public final class KindaThirdPayService$startYunShanFuPayImpl$observer$1 implements C0124r {
    public final /* synthetic */ VoidITransmitKvDataCallback $resultCallback;
    public final /* synthetic */ Activity $topActivity;
    private boolean firstResume = true;
    public final /* synthetic */ KindaThirdPayService this$0;

    public KindaThirdPayService$startYunShanFuPayImpl$observer$1(Activity activity, KindaThirdPayService kindaThirdPayService, VoidITransmitKvDataCallback voidITransmitKvDataCallback) {
        this.$topActivity = activity;
        this.this$0 = kindaThirdPayService;
        this.$resultCallback = voidITransmitKvDataCallback;
    }

    public final boolean getFirstResume() {
        return this.firstResume;
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public final void onActivityDestroy() {
        if (!this.this$0.hasCallbacked) {
            ITransmitKvData create = ITransmitKvData.create();
            create.putInt("ret", 2);
            create.putInt("ret_scene", 2);
            VoidITransmitKvDataCallback voidITransmitKvDataCallback = this.$resultCallback;
            if (voidITransmitKvDataCallback != null) {
                voidITransmitKvDataCallback.call(create);
            }
            this.this$0.hasCallbacked = true;
        }
        Activity activity = this.$topActivity;
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((MMActivity) activity).getLifecycle().removeObserver(this);
    }

    @C112974b0(C39623j.C39625b.ON_RESUME)
    public final void onActivityResume() {
        Log.m105924i("MicroMsg.KindaThirdPayService", "on resume " + this.firstResume);
        if (!this.$topActivity.isFinishing()) {
            if (this.firstResume) {
                this.firstResume = false;
                return;
            }
            if (!this.this$0.hasCallbacked) {
                ITransmitKvData create = ITransmitKvData.create();
                create.putInt("ret", 2);
                create.putInt("ret_scene", 1);
                VoidITransmitKvDataCallback voidITransmitKvDataCallback = this.$resultCallback;
                if (voidITransmitKvDataCallback != null) {
                    voidITransmitKvDataCallback.call(create);
                }
                this.this$0.hasCallbacked = true;
            }
            Activity activity = this.$topActivity;
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((MMActivity) activity).getLifecycle().removeObserver(this);
        }
    }

    public final void setFirstResume(boolean z) {
        this.firstResume = z;
    }
}
