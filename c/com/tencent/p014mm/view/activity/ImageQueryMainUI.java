package com.tencent.p014mm.view.activity;

import android.os.Bundle;
import aq3.C54301o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMComposeActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import java.util.Set;
import kotlin.Metadata;
import sx3.C22415w0;
import vo3.C90852c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/view/activity/ImageQueryMainUI;", "Lcom/tencent/mm/ui/MMComposeActivity;", "<init>", "()V", "compose-image-query_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C90852c(0)
/* renamed from: com.tencent.mm.view.activity.ImageQueryMainUI */
public final class ImageQueryMainUI extends MMComposeActivity {
    public int getLayoutId() {
        return C0966R.C0971layout.cnq;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C22415w0.m26092a(C54301o.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(C0966R.color.f2947a4));
        hideTitleView();
        setNavigationbarColor(getContext().getResources().getColor(C0966R.color.f2947a4));
    }
}
