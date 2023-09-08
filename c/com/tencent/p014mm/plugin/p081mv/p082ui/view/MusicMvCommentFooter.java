package com.tencent.p014mm.plugin.p081mv.p082ui.view;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C30699x0;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C24564k0;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;
import kq1.C10399s;
import qn3.C77382c;
import ub2.C14146x;
import ub2.C65316w;
import ub2.C65317y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0015B\u001d\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B%\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0014J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007¨\u0006\u0016"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/MusicMvCommentFooter;", "Landroid/widget/LinearLayout;", "Lcom/tencent/mm/ui/tools/t0;", "Lcom/tencent/mm/plugin/mv/ui/view/MusicMvCommentFooter$a;", "imp", "Lrx3/b0;", "setOnCommentSendImp", "", "visibility", "setVisibility", "getTrueHeight", "id", "setEditViewBackground", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvCommentFooter */
public final class MusicMvCommentFooter extends LinearLayout implements C7020t0 {

    /* renamed from: d */
    public MMEditText f163528d;

    /* renamed from: e */
    public WeImageView f163529e;

    /* renamed from: f */
    public ChatFooterPanel f163530f;

    /* renamed from: g */
    public int f163531g = 200;

    /* renamed from: h */
    public int f163532h = 200;

    /* renamed from: i */
    public int f163533i = -1;

    /* renamed from: j */
    public boolean f163534j;

    /* renamed from: n */
    public C57088a f163535n;

    /* renamed from: o */
    public int f163536o;

    /* renamed from: p */
    public boolean f163537p;

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvCommentFooter$a */
    public interface C57088a {
        /* renamed from: a */
        void mo80540a(String str, String str2);
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvCommentFooter$b */
    public static final class C57089b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MusicMvCommentFooter f163538d;

        public C57089b(MusicMvCommentFooter musicMvCommentFooter) {
            this.f163538d = musicMvCommentFooter;
        }

        public final void run() {
            ChatFooterPanel chatFooterPanel = this.f163538d.f163530f;
            if (chatFooterPanel != null) {
                chatFooterPanel.setVisibility(4);
            } else {
                C87412m.m108603p("smileyPanel");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvCommentFooter$c */
    public static final class C57090c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MusicMvCommentFooter f163539d;

        public C57090c(MusicMvCommentFooter musicMvCommentFooter) {
            this.f163539d = musicMvCommentFooter;
        }

        public final void run() {
            MMEditText mMEditText = this.f163539d.f163528d;
            if (mMEditText != null) {
                mMEditText.requestFocus();
            }
            Context context = this.f163539d.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((MMActivity) context).showVKB();
        }
    }

    public MusicMvCommentFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo80534b();
    }

