package p738wg;

import com.tencent.p014mm.autogen.events.ExtSimpleRecordEvent;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.MsgHandler$$m0;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import kd0.C99125s;

/* renamed from: wg.j */
public class C102438j extends IStaticListener<ExtSimpleRecordEvent> {

    /* renamed from: d */
    public C99125s f301685d;

    /* renamed from: e */
    public String f301686e = "";

    /* renamed from: f */
    public MTimerHandler f301687f;

    /* renamed from: g */
    public boolean f301688g;

    /* renamed from: h */
    public boolean f301689h;

    /* renamed from: i */
    public boolean f301690i;

    /* renamed from: j */
    public Runnable f301691j;

    public boolean callback(IEvent iEvent) {
        ExtSimpleRecordEvent extSimpleRecordEvent = (ExtSimpleRecordEvent) iEvent;
        if (!(extSimpleRecordEvent instanceof ExtSimpleRecordEvent)) {
            Log.m105922f("MicroMsg.ExtSimpleRecord", "mismatched event");
            return false;
        }
        int i = extSimpleRecordEvent.f264788d.f264790a;
        if (i == 1) {
            if (this.f301685d == null) {
                this.f301685d = new C99125s();
            }
            this.f301691j = extSimpleRecordEvent.f264788d.f264793d;
            C99125s sVar = this.f301685d;
            if (sVar.f290644c == 1) {
                sVar.stopRecord();
            }
            extSimpleRecordEvent.f264789e.f264794a = this.f301685d.startRecord(extSimpleRecordEvent.f264788d.f264791b);
            int i2 = extSimpleRecordEvent.f264788d.f264792c;
            if (i2 <= 0) {
                Log.m105920e("MicroMsg.ExtSimpleRecord", "duration is invalid, less than 0");
                i2 = 60;
            }
            if (i2 > 600) {
                Log.m105921e("MicroMsg.ExtSimpleRecord", "duration is invalid, more than %d", 600);
                i2 = 600;
            }
            Log.m105925i("MicroMsg.ExtSimpleRecord", "MaxVoiceRecordTime (%d)s", Integer.valueOf(i2));
            long j = (long) (i2 * 1000);
            if (this.f301687f == null) {
                this.f301687f = new MTimerHandler(new C102437i(this), false);
            }
            if (this.f301687f.stopped()) {
                this.f301687f.stopTimer();
            }
            this.f301690i = false;
            this.f301687f.startTimer(j);
            this.f301688g = false;
            Log.m105919d("MicroMsg.ExtSimpleRecord", "data.op = [%s], ret = [%s]", Integer.valueOf(extSimpleRecordEvent.f264788d.f264790a), Boolean.valueOf(extSimpleRecordEvent.f264789e.f264794a));
        } else if (i == 2 && this.f301685d != null) {
            if (!this.f301688g) {
                this.f301687f.stopTimer();
                Log.m105924i("MicroMsg.ExtSimpleRecord", "Voice record stop.");
                mo142010d();
            }
            extSimpleRecordEvent.f264789e.f264794a = this.f301689h;
            Log.m105919d("MicroMsg.ExtSimpleRecord", "data.op = [%s], fileName = [%s], ret = [%s]", Integer.valueOf(extSimpleRecordEvent.f264788d.f264790a), this.f301686e, Boolean.valueOf(extSimpleRecordEvent.f264789e.f264794a));
            this.f301686e = "";
            this.f301689h = false;
        }
        return true;
    }

    /* renamed from: d */
    public final void mo142010d() {
        C99125s sVar = this.f301685d;
        if (sVar != null) {
            sVar.stopRecord();
            this.f301689h = true;
            Runnable runnable = this.f301691j;
            if (runnable != null) {
                if (this.f301690i) {
                    ((MsgHandler$$m0.C96663a) runnable).run();
                }
                this.f301691j = null;
            }
            this.f301688g = true;
        }
    }
}
