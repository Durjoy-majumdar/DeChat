package fu2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.GameCenterOperationEvent;
import com.tencent.p014mm.plugin.sns.p106ui.C96318y1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import di3.C86312j;
import gu2.C98214b;
import gy3.C87412m;
import p214om.C11502f;
import ps2.C100894u;
import te3.C101779g1;
import te3.C101799k1;
import wc3.C102431y;

/* renamed from: fu2.n */
public final class C98019n extends C97987a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98019n(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public void mo71269a(View view) {
        Class cls = C11502f.class;
        SnsMethodCalculate.markStartTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveGameAboutClick");
        C98214b c = mo137310c();
        if (c == null) {
            SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveGameAboutClick");
            return;
        }
        TimeLineObject timeLine = c.mo137505C2().getTimeLine();
        C87412m.m108593f(timeLine, "snsinfo.timeLine");
        C101799k1 k1Var = timeLine.actionInfo;
        if (k1Var.f298580j == null) {
            SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveGameAboutClick");
            return;
        }
        String CP = ((C11502f) C86312j.m106911c(cls)).mo11461Sr().mo93137CP(k1Var.f298580j.f298271d, false);
        int i = timeLine.ContentObj.f298424e;
        int i2 = i == 1 ? 2 : i == 3 ? 5 : i == 15 ? 38 : 0;
        Context b = mo137309b();
        C87412m.m108592e(b, "null cannot be cast to non-null type android.app.Activity");
        if (C100894u.m132244x(timeLine, (Activity) b, 11, false)) {
            C102431y Sr = ((C11502f) C86312j.m106911c(cls)).mo11461Sr();
            Context b2 = mo137309b();
            C101779g1 g1Var = k1Var.f298580j;
            Sr.mo93162s5(b2, g1Var.f298271d, CP, timeLine.UserName, i2, 11, 9, g1Var.f298272e, 0, timeLine.f283893Id);
            SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveGameAboutClick");
            return;
        }
        int i3 = k1Var.f298574d;
        if (i3 == 4) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", k1Var.f298575e);
            ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93190w(intent, mo137309b());
            C102431y Sr2 = ((C11502f) C86312j.m106911c(cls)).mo11461Sr();
            Context b3 = mo137309b();
            C101779g1 g1Var2 = k1Var.f298580j;
            Sr2.mo93162s5(b3, g1Var2.f298271d, CP, timeLine.UserName, i2, 11, 1, g1Var2.f298272e, 0, timeLine.f283893Id);
        } else if (i3 != 5) {
            if (i3 == 6) {
                int b4 = C96318y1.m123548b(mo137309b(), k1Var);
                if (b4 == 1) {
                    GameCenterOperationEvent gameCenterOperationEvent = new GameCenterOperationEvent();
                    gameCenterOperationEvent.f107543d.f107545b = mo137309b();
                    GameCenterOperationEvent.C40104a aVar = gameCenterOperationEvent.f107543d;
                    aVar.f107544a = 2;
                    C101779g1 g1Var3 = k1Var.f298580j;
                    aVar.f107546c = g1Var3.f298271d;
                    aVar.f107547d = g1Var3.f298274g;
                    aVar.f107548e = g1Var3.f298273f;
                    aVar.f107549f = 3;
                    gameCenterOperationEvent.publish();
                    C102431y Sr3 = ((C11502f) C86312j.m106911c(cls)).mo11461Sr();
                    Context b5 = mo137309b();
                    C101779g1 g1Var4 = k1Var.f298580j;
                    Sr3.mo93162s5(b5, g1Var4.f298271d, CP, timeLine.UserName, i2, 11, 6, g1Var4.f298272e, 0, timeLine.f283893Id);
                } else if (b4 == 2) {
                    GameCenterOperationEvent gameCenterOperationEvent2 = new GameCenterOperationEvent();
                    gameCenterOperationEvent2.f107543d.f107545b = mo137309b();
                    GameCenterOperationEvent.C40104a aVar2 = gameCenterOperationEvent2.f107543d;
                    aVar2.f107544a = 1;
                    C101779g1 g1Var5 = k1Var.f298580j;
                    aVar2.f107546c = g1Var5.f298271d;
                    aVar2.f107547d = g1Var5.f298274g;
                    aVar2.f107548e = g1Var5.f298273f;
                    aVar2.f107549f = 3;
                    gameCenterOperationEvent2.publish();
                    C102431y Sr4 = ((C11502f) C86312j.m106911c(cls)).mo11461Sr();
                    Context b6 = mo137309b();
                    C101779g1 g1Var6 = k1Var.f298580j;
                    Sr4.mo93162s5(b6, g1Var6.f298271d, CP, timeLine.UserName, i2, 11, 3, g1Var6.f298272e, 0, timeLine.f283893Id);
                }
            }
        } else if (k1Var.f298576f == 1) {
            GameCenterOperationEvent gameCenterOperationEvent3 = new GameCenterOperationEvent();
            GameCenterOperationEvent.C40104a aVar3 = gameCenterOperationEvent3.f107543d;
            aVar3.f107544a = 2;
            aVar3.f107549f = 3;
            aVar3.f107546c = k1Var.f298580j.f298271d;
            aVar3.f107545b = mo137309b();
            gameCenterOperationEvent3.publish();
            C102431y Sr5 = ((C11502f) C86312j.m106911c(cls)).mo11461Sr();
            Context b7 = mo137309b();
            C101779g1 g1Var7 = k1Var.f298580j;
            Sr5.mo93162s5(b7, g1Var7.f298271d, CP, timeLine.UserName, i2, 11, 6, g1Var7.f298272e, 0, timeLine.f283893Id);
        }
        SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveGameAboutClick");
    }
}
