package p564iq;

import android.content.res.AssetManager;
import di3.C7335d;
import fy3.C32226l;
import java.io.File;
import java.util.concurrent.Future;
import rx3.C13598b0;
import ui3.C90664c;

/* renamed from: iq.d */
public interface C87790d extends C7335d {

    /* renamed from: iq.d$a */
    public interface C33382a {
        /* renamed from: a */
        void mo55610a(C90664c cVar);
    }

    /* renamed from: Cp */
    AssetManager mo122028Cp();

    /* renamed from: Ey */
    void mo122029Ey();

    /* renamed from: Fy */
    void mo122030Fy(String str);

    /* renamed from: GY */
    void mo122031GY(C32226l<? super C98782c, C13598b0> lVar);

    boolean Jw0(String str);

    /* renamed from: Ka */
    boolean mo122033Ka(boolean z);

    /* renamed from: R0 */
    boolean mo122034R0(String str);

    boolean W90();

    /* renamed from: Xk */
    void mo122036Xk(AssetManager assetManager, String str, File file);

    /* renamed from: ZY */
    boolean mo122037ZY(String str);

    String getLastObbErrorInfo();

    String getObbInfo();

    boolean isInstalled(String str);

    boolean needObbRes();

    Future<?> nx0(C33382a aVar);

    Future<?> vr0(C87789a aVar);

    /* renamed from: xY */
    String mo122044xY(AssetManager assetManager, String str);
}
