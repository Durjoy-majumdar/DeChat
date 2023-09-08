package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.HBReportNewStruct;
import com.tencent.p014mm.plugin.luckymoney.model.C69218g1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p008bq.C67305d1;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2$$c */
public class LuckyMoneyNewYearSendUIV2$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f200371d;

    /* renamed from: e */
    public final /* synthetic */ LuckyMoneyNewYearSendUIV2 f200372e;

    public LuckyMoneyNewYearSendUIV2$$c(LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2, int i) {
        this.f200372e = luckyMoneyNewYearSendUIV2;
        this.f200371d = i;
    }

    public void run() {
        Class cls = C67305d1.class;
        LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f200372e;
        luckyMoneyNewYearSendUIV2.f200302R1 = this.f200371d;
        if (Util.isEqual(luckyMoneyNewYearSendUIV2.f200324c1, 0)) {
            this.f200372e.f200332i.setVisibility(0);
            View view = this.f200372e.f200334j;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f200372e.f200341o;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            LuckyMoneyNewYearSendUIV2.m81844K7(this.f200372e);
            return;
        }
        this.f200372e.f200332i.setVisibility(8);
        Log.m105925i("MicroMsg.LuckyMoneyNewYearSendUIV2", "exchangeExpressionState() state:%s", Integer.valueOf(this.f200371d));
        switch (this.f200371d) {
            case 0:
                View view5 = this.f200372e.f200334j;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f200372e.f200339n.setText("");
                View view7 = this.f200372e.f200341o;
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(8);
                View view8 = view7;
                C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                LuckyMoneyNewYearSendUIV2.m81844K7(this.f200372e);
                return;
            case 1:
                LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV22 = this.f200372e;
                if (luckyMoneyNewYearSendUIV22.f200336k1 != null) {
                    luckyMoneyNewYearSendUIV22.f200337l1 = new HBReportNewStruct();
                    HBReportNewStruct hBReportNewStruct = this.f200372e.f200337l1;
                    hBReportNewStruct.f194229d = 4;
                    hBReportNewStruct.mo86054n();
                }
                LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV23 = this.f200372e;
                luckyMoneyNewYearSendUIV23.f200336k1 = luckyMoneyNewYearSendUIV23.f200335j1;
                int i = luckyMoneyNewYearSendUIV23.f200342o1;
                if (i == 0) {
                    if (((C67305d1) C86312j.m106911c(cls)).mo91430hJ(this.f200372e.f200335j1)) {
                        this.f200372e.f200340n1 = 2;
                    } else if (((C67305d1) C86312j.m106911c(cls)).mo91433yi(this.f200372e.f200335j1)) {
                        this.f200372e.f200340n1 = 4;
                    } else {
                        this.f200372e.f200340n1 = 3;
                    }
                } else if (i == 1) {
                    luckyMoneyNewYearSendUIV23.f200340n1 = 2;
                    luckyMoneyNewYearSendUIV23.f200347q1++;
                } else if (i == 2) {
                    if (((C67305d1) C86312j.m106911c(cls)).mo91430hJ(this.f200372e.f200335j1)) {
                        LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV24 = this.f200372e;
                        luckyMoneyNewYearSendUIV24.f200340n1 = 2;
                        luckyMoneyNewYearSendUIV24.f200353t1++;
                    } else if (((C67305d1) C86312j.m106911c(cls)).mo91433yi(this.f200372e.f200335j1)) {
                        LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV25 = this.f200372e;
                        luckyMoneyNewYearSendUIV25.f200340n1 = 4;
                        luckyMoneyNewYearSendUIV25.f200351s1++;
                    } else {
                        LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV26 = this.f200372e;
                        luckyMoneyNewYearSendUIV26.f200340n1 = 3;
                        luckyMoneyNewYearSendUIV26.f200349r1++;
                    }
                }
                LuckyMoneyNewYearSendUIV2.m81844K7(this.f200372e);
                View view9 = this.f200372e.f200334j;
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar5.mo10233c(8);
                View view10 = view9;
                C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view10, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view11 = this.f200372e.f200341o;
                C9556a aVar6 = new C9556a();
                aVar6.mo10233c(0);
                View view12 = view11;
                C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view12, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f200372e.f200350s.setVisibility(8);
                this.f200372e.f200343p.setVisibility(0);
                this.f200372e.f200346q.setVisibility(0);
                View view13 = this.f200372e.f200348r;
                C9556a aVar7 = new C9556a();
                aVar7.mo10233c(0);
                View view14 = view13;
                C117292a.m165358d(view14, aVar7.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view13.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view14, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view15 = this.f200372e.f200352t;
                C9556a aVar8 = new C9556a();
                aVar8.mo10233c(0);
                View view16 = view15;
                C117292a.m165358d(view16, aVar8.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view15.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                C117292a.m165359e(view16, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f200372e.f200354u.setVisibility(8);
                this.f200372e.f200356v.setVisibility(8);
                return;
            case 2:
                View view17 = this.f200372e.f200334j;
                C9556a aVar9 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar9.mo10233c(8);
                View view18 = view17;
                C117292a.m165358d(view18, aVar9.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view17.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                C117292a.m165359e(view18, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view19 = this.f200372e.f200341o;
                C9556a aVar10 = new C9556a();
                aVar10.mo10233c(0);
                View view20 = view19;
                C117292a.m165358d(view20, aVar10.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view19.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
                C117292a.m165359e(view20, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f200372e.f200350s.setVisibility(8);
                this.f200372e.f200343p.setVisibility(8);
                this.f200372e.f200346q.setVisibility(8);
                View view21 = this.f200372e.f200348r;
                C9556a aVar11 = new C9556a();
                aVar11.mo10233c(8);
                View view22 = view21;
                C117292a.m165358d(view22, aVar11.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view21.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
                C117292a.m165359e(view22, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view23 = this.f200372e.f200352t;
                C9556a aVar12 = new C9556a();
                aVar12.mo10233c(8);
                View view24 = view23;
                C117292a.m165358d(view24, aVar12.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view23.setVisibility(((Integer) aVar12.mo10231a(0)).intValue());
                C117292a.m165359e(view24, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f200372e.f200354u.setVisibility(0);
                this.f200372e.f200356v.setVisibility(8);
                LuckyMoneyNewYearSendUIV2.m81844K7(this.f200372e);
                return;
            case 3:
                View view25 = this.f200372e.f200334j;
                C9556a aVar13 = new C9556a();
                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                aVar13.mo10233c(8);
                View view26 = view25;
                C117292a.m165358d(view26, aVar13.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view25.setVisibility(((Integer) aVar13.mo10231a(0)).intValue());
                C117292a.m165359e(view26, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                LuckyMoneyNewYearSendUIV2.m81844K7(this.f200372e);
                View view27 = this.f200372e.f200341o;
                C9556a aVar14 = new C9556a();
                aVar14.mo10233c(0);
                View view28 = view27;
                C117292a.m165358d(view28, aVar14.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view27.setVisibility(((Integer) aVar14.mo10231a(0)).intValue());
                C117292a.m165359e(view28, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f200372e.f200350s.setVisibility(8);
                this.f200372e.f200343p.setVisibility(8);
                this.f200372e.f200346q.setVisibility(8);
                View view29 = this.f200372e.f200348r;
                C9556a aVar15 = new C9556a();
                aVar15.mo10233c(8);
                View view30 = view29;
                C117292a.m165358d(view30, aVar15.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view29.setVisibility(((Integer) aVar15.mo10231a(0)).intValue());
                C117292a.m165359e(view30, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view31 = this.f200372e.f200352t;
                C9556a aVar16 = new C9556a();
                aVar16.mo10233c(8);
                View view32 = view31;
                C117292a.m165358d(view32, aVar16.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view31.setVisibility(((Integer) aVar16.mo10231a(0)).intValue());
                C117292a.m165359e(view32, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f200372e.f200354u.setVisibility(8);
                this.f200372e.f200356v.setVisibility(0);
                this.f200372e.f200358w.setImageResource(C0966R.raw.lucky_money_newyear_creat_loading);
                return;
            case 4:
                View view33 = this.f200372e.f200334j;
                C9556a aVar17 = new C9556a();
                ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                aVar17.mo10233c(0);
                View view34 = view33;
                C117292a.m165358d(view34, aVar17.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view33.setVisibility(((Integer) aVar17.mo10231a(0)).intValue());
                C117292a.m165359e(view34, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f200372e.f200339n.setText(C0966R.string.ghk);
                View view35 = this.f200372e.f200341o;
                C9556a aVar18 = new C9556a();
                aVar18.mo10233c(8);
                View view36 = view35;
                C117292a.m165358d(view36, aVar18.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view35.setVisibility(((Integer) aVar18.mo10231a(0)).intValue());
                C117292a.m165359e(view36, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                LuckyMoneyNewYearSendUIV2.m81844K7(this.f200372e);
                return;
            case 5:
                LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV27 = this.f200372e;
                Log.m105925i("MicroMsg.LuckyMoneyNewYearSendUIV2", "setPAGDataAndStart：%s", luckyMoneyNewYearSendUIV27.f200364y0);
                luckyMoneyNewYearSendUIV27.f200300R.post(new C69663p2(luckyMoneyNewYearSendUIV27));
                return;
            case 6:
                View view37 = this.f200372e.f200334j;
                C9556a aVar19 = new C9556a();
                ThreadLocal<C9556a> threadLocal7 = C60958c.f173611a;
                aVar19.mo10233c(8);
                View view38 = view37;
                C117292a.m165358d(view38, aVar19.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view37.setVisibility(((Integer) aVar19.mo10231a(0)).intValue());
                C117292a.m165359e(view38, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view39 = this.f200372e.f200341o;
                C9556a aVar20 = new C9556a();
                aVar20.mo10233c(0);
                View view40 = view39;
                C117292a.m165358d(view40, aVar20.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view39.setVisibility(((Integer) aVar20.mo10231a(0)).intValue());
                C117292a.m165359e(view40, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f200372e.f200350s.setVisibility(8);
                this.f200372e.f200343p.setVisibility(8);
                this.f200372e.f200346q.setVisibility(8);
                View view41 = this.f200372e.f200348r;
                C9556a aVar21 = new C9556a();
                aVar21.mo10233c(8);
                View view42 = view41;
                C117292a.m165358d(view42, aVar21.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view41.setVisibility(((Integer) aVar21.mo10231a(0)).intValue());
                C117292a.m165359e(view42, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view43 = this.f200372e.f200352t;
                C9556a aVar22 = new C9556a();
                aVar22.mo10233c(8);
                View view44 = view43;
                C117292a.m165358d(view44, aVar22.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view43.setVisibility(((Integer) aVar22.mo10231a(0)).intValue());
                C117292a.m165359e(view44, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f200372e.f200354u.setVisibility(8);
                this.f200372e.f200356v.setVisibility(0);
                this.f200372e.f200358w.setImageResource(C0966R.C0969drawable.aw6);
                RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation.setDuration(1000);
                rotateAnimation.setRepeatCount(-1);
                rotateAnimation.setInterpolator(new LinearInterpolator());
                this.f200372e.f200358w.startAnimation(rotateAnimation);
                this.f200372e.f200287K1.alive();
                LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV28 = this.f200372e;
                C69218g1.m81555b(luckyMoneyNewYearSendUIV28.f200344p0, luckyMoneyNewYearSendUIV28.f200361x0);
                LuckyMoneyNewYearSendUIV2.m81844K7(this.f200372e);
                return;
            default:
                return;
        }
    }
}
