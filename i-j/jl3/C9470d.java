package jl3;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import xd3.C78802b;

/* renamed from: jl3.d */
public class C9470d extends C78802b {

    /* renamed from: h */
    public View f29546h;

    public C9470d(Context context) {
        super(context);
        View view = this.f230569f;
        if (view != null) {
            this.f29546h = view.findViewById(C0966R.C0970id.f358877hl0);
            ((TextView) this.f230569f.findViewById(C0966R.C0970id.ebm)).setText(context.getString(C0966R.string.b7q));
        }
    }

    /* renamed from: a */
    public void mo7968a() {
    }

    /* renamed from: b */
    public int mo7969b() {
        return C0966R.C0971layout.f6837pw;
    }
}
