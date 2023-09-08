package ht1;

import android.content.Context;
import android.content.Intent;
import bl3.C0316c;
import df1.C7322a;
import ef1.C58553c;
import java.util.List;
import te3.C48978cb0;
import te3.C49712hj1;

/* renamed from: ht1.g4 */
public interface C60172g4 extends C0316c {

    /* renamed from: ht1.g4$a */
    public static final class C60173a {
        /* renamed from: a */
        public static /* synthetic */ C58553c m70189a(C60172g4 g4Var, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    i = -1;
                }
                return g4Var.mo12867y3(i);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFeedEventDispatcher");
        }

        /* renamed from: b */
        public static /* synthetic */ C7322a m70190b(C60172g4 g4Var, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    i = -1;
                }
                return g4Var.mo12835A3(i);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFeedEventSubscriber");
        }
    }

    /* renamed from: A3 */
    C7322a mo12835A3(int i);

    /* renamed from: B3 */
    void mo12836B3(String str);

    /* renamed from: C3 */
    void mo12837C3(String str, String str2);

    /* renamed from: D3 */
    List<C48978cb0> mo12838D3();

    /* renamed from: E3 */
    String mo12839E3();

    /* renamed from: p3 */
    void mo12860p3(Context context, Intent intent, long j, String str, int i, int i2, boolean z);

    /* renamed from: q3 */
    C49712hj1 mo12861q3();

    /* renamed from: r3 */
    void mo12862r3(String str);

    /* renamed from: s3 */
    void mo12863s3(String str);

    /* renamed from: t3 */
    int mo12864t3();

    /* renamed from: u3 */
    void mo12865u3(String str);

    /* renamed from: v3 */
    String mo12866v3();

    /* renamed from: y3 */
    C58553c mo12867y3(int i);

    /* renamed from: z3 */
    String mo12868z3();
}
