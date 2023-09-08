package jk2;

import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.rtos.model.RtosQuickReply;
import com.tencent.p014mm.plugin.rtos.model.RtosQuickReplyList;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wechat.rtos.WeChatApi;
import gy3.C87412m;
import java.util.ArrayList;
import kotlin.Metadata;
import nk2.C21641f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Ljk2/z;", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/plugin/rtos/model/RtosQuickReplyList;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "feature-exdevice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: jk2.z */
public final class C21262z implements C80916r<RtosQuickReplyList, IPCVoid> {
    public Object invoke(Object obj) {
        RtosQuickReplyList rtosQuickReplyList = (RtosQuickReplyList) obj;
        C21641f a = C21641f.f61259l.mo33911a();
        Integer num = null;
        ArrayList<RtosQuickReply> arrayList = rtosQuickReplyList != null ? rtosQuickReplyList.f81933d : null;
        if (!a.f61264d) {
            Log.m105928w("MicroMsg.Rtos.RtosWatchService", "syncQuickReply but not init");
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("syncQuickReply ");
            if (arrayList != null) {
                num = Integer.valueOf(arrayList.size());
            }
            sb.append(num);
            Log.m105924i("MicroMsg.Rtos.RtosWatchService", sb.toString());
            if (arrayList != null) {
                int size = arrayList.size();
                String[] strArr = new String[size];
                for (int i = 0; i < size; i++) {
                    RtosQuickReply rtosQuickReply = arrayList.get(i);
                    C87412m.m108593f(rtosQuickReply, "replyList[i]");
                    strArr[i] = rtosQuickReply.f81932e;
                }
                Log.m105924i("MicroMsg.Rtos.RtosWatchService", "replies " + Integer.valueOf(size));
                WeChatApi weChatApi = a.f61262b;
                if (weChatApi != null) {
                    weChatApi.setFastReplies(strArr);
                }
            }
        }
        return new IPCVoid();
    }
}
