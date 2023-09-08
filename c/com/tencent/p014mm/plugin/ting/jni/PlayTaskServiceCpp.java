package com.tencent.p014mm.plugin.ting.jni;

import gy3.C8480h;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0018B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H J\u0011\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H J\t\u0010\t\u001a\u00020\bH J\t\u0010\u0004\u001a\u00020\u0003H J\u0011\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH J\u0011\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH J\t\u0010\u000e\u001a\u00020\u0005H J\u0011\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0003H J\t\u0010\u0011\u001a\u00020\u0003H J\u0011\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0003H J\t\u0010\u0015\u001a\u00020\u0013H ¨\u0006\u0019"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ting/jni/PlayTaskServiceCpp;", "Lcom/tencent/mm/plugin/ting/jni/BaseObject;", "Lcom/tencent/mm/plugin/ting/jni/PlayTaskService;", "", "count", "Lrx3/b0;", "load", "loadMore", "", "hasMore", "Lcom/tencent/mm/plugin/ting/jni/PlayTaskClient;", "listener", "addPlayTaskClient", "removePlayTaskClient", "clearPlayTaskClient", "scene", "setScene", "getScene", "index", "", "getItemInfo", "toTapeItem", "<init>", "()V", "Companion", "aff-module_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.ting.jni.PlayTaskServiceCpp */
public final class PlayTaskServiceCpp extends BaseObject implements PlayTaskService {
    public static final Companion Companion = new Companion((C8480h) null);

    @Metadata(mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH J:\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\bH ¢\u0006\u0002\u0010\u0012J\u001c\u0010\u0013\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH ¢\u0006\u0002\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH ¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ting/jni/PlayTaskServiceCpp$Companion;", "", "()V", "createWithCategory", "Lcom/tencent/mm/plugin/ting/jni/PlayTaskServiceCpp;", "categoryId", "", "categoryItem", "", "tingItem", "tingItemIndex", "", "createWithCategoryAndInitialItem", "presetItemList", "", "mergeWithBaseListenId", "", "sessionBuffer", "([B[[BZ[B)Lcom/tencent/mm/plugin/ting/jni/PlayTaskServiceCpp;", "createWithListenIdList", "listenIdList", "([Ljava/lang/String;)Lcom/tencent/mm/plugin/ting/jni/PlayTaskServiceCpp;", "createWithTingItems", "item", "([[B)Lcom/tencent/mm/plugin/ting/jni/PlayTaskServiceCpp;", "aff-module_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.ting.jni.PlayTaskServiceCpp$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }

        public static /* synthetic */ PlayTaskServiceCpp createWithCategoryAndInitialItem$default(Companion companion, byte[] bArr, byte[][] bArr2, boolean z, byte[] bArr3, int i, Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            if ((i & 8) != 0) {
                bArr3 = null;
            }
            return companion.createWithCategoryAndInitialItem(bArr, bArr2, z, bArr3);
        }

        public final native PlayTaskServiceCpp createWithCategory(String str, byte[] bArr, byte[] bArr2, int i);

        public final native PlayTaskServiceCpp createWithCategoryAndInitialItem(byte[] bArr, byte[][] bArr2, boolean z, byte[] bArr3);

        public final native PlayTaskServiceCpp createWithListenIdList(String[] strArr);

        public final native PlayTaskServiceCpp createWithTingItems(byte[][] bArr);
    }

    public native void addPlayTaskClient(PlayTaskClient playTaskClient);

    public native void clearPlayTaskClient();

    public native int count();

    public native byte[] getItemInfo(int i);

    public native int getScene();

    public native boolean hasMore();

    public native void load(int i);

    public native void loadMore(int i);

    public native void removePlayTaskClient(PlayTaskClient playTaskClient);

    public native void setScene(int i);

    public native byte[] toTapeItem();
}
