package com.tencent.p014mm.p136ui;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.C103448e;
import yi3.C112467b;

/* renamed from: com.tencent.mm.ui.x1 */
public class C116182x1 extends MMActivityController implements C112467b.C112469b {

    /* renamed from: s0 */
    public MMFragment f348685s0 = null;

    /* renamed from: t0 */
    public ActionBar f348686t0;

    /* renamed from: u0 */
    public C112467b f348687u0;

    /* renamed from: B */
    public ActionBar mo177037B() {
        if (this.f348686t0 == null) {
            this.f348686t0 = this.f348687u0.mo164182e();
        }
        return this.f348686t0;
    }

    /* renamed from: G0 */
    public void mo177047G0() {
        C112467b bVar = this.f348687u0;
        if (!bVar.f336743o) {
            bVar.f336743o = true;
            ((C112467b.C112468a) bVar.f336744p).run();
        }
    }

    /* renamed from: O */
    public boolean mo177020O() {
        return true;
    }

    /* renamed from: Z */
    public void mo177025Z() {
        MMFragment mMFragment = this.f348685s0;
        if (mMFragment != null) {
            mMFragment.onCreateBeforeSetContentView();
        }
    }

    /* renamed from: a */
    public void mo164186a(C103448e eVar, boolean z) {
    }

    /* renamed from: b */
    public boolean mo164187b(C103448e eVar, MenuItem menuItem) {
        return mo177070d0(menuItem);
    }

    /* renamed from: c0 */
    public void mo177026c0() {
        MMFragment mMFragment = this.f348685s0;
        if (mMFragment != null) {
            mMFragment.onKeyboardStateChanged();
        }
    }

    /* renamed from: k */
    public void mo177028k(View view) {
        MMFragment mMFragment = this.f348685s0;
        if (mMFragment != null) {
            mMFragment.dealContentView(view);
        }
    }

    /* renamed from: o */
    public boolean mo177029o() {
        return false;
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        this.f348685s0.onCreateOptionsMenu(menu, this.f348687u0.mo164183f());
        return true;
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        MMFragment mMFragment = this.f348685s0;
        if (mMFragment == null) {
            return true;
        }
        mMFragment.onPrepareOptionsMenu(menu);
        return true;
    }

    /* renamed from: r */
    public String mo177030r() {
        return this.f348685s0.getClass().getName();
    }

    /* renamed from: u */
    public int mo177031u() {
        MMFragment mMFragment = this.f348685s0;
        if (mMFragment != null) {
            return mMFragment.getCustomBounceId();
        }
        return -1;
    }

    /* renamed from: w */
    public int mo177101w() {
        return 1;
    }

    /* renamed from: x */
    public String mo177032x() {
        MMFragment mMFragment = this.f348685s0;
        if (mMFragment != null) {
            return mMFragment.getIdentityString();
        }
        return null;
    }

    /* renamed from: y */
    public int mo177033y() {
        MMFragment mMFragment = this.f348685s0;
        if (mMFragment != null) {
            return mMFragment.getLayoutId();
        }
        return -1;
    }

    /* renamed from: z */
    public View mo177034z() {
        MMFragment mMFragment = this.f348685s0;
        if (mMFragment != null) {
            return mMFragment.getLayoutView();
        }
        return null;
    }
}
