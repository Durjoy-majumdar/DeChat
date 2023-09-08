package com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.C92993j;
import com.tencent.p014mm.plugin.choosemsgfile.p318ui.C93015m;
import com.tencent.p014mm.sdk.platformtools.Log;
import f11.C97792a;
import f40.C86709a0;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.choosemsgfile.logic.ui.a */
public abstract class C92977a extends RecyclerView.C16613e implements C92993j {

    /* renamed from: d */
    public C93015m f267793d;

    /* renamed from: e */
    public List<C97792a> f267794e;

    /* renamed from: f */
    public boolean f267795f = C86709a0.m107535s().mo121147n();

    /* renamed from: g */
    public C92993j.C92994a f267796g;

    public C92977a(C93015m mVar, List<C97792a> list) {
        this.f267793d = mVar;
        this.f267794e = list;
    }

    /* renamed from: F4 */
    public C97792a mo127392F4(int i) {
        List<C97792a> list = this.f267794e;
        if (list == null || list.size() <= i) {
            return null;
        }
        return this.f267794e.get(i);
    }

    public int getItemCount() {
        return this.f267794e.size();
    }

    public int getItemViewType(int i) {
        return mo127392F4(i).mo137124h();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List list) {
        mo127392F4(i).getClass();
        super.onBindViewHolder(zVar, i, list);
    }

    /* renamed from: x4 */
    public boolean mo127393x4() {
        return false;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        boolean z = this.f267795f;
        if (!z) {
            Log.m105921e("MicroMsg.BaseChooseFileAdapter", "[onBindViewHolder] isSDCardAvailable:%b", Boolean.valueOf(z));
            return;
        }
        mo127392F4(i).mo137126j(zVar, i, mo127392F4(i + 1));
    }
}
