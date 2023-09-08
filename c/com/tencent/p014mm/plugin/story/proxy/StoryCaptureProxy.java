package com.tencent.p014mm.plugin.story.proxy;

import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.remoteservice.C96897a;
import com.tencent.p014mm.remoteservice.C96905d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import ef3.C86513a;
import ef3.C86514b;
import f40.C86709a0;
import fy3.C32229r;
import gy3.C87412m;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Metadata;
import p682rz.C36594q;
import rx3.C13598b0;
import te3.C64758ut2;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0007J\u0019\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u0019\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J \u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016RD\u0010\u001e\u001a$\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f\u0018\u00010\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006#"}, mo182094d2 = {"Lcom/tencent/mm/plugin/story/proxy/StoryCaptureProxy;", "Lcom/tencent/mm/remoteservice/a;", "", "", "getAccPath", "getAccPathRemote", "Lcom/tencent/mm/modelcontrol/VideoTransPara;", "getVideoPara", "getVideoParaRemote", "Lcom/tencent/mm/storage/y1$a;", "key", "defva", "Lrx3/b0;", "set", "get", "methodName", "Landroid/os/Bundle;", "data", "", "clientCall", "onCallback", "Lkotlin/Function4;", "", "Lte3/ut2;", "f", "Lfy3/r;", "getMusicCallback", "()Lfy3/r;", "setMusicCallback", "(Lfy3/r;)V", "musicCallback", "Lcom/tencent/mm/remoteservice/d;", "serverProxy", "<init>", "(Lcom/tencent/mm/remoteservice/d;)V", "plugin-story_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.story.proxy.StoryCaptureProxy */
public final class StoryCaptureProxy extends C96897a {

    /* renamed from: g */
    public static StoryCaptureProxy f249114g;

    /* renamed from: f */
    public C32229r<? super Integer, ? super Integer, ? super String, ? super C64758ut2, C13598b0> f249115f;

    public StoryCaptureProxy(C96905d dVar) {
        super(dVar);
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        return "MicroMsg.StoryCaptureProxy";
    }

    public static final void createInstance(C96905d dVar) {
        f249114g = new StoryCaptureProxy(dVar);
    }

    public Object get(C72994y1.C72995a aVar, Object obj) {
        C87412m.m108594g(aVar, "key");
        C87412m.m108594g(obj, "defva");
        C72994y1.C72995a[] aVarArr = (C72994y1.C72995a[]) C72994y1.C72995a.class.getEnumConstants();
        C72994y1.C72995a aVar2 = aVarArr != null ? aVarArr[aVar.ordinal()] : null;
        Log.m105925i("MicroMsg.StoryCaptureProxy", "getConfigStorage, %s %s", aVar2, obj);
        Object f = C86709a0.m107535s().mo121142i().mo119685f(aVar2, obj);
        C87412m.m108593f(f, "storage().configStg.get(index, defva)");
        return f;
    }

    public String getAccPath() {
        return REMOTE_CALL("getAccPathRemote", new Object[0]).toString();
    }

    @C86514b
    public final String getAccPathRemote() {
        String str = C86709a0.m107535s().f251806d;
        C87412m.m108593f(str, "storage().accPath");
        return str;
    }

    public final C32229r<Integer, Integer, String, C64758ut2, C13598b0> getMusicCallback() {
        return this.f249115f;
    }

    public VideoTransPara getVideoPara() {
        VideoTransPara videoTransPara = (VideoTransPara) REMOTE_CALL("getVideoParaRemote", new Object[0]);
        C87412m.m108591d(videoTransPara);
        return videoTransPara;
    }

    @C86514b
    public final VideoTransPara getVideoParaRemote() {
        VideoTransPara ai02 = ((C36594q) C86312j.m106911c(C36594q.class)).ai0();
        C87412m.m108593f(ai02, "para");
        return ai02;
    }

    public void onCallback(String str, Bundle bundle, boolean z) {
        C87412m.m108594g(str, "methodName");
        C87412m.m108594g(bundle, "data");
        Log.m105925i("MicroMsg.StoryCaptureProxy", "class:%s, method:%s, clientCall:%B", StoryCaptureProxy.class.getName(), str, Boolean.valueOf(z));
        Method method = null;
        try {
            Method[] methods = StoryCaptureProxy.class.getMethods();
            C87412m.m108593f(methods, "methods");
            int length = methods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Method method2 = methods[i];
                if (C112551y.m153809i(method2.getName(), str, true)) {
                    method = method2;
                    break;
                }
                i++;
            }
            if (method != null) {
                if (method.isAnnotationPresent(z ? C86513a.class : C86514b.class)) {
                    Object[] args = getArgs(bundle);
                    Object invoke = method.invoke(this, Arrays.copyOf(args, args.length));
                    if (C87412m.m108589b(method.getReturnType(), Void.TYPE)) {
                        return;
                    }
                    if (invoke instanceof Parcelable) {
                        bundle.putParcelable("result_key", (Parcelable) invoke);
                        return;
                    }
                    C87412m.m108592e(invoke, "null cannot be cast to non-null type java.io.Serializable");
                    bundle.putSerializable("result_key", (Serializable) invoke);
                }
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.StoryCaptureProxy", "exception:%s", Util.stackTraceToString(e));
        }
    }

    public void set(C72994y1.C72995a aVar, Object obj) {
        C87412m.m108594g(aVar, "key");
        C87412m.m108594g(obj, "defva");
        Log.m105925i("MicroMsg.StoryCaptureProxy", "get %s %s", aVar, obj);
        C72994y1.C72995a[] aVarArr = (C72994y1.C72995a[]) C72994y1.C72995a.class.getEnumConstants();
        C72994y1.C72995a aVar2 = aVarArr != null ? aVarArr[aVar.ordinal()] : null;
        Log.m105925i("MicroMsg.StoryCaptureProxy", "setConfigStorage, %s %s", aVar2, obj);
        C86709a0.m107535s().mo121142i().mo119677K(aVar2, obj);
    }

    public final void setMusicCallback(C32229r<? super Integer, ? super Integer, ? super String, ? super C64758ut2, C13598b0> rVar) {
        this.f249115f = rVar;
    }
}
