package com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.choosemsgfile.p318ui.C93015m;
import f11.C97792a;
import f11.C97805n;
import f11.C97806o;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.choosemsgfile.logic.ui.c */
public class C92979c extends C92977a {

    /* renamed from: h */
    public boolean f267800h;

    public C92979c(C93015m mVar, List<C97792a> list) {
        super(mVar, list);
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != 0) {
            int i2 = C97806o.f286905L;
            return new C97806o(LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f6995uf, viewGroup, false));
        }
        int i3 = C97805n.f286901C;
        return new C97805n(LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f6994ue, viewGroup, false));
    }

    /* renamed from: x4 */
    public boolean mo127393x4() {
        return this.f267800h;
    }
}
