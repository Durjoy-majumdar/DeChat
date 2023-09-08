package com.tencent.p014mm.p136ui;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.C67073a;
import androidx.activity.result.C67074b;

/* renamed from: com.tencent.mm.ui.MMFragmentActivity$$i */
public class MMFragmentActivity$$i implements C67073a<ActivityResult>, MMFragmentActivity$$d {

    /* renamed from: a */
    public MMFragmentActivity$$g f214428a = null;

    /* renamed from: b */
    public C67074b<?> f214429b = null;

    /* renamed from: a */
    public void mo91080a(Object obj) {
        ActivityResult activityResult = (ActivityResult) obj;
        C67074b<?> bVar = this.f214429b;
        if (bVar != null) {
            bVar.mo91082b();
        }
        MMFragmentActivity$$g mMFragmentActivity$$g = this.f214428a;
        if (mMFragmentActivity$$g != null) {
            mMFragmentActivity$$g.mo5702a(activityResult.f337841d, activityResult.f337842e);
        }
    }

    /* renamed from: b */
    public void mo7677b(MMFragmentActivity$$g mMFragmentActivity$$g) {
        this.f214428a = mMFragmentActivity$$g;
    }
}
