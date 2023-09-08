package com.tencent.p014mm.plugin.finder.activity.music.p049ui;

import android.os.Bundle;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.activity.base.p048ui.BaseProfileUI;
import com.tencent.p014mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC;
import ht1.C8807v3;
import java.util.Set;
import kotlin.Metadata;
import od1.C11396b;
import sx3.C110826x0;
import te3.C51270sn1;
import ud1.C14155a;
import ud1.C14156b;
import ud1.C14175t;
import ud1.C14176u;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/activity/music/ui/FinderMusicTopicUI;", "Lcom/tencent/mm/plugin/finder/activity/base/ui/BaseProfileUI;", "Lte3/sn1;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.activity.music.ui.FinderMusicTopicUI */
public class FinderMusicTopicUI extends BaseProfileUI<C51270sn1> {

    /* renamed from: p */
    public final C11396b<C51270sn1> f12471p = new C11396b<>();

    /* renamed from: I7 */
    public int mo2194I7() {
        return 138;
    }

    /* renamed from: V3 */
    public C11396b<C51270sn1> mo2195V3() {
        return this.f12471p;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(C14175t.class, C14155a.class, FinderMusicTopicHeaderUIC.class, C14156b.class, C14176u.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C8807v3) C39818r.f106831a.mo62444c(this).mo62447c(C8807v3.class)).mo9633R2(true);
    }

    /* renamed from: z5 */
    public int mo2197z5() {
        return C0966R.C0971layout.c99;
    }
}
