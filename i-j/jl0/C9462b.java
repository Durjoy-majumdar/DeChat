package jl0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.p014mm.C0966R;
import p910lj.C76701a;

/* renamed from: jl0.b */
public class C9462b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f29533d;

    /* renamed from: e */
    public final /* synthetic */ String f29534e;

    public C9462b(Context context, String str) {
        this.f29533d = context;
        this.f29534e = str;
    }

    public void run() {
        Toast makeText = C76701a.makeText(this.f29533d, (CharSequence) "", 3000);
        View inflate = View.inflate(this.f29533d, C0966R.C0971layout.c_8, (ViewGroup) null);
        ((TextView) inflate.findViewById(C0966R.C0970id.kpy)).setText(this.f29534e);
        makeText.setGravity(17, 0, 0);
        makeText.setView(inflate);
        makeText.show();
    }
}
