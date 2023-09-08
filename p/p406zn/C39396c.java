package p406zn;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.brandservice.p028ui.profile.BizContactInfoDialogFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19627t;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import di3.C86301e;
import dx0.C45469b;
import dx0.C45484j;
import eb0.C31451c0;
import eb0.C58537b0;
import ei3.C86522b;
import ex0.C45696d;
import ex0.C45698f;
import ex0.C45700h;
import f40.C86709a0;
import f62.C31920a0;
import gy3.C87412m;
import oy0.C35336a;
import oy0.C35337b;
import p227rn.C13088a0;
import p248ug.C52570c0;
import q73.C35796c0;
import yx0.C53620d;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS})
/* renamed from: zn.c */
public class C39396c extends C86301e implements C13088a0, C31920a0 {
    public DialogFragment Rp0(Context context, Intent intent, RecyclerViewDrawerSquares.C45117c cVar, int i) {
        int i2 = BizContactInfoDialogFragment.f197545r;
        C87412m.m108594g(context, "activityContext");
        C87412m.m108594g(intent, "intent");
        Bundle bundle = new Bundle();
        BizContactInfoDialogFragment bizContactInfoDialogFragment = new BizContactInfoDialogFragment(context, intent);
        bizContactInfoDialogFragment.setArguments(bundle);
        bizContactInfoDialogFragment.f197554o = cVar;
        bizContactInfoDialogFragment.f197555p = i;
        return bizContactInfoDialogFragment;
    }

    /* renamed from: Wg */
    public boolean mo58431Wg(int i, String str) {
        Log.m105925i("MicroMsg.BrandFeatureService", "testInsertBizAd %d, %s", Integer.valueOf(i), str);
        if (i == 1) {
            C19627t.f55586a.mo25829c(2);
        } else if (i == 2) {
            MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("brandService");
            singleMMKV.encode("BizTimeLineAdTestMode", Util.getInt(str, 0));
            singleMMKV.apply();
        }
        return true;
    }

    public void onCreate(Context context) {
        Class<C52570c0> cls = C52570c0.class;
        super.onCreate(context);
        C86709a0.m107532n(C45696d.class, new C45469b());
        C86709a0.m107532n(C45700h.class, new C45484j());
        C86709a0.m107532n(C45698f.class, new C53620d());
        if (MMApplicationContext.isMainProcess()) {
            C35337b bVar = C35337b.f94642a;
            C35796c0.f95591d.add(new C35336a());
            C86709a0.m107532n(cls, C58537b0.f167574d);
            return;
        }
        C86709a0.m107532n(cls, new C31451c0());
    }
}
