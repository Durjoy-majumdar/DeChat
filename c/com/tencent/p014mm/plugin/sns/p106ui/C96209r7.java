package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;

/* renamed from: com.tencent.mm.plugin.sns.ui.r7 */
public class C96209r7 implements Runnable {

    /* renamed from: d */
    public int f281144d;

    /* renamed from: e */
    public int f281145e;

    /* renamed from: f */
    public int f281146f;

    /* renamed from: g */
    public int f281147g;

    /* renamed from: h */
    public WeakReference<WrapScollview> f281148h;

    /* renamed from: i */
    public boolean f281149i;

    public C96209r7(int i, int i2, int i3, WrapScollview wrapScollview) {
        this.f281144d = i;
        this.f281146f = i2;
        this.f281147g = i3;
        this.f281148h = new WeakReference<>(wrapScollview);
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUIManualScrollCursorTask");
        if (this.f281149i) {
            Log.m105924i("MicroMsg.SnsUploadUI.ManualScrollCursorTask", "had run, skip");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUIManualScrollCursorTask");
            return;
        }
        WrapScollview wrapScollview = null;
        WeakReference<WrapScollview> weakReference = this.f281148h;
        if (!(weakReference == null || weakReference.get() == null)) {
            wrapScollview = this.f281148h.get();
        }
        if (wrapScollview == null) {
            Log.m105924i("MicroMsg.SnsUploadUI.ManualScrollCursorTask", "scrollview null, skip");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUIManualScrollCursorTask");
            return;
        }
        this.f281149i = true;
        int i = this.f281145e - this.f281147g;
        int i2 = this.f281146f;
        int i3 = this.f281144d;
        int i4 = i3 > i ? i3 - i : i3 <= i2 ? i3 - i2 : 0;
        Log.m105925i("MicroMsg.SnsUploadUI.ManualScrollCursorTask", "run: need scrollDelta:%d, cursorRawY:%d, unableShowTopY:%d, unableShowBottomY:%d, footerBarTopRawY:%d", Integer.valueOf(i4), Integer.valueOf(this.f281144d), Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.f281145e));
        wrapScollview.setScrollDeltaOnFocusLocationChange(i4);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUIManualScrollCursorTask");
    }
}
