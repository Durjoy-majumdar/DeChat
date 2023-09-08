package h10;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.pigeon.FlutterDataSourcesPlugin;
import fy3.C32227p;
import gy3.C87412m;
import j10.C60711a;
import j10.C60713b;
import j10.C60715c;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import l10.C61186f;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: h10.c */
public final class C98304c extends FlutterDataSourcesPlugin.TextStatusDataSource implements FlutterPlugin {

    /* renamed from: d */
    public final C0000n0 f288144d = C53930o0.m60555b();

    @C91590f(mo125468c = "com.tencent.mm.flutter.plugin.data_sources.plugins.FlutterPluginTextStatusDataSource$getImageFile$1", mo125469f = "FlutterPluginTextStatusDataSource.kt", mo125470l = {51}, mo125471m = "invokeSuspend")
    /* renamed from: h10.c$a */
    public static final class C98305a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f288145d;

        /* renamed from: e */
        public final /* synthetic */ FlutterDataSourcesPlugin.GetTextStatusImageFileRequest f288146e;

        /* renamed from: f */
        public final /* synthetic */ FlutterDataSourcesPlugin.Result<FlutterDataSourcesPlugin.GetTextStatusImageFileResponse> f288147f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98305a(FlutterDataSourcesPlugin.GetTextStatusImageFileRequest getTextStatusImageFileRequest, FlutterDataSourcesPlugin.Result<FlutterDataSourcesPlugin.GetTextStatusImageFileResponse> result, C15601d<? super C98305a> dVar) {
            super(2, dVar);
            this.f288146e = getTextStatusImageFileRequest;
            this.f288147f = result;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C98305a(this.f288146e, this.f288147f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C98305a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f288145d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                new C60711a();
                String username = this.f288146e.getUsername();
                C87412m.m108593f(username, "request.username");
                String url = this.f288146e.getUrl();
                C87412m.m108593f(url, "request.url");
                String statusId = this.f288146e.getStatusId();
                C87412m.m108593f(statusId, "request.statusId");
                this.f288145d = 1;
                obj = C53895h.m60469g(C53872d1.f151119c, new C60713b(username, url, statusId, (C15601d<? super C60713b>) null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Exception e) {
                    Log.m105928w("MicroMsg.FlutterPluginTextStatusDataSource", "Failed to get image file: " + e);
                    this.f288147f.error(e);
                    return C13598b0.f38549a;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            FlutterDataSourcesPlugin.Result<FlutterDataSourcesPlugin.GetTextStatusImageFileResponse> result = this.f288147f;
            FlutterDataSourcesPlugin.GetTextStatusImageFileResponse getTextStatusImageFileResponse = new FlutterDataSourcesPlugin.GetTextStatusImageFileResponse();
            getTextStatusImageFileResponse.setPath((String) obj);
            result.success(getTextStatusImageFileResponse);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.flutter.plugin.data_sources.plugins.FlutterPluginTextStatusDataSource$getTextStatus$1", mo125469f = "FlutterPluginTextStatusDataSource.kt", mo125470l = {33}, mo125471m = "invokeSuspend")
    /* renamed from: h10.c$b */
    public static final class C98306b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f288148d;

        /* renamed from: e */
        public final /* synthetic */ String f288149e;

        /* renamed from: f */
        public final /* synthetic */ FlutterDataSourcesPlugin.Result<FlutterDataSourcesPlugin.ProtoBuffer> f288150f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98306b(String str, FlutterDataSourcesPlugin.Result<FlutterDataSourcesPlugin.ProtoBuffer> result, C15601d<? super C98306b> dVar) {
            super(2, dVar);
            this.f288149e = str;
            this.f288150f = result;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C98306b(this.f288149e, this.f288150f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C98306b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f288148d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                new C60711a();
                String str = this.f288149e;
                C87412m.m108593f(str, "username");
                this.f288148d = 1;
                obj = C53895h.m60469g(C53872d1.f151119c, new C60715c(str, (C15601d<? super C60715c>) null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Exception e) {
                    Log.m105928w("MicroMsg.FlutterPluginTextStatusDataSource", "Failed to get status: " + e);
                    this.f288150f.error(e);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            FlutterDataSourcesPlugin.Result<FlutterDataSourcesPlugin.ProtoBuffer> result = this.f288150f;
            FlutterDataSourcesPlugin.ProtoBuffer protoBuffer = new FlutterDataSourcesPlugin.ProtoBuffer();
            protoBuffer.setBuffer(((C61186f) obj).toByteArray());
            result.success(protoBuffer);
            return C13598b0.f38549a;
        }
    }

    public void getImageFile(FlutterDataSourcesPlugin.GetTextStatusImageFileRequest getTextStatusImageFileRequest, FlutterDataSourcesPlugin.Result<FlutterDataSourcesPlugin.GetTextStatusImageFileResponse> result) {
        C87412m.m108594g(getTextStatusImageFileRequest, "request");
        C87412m.m108594g(result, "result");
        C53895h.m60466d(this.f288144d, (C66212f) null, (C53934p0) null, new C98305a(getTextStatusImageFileRequest, result, (C15601d<? super C98305a>) null), 3, (Object) null);
    }

    public void getTextStatus(FlutterDataSourcesPlugin.GetTextStatusRequest getTextStatusRequest, FlutterDataSourcesPlugin.Result<FlutterDataSourcesPlugin.ProtoBuffer> result) {
        C87412m.m108594g(getTextStatusRequest, "request");
        C87412m.m108594g(result, "result");
        String username = getTextStatusRequest.getUsername();
        Log.m105924i("MicroMsg.FlutterPluginTextStatusDataSource", "getTextStatus(" + username + ')');
        C53895h.m60466d(this.f288144d, (C66212f) null, (C53934p0) null, new C98306b(username, result, (C15601d<? super C98306b>) null), 3, (Object) null);
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        FlutterDataSourcesPlugin.TextStatusDataSource.setup(flutterPluginBinding.getBinaryMessenger(), this);
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        C53930o0.m60558e(this.f288144d, (CancellationException) null, 1, (Object) null);
    }
}
