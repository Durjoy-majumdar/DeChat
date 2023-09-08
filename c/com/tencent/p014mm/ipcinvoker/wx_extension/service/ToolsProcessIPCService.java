package com.tencent.p014mm.ipcinvoker.wx_extension.service;

import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.BaseIPCService;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService */
public class ToolsProcessIPCService extends BaseIPCService {

    /* renamed from: e */
    public static final String f108406e = (MMApplicationContext.getPackageName() + ":tools");

    /* renamed from: a */
    public static <T extends C80883e<InputType, ResultType>, InputType extends Parcelable, ResultType extends Parcelable> boolean m43508a(InputType inputtype, Class<T> cls, C1256g<ResultType> gVar) {
        if (!MMApplicationContext.isProcessExist(MMApplicationContext.getPackageName() + ":tools")) {
            return false;
        }
        return C80907o.m98782e(f108406e, inputtype, cls, gVar, (String) null);
    }
}
