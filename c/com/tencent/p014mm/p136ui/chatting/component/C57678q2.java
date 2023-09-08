package com.tencent.p014mm.p136ui.chatting.component;

import android.view.MenuItem;
import com.tencent.p014mm.live.api.LiveConfig;
import di3.C86312j;
import nj3.C11184p0;
import p744wt.C66190c;

/* renamed from: com.tencent.mm.ui.chatting.component.q2 */
public class C57678q2 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ GroupToolsComponet f165090d;

    public C57678q2(GroupToolsComponet groupToolsComponet) {
        this.f165090d = groupToolsComponet;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        Class cls = C66190c.class;
        if (i == 0) {
            ((C66190c) C86312j.m106911c(cls)).mo89934OG().mo90321a(this.f165090d.f215752d.mo91565f(), LiveConfig.m62801a(this.f165090d.f215752d.mo91577r(), 2));
        } else {
            ((C66190c) C86312j.m106911c(cls)).mo89934OG().mo90323c(this.f165090d.f215752d.mo91565f(), LiveConfig.m62801a(this.f165090d.f215752d.mo91577r(), 2));
        }
    }
}
