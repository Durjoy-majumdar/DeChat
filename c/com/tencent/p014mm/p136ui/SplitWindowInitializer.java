package com.tencent.p014mm.p136ui;

import android.content.Context;
import androidx.window.embedding.SplitController;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.List;
import kotlin.Metadata;
import p1109f4.C107471b;
import sx3.C64186f0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/ui/SplitWindowInitializer;", "Lf4/b;", "Landroidx/window/embedding/SplitController;", "<init>", "()V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.SplitWindowInitializer */
public final class SplitWindowInitializer implements C107471b<SplitController> {
    /* renamed from: a */
    public Object mo119723a(Context context) {
        C87412m.m108594g(context, "context");
        if (C85861e4.m106120g()) {
            SplitController.Companion.initialize(context, C0966R.xml.f8914k);
        }
        return SplitController.Companion.getInstance();
    }

    public List<Class<? extends C107471b<?>>> dependencies() {
        return C64186f0.f181907d;
    }
}
