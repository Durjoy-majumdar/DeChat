package h10;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import com.tencent.p014mm.plugin.sns.model.C94941r0;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.pigeon.FlutterDataSourcesPlugin;
import eb0.C75592q0;
import f10.C45736a;
import f40.C86709a0;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import i10.C98573a;
import i10.C98575b;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import l10.C46829e;
import ob0.C89137b0;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: h10.b */
public final class C98301b extends FlutterDataSourcesPlugin.SnsDataSource implements FlutterPlugin {

    /* renamed from: d */
    public final C0000n0 f288139d = C53930o0.m60555b();

    @C91590f(mo125468c = "com.tencent.mm.flutter.plugin.data_sources.plugins.FlutterPluginSnsDataSource$getImageFile$1", mo125469f = "FlutterPluginSnsDataSource.kt", mo125470l = {44}, mo125471m = "invokeSuspend")
    /* renamed from: h10.b$a */
    public static final class C98302a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f288140d;

        /* renamed from: e */
        public final /* synthetic */ FlutterDataSourcesPlugin.GetSnsImageFileRequest f288141e;

        /* renamed from: f */
        public final /* synthetic */ FlutterDataSourcesPlugin.Result<FlutterDataSourcesPlugin.GetSnsImageFileResponse> f288142f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98302a(FlutterDataSourcesPlugin.GetSnsImageFileRequest getSnsImageFileRequest, FlutterDataSourcesPlugin.Result<FlutterDataSourcesPlugin.GetSnsImageFileResponse> result, C15601d<? super C98302a> dVar) {
            super(2, dVar);
            this.f288141e = getSnsImageFileRequest;
            this.f288142f = result;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C98302a(this.f288141e, this.f288142f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C98302a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f288140d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C87412m.m108589b("", C75592q0.m90789s());
                String localId = this.f288141e.getLocalId();
                C87412m.m108593f(localId, "request.localId");
                String snsId = this.f288141e.getSnsId();
                C87412m.m108593f(snsId, "request.snsId");
                String mediaId = this.f288141e.getMediaId();
                C87412m.m108593f(mediaId, "request.mediaId");
                FlutterDataSourcesPlugin.GetSnsImageFileRequest getSnsImageFileRequest = this.f288141e;
                Boolean requestThumb = getSnsImageFileRequest != null ? getSnsImageFileRequest.getRequestThumb() : null;
                boolean booleanValue = requestThumb == null ? false : requestThumb.booleanValue();
                this.f288140d = 1;
                obj = C53895h.m60469g(C53872d1.f151119c, new C98575b(localId, snsId, mediaId, booleanValue, (C15601d<? super C98575b>) null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Exception e) {
                    this.f288142f.error(e);
                    return C13598b0.f38549a;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = (String) obj;
            FlutterDataSourcesPlugin.GetSnsImageFileResponse getSnsImageFileResponse = new FlutterDataSourcesPlugin.GetSnsImageFileResponse();
            getSnsImageFileResponse.setPath(str);
            this.f288142f.success(getSnsImageFileResponse);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: h10.b$b */
    public static final class C98303b extends C87413o implements C32226l<C46829e, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FlutterDataSourcesPlugin.Result<FlutterDataSourcesPlugin.ProtoBuffer> f288143d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98303b(FlutterDataSourcesPlugin.Result<FlutterDataSourcesPlugin.ProtoBuffer> result) {
            super(1);
            this.f288143d = result;
        }

        public Object invoke(Object obj) {
            C46829e eVar = (C46829e) obj;
            C87412m.m108594g(eVar, LocaleUtil.ITALIAN);
            Log.m105924i("MicroMsg.FlutterPluginSnsDataSource", "getLatestSns finished size:" + eVar.f125960e.size());
            FlutterDataSourcesPlugin.ProtoBuffer protoBuffer = new FlutterDataSourcesPlugin.ProtoBuffer();
            protoBuffer.setBuffer(eVar.toByteArray());
            FlutterDataSourcesPlugin.Result<FlutterDataSourcesPlugin.ProtoBuffer> result = this.f288143d;
            if (result != null) {
                result.success(protoBuffer);
            }
            return C13598b0.f38549a;
        }
    }

    public void getImageFile(FlutterDataSourcesPlugin.GetSnsImageFileRequest getSnsImageFileRequest, FlutterDataSourcesPlugin.Result<FlutterDataSourcesPlugin.GetSnsImageFileResponse> result) {
        C87412m.m108594g(getSnsImageFileRequest, "request");
        C87412m.m108594g(result, "result");
        C53895h.m60466d(this.f288139d, (C66212f) null, (C53934p0) null, new C98302a(getSnsImageFileRequest, result, (C15601d<? super C98302a>) null), 3, (Object) null);
    }

    public void getLatestSns(FlutterDataSourcesPlugin.GetSnsRequest getSnsRequest, FlutterDataSourcesPlugin.Result<FlutterDataSourcesPlugin.ProtoBuffer> result) {
        Long l = null;
        String username = getSnsRequest != null ? getSnsRequest.getUsername() : null;
        if (username == null) {
            username = "";
        }
        if (getSnsRequest != null) {
            l = getSnsRequest.getTimeLimit();
        }
        long longValue = l == null ? 259200000 : l.longValue();
        Log.m105924i("MicroMsg.FlutterPluginSnsDataSource", "getLatestSns(" + username + "), timeLimit:" + longValue);
        C98573a aVar = new C98573a(username);
        C98303b bVar = new C98303b(result);
        aVar.f289018f = longValue;
        aVar.f289019g = bVar;
        Log.m105924i("MicroMsg.SnsDataSource", "getLatestSnsInfo username:" + aVar.f289016d + ", timeLimit:" + longValue);
        if (C45736a.m51015a(aVar.f289016d)) {
            C32226l<? super C46829e, C13598b0> lVar = aVar.f289019g;
            if (lVar != null) {
                lVar.invoke(new C46829e());
            }
            Log.m105924i("MicroMsg.SnsDataSource", "do not show sns cause in black list!");
            return;
        }
        C86709a0.m107529k().f251779b.mo123455a(212, aVar);
        C89137b0 b0Var = C86709a0.m107529k().f251779b;
        String str = aVar.f289016d;
        boolean z = aVar.f289017e;
        b0Var.mo123460f(new C94941r0(str, 0, z, 0, -1, 0, z ? 4 : 8, 2));
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        FlutterDataSourcesPlugin.SnsDataSource.setup(flutterPluginBinding.getBinaryMessenger(), this);
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        C53930o0.m60558e(this.f288139d, (CancellationException) null, 1, (Object) null);
    }
}
