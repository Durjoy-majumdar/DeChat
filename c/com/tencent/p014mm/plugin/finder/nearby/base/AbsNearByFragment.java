package com.tencent.p014mm.plugin.finder.nearby.base;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.finder.nearby.person.NearbyPersonFragment;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.MMFinderFragment;
import eb0.C31543z5;
import kotlin.Metadata;
import ln1.C10585g;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/nearby/base/AbsNearByFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/MMFinderFragment;", "<init>", "()V", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment */
public abstract class AbsNearByFragment extends MMFinderFragment {

    /* renamed from: j */
    public int f15525j;

    /* renamed from: n */
    public String f15526n;

    /* renamed from: o */
    public int f15527o;

    /* renamed from: p */
    public String f15528p;

    /* renamed from: q */
    public String f15529q;

    public AbsNearByFragment() {
        this.f15528p = "";
        this.f15529q = "";
        this.f15526n = "";
        this.f15527o = -1;
    }

    /* renamed from: P */
    public void mo3550P() {
        super.mo3550P();
    }

    /* renamed from: R */
    public int mo2203R() {
        return 0;
    }

    /* renamed from: S */
    public String mo3551S() {
        if (TextUtils.isEmpty(this.f15529q) && !TextUtils.isEmpty(mo3552T())) {
            this.f15529q = mo3552T() + '-' + C31543z5.m39453c();
        }
        return this.f15529q;
    }

    /* renamed from: T */
    public String mo3552T() {
        return "";
    }

    /* renamed from: U */
    public String mo3553U() {
        return this.f15528p;
    }

    /* renamed from: V */
    public String mo3554V() {
        return "1001";
    }

    /* renamed from: X */
    public int mo3555X() {
        return 3;
    }

    /* renamed from: Y */
    public boolean mo3556Y() {
        return !(this instanceof NearbyPersonFragment);
    }

    /* renamed from: Z */
    public void mo3557Z() {
    }

    /* renamed from: a0 */
    public void mo3558a0() {
    }

    /* renamed from: d0 */
    public void mo3559d0() {
    }

    public void onResume() {
        if (mo3556Y()) {
            C10585g.f31933a.mo10847e(this);
        }
        super.onResume();
    }

    public AbsNearByFragment(int i, int i2) {
        this.f15526n = "";
        this.f15528p = "";
        this.f15529q = "";
        this.f15525j = i;
        this.f15527o = i2;
    }
}
