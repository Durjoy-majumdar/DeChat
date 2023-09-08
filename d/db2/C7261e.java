package db2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import p192l4.C10461a;
import p192l4.C10462b;

/* renamed from: db2.e */
public final class C7261e implements C10461a {

    /* renamed from: a */
    public final WxRecyclerView f25322a;

    public C7261e(FrameLayout frameLayout, LinearLayout linearLayout, TextView textView, WxRecyclerView wxRecyclerView, FrameLayout frameLayout2, RefreshLoadMoreLayout refreshLoadMoreLayout) {
        this.f25322a = wxRecyclerView;
    }

    /* renamed from: a */
    public static C7261e m7442a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0966R.C0971layout.bjc, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0966R.C0970id.cj9;
        LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(inflate, C0966R.C0970id.cj9);
        if (linearLayout != null) {
            i = C0966R.C0970id.g3r;
            TextView textView = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.g3r);
            if (textView != null) {
                i = C0966R.C0970id.h5o;
                WxRecyclerView wxRecyclerView = (WxRecyclerView) C10462b.m10395a(inflate, C0966R.C0970id.h5o);
                if (wxRecyclerView != null) {
                    FrameLayout frameLayout = (FrameLayout) inflate;
                    i = C0966R.C0970id.kd5;
                    RefreshLoadMoreLayout refreshLoadMoreLayout = (RefreshLoadMoreLayout) C10462b.m10395a(inflate, C0966R.C0970id.kd5);
                    if (refreshLoadMoreLayout != null) {
                        return new C7261e(frameLayout, linearLayout, textView, wxRecyclerView, frameLayout, refreshLoadMoreLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
