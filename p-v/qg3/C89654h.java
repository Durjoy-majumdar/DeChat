package qg3;

import android.app.Application;
import android.content.res.Resources;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import lg3.C88496e;

/* renamed from: qg3.h */
public class C89654h implements MMApplicationContext.IResourceProvider {

    /* renamed from: a */
    public final /* synthetic */ Application f257883a;

    public C89654h(C89655j jVar, Application application) {
        this.f257883a = application;
    }

    public Resources getResources() {
        return C88496e.m110361d(this.f257883a.getResources(), this.f257883a, false);
    }
}
