package com.tencent.p014mm.xeffect;

import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\b\u001a\u00020\u00048\u0002XD¢\u0006\u0006\n\u0004\b\b\u0010\tR$\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/xeffect/WeVisReportWrapper;", "Lcom/tencent/mm/xeffect/IWeVisReport;", "", "id", "", "value", "Lrx3/b0;", "report", "TAG", "Ljava/lang/String;", "impl", "Lcom/tencent/mm/xeffect/IWeVisReport;", "getImpl", "()Lcom/tencent/mm/xeffect/IWeVisReport;", "setImpl", "(Lcom/tencent/mm/xeffect/IWeVisReport;)V", "<init>", "()V", "renderlib_release"}, mo182095k = 1, mo182096mv = {1, 4, 0})
/* renamed from: com.tencent.mm.xeffect.WeVisReportWrapper */
public final class WeVisReportWrapper implements IWeVisReport {
    public static final WeVisReportWrapper INSTANCE = new WeVisReportWrapper();
    private static final String TAG = TAG;
    private static IWeVisReport impl;

    private WeVisReportWrapper() {
    }

    public final IWeVisReport getImpl() {
        return impl;
    }

    public void report(long j, String str) {
        IWeVisReport iWeVisReport = impl;
        if (iWeVisReport != null) {
            iWeVisReport.report(j, str);
        } else {
            XEffectLog.m144538b(TAG, "no report impl", new Object[0]);
        }
    }

    public final void setImpl(IWeVisReport iWeVisReport) {
        impl = iWeVisReport;
    }
}
