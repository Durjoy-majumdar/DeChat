package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.AbsSnsUploadSayFooter;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import p206nj.C76865k;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/SnsUploadV2SayFooter;", "Lcom/tencent/mm/plugin/sns/ui/widget/AbsSnsUploadSayFooter;", "", "getSoftInputMode", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter */
public final class SnsUploadV2SayFooter extends AbsSnsUploadSayFooter {

    /* renamed from: u */
    public final String f206166u = "MicroMsg.SnsUploadV2SayFooter";

    /* renamed from: v */
    public boolean f206167v;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter$a */
    public static final class C71227a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ SnsUploadV2SayFooter f206168d;

        /* renamed from: e */
        public final /* synthetic */ boolean f206169e;

        /* renamed from: f */
        public final /* synthetic */ int f206170f;

        public C71227a(SnsUploadV2SayFooter snsUploadV2SayFooter, boolean z, int i) {
            this.f206168d = snsUploadV2SayFooter;
            this.f206169e = z;
            this.f206170f = i;
        }

        public final void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter$refreshUIOnInputPanelChange$r$1");
            Boolean a = this.f206168d.mo98021a();
            if (this.f206169e) {
                C87412m.m108593f(a, "footerLayInBottom");
                if (a.booleanValue()) {
                    float f = (float) this.f206170f;
                    String i = SnsUploadV2SayFooter.m83664i(this.f206168d);
                    Log.m105918d(i, "onInputPanelChange: TranslationY:" + f);
                    this.f206168d.setTranslationY(-f);
                    SnsUploadV2SayFooter snsUploadV2SayFooter = this.f206168d;
                    SnsMethodCalculate.markStartTimeMs("access$setNeedTranslationY$p", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
                    snsUploadV2SayFooter.f206167v = true;
                    SnsMethodCalculate.markEndTimeMs("access$setNeedTranslationY$p", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter$refreshUIOnInputPanelChange$r$1");
                }
            }
            if (!this.f206169e) {
                SnsUploadV2SayFooter snsUploadV2SayFooter2 = this.f206168d;
                SnsMethodCalculate.markStartTimeMs("access$getNeedTranslationY$p", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
                boolean z = snsUploadV2SayFooter2.f206167v;
                SnsMethodCalculate.markEndTimeMs("access$getNeedTranslationY$p", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
                if (z) {
                    Log.m105918d(SnsUploadV2SayFooter.m83664i(this.f206168d), "onInputPanelChange: TranslationY: 0");
                    this.f206168d.setTranslationY(0.0f);
                    SnsUploadV2SayFooter snsUploadV2SayFooter3 = this.f206168d;
                    SnsMethodCalculate.markStartTimeMs("access$setNeedTranslationY$p", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
                    snsUploadV2SayFooter3.f206167v = false;
                    SnsMethodCalculate.markEndTimeMs("access$setNeedTranslationY$p", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter$refreshUIOnInputPanelChange$r$1");
                }
            }
            Log.m105918d(SnsUploadV2SayFooter.m83664i(this.f206168d), "refreshUIOnInputPanelChange: nothing");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter$refreshUIOnInputPanelChange$r$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter$b */
    public static final class C71228b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ SnsUploadV2SayFooter f206171d;

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter$b$a */
        public static final class C71229a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ SnsUploadV2SayFooter f206172d;

            public C71229a(SnsUploadV2SayFooter snsUploadV2SayFooter) {
                this.f206172d = snsUploadV2SayFooter;
            }

            public final void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter$showSmileyPanel$1$1");
                int height = this.f206172d.getHeight();
                SnsUploadV2SayFooter snsUploadV2SayFooter = this.f206172d;
                SnsMethodCalculate.markStartTimeMs("access$getSmileyPanel$p$s527954705", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
                ChatFooterPanel chatFooterPanel = snsUploadV2SayFooter.f206206g;
                SnsMethodCalculate.markEndTimeMs("access$getSmileyPanel$p$s527954705", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
                if (height < chatFooterPanel.getHeight()) {
                    this.f206172d.requestLayout();
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter$showSmileyPanel$1$1");
            }
        }

        public C71228b(SnsUploadV2SayFooter snsUploadV2SayFooter) {
            this.f206171d = snsUploadV2SayFooter;
        }

        public final void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter$showSmileyPanel$1");
            Log.m105924i(SnsUploadV2SayFooter.m83664i(this.f206171d), "showSmileyPanel in run");
            SnsUploadV2SayFooter snsUploadV2SayFooter = this.f206171d;
            SnsMethodCalculate.markStartTimeMs("access$getSmileyPanel$p$s527954705", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
            ChatFooterPanel chatFooterPanel = snsUploadV2SayFooter.f206206g;
            SnsMethodCalculate.markEndTimeMs("access$getSmileyPanel$p$s527954705", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
            chatFooterPanel.setVisibility(0);
            SnsUploadV2SayFooter snsUploadV2SayFooter2 = this.f206171d;
            snsUploadV2SayFooter2.post(new C71229a(snsUploadV2SayFooter2));
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter$showSmileyPanel$1");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnsUploadV2SayFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: i */
    public static final /* synthetic */ String m83664i(SnsUploadV2SayFooter snsUploadV2SayFooter) {
        SnsMethodCalculate.markStartTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
        String str = snsUploadV2SayFooter.f206166u;
        SnsMethodCalculate.markEndTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
        return str;
    }

    /* renamed from: c */
    public void mo97973c() {
        SnsMethodCalculate.markStartTimeMs("refreshBottomPanelHeight", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
        int validPanelHeight = KeyBoardUtil.getValidPanelHeight(this.f206205f);
        ViewGroup.LayoutParams layoutParams = this.f206206g.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = validPanelHeight;
        }
        this.f206206g.setLayoutParams(layoutParams);
        Log.m105925i(this.f206166u, "refreshBottomPanelHeight: smileyPanel height=%d", Integer.valueOf(validPanelHeight));
        SnsMethodCalculate.markEndTimeMs("refreshBottomPanelHeight", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
    }

    /* renamed from: d */
    public void mo97974d(boolean z, int i) {
        SnsMethodCalculate.markStartTimeMs("refreshUIOnInputPanelChange", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
        if (!(this.f206211o == i || i == 0)) {
            this.f206211o = i;
            SnsMethodCalculate.markStartTimeMs("saveKeyboardHeight", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
            C76865k.m92671b(getContext(), i);
            SnsMethodCalculate.markEndTimeMs("saveKeyboardHeight", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
            mo97973c();
        }
        if (z) {
            mo98024f();
        } else {
            mo98023e();
        }
        C71227a aVar = new C71227a(this, z, i);
        Log.m105918d(this.f206166u, "onInputPanelChange: ready to check footer location");
        ((C119157j) C119157j.f356862d).mo183895z(aVar);
        SnsMethodCalculate.markEndTimeMs("refreshUIOnInputPanelChange", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
    }

    public int getSoftInputMode() {
        SnsMethodCalculate.markStartTimeMs("getSoftInputMode", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
        SnsMethodCalculate.markEndTimeMs("getSoftInputMode", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
        return 18;
    }

    /* renamed from: h */
    public void mo97986h() {
        SnsMethodCalculate.markStartTimeMs("showSmileyPanel", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
        this.f206212p = true;
        this.f206206g.mo100197i();
        getInputPanelHelper().mo104362e(new C71228b(this));
        SnsMethodCalculate.markEndTimeMs("showSmileyPanel", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
    }
}
