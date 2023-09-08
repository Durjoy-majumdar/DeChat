package lu0;

import android.os.Handler;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import in0.C87761e;
import ns0.C89083d;
import ns0.C89084e;
import qs0.C101242d;

public final /* synthetic */ class f$$b implements C89083d {

    /* renamed from: a */
    public final /* synthetic */ Handler f255959a;

    public /* synthetic */ f$$b(Handler handler) {
        this.f255959a = handler;
    }

    /* renamed from: a */
    public final C87761e mo123095a(C89084e eVar) {
        Handler handler = this.f255959a;
        return C101242d.f296447G.mo124112a(MMApplicationContext.getContext(), handler.getLooper(), false, eVar);
    }
}
