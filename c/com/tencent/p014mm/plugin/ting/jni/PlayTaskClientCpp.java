package com.tencent.p014mm.plugin.ting.jni;

import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H ¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\t\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H ¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH ¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ting/jni/PlayTaskClientCpp;", "Lcom/tencent/mm/plugin/ting/jni/BaseObject;", "Lcom/tencent/mm/plugin/ting/jni/PlayTaskClient;", "", "", "items", "Lrx3/b0;", "onLoad", "([Ljava/lang/String;)V", "onLoadMore", "", "index", "", "item", "onUpdate", "<init>", "()V", "aff-module_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.ting.jni.PlayTaskClientCpp */
public final class PlayTaskClientCpp extends BaseObject implements PlayTaskClient {
    public native void onLoad(String[] strArr);

    public native void onLoadMore(String[] strArr);

    public native void onUpdate(int i, byte[] bArr);
}
