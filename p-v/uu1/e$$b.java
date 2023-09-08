package uu1;

import android.util.Size;
import androidx.lifecycle.C0120a0;

public final /* synthetic */ class e$$b implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C111225e f333059d;

    public /* synthetic */ e$$b(C111225e eVar) {
        this.f333059d = eVar;
    }

    public final void onChanged(Object obj) {
        Size size = (Size) obj;
        e$$c e__c = this.f333059d.f333055e;
        if (e__c != null) {
            e__c.mo158515a(size.getWidth(), size.getHeight());
        }
    }
}
