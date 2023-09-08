package com.tencent.p014mm.p136ui.chatting.component;

import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.TranslateMsgStruct;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72824s;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72828t;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter;
import com.tencent.p014mm.pluginsdk.p133ui.chat.s$$a;
import com.tencent.p014mm.pluginsdk.p133ui.tools.tips.TipsPopupWindow;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import f40.C86709a0;
import g13.C75824d;
import g62.C75875l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p629ny.C76979h;
import zj3.C79353f1;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.chatting.component.n5 */
public final class C73556n5 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C75875l f216056d;

    /* renamed from: e */
    public final /* synthetic */ C73537m5 f216057e;

    /* renamed from: com.tencent.mm.ui.chatting.component.n5$a */
    public static final class C73557a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C73537m5 f216058d;

        public C73557a(C73537m5 m5Var) {
            this.f216058d = m5Var;
        }

        public final void run() {
            String str;
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_CHATFOOT_TRANS_IN_WRITE_TIP_HAS_SHOW_BOOLEAN_SYNC;
            boolean z = false;
            if (!i.mo119686g(aVar, false)) {
                C79353f1.C79356c cVar = this.f216058d.f216017f;
                if (cVar != null) {
                    C72824s sVar = (C72824s) cVar;
                    ChatFooter chatFooter = sVar.f212222a;
                    String string = chatFooter.getContext().getString(C0966R.string.b5x);
                    View view = (View) chatFooter.f211888j;
                    if (chatFooter.f211855c2 == null) {
                        int i2 = TipsPopupWindow.f212546f;
                        TipsPopupWindow tipsPopupWindow = new TipsPopupWindow(MMApplicationContext.getContext(), (AttributeSet) null);
                        tipsPopupWindow.setOutsideTouchable(true);
                        tipsPopupWindow.setAnimationStyle(C0966R.style.f8696rh);
                        chatFooter.f211855c2 = tipsPopupWindow;
                    }
                    chatFooter.f211855c2.setContentView(C85868k2.m106137b(view.getContext()).inflate(C0966R.C0971layout.c_o, (ViewGroup) null));
                    view.getLocationOnScreen(new int[2]);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    ((TextView) chatFooter.f211855c2.getContentView().findViewById(C0966R.C0970id.kng)).setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), string));
                    TipsPopupWindow tipsPopupWindow2 = chatFooter.f211855c2;
                    if (tipsPopupWindow2.getBackground() == null) {
                        tipsPopupWindow2.setBackgroundDrawable(new ColorDrawable(0));
                    }
                    View contentView = tipsPopupWindow2.getContentView();
                    if (contentView != null) {
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams2.leftMargin = layoutParams.leftMargin;
                        layoutParams2.rightMargin = layoutParams.rightMargin;
                        layoutParams2.topMargin = layoutParams.topMargin;
                        layoutParams2.bottomMargin = layoutParams.bottomMargin;
                        contentView.setLayoutParams(layoutParams2);
                        int i3 = C85875k4.m106204s().widthPixels;
                        C85875k4.m106204s();
                        int[] iArr = new int[2];
                        view.getLocationInWindow(iArr);
                        tipsPopupWindow2.setWidth(-2);
                        tipsPopupWindow2.setHeight(-2);
                        int i4 = i3 - iArr[0];
                        tipsPopupWindow2.f212550d = i4;
                        tipsPopupWindow2.f212551e = iArr[1];
                        tipsPopupWindow2.f212547a.measure(View.MeasureSpec.makeMeasureSpec(i4, View.MeasureSpec.getMode(Integer.MIN_VALUE)), View.MeasureSpec.makeMeasureSpec(tipsPopupWindow2.f212551e, View.MeasureSpec.getMode(Integer.MIN_VALUE)));
                        tipsPopupWindow2.setWidth(Math.min(tipsPopupWindow2.f212547a.getMeasuredWidth(), tipsPopupWindow2.f212550d));
                        tipsPopupWindow2.setHeight(Math.min(tipsPopupWindow2.f212547a.getMeasuredHeight(), tipsPopupWindow2.f212551e));
                        view.getLocationInWindow(new int[2]);
                        tipsPopupWindow2.f212548b = 0;
                        tipsPopupWindow2.f212549c = 0;
                        tipsPopupWindow2.f212549c = (-tipsPopupWindow2.f212547a.getMeasuredHeight()) - view.getHeight();
                        if (tipsPopupWindow2.isShowing()) {
                            tipsPopupWindow2.update(view, tipsPopupWindow2.f212548b, tipsPopupWindow2.f212549c, tipsPopupWindow2.getWidth(), tipsPopupWindow2.getHeight());
                        } else {
                            tipsPopupWindow2.showAsDropDown(view, tipsPopupWindow2.f212548b, tipsPopupWindow2.f212549c);
                        }
                    }
                    view.post(new C72828t(chatFooter));
                    String b = chatFooter.f211826V1.mo100532b();
                    C87412m.m108594g(b, "chatId");
                    TranslateMsgStruct translateMsgStruct = new TranslateMsgStruct();
                    if (C75824d.f222434a.length() == 0) {
                        z = true;
                    }
                    if (z) {
                        str = UUID.randomUUID().toString();
                        C87412m.m108593f(str, "randomUUID().toString()");
                        C75824d.f222434a = str;
                    } else {
                        str = C75824d.f222434a;
                    }
                    translateMsgStruct.mo93199u(str);
                    translateMsgStruct.f194636f = 1;
                    translateMsgStruct.mo93197s("3");
                    translateMsgStruct.mo93198t(b);
                    translateMsgStruct.mo86054n();
                    sVar.f212222a.postDelayed(new s$$a(sVar), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                }
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.TRUE);
            }
        }
    }

    public C73556n5(C75875l lVar, C73537m5 m5Var) {
        this.f216056d = lVar;
        this.f216057e = m5Var;
    }

    public final void run() {
        List<C72963f4> Hx0 = ((C72972g4) this.f216056d).Hx0(this.f216057e.f215752d.mo91577r(), true, 3);
        if (((ArrayList) Hx0).size() >= 3) {
            C73537m5 m5Var = this.f216057e;
            for (C72963f4 f4Var : Hx0) {
                if (f4Var.mo108769t2() == 1 && f4Var.mo100993e4()) {
                    String content = f4Var.getContent();
                    C87412m.m108593f(content, "it.content");
                    if (!C73537m5.m86972Y5(m5Var, content)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            ((C119157j) C119157j.f356862d).mo183895z(new C73557a(this.f216057e));
        }
    }
}
