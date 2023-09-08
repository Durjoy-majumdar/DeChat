package ru2;

import android.util.Size;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import te3.C101804kv2;
import te3.C101817mv2;

/* renamed from: ru2.a */
public final class C101465a {

    /* renamed from: a */
    public static final C101465a f297160a = new C101465a();

    /* renamed from: b */
    public static final int f297161b = BackwardSupportUtil.BitmapFactory.fromDPToPix(MMApplicationContext.getContext(), 200.0f);

    /* renamed from: c */
    public static final int f297162c = BackwardSupportUtil.BitmapFactory.fromDPToPix(MMApplicationContext.getContext(), 44.0f);

    /* renamed from: a */
    public final Size mo140964a(C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("calculateSinglePhotoSize", "com.tencent.mm.plugin.sns.ui.item.improve.calculate.TimelineSizeCalculator");
        C87412m.m108594g(kv22, "media");
        C101817mv2 mv22 = kv22.f298698p;
        float f = mv22.f298875d;
        float f2 = mv22.f298876e;
        int i = f297161b;
        float f3 = ((float) i) / f;
        float f4 = ((float) i) / f2;
        if (f3 > f4) {
            f3 = f4;
        }
        float f5 = f * f3;
        float f6 = f2 * f3;
        int i2 = f297162c;
        if (f5 < ((float) i2)) {
            float f7 = (((float) i2) * 1.0f) / f5;
            f5 *= f7;
            f6 *= f7;
        }
        if (f6 < ((float) i2)) {
            float f8 = (((float) i2) * 1.0f) / f6;
            f5 *= f8;
            f6 *= f8;
        }
        if (f5 > ((float) i)) {
            f5 = (float) i;
        }
        if (f6 > ((float) i)) {
            f6 = (float) i;
        }
        Size size = new Size((int) f5, (int) f6);
        SnsMethodCalculate.markEndTimeMs("calculateSinglePhotoSize", "com.tencent.mm.plugin.sns.ui.item.improve.calculate.TimelineSizeCalculator");
        return size;
    }
}
