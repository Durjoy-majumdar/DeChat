package com.tencent.p014mm.plugin.ting.jni;

import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0007H&J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H&J\b\u0010\u000b\u001a\u00020\u0002H&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&J\b\u0010\u000f\u001a\u00020\rH&J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&J\b\u0010\u0014\u001a\u00020\u0004H&¨\u0006\u0015"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ting/jni/PlayTaskService;", "", "", "count", "Lrx3/b0;", "load", "loadMore", "", "hasMore", "scene", "setScene", "getScene", "index", "", "getItemInfo", "toTapeItem", "Lcom/tencent/mm/plugin/ting/jni/PlayTaskClient;", "listener", "addPlayTaskClient", "removePlayTaskClient", "clearPlayTaskClient", "aff-module_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.ting.jni.PlayTaskService */
public interface PlayTaskService {

    @Metadata(mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.ting.jni.PlayTaskService$DefaultImpls */
    public static final class DefaultImpls {
        public static /* synthetic */ void load$default(PlayTaskService playTaskService, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    i = 10;
                }
                playTaskService.load(i);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load");
        }

        public static /* synthetic */ void loadMore$default(PlayTaskService playTaskService, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    i = 10;
                }
                playTaskService.loadMore(i);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadMore");
        }
    }

    void addPlayTaskClient(PlayTaskClient playTaskClient);

    void clearPlayTaskClient();

    int count();

    byte[] getItemInfo(int i);

    int getScene();

    boolean hasMore();

    void load(int i);

    void loadMore(int i);

    void removePlayTaskClient(PlayTaskClient playTaskClient);

    void setScene(int i);

    byte[] toTapeItem();
}
