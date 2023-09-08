package com.tencent.p014mm.plugin.appbrand.widget.recent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.appbrand.widget.recent.C85028b;
import xt0.C91343g;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.recent.AppBrandRecentView */
public abstract class AppBrandRecentView extends RecyclerView {

    /* renamed from: y1 */
    public C85016d f247743y1;

    /* renamed from: z1 */
    public C85028b.C85029a f247744z1;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.recent.AppBrandRecentView$a */
    public interface C85013a {
        /* renamed from: a */
        boolean mo116539a(View view, C91343g gVar, float f, float f2);

        /* renamed from: b */
        boolean mo116540b(View view, C91343g gVar, float f, float f2);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.recent.AppBrandRecentView$b */
    public interface C85014b<T> {
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.recent.AppBrandRecentView$c */
    public interface C85015c {
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.recent.AppBrandRecentView$d */
    public interface C85016d {
        /* renamed from: b */
        void mo103709b(int i);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.recent.AppBrandRecentView$e */
    public enum C85017e {
        RECENT_APP_BRAND,
        MY_APP_BRAND
    }

    public AppBrandRecentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public abstract RecyclerView.C16613e getAdapter();

    public abstract int getCount();

    public abstract C85013a getOnItemClickListener();

    public C85016d getRefreshListener() {
        return this.f247743y1;
    }

    public C85028b.C85029a getSceneFactory() {
        return this.f247744z1;
    }

    public abstract void setDataQuery(C85014b bVar);

    public abstract void setOnItemClickListener(C85013a aVar);

    public void setRefreshListener(C85016d dVar) {
        this.f247743y1 = dVar;
    }

    public void setSceneFactory(C85028b.C85029a aVar) {
        this.f247744z1 = aVar;
    }

    /* renamed from: x1 */
    public abstract void mo117963x1();

    /* renamed from: y1 */
    public abstract void mo117964y1();

    public AppBrandRecentView(Context context) {
        super(context, (AttributeSet) null);
    }
}
