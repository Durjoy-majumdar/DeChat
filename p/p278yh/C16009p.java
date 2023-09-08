package p278yh;

import android.view.View;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;

/* renamed from: yh.p */
public class C16009p {

    /* renamed from: a */
    public final View f43069a;

    /* renamed from: b */
    public Button f43070b;

    /* renamed from: c */
    public Button f43071c;

    /* renamed from: d */
    public Button f43072d;

    /* renamed from: e */
    public WxRecyclerView f43073e;

    public C16009p(View view) {
        this.f43069a = view;
    }

    /* renamed from: a */
    public WxRecyclerView mo14636a() {
        if (this.f43073e == null) {
            this.f43073e = (WxRecyclerView) this.f43069a.findViewById(C0966R.C0970id.iiq);
        }
        return this.f43073e;
    }
}
