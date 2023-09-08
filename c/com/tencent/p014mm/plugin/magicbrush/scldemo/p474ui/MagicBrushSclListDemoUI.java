package com.tencent.p014mm.plugin.magicbrush.scldemo.p474ui;

import android.util.AttributeSet;
import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.mm_compose.MMComposeView;
import com.tencent.p014mm.p136ui.MMComposeActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import gy3.C8480h;
import java.util.Set;
import kotlin.Metadata;
import l52.C109271t;
import l52.C109272u;
import l52.C61217a;
import p415q0.C110261c;
import sx3.C110826x0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/magicbrush/scldemo/ui/MagicBrushSclListDemoUI;", "Lcom/tencent/mm/ui/MMComposeActivity;", "<init>", "()V", "mb-samples_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.magicbrush.scldemo.ui.MagicBrushSclListDemoUI */
public final class MagicBrushSclListDemoUI extends MMComposeActivity {
    public int getLayoutId() {
        return 1;
    }

    public View getLayoutView() {
        C109271t tVar = (C109271t) C39818r.f106831a.mo62444c(this).mo75002a(C109271t.class);
        tVar.getClass();
        MMComposeView mMComposeView = new MMComposeView(tVar.getActivity(), (AttributeSet) null, 2, (C8480h) null);
        mMComposeView.setContent(C110261c.m149879c(-2104384239, true, new C109272u(tVar)));
        return mMComposeView;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(C61217a.class, C109271t.class);
    }
}
