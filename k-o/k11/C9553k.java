package k11;

import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanCacheUI;
import qo3.C77398g;
import zt3.C119157j;

/* renamed from: k11.k */
public final class C9553k implements Runnable {

    /* renamed from: d */
    public int f29746d = 5;

    /* renamed from: e */
    public final /* synthetic */ C77398g f29747e;

    /* renamed from: f */
    public final /* synthetic */ TextView f29748f;

    /* renamed from: g */
    public final /* synthetic */ String f29749g;

    /* renamed from: h */
    public final /* synthetic */ CleanCacheUI f29750h;

    public C9553k(C77398g gVar, TextView textView, String str, CleanCacheUI cleanCacheUI) {
        this.f29747e = gVar;
        this.f29748f = textView;
        this.f29749g = str;
        this.f29750h = cleanCacheUI;
    }

    public void run() {
        int i = this.f29746d - 1;
        this.f29746d = i;
        if (i <= 0) {
            this.f29747e.dismiss();
            return;
        }
        this.f29748f.setText(this.f29749g + 10 + this.f29750h.getString(C0966R.string.m2e, new Object[]{Integer.valueOf(this.f29746d)}));
        C119157j jVar = (C119157j) C119157j.f356862d;
        jVar.getClass();
        jVar.mo183892w(this, 1000, false);
    }
}
