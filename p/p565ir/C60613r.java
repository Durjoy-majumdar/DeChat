package p565ir;

import android.app.Activity;
import android.content.Context;
import di0.C86299o;
import di3.C7335d;
import fy3.C32226l;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C49037cq0;
import te3.C49255ea1;
import te3.C49805i60;
import te3.C50858pp0;
import te3.C64281ca1;
import te3.C64287ci1;
import te3.C64370fp1;
import te3.C64834xn2;
import wx3.C15601d;

/* renamed from: ir.r */
public interface C60613r extends C7335d {

    /* renamed from: ir.r$a */
    public static final class C60614a {
        /* renamed from: a */
        public static /* synthetic */ String m70875a(C60613r rVar, C64287ci1 ci12, String str, String str2, Integer num, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = null;
                }
                if ((i & 4) != 0) {
                    str2 = null;
                }
                if ((i & 8) != 0) {
                    num = null;
                }
                return rVar.ti0(ci12, str, str2, num);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gen23782Params");
        }
    }

    /* renamed from: Bs */
    boolean mo84971Bs(long j, int i);

    void Ih0(Context context, C64287ci1 ci12, C32226l<? super C50858pp0, C13598b0> lVar);

    Object N10(String str, int i, String str2, long j, C15601d<? super String> dVar);

    /* renamed from: O8 */
    C64287ci1 mo84974O8();

    void Se0(Context context, C64287ci1 ci12, C32226l<? super C50858pp0, C13598b0> lVar);

    /* renamed from: Te */
    void mo84976Te(String str, String str2, C86299o oVar);

    void Vb0(C64287ci1 ci12, String str, String str2);

    String Yh0(C64287ci1 ci12);

    C64834xn2 ek0(C64370fp1 fp12);

    /* renamed from: iW */
    C64287ci1 mo84980iW(String str);

    boolean ot0(int i);

    /* renamed from: tT */
    C89132b<C49255ea1> mo84982tT(String str, int i, C49037cq0 cq02, C64281ca1 ca12);

    String ti0(C64287ci1 ci12, String str, String str2, Integer num);

    void zq0(Activity activity, String str, C32226l<? super C49805i60, C13598b0> lVar);
}
