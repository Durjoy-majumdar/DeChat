package com.tencent.kinda.framework.widget.tools;

import android.util.Pair;
import com.tencent.kinda.framework.widget.base.MMKView;
import com.tencent.kinda.gen.DynamicColor;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import h81.C32735h;
import java.util.ArrayList;
import java.util.Iterator;

public class ColorUtil {

    /* renamed from: com.tencent.kinda.framework.widget.tools.ColorUtil$1 */
    public static /* synthetic */ class C676351 {

        /* renamed from: $SwitchMap$com$tencent$kinda$framework$widget$tools$ColorUtil$MMViewType */
        public static final /* synthetic */ int[] f193406xdc1cdb08;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.tencent.kinda.framework.widget.tools.ColorUtil$MMViewType[] r0 = com.tencent.kinda.framework.widget.tools.ColorUtil.MMViewType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f193406xdc1cdb08 = r0
                com.tencent.kinda.framework.widget.tools.ColorUtil$MMViewType r1 = com.tencent.kinda.framework.widget.tools.ColorUtil.MMViewType.MMKButtonText     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f193406xdc1cdb08     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.kinda.framework.widget.tools.ColorUtil$MMViewType r1 = com.tencent.kinda.framework.widget.tools.ColorUtil.MMViewType.MMKRichLabelView     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f193406xdc1cdb08     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.kinda.framework.widget.tools.ColorUtil$MMViewType r1 = com.tencent.kinda.framework.widget.tools.ColorUtil.MMViewType.MMKLabelViewText     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.widget.tools.ColorUtil.C676351.<clinit>():void");
        }
    }

    public enum MMViewType {
        NONE,
        MMKButtonText,
        MMKEditText,
        MMKImageView,
        MMKLabelViewText,
        MMKRichLabelView
    }

    public static long MergeColors(long j, long j2) {
        long absColor = j < 0 ? absColor(j) : j;
        long absColor2 = j2 < 0 ? absColor(j2) : j2;
        long alpha = getAlpha(absColor);
        if (alpha == 0) {
            alpha = 255;
        }
        long red = getRed(absColor);
        long green = getGreen(absColor);
        long blue = getBlue(absColor);
        long alpha2 = getAlpha(absColor2);
        long j3 = blue;
        double d = (double) (((float) alpha2) / 255.0f);
        double d2 = 1.0d - d;
        return (((long) ((((double) getRed(absColor2)) * d) + (((double) red) * d2))) << 16) | (((long) (((double) alpha2) + (((double) alpha) * d2))) << 24) | (((long) ((((double) getGreen(absColor2)) * d) + (((double) green) * d2))) << 8) | ((long) ((((double) getBlue(absColor2)) * d) + (d2 * ((double) j3))));
    }

    public static long absColor(long j) {
        long j2 = 0;
        if (j >= 0) {
            return j;
        }
        long abs = Math.abs(j + 1);
        ArrayList arrayList = new ArrayList();
        while (abs > 16) {
            long j3 = abs >> 4;
            arrayList.add(Integer.valueOf((int) (abs - (j3 << 4))));
            abs = j3;
        }
        arrayList.add(Integer.valueOf((int) abs));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(15 - ((Integer) it.next()).intValue()));
        }
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            j2 = (j2 * 16) + ((long) ((Integer) arrayList2.get(size)).intValue());
        }
        return j2;
    }

    public static DynamicColor compatKindaDarkMode(DynamicColor dynamicColor, MMViewType mMViewType) {
        if (dynamicColor == null || dynamicColor.getNormalColor() == dynamicColor.getDarkmodeColor()) {
            return dynamicColor;
        }
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_kinda_dark_mode_sw, 1);
        if (Qe == 1) {
            int i = C676351.f193406xdc1cdb08[mMViewType.ordinal()];
            Pair<Boolean, Long> pair = i != 1 ? i != 2 ? i != 3 ? new Pair<>(Boolean.FALSE, 0L) : ColorCompatUtil.getDarkModeColorMMKLabelViewText(dynamicColor.getNormalColor()) : ColorCompatUtil.getDarkModeColorMMKRichLabelView(dynamicColor.getNormalColor()) : ColorCompatUtil.getDarkModeColorMMKButtonText(dynamicColor.getNormalColor());
            if (((Boolean) pair.first).booleanValue()) {
                dynamicColor.mDarkmodeColor = ((Long) pair.second).longValue();
            } else if (dynamicColor.getDarkmodeColor() == -1 || dynamicColor.getNormalColor() == dynamicColor.getDarkmodeColor()) {
                dynamicColor.mDarkmodeColor = ColorCompatUtil.getDarkModeColor(dynamicColor.getNormalColor(), dynamicColor.getDarkmodeColor());
            } else if (dynamicColor.getNormalColor() == -1 && dynamicColor.getDarkmodeColor() == 0) {
                dynamicColor.mDarkmodeColor = Long.parseLong("ffFFFFFF", 16);
            }
        }
        if (BuildInfo.DEBUG) {
            Log.m105925i(MMKView.TAG, "compatKindaDarkMode() swt:%s. (mNormalColor:%s mDarkmodeColor:%s)", Integer.valueOf(Qe), Long.toHexString(absColor(dynamicColor.mNormalColor)), Long.toHexString(absColor(dynamicColor.mDarkmodeColor)));
        }
        return dynamicColor;
    }

    private static boolean compatKindaDarkModeDefaultColorSw() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_kinda_dark_mode_default_color_sw, 1) == 1;
    }

    private static long getAlpha(long j) {
        return j >> 24;
    }

    private static long getBlue(long j) {
        return j - ((j >> 8) << 8);
    }

    public static long getColorByMode(String str) {
        DynamicColor dynamicColor = new DynamicColor();
        dynamicColor.mNormalColor = Long.parseLong(str, 16);
        dynamicColor.mDarkmodeColor = Long.parseLong(str, 16);
        return getColorByMode(dynamicColor);
    }

    public static long getColorByModeNoCompat(DynamicColor dynamicColor) {
        if (dynamicColor != null) {
            return C85875k4.m106211z() ? dynamicColor.getDarkmodeColor() : dynamicColor.getNormalColor();
        }
        if (!BuildInfo.DEBUG) {
            return 0;
        }
        Log.m105918d(MMKView.TAG, "getColorByModeNoCompat() dynamicColor == null");
        return 0;
    }

    private static long getGreen(long j) {
        return (j >> 8) - ((j >> 16) << 8);
    }

    private static long getRed(long j) {
        return (j >> 16) - ((j >> 24) << 8);
    }

    public static boolean ifCompatKindaDarkModeDefaultColor() {
        return C85875k4.m106211z() && compatKindaDarkModeDefaultColorSw();
    }

    public static long getColorByMode(DynamicColor dynamicColor, boolean z) {
        long colorByMode = getColorByMode(dynamicColor, MMViewType.NONE);
        return (!z || colorByMode != -1 || !C85875k4.m106211z()) ? colorByMode : (long) C85875k4.m106176d((int) dynamicColor.mNormalColor);
    }

    public static long getColorByMode(DynamicColor dynamicColor) {
        return getColorByMode(dynamicColor, true);
    }

    public static long getColorByMode(DynamicColor dynamicColor, MMViewType mMViewType) {
        if (dynamicColor != null) {
            if (BuildInfo.DEBUG) {
                Log.m105919d(MMKView.TAG, "getColorByMode(mNormalColor:%s mDarkmodeColor:%s) %s", Long.toHexString(absColor(dynamicColor.mNormalColor)), Long.toHexString(absColor(dynamicColor.mDarkmodeColor)), Util.getStack());
            }
            if (C85875k4.m106211z()) {
                return compatKindaDarkMode(dynamicColor, mMViewType).getDarkmodeColor();
            }
            return dynamicColor.mNormalColor;
        } else if (!BuildInfo.DEBUG) {
            return 0;
        } else {
            Log.m105918d(MMKView.TAG, "getColorByMode() dynamicColor == null");
            return 0;
        }
    }
}
