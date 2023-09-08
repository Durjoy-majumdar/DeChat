package com.tencent.p014mm.kiss;

import android.os.Bundle;
import com.tencent.p014mm.p136ui.MMActivity;
import ep3.C97688c;

/* renamed from: com.tencent.mm.kiss.MMPresenterActivity */
public abstract class MMPresenterActivity extends MMActivity {

    /* renamed from: d */
    public C97688c f195331d = new C97688c();

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f195331d.mo136942d(getIntent(), this);
    }

    public void onDestroy() {
        super.onDestroy();
        C97688c cVar = this.f195331d;
        cVar.f286535g.dead();
        cVar.mo136944f(4);
    }

    public void onPause() {
        super.onPause();
        this.f195331d.mo136944f(3);
    }

    public void onResume() {
        super.onResume();
        this.f195331d.mo136944f(2);
    }
}
