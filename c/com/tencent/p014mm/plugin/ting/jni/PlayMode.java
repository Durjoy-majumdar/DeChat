package com.tencent.p014mm.plugin.ting.jni;

import gy3.C8480h;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ting/jni/PlayMode;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "List", "ListRepeat", "SingleRepeat", "Random", "Companion", "aff-module_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.ting.jni.PlayMode */
public enum PlayMode {
    List(0),
    ListRepeat(1),
    SingleRepeat(2),
    Random(3);
    
    public static final Companion Companion = null;
    private final int value;

    @Metadata(mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ting/jni/PlayMode$Companion;", "", "()V", "fromValue", "Lcom/tencent/mm/plugin/ting/jni/PlayMode;", "value", "", "aff-module_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.ting.jni.PlayMode$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }

        public final PlayMode fromValue(int i) {
            for (PlayMode playMode : PlayMode.values()) {
                if (playMode.getValue() == i) {
                    return playMode;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((C8480h) null);
    }

    private PlayMode(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
