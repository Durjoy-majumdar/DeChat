package com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.choosemsgfile.p318ui.C93015m;
import f11.C97792a;
import f11.C97805n;
import f11.C97809p;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.choosemsgfile.logic.ui.d */
public class C92980d extends C92977a {
    public C92980d(C93015m mVar, List<C97792a> list) {
        super(mVar, list);
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != 0) {
            int i2 = C97809p.f286919M;
            return new C97809p(LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f6996ug, viewGroup, false));
        }
        int i3 = C97805n.f286901C;
        return new C97805n(LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f6994ue, viewGroup, false));
    }
}
