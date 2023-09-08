package x82;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C8480h;
import h90.C98324b;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: x82.e */
public final class C112090e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ C112092f f335587d;

    public C112090e(C112092f fVar) {
        this.f335587d = fVar;
    }

    public void onGlobalLayout() {
        FrameLayout frameLayout;
        C98324b bVar = r1;
        C98324b bVar2 = new C98324b((String) null, (String) null, false, 0, 0, (String) null, (String) null, 0, 0, (String) null, (ArrayList) null, (ArrayList) null, false, (Bundle) null, (Rect) null, 0, 65535, (C8480h) null);
        if (this.f335587d.getMCurrentPageWidth() == 0) {
            FrameLayout mEditLayout = this.f335587d.getMEditLayout();
            if ((mEditLayout != null && this.f335587d.getMCurrentPageWidth() == mEditLayout.getMeasuredWidth()) && this.f335587d.getMCurrentPageHeight() == 0) {
                FrameLayout mEditLayout2 = this.f335587d.getMEditLayout();
                if (mEditLayout2 != null && this.f335587d.getMCurrentPageHeight() == mEditLayout2.getMeasuredHeight()) {
                    return;
                }
            }
        }
        ViewTreeObserver viewTreeObserver = this.f335587d.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        C112092f fVar = this.f335587d;
        FrameLayout mEditLayout3 = fVar.getMEditLayout();
        fVar.setMCurrentPageWidth(mEditLayout3 != null ? mEditLayout3.getMeasuredWidth() : 0);
        C112092f fVar2 = this.f335587d;
        FrameLayout mEditLayout4 = fVar2.getMEditLayout();
        fVar2.setMCurrentPageHeight(mEditLayout4 != null ? mEditLayout4.getMeasuredHeight() : 0);
        FrameLayout mEditLayout5 = this.f335587d.getMEditLayout();
        int measuredWidth = mEditLayout5 != null ? mEditLayout5.getMeasuredWidth() : 0;
        FrameLayout mEditLayout6 = this.f335587d.getMEditLayout();
        Rect rect = new Rect(0, 0, measuredWidth, mEditLayout6 != null ? mEditLayout6.getMeasuredHeight() : 0);
        C98324b bVar3 = bVar;
        bVar3.f288194o = rect;
        bVar3.f288195p = this.f335587d.getResources().getColor(C0966R.color.f2953a_);
        C112079b multiTalkStrokeContext = this.f335587d.getMultiTalkStrokeContext();
        if (multiTalkStrokeContext != null) {
            multiTalkStrokeContext.mo163777b(bVar3, (C32224a<C13598b0>) null);
        }
        C112079b multiTalkStrokeContext2 = this.f335587d.getMultiTalkStrokeContext();
        if (!(multiTalkStrokeContext2 == null || (frameLayout = multiTalkStrokeContext2.f335534d) == null)) {
            frameLayout.setVisibility(0);
        }
        C112079b multiTalkStrokeContext3 = this.f335587d.getMultiTalkStrokeContext();
        if (multiTalkStrokeContext3 != null) {
            multiTalkStrokeContext3.f335536f = this.f335587d.getMCurrentPageHeight();
        }
        C112079b multiTalkStrokeContext4 = this.f335587d.getMultiTalkStrokeContext();
        if (multiTalkStrokeContext4 != null) {
            multiTalkStrokeContext4.f335535e = this.f335587d.getMCurrentPageWidth();
        }
        C112079b multiTalkStrokeContext5 = this.f335587d.getMultiTalkStrokeContext();
        if (multiTalkStrokeContext5 != null) {
            multiTalkStrokeContext5.mo163778c(1.0f, 0, 0, false, false);
        }
        this.f335587d.mo163882r(true);
    }
}
