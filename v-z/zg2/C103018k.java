package zg2;

import ai2.C92011d;
import ai2.C92025s;
import ai2.C92027u;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import te3.C64339ea;

/* renamed from: zg2.k */
public final class C103018k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f303978d;

    /* renamed from: e */
    public final /* synthetic */ ViewGroup f303979e;

    /* renamed from: f */
    public final /* synthetic */ C64339ea f303980f;

    public C103018k(Context context, ViewGroup viewGroup, C64339ea eaVar) {
        this.f303978d = context;
        this.f303979e = viewGroup;
        this.f303980f = eaVar;
    }

    public final void run() {
        C103020m mVar = C103020m.f303985a;
        Context context = this.f303978d;
        ViewGroup viewGroup = this.f303979e;
        C64339ea eaVar = this.f303980f;
        C87412m.m108593f(eaVar, LocaleUtil.ITALIAN);
        C92025s sVar = new C92025s(eaVar);
        Log.m105924i("MicroMsg.mix_background.VideoEditStorageUtil", "fake story reshow the text item view");
        if (!TextUtils.isEmpty(sVar.f263526g)) {
            C92027u uVar = new C92027u(context);
            viewGroup.addView(uVar, new RelativeLayout.LayoutParams(-1, -1));
            uVar.setText(sVar);
            uVar.setViewMatrix(sVar.f263407f);
            uVar.setSourceDataType(C92011d.TIP);
        }
    }
}
