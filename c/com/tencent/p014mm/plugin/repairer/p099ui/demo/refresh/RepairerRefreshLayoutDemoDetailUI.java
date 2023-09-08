package com.tencent.p014mm.plugin.repairer.p099ui.demo.refresh;

import android.os.Bundle;
import androidx.fragment.app.C112919c0;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.repairer.p099ui.demo.refresh.fragment.DemoEightFragment;
import com.tencent.p014mm.plugin.repairer.p099ui.demo.refresh.fragment.DemoFiveFragment;
import com.tencent.p014mm.plugin.repairer.p099ui.demo.refresh.fragment.DemoFourFragment;
import com.tencent.p014mm.plugin.repairer.p099ui.demo.refresh.fragment.DemoNineFragment;
import com.tencent.p014mm.plugin.repairer.p099ui.demo.refresh.fragment.DemoOneFragment;
import com.tencent.p014mm.plugin.repairer.p099ui.demo.refresh.fragment.DemoSevFragment;
import com.tencent.p014mm.plugin.repairer.p099ui.demo.refresh.fragment.DemoSixFragment;
import com.tencent.p014mm.plugin.repairer.p099ui.demo.refresh.fragment.DemoThreeFragment;
import com.tencent.p014mm.plugin.repairer.p099ui.demo.refresh.fragment.DemoTwoFragment;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import gy3.C87412m;
import kotlin.Metadata;
import nj3.C88989a;
import vo3.C90852c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/RepairerRefreshLayoutDemoDetailUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(1)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.RepairerRefreshLayoutDemoDetailUI */
public final class RepairerRefreshLayoutDemoDetailUI extends MMSecDataActivity {

    /* renamed from: d */
    public int f163963d;

    public int getLayoutId() {
        return C0966R.C0971layout.bsg;
    }

    public void onCreate(Bundle bundle) {
        Fragment fragment;
        super.onCreate(bundle);
        this.f163963d = getIntent().getIntExtra("KEY_SHOW_TYPE", 0);
        C112919c0 beginTransaction = getSupportFragmentManager().beginTransaction();
        C87412m.m108593f(beginTransaction, "supportFragmentManager.beginTransaction()");
        switch (this.f163963d) {
            case 1:
                setMMTitle("RecyclerView Demo");
                fragment = new DemoOneFragment();
                break;
            case 2:
                setMMTitle("NestScrollView Demo");
                fragment = new DemoTwoFragment();
                break;
            case 3:
                setMMTitle("CoordinatorLayout Demo");
                fragment = new DemoThreeFragment();
                break;
            case 4:
                setMMTitle("ListView Demo");
                fragment = new DemoFourFragment();
                break;
            case 5:
                setMMTitle("Stagger Layout Demo");
                fragment = new DemoFiveFragment();
                break;
            case 6:
                setMMTitle("PageSnapHelper Demo");
                fragment = new DemoSixFragment();
                break;
            case 7:
                setMMTitle("NoMoreData Demo");
                fragment = new DemoSevFragment();
                break;
            case 8:
                setMMTitle("属性设置 Demo");
                fragment = new DemoEightFragment();
                break;
            case 9:
                setMMTitle("横向滑动 Demo");
                fragment = new DemoNineFragment();
                break;
            default:
                new DemoOneFragment();
                fragment = new Fragment();
                break;
        }
        beginTransaction.mo165167i(C0966R.C0970id.gvl, fragment, (String) null, 1);
        beginTransaction.mo165162d();
    }
}
