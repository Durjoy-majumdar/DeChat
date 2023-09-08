package ph1;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.view.View;
import f50.C58924d;
import gy3.C87412m;
import lt1.C61401a;

/* renamed from: ph1.g */
public class C62292g extends C62294j {

    /* renamed from: i */
    public SurfaceTexture f177076i;

    /* renamed from: j */
    public final TextureView f177077j;

    /* renamed from: k */
    public boolean f177078k;

    /* renamed from: l */
    public boolean f177079l;

    /* renamed from: m */
    public View f177080m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62292g(C61401a aVar, long j, View view, int i, int i2, float f, C58924d dVar, SurfaceTexture surfaceTexture, TextureView textureView, boolean z, boolean z2) {
        super(aVar, j, view, i, i2, f, dVar);
        C87412m.m108594g(aVar, "fluentScene");
        C87412m.m108594g(view, "parentView");
        C87412m.m108594g(textureView, "liveView");
        this.f177076i = surfaceTexture;
        this.f177077j = textureView;
        this.f177078k = z;
        this.f177079l = z2;
    }
}
