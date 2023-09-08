package ye1;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMProcessBar;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.TouchableLayout;
import p192l4.C10461a;
import p192l4.C10462b;

/* renamed from: ye1.h */
public final class C53517h implements C10461a {

    /* renamed from: a */
    public final RecyclerView f150477a;

    /* renamed from: b */
    public final TextView f150478b;

    /* renamed from: c */
    public final MMProcessBar f150479c;

    /* renamed from: d */
    public final RefreshLoadMoreLayout f150480d;

    public C53517h(TouchableLayout touchableLayout, RecyclerView recyclerView, TextView textView, TouchableLayout touchableLayout2, MMProcessBar mMProcessBar, RefreshLoadMoreLayout refreshLoadMoreLayout) {
        this.f150477a = recyclerView;
        this.f150478b = textView;
        this.f150479c = mMProcessBar;
        this.f150480d = refreshLoadMoreLayout;
    }

    /* renamed from: a */
    public static C53517h m60070a(View view) {
        int i = C0966R.C0970id.btc;
        RecyclerView recyclerView = (RecyclerView) C10462b.m10395a(view, C0966R.C0970id.btc);
        if (recyclerView != null) {
            i = C0966R.C0970id.cj7;
            TextView textView = (TextView) C10462b.m10395a(view, C0966R.C0970id.cj7);
            if (textView != null) {
                TouchableLayout touchableLayout = (TouchableLayout) view;
                i = C0966R.C0970id.f358616g30;
                MMProcessBar mMProcessBar = (MMProcessBar) C10462b.m10395a(view, C0966R.C0970id.f358616g30);
                if (mMProcessBar != null) {
                    i = C0966R.C0970id.ivb;
                    RefreshLoadMoreLayout refreshLoadMoreLayout = (RefreshLoadMoreLayout) C10462b.m10395a(view, C0966R.C0970id.ivb);
                    if (refreshLoadMoreLayout != null) {
                        return new C53517h(touchableLayout, recyclerView, textView, touchableLayout, mMProcessBar, refreshLoadMoreLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
