package p590kv;

import android.content.Context;
import android.content.Intent;
import cc2.C54713e;
import cc2.C67350b;
import cc2.C67351c;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.LbsroomLogicEvent;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import p214om.C11502f;
import p601lv.C76726b;
import qo3.C77398g;
import te3.C78019ym2;
import uc3.C78146a;

@C86522b
/* renamed from: kv.b */
public class C76635b extends C86301e implements C76726b {
    /* renamed from: Mb */
    public boolean mo106905Mb() {
        return C78146a.m94353b();
    }

    /* renamed from: Qx */
    public boolean mo106906Qx() {
        LbsroomLogicEvent lbsroomLogicEvent = new LbsroomLogicEvent();
        lbsroomLogicEvent.f193724d.f193726a = 7;
        lbsroomLogicEvent.publish();
        return lbsroomLogicEvent.f193725e.f193727a;
    }

    public void V00(Intent intent, Context context) {
        ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93174g(intent, context);
    }

    /* renamed from: ei */
    public boolean mo106908ei() {
        return C78146a.m94354c();
    }

    /* renamed from: kq */
    public C67350b mo106909kq(int i, float f, float f2, int i2, int i3, String str, String str2) {
        return new C54713e(i, f, f2, i2, i3, str, str2);
    }

    /* renamed from: pd */
    public C77398g mo106910pd(Context context) {
        return ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93171d(context);
    }

    public C78019ym2 w60() {
        return new C67351c();
    }
}
