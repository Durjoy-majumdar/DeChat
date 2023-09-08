package com.tencent.p014mm.vending.app;

import android.os.Bundle;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;
import ep3.C97688c;
import jp3.C9486a;
import jp3.C9487b;

/* renamed from: com.tencent.mm.vending.app.PresenterActivity */
public abstract class PresenterActivity extends HellActivity implements C9487b {

    /* renamed from: d */
    public C97688c f220813d = new C97688c();

    public void keep(C9486a aVar) {
        this.f220813d.keep(aVar);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f220813d.mo136942d(getIntent(), this);
    }

    public void onDestroy() {
        C97688c cVar = this.f220813d;
        cVar.f286535g.dead();
        cVar.mo136944f(4);
        super.onDestroy();
    }

    public void onPause() {
        this.f220813d.mo136944f(3);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f220813d.mo136944f(2);
    }
}
