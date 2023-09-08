package kf1;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import ur1.C65467c;

/* renamed from: kf1.yb */
public interface C61072yb {
    /* renamed from: a */
    RecyclerView.C0129l mo85978a(Context context);

    /* renamed from: b */
    RecyclerView.LayoutManager mo85979b(Context context);

    /* renamed from: c */
    WxRecyclerAdapter<?> mo85980c(Context context);

    /* renamed from: d */
    void mo85981d(Context context, FrameLayout frameLayout);

    /* renamed from: e */
    int mo85982e();

    /* renamed from: f */
    void mo85983f(View view);

    /* renamed from: g */
    void mo85984g(C65467c cVar, FinderItem finderItem);

    int getScene();

    void onDetach();
}
