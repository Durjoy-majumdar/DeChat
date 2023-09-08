package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.BasePanelKeybordLayout;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C82607s;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C30699x0;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72834u0;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import te3.C101802kr2;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter */
public class SnsSightUploadSayFooter extends BasePanelKeybordLayout {

    /* renamed from: t */
    public static final /* synthetic */ int f206148t = 0;

    /* renamed from: n */
    public MMActivity f206149n;

    /* renamed from: o */
    public ChatFooterPanel f206150o;

    /* renamed from: p */
    public MMEditText f206151p = null;

    /* renamed from: q */
    public ImageButton f206152q;

    /* renamed from: r */
    public SightRangeWidget f206153r;

    /* renamed from: s */
    public SightLocationWidget f206154s;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter$a */
    public class C71216a implements View.OnClickListener {
        public C71216a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSightUploadSayFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter$1");
            boolean z = false;
            if (SnsSightUploadSayFooter.this.getVisibility() == 8) {
                SnsSightUploadSayFooter.this.setVisibility(0);
            }
            SnsSightUploadSayFooter snsSightUploadSayFooter = SnsSightUploadSayFooter.this;
            snsSightUploadSayFooter.getClass();
            SnsMethodCalculate.markStartTimeMs("isSmilePanelVisble", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
            if (snsSightUploadSayFooter.f206150o.getVisibility() == 0) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("isSmilePanelVisble", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
            if (z) {
                SnsSightUploadSayFooter snsSightUploadSayFooter2 = SnsSightUploadSayFooter.this;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
                snsSightUploadSayFooter2.getClass();
                SnsMethodCalculate.markStartTimeMs("hideSmileyPanel", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
                snsSightUploadSayFooter2.f206150o.mo100196h();
                snsSightUploadSayFooter2.f206150o.setVisibility(8);
                SnsMethodCalculate.markEndTimeMs("hideSmileyPanel", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSightUploadSayFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter$b */
    public class C71217b implements TextView.OnEditorActionListener {
        public C71217b(SnsSightUploadSayFooter snsSightUploadSayFooter) {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SnsMethodCalculate.markStartTimeMs("onEditorAction", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter$2");
            SnsMethodCalculate.markEndTimeMs("onEditorAction", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter$2");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter$c */
    public class C71218c implements Runnable {
        public C71218c() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter$3");
            SnsSightUploadSayFooter.m83657e(SnsSightUploadSayFooter.this).performClick();
            SnsSightUploadSayFooter.m83657e(SnsSightUploadSayFooter.this).requestFocus();
            SnsSightUploadSayFooter snsSightUploadSayFooter = SnsSightUploadSayFooter.this;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
            MMActivity mMActivity = snsSightUploadSayFooter.f206149n;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
            mMActivity.showVKB();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter$3");
        }
    }

    public SnsSightUploadSayFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f206149n = (MMActivity) context;
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        ViewGroup viewGroup = (ViewGroup) View.inflate(this.f206149n, C0966R.C0971layout.c49, this);
        SnsMethodCalculate.markStartTimeMs("initCommentModeView", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        ImageButton imageButton = (ImageButton) viewGroup.findViewById(C0966R.C0970id.f5704mb);
        this.f206152q = imageButton;
        imageButton.setOnClickListener(new C71262y5(this));
        SnsMethodCalculate.markEndTimeMs("initCommentModeView", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        SnsMethodCalculate.markStartTimeMs("initSmilayPanel", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        if (C30699x0.m39154a() == null) {
            this.f206150o = new C72834u0(this.f206149n);
            SnsMethodCalculate.markEndTimeMs("initSmilayPanel", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        } else {
            ChatFooterPanel si02 = C30699x0.m39154a().si0(getContext());
            this.f206150o = si02;
            si02.setEntranceScene(2);
            this.f206150o.setVisibility(8);
            ((LinearLayout) findViewById(C0966R.C0970id.iwc)).addView(this.f206150o, -1, 0);
            this.f206150o.mo100191d();
            this.f206150o.mo100197i();
            this.f206150o.setOnTextOperationListener(new C71264z5(this));
            SnsMethodCalculate.markEndTimeMs("initSmilayPanel", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        }
        SnsMethodCalculate.markStartTimeMs("initRangeWidget", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        SightRangeWidget sightRangeWidget = (SightRangeWidget) viewGroup.findViewById(C0966R.C0970id.icd);
        this.f206153r = sightRangeWidget;
        sightRangeWidget.mo132077a((SnsUploadConfigView) null);
        this.f206153r.f277377w = 1;
        SnsMethodCalculate.markEndTimeMs("initRangeWidget", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        SnsMethodCalculate.markStartTimeMs("initLocationWidget", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        this.f206154s = (SightLocationWidget) viewGroup.findViewById(C0966R.C0970id.g4z);
        SnsMethodCalculate.markEndTimeMs("initLocationWidget", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
    }

    /* renamed from: e */
    public static /* synthetic */ MMEditText m83657e(SnsSightUploadSayFooter snsSightUploadSayFooter) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        MMEditText mMEditText = snsSightUploadSayFooter.f206151p;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        return mMEditText;
    }

    public C101802kr2 getLocation() {
        SnsMethodCalculate.markStartTimeMs(C82607s.NAME, "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        C101802kr2 location = this.f206154s.getLocation();
        SnsMethodCalculate.markEndTimeMs(C82607s.NAME, "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        return location;
    }

    public List<View> getPanelView() {
        SnsMethodCalculate.markStartTimeMs("getPanelView", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f206150o);
        SnsMethodCalculate.markEndTimeMs("getPanelView", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        return arrayList;
    }

    public void setMMEditText(MMEditText mMEditText) {
        SnsMethodCalculate.markStartTimeMs("setMMEditText", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        this.f206151p = mMEditText;
        mMEditText.setOnClickListener(new C71216a());
        mMEditText.setOnEditorActionListener(new C71217b(this));
        MMHandlerThread.postToMainThreadDelayed(new C71218c(), 200);
        SnsMethodCalculate.markEndTimeMs("setMMEditText", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
    }
}
