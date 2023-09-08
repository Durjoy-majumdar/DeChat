package t93;

import com.tencent.p014mm.sdk.platformtools.Log;
import e00.C45511f0;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: t93.a */
public final class C48618a implements C45511f0 {

    /* renamed from: a */
    public static final C48618a f130143a = new C48618a();

    /* renamed from: b */
    public static final ArrayList<C45511f0.C45512a> f130144b = new ArrayList<>();

    /* renamed from: a */
    public void mo73331a(int i, int i2) {
        ArrayList<C45511f0.C45512a> arrayList = f130144b;
        synchronized (arrayList) {
            Log.m105919d("MicroMsg.WebViewExtEventService", "notifyOnImagePreviewPositionChanged webViewId: %s, pos: %s, size: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(arrayList.size()));
            for (C45511f0.C45512a a : arrayList) {
                a.mo71048a(i, i2);
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }
}
