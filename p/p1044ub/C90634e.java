package p1044ub;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.page.C83797e3;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ub.e */
public class C90634e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C90630c f260391d;

    /* renamed from: ub.e$a */
    public class C90635a implements C82531i.C82536e {
        public C90635a() {
        }

        /* renamed from: a */
        public void mo114870a() {
            C90634e.this.f260391d.f244657w.f241651j.remove(this);
            C90634e.this.f260391d.f244558J.mo63311e1(new e$a$$a(this));
        }
    }

    public C90634e(C90630c cVar) {
        this.f260391d = cVar;
    }

    public void run() {
        C83797e3 e3Var = this.f260391d.f244558J;
        if (e3Var != null && e3Var.getWebScrollY() != 0) {
            C90630c cVar = this.f260391d;
            FrameLayout frameLayout = (FrameLayout) cVar.f244555G.findViewById(C0966R.C0970id.f5955t_);
            if (frameLayout == null) {
                frameLayout = new FrameLayout(cVar.getContext());
                frameLayout.setId(C0966R.C0970id.f5955t_);
                cVar.f244555G.addView(frameLayout, -1, -1);
            }
            frameLayout.setBackground((Drawable) null);
            frameLayout.setVisibility(0);
            frameLayout.bringToFront();
            try {
                Log.m105918d("MicroMsg.AppBrandPageViewLU", "showScreenshotCover get screenshot");
                frameLayout.setBackground(new BitmapDrawable(cVar.getContext().getResources(), cVar.mo116159N0()));
            } catch (OutOfMemoryError unused) {
                Log.m105921e("MicroMsg.AppBrandPageViewLU", "showScreenshotCover oom, appId = %s, path = %s", cVar.getAppId(), cVar.mo116162Q0());
                cVar.mo124767E1();
            }
            this.f260391d.f244558J.setVerticalScrollBarEnabled(false);
            C90630c cVar2 = this.f260391d;
            cVar2.f244657w.f241651j.add(new C90635a());
        }
    }
}
