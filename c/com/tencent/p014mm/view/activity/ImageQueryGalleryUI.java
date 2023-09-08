package com.tencent.p014mm.view.activity;

import android.os.Bundle;
import aq3.C54290a;
import aq3.C92068g;
import aq3.C92069h;
import aq3.C92075j;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85864g1;
import com.tencent.p014mm.p136ui.MMComposeActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import di3.C86312j;
import java.util.Set;
import kotlin.Metadata;
import nj3.C88989a;
import p625nu.C100196e;
import sx3.C110826x0;
import vo3.C90852c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/view/activity/ImageQueryGalleryUI;", "Lcom/tencent/mm/ui/MMComposeActivity;", "<init>", "()V", "compose-image-query_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.view.activity.ImageQueryGalleryUI */
public final class ImageQueryGalleryUI extends MMComposeActivity {
    public int getLayoutId() {
        return C0966R.C0971layout.cnp;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(C92075j.class, C92068g.class, C92069h.class, C54290a.class);
    }

    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(109);
        super.onCreate(bundle);
        setSelfNavigationBarVisible(8);
        getWindow().setFlags(201327616, 201327616);
        ((C100196e) C86312j.m106911c(C100196e.class)).il0(true);
        C85864g1.m106128c(this);
        getWindow().setFormat(-3);
        hideTitleView();
        setLightNavigationbarIcon();
    }
}
