package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.p136ui.base.preference.IconPreference;
import di3.C86312j;
import f40.C86709a0;
import jr2.C99018v;
import p196ln.C76705f;

/* renamed from: com.tencent.mm.ui.FriendSnsPreference */
public final class FriendSnsPreference extends IconPreference {

    /* renamed from: l1 */
    public String f214218l1;

    /* renamed from: m1 */
    public long f214219m1;

    /* renamed from: n1 */
    public Context f214220n1;

    public FriendSnsPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        if (this.f214218l1 != null && C86709a0.m107522a()) {
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(this.f215051L, this.f214218l1);
        }
        if (this.f214219m1 != 0 && this.f215051L != null) {
            ((C99018v) C86312j.m106911c(C99018v.class)).mo138363bU(this.f214219m1, this.f215051L, this.f121274d.hashCode());
        }
    }

    public FriendSnsPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FriendSnsPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f214218l1 = null;
        this.f214220n1 = context;
    }
}
