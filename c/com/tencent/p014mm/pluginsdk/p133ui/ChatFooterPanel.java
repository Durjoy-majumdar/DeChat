package com.tencent.p014mm.pluginsdk.p133ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C44614y0;
import vd3.C78405p;

/* renamed from: com.tencent.mm.pluginsdk.ui.ChatFooterPanel */
public abstract class ChatFooterPanel extends LinearLayout {

    /* renamed from: f */
    public static final /* synthetic */ int f211589f = 0;

    /* renamed from: d */
    public C44614y0 f211590d;

    /* renamed from: e */
    public C72718b f211591e;

    /* renamed from: com.tencent.mm.pluginsdk.ui.ChatFooterPanel$RecommendView */
    public static abstract class RecommendView extends LinearLayout {
        public RecommendView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public abstract void setProductID(String str);

        public RecommendView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.ChatFooterPanel$b */
    public interface C72718b {
        /* renamed from: a */
        void mo100227a(int i, int i2);
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.ChatFooterPanel$a */
    public interface C72719a {
        /* renamed from: a */
        void mo64626a();

        /* renamed from: b */
        void mo64627b(String str);

        /* renamed from: c */
        void mo64628c();

        /* renamed from: d */
        void mo64629d(boolean z);
    }

    public ChatFooterPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo100188a() {
    }

    /* renamed from: b */
    public void mo100189b() {
    }

    @Deprecated
    /* renamed from: c */
    public abstract void mo100190c();

    @Deprecated
    /* renamed from: d */
    public abstract void mo100191d();

    @Deprecated
    /* renamed from: e */
    public abstract void mo100192e(boolean z);

    @Deprecated
    /* renamed from: f */
    public abstract void mo100193f(boolean z, boolean z2);

    /* renamed from: g */
    public void mo100194g(boolean z) {
    }

    public C78405p getPanelSlideIndicator() {
        return null;
    }

    /* renamed from: h */
    public abstract void mo100196h();

    /* renamed from: i */
    public abstract void mo100197i();

    /* renamed from: j */
    public abstract void mo100198j();

    /* renamed from: k */
    public void mo100199k() {
    }

    /* renamed from: l */
    public abstract void mo100200l();

    /* renamed from: m */
    public void mo100201m() {
    }

    /* renamed from: n */
    public abstract void mo100202n();

    /* renamed from: o */
    public abstract void mo100203o(boolean z, boolean z2);

    /* renamed from: p */
    public abstract void mo100204p(boolean z, boolean z2);

    /* renamed from: q */
    public abstract void mo100205q(Context context, Runnable runnable);

    public void setCallback(C44614y0 y0Var) {
        this.f211590d = y0Var;
    }

    public abstract void setDefaultEmojiByDetail(String str);

    public abstract void setEntranceScene(int i);

    public void setFooterType(int i) {
    }

    public abstract void setHideSearchJumpMoreEntrance(boolean z);

    public void setOnTextOperationListener(C72719a aVar) {
    }

    @Deprecated
    public abstract void setPortHeightPx(int i);

    public abstract void setSearchDialogForceDarkMode(boolean z);

    public abstract void setSendButtonEnable(boolean z);

    public abstract void setShowClose(boolean z);

    public void setShowGame(boolean z) {
    }

    public abstract void setShowSearch(boolean z);

    public abstract void setShowSend(boolean z);

    public abstract void setShowSmiley(boolean z);

    public abstract void setShowStore(boolean z);

    public void setSmileyPanelExpandable(boolean z) {
    }

    public abstract void setTalkerName(String str);

    public abstract void setToSendText(String str);

    public void setVisibility(int i) {
        C72718b bVar;
        int visibility = getVisibility();
        super.setVisibility(i);
        if (visibility != i && (bVar = this.f211591e) != null) {
            bVar.mo100227a(visibility, i);
        }
    }

    public void setVisibleChangeListener(C72718b bVar) {
        this.f211591e = bVar;
    }
}
