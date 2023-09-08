package dk1;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.HashMap;
import p646pn.C100824i;
import wd3.C22910y0;

/* renamed from: dk1.h */
public final class C58314h implements C22910y0 {

    /* renamed from: a */
    public final /* synthetic */ C8479f0<String> f166982a;

    /* renamed from: b */
    public final /* synthetic */ C8479f0<String> f166983b;

    /* renamed from: c */
    public final /* synthetic */ C58316i f166984c;

    /* renamed from: d */
    public final /* synthetic */ ImageView f166985d;

    /* renamed from: dk1.h$a */
    public static final class C58315a implements C100824i.C100825a {

        /* renamed from: a */
        public final /* synthetic */ C8479f0<String> f166986a;

        /* renamed from: b */
        public final /* synthetic */ C8479f0<String> f166987b;

        /* renamed from: c */
        public final /* synthetic */ C58316i f166988c;

        /* renamed from: d */
        public final /* synthetic */ ImageView f166989d;

        public C58315a(C8479f0<String> f0Var, C8479f0<String> f0Var2, C58316i iVar, ImageView imageView) {
            this.f166986a = f0Var;
            this.f166987b = f0Var2;
            this.f166988c = iVar;
            this.f166989d = imageView;
        }

        /* renamed from: a */
        public final void mo23027a(int i) {
            Log.m105924i("Finder.FinderSideBarConvert", "#bind nickName=" + ((String) this.f166986a.f27484d) + " load with url onProcessBitmap: color=" + i);
            Integer valueOf = Integer.valueOf(i);
            ((HashMap) C58316i.f166992g).put(this.f166987b.f27484d, valueOf);
            C58316i iVar = this.f166988c;
            ImageView imageView = this.f166989d;
            T t = this.f166986a.f27484d;
            C87412m.m108593f(t, "nickname");
            iVar.mo83067j(i, imageView, (String) t);
        }
    }

    public C58314h(C8479f0<String> f0Var, C8479f0<String> f0Var2, C58316i iVar, ImageView imageView) {
        this.f166982a = f0Var;
        this.f166983b = f0Var2;
        this.f166984c = iVar;
        this.f166985d = imageView;
    }

    /* renamed from: a */
    public boolean mo23026a(Bitmap bitmap) {
        ((C100824i) C86312j.m106911c(C100824i.class)).mo139641DS(bitmap, 0, new C58315a(this.f166982a, this.f166983b, this.f166984c, this.f166985d));
        return true;
    }

    public void onFinish() {
    }

    public void onStart() {
    }
}
