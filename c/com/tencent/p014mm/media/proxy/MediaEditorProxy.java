package com.tencent.p014mm.media.proxy;

import com.tencent.p014mm.remoteservice.C96897a;
import com.tencent.p014mm.remoteservice.C96905d;
import ef3.C86514b;
import f40.C86709a0;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0007¨\u0006\t"}, mo182094d2 = {"Lcom/tencent/mm/media/proxy/MediaEditorProxy;", "Lcom/tencent/mm/remoteservice/a;", "", "getAccPath", "getAccPathRemote", "Lcom/tencent/mm/remoteservice/d;", "serverProxy", "<init>", "(Lcom/tencent/mm/remoteservice/d;)V", "plugin-mediaeditor_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.media.proxy.MediaEditorProxy */
public final class MediaEditorProxy extends C96897a {
    public MediaEditorProxy(C96905d dVar) {
        super(dVar);
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        return "MicroMsg.StoryCaptureProxy";
    }

    public static final void createInstance(C96905d dVar) {
        new MediaEditorProxy(dVar);
    }

    public final String getAccPath() {
        String str = C86709a0.m107535s().f251806d;
        C87412m.m108593f(str, "storage().accPath");
        return str;
    }

    @C86514b
    public final String getAccPathRemote() {
        String str = C86709a0.m107535s().f251806d;
        C87412m.m108593f(str, "storage().accPath");
        return str;
    }
}
