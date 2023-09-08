package pt2;

import android.view.Window;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.plugin.sns.p106ui.SnsCommentFooter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.IXWebBroadcastListener;
import di3.C86312j;
import ds2.C97532d;
import f40.C86709a0;
import gy3.C87412m;
import h81.C32735h;

/* renamed from: pt2.b */
public final class C100905b implements C7020t0 {

    /* renamed from: d */
    public final MMActivity f295502d;

    /* renamed from: e */
    public final SnsCommentFooter f295503e;

    /* renamed from: f */
    public final String f295504f = "MicroMsg.SnsCommentAdjustNothingKeyboardStateDelegate";

    /* renamed from: g */
    public int f295505g;

    /* renamed from: h */
    public boolean f295506h;

    /* renamed from: i */
    public KeyboardHeightProvider f295507i;

    /* renamed from: j */
    public boolean f295508j;

    public C100905b(MMActivity mMActivity, SnsCommentFooter snsCommentFooter) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(snsCommentFooter, "commentFooter");
        this.f295502d = mMActivity;
        this.f295503e = snsCommentFooter;
        SnsMethodCalculate.markStartTimeMs("updateUseAdjustNothingConfigValue", "com.tencent.mm.plugin.sns.model.config.SnsCommentFooterConfig");
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_SNS_COMMENT_USE_ADJUST_NOTHING_INT_SYNC, 0);
        if (j == 0) {
            C97532d.f286226a = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_comment_footer_use_adjust_nothing, true);
            Log.m105924i("MicroMsg.SnsCommentFooterConfig", "enableAdjustNothing: " + C97532d.f286226a);
            SnsMethodCalculate.markEndTimeMs("updateUseAdjustNothingConfigValue", "com.tencent.mm.plugin.sns.model.config.SnsCommentFooterConfig");
        } else if (j != 2) {
            Log.m105924i("MicroMsg.SnsCommentFooterConfig", "enableAdjustNothing false");
            C97532d.f286226a = false;
            SnsMethodCalculate.markEndTimeMs("updateUseAdjustNothingConfigValue", "com.tencent.mm.plugin.sns.model.config.SnsCommentFooterConfig");
        } else {
            Log.m105924i("MicroMsg.SnsCommentFooterConfig", "enableAdjustNothing true");
            C97532d.f286226a = true;
            SnsMethodCalculate.markEndTimeMs("updateUseAdjustNothingConfigValue", "com.tencent.mm.plugin.sns.model.config.SnsCommentFooterConfig");
        }
        SnsMethodCalculate.markStartTimeMs("enableUseAdjustNothingConfig", "com.tencent.mm.plugin.sns.model.config.SnsCommentFooterConfig");
        boolean z = C97532d.f286226a;
        SnsMethodCalculate.markEndTimeMs("enableUseAdjustNothingConfig", "com.tencent.mm.plugin.sns.model.config.SnsCommentFooterConfig");
        this.f295506h = z;
        Window window = mMActivity.getWindow();
        boolean z2 = this.f295506h;
        SnsMethodCalculate.markStartTimeMs("setWindowSoftInputModeToAdjustNothing", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (z2) {
            window.setSoftInputMode(48);
        }
        snsCommentFooter.f278041D = z2;
        Log.m105925i("MicroMsg.SnsCommentFooter", "setWindowSoftInputModeToAdjustNothing: enable:%b, current mode:%d", Boolean.valueOf(z2), Integer.valueOf(window.getAttributes().softInputMode));
        SnsMethodCalculate.markEndTimeMs("setWindowSoftInputModeToAdjustNothing", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        Log.m105924i("MicroMsg.SnsCommentAdjustNothingKeyboardStateDelegate", "init useAdjustNothing=" + this.f295506h);
        if (this.f295506h) {
            KeyboardHeightProvider keyboardHeightProvider = new KeyboardHeightProvider(mMActivity);
            this.f295507i = keyboardHeightProvider;
            keyboardHeightProvider.f220015b = this;
        }
    }

    /* renamed from: Q1 */
    public void mo531Q1(int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onKeyboardHeightChanged", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentAdjustNothingKeyboardStateDelegate");
        int max = i == 0 ? 0 : Math.max(KeyBoardUtil.getValidPanelHeight(this.f295502d, i), i);
        String str = this.f295504f;
        Log.m105924i(str, "onKeyboardHeightChanged: resultHeight:" + max + ", from provider:" + i + ", isResized=" + z);
        if (this.f295507i != null) {
            int i2 = 2;
            boolean z2 = true;
            if (max > 0) {
                i2 = 1;
            }
            if (i2 != this.f295505g) {
                this.f295505g = i2;
                this.f295502d.onKeyboardStateChanged();
            }
            SnsCommentFooter snsCommentFooter = this.f295503e;
            snsCommentFooter.getClass();
            SnsMethodCalculate.markStartTimeMs("notifyKeyBoardChangeOnAdjustNothing", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            SnsMethodCalculate.markStartTimeMs("enableWindowSoftInputModeAdjustNothing", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            boolean z3 = snsCommentFooter.f278041D;
            SnsMethodCalculate.markEndTimeMs("enableWindowSoftInputModeAdjustNothing", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            if (!z3) {
                Log.m105924i("MicroMsg.SnsCommentFooter", "notifyKeyBoardChange: should use adjustNothing!");
                SnsMethodCalculate.markEndTimeMs("notifyKeyBoardChangeOnAdjustNothing", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            } else {
                if (max <= 0) {
                    z2 = false;
                }
                snsCommentFooter.mo132685G(z2, max);
                if (snsCommentFooter.f278057p != null) {
                    if (!z2 && !snsCommentFooter.mo132700s()) {
                        Log.m105924i("MicroMsg.SnsCommentFooter", "notifyKeyBoardChange: footer need down, SmileyPanel Gone");
                        snsCommentFooter.mo132691m();
                    }
                    if (z2 && snsCommentFooter.f278057p.getVisibility() == 8) {
                        Log.m105924i("MicroMsg.SnsCommentFooter", "notifyKeyBoardChange: footer need up");
                        snsCommentFooter.mo132692n(false);
                    }
                }
                SnsMethodCalculate.markEndTimeMs("notifyKeyBoardChangeOnAdjustNothing", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            }
        }
        SnsMethodCalculate.markEndTimeMs("onKeyboardHeightChanged", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentAdjustNothingKeyboardStateDelegate");
    }

    /* renamed from: a */
    public final void mo140369a() {
        SnsMethodCalculate.markStartTimeMs("close", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentAdjustNothingKeyboardStateDelegate");
        String str = this.f295504f;
        Log.m105924i(str, "close: keyboardHeightProviderStarted=" + this.f295508j);
        KeyboardHeightProvider keyboardHeightProvider = this.f295507i;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104021d();
        }
        this.f295508j = false;
        SnsMethodCalculate.markEndTimeMs("close", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentAdjustNothingKeyboardStateDelegate");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
        if (r5 == false) goto L_0x002f;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo140370b() {
        /*
            r7 = this;
            java.lang.String r0 = "enableDelegateKeyBoardState"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.helper.SnsCommentAdjustNothingKeyboardStateDelegate"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r7.f295506h
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x002e
            java.lang.String r2 = "isUseAdjustResize"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            com.tencent.mm.ui.MMActivity r5 = r7.f295502d
            android.view.Window r5 = r5.getWindow()
            android.view.WindowManager$LayoutParams r5 = r5.getAttributes()
            int r5 = r5.softInputMode
            r5 = r5 & 240(0xf0, float:3.36E-43)
            r6 = 16
            if (r5 != r6) goto L_0x0027
            r5 = 1
            goto L_0x0028
        L_0x0027:
            r5 = 0
        L_0x0028:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            if (r5 != 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r3 = 0
        L_0x002f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: pt2.C100905b.mo140370b():boolean");
    }

    /* renamed from: c */
    public final int mo140371c() {
        SnsMethodCalculate.markStartTimeMs("getDelegateKeyBoardState", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentAdjustNothingKeyboardStateDelegate");
        String str = this.f295504f;
        Log.m105918d(str, "getDelegateKeyBoardState: " + this.f295505g);
        int i = this.f295505g;
        SnsMethodCalculate.markEndTimeMs("getDelegateKeyBoardState", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentAdjustNothingKeyboardStateDelegate");
        return i;
    }

    /* renamed from: d */
    public final void mo140372d() {
        SnsMethodCalculate.markStartTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.ui.helper.SnsCommentAdjustNothingKeyboardStateDelegate");
        String str = this.f295504f;
        Log.m105924i(str, "start: keyboardHeightProviderStarted=" + this.f295508j);
        KeyboardHeightProvider keyboardHeightProvider = this.f295507i;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104022e();
        }
        this.f295508j = true;
        SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.ui.helper.SnsCommentAdjustNothingKeyboardStateDelegate");
    }
}
