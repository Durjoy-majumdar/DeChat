package sb2;

import a14.C0000n0;
import android.app.ProgressDialog;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.p081mv.model.MvCreateReportHelper;
import com.tencent.p014mm.plugin.p081mv.p082ui.free.MusicMvFreeMakerPreviewUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C45252f;
import d14.C45253g;
import fy3.C32227p;
import gy3.C87412m;
import ib2.C60265a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C9556a;
import kotlin.ResultKt;
import o40.C61926c;
import pb0.C47445a;
import qb0.C47798b;
import rx3.C13598b0;
import te3.C48991ce1;
import te3.C50623o13;
import te3.C64621p23;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFlexEditUIC$arrangementTrack$3$3", mo125469f = "MusicMvMakerFlexEditUIC.kt", mo125470l = {206}, mo125471m = "invokeSuspend")
/* renamed from: sb2.d0 */
public final class C63753d0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f180717d;

    /* renamed from: e */
    public final /* synthetic */ C45252f<C47445a<C50623o13>> f180718e;

    /* renamed from: f */
    public final /* synthetic */ C63759f0 f180719f;

    /* renamed from: g */
    public final /* synthetic */ C63844s f180720g;

    /* renamed from: h */
    public final /* synthetic */ HashMap<String, C60265a> f180721h;

    /* renamed from: sb2.d0$a */
    public static final class C63754a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ C63759f0 f180722d;

        /* renamed from: e */
        public final /* synthetic */ C63844s f180723e;

        /* renamed from: f */
        public final /* synthetic */ HashMap<String, C60265a> f180724f;

        /* renamed from: sb2.d0$a$a */
        public /* synthetic */ class C48369a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f129491a;

            static {
                int[] iArr = new int[C47798b.values().length];
                iArr[2] = 1;
                f129491a = iArr;
            }
        }

        public C63754a(C63759f0 f0Var, C63844s sVar, HashMap<String, C60265a> hashMap) {
            this.f180722d = f0Var;
            this.f180723e = sVar;
            this.f180724f = hashMap;
        }

        public Object emit(Object obj, C15601d dVar) {
            C47445a aVar = (C47445a) obj;
            if (C48369a.f129491a[aVar.f128348a.ordinal()] == 1) {
                ProgressDialog progressDialog = this.f180722d.f180778q;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                if (aVar.f128350c != 0) {
                    Log.m105924i("MicroMsg.Mv.MusicMvMakerFlexEditUIC", "errType:" + aVar.f128349b + ", errCode:" + aVar.f128350c);
                    return C13598b0.f38549a;
                }
                C64621p23 value = this.f180723e.f180977g.getValue();
                T t = aVar.f128353f;
                C63759f0 f0Var = this.f180722d;
                HashMap<String, C60265a> hashMap = this.f180724f;
                if (!(value == null || t == null)) {
                    LinkedList<C48991ce1> linkedList = ((C50623o13) t).f138904d;
                    C87412m.m108593f(linkedList, "resp.res_list");
                    C64621p23 c3 = C63759f0.m75020c3(f0Var, value, linkedList, hashMap);
                    c3.f184741f = "";
                    Intent intent = new Intent(f0Var.getActivity(), MusicMvFreeMakerPreviewUI.class);
                    intent.putExtra("key_track_data", c3.toByteArray());
                    intent.putExtra("key_seek_to_start", true);
                    C61926c.m72680e(intent, f0Var.getActivity().getIntent(), "key_mv_from_scene", 0, 4, (Object) null);
                    AppCompatActivity activity = f0Var.getActivity();
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(intent);
                    AppCompatActivity appCompatActivity = activity;
                    C117292a.m165358d(appCompatActivity, aVar2.mo10232b(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerFlexEditUIC", "handleArrangementResp", "(Lcom/tencent/mm/protocal/protobuf/MusicMvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activity.startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerFlexEditUIC", "handleArrangementResp", "(Lcom/tencent/mm/protocal/protobuf/MusicMvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    ArrayList<T> arrayList = f0Var.f180772h.f272353o;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        T next = it.next();
                        if (((C60265a) next).f171818j > 0) {
                            arrayList2.add(next);
                        }
                    }
                    int size = arrayList2.size();
                    MvCreateReportHelper.f163005a.mo80350a((f0Var.f180772h.f272353o.size() - size) - 1, size);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63753d0(C45252f<C47445a<C50623o13>> fVar, C63759f0 f0Var, C63844s sVar, HashMap<String, C60265a> hashMap, C15601d<? super C63753d0> dVar) {
        super(2, dVar);
        this.f180718e = fVar;
        this.f180719f = f0Var;
        this.f180720g = sVar;
        this.f180721h = hashMap;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C63753d0(this.f180718e, this.f180719f, this.f180720g, this.f180721h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C63753d0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f180717d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C45252f<C47445a<C50623o13>> fVar = this.f180718e;
            C63754a aVar2 = new C63754a(this.f180719f, this.f180720g, this.f180721h);
            this.f180717d = 1;
            if (fVar.mo31880a(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
