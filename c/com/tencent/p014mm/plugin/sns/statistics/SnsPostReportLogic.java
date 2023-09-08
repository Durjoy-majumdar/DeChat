package com.tencent.p014mm.plugin.sns.statistics;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.SnsPostInfoEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import java.util.HashMap;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic */
public class SnsPostReportLogic {

    /* renamed from: c */
    public static SnsPostReportLogic f275499c;

    /* renamed from: a */
    public HashMap<Integer, C94982a> f275500a;

    /* renamed from: b */
    public IListener<SnsPostInfoEvent> f275501b;

    /* renamed from: com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic$a */
    public class C94982a {

        /* renamed from: a */
        public int f275503a;

        /* renamed from: b */
        public String f275504b;

        public C94982a(SnsPostReportLogic snsPostReportLogic, int i, String str) {
            this.f275504b = str;
            this.f275503a = i;
        }
    }

    public SnsPostReportLogic() {
        this.f275500a = null;
        this.f275501b = new IListener<SnsPostInfoEvent>(C40008f.f107254d) {
            {
                this.__eventId = 1901115748;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic$1");
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic$1");
                ((C119157j) C119157j.f356862d).mo183875f(new C94998k(this, (SnsPostInfoEvent) iEvent));
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic$1");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic$1");
                return false;
            }
        };
        this.f275500a = new HashMap<>();
        this.f275501b.alive();
    }
}
