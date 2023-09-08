package pm1;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C36570n;

/* renamed from: pm1.o */
public final class C62398o extends C87413o implements C32224a<Integer> {

    /* renamed from: d */
    public final /* synthetic */ C62399p f177351d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62398o(C62399p pVar) {
        super(0);
        this.f177351d = pVar;
    }

    public Object invoke() {
        int i;
        int i2;
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) ((C36570n) this.f177351d.f177362k).getValue();
        staggeredGridLayoutManager.mo17394A(iArr);
        staggeredGridLayoutManager.mo17395B(iArr2);
        C62399p pVar = this.f177351d;
        int i3 = -1;
        if (pVar.f177353b && pVar.f177361j != null && (i = iArr[0]) <= (i2 = iArr2[1])) {
            while (true) {
                View findViewByPosition = ((StaggeredGridLayoutManager) ((C36570n) pVar.f177362k).getValue()).findViewByPosition(i);
                if (findViewByPosition != null) {
                    Rect rect = new Rect();
                    findViewByPosition.getGlobalVisibleRect(rect);
                    MotionEvent motionEvent = pVar.f177361j;
                    C87412m.m108591d(motionEvent);
                    MotionEvent motionEvent2 = pVar.f177361j;
                    C87412m.m108591d(motionEvent2);
                    if (rect.contains((int) motionEvent.getRawX(), (int) motionEvent2.getRawY())) {
                        i3 = i;
                        break;
                    }
                }
                if (i == i2) {
                    break;
                }
                i++;
            }
        }
        return Integer.valueOf(i3);
    }
}
