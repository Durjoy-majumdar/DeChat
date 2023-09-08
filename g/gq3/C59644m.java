package gq3;

import a14.C0000n0;
import android.content.ContentValues;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.mvvm.MvvmStorage;
import com.tencent.p014mm.storage.C57602s1;
import com.tencent.p014mm.storage.C57603t1;
import com.tencent.p014mm.storage.C57604w3;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import fy3.C32227p;
import gy3.C24560g0;
import gy3.C87412m;
import i40.C60247c;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.view.page.ImageQueryViewModel$dealFileExist$2", mo125469f = "ImageQueryViewModel.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: gq3.m */
public final class C59644m extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

    /* renamed from: d */
    public final /* synthetic */ String f170451d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59644m(String str, C15601d<? super C59644m> dVar) {
        super(2, dVar);
        this.f170451d = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C59644m(this.f170451d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C59644m) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C39622i0 a;
        ResultKt.throwOnFailure(obj);
        if (C86013q1.m106450k(this.f170451d)) {
            return Boolean.TRUE;
        }
        Log.m105924i("MicroMsg.ImageQueryViewModel", this.f170451d + " is no exit");
        String str = this.f170451d;
        C87412m.m108594g(str, "midPath");
        Log.m105924i("MicroMsg.ImageQueryStorage", "deleteImageByMidPath >> " + str);
        Class cls = C57604w3.class;
        synchronized (C60247c.f171776h) {
            C86709a0.m107523b().mo121108c();
            if (C60247c.class.isAssignableFrom(cls)) {
                a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
            } else {
                throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
        }
        C57603t1 t1Var = (C57603t1) ((C57604w3) a).mo85233d3(C57603t1.class);
        Log.m105924i("MicroMsg.ClsLabelInfoStorage", "deleteCLsByMidImagePath >> " + str);
        ContentValues contentValues = new ContentValues();
        contentValues.put("hd_image_path", str);
        C57602s1 s1Var = (C57602s1) t1Var.get(contentValues, C24560g0.m30725a(C57602s1.class));
        int delete$default = s1Var != null ? MvvmStorage.delete$default(t1Var, s1Var, false, false, 4, (Object) null) : 0;
        Log.m105924i("MicroMsg.ImageQueryStorage", "deleteImageByMidPath >> " + delete$default);
        return Boolean.FALSE;
    }
}
