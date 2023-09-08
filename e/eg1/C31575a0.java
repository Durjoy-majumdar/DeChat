package eg1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import di3.C86312j;
import ht1.C60169f4;
import java.util.List;
import rx3.C36570n;
import sx3.C110818d0;

/* renamed from: eg1.a0 */
public final class C31575a0 implements MTimerHandler.CallBack {

    /* renamed from: d */
    public static final C31575a0 f84382d = new C31575a0();

    public final boolean onTimerExpired() {
        C31577b0 b0Var = C31577b0.f84386a;
        ((MTimerHandler) ((C36570n) C31577b0.f84390e).getValue()).stopTimer();
        C31577b0.f84387b = false;
        StringBuilder sb = new StringBuilder();
        sb.append("[doReport] newTipsIdList.size = ");
        List<String> list = C31577b0.f84388c;
        sb.append(list.size());
        sb.append(" ,replaceableTipsIdList.size = ");
        List<String> list2 = C31577b0.f84389d;
        sb.append(list2.size());
        sb.append(' ');
        Log.m105924i("FinderLiveNotifyReplaceManager", sb.toString());
        if (list2.size() > 0) {
            ((C60169f4) C86312j.m106911c(C60169f4.class)).mo83331ex(C110818d0.m150953y0(list), C110818d0.m150953y0(list2));
        }
        list.clear();
        list2.clear();
        return true;
    }
}
