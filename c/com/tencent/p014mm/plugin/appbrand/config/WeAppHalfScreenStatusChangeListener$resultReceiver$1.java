package com.tencent.p014mm.plugin.appbrand.config;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/config/WeAppHalfScreenStatusChangeListener$resultReceiver$1", "Landroid/os/ResultReceiver;", "data-model_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener$resultReceiver$1 */
public final class WeAppHalfScreenStatusChangeListener$resultReceiver$1 extends ResultReceiver {

    /* renamed from: d */
    public final /* synthetic */ WeAppHalfScreenStatusChangeListener f239429d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WeAppHalfScreenStatusChangeListener$resultReceiver$1(WeAppHalfScreenStatusChangeListener weAppHalfScreenStatusChangeListener, Handler handler) {
        super(handler);
        this.f239429d = weAppHalfScreenStatusChangeListener;
    }

    public void onReceiveResult(int i, Bundle bundle) {
        HeightInfo heightInfo;
        if (bundle != null) {
            bundle.setClassLoader(HeightInfo.CREATOR.getClass().getClassLoader());
        }
        int i2 = -1;
        int i3 = bundle != null ? bundle.getInt("action", -1) : -1;
        if (i3 == 0) {
            if (bundle != null) {
                i2 = bundle.getInt("status", -1);
            }
            if (i2 == 0) {
                this.f239429d.mo77351c();
            } else if (i2 == 1) {
                this.f239429d.mo77350b();
            }
        } else if (i3 != 1) {
            boolean z = false;
            if (i3 == 2) {
                WeAppHalfScreenStatusChangeListener weAppHalfScreenStatusChangeListener = this.f239429d;
                if (bundle != null) {
                    z = bundle.getBoolean("isAnimationBegin", false);
                }
                weAppHalfScreenStatusChangeListener.mo77353e(z);
            } else if (i3 == 3) {
                WeAppHalfScreenStatusChangeListener weAppHalfScreenStatusChangeListener2 = this.f239429d;
                if (bundle != null) {
                    z = bundle.getBoolean("isAnimationBegin", false);
                }
                weAppHalfScreenStatusChangeListener2.mo77352d(z);
            }
        } else if (bundle != null && (heightInfo = (HeightInfo) bundle.getParcelable("height_info")) != null) {
            this.f239429d.mo77354f(heightInfo);
        }
    }
}
