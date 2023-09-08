package com.tencent.p014mm.p136ui.chatting.search.multi;

import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMComposeActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86737h0;
import java.util.Set;
import kotlin.Metadata;
import sk3.C13703i;
import sk3.C13704n0;
import sk3.C63971c0;
import sk3.C63979f0;
import sk3.C63995m;
import sk3.C64004q0;
import sk3.C64009r0;
import sk3.C64024v;
import sk3.C64028w;
import sk3.C64034y;
import sk3.C77723g0;
import sx3.C110826x0;
import vo3.C90852c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/ui/chatting/search/multi/FTSChattingConvMultiTabUI;", "Lcom/tencent/mm/ui/MMComposeActivity;", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C86737h0
@C90852c(0)
/* renamed from: com.tencent.mm.ui.chatting.search.multi.FTSChattingConvMultiTabUI */
public final class FTSChattingConvMultiTabUI extends MMComposeActivity {
    public int getLayoutId() {
        return C0966R.C0971layout.cvq;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(C13704n0.class, C64009r0.class, C64004q0.class, C64024v.class, C64034y.class, C63971c0.class, C77723g0.class, C64028w.class, C63979f0.class, C63995m.class, C13703i.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.FTSChattingConvMultiTabUI", "onCreate");
        showMMLogo();
        setMMTitle("");
        setActionbarColor(getContext().getResources().getColor(C0966R.color.f2927a));
    }
}
