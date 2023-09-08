package yh2;

import android.graphics.Canvas;
import android.graphics.Paint;
import bi2.C92262a;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import gy3.C87412m;
import java.util.List;

/* renamed from: yh2.i */
public final class C102867i {

    /* renamed from: a */
    public final List<C92262a> f303653a;

    /* renamed from: b */
    public long f303654b;

    public C102867i(List<C92262a> list) {
        C87412m.m108594g(list, "editorItems");
        this.f303653a = list;
    }

    /* renamed from: a */
    public final long mo142583a(Canvas canvas, Paint paint) {
        C87412m.m108594g(canvas, "canvas");
        C87412m.m108594g(paint, "paint");
        if (this.f303653a.size() <= 0) {
            return 0;
        }
        long j = MAlarmHandler.NEXT_FIRE_INTERVAL;
        for (C92262a next : this.f303653a) {
            long a = next.mo126255a(this.f303654b);
            next.mo126257c(canvas, paint);
            if (a < j) {
                j = a;
            }
        }
        this.f303654b = j;
        return j;
    }
}
