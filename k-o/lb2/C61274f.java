package lb2;

import a14.C0000n0;
import com.tencent.p014mm.plugin.p081mv.p082ui.MusicMvRouterUI;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C64417hb1;
import te3.C64621p23;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.mv.ui.MusicMvRouterUI$isFlexEditMv$2", mo125469f = "MusicMvRouterUI.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: lb2.f */
public final class C61274f extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

    /* renamed from: d */
    public final /* synthetic */ MusicMvRouterUI f174380d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61274f(MusicMvRouterUI musicMvRouterUI, C15601d<? super C61274f> dVar) {
        super(2, dVar);
        this.f174380d = musicMvRouterUI;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C61274f(this.f174380d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C61274f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        FinderObjectDesc finderObjectDesc;
        C64417hb1 hb12;
        ResultKt.throwOnFailure(obj);
        boolean z = false;
        try {
            byte[] byteArrayExtra = this.f174380d.getIntent().getByteArrayExtra("key_track_data");
            if (byteArrayExtra == null) {
                return Boolean.FALSE;
            }
            C64621p23 p232 = new C64621p23();
            p232.parseFrom(byteArrayExtra);
            FinderObject finderObject = p232.f184739d;
            if (!(finderObject == null || (finderObjectDesc = finderObject.objectDesc) == null || (hb12 = finderObjectDesc.mvInfo) == null || hb12.f183461j != 1)) {
                z = true;
            }
            return Boolean.valueOf(z);
        } catch (Exception unused) {
        }
    }
}
