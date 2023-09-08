package g63;

import android.content.Context;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.MMActivity;
import p206nj.C11171e;

/* renamed from: g63.f */
public class C8237f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f27164d;

    /* renamed from: e */
    public final /* synthetic */ TextView f27165e;

    /* renamed from: f */
    public final /* synthetic */ Context f27166f;

    public C8237f(boolean z, TextView textView, Context context) {
        this.f27164d = z;
        this.f27165e = textView;
        this.f27166f = context;
    }

    public void run() {
        if (this.f27164d && this.f27165e != null && C11171e.m11046c(28)) {
            this.f27165e.requestFocus();
        }
        ((MMActivity) this.f27166f).showVKB();
    }
}
