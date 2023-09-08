package b10;

import a14.C0000n0;
import android.app.Activity;
import com.tencent.pigeon.FlutterNavigatorPigeon;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32227p;
import gy3.C24564k0;
import gy3.C87412m;
import java.util.Map;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.flutter.base.navigator.FlutterNavigatorPlugin$push$1", mo125469f = "FlutterNavigatorPlugin.kt", mo125470l = {64}, mo125471m = "invokeSuspend")
public final class c$$b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f307619d;

    /* renamed from: e */
    public final /* synthetic */ Map<Object, Object> f307620e;

    /* renamed from: f */
    public final /* synthetic */ C104004c f307621f;

    /* renamed from: g */
    public final /* synthetic */ String f307622g;

    /* renamed from: h */
    public final /* synthetic */ String f307623h;

    /* renamed from: i */
    public final /* synthetic */ FlutterNavigatorPigeon.Result<Map<Object, Object>> f307624i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c$$b(Map<Object, Object> map, C104004c cVar, String str, String str2, FlutterNavigatorPigeon.Result<Map<Object, Object>> result, C15601d<? super c$$b> dVar) {
        super(2, dVar);
        this.f307620e = map;
        this.f307621f = cVar;
        this.f307622g = str;
        this.f307623h = str2;
        this.f307624i = result;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new c$$b(this.f307620e, this.f307621f, this.f307622g, this.f307623h, this.f307624i, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((c$$b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f307619d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Map<Object, Object> map = this.f307620e;
            if (!C24564k0.m30744h(map)) {
                map = null;
            }
            Map<Object, Object> map2 = map;
            C104004c cVar = this.f307621f;
            Activity activity = cVar.f307615d;
            if (activity == null) {
                return C13598b0.f38549a;
            }
            C104005d dVar = cVar.f307618g;
            if (dVar != null) {
                C87412m.m108591d(dVar);
                String str = this.f307622g;
                String str2 = this.f307623h;
                this.f307619d = 1;
                obj = dVar.mo10723a(activity, str, str2, map2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                FlutterNavigatorPigeon.Result<Map<Object, Object>> result = this.f307624i;
                result.error(new Exception("Cannot find navigator for " + this.f307622g + XVFSFile.SEPARATOR_CHAR + this.f307623h));
                return C13598b0.f38549a;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C0241b bVar = (C0241b) obj;
        if (bVar.f776a) {
            this.f307624i.success(bVar.f777b);
        } else {
            FlutterNavigatorPigeon.Result<Map<Object, Object>> result2 = this.f307624i;
            result2.error(new Exception("Cannot push " + this.f307622g + XVFSFile.SEPARATOR_CHAR + this.f307623h));
        }
        return C13598b0.f38549a;
    }
}
