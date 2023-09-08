package q14;

import com.tencent.youtu.sdkkitframework.common.StateEvent;
import gy3.C87412m;

/* renamed from: q14.d */
public final class C89446d extends C89448h {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89446d(int i, String str) {
        super("Unexpected JSON token at offset " + i + ": " + str);
        C87412m.m108594g(str, StateEvent.Name.MESSAGE);
    }
}
