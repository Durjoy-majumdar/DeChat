package com.tencent.p014mm.plugin.ting.jni;

import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H ¨\u0006\t"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ting/jni/PlayTaskControllerListenerCpp;", "Lcom/tencent/mm/plugin/ting/jni/BaseObject;", "Lcom/tencent/mm/plugin/ting/jni/PlayTaskControllerListener;", "Lcom/tencent/mm/plugin/ting/jni/PlayTask;", "task", "Lrx3/b0;", "onPlayingTaskChanged", "<init>", "()V", "aff-module_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.ting.jni.PlayTaskControllerListenerCpp */
public final class PlayTaskControllerListenerCpp extends BaseObject implements PlayTaskControllerListener {
    public native void onPlayingTaskChanged(PlayTask playTask);
}
