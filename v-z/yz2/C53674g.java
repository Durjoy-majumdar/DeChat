package yz2;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* renamed from: yz2.g */
public final class C53674g extends View {

    /* renamed from: d */
    public final /* synthetic */ C53684j f150750d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53674g(C53684j jVar, Context context) {
        super(context);
        this.f150750d = jVar;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f150750d.dismiss();
    }
}
