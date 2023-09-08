package com.tencent.p014mm.p136ui;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.C103765p0;
import androidx.lifecycle.C54216o0;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import kotlin.Metadata;
import p1094c4.C104293d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/ui/MMComposeActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.MMComposeActivity */
public abstract class MMComposeActivity extends MMActivity {
    public void onCreate(Bundle bundle) {
        View decorView = getWindow().getDecorView();
        C87412m.m108593f(decorView, "window.decorView");
        if (C54216o0.m60904a(decorView) == null) {
            decorView.setTag(C0966R.C0970id.l8r, this);
        }
        if (C103765p0.m138169a(decorView) == null) {
            decorView.setTag(C0966R.C0970id.l8t, this);
        }
        if (C104293d.m139244a(decorView) == null) {
            C104293d.m139245b(decorView, this);
        }
        super.onCreate(bundle);
    }
}
