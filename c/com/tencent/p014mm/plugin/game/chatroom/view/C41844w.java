package com.tencent.p014mm.plugin.game.chatroom.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72806l1;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72843y1;
import com.tencent.p014mm.sdk.platformtools.Util;
import kg3.C76577a;
import qn3.C77382c;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.w */
public class C41844w implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ GameChatCommentFooter f112787d;

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.w$a */
    public class C41845a implements ValueAnimator.AnimatorUpdateListener {
        public C41845a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ViewGroup.LayoutParams layoutParams = C41844w.this.f112787d.f112476p.getLayoutParams();
            layoutParams.width = intValue;
            C41844w.this.f112787d.f112476p.setLayoutParams(layoutParams);
            GameChatCommentFooter gameChatCommentFooter = C41844w.this.f112787d;
            gameChatCommentFooter.f112476p.setAlpha(((float) intValue) / ((float) gameChatCommentFooter.f112486z));
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.w$b */
    public class C41846b implements Animator.AnimatorListener {
        public C41846b() {
        }

        public void onAnimationCancel(Animator animator) {
            ViewGroup.LayoutParams layoutParams = C41844w.this.f112787d.f112476p.getLayoutParams();
            GameChatCommentFooter gameChatCommentFooter = C41844w.this.f112787d;
            layoutParams.width = gameChatCommentFooter.f112486z;
            gameChatCommentFooter.f112476p.setLayoutParams(layoutParams);
            C41844w.this.f112787d.f112476p.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            C41844w.this.f112787d.f112476p.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = C41844w.this.f112787d.f112476p.getLayoutParams();
            GameChatCommentFooter gameChatCommentFooter = C41844w.this.f112787d;
            layoutParams.width = gameChatCommentFooter.f112486z;
            gameChatCommentFooter.f112476p.setLayoutParams(layoutParams);
            C41844w.this.f112787d.f112476p.setAlpha(1.0f);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            C41844w.this.f112787d.f112476p.setVisibility(0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.w$c */
    public class C41847c implements ValueAnimator.AnimatorUpdateListener {
        public C41847c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ViewGroup.LayoutParams layoutParams = C41844w.this.f112787d.f112476p.getLayoutParams();
            layoutParams.width = intValue;
            C41844w.this.f112787d.f112476p.setLayoutParams(layoutParams);
            GameChatCommentFooter gameChatCommentFooter = C41844w.this.f112787d;
            gameChatCommentFooter.f112476p.setAlpha(((float) intValue) / ((float) gameChatCommentFooter.f112486z));
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.w$d */
    public class C41848d implements Animator.AnimatorListener {
        public C41848d() {
        }

        public void onAnimationCancel(Animator animator) {
            C41844w.this.f112787d.f112476p.setVisibility(8);
        }

        public void onAnimationEnd(Animator animator) {
            C41844w.this.f112787d.f112476p.setVisibility(8);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            C41844w.this.f112787d.f112476p.setVisibility(0);
        }
    }

    public C41844w(GameChatCommentFooter gameChatCommentFooter) {
        this.f112787d = gameChatCommentFooter;
    }

    public void afterTextChanged(Editable editable) {
        GameChatCommentFooter gameChatCommentFooter = this.f112787d;
        C77382c b = C77382c.m93286b(gameChatCommentFooter.f112473j);
        b.f225611e = 1;
        b.f225610d = 1000;
        b.f225612f = C45078p0.C45079a.MODE_CHINESE_AS_2;
        b.f225607a = true;
        b.mo107499d(new C41851y(gameChatCommentFooter));
        String obj = this.f112787d.f112473j.getText().toString();
        GameChatCommentFooter.m45263c(this.f112787d, obj);
        boolean z = !Util.isNullOrNil(obj);
        GameChatCommentFooter gameChatCommentFooter2 = this.f112787d;
        if (z != gameChatCommentFooter2.f112456A) {
            gameChatCommentFooter2.f112456A = z;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) gameChatCommentFooter2.f112475o.getLayoutParams();
            if (z) {
                layoutParams.setMarginStart(C76577a.m92157h(this.f112787d.getContext(), C0966R.dimen.f3723cd));
                this.f112787d.f112475o.setLayoutParams(layoutParams);
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setIntValues(new int[]{0, this.f112787d.f112486z});
                valueAnimator.addUpdateListener(new C41845a());
                valueAnimator.setDuration(150);
                valueAnimator.addListener(new C41846b());
                valueAnimator.start();
                return;
            }
            layoutParams.setMarginStart(C76577a.m92157h(this.f112787d.getContext(), C0966R.dimen.f3736cp));
            this.f112787d.f112475o.setLayoutParams(layoutParams);
            ValueAnimator valueAnimator2 = new ValueAnimator();
            valueAnimator2.setIntValues(new int[]{this.f112787d.f112486z, 0});
            valueAnimator2.addUpdateListener(new C41847c());
            valueAnimator2.setDuration(150);
            valueAnimator2.addListener(new C41848d());
            valueAnimator2.start();
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        GameChatCommentFooter gameChatCommentFooter = this.f112787d;
        String valueOf = String.valueOf(charSequence);
        C72806l1 l1Var = gameChatCommentFooter.f112479s;
        if (l1Var != null) {
            C72843y1 y1Var = (C72843y1) l1Var;
            y1Var.f212286j = true;
            y1Var.mo100682a(valueOf, gameChatCommentFooter.f112461F);
        }
        GameChatCommentFooter gameChatCommentFooter2 = this.f112787d;
        ChatFooterPanel chatFooterPanel = gameChatCommentFooter2.f112478r;
        if (chatFooterPanel != null) {
            chatFooterPanel.setToSendText(gameChatCommentFooter2.f112473j.getText().toString());
        }
    }
}
