package com.tencent.p014mm.view.activity;

import android.content.res.Resources;
import android.os.Bundle;
import aq3.C54313w;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMComposeActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import java.util.Set;
import kotlin.Metadata;
import p157gk.C59491j;
import sx3.C22415w0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/view/activity/ImageQueryPersonUI;", "Lcom/tencent/mm/ui/MMComposeActivity;", "<init>", "()V", "compose-image-query_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.view.activity.ImageQueryPersonUI */
public final class ImageQueryPersonUI extends MMComposeActivity {
    public int getLayoutId() {
        return C0966R.C0971layout.cnr;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C22415w0.m26092a(C54313w.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Resources resources = getContext().getResources();
        boolean z = C59491j.f169996a;
        int i = C0966R.color.f2927a;
        setActionbarColor(resources.getColor(z ? C0966R.color.f2927a : C0966R.color.f2947a4));
        hideTitleView();
        Resources resources2 = getContext().getResources();
        if (!C59491j.f169996a) {
            i = C0966R.color.f2947a4;
        }
        setNavigationbarColor(resources2.getColor(i));
    }
}
