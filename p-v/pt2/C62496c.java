package pt2;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kg3.C76577a;

/* renamed from: pt2.c */
public final class C62496c {

    /* renamed from: a */
    public static final C62496c f177535a = new C62496c();

    /* renamed from: a */
    public static int m73459a(C62496c cVar, Context context, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
        SnsMethodCalculate.markStartTimeMs("calculateInputViewMaxHeight$default", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentFooterHeightProvider");
        if ((i8 & 2) != 0) {
            i = KeyBoardUtil.getKeyBordHeightPx(context);
        }
        if ((i8 & 4) != 0) {
            i2 = C74942w4.m89786c(context, C0966R.dimen.f3679b9);
        }
        if ((i8 & 8) != 0) {
            i3 = C75044y4.m89994f(context);
        }
        if ((i8 & 16) != 0) {
            i4 = C75044y4.m89991c(context);
        }
        if ((i8 & 32) != 0) {
            i5 = C75044y4.m89990b(context).y;
        }
        if ((i8 & 64) != 0) {
            i6 = C76577a.m92157h(context, C0966R.dimen.f3766df);
        }
        if ((i8 & 128) != 0) {
            i7 = C76577a.m92157h(context, C0966R.dimen.f3766df);
        }
        cVar.getClass();
        SnsMethodCalculate.markStartTimeMs("calculateInputViewMaxHeight", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentFooterHeightProvider");
        C87412m.m108594g(context, "context");
        Log.m105924i("MicroMsg.SnsCommentFooter.HeightProvider", "calculateInputViewMaxHeight context:" + context + ", screenHeight:" + i5 + ", keyboardHeight:" + i + ", actionBarHeight:" + i2 + ", statusBarHeight:" + i3 + ", bottomHeight:" + i4 + ", paddingTop:" + i6 + ", paddingBottom:" + i7);
        int i9 = (((((i5 - i3) - i2) - i4) - i) / 2) - (i6 + i7);
        SnsMethodCalculate.markEndTimeMs("calculateInputViewMaxHeight", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentFooterHeightProvider");
        SnsMethodCalculate.markEndTimeMs("calculateInputViewMaxHeight$default", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentFooterHeightProvider");
        return i9;
    }
}
