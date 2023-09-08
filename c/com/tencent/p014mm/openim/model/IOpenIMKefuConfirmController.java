package com.tencent.p014mm.openim.model;

import android.content.Intent;
import android.os.ResultReceiver;
import kotlin.Metadata;

/* renamed from: com.tencent.mm.openim.model.IOpenIMKefuConfirmController */
public interface IOpenIMKefuConfirmController {

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/openim/model/IOpenIMKefuConfirmController$ConfirmResultReceiver;", "Landroid/os/ResultReceiver;", "plugin-comm.api_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.openim.model.IOpenIMKefuConfirmController$ConfirmResultReceiver */
    public static abstract class ConfirmResultReceiver extends ResultReceiver {
    }

    /* renamed from: a */
    boolean mo33201a();

    /* renamed from: b */
    void mo33202b(int i);

    /* renamed from: c */
    void mo33203c(int i, int i2, Intent intent);

    void cancel();

    /* renamed from: d */
    boolean mo33205d();

    int getScene();
}
