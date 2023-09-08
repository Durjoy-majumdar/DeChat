package com.tencent.p014mm.plugin.sns.p106ui;

import android.os.Vibrator;
import android.view.View;
import com.tencent.p014mm.plugin.sns.cover.api.AbsSnsBackPreview;
import com.tencent.p014mm.plugin.sns.cover.preview.SnsCoverContainerLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import gv2.C98244q;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.sns.ui.r4 */
public class C96197r4 extends C98244q.C98247c {

    /* renamed from: a */
    public final /* synthetic */ SnsHeader f281030a;

    public C96197r4(SnsHeader snsHeader) {
        this.f281030a = snsHeader;
    }

    /* renamed from: a */
    public void mo132974a(boolean z, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.SnsHeader$2");
        if (z) {
            SnsMethodCalculate.markEndTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.SnsHeader$2");
            return;
        }
        float f = 1.0f;
        C98244q c = SnsHeader.m122097c(this.f281030a);
        c.getClass();
        SnsMethodCalculate.markStartTimeMs("getOpenTarget", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        int i3 = c.f288038c;
        SnsMethodCalculate.markEndTimeMs("getOpenTarget", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        float f2 = (((float) (-i2)) * 1.0f) / ((float) i3);
        if (f2 <= 1.0f) {
            f = f2 < 0.0f ? 0.0f : f2;
        }
        SnsCoverContainerLayout snsCoverContainerLayout = this.f281030a.f278099d.f278137l;
        snsCoverContainerLayout.getClass();
        SnsMethodCalculate.markStartTimeMs("opening", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        AbsSnsBackPreview absSnsBackPreview = snsCoverContainerLayout.f274636e;
        if (absSnsBackPreview != null) {
            float f3 = snsCoverContainerLayout.f274640i;
            float f4 = snsCoverContainerLayout.f274641j;
            absSnsBackPreview.setTranslationY(((f3 - f4) * f) + f4);
        }
        SnsMethodCalculate.markEndTimeMs("opening", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        SnsHeader.m122096b(this.f281030a, f);
        SnsMethodCalculate.markEndTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.SnsHeader$2");
    }

    /* renamed from: b */
    public void mo133830b(int i, boolean z) {
        int i2 = i;
        SnsMethodCalculate.markStartTimeMs("onOpenStateChange", "com.tencent.mm.plugin.sns.ui.SnsHeader$2");
        Log.m105925i("MicroMsg.SnsHeader", "onOpenStateChange: %s, %s", Integer.valueOf(i), Boolean.valueOf(z));
        if (i2 == 0) {
            this.f281030a.f278099d.f278137l.mo130663a();
            SnsHeader.m122096b(this.f281030a, 0.0f);
        } else if (i2 == 1) {
            SnsCoverContainerLayout snsCoverContainerLayout = this.f281030a.f278099d.f278137l;
            snsCoverContainerLayout.getClass();
            SnsMethodCalculate.markStartTimeMs("onPostOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
            Log.m105924i("MicroMsg.SnsCoverContainerLayout", '[' + snsCoverContainerLayout.hashCode() + "] onPostOpen");
            snsCoverContainerLayout.f274639h.f295360a = false;
            AbsSnsBackPreview absSnsBackPreview = snsCoverContainerLayout.f274636e;
            if (absSnsBackPreview != null) {
                absSnsBackPreview.onPostOpen();
            }
            SnsMethodCalculate.markEndTimeMs("onPostOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
            SnsHeader.m122096b(this.f281030a, 1.0f);
        } else if (i2 == 2) {
            SnsCoverContainerLayout snsCoverContainerLayout2 = this.f281030a.f278099d.f278137l;
            snsCoverContainerLayout2.getClass();
            SnsMethodCalculate.markStartTimeMs("onPreOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
            Log.m105924i("MicroMsg.SnsCoverContainerLayout", '[' + snsCoverContainerLayout2.hashCode() + "] onPreOpen");
            View view = snsCoverContainerLayout2.f274638g;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/cover/preview/SnsCoverContainerLayout", "onPreOpen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/cover/preview/SnsCoverContainerLayout", "onPreOpen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            AbsSnsBackPreview absSnsBackPreview2 = snsCoverContainerLayout2.f274636e;
            if (absSnsBackPreview2 != null) {
                absSnsBackPreview2.onPreOpen();
            }
            snsCoverContainerLayout2.f274649u.mo141568h();
            SnsMethodCalculate.markEndTimeMs("onPreOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
            if (z) {
                SnsHeader snsHeader = this.f281030a;
                SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                snsHeader.getClass();
                SnsMethodCalculate.markStartTimeMs("coverVibrate", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                ((Vibrator) snsHeader.f278104i.getSystemService("vibrator")).vibrate(10);
                SnsMethodCalculate.markEndTimeMs("coverVibrate", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            }
            SnsHeader snsHeader2 = this.f281030a;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            snsHeader2.getClass();
            SnsMethodCalculate.markStartTimeMs("onCoverPreOpen", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            View view3 = snsHeader2.f278118z;
            if (view3 != null) {
                snsHeader2.f278118z.animate().translationY((float) (-view3.getHeight())).start();
            }
            SnsMethodCalculate.markEndTimeMs("onCoverPreOpen", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        } else if (i2 == 3) {
            this.f281030a.f278099d.f278137l.mo130664b();
            SnsHeader snsHeader3 = this.f281030a;
            SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            snsHeader3.getClass();
            SnsMethodCalculate.markStartTimeMs("onCoverPreClose", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            View view4 = snsHeader3.f278118z;
            if (view4 != null) {
                view4.animate().translationY(0.0f).start();
            }
            SnsMethodCalculate.markEndTimeMs("onCoverPreClose", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        }
        SnsMethodCalculate.markEndTimeMs("onOpenStateChange", "com.tencent.mm.plugin.sns.ui.SnsHeader$2");
    }
}
