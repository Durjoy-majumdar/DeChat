package com.tencent.p014mm.matrix;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.ExptChangeEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.matrix.MatrixDelegate$10 */
class MatrixDelegate$10 extends IListener<ExptChangeEvent> {
    public MatrixDelegate$10(C0125s sVar) {
        super(sVar);
        this.__eventId = -31521245;
    }

    public boolean callback(IEvent iEvent) {
        ExptChangeEvent exptChangeEvent = (ExptChangeEvent) iEvent;
        try {
            C80981c.m98872b();
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace("MatrixDelegate", e, "Cannot load A/B test", new Object[0]);
            return true;
        }
    }
}
