package com.tencent.p014mm.plugin.fav.p047ui;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import p375qh.C101196q;
import p492dn.C97498p;
import p492dn.C97500q;

/* renamed from: com.tencent.mm.plugin.fav.ui.u0 */
public class C93701u0 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ FavPostVoiceUI f270497d;

    public C93701u0(FavPostVoiceUI favPostVoiceUI) {
        this.f270497d = favPostVoiceUI;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        View view2 = view;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view2);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (view2 != this.f270497d.f269764e) {
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        int rawY = (int) motionEvent.getRawY();
        int[] iArr = new int[2];
        FavPostVoiceUI favPostVoiceUI = this.f270497d;
        favPostVoiceUI.f269776t = favPostVoiceUI.getResources().getDisplayMetrics().heightPixels;
        this.f270497d.f269764e.getLocationOnScreen(iArr);
        int i = iArr[1];
        int action = motionEvent.getAction();
        if (action == 0) {
            FavPostVoiceUI favPostVoiceUI2 = this.f270497d;
            if (!favPostVoiceUI2.f269765f) {
                favPostVoiceUI2.f269765f = true;
                favPostVoiceUI2.f269764e.setKeepScreenOn(true);
                favPostVoiceUI2.f269764e.setBackgroundResource(C0966R.C0969drawable.aob);
                favPostVoiceUI2.f269764e.setText(C0966R.string.cqt);
                favPostVoiceUI2.f269768i = false;
                C97498p Aq = ((C97500q) C86312j.m106911c(C97500q.class)).mo126428Aq();
                ((C101196q) Aq).f296208d = new C93699t0(favPostVoiceUI2);
                favPostVoiceUI2.f269779w = Aq;
                if (((C101196q) Aq).mo140641a(favPostVoiceUI2.f269780x, 3600010)) {
                    favPostVoiceUI2.f269766g = Util.currentTicks();
                    favPostVoiceUI2.f269762A.startTimer(200);
                    favPostVoiceUI2.f269773q.setVisibility(0);
                    favPostVoiceUI2.f269781y.startTimer(100);
                    favPostVoiceUI2.f269777u.setText(C0966R.string.cpa);
                } else {
                    favPostVoiceUI2.f269766g = 0;
                }
            }
        } else if (action == 1) {
            FavPostVoiceUI favPostVoiceUI3 = this.f270497d;
            if (!favPostVoiceUI3.f269765f) {
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            } else if (favPostVoiceUI3.f269775s.getVisibility() == 0) {
                Log.m105928w("MicroMsg.FavPostVoiceUI", "action up -> cancel");
                FavPostVoiceUI.m118036E7(this.f270497d);
            } else {
                FavPostVoiceUI favPostVoiceUI4 = this.f270497d;
                if (!favPostVoiceUI4.f269768i) {
                    favPostVoiceUI4.mo128289F7();
                }
            }
        } else if (action == 2) {
            int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f270497d, 60.0f);
            FavPostVoiceUI favPostVoiceUI5 = this.f270497d;
            if (rawY > favPostVoiceUI5.f269776t - fromDPToPix || rawY >= i) {
                View view3 = favPostVoiceUI5.f269774r;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view5 = this.f270497d.f269775s;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view6 = view5;
                C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view7 = favPostVoiceUI5.f269774r;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view8 = view7;
                C117292a.m165358d(view8, aVar3.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view9 = this.f270497d.f269775s;
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(0);
                View view10 = view9;
                C117292a.m165358d(view10, aVar4.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view10, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else if (action == 3) {
            Log.m105928w("MicroMsg.FavPostVoiceUI", "action cancel");
            FavPostVoiceUI.m118036E7(this.f270497d);
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
