package p190l1;

import android.view.MotionEvent;
import gy3.C87412m;
import java.util.List;

/* renamed from: l1.l */
public final class C109106l {

    /* renamed from: a */
    public final List<C109111s> f326709a;

    /* renamed from: b */
    public final C109097g f326710b;

    /* renamed from: c */
    public int f326711c;

    public C109106l(List<C109111s> list, C109097g gVar) {
        C87412m.m108594g(list, "changes");
        this.f326709a = list;
        this.f326710b = gVar;
        MotionEvent motionEvent = null;
        MotionEvent motionEvent2 = gVar != null ? gVar.f326683b.f326733b : null;
        int i = 0;
        if (motionEvent2 != null) {
            motionEvent2.getButtonState();
        }
        MotionEvent motionEvent3 = gVar != null ? gVar.f326683b.f326733b : null;
        if (motionEvent3 != null) {
            motionEvent3.getMetaState();
        }
        motionEvent = gVar != null ? gVar.f326683b.f326733b : motionEvent;
        int i2 = 3;
        if (motionEvent == null) {
            int size = list.size();
            while (true) {
                if (i >= size) {
                    break;
                }
                C109111s sVar = list.get(i);
                if (C109107m.m148149b(sVar)) {
                    i2 = 2;
                    break;
                } else if (C109107m.m148148a(sVar)) {
                    i2 = 1;
                    break;
                } else {
                    i++;
                }
            }
        } else {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                i = 6;
                                break;
                            case 9:
                                i = 4;
                                break;
                            case 10:
                                i = 5;
                                break;
                        }
                    }
                    i = 3;
                    i2 = i;
                }
                i = 2;
                i2 = i;
            }
            i = 1;
            i2 = i;
        }
        this.f326711c = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C109106l(List<C109111s> list) {
        this(list, (C109097g) null);
        C87412m.m108594g(list, "changes");
    }
}
