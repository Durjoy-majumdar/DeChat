package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.luckymoney.model.C69203d1;
import com.tencent.p014mm.wallet_core.model.C75125m;
import com.tencent.p014mm.wallet_core.model.C75127o;
import cr3.C75281f;
import java.util.LinkedList;
import java.util.List;
import nj3.C76879j;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI */
public abstract class LuckyMoneyBaseUI extends MMActivity implements C75281f, C75125m {

    /* renamed from: d */
    public C69203d1 f199660d = null;

    /* renamed from: e */
    public boolean f199661e = true;

    /* renamed from: f */
    public LinkedList<C75127o> f199662f = new LinkedList<>();

    /* renamed from: H7 */
    public void mo95517H7() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo91104o();
        }
    }

    /* renamed from: I7 */
    public void mo95518I7() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo91094L();
            setActionbarColor(getResources().getColor(C0966R.color.a2o));
        }
    }

    public void addSceneEndListener(int i) {
        this.f199660d.mo95363c(i);
    }

    public void doSceneProgress(C117747y yVar, boolean z) {
        this.f199660d.mo95364d(yVar, z);
    }

    public void forceCancel() {
        this.f199660d.mo95365e();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (C75127o onActivityResult : (List) this.f199662f.clone()) {
            onActivityResult.onActivityResult(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        C69203d1 d1Var = new C69203d1(this, this);
        this.f199660d = d1Var;
        d1Var.mo95363c(1554);
        this.f199660d.mo95363c(1575);
        this.f199660d.mo95363c(1668);
        this.f199660d.mo95363c(1581);
        this.f199660d.mo95363c(1685);
        this.f199660d.mo95363c(1585);
        this.f199660d.mo95363c(1514);
        this.f199660d.mo95363c(1682);
        this.f199660d.mo95363c(1612);
        this.f199660d.mo95363c(1643);
        this.f199660d.mo95363c(1558);
        this.f199660d.mo95363c(2715);
        this.f199660d.mo95363c(4605);
        this.f199660d.mo95363c(4915);
        this.f199660d.mo95363c(4536);
        this.f199660d.mo95363c(5148);
        this.f199660d.mo95363c(4395);
        this.f199660d.mo95363c(2832);
        this.f199660d.mo95363c(1647);
        this.f199660d.mo95363c(4373);
        this.f199660d.mo95363c(4595);
        this.f199660d.mo95363c(4339);
        this.f199660d.mo95363c(4717);
        this.f199660d.mo95363c(4878);
        setActionbarColor(getResources().getColor(C0966R.color.a2o));
        if (this.f199661e) {
            setActionbarElementColor(getResources().getColor(C0966R.color.a2w));
        }
        getLayoutId();
        for (C75127o onCreate : (List) this.f199662f.clone()) {
            onCreate.onCreate();
        }
    }

    public void onDestroy() {
        this.f199660d.mo95366f(1554);
        this.f199660d.mo95366f(1575);
        this.f199660d.mo95366f(1668);
        this.f199660d.mo95366f(1581);
        this.f199660d.mo95366f(1685);
        this.f199660d.mo95366f(1585);
        this.f199660d.mo95366f(1514);
        this.f199660d.mo95366f(1682);
        this.f199660d.mo95366f(1612);
        this.f199660d.mo95366f(1643);
        this.f199660d.mo95366f(1558);
        this.f199660d.mo95366f(2715);
        this.f199660d.mo95366f(4605);
        this.f199660d.mo95366f(4915);
        this.f199660d.mo95366f(4536);
        this.f199660d.mo95366f(5148);
        this.f199660d.mo95366f(4395);
        this.f199660d.mo95366f(2832);
        this.f199660d.mo95366f(1647);
        this.f199660d.mo95366f(4373);
        this.f199660d.mo95366f(4595);
        this.f199660d.mo95366f(4339);
        this.f199660d.mo95366f(4717);
        this.f199660d.mo95366f(4878);
        for (C75127o onDestroy : (List) this.f199662f.clone()) {
            onDestroy.onDestroy();
        }
        this.f199662f.clear();
        super.onDestroy();
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            C69203d1 d1Var = this.f199660d;
            if (d1Var != null) {
                if (!d1Var.f199127g.isEmpty() || !d1Var.f199126f.isEmpty()) {
                    this.f199660d.mo95365e();
                }
            }
            if (getContentView().getVisibility() == 8 || getContentView().getVisibility() == 4) {
                finish();
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar, boolean z) {
        if (onSceneEnd(i, i2, str, yVar)) {
            return;
        }
        if (i != 0 || i2 != 0) {
            C76879j.m92726T(this, str);
            finish();
        }
    }

    public abstract boolean onSceneEnd(int i, int i2, String str, C117747y yVar);

    public void register(C75127o oVar) {
        if (!this.f199662f.contains(oVar)) {
            this.f199662f.add(oVar);
        }
    }

    public void removeSceneEndListener(int i) {
        this.f199660d.mo95366f(i);
    }

    public void doSceneProgress(C117747y yVar) {
        this.f199660d.mo95364d(yVar, true);
    }
}
