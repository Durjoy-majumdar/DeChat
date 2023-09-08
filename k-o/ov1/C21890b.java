package ov1;

import android.content.Context;
import android.view.View;
import java.util.List;
import ov1.C21891f;
import pv1.C22019b;

/* renamed from: ov1.b */
public abstract class C21890b implements C21891f {

    /* renamed from: d */
    public C21891f.C21893b f61901d;

    /* renamed from: e */
    public Context f61902e;

    /* renamed from: f */
    public int f61903f;

    public C21890b(Context context, C21891f.C21893b bVar, int i) {
        this.f61902e = context;
        this.f61901d = bVar;
        this.f61903f = i;
    }

    /* renamed from: b */
    public boolean mo17718b(View view, C22019b bVar, boolean z) {
        return false;
    }

    /* renamed from: j */
    public boolean mo34916j(List<? extends Object> list) {
        return list != null && list.size() > 0;
    }
}
