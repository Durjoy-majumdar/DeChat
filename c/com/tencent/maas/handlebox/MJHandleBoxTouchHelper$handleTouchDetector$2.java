package com.tencent.maas.handlebox;

import com.tencent.maas.handlebox.detector.MJHandleBoxGestureDetector;
import fy3.C32224a;
import gy3.C87413o;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo182094d2 = {"Lcom/tencent/maas/handlebox/detector/MJHandleBoxGestureDetector;", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 5, 1})
public final class MJHandleBoxTouchHelper$handleTouchDetector$2 extends C87413o implements C32224a<MJHandleBoxGestureDetector> {
    public final /* synthetic */ MJHandleBoxTouchHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MJHandleBoxTouchHelper$handleTouchDetector$2(MJHandleBoxTouchHelper mJHandleBoxTouchHelper) {
        super(0);
        this.this$0 = mJHandleBoxTouchHelper;
    }

    public final MJHandleBoxGestureDetector invoke() {
        return new MJHandleBoxGestureDetector(this.this$0.getContext(), this.this$0.getViewSize(), this.this$0.handleTouchDetectorListener);
    }
}
