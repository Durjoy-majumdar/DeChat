package qn0;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView;
import in0.C87760d;
import kn0.C21365k;

/* renamed from: qn0.d */
public class C89723d extends AbstractVideoTextureView {
    public C89723d(Context context) {
        super(context, (AttributeSet) null);
    }

    /* renamed from: c */
    public C87760d mo22414c() {
        return new C21365k(new Handler(Looper.getMainLooper()));
    }
}
