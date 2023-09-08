package com.tencent.p014mm.plugin.ting.jni;

import com.tencent.p014mm.plugin.ting.jni.AudioFocus;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ting/jni/AudioFocusCallback;", "", "", "ret", "", "context", "Lrx3/b0;", "onFocusResponse", "aff-module_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.ting.jni.AudioFocusCallback */
public interface AudioFocusCallback {
    void onFocusResponse(@AudioFocus.AudioFocusRequestResult int i, byte[] bArr);
}
