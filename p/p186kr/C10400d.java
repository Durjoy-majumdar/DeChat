package p186kr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePlayerViewRecycler;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import di3.C86301e;
import ei3.C86522b;
import fm1.C8137c;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import p204mr.C11078h;
import p204mr.C11080k;
import pm1.C62381d;

@C86522b
/* renamed from: kr.d */
public final class C10400d extends C86301e implements C11080k {
    public C11078h Jk0(AppCompatActivity appCompatActivity) {
        C87412m.m108594g(appCompatActivity, "context");
        ((NearbyLivePlayerViewRecycler) C39818r.f106831a.mo62446e(C8137c.class).mo75002a(NearbyLivePlayerViewRecycler.class)).mo11321n2(appCompatActivity);
        return new C62381d(appCompatActivity, (RecyclerView) null, new ArrayList(), false, 0, true, false, true, (WxRecyclerAdapter) null, 256, (C8480h) null);
    }
}
