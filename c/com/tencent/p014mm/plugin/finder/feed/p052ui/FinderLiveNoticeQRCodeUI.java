package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74779i;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import gy3.C87412m;
import java.util.Set;
import kotlin.Metadata;
import nj3.C88989a;
import sx3.C22415w0;
import wg1.C15278g3;
import wg1.C15370z1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveNoticeQRCodeUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveNoticeQRCodeUI */
public final class FinderLiveNoticeQRCodeUI extends MMFinderUI {
    public Set<Class<? extends UIComponent>> importUIComponents() {
        return getIntent().getBooleanExtra("KEY_FINDER_LIVE_NOTICE_QR_IS_VISITOR", false) ? C22415w0.m26092a(C15278g3.class) : C22415w0.m26092a(C15370z1.class);
    }

    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        View decorView = getWindow().getDecorView();
        C87412m.m108593f(decorView, "window.decorView");
        decorView.setSystemUiVisibility(1280);
        C74779i.m89536a(this, false);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91112w(new ColorDrawable(0));
            supportActionBar.mo91104o();
        }
        getWindow().setStatusBarColor(0);
        getController().mo177059O0(this, getResources().getColor(C0966R.color.ahf));
        C85875k4.m106175c0(getWindow(), true ^ C85875k4.m106211z());
    }
}
