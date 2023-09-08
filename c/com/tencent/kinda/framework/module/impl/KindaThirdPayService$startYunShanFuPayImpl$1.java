package com.tencent.kinda.framework.module.impl;

import android.app.Activity;
import com.tencent.kinda.gen.VoidITransmitKvDataCallback;
import com.tencent.p014mm.p136ui.MMActivity;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"", "requestCode", "resultCode", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "data", "Lrx3/b0;", "mmOnActivityResult", "(IILandroid/content/Intent;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
public final class KindaThirdPayService$startYunShanFuPayImpl$1 implements MMActivity.C6739d {
    public final /* synthetic */ KindaThirdPayService$startYunShanFuPayImpl$observer$1 $observer;
    public final /* synthetic */ VoidITransmitKvDataCallback $resultCallback;
    public final /* synthetic */ Activity $topActivity;
    public final /* synthetic */ KindaThirdPayService this$0;

    public KindaThirdPayService$startYunShanFuPayImpl$1(Activity activity, KindaThirdPayService$startYunShanFuPayImpl$observer$1 kindaThirdPayService$startYunShanFuPayImpl$observer$1, KindaThirdPayService kindaThirdPayService, VoidITransmitKvDataCallback voidITransmitKvDataCallback) {
        this.$topActivity = activity;
        this.$observer = kindaThirdPayService$startYunShanFuPayImpl$observer$1;
        this.this$0 = kindaThirdPayService;
        this.$resultCallback = voidITransmitKvDataCallback;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mmOnActivityResult(int r7, int r8, android.content.Intent r9) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onActivityResult: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = ", "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "MicroMsg.KindaThirdPayService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r8)
            r8 = 10
            if (r7 != r8) goto L_0x00cb
            android.app.Activity r7 = r6.$topActivity
            com.tencent.mm.ui.MMActivity r7 = (com.tencent.p014mm.p136ui.MMActivity) r7
            r8 = 0
            r7.mmSetOnActivityResultCallback(r8)
            android.app.Activity r7 = r6.$topActivity
            com.tencent.mm.ui.MMActivity r7 = (com.tencent.p014mm.p136ui.MMActivity) r7
            androidx.lifecycle.j r7 = r7.getLifecycle()
            com.tencent.kinda.framework.module.impl.KindaThirdPayService$startYunShanFuPayImpl$observer$1 r1 = r6.$observer
            r7.removeObserver(r1)
            com.tencent.kinda.gen.ITransmitKvData r7 = com.tencent.kinda.gen.ITransmitKvData.create()
            java.lang.String r1 = "ret_scene"
            r2 = 0
            r7.putInt(r1, r2)
            com.tencent.kinda.framework.module.impl.KindaThirdPayService r1 = r6.this$0
            r3 = 1
            r1.hasCallbacked = r3
            r1 = 2
            java.lang.String r4 = "ret"
            if (r9 != 0) goto L_0x0057
            r7.putInt(r4, r1)
            com.tencent.kinda.gen.VoidITransmitKvDataCallback r8 = r6.$resultCallback
            if (r8 == 0) goto L_0x0056
            r8.call(r7)
        L_0x0056:
            return
        L_0x0057:
            android.os.Bundle r9 = r9.getExtras()
            gy3.C87412m.m108591d(r9)
            java.lang.String r5 = "pay_result"
            java.lang.String r9 = r9.getString(r5)
            if (r9 == 0) goto L_0x0070
            java.lang.String r8 = r9.toLowerCase()
            java.lang.String r9 = "this as java.lang.String).toLowerCase()"
            gy3.C87412m.m108593f(r8, r9)
        L_0x0070:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r5 = "pay result: "
            r9.append(r5)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r9)
            if (r8 == 0) goto L_0x00c1
            int r9 = r8.hashCode()
            r0 = -1867169789(0xffffffff90b54003, float:-7.149054E-29)
            if (r9 == r0) goto L_0x00b4
            r0 = -1367724422(0xffffffffae7a2e7a, float:-5.68847E-11)
            if (r9 == r0) goto L_0x00a7
            r0 = 3135262(0x2fd71e, float:4.393438E-39)
            if (r9 == r0) goto L_0x009a
            goto L_0x00c1
        L_0x009a:
            java.lang.String r9 = "fail"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x00a3
            goto L_0x00c1
        L_0x00a3:
            r7.putInt(r4, r3)
            goto L_0x00c4
        L_0x00a7:
            java.lang.String r9 = "cancel"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x00b0
            goto L_0x00c1
        L_0x00b0:
            r7.putInt(r4, r1)
            goto L_0x00c4
        L_0x00b4:
            java.lang.String r9 = "success"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x00c1
            r7.putInt(r4, r2)
            goto L_0x00c4
        L_0x00c1:
            r7.putInt(r4, r1)
        L_0x00c4:
            com.tencent.kinda.gen.VoidITransmitKvDataCallback r8 = r6.$resultCallback
            if (r8 == 0) goto L_0x00cb
            r8.call(r7)
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.module.impl.KindaThirdPayService$startYunShanFuPayImpl$1.mmOnActivityResult(int, int, android.content.Intent):void");
    }
}
