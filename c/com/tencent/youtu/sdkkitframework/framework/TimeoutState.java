package com.tencent.youtu.sdkkitframework.framework;

import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon;
import java.util.HashMap;

public class TimeoutState extends YtFSMBaseState {
    public void enter() {
        super.enter();
        YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>() {
            {
                put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.PROCESS_FIN);
                put(StateEvent.Name.UI_TIPS, StringCode.RST_FAILED);
                put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
                put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_VERIFY_TIMEOUT));
                put(StateEvent.Name.MESSAGE, CommonUtils.makeMessageJson(ErrorCode.YT_SDK_VERIFY_TIMEOUT, StringCode.MSG_TIMEOUT_ERROR, "Timeout"));
            }
        });
        YtFSM.getInstance().transitNow(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE));
    }

    public void enterFirst() {
    }
}
