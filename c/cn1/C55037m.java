package cn1;

import an1.C0092e;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C8479f0;
import java.util.HashMap;
import p646pn.C100824i;
import wd3.C22910y0;

/* renamed from: cn1.m */
public final class C55037m implements C22910y0 {

    /* renamed from: a */
    public final /* synthetic */ C0092e f154514a;

    /* renamed from: b */
    public final /* synthetic */ C8479f0<String> f154515b;

    /* renamed from: c */
    public final /* synthetic */ C55039o f154516c;

    /* renamed from: d */
    public final /* synthetic */ ImageView f154517d;

    /* renamed from: cn1.m$a */
    public static final class C55038a implements C100824i.C100825a {

        /* renamed from: a */
        public final /* synthetic */ C0092e f154518a;

        /* renamed from: b */
        public final /* synthetic */ C8479f0<String> f154519b;

        /* renamed from: c */
        public final /* synthetic */ C55039o f154520c;

        /* renamed from: d */
        public final /* synthetic */ ImageView f154521d;

        public C55038a(C0092e eVar, C8479f0<String> f0Var, C55039o oVar, ImageView imageView) {
            this.f154518a = eVar;
            this.f154519b = f0Var;
            this.f154520c = oVar;
            this.f154521d = imageView;
        }

        /* renamed from: a */
        public final void mo23027a(int i) {
            Log.m105924i("Finder.HeadLivingConvert", "#bind nickName=" + this.f154518a.mo3513o().getNickName() + " load with url onProcessBitmap: color=" + i);
            Integer valueOf = Integer.valueOf(i);
            ((HashMap) C55039o.f154524g).put(this.f154519b.f27484d, valueOf);
            this.f154520c.mo76096j(i, this.f154521d, this.f154518a);
        }
    }

    public C55037m(C0092e eVar, C8479f0<String> f0Var, C55039o oVar, ImageView imageView) {
        this.f154514a = eVar;
        this.f154515b = f0Var;
        this.f154516c = oVar;
        this.f154517d = imageView;
    }

    /* renamed from: a */
    public boolean mo23026a(Bitmap bitmap) {
        ((C100824i) C86312j.m106911c(C100824i.class)).mo139641DS(bitmap, 0, new C55038a(this.f154514a, this.f154515b, this.f154516c, this.f154517d));
        return true;
    }

    public void onFinish() {
    }

    public void onStart() {
    }
}
