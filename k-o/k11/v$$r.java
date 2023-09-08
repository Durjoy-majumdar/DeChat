package k11;

import com.tencent.p014mm.p136ui.widget.picker.C19877i;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingUI;
import java.util.Calendar;

public final /* synthetic */ class v$$r implements C19877i.C19878a {

    /* renamed from: a */
    public final /* synthetic */ Calendar f29769a;

    /* renamed from: b */
    public final /* synthetic */ long[] f29770b;

    /* renamed from: c */
    public final /* synthetic */ int f29771c;

    /* renamed from: d */
    public final /* synthetic */ Runnable f29772d;

    public /* synthetic */ v$$r(Calendar calendar, long[] jArr, int i, Runnable runnable) {
        this.f29769a = calendar;
        this.f29770b = jArr;
        this.f29771c = i;
        this.f29772d = runnable;
    }

    public final void onResult(boolean z, int i, int i2, int i3) {
        Calendar calendar = this.f29769a;
        long[] jArr = this.f29770b;
        int i4 = this.f29771c;
        Runnable runnable = this.f29772d;
        long[] jArr2 = CleanChattingUI.f267888D;
        if (z) {
            calendar.set(i, i2 - 1, i3, 0, 0, 0);
            calendar.clear(14);
            long timeInMillis = calendar.getTimeInMillis();
            if (i4 != 0) {
                timeInMillis = Math.min(System.currentTimeMillis(), timeInMillis + 86399999);
            }
            jArr[i4] = timeInMillis;
            runnable.run();
        }
    }
}
