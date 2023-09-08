package h21;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.collect.p038ui.CollectMainUI;
import p910lj.C76701a;

/* renamed from: h21.u */
public class C59749u implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CollectMainUI f170642d;

    public C59749u(CollectMainUI collectMainUI) {
        this.f170642d = collectMainUI;
    }

    public void run() {
        C76701a.makeText((Context) this.f170642d.getContext(), (CharSequence) this.f170642d.getString(C0966R.string.bhb), 1).show();
    }
}
