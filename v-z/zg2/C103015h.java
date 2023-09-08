package zg2;

import ai2.C92025s;
import ai2.C92026t;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import te3.C64339ea;

/* renamed from: zg2.h */
public final class C103015h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f303969d;

    /* renamed from: e */
    public final /* synthetic */ ViewGroup f303970e;

    /* renamed from: f */
    public final /* synthetic */ C64339ea f303971f;

    public C103015h(Context context, ViewGroup viewGroup, C64339ea eaVar) {
        this.f303969d = context;
        this.f303970e = viewGroup;
        this.f303971f = eaVar;
    }

    public final void run() {
        C103020m mVar = C103020m.f303985a;
        Context context = this.f303969d;
        ViewGroup viewGroup = this.f303970e;
        C64339ea eaVar = this.f303971f;
        C87412m.m108593f(eaVar, LocaleUtil.ITALIAN);
        C92025s sVar = new C92025s(eaVar);
        Log.m105924i("MicroMsg.mix_background.VideoEditStorageUtil", "fake story reshow the text item view");
        if (!TextUtils.isEmpty(sVar.f263526g)) {
            C92026t tVar = new C92026t(context);
            viewGroup.addView(tVar, new RelativeLayout.LayoutParams(-1, -1));
            tVar.mo126004k(sVar);
        }
    }
}
