package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import qc0.C101093a;
import qc0.C101106m;

/* renamed from: com.tencent.mm.plugin.sns.ui.s1 */
public class C85473s1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MusicWidget f249098d;

    public C85473s1(MusicWidget musicWidget) {
        this.f249098d = musicWidget;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.MusicWidget$3");
        if (3 == MusicWidget.m121558k(this.f249098d).getType()) {
            MusicWidget musicWidget = this.f249098d;
            SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.MusicWidget");
            musicWidget.f276982o = true;
            SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.MusicWidget");
            WXMusicObject wXMusicObject = (WXMusicObject) MusicWidget.m121558k(this.f249098d).mediaObject;
            String nullAs = Util.nullAs(!Util.isNullOrNil(wXMusicObject.musicUrl) ? wXMusicObject.musicUrl : wXMusicObject.musicLowBandUrl, "");
            String nullAs2 = Util.nullAs(!Util.isNullOrNil(wXMusicObject.musicDataUrl) ? wXMusicObject.musicDataUrl : wXMusicObject.musicUrl, "");
            MusicWidget musicWidget2 = this.f249098d;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.MusicWidget");
            String str = musicWidget2.f276977j;
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.MusicWidget");
            if (Util.isNullOrNil(str)) {
                MusicWidget musicWidget3 = this.f249098d;
                SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.MusicWidget");
                musicWidget3.f276977j = System.currentTimeMillis() + "";
                SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.MusicWidget");
            }
            C101106m mVar = new C101106m();
            mVar.f295959d = 1;
            MusicWidget musicWidget4 = this.f249098d;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.MusicWidget");
            String str2 = musicWidget4.f276977j;
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.MusicWidget");
            mVar.f295960e = str2;
            mVar.f295961f = 0.0f;
            mVar.f295964i = "";
            mVar.f295970r = null;
            mVar.f295969q = null;
            mVar.f295962g = MusicWidget.m121558k(this.f249098d).title;
            mVar.f295963h = MusicWidget.m121558k(this.f249098d).description;
            mVar.f295968p = nullAs;
            mVar.f295967o = nullAs2;
            mVar.f295966n = nullAs2;
            mVar.f295975w = "";
            C94866e1.xx0();
            MusicWidget musicWidget5 = this.f249098d;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.MusicWidget");
            String str3 = musicWidget5.f276978k;
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.MusicWidget");
            mVar.f295972t = str3;
            C101093a.m132488j(mVar);
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.MusicWidget$3");
    }
}
