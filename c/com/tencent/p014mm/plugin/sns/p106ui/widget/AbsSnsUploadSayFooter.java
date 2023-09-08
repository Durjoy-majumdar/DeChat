package com.tencent.p014mm.plugin.sns.p106ui.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.SnsUploadInputPanelLinearLayout;
import com.tencent.p014mm.p136ui.widget.cedit.api.C74974a;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C30699x0;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72834u0;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gv2.C45961c;
import gv2.C76070b;
import gv2.C76071d;
import gv2.a$$b;
import gy3.C87412m;
import o40.C61926c;
import vr2.C52986c0;

/* renamed from: com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter */
public abstract class AbsSnsUploadSayFooter extends SnsUploadInputPanelLinearLayout {

    /* renamed from: t */
    public static final /* synthetic */ int f206204t = 0;

    /* renamed from: f */
    public MMActivity f206205f;

    /* renamed from: g */
    public ChatFooterPanel f206206g;

    /* renamed from: h */
    public C74974a f206207h = null;

    /* renamed from: i */
    public ImageButton f206208i;

    /* renamed from: j */
    public SnsEditTipsWidget f206209j;

    /* renamed from: n */
    public int f206210n = -1;

    /* renamed from: o */
    public int f206211o = 0;

    /* renamed from: p */
    public boolean f206212p = false;

    /* renamed from: q */
    public C71260b f206213q;

    /* renamed from: r */
    public final int f206214r = C0966R.raw.icons_outlined_emoji;

    /* renamed from: s */
    public final int f206215s = C0966R.C0969drawable.f4803nc;

    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter$a */
    public class C71259a implements C74974a.C74976b {
        public C71259a(AbsSnsUploadSayFooter absSnsUploadSayFooter) {
        }

