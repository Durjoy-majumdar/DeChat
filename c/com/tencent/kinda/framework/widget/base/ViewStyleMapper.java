package com.tencent.kinda.framework.widget.base;

import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaWrap;
import com.tencent.kinda.gen.Align;
import com.tencent.kinda.gen.FlexDirection;
import com.tencent.kinda.gen.Justify;
import com.tencent.kinda.gen.PositionType;
import com.tencent.kinda.gen.Wrap;

public class ViewStyleMapper {

    /* renamed from: com.tencent.kinda.framework.widget.base.ViewStyleMapper$1 */
    public static /* synthetic */ class C170631 {
        public static final /* synthetic */ int[] $SwitchMap$com$tencent$kinda$gen$Align;
        public static final /* synthetic */ int[] $SwitchMap$com$tencent$kinda$gen$FlexDirection;
        public static final /* synthetic */ int[] $SwitchMap$com$tencent$kinda$gen$Justify;
        public static final /* synthetic */ int[] $SwitchMap$com$tencent$kinda$gen$PositionType;
        public static final /* synthetic */ int[] $SwitchMap$com$tencent$kinda$gen$Wrap;

        /* JADX WARNING: Can't wrap try/catch for region: R(47:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|31|32|(2:33|34)|35|37|38|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|(3:59|60|62)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(50:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|31|32|33|34|35|37|38|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|62) */
        /* JADX WARNING: Can't wrap try/catch for region: R(52:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|24|25|26|27|28|29|31|32|33|34|35|37|38|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|62) */
        /* JADX WARNING: Can't wrap try/catch for region: R(54:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|31|32|33|34|35|37|38|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|62) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x007e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0099 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00a3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00be */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00d2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00dc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00e6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00f1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00fc */
        static {
            /*
                com.tencent.kinda.gen.Justify[] r0 = com.tencent.kinda.gen.Justify.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$tencent$kinda$gen$Justify = r0
                r1 = 1
                com.tencent.kinda.gen.Justify r2 = com.tencent.kinda.gen.Justify.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$tencent$kinda$gen$Justify     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.kinda.gen.Justify r3 = com.tencent.kinda.gen.Justify.FLEXEND     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$com$tencent$kinda$gen$Justify     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.kinda.gen.Justify r4 = com.tencent.kinda.gen.Justify.FLEXSTART     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = $SwitchMap$com$tencent$kinda$gen$Justify     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.kinda.gen.Justify r5 = com.tencent.kinda.gen.Justify.SPACEAROUND     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = $SwitchMap$com$tencent$kinda$gen$Justify     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tencent.kinda.gen.Justify r6 = com.tencent.kinda.gen.Justify.SPACEBETWEEN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                com.tencent.kinda.gen.FlexDirection[] r5 = com.tencent.kinda.gen.FlexDirection.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                $SwitchMap$com$tencent$kinda$gen$FlexDirection = r5
                com.tencent.kinda.gen.FlexDirection r6 = com.tencent.kinda.gen.FlexDirection.COLUMN     // Catch:{ NoSuchFieldError -> 0x004f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r5 = $SwitchMap$com$tencent$kinda$gen$FlexDirection     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.tencent.kinda.gen.FlexDirection r6 = com.tencent.kinda.gen.FlexDirection.COLUMNREVERSE     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r5 = $SwitchMap$com$tencent$kinda$gen$FlexDirection     // Catch:{ NoSuchFieldError -> 0x0063 }
                com.tencent.kinda.gen.FlexDirection r6 = com.tencent.kinda.gen.FlexDirection.ROW     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r5[r6] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r5 = $SwitchMap$com$tencent$kinda$gen$FlexDirection     // Catch:{ NoSuchFieldError -> 0x006d }
                com.tencent.kinda.gen.FlexDirection r6 = com.tencent.kinda.gen.FlexDirection.ROWREVERSE     // Catch:{ NoSuchFieldError -> 0x006d }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r5[r6] = r3     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                com.tencent.kinda.gen.PositionType[] r5 = com.tencent.kinda.gen.PositionType.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                $SwitchMap$com$tencent$kinda$gen$PositionType = r5
                com.tencent.kinda.gen.PositionType r6 = com.tencent.kinda.gen.PositionType.ABSOLUTE     // Catch:{ NoSuchFieldError -> 0x007e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                int[] r5 = $SwitchMap$com$tencent$kinda$gen$PositionType     // Catch:{ NoSuchFieldError -> 0x0088 }
                com.tencent.kinda.gen.PositionType r6 = com.tencent.kinda.gen.PositionType.RELATIVE     // Catch:{ NoSuchFieldError -> 0x0088 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0088 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0088 }
            L_0x0088:
                com.tencent.kinda.gen.Wrap[] r5 = com.tencent.kinda.gen.Wrap.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                $SwitchMap$com$tencent$kinda$gen$Wrap = r5
                com.tencent.kinda.gen.Wrap r6 = com.tencent.kinda.gen.Wrap.NOWRAP     // Catch:{ NoSuchFieldError -> 0x0099 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0099 }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x0099 }
            L_0x0099:
                int[] r5 = $SwitchMap$com$tencent$kinda$gen$Wrap     // Catch:{ NoSuchFieldError -> 0x00a3 }
                com.tencent.kinda.gen.Wrap r6 = com.tencent.kinda.gen.Wrap.WRAP     // Catch:{ NoSuchFieldError -> 0x00a3 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a3 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x00a3 }
            L_0x00a3:
                int[] r5 = $SwitchMap$com$tencent$kinda$gen$Wrap     // Catch:{ NoSuchFieldError -> 0x00ad }
                com.tencent.kinda.gen.Wrap r6 = com.tencent.kinda.gen.Wrap.WRAPREVERSE     // Catch:{ NoSuchFieldError -> 0x00ad }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ad }
                r5[r6] = r2     // Catch:{ NoSuchFieldError -> 0x00ad }
            L_0x00ad:
                com.tencent.kinda.gen.Align[] r5 = com.tencent.kinda.gen.Align.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                $SwitchMap$com$tencent$kinda$gen$Align = r5
                com.tencent.kinda.gen.Align r6 = com.tencent.kinda.gen.Align.AUTO     // Catch:{ NoSuchFieldError -> 0x00be }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x00be }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x00be }
            L_0x00be:
                int[] r1 = $SwitchMap$com$tencent$kinda$gen$Align     // Catch:{ NoSuchFieldError -> 0x00c8 }
                com.tencent.kinda.gen.Align r5 = com.tencent.kinda.gen.Align.BASELINE     // Catch:{ NoSuchFieldError -> 0x00c8 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c8 }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x00c8 }
            L_0x00c8:
                int[] r0 = $SwitchMap$com$tencent$kinda$gen$Align     // Catch:{ NoSuchFieldError -> 0x00d2 }
                com.tencent.kinda.gen.Align r1 = com.tencent.kinda.gen.Align.CENTER     // Catch:{ NoSuchFieldError -> 0x00d2 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d2 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d2 }
            L_0x00d2:
                int[] r0 = $SwitchMap$com$tencent$kinda$gen$Align     // Catch:{ NoSuchFieldError -> 0x00dc }
                com.tencent.kinda.gen.Align r1 = com.tencent.kinda.gen.Align.FLEXEND     // Catch:{ NoSuchFieldError -> 0x00dc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dc }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00dc }
            L_0x00dc:
                int[] r0 = $SwitchMap$com$tencent$kinda$gen$Align     // Catch:{ NoSuchFieldError -> 0x00e6 }
                com.tencent.kinda.gen.Align r1 = com.tencent.kinda.gen.Align.FLEXSTART     // Catch:{ NoSuchFieldError -> 0x00e6 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e6 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x00e6 }
            L_0x00e6:
                int[] r0 = $SwitchMap$com$tencent$kinda$gen$Align     // Catch:{ NoSuchFieldError -> 0x00f1 }
                com.tencent.kinda.gen.Align r1 = com.tencent.kinda.gen.Align.SPACEAROUND     // Catch:{ NoSuchFieldError -> 0x00f1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f1 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f1 }
            L_0x00f1:
                int[] r0 = $SwitchMap$com$tencent$kinda$gen$Align     // Catch:{ NoSuchFieldError -> 0x00fc }
                com.tencent.kinda.gen.Align r1 = com.tencent.kinda.gen.Align.SPACEBETWEEN     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                int[] r0 = $SwitchMap$com$tencent$kinda$gen$Align     // Catch:{ NoSuchFieldError -> 0x0108 }
                com.tencent.kinda.gen.Align r1 = com.tencent.kinda.gen.Align.STRETCH     // Catch:{ NoSuchFieldError -> 0x0108 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0108 }
            L_0x0108:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.widget.base.ViewStyleMapper.C170631.<clinit>():void");
        }
    }

    public static YogaFlexDirection mapFlexDirection(FlexDirection flexDirection) {
        int i = C170631.$SwitchMap$com$tencent$kinda$gen$FlexDirection[flexDirection.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? YogaFlexDirection.COLUMN : YogaFlexDirection.ROW_REVERSE : YogaFlexDirection.ROW : YogaFlexDirection.COLUMN_REVERSE : YogaFlexDirection.COLUMN;
    }

    public static YogaJustify mapJustifyContent(Justify justify) {
        int i = C170631.$SwitchMap$com$tencent$kinda$gen$Justify[justify.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? YogaJustify.FLEX_START : YogaJustify.SPACE_BETWEEN : YogaJustify.SPACE_AROUND : YogaJustify.FLEX_START : YogaJustify.FLEX_END : YogaJustify.CENTER;
    }

    public static YogaPositionType mapPositionType(PositionType positionType) {
        int i = C170631.$SwitchMap$com$tencent$kinda$gen$PositionType[positionType.ordinal()];
        return i != 1 ? i != 2 ? YogaPositionType.RELATIVE : YogaPositionType.RELATIVE : YogaPositionType.ABSOLUTE;
    }

    public static YogaAlign mapYGAlign(Align align) {
        switch (C170631.$SwitchMap$com$tencent$kinda$gen$Align[align.ordinal()]) {
            case 1:
                return YogaAlign.AUTO;
            case 2:
                return YogaAlign.BASELINE;
            case 3:
                return YogaAlign.CENTER;
            case 4:
                return YogaAlign.FLEX_END;
            case 5:
                return YogaAlign.FLEX_START;
            case 6:
                return YogaAlign.SPACE_AROUND;
            case 7:
                return YogaAlign.SPACE_BETWEEN;
            case 8:
                return YogaAlign.STRETCH;
            default:
                return YogaAlign.STRETCH;
        }
    }

    public static YogaWrap mapYGWrap(Wrap wrap) {
        int i = C170631.$SwitchMap$com$tencent$kinda$gen$Wrap[wrap.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? YogaWrap.NO_WRAP : YogaWrap.WRAP_REVERSE : YogaWrap.WRAP : YogaWrap.NO_WRAP;
    }
}
