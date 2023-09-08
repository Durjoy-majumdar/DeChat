package w50;

import fy3.C32224a;
import gy3.C87413o;
import java.util.HashMap;
import rx3.C13598b0;

/* renamed from: w50.e */
public final class C65931e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public static final C65931e f189542d = new C65931e();

    public C65931e() {
        super(0);
    }

    public Object invoke() {
        String str;
        for (int i = 0; i < 10; i++) {
            Integer valueOf = Integer.valueOf(i);
            HashMap<Integer, String> hashMap = C65929d.f189537c;
            switch (i) {
                case 0:
                    str = C65929d.f189536b + "/ziran";
                    break;
                case 1:
                    str = C65929d.f189536b + "/baixi";
                    break;
                case 2:
                    str = C65929d.f189536b + "/yuanqi";
                    break;
                case 3:
                    str = C65929d.f189536b + "/fennen";
                    break;
                case 4:
                    str = C65929d.f189536b + "/qingche";
                    break;
                case 5:
                    str = C65929d.f189536b + "/luori";
                    break;
                case 6:
                    str = C65929d.f189536b + "/shensui";
                    break;
                case 7:
                    str = C65929d.f189536b + "/qiuri";
                    break;
                case 8:
                    str = C65929d.f189536b + "/meishi";
                    break;
                case 9:
                    str = C65929d.f189536b + "/fanchaleng";
                    break;
                default:
                    str = "";
                    break;
            }
            hashMap.put(valueOf, str);
        }
        return C13598b0.f38549a;
    }
}
