package com.tencent.p014mm.plugin.textstatus.p112ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b03.C39697g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import cz2.C45242t;
import fy3.C32224a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import lz2.C34452l;
import rx3.C13598b0;
import uo3.C78253a;
import yz2.C53719r2;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusRecentStatusView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "d", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "mContext", "Lcz2/t;", "h", "Lcz2/t;", "getOnItemClickListener", "()Lcz2/t;", "setOnItemClickListener", "(Lcz2/t;)V", "onItemClickListener", "Lkotlin/Function0;", "Lrx3/b0;", "i", "Lfy3/a;", "getOnRemoveListener", "()Lfy3/a;", "setOnRemoveListener", "(Lfy3/a;)V", "onRemoveListener", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusRecentStatusView */
public class TextStatusRecentStatusView extends FrameLayout {

    /* renamed from: d */
    public final Context f117005d;

    /* renamed from: e */
    public View f117006e;

    /* renamed from: f */
    public RecyclerView f117007f;

    /* renamed from: g */
    public ArrayList<C34452l> f117008g;

    /* renamed from: h */
    public C45242t f117009h;

    /* renamed from: i */
    public C32224a<C13598b0> f117010i;

    /* renamed from: j */
    public C78253a f117011j;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TextStatusRecentStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "mContext");
    }

    public final Context getMContext() {
        return this.f117005d;
    }

    public final C45242t getOnItemClickListener() {
        return this.f117009h;
    }

    public final C32224a<C13598b0> getOnRemoveListener() {
        return this.f117010i;
    }

    public final void setOnItemClickListener(C45242t tVar) {
        this.f117009h = tVar;
    }

    public final void setOnRemoveListener(C32224a<C13598b0> aVar) {
        this.f117010i = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextStatusRecentStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "mContext");
        this.f117005d = context;
        this.f117008g = new ArrayList<>();
        List<C34452l> c = C39697g.f106502a.mo62325c();
        this.f117008g.clear();
        this.f117008g.addAll(c);
        Log.m105925i("MicroMsg.TextStatus.TextStatusRecentUseView", "initData: size:%s", Integer.valueOf(this.f117008g.size()));
        if (this.f117008g.isEmpty()) {
            setVisibility(8);
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.d3g, this);
        this.f117006e = inflate;
        if (inflate != null) {
            this.f117007f = (RecyclerView) inflate.findViewById(C0966R.C0970id.npc);
        }
        RecyclerView recyclerView = this.f117007f;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
        }
        RecyclerView recyclerView2 = this.f117007f;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(context, 0, false));
        }
        WxRecyclerAdapter wxRecyclerAdapter = new WxRecyclerAdapter(new TextStatusRecentStatusView$buildItemConverts$1(this), this.f117008g, false);
        RecyclerView recyclerView3 = this.f117007f;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(wxRecyclerAdapter);
        }
        wxRecyclerAdapter.f173487n = new C53719r2(this);
    }
}
