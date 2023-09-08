package p233s3;

import android.os.Message;
import android.view.Choreographer;
import android.view.View;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import gy3.C87412m;
import java.util.List;

/* renamed from: s3.c */
public final class C101510c extends C101507b {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101510c(View view, Choreographer choreographer, List<C101525o> list) {
        super(view, choreographer, list);
        C87412m.m108594g(view, "decorView");
        C87412m.m108594g(choreographer, "choreographer");
        C87412m.m108594g(list, "delegates");
    }

    /* renamed from: a */
    public void mo140995a(Message message) {
        C87412m.m108594g(message, StateEvent.Name.MESSAGE);
        message.setAsynchronous(true);
    }
}
