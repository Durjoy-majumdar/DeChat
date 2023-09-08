package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.xweb.IXWebBroadcastListener;
import java.util.concurrent.ExecutorService;
import junit.framework.Assert;

/* renamed from: com.tencent.mm.plugin.sns.model.v */
public abstract class C94958v<Params, Progress, Result> {

    /* renamed from: a */
    public boolean f275277a = false;

    /* renamed from: b */
    public MMHandler f275278b = C94866e1.ly0();

    /* renamed from: com.tencent.mm.plugin.sns.model.v$a */
    public class C94959a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Object[] f275279d;

        /* renamed from: com.tencent.mm.plugin.sns.model.v$a$a */
        public class C94960a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Object f275281d;

            public C94960a(Object obj) {
                this.f275281d = obj;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.MagicAsyncTask$1$1");
                C94958v.this.mo131153c(this.f275281d);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.MagicAsyncTask$1$1");
            }
        }

        public C94959a(Object[] objArr) {
            this.f275279d = objArr;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.MagicAsyncTask$1");
            Object a = C94958v.this.mo131151a(this.f275279d);
            C94958v vVar = C94958v.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.MagicAsyncTask");
            MMHandler mMHandler = vVar.f275278b;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.MagicAsyncTask");
            mMHandler.post(new C94960a(a));
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.MagicAsyncTask$1");
        }
    }

    /* renamed from: a */
    public abstract Result mo131151a(Params... paramsArr);

    /* renamed from: b */
    public abstract ExecutorService mo131152b();

    /* renamed from: c */
    public void mo131153c(Result result) {
        SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.MagicAsyncTask");
        SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.MagicAsyncTask");
    }

    /* renamed from: d */
    public boolean mo131292d(Params... paramsArr) {
        SnsMethodCalculate.markStartTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.model.MagicAsyncTask");
        if (this.f275277a) {
            Assert.assertTrue("MicroMsg.MMAsyncTask Should construct a new Task", false);
        }
        this.f275277a = true;
        SnsMethodCalculate.markStartTimeMs("onPreExecute", "com.tencent.mm.plugin.sns.model.MagicAsyncTask");
        SnsMethodCalculate.markEndTimeMs("onPreExecute", "com.tencent.mm.plugin.sns.model.MagicAsyncTask");
        ExecutorService b = mo131152b();
        if (b == null) {
            SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.model.MagicAsyncTask");
            return false;
        }
        b.execute(new C94959a(paramsArr));
        SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.model.MagicAsyncTask");
        return true;
    }
}
