package jk2;

import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wechat.rtos.WeChatApi;
import gy3.C87412m;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import kotlin.Metadata;
import nk2.C21641f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Ljk2/r;", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "feature-exdevice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: jk2.r */
public final class C21258r implements C80916r<IPCString, IPCVoid> {
    public Object invoke(Object obj) {
        IPCString iPCString = (IPCString) obj;
        Log.m105924i("MicroMsg.Rtos.IPCSyncINvokeTask_OnUploadXlog", "invoke UploadXlog");
        C21641f a = C21641f.f61259l.mo33911a();
        String str = iPCString != null ? iPCString.f10315d : null;
        a.getClass();
        Log.m105924i("MicroMsg.Rtos.RtosWatchService", "onXlogUpload: " + str);
        long nowMilliSecond = (((Util.nowMilliSecond() / 86400000) * 86400000) + 57600000) - 1;
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.append("000000");
        String stringBuffer2 = stringBuffer.toString();
        C87412m.m108593f(stringBuffer2, "StringBuffer(date).append(\"000000\").toString()");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        long nowMilliSecond2 = Util.nowMilliSecond();
        try {
            nowMilliSecond2 = simpleDateFormat.parse(stringBuffer2).getTime();
        } catch (ParseException unused) {
            Log.m105921e("MicroMsg.Rtos.RtosWatchService", "dateToTimeStamp failed. date:%s, stack:%s", stringBuffer2, Util.getStack());
        }
        int i = (int) ((nowMilliSecond - nowMilliSecond2) / 86400000);
        Log.m105924i("MicroMsg.Rtos.RtosWatchService", "time = " + i);
        WeChatApi weChatApi = a.f61262b;
        if (weChatApi != null) {
            weChatApi.uploadXlog(i);
        }
        return new IPCVoid();
    }
}
