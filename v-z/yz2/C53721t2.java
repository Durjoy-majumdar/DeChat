package yz2;

import android.view.MenuItem;
import androidx.recyclerview.widget.RecyclerView;
import b03.C39697g;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusRecentStatusView;
import fy3.C32224a;
import lz2.C34452l;
import nj3.C11184p0;
import rx3.C13598b0;
import uo3.C78253a;

/* renamed from: yz2.t2 */
public final class C53721t2 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C34452l f150830d;

    /* renamed from: e */
    public final /* synthetic */ TextStatusRecentStatusView f150831e;

    /* renamed from: f */
    public final /* synthetic */ int f150832f;

    /* renamed from: g */
    public final /* synthetic */ RecyclerView f150833g;

    public C53721t2(C34452l lVar, TextStatusRecentStatusView textStatusRecentStatusView, int i, RecyclerView recyclerView) {
        this.f150830d = lVar;
        this.f150831e = textStatusRecentStatusView;
        this.f150832f = i;
        this.f150833g = recyclerView;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C32224a<C13598b0> onRemoveListener;
        C39697g.f106502a.mo62323a(this.f150830d);
        this.f150831e.f117008g.remove(this.f150832f);
        RecyclerView.C16613e adapter = this.f150833g.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        if (this.f150831e.f117008g.isEmpty() && (onRemoveListener = this.f150831e.getOnRemoveListener()) != null) {
            onRemoveListener.invoke();
        }
        C78253a aVar = this.f150831e.f117011j;
        if (aVar != null) {
            aVar.mo108266a();
        }
    }
}
