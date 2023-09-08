package h10;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.pigeon.FlutterDataSourcesPlugin;
import fy3.C32227p;
import g10.C59341d;
import g10.C59344e;
import gy3.C87412m;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import l10.C61185d;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: h10.a */
public final class C98298a extends FlutterDataSourcesPlugin.FinderDataSource implements FlutterPlugin {

    /* renamed from: d */
    public final C0000n0 f288131d = C53930o0.m60555b();

    @C91590f(mo125468c = "com.tencent.mm.flutter.plugin.data_sources.plugins.FlutterPluginFinderDataSource$getImageFile$1", mo125469f = "FlutterPluginFinderDataSource.kt", mo125470l = {54}, mo125471m = "invokeSuspend")
    /* renamed from: h10.a$a */
    public static final class C98299a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f288132d;

        /* renamed from: e */
        public final /* synthetic */ FlutterDataSourcesPlugin.GetFinderImageFileRequest f288133e;

        /* renamed from: f */
        public final /* synthetic */ FlutterDataSourcesPlugin.Result<FlutterDataSourcesPlugin.GetFinderImageFileResponse> f288134f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98299a(FlutterDataSourcesPlugin.GetFinderImageFileRequest getFinderImageFileRequest, FlutterDataSourcesPlugin.Result<FlutterDataSourcesPlugin.GetFinderImageFileResponse> result, C15601d<? super C98299a> dVar) {
            super(2, dVar);
            this.f288133e = getFinderImageFileRequest;
            this.f288134f = result;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C98299a(this.f288133e, this.f288134f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C98299a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f288132d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String username = this.f288133e.getUsername();
                C87412m.m108593f(username, "request.username");
                String url = this.f288133e.getUrl();
                C87412m.m108593f(url, "request.url");
                String urlToken = this.f288133e.getUrlToken();
                C87412m.m108593f(urlToken, "request.urlToken");
                String decodeKey = this.f288133e.getDecodeKey();
                C87412m.m108593f(decodeKey, "request.decodeKey");
                this.f288132d = 1;
                obj = C53895h.m60469g(C53872d1.f151119c, new C59341d(username, url, urlToken, decodeKey, (C15601d<? super C59341d>) null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Exception e) {
                    this.f288134f.error(e);
                    return C13598b0.f38549a;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = (String) obj;
            FlutterDataSourcesPlugin.Result<FlutterDataSourcesPlugin.GetFinderImageFileResponse> result = this.f288134f;
            FlutterDataSourcesPlugin.GetFinderImageFileResponse getFinderImageFileResponse = new FlutterDataSourcesPlugin.GetFinderImageFileResponse();
            getFinderImageFileResponse.setPath(str);
            result.success(getFinderImageFileResponse);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.flutter.plugin.data_sources.plugins.FlutterPluginFinderDataSource$getLatestFinders$1", mo125469f = "FlutterPluginFinderDataSource.kt", mo125470l = {36}, mo125471m = "invokeSuspend")
    /* renamed from: h10.a$b */
    public static final class C98300b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f288135d;

        /* renamed from: e */
        public final /* synthetic */ String f288136e;

        /* renamed from: f */
        public final /* synthetic */ Long f288137f;

        /* renamed from: g */
        public final /* synthetic */ FlutterDataSourcesPlugin.Result<FlutterDataSourcesPlugin.ProtoBuffer> f288138g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98300b(String str, Long l, FlutterDataSourcesPlugin.Result<FlutterDataSourcesPlugin.ProtoBuffer> result, C15601d<? super C98300b> dVar) {
            super(2, dVar);
            this.f288136e = str;
            this.f288137f = l;
            this.f288138g = result;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C98300b(this.f288136e, this.f288137f, this.f288138g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C98300b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f288135d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C59344e eVar = new C59344e();
                String str = this.f288136e;
                C87412m.m108593f(str, "username");
                Long l = this.f288137f;
                C87412m.m108593f(l, "timeLimit");
                long longValue = l.longValue();
                this.f288135d = 1;
                obj = eVar.mo84455a(str, longValue, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Exception e) {
                    this.f288138g.error(e);
                    return C13598b0.f38549a;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C61185d dVar = (C61185d) obj;
            FlutterDataSourcesPlugin.ProtoBuffer protoBuffer = new FlutterDataSourcesPlugin.ProtoBuffer();
            protoBuffer.setBuffer(dVar.toByteArray());
            this.f288138g.success(protoBuffer);
            return C13598b0.f38549a;
        }
    }

    public void getImageFile(FlutterDataSourcesPlugin.GetFinderImageFileRequest getFinderImageFileRequest, FlutterDataSourcesPlugin.Result<FlutterDataSourcesPlugin.GetFinderImageFileResponse> result) {
        C87412m.m108594g(getFinderImageFileRequest, "request");
        C87412m.m108594g(result, "result");
        C53895h.m60466d(this.f288131d, (C66212f) null, (C53934p0) null, new C98299a(getFinderImageFileRequest, result, (C15601d<? super C98299a>) null), 3, (Object) null);
    }

    public void getLatestFinders(FlutterDataSourcesPlugin.GetFindersRequest getFindersRequest, FlutterDataSourcesPlugin.Result<FlutterDataSourcesPlugin.ProtoBuffer> result) {
        C87412m.m108594g(getFindersRequest, "request");
        C87412m.m108594g(result, "result");
        String username = getFindersRequest.getUsername();
        Long timeLimit = getFindersRequest.getTimeLimit();
        Log.m105924i("MicroMsg.FlutterPluginFinderDataSource", "getLatestFinders(" + username + ", " + timeLimit + ')');
        C53895h.m60466d(this.f288131d, (C66212f) null, (C53934p0) null, new C98300b(username, timeLimit, result, (C15601d<? super C98300b>) null), 3, (Object) null);
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        Log.m105924i("MicroMsg.FlutterPluginFinderDataSource", "onAttachedToEngine");
        FlutterDataSourcesPlugin.FinderDataSource.setup(flutterPluginBinding.getBinaryMessenger(), this);
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        Log.m105924i("MicroMsg.FlutterPluginFinderDataSource", "onDetachedFromEngine");
        C53930o0.m60558e(this.f288131d, (CancellationException) null, 1, (Object) null);
    }
}
