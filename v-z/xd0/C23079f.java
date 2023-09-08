package xd0;

import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import java.util.List;

/* renamed from: xd0.f */
public final class C23079f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f66305d;

    /* renamed from: e */
    public final /* synthetic */ List<SubscribeMsgTmpItem> f66306e;

    public C23079f(String str, List<SubscribeMsgTmpItem> list) {
        this.f66305d = str;
        this.f66306e = list;
    }

    public final void run() {
        C23076d.f66292a.mo36483d(this.f66305d, this.f66306e);
    }
}
