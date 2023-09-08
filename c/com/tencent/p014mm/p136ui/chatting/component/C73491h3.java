package com.tencent.p014mm.p136ui.chatting.component;

import android.graphics.Rect;
import android.view.View;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74090l0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C45628s0;
import f32.C75672b;
import h81.C32735h;
import j20.C117292a;
import java.util.HashSet;
import k20.C60958c;
import k20.C9556a;
import p270xi.C53356d;
import p270xi.C91212b;
import p287zz.C79442f;
import te3.C77994sf2;
import te3.C77999tf2;
import zj3.C79358g0;

@C91212b(exportInterface = C79358g0.class)
/* renamed from: com.tencent.mm.ui.chatting.component.h3 */
public class C73491h3 extends C73412a implements C53356d, C79358g0 {

    /* renamed from: e */
    public HashSet<Long> f215911e = new HashSet<>();

    /* renamed from: f */
    public boolean f215912f = false;

    /* renamed from: g */
    public Rect f215913g = new Rect();

    /* renamed from: h */
    public boolean f215914h = false;

    /* renamed from: i */
    public boolean f215915i = false;

    /* renamed from: O4 */
    public void mo26162O4() {
        this.f215914h = true;
        this.f215915i = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_lucky_money_dynamic_bubble_close_switch, false);
    }

    /* renamed from: S0 */
    public boolean mo102456S0(long j) {
        HashSet<Long> hashSet = this.f215911e;
        if (hashSet == null || hashSet.size() <= 0) {
            return false;
        }
        return this.f215911e.contains(Long.valueOf(j));
    }

    /* renamed from: X5 */
    public void mo102328X5(View view, int i) {
        if (!C45628s0.m50742G(this.f215752d.mo91577r())) {
            if (i == 0) {
                mo102458Y5();
            }
            this.f215912f = i != 0;
        }
    }

    /* renamed from: Y0 */
    public void mo102457Y0(C77994sf2 sf22, C74090l0.C74091a aVar, int i) {
        boolean z;
        C74090l0.C74091a aVar2 = aVar;
        int i2 = i;
        Class cls = C75672b.class;
        if (this.f215915i || aVar2.f217462y == null || Util.isNullOrNil(sf22.f228203g.f228259w)) {
            Log.m105924i("MicroMsg.LuckyMoneyComponent", "do not have view");
            return;
        }
        boolean z2 = !this.f215911e.contains(Long.valueOf(aVar2.f217457t)) && aVar2.f217437E;
        Log.m105925i("MicroMsg.LuckyMoneyComponent", "PlayPag，id：%s ,status：%s , available :%s ，needPlay：%s", Long.valueOf(aVar2.f217457t), Integer.valueOf(i), Boolean.valueOf(aVar2.f217437E), Boolean.valueOf(z2));
        if (!this.f215911e.contains(Long.valueOf(aVar2.f217457t))) {
            if ((i2 == 1 || i2 == 2) && z2) {
                if (this.f215913g == null) {
                    this.f215913g = new Rect();
                }
                if (this.f215914h || this.f215912f || !aVar2.convertView.getLocalVisibleRect(this.f215913g)) {
                    z = false;
                } else {
                    this.f215911e.add(Long.valueOf(aVar2.f217457t));
                    z = true;
                }
                ((C75672b) C86312j.m106911c(cls)).mo95319Oy(aVar2.f217462y, aVar2.f217461x, sf22, aVar.getViewHolderScope(), aVar2.f217437E, aVar2.f217457t, this.f215911e, z, aVar2.f217463z);
            } else if (aVar2.f217437E) {
                this.f215911e.add(Long.valueOf(aVar2.f217457t));
                ((C75672b) C86312j.m106911c(cls)).lw0(aVar2.f217462y, aVar2.f217461x, sf22, aVar.getViewHolderScope(), aVar2.f217437E, aVar2.f217457t, this.f215911e, aVar2.f217463z);
            }
        }
    }

    /* renamed from: Y5 */
    public final void mo102458Y5() {
        int j = this.f215752d.mo91569j();
        for (int g = this.f215752d.mo91566g(); g < j + 1; g++) {
            View w = this.f215752d.mo91570k().mo81316w(g, 0);
            if (w != null && (w.getTag() instanceof C74090l0.C74091a)) {
                C74090l0.C74091a aVar = (C74090l0.C74091a) w.getTag();
                if (aVar.f217462y != null && !Util.isNullOrNil(aVar.f217433A) && aVar.f217438F) {
                    C77994sf2 sf22 = new C77994sf2();
                    sf22.f228201e = aVar.f217435C;
                    C77999tf2 tf22 = new C77999tf2();
                    sf22.f228203g = tf22;
                    tf22.f228259w = aVar.f217433A;
                    tf22.f228239A = aVar.f217434B;
                    mo102457Y0(sf22, aVar, 0);
                }
            }
        }
    }

    /* renamed from: Z5 */
    public final void mo102459Z5() {
        HashSet<Long> hashSet = this.f215911e;
        if (hashSet != null) {
            hashSet.clear();
        }
        if (this.f215752d.mo91570k() != null) {
            int childCount = this.f215752d.mo91570k().getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f215752d.mo91570k().getChildAt(i);
                if (childAt != null && (childAt.getTag() instanceof C74090l0.C74091a)) {
                    C74090l0.C74091a aVar = (C74090l0.C74091a) childAt.getTag();
                    if (aVar.f217462y != null && !Util.isNullOrNil(aVar.f217433A) && aVar.f217438F) {
                        aVar.f217461x.mo21226m();
                        View view = aVar.f217462y;
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar2.mo10233c(8);
                        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/component/LuckyMoneyComponent", "releasePagView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/ui/chatting/component/LuckyMoneyComponent", "releasePagView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        if (aVar.f217437E) {
                            aVar.f217461x.setProgress(0.0d);
                            aVar.f217463z.setVisibility(8);
                        } else {
                            aVar.f217463z.setVisibility(0);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: g5 */
    public void mo70046g5() {
        this.f215914h = false;
        if (!C45628s0.m50742G(this.f215752d.mo91577r())) {
            ((C79442f) C86312j.m106911c(C79442f.class)).mo109174w1(this.f215752d.mo91577r());
            mo102458Y5();
        }
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        if (!C45628s0.m50742G(this.f215752d.mo91577r())) {
            ((C79442f) C86312j.m106911c(C79442f.class)).mo109174w1(this.f215752d.mo91577r());
        }
        mo102459Z5();
    }

    /* renamed from: n2 */
    public void mo26199n2() {
        if (!C45628s0.m50742G(this.f215752d.mo91577r())) {
            ((C79442f) C86312j.m106911c(C79442f.class)).mo109174w1(this.f215752d.mo91577r());
        }
        mo102459Z5();
    }
}
