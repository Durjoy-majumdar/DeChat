package i81;

import android.util.Pair;
import android.view.MotionEvent;
import d91.C20449a;
import gy3.C87412m;
import j20.C21153d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import z04.C112551y;

/* renamed from: i81.a */
public final class C21058a {

    /* renamed from: a */
    public static final HashMap<String, Map<String, List<Pair<String, String>>>> f59577a = new HashMap<>();

    /* renamed from: b */
    public static final C21059a f59578b = new C21059a();

    /* renamed from: i81.a$a */
    public static final class C21059a implements C21153d {
        /* renamed from: a */
        public void mo32409a(String str, String str2, String str3, Object obj, Object obj2) {
        }

        /* renamed from: b */
        public void mo32410b(String str, String str2, String str3, Object obj, Object[] objArr) {
            if (str != null && C112551y.m153819s(str, "com/tencent/mm/ui/chatting/ChattingListEventListener$ChattingListTouchListener", false) && C87412m.m108589b(str2, "onTouch") && C87412m.m108589b(str3, "(Landroid/view/View;Landroid/view/MotionEvent;)Z") && objArr != null && objArr.length >= 2) {
                MotionEvent motionEvent = objArr[1];
                if (motionEvent instanceof MotionEvent) {
                    C87412m.m108592e(motionEvent, "null cannot be cast to non-null type android.view.MotionEvent");
                    if ((motionEvent.getAction() & 255) == 0) {
                        C20449a.f57477k = false;
                        ((ArrayList) C20449a.f57476j).clear();
                        C20449a.m22054f("temp_6");
                    }
                }
            }
        }
    }
}
