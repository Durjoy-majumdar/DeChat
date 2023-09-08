package p1044ub;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import lp3.C88643g;

/* renamed from: ub.c$$e */
public class c$$e implements C87581a<Bitmap, Void> {

    /* renamed from: a */
    public final /* synthetic */ C90630c f260381a;

    public c$$e(C90630c cVar) {
        this.f260381a = cVar;
    }

    public Object call(Object obj) {
        Void voidR = (Void) obj;
        Log.m105918d("MicroMsg.AppBrandPageViewLU", "getScreenshotForSharing entered");
        View contentView = this.f260381a.f244558J.getContentView();
        if (contentView == null) {
            return null;
        }
        int width = this.f260381a.f244558J.getWidth();
        int height = this.f260381a.f244558J.getHeight();
        int webScrollX = this.f260381a.f244558J.getWebScrollX();
        int webScrollY = this.f260381a.f244558J.getWebScrollY();
        if (width == 0 || height == 0) {
            return null;
        }
        contentView.scrollTo(0, 0);
        this.f260381a.f244558J.mo63311e1(new C90631d(this, width, height, C88643g.m110545c(), contentView, webScrollX, webScrollY));
        return null;
    }
}
