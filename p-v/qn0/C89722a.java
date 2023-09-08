package qn0;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView;
import in0.C87760d;
import kn0.C88240o;

/* renamed from: qn0.a */
public final class C89722a extends AbstractVideoTextureView {
    public C89722a(Context context) {
        super(context, (AttributeSet) null);
    }

    /* renamed from: c */
    public C87760d mo22414c() {
        return new C88240o(new Handler(Looper.getMainLooper()));
    }
}
