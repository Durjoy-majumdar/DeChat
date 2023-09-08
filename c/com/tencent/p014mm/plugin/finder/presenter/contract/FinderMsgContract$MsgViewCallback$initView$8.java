package com.tencent.p014mm.plugin.finder.presenter.contract;

import com.tencent.p014mm.plugin.finder.presenter.contract.FinderMsgContract;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import fy3.C32226l;
import gy3.C87413o;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "invoke", "(Ljava/lang/Void;)Ljava/lang/Integer;"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$initView$8 */
public final class FinderMsgContract$MsgViewCallback$initView$8 extends C87413o implements C32226l<Void, Integer> {

    /* renamed from: d */
    public final /* synthetic */ FinderMsgContract.MsgViewCallback f160424d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderMsgContract$MsgViewCallback$initView$8(FinderMsgContract.MsgViewCallback msgViewCallback) {
        super(1);
        this.f160424d = msgViewCallback;
    }

    public Object invoke(Object obj) {
        Void voidR = (Void) obj;
        FinderMsgContract.MsgPresenter msgPresenter = this.f160424d.f160389f;
        FinderMsgContract.f160373a.getClass();
        return Integer.valueOf(msgPresenter.mo78474n(MAlarmHandler.NEXT_FIRE_INTERVAL, FinderMsgContract.f160375c, false, true));
    }
}
