package f33;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.executor.InsertExecutor;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverOwner;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import fy3.C32227p;
import kotlin.ResultKt;
import p749xh.C102651h0;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.video.remux.storage.BackgroundVideoInfoStorageManager$insertVideoInfo$2", mo125469f = "BackgroundVideoInfoStorageManager.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: f33.c */
public final class C97825c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C102651h0 f286973d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97825c(C102651h0 h0Var, C15601d<? super C97825c> dVar) {
        super(2, dVar);
        this.f286973d = h0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C97825c(this.f286973d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C97825c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        ISQLiteDatabase a = C97826d.f286974a.mo137158a();
        C102651h0 h0Var = this.f286973d;
        SingleTable singleTable = C102651h0.f302391Q;
        long execute = new InsertExecutor(h0Var, true, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, "MicroMsg.SDK.BaseBackgroundVideoInfo").execute(a);
        Log.m105924i("MicroMsg，BackgroundVideoInfoStorageManager", "insertVideoInfo result >> workTagId: " + this.f286973d.field_work_id + ", result: " + execute);
        return C13598b0.f38549a;
    }
}
