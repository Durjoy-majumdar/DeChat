package com.tencent.p014mm.plugin.ting.jni;

import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ting/jni/PlayTaskController;", "", "Lcom/tencent/mm/plugin/ting/jni/PlayTask;", "playingTask", "", "id", "createTask", "Lcom/tencent/mm/plugin/ting/jni/PlayTaskControllerListener;", "listener", "Lrx3/b0;", "addPlayTaskControllerListener", "removePlayTaskControllerListener", "Companion", "aff-module_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.ting.jni.PlayTaskController */
public interface PlayTaskController {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H ¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ting/jni/PlayTaskController$Companion;", "", "Lcom/tencent/mm/plugin/ting/jni/PlayTaskController;", "controller", "Lrx3/b0;", "initNativePointer", "<init>", "()V", "aff-module_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.ting.jni.PlayTaskController$Companion */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final native void initNativePointer(PlayTaskController playTaskController);
    }

    void addPlayTaskControllerListener(PlayTaskControllerListener playTaskControllerListener);

    PlayTask createTask(String str);

    PlayTask playingTask();

    void removePlayTaskControllerListener(PlayTaskControllerListener playTaskControllerListener);
}
