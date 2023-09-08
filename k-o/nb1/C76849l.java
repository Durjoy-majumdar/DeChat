package nb1;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.plugin.facedetectaction.p046ui.FaceAgreementUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import de3.C75359b0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: nb1.l */
public class C76849l implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ Spannable f224670d;

    /* renamed from: e */
    public final /* synthetic */ TextView f224671e;

    public C76849l(FaceAgreementUI faceAgreementUI, Spannable spannable, TextView textView) {
        this.f224670d = spannable;
        this.f224671e = textView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/facedetectaction/ui/FaceAgreementUI$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        TextView textView = (TextView) view;
        boolean z = false;
        if (action == 1 || action == 3) {
            Spannable spannable = this.f224670d;
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(0, spannable.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                for (ClickableSpan clickableSpan : clickableSpanArr) {
                    if (clickableSpan instanceof C75359b0) {
                        ((C75359b0) clickableSpan).setIsPressed(false);
                        this.f224671e.invalidate();
                    }
                }
            }
        }
        if (action == 1 || action == 0) {
            int x = ((int) motionEvent.getX()) - textView.getPaddingLeft();
            int y = ((int) motionEvent.getY()) - textView.getPaddingTop();
            int scrollX = x + textView.getScrollX();
            int scrollY = y + textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), (float) scrollX);
            ClickableSpan[] clickableSpanArr2 = (ClickableSpan[]) this.f224670d.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr2.length != 0) {
                ClickableSpan clickableSpan2 = clickableSpanArr2[0];
                if (action == 1) {
                    clickableSpan2.onClick(textView);
                } else {
                    if (clickableSpan2 instanceof C75359b0) {
                        ((C75359b0) clickableSpan2).setIsPressed(true);
                        this.f224671e.invalidate();
                    }
                    Spannable spannable2 = this.f224670d;
                    Selection.setSelection(spannable2, spannable2.getSpanStart(clickableSpan2), this.f224670d.getSpanEnd(clickableSpan2));
                }
                z = true;
            } else {
                Selection.removeSelection(this.f224670d);
            }
        }
        Log.m105924i("MicroMsg.FaceAgreementUI", "touch ${event.x}, ${event.y}, ret:${ret}");
        C117292a.m165362h(z, this, "com/tencent/mm/plugin/facedetectaction/ui/FaceAgreementUI$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z;
    }
}
