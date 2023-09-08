package p1048uk;

import android.graphics.RectF;
import android.text.Spannable;
import android.view.View;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.smiley.C72953u;
import com.tencent.p014mm.storage.C72963f4;
import gy3.C87412m;
import java.util.List;
import yr3.C79150a;

/* renamed from: uk.a */
public interface C90685a {

    /* renamed from: a */
    public static final /* synthetic */ int f260501a = 0;

    /* renamed from: uk.a$a */
    public static final class C90686a {

        /* renamed from: a */
        public static final /* synthetic */ C90686a f260502a = new C90686a();

        /* renamed from: a */
        public final RectF mo124822a(MMNeat7extView mMNeat7extView) {
            C87412m.m108594g(mMNeat7extView, "textView");
            C79150a layout = mMNeat7extView.getLayout();
            CharSequence a = mMNeat7extView.mo154968a();
            C72953u uVar = null;
            Spannable spannable = a instanceof Spannable ? (Spannable) a : null;
            if (!(layout == null || spannable == null)) {
                int i = 0;
                Object[] spans = spannable.getSpans(0, spannable.length(), C72953u.class);
                C87412m.m108593f(spans, "ss.getSpans(0, ss.length, EmojiSpan::class.java)");
                C72953u[] uVarArr = (C72953u[]) spans;
                int length = uVarArr.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    C72953u uVar2 = uVarArr[i];
                    if (uVar2.f212635e) {
                        uVar = uVar2;
                        break;
                    }
                    i++;
                }
                if (uVar != null) {
                    return uVar.f212638h;
                }
            }
            return new RectF();
        }
    }

    /* renamed from: v */
    View mo124818v(long j);

    /* renamed from: w */
    RectF mo124819w(long j, String str);

    /* renamed from: x */
    MMNeat7extView mo124820x(View view, String str);

    /* renamed from: y */
    List<String> mo124821y(C72963f4 f4Var);
}
