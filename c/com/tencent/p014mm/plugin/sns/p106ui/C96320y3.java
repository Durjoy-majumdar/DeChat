package com.tencent.p014mm.plugin.sns.p106ui;

import android.graphics.BitmapFactory;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.tencent.p014mm.p136ui.tools.C45059m0;
import com.tencent.p014mm.plugin.sns.model.C43036f0;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.y3 */
public class C96320y3 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public final /* synthetic */ SnsBrowseUI f281710d;

    /* renamed from: com.tencent.mm.plugin.sns.ui.y3$a */
    public class C96321a implements C45059m0.C45068i {
        public C96321a() {
        }

        public void onAnimationEnd() {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$3$1");
            Log.m105918d("MicroMsg.SnsPopMediasUI", "runEnterAnimation onAnimationEnd: ");
            SnsBrowseUI snsBrowseUI = C96320y3.this.f281710d;
            int i = SnsBrowseUI.f277783g1;
            SnsMethodCalculate.markStartTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            snsBrowseUI.f277800X0 = false;
            SnsMethodCalculate.markEndTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            SnsBrowseUI snsBrowseUI2 = C96320y3.this.f281710d;
            SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            boolean z = snsBrowseUI2.f277806b1;
            SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            if (!z) {
                SnsBrowseUI snsBrowseUI3 = C96320y3.this.f281710d;
                SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
                snsBrowseUI3.mo132607d8();
                SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$3$1");
        }

        public void onAnimationStart() {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$3$1");
            SnsBrowseUI snsBrowseUI = C96320y3.this.f281710d;
            int i = SnsBrowseUI.f277783g1;
            SnsMethodCalculate.markStartTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            snsBrowseUI.f277800X0 = true;
            SnsMethodCalculate.markEndTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            SnsBrowseUI snsBrowseUI2 = C96320y3.this.f281710d;
            SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            snsBrowseUI2.getClass();
            SnsMethodCalculate.markStartTimeMs("checkRequestCheckFeedForbidAccess", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            if (snsBrowseUI2.f277805a1 != 0) {
                Log.m105924i("MicroMsg.SnsPopMediasUI", "requestCheckFeedForbidAccess: ");
                snsBrowseUI2.f277806b1 = true;
                C86709a0.m107529k().f251779b.mo123460f(new C43036f0(snsBrowseUI2.f277805a1));
            }
            SnsMethodCalculate.markEndTimeMs("checkRequestCheckFeedForbidAccess", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            Log.m105918d("MicroMsg.SnsPopMediasUI", "runEnterAnimation onAnimationStart: ");
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$3$1");
        }
    }

    public C96320y3(SnsBrowseUI snsBrowseUI) {
        this.f281710d = snsBrowseUI;
    }

    public boolean onPreDraw() {
        SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$3");
        this.f281710d.f277761o.getViewTreeObserver().removeOnPreDrawListener(this);
        SnsBrowseUI snsBrowseUI = this.f281710d;
        int width = snsBrowseUI.f277761o.getWidth();
        int i = SnsBrowseUI.f277783g1;
        SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        snsBrowseUI.f277811p0 = width;
        SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        SnsBrowseUI snsBrowseUI2 = this.f281710d;
        int height = snsBrowseUI2.f277761o.getHeight();
        SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        snsBrowseUI2.f277812x0 = height;
        SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        SnsBrowseUI snsBrowseUI3 = this.f281710d;
        int width2 = snsBrowseUI3.f277761o.getWidth();
        SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        snsBrowseUI3.f277801Y = width2;
        SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        SnsBrowseUI snsBrowseUI4 = this.f281710d;
        int height2 = snsBrowseUI4.f277761o.getHeight();
        SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        snsBrowseUI4.f277803Z = height2;
        SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        C94866e1.Fx0();
        String m = C94901o.m120385m(this.f281710d.f277761o.getCntMedia());
        if (m != null) {
            BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(m);
            SnsBrowseUI snsBrowseUI5 = this.f281710d;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            int i2 = snsBrowseUI5.f277801Y;
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            snsBrowseUI5.f277803Z = (int) ((((float) i2) / ((float) imageOptions.outWidth)) * ((float) imageOptions.outHeight));
            SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            SnsBrowseUI snsBrowseUI6 = this.f281710d;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            int i3 = snsBrowseUI6.f277803Z;
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            if (i3 > this.f281710d.f277761o.getHeight()) {
                SnsBrowseUI snsBrowseUI7 = this.f281710d;
                int height3 = snsBrowseUI7.f277761o.getHeight();
                SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
                snsBrowseUI7.f277803Z = height3;
                SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            }
        }
        SnsBrowseUI snsBrowseUI8 = this.f281710d;
        C45059m0 m0Var = snsBrowseUI8.f277790S0;
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        int i4 = snsBrowseUI8.f277801Y;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        SnsBrowseUI snsBrowseUI9 = this.f281710d;
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        int i5 = snsBrowseUI9.f277803Z;
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        m0Var.f122226f = i4;
        m0Var.f122227g = i5;
        SnsBrowseUI snsBrowseUI10 = this.f281710d;
        C45059m0 m0Var2 = snsBrowseUI10.f277790S0;
        SnsInfoFlip snsInfoFlip = snsBrowseUI10.f277761o;
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        ImageView imageView = snsBrowseUI10.f277813y0;
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        m0Var2.mo70408c(snsInfoFlip, imageView, new C96321a());
        this.f281710d.mo132608e8();
        SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$3");
        return true;
    }
}
