package qj1;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin;
import o40.C61926c;
import r60.C101350i;
import t60.C64207e;
import x60.C102564a;

/* renamed from: qj1.i0 */
public final class C12445i0<T, R> implements C64207e {

    /* renamed from: a */
    public final /* synthetic */ ImageView f35822a;

    /* renamed from: b */
    public final /* synthetic */ FinderLiveAnchorAfterPlugin f35823b;

    /* renamed from: c */
    public final /* synthetic */ String f35824c;

    /* renamed from: d */
    public final /* synthetic */ int f35825d;

    public C12445i0(ImageView imageView, FinderLiveAnchorAfterPlugin finderLiveAnchorAfterPlugin, String str, int i) {
        this.f35822a = imageView;
        this.f35823b = finderLiveAnchorAfterPlugin;
        this.f35824c = str;
        this.f35825d = i;
    }

    /* renamed from: a */
    public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
        C61926c.m72668M(new C12433h0((Bitmap) obj, this.f35822a, this.f35823b, this.f35824c, this.f35825d));
    }
}
