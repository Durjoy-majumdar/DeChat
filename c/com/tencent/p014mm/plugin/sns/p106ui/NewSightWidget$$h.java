package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsVideoPublishLogStruct;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.p106ui.fake.SnsFakeVideoActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.C95005x;
import com.tencent.p014mm.plugin.vlog.p117ui.fake.VLogFakePlayActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import fv2.C98047a;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76912y0;

/* renamed from: com.tencent.mm.plugin.sns.ui.NewSightWidget$$h */
public class NewSightWidget$$h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ NewSightWidget f277082d;

    public NewSightWidget$$h(NewSightWidget newSightWidget) {
        this.f277082d = newSightWidget;
    }

    public void onClick(View view) {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        int i2;
        String str5;
        boolean z;
        String str6;
        NewSightWidget$$h newSightWidget$$h = this;
        View view2 = view;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/NewSightWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        String str7 = "onClick";
        SnsMethodCalculate.markStartTimeMs(str7, "com.tencent.mm.plugin.sns.ui.NewSightWidget$2");
        NewSightWidget newSightWidget = newSightWidget$$h.f277082d;
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        boolean z2 = newSightWidget.f277072x;
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        if (z2) {
            C86709a0.m107528h();
            if (!C86709a0.m107535s().mo121147n()) {
                C76912y0.m92771j(NewSightWidget.m121576m(newSightWidget$$h.f277082d), (View) null);
                SnsMethodCalculate.markEndTimeMs(str7, "com.tencent.mm.plugin.sns.ui.NewSightWidget$2");
                C117292a.m165361g(newSightWidget$$h, "com/tencent/mm/plugin/sns/ui/NewSightWidget$2", "android/view/View$OnClickListener", str7, "(Landroid/view/View;)V");
                return;
            }
            if (SnsTimeLineUI.m122313w8()) {
                NewSightWidget newSightWidget2 = newSightWidget$$h.f277082d;
                SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                newSightWidget2.mo132257q();
                SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            } else {
                NewSightWidget newSightWidget3 = newSightWidget$$h.f277082d;
                SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                newSightWidget3.mo132262v();
                SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            }
            str2 = "(Landroid/view/View;)V";
            str = "android/view/View$OnClickListener";
            str3 = "com/tencent/mm/plugin/sns/ui/NewSightWidget$2";
            str4 = "com.tencent.mm.plugin.sns.ui.NewSightWidget$2";
        } else {
            C95005x xVar = C95005x.f275632a;
            long currentTimeMillis = System.currentTimeMillis();
            SnsMethodCalculate.markStartTimeMs("updateEditPagePlayStartTime", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
            Log.m105924i("MicroMsg.SnsVideoPublishReporter", "sessionId: " + C95005x.f275633b + ", lastTimeStamp: " + C95005x.f275638g + ", currentTimeStamp: " + currentTimeMillis);
            C95005x.f275638g = currentTimeMillis;
            SnsMethodCalculate.markStartTimeMs("updateEditPagePlayCnt", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
            SnsVideoPublishLogStruct snsVideoPublishLogStruct = C95005x.f275634c;
            long j = snsVideoPublishLogStruct.f266242i;
            String str8 = str7;
            String str9 = "com.tencent.mm.plugin.sns.ui.NewSightWidget$2";
            snsVideoPublishLogStruct.f266242i = j + 1;
            Log.m105924i("MicroMsg.SnsVideoPublishReporter", "updateEditPagePlayCnt >> sessionId: " + C95005x.f275634c.f266237d + ", lastCnt: " + j + ", currentCnt: " + C95005x.f275634c.f266242i);
            SnsMethodCalculate.markEndTimeMs("updateEditPagePlayCnt", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
            SnsMethodCalculate.markEndTimeMs("updateEditPagePlayStartTime", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
            int[] iArr = new int[2];
            if (view2 != null) {
                view2.getLocationInWindow(iArr);
                i2 = view.getWidth();
                i = view.getHeight();
            } else {
                i2 = 0;
                i = 0;
            }
            NewSightWidget newSightWidget4 = newSightWidget$$h.f277082d;
            SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            C98047a aVar = newSightWidget4.f277017G;
            SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            int i3 = iArr[0];
            int i4 = iArr[1];
            aVar.getClass();
            SnsMethodCalculate.markStartTimeMs("doClick", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
            Object[] objArr = new Object[1];
            objArr[0] = Boolean.valueOf(aVar.f287468b == null);
            int[] iArr2 = iArr;
            Log.m105925i("MicroMsg.SnsFakeVLogHelper", "doClick %b", objArr);
            String str10 = "com.tencent.mm.plugin.sns.ui.NewSightWidget";
            String str11 = "(Landroid/view/View;)V";
            String str12 = "android/view/View$OnClickListener";
            String str13 = "com/tencent/mm/plugin/sns/ui/NewSightWidget$2";
            if (aVar.f287468b == null) {
                SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
                str5 = str8;
                z = false;
            } else {
                try {
                    MMActivity mMActivity = aVar.f287467a;
                    str5 = str8;
                    Class<VLogFakePlayActivity> cls = VLogFakePlayActivity.class;
                    try {
                        int i5 = VLogFakePlayActivity.f282701g;
                        Intent intent = new Intent(mMActivity, cls);
                        intent.putExtra("intent_taskid", aVar.f287470d);
                        intent.putExtra("intent_thumbpath", aVar.f287468b.f298163i);
                        intent.putExtra("sns_video_scene", 6);
                        intent.putExtra("img_gallery_left", i3);
                        intent.putExtra("img_gallery_top", i4);
                        intent.putExtra("img_gallery_width", i2);
                        intent.putExtra("img_gallery_height", i);
                        aVar.f287467a.startActivityForResult(intent, 12);
                        aVar.f287467a.overridePendingTransition(0, 0);
                    } catch (ClassNotFoundException unused) {
                    }
                } catch (ClassNotFoundException unused2) {
                    str5 = str8;
                }
                SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
                z = true;
            }
            if (z) {
                String str14 = str5;
                SnsMethodCalculate.markEndTimeMs(str14, str9);
                C117292a.m165361g(this, str13, str12, str14, str11);
                return;
            }
            String str15 = "intent_thumbpath";
            str4 = str9;
            String str16 = str11;
            String str17 = str12;
            str3 = str13;
            str7 = str5;
            newSightWidget$$h = this;
            NewSightWidget newSightWidget5 = newSightWidget$$h.f277082d;
            String str18 = "img_gallery_height";
            String str19 = str10;
            SnsMethodCalculate.markStartTimeMs("access$900", str19);
            boolean z3 = newSightWidget5.f277023M;
            SnsMethodCalculate.markEndTimeMs("access$900", str19);
            if (z3) {
                NewSightWidget newSightWidget6 = newSightWidget$$h.f277082d;
                str6 = "img_gallery_width";
                SnsMethodCalculate.markStartTimeMs("access$1000", str19);
                String str20 = newSightWidget6.f277025O;
                SnsMethodCalculate.markEndTimeMs("access$1000", str19);
                if (!str20.isEmpty()) {
                    Intent intent2 = new Intent(NewSightWidget.m121576m(newSightWidget$$h.f277082d), SnsFakeVideoActivity.class);
                    NewSightWidget newSightWidget7 = newSightWidget$$h.f277082d;
                    SnsMethodCalculate.markStartTimeMs("access$1000", str19);
                    String str21 = newSightWidget7.f277025O;
                    SnsMethodCalculate.markEndTimeMs("access$1000", str19);
                    intent2.putExtra("intent_video_background_word_id", str21);
                    intent2.putExtra("intent_video_is_preview", true);
                    intent2.putExtra("intent_left", iArr2[0]);
                    intent2.putExtra("intent_top", iArr2[1]);
                    intent2.putExtra("intent_width", i2);
                    intent2.putExtra("intent_height", i);
                    NewSightWidget newSightWidget8 = newSightWidget$$h.f277082d;
                    SnsMethodCalculate.markStartTimeMs("access$1100", str19);
                    String str22 = newSightWidget8.f277047g;
                    SnsMethodCalculate.markEndTimeMs("access$1100", str19);
                    intent2.putExtra("intent_video_thumb_path", str22);
                    NewSightWidget.m121576m(newSightWidget$$h.f277082d).startActivityForResult(intent2, 12);
                    NewSightWidget.m121576m(newSightWidget$$h.f277082d).overridePendingTransition(0, 0);
                    SnsMethodCalculate.markEndTimeMs(str7, str4);
                    C117292a.m165361g(newSightWidget$$h, str3, str17, str7, str16);
                    return;
                }
            } else {
                str6 = "img_gallery_width";
            }
            NewSightWidget newSightWidget9 = newSightWidget$$h.f277082d;
            SnsMethodCalculate.markStartTimeMs("access$000", str19);
            String str23 = newSightWidget9.f277049h;
            SnsMethodCalculate.markEndTimeMs("access$000", str19);
            if (!C86013q1.m106450k(str23)) {
                StringBuilder sb = new StringBuilder();
                sb.append("click videopath is not exist ");
                NewSightWidget newSightWidget10 = newSightWidget$$h.f277082d;
                SnsMethodCalculate.markStartTimeMs("access$000", str19);
                String str24 = newSightWidget10.f277049h;
                SnsMethodCalculate.markEndTimeMs("access$000", str19);
                sb.append(str24);
                Log.m105924i("MicroMsg.SightWidget", sb.toString());
                SnsMethodCalculate.markEndTimeMs(str7, str4);
                C117292a.m165361g(newSightWidget$$h, str3, str17, str7, str16);
                return;
            }
            str2 = str16;
            str = str17;
            Intent intent3 = new Intent(NewSightWidget.m121576m(newSightWidget$$h.f277082d), SnsOnlineVideoActivity.class);
            NewSightWidget newSightWidget11 = newSightWidget$$h.f277082d;
            SnsMethodCalculate.markStartTimeMs("access$000", str19);
            String str25 = newSightWidget11.f277049h;
            SnsMethodCalculate.markEndTimeMs("access$000", str19);
            intent3.putExtra("intent_videopath", str25);
            NewSightWidget newSightWidget12 = newSightWidget$$h.f277082d;
            SnsMethodCalculate.markStartTimeMs("access$1100", str19);
            String str26 = newSightWidget12.f277047g;
            SnsMethodCalculate.markEndTimeMs("access$1100", str19);
            intent3.putExtra(str15, str26);
            intent3.putExtra("intent_isad", false);
            intent3.putExtra("intent_ispreview", true);
            NewSightWidget newSightWidget13 = newSightWidget$$h.f277082d;
            SnsMethodCalculate.markStartTimeMs("access$1200", str19);
            boolean z4 = newSightWidget13.f277015E;
            SnsMethodCalculate.markEndTimeMs("access$1200", str19);
            intent3.putExtra("KBlockAdd", z4);
            intent3.putExtra("sns_video_scene", 6);
            intent3.putExtra("img_gallery_left", iArr2[0]);
            intent3.putExtra("img_gallery_top", iArr2[1]);
            intent3.putExtra(str6, i2);
            intent3.putExtra(str18, i);
            NewSightWidget.m121576m(newSightWidget$$h.f277082d).startActivityForResult(intent3, 12);
            NewSightWidget.m121576m(newSightWidget$$h.f277082d).overridePendingTransition(0, 0);
        }
        SnsMethodCalculate.markEndTimeMs(str7, str4);
        C117292a.m165361g(newSightWidget$$h, str3, str, str7, str2);
    }
}
