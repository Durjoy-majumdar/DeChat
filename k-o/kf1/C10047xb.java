package kf1;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import pe3.C89349b;
import ur1.C14378f;

/* renamed from: kf1.xb */
public interface C10047xb {
    /* renamed from: a */
    RecyclerView.C0129l mo2531a(Context context);

    /* renamed from: b */
    RecyclerView.LayoutManager mo2532b(Context context);

    /* renamed from: c */
    WxRecyclerAdapter<?> mo2533c(Context context);

    /* renamed from: d */
    void mo2534d(Context context, FrameLayout frameLayout);

    /* renamed from: e */
    int mo2550e();

    /* renamed from: f */
    void mo2535f(View view);

    /* renamed from: g */
    void mo2536g(C14378f fVar, FinderItem finderItem, C89349b bVar);

    int getScene();

    void onDetach();
}
