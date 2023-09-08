package com.tencent.p014mm.plugin.appbrand.widget.desktop;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.d */
public interface C68688d {

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.d$a */
    public interface C68689a {
        /* renamed from: a */
        void mo94423a(float f, float f2);

        /* renamed from: b */
        void mo94424b(int i, int i2, Object obj);

        /* renamed from: c */
        void mo94425c(int i, boolean z, boolean z2);

        /* renamed from: d */
        void mo94426d(Object obj, int i);

        /* renamed from: e */
        void mo94427e(Object obj, int i);

        /* renamed from: f */
        void mo94428f(Object obj);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.d$b */
    public interface C68690b {
    }

    /* renamed from: a */
    void mo94477a();

    /* renamed from: b */
    void mo94478b(boolean z);

    /* renamed from: c */
    void mo94479c(RecyclerView.C16631z zVar, int i);

    RecyclerView getRecyclerView();

    void setAppBrandDragCallback(C68689a aVar);

    void setCanMyWeAppMove(boolean z);

    void setList(List list);

    void setRecyclerView(RecyclerView recyclerView);

    void setSectionCallback(C68690b bVar);

    void setShouldDoDeleteAnimation(boolean z);

    void setViewWidth(int i);
}
