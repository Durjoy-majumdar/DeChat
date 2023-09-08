package v02;

import android.content.Context;
import com.tencent.p014mm.plugin.p064hp.util.TinkerSyncResponse;

/* renamed from: v02.b */
public class C90735b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f260622d;

    /* renamed from: e */
    public final /* synthetic */ String f260623e;

    /* renamed from: f */
    public final /* synthetic */ TinkerSyncResponse f260624f;

    public C90735b(Context context, String str, TinkerSyncResponse tinkerSyncResponse) {
        this.f260622d = context;
        this.f260623e = str;
        this.f260624f = tinkerSyncResponse;
    }

    public void run() {
        C90734a.m113786c(this.f260622d, this.f260623e, this.f260624f);
    }
}
