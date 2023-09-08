package jq3;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import gy3.C87412m;
import java.util.List;
import jq3.C9493c;

/* renamed from: jq3.i */
public class C60896i<D extends C9493c> {

    /* renamed from: d */
    public boolean f173479d;

    /* renamed from: a */
    public View mo13760a(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recyclerView");
        return null;
    }

    /* renamed from: b */
    public C60905o mo25318b(RecyclerView recyclerView, View view) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(view, "convertView");
        return null;
    }

    /* renamed from: c */
    public int mo43c() {
        return -1;
    }

    /* renamed from: d */
    public void mo2292d(RecyclerView recyclerView, WxRecyclerAdapter<?> wxRecyclerAdapter) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(wxRecyclerAdapter, "adapter");
        this.f173479d = true;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, D d, int i, int i2, boolean z, List<Object> list) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(d, "item");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: g */
    public void mo2296g(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recyclerView");
        this.f173479d = false;
    }

    /* renamed from: h */
    public void mo85791h(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: i */
    public void mo735i(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
    }
}
