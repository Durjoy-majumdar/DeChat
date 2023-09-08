package com.tencent.p014mm.kiss;

import android.os.Bundle;
import com.tencent.p014mm.p136ui.MMActivity;
import ep3.C97683a;
import ep3.C97688c;
import jp3.C9486a;

/* renamed from: com.tencent.mm.kiss.WxPresenterActivity */
public abstract class WxPresenterActivity extends MMActivity {

    /* renamed from: d */
    public C97688c f195332d = new C97688c();

    /* renamed from: H7 */
    public C97683a mo93528H7() {
        return this.f195332d.mo136939a();
    }

    public void keep(C9486a aVar) {
        this.f195332d.keep(aVar);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f195332d.mo136942d(getIntent(), this);
    }

    public void onDestroy() {
        C97688c cVar = this.f195332d;
        cVar.f286535g.dead();
        cVar.mo136944f(4);
        super.onDestroy();
    }

    public void onPause() {
        this.f195332d.mo136944f(3);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f195332d.mo136944f(2);
    }
}
