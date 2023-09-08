package oh1;

import android.graphics.Bitmap;
import android.widget.ImageView;
import o40.C61926c;
import r60.C101350i;
import rx3.C13598b0;
import t60.C64207e;
import wx3.C15601d;
import x60.C102564a;

/* renamed from: oh1.f */
public final class C11420f<T, R> implements C64207e {

    /* renamed from: a */
    public final /* synthetic */ ImageView f33597a;

    /* renamed from: b */
    public final /* synthetic */ C11415c f33598b;

    /* renamed from: c */
    public final /* synthetic */ String f33599c;

    /* renamed from: d */
    public final /* synthetic */ C15601d<C13598b0> f33600d;

    public C11420f(ImageView imageView, C11415c cVar, String str, C15601d<? super C13598b0> dVar) {
        this.f33597a = imageView;
        this.f33598b = cVar;
        this.f33599c = str;
        this.f33600d = dVar;
    }

    /* renamed from: a */
    public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
        C61926c.m72668M(new C11419e((Bitmap) obj, this.f33597a, this.f33598b, this.f33599c, this.f33600d));
    }
}
