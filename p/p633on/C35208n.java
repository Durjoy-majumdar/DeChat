package p633on;

import android.view.View;
import com.tencent.p014mm.app.C28675a0;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.ball.view.FloatBallView;
import com.tencent.p014mm.plugin.ball.view.FloatMenuView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import java.util.Arrays;
import java.util.List;
import p646pn.C110234e;

@C86522b
/* renamed from: on.n */
public class C35208n extends C86301e implements C28675a0 {
    public List<? extends Class<? extends View>> ed0() {
        return Arrays.asList(new Class[]{FloatBallView.class, FloatMenuView.class});
    }

    public boolean kf0() {
        List<BallInfo> x;
        if (!MMApplicationContext.isMainProcess() || (x = ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY().mo149148x()) == null) {
            return false;
        }
        return !x.isEmpty();
    }
}
