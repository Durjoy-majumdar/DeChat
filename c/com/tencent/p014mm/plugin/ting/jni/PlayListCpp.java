package com.tencent.p014mm.plugin.ting.jni;

import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H J\t\u0010\t\u001a\u00020\bH J\u0011\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\bH J\u0011\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH J\u0011\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H J\u0011\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H ¨\u0006\u0017"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ting/jni/PlayListCpp;", "Lcom/tencent/mm/plugin/ting/jni/BaseObject;", "Lcom/tencent/mm/plugin/ting/jni/PlayList;", "Lcom/tencent/mm/plugin/ting/jni/PlayTaskService;", "service", "Lrx3/b0;", "setPlayTaskService", "getPlayTaskService", "", "getPlaylistCount", "index", "", "getPlayListItem", "", "clientId", "", "moveToFirst", "Lcom/tencent/mm/plugin/ting/jni/PlayListListener;", "listener", "addPlayListListener", "removePlayListListener", "<init>", "()V", "aff-module_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.ting.jni.PlayListCpp */
public final class PlayListCpp extends BaseObject implements PlayList {
    public native void addPlayListListener(PlayListListener playListListener);

    public native byte[] getPlayListItem(int i);

    public native PlayTaskService getPlayTaskService();

    public native int getPlaylistCount();

    public native boolean moveToFirst(String str);

    public native void removePlayListListener(PlayListListener playListListener);

    public native void setPlayTaskService(PlayTaskService playTaskService);
}