        /* renamed from: a */
        public boolean mo93502a(C74974a aVar, int i, KeyEvent keyEvent) {
            SnsMethodCalculate.markStartTimeMs("onEditorAction", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter$1");
            SnsMethodCalculate.markEndTimeMs("onEditorAction", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter$1");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter$b */
    public interface C71260b {
        /* renamed from: Q */
        void mo98032Q(boolean z, int i);
    }

    public AbsSnsUploadSayFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f206205f = (MMActivity) context;
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        this.f206205f.getWindow().setSoftInputMode(getSoftInputMode());
        ViewGroup viewGroup = (ViewGroup) C85868k2.m106137b(this.f206205f).inflate(C0966R.C0971layout.c4x, this);
        ImageButton imageButton = (ImageButton) viewGroup.findViewById(C0966R.C0970id.f5704mb);
        this.f206208i = imageButton;
        C76070b bVar = new C76070b(this);
        SnsMethodCalculate.markStartTimeMs("setThrottleOnClickListener", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        C87412m.m108594g(imageButton, "<this>");
        imageButton.setOnClickListener(new C52986c0(imageButton, 500, bVar));
        SnsMethodCalculate.markEndTimeMs("setThrottleOnClickListener", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        this.f206209j = (SnsEditTipsWidget) viewGroup.findViewById(C0966R.C0970id.g6z);
        if (C30699x0.m39154a() == null) {
            this.f206206g = new C72834u0(this.f206205f);
            SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
            return;
        }
        ChatFooterPanel si02 = C30699x0.m39154a().si0(getContext());
        this.f206206g = si02;
        si02.setEntranceScene(2);
        this.f206206g.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.iwc);
        linearLayout.setOnClickListener((View.OnClickListener) null);
        findViewById(C0966R.C0970id.f358313ed1).setOnClickListener(new C45961c(this));
        int validPanelHeight = KeyBoardUtil.getValidPanelHeight(getContext());
        this.f206211o = validPanelHeight;
        linearLayout.addView(this.f206206g, -1, validPanelHeight);
        this.f206206g.mo100191d();
        mo97973c();
        this.f206206g.mo100197i();
        this.f206206g.setOnTextOperationListener(new C76071d(this));
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
    }

    /* renamed from: a */
    public Boolean mo98021a() {
        SnsMethodCalculate.markStartTimeMs("isFooterBarLayOnPageBottom", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        if (mo98022b()) {
            Boolean bool = Boolean.FALSE;
            SnsMethodCalculate.markEndTimeMs("isFooterBarLayOnPageBottom", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
            return bool;
        }
        Rect m = C61926c.m72688m(this);
        int abs = Math.abs(C75044y4.m89990b(this.f206205f).y - m.bottom);
        boolean z = abs <= getFooterBarHeight();
        Log.m105919d("MicroMsg.SnsUpload.AbsSayFooter", "isFooterBarLayOnPageBottom = [%b] ,bottomRawY:%d, Height:%d, footerPaddingScreenBottom:%d", Boolean.valueOf(z), Integer.valueOf(m.bottom), Integer.valueOf(getHeight()), Integer.valueOf(abs));
        Boolean valueOf = Boolean.valueOf(z);
        SnsMethodCalculate.markEndTimeMs("isFooterBarLayOnPageBottom", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        return valueOf;
    }

    /* renamed from: b */
    public boolean mo98022b() {
        SnsMethodCalculate.markStartTimeMs("isSmilePanelVisble", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        boolean z = this.f206206g.getVisibility() == 0;
        SnsMethodCalculate.markEndTimeMs("isSmilePanelVisble", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        return z;
    }

    /* renamed from: c */
    public abstract void mo97973c();

    /* renamed from: d */
    public abstract void mo97974d(boolean z, int i);

    /* renamed from: e */
    public void mo98023e() {
        SnsMethodCalculate.markStartTimeMs("setFooterGone", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        Log.m105925i("MicroMsg.SnsUpload.AbsSayFooter", "setFooterGone: mIsShowSmiley:%b", Boolean.valueOf(this.f206212p));
        if (this.f206212p) {
            SnsMethodCalculate.markEndTimeMs("setFooterGone", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
            return;
        }
        setVisibility(4);
        SnsMethodCalculate.markEndTimeMs("setFooterGone", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
    }

    /* renamed from: f */
    public void mo98024f() {
        SnsMethodCalculate.markStartTimeMs("setFooterVisible", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        Log.m105924i("MicroMsg.SnsUpload.AbsSayFooter", "setFooterVisible: ");
        setVisibility(0);
        ImageButton imageButton = this.f206208i;
        if (imageButton != null) {
            imageButton.setImageResource(this.f206214r);
        }
        SnsEditTipsWidget snsEditTipsWidget = this.f206209j;
        if (snsEditTipsWidget != null) {
            snsEditTipsWidget.mo98037a(this.f206207h.getText().toString());
        }
        SnsMethodCalculate.markEndTimeMs("setFooterVisible", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
    }

    /* renamed from: g */
    public void mo98025g() {
        SnsMethodCalculate.markStartTimeMs("setSmileGone", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        Log.m105924i("MicroMsg.SnsUpload.AbsSayFooter", "setSmileGone: ");
        this.f206212p = false;
        this.f206206g.mo100196h();
        this.f206206g.setVisibility(8);
        setVisibility(4);
        SnsMethodCalculate.markEndTimeMs("setSmileGone", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
    }

    public int getFooterBarHeight() {
        SnsMethodCalculate.markStartTimeMs("getFooterBarHeight", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        int height = getHeight();
        SnsMethodCalculate.markEndTimeMs("getFooterBarHeight", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        return height;
    }

    public int getKeyboardHeight() {
        SnsMethodCalculate.markStartTimeMs("getKeyboardHeight", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        int i = this.f206211o;
        SnsMethodCalculate.markEndTimeMs("getKeyboardHeight", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        return i;
    }

    /* renamed from: h */
    public void mo97986h() {
        SnsMethodCalculate.markStartTimeMs("showSmileyPanel", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        this.f206212p = true;
        this.f206206g.mo100197i();
        getInputPanelHelper().f220486m = new a$$b(this);
        mo97973c();
        SnsMethodCalculate.markEndTimeMs("showSmileyPanel", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
    }

    /* renamed from: i0 */
    public void mo1072i0(boolean z, int i) {
        SnsMethodCalculate.markStartTimeMs("onInputPanelChange", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        Log.m105925i("MicroMsg.SnsUpload.AbsSayFooter", "onInputPanelChange: %s, %s", Boolean.valueOf(z), Integer.valueOf(i));
        super.mo1072i0(z, i);
        mo97974d(z, i);
        SnsMethodCalculate.markStartTimeMs("callPanelChangeAfterUIRefresh", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        C71260b bVar = this.f206213q;
        if (bVar != null) {
            bVar.mo98032Q(z, i);
        }
        SnsMethodCalculate.markEndTimeMs("callPanelChangeAfterUIRefresh", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        SnsMethodCalculate.markEndTimeMs("onInputPanelChange", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
    }

    public void onConfigurationChanged(Configuration configuration) {
        SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        super.onConfigurationChanged(configuration);
        if (this.f206206g != null) {
            mo97973c();
        }
        SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        super.onLayout(z, i, i2, i3, i4);
        int i5 = this.f206210n;
        if (i5 >= i4) {
            i4 = i5;
        }
        this.f206210n = i4;
        SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
    }

    public void setMMEditText(C74974a aVar) {
        SnsMethodCalculate.markStartTimeMs("setMMEditText", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        this.f206207h = aVar;
        aVar.mo104254k(new C71259a(this));
        SnsMethodCalculate.markEndTimeMs("setMMEditText", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
    }

    public void setUploadFooterPanelChangeListener(C71260b bVar) {
        SnsMethodCalculate.markStartTimeMs("setUploadFooterPanelChangeListener", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        this.f206213q = bVar;
        SnsMethodCalculate.markEndTimeMs("setUploadFooterPanelChangeListener", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
    }
}
