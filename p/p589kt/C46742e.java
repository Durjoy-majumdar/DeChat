package p589kt;

import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40327m;
import com.tencent.p014mm.ipcinvoker.wx_extension.service.MainProcessIPCService;
import com.tencent.p014mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService;
import di3.C86301e;
import ei3.C86522b;

@C86522b
/* renamed from: kt.e */
public class C46742e extends C86301e implements C40327m {
    public <T extends C80883e<InputType, ResultType>, InputType extends Parcelable, ResultType extends Parcelable> boolean Ku0(InputType inputtype, Class<T> cls, C1256g<ResultType> gVar) {
        return ToolsProcessIPCService.m43508a(inputtype, cls, gVar);
    }

    public <T extends C80883e<InputType, ResultType>, InputType extends Parcelable, ResultType extends Parcelable> boolean X80(InputType inputtype, Class<T> cls, C1256g<ResultType> gVar) {
        return C80907o.m98782e(ToolsProcessIPCService.f108406e, inputtype, cls, gVar, (String) null);
    }

    /* renamed from: mS */
    public <T extends C80883e<InputType, ResultType>, InputType extends Parcelable, ResultType extends Parcelable> boolean mo63019mS(InputType inputtype, Class<T> cls, C1256g<ResultType> gVar) {
        return C80907o.m98782e(MainProcessIPCService.f108404e, inputtype, cls, gVar, (String) null);
    }
}
