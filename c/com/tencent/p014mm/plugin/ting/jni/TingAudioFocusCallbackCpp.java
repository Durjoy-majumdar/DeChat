package com.tencent.p014mm.plugin.ting.jni;

import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H ¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ting/jni/TingAudioFocusCallbackCpp;", "Lcom/tencent/mm/plugin/ting/jni/BaseObject;", "Lcom/tencent/mm/plugin/ting/jni/AudioFocusCallback;", "", "ret", "", "context", "Lrx3/b0;", "onFocusResponse", "<init>", "()V", "aff-module_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.ting.jni.TingAudioFocusCallbackCpp */
public final class TingAudioFocusCallbackCpp extends BaseObject implements AudioFocusCallback {
    public native void onFocusResponse(int i, byte[] bArr);
}
