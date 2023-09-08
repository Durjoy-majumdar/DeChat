package fb1;

import android.content.Context;
import com.tencent.p014mm.plugin.facedetect.model.FaceDetectReporter;
import java.lang.ref.WeakReference;

/* renamed from: fb1.a */
public abstract class C116851a {

    /* renamed from: a */
    public Context f350240a;

    public C116851a(Context context, C116855e eVar, int i, int i2) {
        this.f350240a = context;
        new WeakReference(eVar);
        FaceDetectReporter faceDetectReporter = FaceDetectReporter.f345959s;
        mo180848a();
    }

    /* renamed from: a */
    public abstract void mo180848a();
}
