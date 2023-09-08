package com.tencent.p014mm.plugin.finder.activity.base.p048ui;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74779i;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import gy3.C87412m;
import kotlin.Metadata;
import ld1.C10486a;
import ld1.C10487b;
import nj3.C88989a;
import od1.C11396b;
import pe3.C47465a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/activity/base/ui/BaseProfileUI;", "Lpe3/a;", "T", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lld1/b;", "Lld1/a;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
/* renamed from: com.tencent.mm.plugin.finder.activity.base.ui.BaseProfileUI */
public class BaseProfileUI<T extends C47465a> extends MMFinderUI implements C10487b, C10486a<T> {

    /* renamed from: o */
    public final C11396b<T> f12456o = new C11396b<>();

    /* renamed from: V3 */
    public C11396b<T> mo2195V3() {
        return this.f12456o;
    }

    public void onCreate(Bundle bundle) {
        overridePendingTransition(C0966R.C0968anim.f2503er, C0966R.C0968anim.f2498em);
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(C0966R.color.ahf));
        View decorView = getWindow().getDecorView();
        C87412m.m108593f(decorView, "window.decorView");
        decorView.setSystemUiVisibility(1280);
        C74779i.m89536a(this, false);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91112w(new ColorDrawable(0));
            supportActionBar.mo91104o();
        }
    }

    /* renamed from: z5 */
    public int mo2197z5() {
        return 0;
    }
}
