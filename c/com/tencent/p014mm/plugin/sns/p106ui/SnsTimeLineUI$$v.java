package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.OmitAllFailSnsMsgEvent;
import com.tencent.p014mm.autogen.events.ResendAllFailSnsMsgEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$v */
public class SnsTimeLineUI$$v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsTimeLineUI f82117d;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$v$a */
    public class C30463a implements DialogInterface.OnClickListener {
        public C30463a(SnsTimeLineUI$$v snsTimeLineUI$$v) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$40$1");
            new ResendAllFailSnsMsgEvent().publish();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$40$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$v$b */
    public class C30464b implements DialogInterface.OnClickListener {
        public C30464b(SnsTimeLineUI$$v snsTimeLineUI$$v) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$40$2");
            new OmitAllFailSnsMsgEvent().publish();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$40$2");
        }
    }

    public SnsTimeLineUI$$v(SnsTimeLineUI snsTimeLineUI) {
        this.f82117d = snsTimeLineUI;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$40");
        SnsTimeLineUI snsTimeLineUI = this.f82117d;
        C76879j.m92707A(snsTimeLineUI, snsTimeLineUI.getString(C0966R.string.hbk), "", this.f82117d.getString(C0966R.string.hbl), this.f82117d.getString(C0966R.string.f7926wf), new C30463a(this), new C30464b(this));
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$40");
    }
}
