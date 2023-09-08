package p170ic;

import android.webkit.ConsoleMessage;
import com.tencent.stubs.logger.Log;
import gy3.C87412m;
import rx3.C13603j;

/* renamed from: ic.g */
public final class C46213g {

    /* renamed from: ic.g$a */
    public /* synthetic */ class C46214a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f124574a;

        static {
            int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
            iArr[ConsoleMessage.MessageLevel.TIP.ordinal()] = 1;
            iArr[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 2;
            iArr[ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
            iArr[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 4;
            iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 5;
            f124574a = iArr;
        }
    }

    /* renamed from: a */
    public static final void m51505a(ConsoleMessage consoleMessage, String str, boolean z) {
        C87412m.m108594g(str, "tag");
        ConsoleMessage.MessageLevel messageLevel = consoleMessage != null ? consoleMessage.messageLevel() : null;
        int i = messageLevel == null ? -1 : C46214a.f124574a[messageLevel.ordinal()];
        if (i != -1) {
            int i2 = 5;
            if (!(i == 1 || i == 2)) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            i2 = 6;
                        } else {
                            throw new C13603j();
                        }
                    }
                } else if (z) {
                    i2 = 4;
                }
                Log.println(i2, str, "ConsoleMessage: message:" + consoleMessage.message() + ", sourceId:" + consoleMessage.sourceId() + ", lineNumber:" + consoleMessage.lineNumber());
            }
            i2 = 3;
            Log.println(i2, str, "ConsoleMessage: message:" + consoleMessage.message() + ", sourceId:" + consoleMessage.sourceId() + ", lineNumber:" + consoleMessage.lineNumber());
        }
    }
}
