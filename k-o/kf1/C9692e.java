package kf1;

import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import gy3.C87412m;

/* renamed from: kf1.e */
public final class C9692e implements FinderVideoCore.C56519a {

    /* renamed from: a */
    public final /* synthetic */ C9640c f30098a;

    public C9692e(C9640c cVar) {
        this.f30098a = cVar;
    }

    /* renamed from: a */
    public boolean mo3742a() {
        return true;
    }

    /* renamed from: b */
    public boolean mo3743b() {
        return true;
    }

    /* renamed from: c */
    public RecyclerView mo3744c() {
        C9707f fVar = this.f30098a.f29964g;
        C87412m.m108591d(fVar);
        return fVar.getRecyclerView();
    }

    public DataBuffer<C0740i2> getData() {
        return this.f30098a.mo2491f0();
    }
}
