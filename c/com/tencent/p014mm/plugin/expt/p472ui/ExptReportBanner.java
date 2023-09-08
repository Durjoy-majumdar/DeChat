package com.tencent.p014mm.plugin.expt.p472ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.StartMonitorKVEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import la1.C61258b;
import xd3.C78802b;

/* renamed from: com.tencent.mm.plugin.expt.ui.ExptReportBanner */
public class ExptReportBanner extends C78802b {

    /* renamed from: h */
    public View f158363h;

    /* renamed from: i */
    public View f158364i;

    /* renamed from: j */
    public TextView f158365j;

    /* renamed from: n */
    public IListener<StartMonitorKVEvent> f158366n = new IListener<StartMonitorKVEvent>(C40008f.f107254d) {
        {
            this.__eventId = -337129945;
        }

        public boolean callback(IEvent iEvent) {
            StartMonitorKVEvent startMonitorKVEvent = (StartMonitorKVEvent) iEvent;
            Log.m105925i("MicroMsg.ExptReportBanner", "expt report banner callback %s", Integer.valueOf(ExptReportBanner.this.hashCode()));
            if (startMonitorKVEvent != null) {
                if (!Util.isNullOrNil(startMonitorKVEvent.f154881d.f154882a)) {
                    ExptReportBanner exptReportBanner = ExptReportBanner.this;
                    exptReportBanner.getClass();
                    MMHandlerThread.postToMainThread(new C55647m(exptReportBanner));
                } else {
                    ExptReportBanner exptReportBanner2 = ExptReportBanner.this;
                    exptReportBanner2.getClass();
                    MMHandlerThread.postToMainThread(new C55648n(exptReportBanner2));
                }
            }
            return false;
        }
    };

    public ExptReportBanner(Context context) {
        super(context);
        Log.m105925i("MicroMsg.ExptReportBanner", "expt report banner initialize %d", Integer.valueOf(hashCode()));
        this.f158366n.alive();
        this.f158363h = this.f230569f.findViewById(C0966R.C0970id.a7e);
        this.f158364i = this.f230569f.findViewById(C0966R.C0970id.a7h);
        this.f158365j = (TextView) this.f230569f.findViewById(C0966R.C0970id.hku);
        this.f158363h.setOnClickListener(new C55644l(this));
        if (true ^ Util.isNullOrNil(C61258b.vx0().f174351d)) {
            MMHandlerThread.postToMainThread(new C55647m(this));
        } else {
            MMHandlerThread.postToMainThread(new C55648n(this));
        }
    }

    /* renamed from: a */
    public void mo7968a() {
        Log.m105925i("MicroMsg.ExptReportBanner", "expt report banner destroy %d", Integer.valueOf(hashCode()));
        this.f158366n.dead();
    }

    /* renamed from: b */
    public int mo7969b() {
        return C0966R.C0971layout.a56;
    }
}
