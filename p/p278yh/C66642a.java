package p278yh;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.DragDownContainer;
import com.tencent.p014mm.view.recyclerview.InterceptRecyclerView;

/* renamed from: yh.a */
public class C66642a {

    /* renamed from: a */
    public final View f191619a;

    /* renamed from: b */
    public FrameLayout f191620b;

    /* renamed from: c */
    public Button f191621c;

    /* renamed from: d */
    public Button f191622d;

    /* renamed from: e */
    public ImageView f191623e;

    /* renamed from: f */
    public FrameLayout f191624f;

    /* renamed from: g */
    public FrameLayout f191625g;

    /* renamed from: h */
    public DragDownContainer f191626h;

    /* renamed from: i */
    public RelativeLayout f191627i;

    /* renamed from: j */
    public TextView f191628j;

    /* renamed from: k */
    public InterceptRecyclerView f191629k;

    public C66642a(View view) {
        this.f191619a = view;
    }

    /* renamed from: a */
    public TextView mo90688a() {
        if (this.f191628j == null) {
            this.f191628j = (TextView) this.f191619a.findViewById(C0966R.C0970id.f357453cx1);
        }
        return this.f191628j;
    }

    /* renamed from: b */
    public Button mo90689b() {
        if (this.f191622d == null) {
            this.f191622d = (Button) this.f191619a.findViewById(C0966R.C0970id.czt);
        }
        return this.f191622d;
    }

    /* renamed from: c */
    public Button mo90690c() {
        if (this.f191621c == null) {
            this.f191621c = (Button) this.f191619a.findViewById(C0966R.C0970id.czu);
        }
        return this.f191621c;
    }

    /* renamed from: d */
    public RelativeLayout mo90691d() {
        if (this.f191627i == null) {
            this.f191627i = (RelativeLayout) this.f191619a.findViewById(C0966R.C0970id.gse);
        }
        return this.f191627i;
    }

    /* renamed from: e */
    public InterceptRecyclerView mo90692e() {
        if (this.f191629k == null) {
            this.f191629k = (InterceptRecyclerView) this.f191619a.findViewById(C0966R.C0970id.iiq);
        }
        return this.f191629k;
    }
}
