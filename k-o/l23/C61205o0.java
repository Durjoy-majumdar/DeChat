package l23;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import f14.C58901s;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import lh2.C99417a;
import nj3.C76879j;
import qh2.C101198e;
import qo3.C89779i0;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: l23.o0 */
public final class C61205o0 extends C99417a {

    /* renamed from: f */
    public ImageView f174240f;

    /* renamed from: g */
    public final Context f174241g;

    /* renamed from: h */
    public C89779i0 f174242h;

    /* renamed from: i */
    public int f174243i = -1;

    @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.plugin.ThumbLoadingPlugin$hideLoading$1", mo125469f = "ThumbLoadingPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: l23.o0$a */
    public static final class C61206a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C61205o0 f174244d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61206a(C61205o0 o0Var, C15601d<? super C61206a> dVar) {
            super(2, dVar);
            this.f174244d = o0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C61206a(this.f174244d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C61206a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C61205o0 o0Var = this.f174244d;
            o0Var.f174243i = 3;
            o0Var.f174240f.setVisibility(8);
            C89779i0 i0Var = this.f174244d.f174242h;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            this.f174244d.f174242h = null;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: l23.o0$b */
    public static final class C61207b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C61205o0 f174245d;

        /* renamed from: e */
        public final /* synthetic */ String f174246e;

        public C61207b(C61205o0 o0Var, String str) {
            this.f174245d = o0Var;
            this.f174246e = str;
        }

        public final void run() {
            C61205o0 o0Var = this.f174245d;
            o0Var.f174242h = C76879j.m92723Q(o0Var.f174241g, "", this.f174246e, true, false, (DialogInterface.OnCancelListener) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61205o0(ImageView imageView, C101198e eVar) {
        super(eVar, (String) null);
        C87412m.m108594g(imageView, "thumbView");
        C87412m.m108594g(eVar, "status");
        this.f174240f = imageView;
        this.f174241g = imageView.getContext();
    }

    /* renamed from: z */
    public static void m71752z(C61205o0 o0Var, GalleryItem$MediaItem galleryItem$MediaItem, int i, boolean z, int i2, Object obj) {
        int i3 = (i2 & 2) != 0 ? -1 : i;
        boolean z2 = (i2 & 4) != 0 ? false : z;
        o0Var.getClass();
        C87412m.m108594g(galleryItem$MediaItem, "mediaItem");
        Log.m105924i("MicroMsg.ThumbLoadingPlugin", "showThumbLoading  path:" + galleryItem$MediaItem.f162747d);
        C0001s1 s1Var = C0001s1.f0d;
        C53896h0 h0Var = C53872d1.f151117a;
        C53895h.m60466d(s1Var, C58901s.f168555a, (C53934p0) null, new C61208p0(o0Var, i3, z2, galleryItem$MediaItem, (C15601d<? super C61208p0>) null), 2, (Object) null);
    }

    /* renamed from: x */
    public final void mo86128x() {
        Log.m105924i("MicroMsg.ThumbLoadingPlugin", "hideLoading");
        C0001s1 s1Var = C0001s1.f0d;
        C53896h0 h0Var = C53872d1.f151117a;
        C53895h.m60466d(s1Var, C58901s.f168555a, (C53934p0) null, new C61206a(this, (C15601d<? super C61206a>) null), 2, (Object) null);
    }

    /* renamed from: y */
    public final void mo86129y(int i, boolean z) {
        Log.m105924i("MicroMsg.ThumbLoadingPlugin", "showDialog, fromThumbLoading:" + z);
        if (!z || this.f174243i == 1) {
            String string = i < 0 ? this.f174241g.getString(C0966R.string.gas) : this.f174241g.getString(i);
            C87412m.m108593f(string, "if (strRes < 0) {\n      …tString(strRes)\n        }");
            this.f174243i = 2;
            Context context = this.f174241g;
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context).runOnUiThread(new C61207b(this, string));
            return;
        }
        Log.m105924i("MicroMsg.ThumbLoadingPlugin", "showDialog state error ignore");
    }
}
