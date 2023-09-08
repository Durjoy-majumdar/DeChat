package com.tencent.p014mm.plugin.ting.jni;

import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH&J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ting/jni/PlayList;", "", "Lcom/tencent/mm/plugin/ting/jni/PlayTaskService;", "service", "Lrx3/b0;", "setPlayTaskService", "getPlayTaskService", "", "getPlaylistCount", "index", "", "getPlayListItem", "", "clientId", "", "moveToFirst", "Lcom/tencent/mm/plugin/ting/jni/PlayListListener;", "listener", "addPlayListListener", "removePlayListListener", "aff-module_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.ting.jni.PlayList */
public interface PlayList {
    void addPlayListListener(PlayListListener playListListener);

    byte[] getPlayListItem(int i);

    PlayTaskService getPlayTaskService();

    int getPlaylistCount();

    boolean moveToFirst(String str);

    void removePlayListListener(PlayListListener playListListener);

    void setPlayTaskService(PlayTaskService playTaskService);
}
