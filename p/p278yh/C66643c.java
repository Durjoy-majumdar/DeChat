package p278yh;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;

/* renamed from: yh.c */
public class C66643c {

    /* renamed from: a */
    public final View f191630a;

    /* renamed from: b */
    public FrameLayout f191631b;

    /* renamed from: c */
    public FrameLayout f191632c;

    /* renamed from: d */
    public WxRecyclerView f191633d;

    /* renamed from: e */
    public RelativeLayout f191634e;

    /* renamed from: f */
    public TextView f191635f;

    public C66643c(View view) {
        this.f191630a = view;
    }

    /* renamed from: a */
    public WxRecyclerView mo90693a() {
        if (this.f191633d == null) {
            this.f191633d = (WxRecyclerView) this.f191630a.findViewById(C0966R.C0970id.e6k);
        }
        return this.f191633d;
    }

    /* renamed from: b */
    public RelativeLayout mo90694b() {
        if (this.f191634e == null) {
            this.f191634e = (RelativeLayout) this.f191630a.findViewById(C0966R.C0970id.gse);
        }
        return this.f191634e;
    }
}
