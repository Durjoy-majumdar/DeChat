package androidx.camera.core;

import android.util.Size;
import androidx.camera.core.impl.PreviewConfig;
import androidx.camera.core.impl.SessionConfig;

public final /* synthetic */ class Preview$$b implements SessionConfig.ErrorListener {

    /* renamed from: a */
    public final /* synthetic */ Preview f44272a;

    /* renamed from: b */
    public final /* synthetic */ String f44273b;

    /* renamed from: c */
    public final /* synthetic */ PreviewConfig f44274c;

    /* renamed from: d */
    public final /* synthetic */ Size f44275d;

    public /* synthetic */ Preview$$b(Preview preview, String str, PreviewConfig previewConfig, Size size) {
        this.f44272a = preview;
        this.f44273b = str;
        this.f44274c = previewConfig;
        this.f44275d = size;
    }

    public final void onError(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        this.f44272a.lambda$createPipeline$0(this.f44273b, this.f44274c, this.f44275d, sessionConfig, sessionError);
    }
}
