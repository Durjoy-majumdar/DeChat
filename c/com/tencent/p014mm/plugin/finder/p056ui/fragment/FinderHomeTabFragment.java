package com.tencent.p014mm.plugin.finder.p056ui.fragment;

import android.os.Bundle;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/MMFinderFragment;", "<init>", "()V", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment */
public abstract class FinderHomeTabFragment extends MMFinderFragment {

    /* renamed from: j */
    public int f17332j;

    /* renamed from: n */
    public String f17333n;

    /* renamed from: o */
    public int f17334o;

    /* renamed from: p */
    public Bundle f17335p;

    public FinderHomeTabFragment() {
        this.f17333n = "";
        this.f17332j = -1;
        this.f17334o = -1;
    }

    /* renamed from: O */
    public void mo2202O() {
        super.mo2202O();
    }

    /* renamed from: P */
    public void mo3550P() {
        super.mo3550P();
        this.f17335p = null;
    }

    /* renamed from: S */
    public void mo4177S() {
    }

    /* renamed from: T */
    public void mo4178T() {
    }

    /* renamed from: U */
    public int mo4179U() {
        return 0;
    }

    public boolean onBackPressed() {
        return false;
    }

    public FinderHomeTabFragment(int i) {
        this.f17333n = "";
        this.f17332j = -1;
        this.f17334o = i;
    }

    public FinderHomeTabFragment(int i, int i2) {
        this.f17333n = "";
        this.f17332j = i;
        this.f17334o = i2;
    }
}