    /* renamed from: Q1 */
    public void mo531Q1(int i, boolean z) {
        Log.m105924i("Music.MusicMvCommentFooter", "onKeyboardHeightChanged: " + i);
        if (this.f163534j) {
            boolean z2 = i > 0;
            if (this.f163537p == z2) {
                Log.m105918d("Music.MusicMvCommentFooter", "onKeyboardHeightChanged repeat");
                return;
            }
            if (this.f163536o == 0) {
                this.f163536o = i;
            }
            if (!(this.f163533i == i || i == 0)) {
                this.f163533i = i;
                Log.m105924i("Music.MusicMvCommentFooter", "refreshBottomPanelHeight, " + this.f163533i);
                if (this.f163533i > 0) {
                    KeyBoardUtil.saveKeyBordHeightPx(getContext(), this.f163533i);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.f163533i);
                    ChatFooterPanel chatFooterPanel = this.f163530f;
                    if (chatFooterPanel != null) {
                        chatFooterPanel.setLayoutParams(layoutParams);
                    } else {
                        C87412m.m108603p("smileyPanel");
                        throw null;
                    }
                }
            }
            if (z2) {
                this.f163531g = 201;
                mo80533a();
            } else {
                int i2 = this.f163532h;
                if (i2 == 200) {
                    C57088a aVar = this.f163535n;
                    if (aVar != null) {
                        aVar.mo80540a((String) null, (String) null);
                    }
                    this.f163531g = 200;
                    mo80533a();
                } else if (i2 == 202) {
                    this.f163531g = 202;
                    Log.m105924i("Music.MusicMvCommentFooter", "showSmileyPanel");
                    WeImageView weImageView = this.f163529e;
                    if (weImageView != null) {
                        weImageView.setImageResource(C0966R.raw.icons_outlined_keyboard);
                    }
                    WeImageView weImageView2 = this.f163529e;
                    if (weImageView2 != null) {
                        weImageView2.setIconColor(getContext().getResources().getColor(C0966R.color.f2975b6));
                    }
                    ChatFooterPanel chatFooterPanel2 = this.f163530f;
                    if (chatFooterPanel2 != null) {
                        chatFooterPanel2.setVisibility(0);
                        ChatFooterPanel chatFooterPanel3 = this.f163530f;
                        if (chatFooterPanel3 != null) {
                            chatFooterPanel3.mo100197i();
                            ChatFooterPanel chatFooterPanel4 = this.f163530f;
                            if (chatFooterPanel4 != null) {
                                chatFooterPanel4.animate().cancel();
                                ChatFooterPanel chatFooterPanel5 = this.f163530f;
                                if (chatFooterPanel5 != null) {
                                    chatFooterPanel5.animate().alpha(1.0f).setDuration(175).start();
                                } else {
                                    C87412m.m108603p("smileyPanel");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("smileyPanel");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("smileyPanel");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("smileyPanel");
                        throw null;
                    }
                }
                this.f163532h = 200;
            }
            this.f163532h = 200;
            this.f163537p = z2;
        }
    }

    /* renamed from: a */
    public final void mo80533a() {
        Log.m105924i("Music.MusicMvCommentFooter", "hideSmileyPanel");
        WeImageView weImageView = this.f163529e;
        if (weImageView != null) {
            weImageView.setImageResource(C0966R.raw.icons_outlined_emoji);
        }
        WeImageView weImageView2 = this.f163529e;
        if (weImageView2 != null) {
            weImageView2.setIconColor(getContext().getResources().getColor(C0966R.color.f2975b6));
        }
        ChatFooterPanel chatFooterPanel = this.f163530f;
        if (chatFooterPanel != null) {
            chatFooterPanel.animate().cancel();
            ChatFooterPanel chatFooterPanel2 = this.f163530f;
            if (chatFooterPanel2 == null) {
                C87412m.m108603p("smileyPanel");
                throw null;
            } else if (chatFooterPanel2.getVisibility() == 0) {
                ChatFooterPanel chatFooterPanel3 = this.f163530f;
                if (chatFooterPanel3 != null) {
                    chatFooterPanel3.mo100196h();
                    ChatFooterPanel chatFooterPanel4 = this.f163530f;
                    if (chatFooterPanel4 != null) {
                        chatFooterPanel4.animate().alpha(0.0f).setDuration(175).withEndAction(new C57089b(this)).start();
                    } else {
                        C87412m.m108603p("smileyPanel");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("smileyPanel");
                    throw null;
                }
            }
        } else {
            C87412m.m108603p("smileyPanel");
            throw null;
        }
    }

    /* renamed from: b */
    public final void mo80534b() {
        MMEditText mMEditText;
        Bundle inputExtras;
        MMEditText mMEditText2;
        View.inflate(getContext(), C0966R.C0971layout.bit, this);
        WeImageView weImageView = (WeImageView) findViewById(C0966R.C0970id.bjw);
        this.f163529e = weImageView;
        if (weImageView != null) {
            weImageView.setOnClickListener(new C14146x(this));
        }
        View findViewById = findViewById(C0966R.C0970id.bjc);
        C87412m.m108592e(findViewById, "null cannot be cast to non-null type com.tencent.mm.ui.widget.MMEditText");
        MMEditText mMEditText3 = (MMEditText) findViewById;
        this.f163528d = mMEditText3;
        mMEditText3.setEnableSendBtn(true);
        if (C85875k4.m106207v() && (mMEditText2 = this.f163528d) != null) {
            mMEditText2.setImeOptions(268435456);
        }
        MMEditText mMEditText4 = this.f163528d;
        if (mMEditText4 != null) {
            mMEditText4.setImeOptions(4);
        }
        MMEditText mMEditText5 = this.f163528d;
        if (mMEditText5 != null) {
            Integer valueOf = Integer.valueOf(mMEditText5.getInputType() & -65);
            C87412m.m108591d(valueOf);
            mMEditText5.setInputType(valueOf.intValue());
        }
        C77382c b = C77382c.m93286b(this.f163528d);
        b.f225611e = 0;
        b.f225610d = 80;
        b.mo107499d((C77382c.C77383a) null);
        MMEditText mMEditText6 = this.f163528d;
        if (!(mMEditText6 == null || (inputExtras = mMEditText6.getInputExtras(true)) == null)) {
            inputExtras.putBoolean("IS_CHAT_EDITOR", true);
        }
        if (Build.VERSION.SDK_INT == 28 && (mMEditText = this.f163528d) != null) {
            mMEditText.setBreakStrategy(1);
        }
        MMEditText mMEditText7 = this.f163528d;
        if (mMEditText7 != null) {
            mMEditText7.setOnEditorActionListener(new C65316w(this));
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.iwk);
        ChatFooterPanel si02 = C30699x0.m39154a().si0(getContext());
        C87412m.m108593f(si02, "getSmileyPanel().getSmileyPanel(context)");
        this.f163530f = si02;
        si02.setEntranceScene(15);
        ChatFooterPanel chatFooterPanel = this.f163530f;
        if (chatFooterPanel != null) {
            chatFooterPanel.setBackgroundResource(C0966R.C0969drawable.f4728l7);
            ChatFooterPanel chatFooterPanel2 = this.f163530f;
            if (chatFooterPanel2 != null) {
                chatFooterPanel2.mo100191d();
                ChatFooterPanel chatFooterPanel3 = this.f163530f;
                if (chatFooterPanel3 != null) {
                    chatFooterPanel3.setShowSend(true);
                    ChatFooterPanel chatFooterPanel4 = this.f163530f;
                    if (chatFooterPanel4 != null) {
                        chatFooterPanel4.setVisibility(4);
                        int keyBordHeightPx = KeyBoardUtil.getKeyBordHeightPx(getContext());
                        this.f163533i = keyBordHeightPx;
                        ChatFooterPanel chatFooterPanel5 = this.f163530f;
                        if (chatFooterPanel5 != null) {
                            linearLayout.addView(chatFooterPanel5, -1, keyBordHeightPx);
                            ChatFooterPanel chatFooterPanel6 = this.f163530f;
                            if (chatFooterPanel6 != null) {
                                chatFooterPanel6.setOnTextOperationListener(new C65317y(this));
                            } else {
                                C87412m.m108603p("smileyPanel");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("smileyPanel");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("smileyPanel");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("smileyPanel");
                    throw null;
                }
            } else {
                C87412m.m108603p("smileyPanel");
                throw null;
            }
        } else {
            C87412m.m108603p("smileyPanel");
            throw null;
        }
    }

    public final int getTrueHeight() {
        return this.f163533i + C76577a.m92151b(getContext(), 48);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        Log.m105924i("Music.MusicMvCommentFooter", "onWindowFocusChanged: " + z);
        this.f163534j = z;
        if (getVisibility() == 0 && z && this.f163531g == 201) {
            post(new C57090c(this));
        }
    }

    public final void setEditViewBackground(int i) {
        MMEditText mMEditText = this.f163528d;
        if (mMEditText != null) {
            mMEditText.setBackground(getContext().getDrawable(i));
        }
    }

    public final void setOnCommentSendImp(C57088a aVar) {
        C87412m.m108594g(aVar, "imp");
        this.f163535n = aVar;
    }

    public void setVisibility(int i) {
        KeyboardHeightProvider keyboardHeightProvider;
        Class cls = C10399s.class;
        super.setVisibility(i);
        this.f163531g = 200;
        boolean z = i == 0;
        Log.m105924i("Music.MusicMvCommentFooter", "setVisibility, cutEditMode:" + this.f163531g + ", isShow:" + z);
        StringBuilder sb = new StringBuilder();
        sb.append("showState ");
        sb.append(z);
        Log.m105924i("Music.MusicMvCommentFooter", sb.toString());
        if (!z) {
            Log.m105924i("Music.MusicMvCommentFooter", "allGone");
            this.f163532h = 200;
            Context context = getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((MMActivity) context).hideVKB();
            ChatFooterPanel chatFooterPanel = this.f163530f;
            if (chatFooterPanel != null) {
                chatFooterPanel.setAlpha(0.0f);
                ChatFooterPanel chatFooterPanel2 = this.f163530f;
                if (chatFooterPanel2 != null) {
                    chatFooterPanel2.setVisibility(4);
                } else {
                    C87412m.m108603p("smileyPanel");
                    throw null;
                }
            } else {
                C87412m.m108603p("smileyPanel");
                throw null;
            }
        }
        if (z) {
            this.f163537p = false;
            this.f163534j = true;
            C39818r rVar = C39818r.f106831a;
            Context context2 = getContext();
            C87412m.m108593f(context2, "context");
            C10399s sVar = (C10399s) rVar.mo62443b(context2).mo75002a(cls);
            sVar.f31625e.add(this);
            KeyboardHeightProvider keyboardHeightProvider2 = sVar.f31624d;
            if (keyboardHeightProvider2 != null) {
                keyboardHeightProvider2.mo104022e();
            }
            MMEditText mMEditText = this.f163528d;
            if (mMEditText != null) {
                mMEditText.requestFocus();
            }
            Log.m105924i("Music.MusicMvCommentFooter", "onlyShowVKB");
            this.f163532h = 201;
            Context context3 = getContext();
            C87412m.m108592e(context3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((MMActivity) context3).showVKB();
            return;
        }
        C39818r rVar2 = C39818r.f106831a;
        Context context4 = getContext();
        C87412m.m108593f(context4, "context");
        C10399s sVar2 = (C10399s) rVar2.mo62443b(context4).mo75002a(cls);
        C24564k0.m30737a(sVar2.f31625e).remove(this);
        if (sVar2.f31625e.isEmpty() && (keyboardHeightProvider = sVar2.f31624d) != null) {
            keyboardHeightProvider.mo104021d();
        }
    }

    public MusicMvCommentFooter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo80534b();
    }
}
