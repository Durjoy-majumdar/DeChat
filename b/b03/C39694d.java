package b03;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import p773yy.C66710j;
import qy2.C63347a;
import rx3.C13598b0;
import rz2.C48200b;
import rz2.C48201c;
import uz2.C52676d1;
import uz2.C52678e0;
import uz2.C52708q;
import uz2.C52725x;
import z04.C112551y;

/* renamed from: b03.d */
public final class C39694d {

    /* renamed from: a */
    public final C52676d1 f106492a;

    /* renamed from: b */
    public final C63347a.C47893d f106493b;

    /* renamed from: c */
    public final C63347a.C47891b f106494c;

    /* renamed from: d */
    public final C48201c f106495d;

    /* renamed from: e */
    public final boolean f106496e;

    /* renamed from: f */
    public WeakReference<ImageView> f106497f;

    /* renamed from: b03.d$a */
    public static final class C39695a extends C87413o implements C32226l<Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C39694d f106498d;

        /* renamed from: e */
        public final /* synthetic */ String f106499e;

        /* renamed from: f */
        public final /* synthetic */ boolean f106500f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39695a(C39694d dVar, String str, boolean z) {
            super(1);
            this.f106498d = dVar;
            this.f106499e = str;
            this.f106500f = z;
        }

        public Object invoke(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            ImageView imageView = this.f106498d.f106497f.get();
            if (imageView != null) {
                if (C87412m.m108589b(this.f106499e, imageView.getTag(C0966R.C0970id.f359345ke2))) {
                    C39691c a = IStatusIconHelperKt.m39109a();
                    boolean z = this.f106500f;
                    C39694d dVar = this.f106498d;
                    imageView.setImageDrawable(a.mo62297i(bitmap, z, dVar.f106493b, dVar.f106494c));
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C39694d(ImageView imageView, C52676d1 d1Var, C63347a.C47893d dVar, C63347a.C47891b bVar, C48201c cVar, boolean z) {
        C87412m.m108594g(imageView, "iv");
        C87412m.m108594g(dVar, "iconType");
        C87412m.m108594g(bVar, "iconColor");
        this.f106492a = d1Var;
        this.f106493b = dVar;
        this.f106494c = bVar;
        this.f106495d = cVar;
        this.f106496e = z;
        this.f106497f = new WeakReference<>(imageView);
    }

    /* renamed from: a */
    public final C52725x mo62316a() {
        C52725x h;
        C52676d1 d1Var = this.f106492a;
        if (d1Var != null && (h = C39713l.m42503h(d1Var)) != null) {
            return h;
        }
        C48201c cVar = this.f106495d;
        C52678e0 a = cVar != null ? C66710j.C53637a.m60171a(cVar, false, 1, (Object) null) : null;
        if (a != null) {
            if (this.f106496e) {
                C52708q d = C48200b.m53531d(a);
                if (d != null) {
                    return C39713l.m42502g(d);
                }
            } else {
                LinkedList<C52725x> linkedList = a.f147093j;
                if (linkedList != null) {
                    return C39713l.m42501f(linkedList);
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo62317b(String str, boolean z) {
        ImageView imageView = this.f106497f.get();
        if (imageView != null) {
            if (!(str == null || C112551y.m153811k(str))) {
                imageView.setTag(C0966R.C0970id.f359345ke2, str);
                C39707j.f106537a.mo62341Z(str, new C39695a(this, str, z));
            }
        }
    }
}
