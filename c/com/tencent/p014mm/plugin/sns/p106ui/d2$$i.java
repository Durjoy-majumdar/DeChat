package com.tencent.p014mm.plugin.sns.p106ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94945s2;
import com.tencent.p014mm.plugin.sns.model.C94958v;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;
import java.util.concurrent.ExecutorService;
import nj3.C76879j;
import vr2.C102270y;

/* renamed from: com.tencent.mm.plugin.sns.ui.d2$$i */
public class d2$$i extends C94958v<String, Integer, Boolean> {

    /* renamed from: c */
    public C94945s2 f279341c;

    /* renamed from: d */
    public List<C102270y> f279342d;

    /* renamed from: e */
    public ProgressDialog f279343e = null;

    /* renamed from: f */
    public final /* synthetic */ C95754d2 f279344f;

    /* renamed from: com.tencent.mm.plugin.sns.ui.d2$$i$a */
    public class C95755a implements DialogInterface.OnCancelListener {
        public C95755a(d2$$i d2__i, C95754d2 d2Var) {
        }

        public void onCancel(DialogInterface dialogInterface) {
            SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.PicWidget$CommitTask$1");
            SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.PicWidget$CommitTask$1");
        }
    }

    public d2$$i(C95754d2 d2Var, C94945s2 s2Var, List<C102270y> list) {
        this.f279344f = d2Var;
        this.f279341c = s2Var;
        this.f279342d = list;
        MMActivity mMActivity = d2Var.f279311d;
        this.f279343e = C76879j.m92723Q(mMActivity, mMActivity.getString(C0966R.string.a3h), d2Var.f279311d.getString(C0966R.string.a05), false, false, new C95755a(this, d2Var));
    }

    /* renamed from: a */
    public Object mo131151a(Object[] objArr) {
        SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.PicWidget$CommitTask");
        String[] strArr = (String[]) objArr;
        SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.PicWidget$CommitTask");
        long currentTimeMillis = System.currentTimeMillis();
        C95754d2 d2Var = this.f279344f;
        C94945s2 s2Var = this.f279341c;
        List<C102270y> list = this.f279342d;
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.PicWidget");
        d2Var.getClass();
        SnsMethodCalculate.markStartTimeMs("commitImp", "com.tencent.mm.plugin.sns.ui.PicWidget");
        s2Var.mo131242P(list);
        SnsMethodCalculate.markEndTimeMs("commitImp", "com.tencent.mm.plugin.sns.ui.PicWidget");
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.PicWidget");
        this.f279341c = s2Var;
        Log.m105924i("MicroMsg.MMAsyncTask", "commit imp time " + (System.currentTimeMillis() - currentTimeMillis));
        Boolean bool = Boolean.TRUE;
        SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.PicWidget$CommitTask");
        SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.PicWidget$CommitTask");
        return bool;
    }

    /* renamed from: b */
    public ExecutorService mo131152b() {
        SnsMethodCalculate.markStartTimeMs("getExecutor", "com.tencent.mm.plugin.sns.ui.PicWidget$CommitTask");
        ExecutorService ky02 = C94866e1.ky0();
        SnsMethodCalculate.markEndTimeMs("getExecutor", "com.tencent.mm.plugin.sns.ui.PicWidget$CommitTask");
        return ky02;
    }

    /* renamed from: c */
    public void mo131153c(Object obj) {
        SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.PicWidget$CommitTask");
        SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.PicWidget$CommitTask");
        super.mo131153c((Boolean) obj);
        this.f279343e.dismiss();
        C95754d2 d2Var = this.f279344f;
        C94945s2 s2Var = this.f279341c;
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.PicWidget");
        d2Var.mo133198l(s2Var);
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.PicWidget");
        SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.PicWidget$CommitTask");
        SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.PicWidget$CommitTask");
    }
}
