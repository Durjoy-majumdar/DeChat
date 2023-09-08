package com.tencent.p014mm.plugin.mall.p075ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import c63.C67345b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.util.Iterator;
import kg3.C76577a;
import s52.C36626n;
import te3.C64891zq1;

/* renamed from: com.tencent.mm.plugin.mall.ui.b */
public class C69770b {

    /* renamed from: a */
    public static final int f201320a = C76577a.m92151b(MMApplicationContext.getContext(), 8);

    /* renamed from: b */
    public static final int f201321b = C76577a.m92151b(MMApplicationContext.getContext(), 140);

    /* renamed from: c */
    public static int f201322c = C76577a.m92151b(MMApplicationContext.getContext(), 39);

    /* renamed from: d */
    public static int f201323d = 0;

    /* renamed from: e */
    public static int f201324e = 0;

    /* renamed from: f */
    public static int f201325f = 0;

    /* renamed from: g */
    public static int f201326g = 38;

    /* renamed from: h */
    public static float f201327h = 1.0f;

    static {
        C76577a.m92151b(MMApplicationContext.getContext(), 85);
    }

    /* renamed from: a */
    public static void m82206a(MMActivity mMActivity, boolean z) {
        int i;
        Point h = C85875k4.m106184h(mMActivity);
        int i2 = h.x;
        int i3 = h.y;
        int j = C85875k4.m106190k(mMActivity) ? i3 - C85875k4.m106188j(mMActivity) : i3;
        if (mMActivity.getSupportActionBar() != null) {
            i = mMActivity.getSupportActionBar().mo91101l();
            if (i <= 0) {
                i = mMActivity.getResources().getDimensionPixelSize(C0966R.dimen.f3679b9);
            }
        } else {
            i = 0;
        }
        int o = (j - i) - C85875k4.m106198o(mMActivity);
        int i4 = ((double) (i3 / i2)) * 1.0d > 2.0d ? (o - (f201320a * 3)) / 20 : (o - (f201320a * 3)) / 17;
        f201325f = Math.max(i4 * 4, f201321b);
        f201322c = (int) (((double) i4) * 1.5d);
        Log.m105925i("MicroMsg.FunctionGridSizeCalculator", "baseA: %s, top height: %s", Integer.valueOf(i4), Integer.valueOf(f201325f));
        f201324e = (i2 - (f201320a * 2)) / 3;
        C86709a0.m107528h();
        Iterator<MallFunction> it = C36626n.vx0().wx0(((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC, (Object) null)).intValue()).iterator();
        int i5 = 0;
        while (it.hasNext()) {
            MallFunction next = it.next();
            if (next != null) {
                TextPaint textPaint = new TextPaint(1);
                float p = C76577a.m92165p(MMApplicationContext.getContext());
                f201327h = p;
                if (C85875k4.m106153J(p, C76577a.m92169t(MMApplicationContext.getContext())) || C85875k4.m106153J(f201327h, C76577a.m92170u(MMApplicationContext.getContext()))) {
                    f201327h = C76577a.m92168s(MMApplicationContext.getContext());
                }
                textPaint.setTextSize(((float) C76577a.m92151b(MMApplicationContext.getContext(), 14)) * f201327h);
                int height = new StaticLayout(next.f209732e, textPaint, f201324e - C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3736cp), Layout.Alignment.ALIGN_NORMAL, 1.0f, (float) C76577a.m92151b(MMApplicationContext.getContext(), 0), true).getHeight();
                if (i5 < height) {
                    i5 = height;
                }
            }
        }
        Log.m105925i("MicroMsg.FunctionGridSizeCalculator", "maxTextHeight: %s", Integer.valueOf(i5));
        int b = C76577a.m92151b(MMApplicationContext.getContext(), 24) + C76577a.m92151b(MMApplicationContext.getContext(), 35) + C76577a.m92151b(MMApplicationContext.getContext(), 5) + i5 + C76577a.m92151b(MMApplicationContext.getContext(), 12);
        f201323d = b;
        int i6 = f201324e;
        if (b < i6) {
            Log.m105925i("MicroMsg.FunctionGridSizeCalculator", "GRID_HEIGHT_SIZE_PX < GRID_Width_SIZE_PX,use GRID_Width_SIZE_PX: %s", Integer.valueOf(i6));
            f201323d = f201324e;
        }
        Log.m105925i("MicroMsg.FunctionGridSizeCalculator", "GRID_GAP_SIZE_PX: %s，GRID_Width_SIZE_PX:%s,MAX_GRID_HEIGHT ：%s", Integer.valueOf(f201322c), Integer.valueOf(f201324e), Integer.valueOf(f201323d));
    }

    /* renamed from: b */
    public static void m82207b(MMActivity mMActivity, boolean z, boolean z2) {
        if (z2) {
            m82206a(mMActivity, z);
            return;
        }
        m82206a(mMActivity, z);
        if (z) {
            f201325f = f201325f + C76577a.m92151b(mMActivity, f201326g) + f201320a;
        }
        Log.m105925i("MicroMsg.FunctionGridSizeCalculator", "calcGridSize, GRID_HEIGHT_SIZE_PX: %s, TOP_FUNC_LINE_GRID_SIZE_PX: %s", Integer.valueOf(f201323d), Integer.valueOf(f201325f));
    }

    /* renamed from: c */
    public static void m82208c(MMActivity mMActivity) {
        Rect rect = new Rect();
        mMActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int i = rect.right - rect.left;
        int i2 = f201320a;
        int i3 = i2 * 11;
        int i4 = (i - (i3 * 4)) / 5;
        Log.m105925i("MicroMsg.FunctionGridSizeCalculator", "screenWidth，：%s , defaultGapWidth: %s", Integer.valueOf(i), Integer.valueOf(i3));
        Log.m105925i("MicroMsg.FunctionGridSizeCalculator", "baseA：%s , tempGridGapSize: %s", Integer.valueOf(i2), Integer.valueOf(i4));
        if (i4 >= i2) {
            f201322c = i4;
            f201324e = i3;
        } else {
            f201322c = i2;
            f201324e = (i - (i2 * 5)) / 4;
        }
        C86709a0.m107528h();
        Iterator<C64891zq1> it = C67345b.m79688b(((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC, (Object) null)).intValue()).iterator();
        int i5 = 0;
        while (it.hasNext()) {
            C64891zq1 next = it.next();
            if (next != null) {
                TextPaint textPaint = new TextPaint(1);
                float p = C76577a.m92165p(MMApplicationContext.getContext());
                f201327h = p;
                if (C85875k4.m106153J(p, C76577a.m92169t(MMApplicationContext.getContext())) || C85875k4.m106153J(f201327h, C76577a.m92170u(MMApplicationContext.getContext()))) {
                    f201327h = C76577a.m92168s(MMApplicationContext.getContext());
                }
                textPaint.setTextSize(((float) C76577a.m92151b(MMApplicationContext.getContext(), 14)) * f201327h);
                int height = new StaticLayout(next.f186829d.f184924e, textPaint, f201324e, Layout.Alignment.ALIGN_NORMAL, 1.0f, (float) C76577a.m92151b(MMApplicationContext.getContext(), 6), true).getHeight();
                if (!Util.isNullOrNil(next.f186835j)) {
                    textPaint.setTextSize(((float) C76577a.m92151b(MMApplicationContext.getContext(), 10)) * f201327h);
                    height = height + new StaticLayout(next.f186835j, textPaint, f201324e, Layout.Alignment.ALIGN_NORMAL, 1.0f, (float) C76577a.m92151b(MMApplicationContext.getContext(), 6), true).getHeight() + C76577a.m92151b(MMApplicationContext.getContext(), 1);
                }
                int i6 = height;
                if (i5 < i6) {
                    i5 = i6;
                }
            }
        }
        Log.m105925i("MicroMsg.FunctionGridSizeCalculator", "maxTextHeight: %s", Integer.valueOf(i5));
        int b = C76577a.m92151b(MMApplicationContext.getContext(), 12);
        int b2 = C76577a.m92151b(MMApplicationContext.getContext(), 32) + b + C76577a.m92151b(MMApplicationContext.getContext(), 10) + i5 + b;
        f201323d = b2;
        int i7 = f201324e;
        if (b2 < i7) {
            Log.m105925i("MicroMsg.FunctionGridSizeCalculator", "GRID_HEIGHT_SIZE_PX < GRID_Width_SIZE_PX,use GRID_Width_SIZE_PX: %s", Integer.valueOf(i7));
            f201323d = f201324e;
        }
        Log.m105925i("MicroMsg.FunctionGridSizeCalculator", "GRID_GAP_SIZE_PX: %s，GRID_Width_SIZE_PX:%s,MAX_GRID_HEIGHT ：%s", Integer.valueOf(f201322c), Integer.valueOf(f201324e), Integer.valueOf(f201323d));
    }
}
