package androidx.compose.p002ui.platform;

import android.content.Context;
import p175j0.C60647d0;

/* renamed from: androidx.compose.ui.platform.x */
public final class C103706x implements C60647d0 {

    /* renamed from: a */
    public final /* synthetic */ Context f306292a;

    /* renamed from: b */
    public final /* synthetic */ C27938z f306293b;

    public C103706x(Context context, C27938z zVar) {
        this.f306292a = context;
        this.f306293b = zVar;
    }

    public void dispose() {
        this.f306292a.getApplicationContext().unregisterComponentCallbacks(this.f306293b);
    }
}
