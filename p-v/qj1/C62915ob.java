package qj1;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.LinkedList;

/* renamed from: qj1.ob */
public final class C62915ob<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C62843kb f178537d;

    public C62915ob(C62843kb kbVar) {
        this.f178537d = kbVar;
    }

    public void onChanged(Object obj) {
        LinkedList linkedList = (LinkedList) obj;
        Log.m105924i("MultiStreamPlugin", "receive multiStreamUpdateMock " + linkedList);
        C62843kb kbVar = this.f178537d;
        C87412m.m108593f(linkedList, LocaleUtil.ITALIAN);
        C62843kb.m73930Z0(kbVar, linkedList);
    }
}
