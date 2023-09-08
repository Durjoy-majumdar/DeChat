package com.tencent.p014mm.emoji.view;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.C74965a;
import com.tencent.p014mm.p136ui.widget.InputPanelLinearLayout;
import com.tencent.p014mm.p136ui.widget.cedit.api.C74974a;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C30699x0;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72834u0;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import kg3.C76577a;
import p915ol.C77016c;
import p915ol.C77017d;

/* renamed from: com.tencent.mm.emoji.view.EmojiPanelInputComponent */
public class EmojiPanelInputComponent extends InputPanelLinearLayout {

    /* renamed from: r */
    public static final int f195271r = C76577a.m92151b(MMApplicationContext.getContext(), 50);

    /* renamed from: f */
    public Context f195272f;

    /* renamed from: g */
    public ChatFooterPanel f195273g;

    /* renamed from: h */
    public C74974a f195274h = null;

    /* renamed from: i */
    public ImageButton f195275i;

    /* renamed from: j */
    public int f195276j = -1;

    /* renamed from: n */
    public int f195277n = -1;

    /* renamed from: o */
    public int f195278o = 0;

    /* renamed from: p */
    public boolean f195279p = true;

    /* renamed from: q */
    public C68041c f195280q;

    /* renamed from: com.tencent.mm.emoji.view.EmojiPanelInputComponent$a */
    public class C68039a implements C74974a.C74976b {
        public C68039a(EmojiPanelInputComponent emojiPanelInputComponent) {
        }

        /* renamed from: a */
        public boolean mo93502a(C74974a aVar, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* renamed from: com.tencent.mm.emoji.view.EmojiPanelInputComponent$b */
    public class C68040b implements Runnable {
        public C68040b() {
        }

        public void run() {
            EmojiPanelInputComponent.this.f195273g.setVisibility(4);
        }
    }

    /* renamed from: com.tencent.mm.emoji.view.EmojiPanelInputComponent$c */
    public interface C68041c extends C74965a.C74969d {
        void hideVKB();

        void showVKB();
    }

    public EmojiPanelInputComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f195272f = context;
        C85868k2.m106137b(context).inflate(C0966R.C0971layout.a1t, this);
        if (C30699x0.m39154a() == null) {
            this.f195273g = new C72834u0(this.f195272f);
            return;
        }
        ImageButton imageButton = (ImageButton) findViewById(C0966R.C0970id.gxy);
        this.f195275i = imageButton;
        imageButton.setOnClickListener(new C77016c(this));
        ChatFooterPanel si02 = C30699x0.m39154a().si0(getContext());
        this.f195273g = si02;
        si02.setEntranceScene(0);
        this.f195273g.setVisibility(4);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.iwc);
        linearLayout.setOnClickListener((View.OnClickListener) null);
        int validPanelHeight = KeyBoardUtil.getValidPanelHeight(getContext());
        this.f195278o = validPanelHeight;
        linearLayout.addView(this.f195273g, -1, validPanelHeight);
        this.f195273g.mo100191d();
        setBottomPanelHeight(this.f195278o);
        this.f195273g.mo100197i();
        this.f195273g.setOnTextOperationListener(new C77017d(this));
    }

    /* renamed from: b */
    public void mo93490b(int i) {
        C68041c cVar = this.f195280q;
        if (cVar != null) {
            cVar.mo1072i0(getVisibility() == 0, i + f195271r);
        }
    }

    /* renamed from: c */
    public void mo93491c() {
        this.f195273g.mo100196h();
        if (KeyBoardUtil.isPortOrientation(getContext())) {
            getInputPanelHelper().mo104363f(new C68040b());
        } else {
            this.f195273g.setVisibility(4);
        }
    }

    /* renamed from: d */
    public boolean mo93492d() {
        return (this.f195273g.getVisibility() == 0) || getVisibility() == 0;
    }

    public ChatFooterPanel getSmileyPanel() {
        return this.f195273g;
    }

    /* renamed from: i0 */
    public void mo1072i0(boolean z, int i) {
        Log.m105925i("MicroMsg.EmojiPanelInputComponent", "onInputPanelChange: %s, %s", Boolean.valueOf(z), Integer.valueOf(i));
        super.mo1072i0(z, i);
        if (!(this.f195278o == i || i == 0)) {
            this.f195278o = i;
            setBottomPanelHeight(i);
        }
        if (z) {
            setVisibility(0);
            this.f195275i.setImageResource(C0966R.C0969drawable.f4802nb);
            this.f195275i.setTag("keyboard");
        } else if ("emoji".equals(this.f195275i.getTag())) {
            this.f195275i.setImageResource(C0966R.C0969drawable.f4803nc);
        } else {
            setVisibility(4);
        }
        mo93490b(i);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f195273g != null) {
            setBottomPanelHeight(this.f195278o);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = this.f195276j;
        if (i5 < i4) {
            i5 = i4;
        }
        this.f195276j = i5;
        this.f195277n = i4;
    }

    public void setBottomPanelHeight(int i) {
        Log.m105925i("MicroMsg.EmojiPanelInputComponent", "setBottomPanelHeight: %s", Integer.valueOf(i));
        ViewGroup.LayoutParams layoutParams = this.f195273g.getLayoutParams();
        if (layoutParams != null && layoutParams.height != i) {
            layoutParams.height = i;
            this.f195273g.requestLayout();
        }
    }

    public void setInputComponentListener(C68041c cVar) {
        this.f195280q = cVar;
    }

    public void setMMEditText(C74974a aVar) {
        this.f195274h = aVar;
        aVar.mo104254k(new C68039a(this));
    }

    public void setSmileySendButtonEnable(boolean z) {
        ChatFooterPanel chatFooterPanel = this.f195273g;
        if (chatFooterPanel != null) {
            chatFooterPanel.setSendButtonEnable(z);
        }
    }

    public void setSmileySendButtonText(String str) {
        ChatFooterPanel chatFooterPanel = this.f195273g;
        if (chatFooterPanel != null) {
            chatFooterPanel.setToSendText(str);
        }
    }

    public void setSmileySendTalkerName(String str) {
        ChatFooterPanel chatFooterPanel = this.f195273g;
        if (chatFooterPanel != null) {
            chatFooterPanel.setTalkerName(str);
        }
    }
}
