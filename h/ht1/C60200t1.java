package ht1;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import c30.C104289g;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import d03.C58010a;
import di3.C7335d;
import fe1.C32026j;
import fe1.C58969q;
import fy3.C32226l;
import ht1.C60216z4;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import jp3.C9486a;
import jp3.C9487b;
import ob0.C117747y;
import org.json.JSONObject;
import p749xh.C66261f3;
import p749xh.C66277w3;
import pe3.C47465a;
import pe3.C89349b;
import pl1.C11978e0;
import rx3.C13598b0;
import rx3.C13604l;
import rx3.C13605o;
import te3.C48727ak1;
import te3.C48978cb0;
import te3.C49712hj1;
import te3.C50676og0;
import te3.C51398th3;
import te3.C64284cg;
import te3.C64287ci1;
import te3.C64586nn1;
import te3.C64682rk1;
import te3.C64888zo1;
import te3.fp4;
import te3.m74;
import uz2.C65488a0;
import wd3.C65953v0;
import wx3.C15601d;
import zh3.C91753f;

/* renamed from: ht1.t1 */
public interface C60200t1 extends C7335d {

    /* renamed from: ht1.t1$a */
    public static final class C60201a {
        /* renamed from: a */
        public static /* synthetic */ C117747y m70363a(C60200t1 t1Var, String str, long j, C89349b bVar, int i, C49712hj1 hj12, int i2, long j2, boolean z, Integer num, Long l, int i3, Object obj) {
            int i4 = i3;
            if (obj == null) {
                return t1Var.mo76783Mt(str, (i4 & 2) != 0 ? 0 : j, (i4 & 4) != 0 ? null : bVar, (i4 & 8) != 0 ? 0 : i, hj12, (i4 & 32) != 0 ? 0 : i2, (i4 & 64) != 0 ? 0 : j2, (i4 & 128) != 0 ? false : z, (i4 & 256) != 0 ? 0 : num, (i4 & 512) != 0 ? 0L : l);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cgiNetSceneFinderUserPage");
        }

        /* renamed from: b */
        public static /* synthetic */ void m70364b(C60200t1 t1Var, Context context, String str, C60216z4.C8821a aVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    aVar = null;
                }
                t1Var.mo76898xr(context, str, aVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enterFinderUI");
        }

        /* renamed from: c */
        public static /* synthetic */ Object m70365c(C60200t1 t1Var, Context context, C51398th3 th32, long j, long j2, C89349b bVar, String str, C15601d dVar, int i, Object obj) {
            if (obj == null) {
                return t1Var.wn0(context, th32, (i & 4) != 0 ? 0 : j, (i & 8) != 0 ? 0 : j2, (i & 16) != 0 ? null : bVar, (i & 32) != 0 ? null : str, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: finderPayFullWholeProcess");
        }

        /* renamed from: d */
        public static /* synthetic */ void m70366d(C60200t1 t1Var, String str, ImageView imageView, String str2, C11978e0.C11979a aVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    aVar = C11978e0.C11979a.DARK_COMMON;
                }
                t1Var.X40(str, imageView, str2, aVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadBgBlurImageRadius100");
        }

        /* renamed from: e */
        public static /* synthetic */ void m70367e(C60200t1 t1Var, String str, ImageView imageView, C11978e0.C11979a aVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    aVar = C11978e0.C11979a.DARK_COMMON;
                }
                t1Var.mo76808S7(str, imageView, aVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadBgBlurImageRadius100");
        }

        /* renamed from: f */
        public static /* synthetic */ void m70368f(C60200t1 t1Var, String str, ImageView imageView, String str2, C11978e0.C11979a aVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    aVar = C11978e0.C11979a.DARK_COMMON;
                }
                t1Var.mo76803Rc(str, imageView, str2, aVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadBgBlurImageRadius25");
        }

        /* renamed from: g */
        public static /* synthetic */ void m70369g(C60200t1 t1Var, String str, ImageView imageView, String str2, C11978e0.C11979a aVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    aVar = C11978e0.C11979a.COMMON;
                }
                t1Var.mo76866oO(str, imageView, str2, aVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadImage");
        }

        /* renamed from: h */
        public static /* synthetic */ void m70370h(C60200t1 t1Var, String str, ImageView imageView, C11978e0.C11979a aVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    aVar = C11978e0.C11979a.COMMON;
                }
                t1Var.mo76741Cm(str, imageView, aVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadImage");
        }

        /* renamed from: i */
        public static /* synthetic */ void m70371i(C60200t1 t1Var, C104289g gVar, Context context, C60216z4.C8821a aVar, String str, boolean z, C60216z4.C8821a aVar2, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    str = "";
                }
                String str2 = str;
                boolean z2 = (i & 16) != 0 ? false : z;
                if ((i & 32) != 0) {
                    aVar2 = null;
                }
                t1Var.mo76901yF(gVar, context, aVar, str2, z2, aVar2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openFinderFeed");
        }

        /* renamed from: j */
        public static /* synthetic */ void m70372j(C60200t1 t1Var, Context context, C64287ci1 ci12, C32226l lVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    lVar = null;
                }
                t1Var.Va0(context, ci12, lVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shareProductToConversation");
        }
    }

    /* renamed from: ht1.t1$b */
    public interface C60202b {
        /* renamed from: a */
        void mo75691a(Object obj, int i, int i2);
    }

    /* renamed from: ht1.t1$c */
    public interface C60203c {
        /* renamed from: a */
        String mo85200a(String str, String str2);

        /* renamed from: b */
        boolean mo85201b(long j, String str, String str2, int i);
    }

    /* renamed from: AN */
    void mo76733AN(LinkedList<C50676og0> linkedList, int i, int i2);

    /* renamed from: AX */
    C13605o<Integer, Integer, Integer> mo76734AX(String str);

    /* renamed from: Af */
    Object mo76735Af(int i, int i2, C15601d<? super C13598b0> dVar);

    /* renamed from: Au */
    C46111l4 mo76736Au();

    /* renamed from: BW */
    int mo76737BW(FinderObject finderObject);

    /* renamed from: CG */
    String mo76739CG(String str, Intent intent);

    void Ch0(Context context, C48727ak1 ak12, int i, List<? extends C48727ak1> list, int i2, String str);

    /* renamed from: Cm */
    void mo76741Cm(String str, ImageView imageView, C11978e0.C11979a aVar);

    /* renamed from: DB */
    boolean mo76743DB();

    /* renamed from: Dl */
    void mo76744Dl(String str, String str2, String str3);

    /* renamed from: E6 */
    void mo76746E6(String str, C60216z4.C8821a<Integer> aVar);

    /* renamed from: EK */
    C64586nn1 mo76748EK(C66277w3 w3Var, String str);

    void Em0(Context context, FinderJumpInfo finderJumpInfo, C60203c cVar);

    /* renamed from: F */
    boolean mo76751F();

    void Fc0(Context context, Intent intent, boolean z);

    C65488a0 Fd0(FinderObject finderObject);

    void Fs0();

    /* renamed from: Gf */
    void mo76756Gf(String str, String str2, Activity activity);

    long Gj0();

    /* renamed from: HO */
    C117747y mo76759HO(List<String> list);

    /* renamed from: HX */
    void mo76760HX(C64682rk1 rk12, int i, long j, String str, C49712hj1 hj12, long j2);

    /* renamed from: Ha */
    void mo76761Ha(Context context, Intent intent, String str, C60216z4.C8821a<Integer> aVar);

    void Hm0(Context context, Intent intent);

    List<C66261f3> Hw0();

    /* renamed from: IQ */
    C64682rk1 mo76765IQ(FinderObject finderObject, boolean z);

    C47465a Iw0(String str, String str2, long j, FinderObject finderObject);

    /* renamed from: Iz */
    void mo76768Iz(String str, long j);

    /* renamed from: JB */
    void mo76769JB(String str);

    /* renamed from: JJ */
    void mo76770JJ(Context context, String str);

    /* renamed from: JP */
    Context mo76771JP();

    Object Jb0(long j, String str, int i, long j2, C60171g1 g1Var, C60157c5 c5Var, C15601d<? super C60171g1> dVar);

    /* renamed from: K9 */
    C117747y mo76774K9(String str, long j, String str2);

    /* renamed from: L4 */
    C46119x1 mo76776L4();

    /* renamed from: Li */
    FinderObject mo76777Li(long j, String str, int i, boolean z, boolean z2, String str2, C60202b bVar);

    void Li0(Context context, Intent intent);

    /* renamed from: ML */
    void mo76780ML(Context context, FinderJumpInfo finderJumpInfo, int i);

    /* renamed from: MY */
    void mo76781MY(Context context, String str, Intent intent);

    void Mr0(String str, C60216z4.C8821a<String> aVar);

    /* renamed from: Mt */
    C117747y mo76783Mt(String str, long j, C89349b bVar, int i, C49712hj1 hj12, int i2, long j2, boolean z, Integer num, Long l);

    /* renamed from: N7 */
    void mo76785N7(String str, ImageView imageView);

    /* renamed from: NI */
    boolean mo76786NI(FinderObject finderObject);

    /* renamed from: NL */
    void mo76787NL(int i, int i2, int i3, Context context, Intent intent, View view, boolean z);

    /* renamed from: Nh */
    boolean mo76788Nh(FinderObject finderObject);

    /* renamed from: Nn */
    String mo76789Nn(C117747y yVar);

    /* renamed from: Np */
    C91753f mo76790Np();

    C60152b4 Nt0();

    /* renamed from: OJ */
    void mo76793OJ(Context context, String str);

    void Pb0(Context context);

    int Pe0();

    boolean Pu0();

    void Qw0(Context context, Intent intent);

    /* renamed from: Qy */
    void mo76801Qy(Context context, Intent intent);

    /* renamed from: R1 */
    String mo76802R1(int i, int i2, int i3);

    /* renamed from: Rc */
    void mo76803Rc(String str, ImageView imageView, String str2, C11978e0.C11979a aVar);

    /* renamed from: Rk */
    C64888zo1 mo76804Rk(long j, int i);

    /* renamed from: Rl */
    void mo76805Rl(Context context, Intent intent);

    String S20(String str, String str2);

    /* renamed from: S7 */
    void mo76808S7(String str, ImageView imageView, C11978e0.C11979a aVar);

    /* renamed from: Sd */
    void mo76809Sd(String str, ImageView imageView, WeakReference<C60216z4.C8821a<Integer>> weakReference, C11978e0.C11979a aVar);

    boolean St0();

    /* renamed from: Tc */
    Object mo76811Tc(Context context, int i, C15601d<? super C13604l<Boolean, Integer>> dVar);

    Class<?> To0();

    void Tp0(Context context, String str, String str2, boolean z, String str3, C65953v0 v0Var, DialogInterface.OnDismissListener onDismissListener);

    void Tr0(List<? extends Pair<String, String>> list, boolean z);

    /* renamed from: U5 */
    void mo76815U5(Context context, String str, String str2, int i, String str3);

    /* renamed from: Uj */
    void mo76816Uj(Context context, Intent intent);

    void Ur0(Context context, Intent intent);

    /* renamed from: V1 */
    void mo76819V1(Context context, Intent intent);

    void Va0(Context context, C64287ci1 ci12, C32226l<? super List<String>, C13598b0> lVar);

    /* renamed from: Vb */
    boolean mo76821Vb();

    /* renamed from: Vm */
    boolean mo76822Vm();

    /* renamed from: W5 */
    C58969q mo76824W5(String str);

    /* renamed from: X */
    void mo76826X(ImageView imageView, FinderAuthInfo finderAuthInfo, int i, C64284cg cgVar);

    void X40(String str, ImageView imageView, String str2, C11978e0.C11979a aVar);

    /* renamed from: Xw */
    void mo76828Xw(Context context, Intent intent, m74 m74);

    int Ze0(FinderObject finderObject);

    /* renamed from: aO */
    void mo76832aO(Context context, Intent intent);

    void aa0(String str, ImageView imageView, String str2);

    /* renamed from: ai */
    void mo76834ai(Context context, String str, int i, C60213x3 x3Var);

    /* renamed from: bI */
    Object mo76835bI(Context context, byte[] bArr, String str, C15601d<? super C13604l<Boolean, String>> dVar);

    /* renamed from: bn */
    void mo76836bn(Context context, Intent intent, int i, int i2);

    /* renamed from: c0 */
    void mo76837c0(Context context, Intent intent);

    /* renamed from: cb */
    FinderObject mo76838cb(long j, String str, int i, String str2);

    void cl0(Context context, Intent intent, int i);

    void dk0(Context context, Intent intent);

    /* renamed from: dm */
    void mo76841dm(Activity activity, String str);

    /* renamed from: e7 */
    String mo76842e7(int i, int i2, int i3, Intent intent);

    void er0(Context context, String str, C60216z4.C8821a<Integer> aVar);

    /* renamed from: fK */
    void mo76844fK(Context context, Intent intent);

    C87592u3 fi0();

    void ft0(View view, View view2, View view3);

    /* renamed from: gA */
    long mo76847gA();

    /* renamed from: gJ */
    C33071r2 mo76848gJ();

    /* renamed from: gS */
    String mo76849gS(C117747y yVar);

    /* renamed from: gm */
    void mo76851gm(String str, int i, String str2, int i2, int i3, int i4, long j, long j2, long j3, int i5);

    /* renamed from: gr */
    void mo76852gr(Activity activity);

    /* renamed from: gy */
    void mo76853gy(boolean z);

    /* renamed from: h5 */
    void mo76854h5();

    /* renamed from: hR */
    long mo76855hR();

    void hj0(long j, long j2, String str, long j3);

    void jm0(long j, long j2, String str, int i, int i2, long j3, String str2, int i3, int i4, String str3, String str4, long j4, int i5);

    /* renamed from: jn */
    void mo76858jn(String str, int i, boolean z);

    C46120y4 kc0();

    /* renamed from: ku */
    boolean mo76860ku();

    /* renamed from: l7 */
    C60216z4 mo76861l7();

    String lr0();

    void np0(Context context, String str);

    /* renamed from: nr */
    void mo76864nr(Context context, Intent intent);

    C64888zo1 nu0(String str, int i);

    /* renamed from: oO */
    void mo76866oO(String str, ImageView imageView, String str2, C11978e0.C11979a aVar);

    /* renamed from: qD */
    void mo76867qD(Context context, Intent intent, int i);

    /* renamed from: qS */
    String mo76868qS(int i);

    /* renamed from: qi */
    Activity mo76869qi();

    /* renamed from: qp */
    void mo76870qp(String str, int i, boolean z);

    /* renamed from: s3 */
    void mo76871s3(Activity activity, Intent intent);

    String s40(MultiTaskInfo multiTaskInfo);

    /* renamed from: sF */
    boolean mo76873sF();

    /* renamed from: sQ */
    C117747y mo76874sQ(String str);

    /* renamed from: sW */
    void mo76875sW(long j, String str, String str2, String str3, String str4, long j2);

    /* renamed from: sZ */
    void mo76876sZ(int i, Intent intent);

    void sv0(String str, C9487b<C9486a> bVar, C32226l<? super fp4, C13598b0> lVar, C32226l<? super Integer, C13598b0> lVar2, boolean z, int i);

    /* renamed from: tN */
    C60183l5 mo76878tN(Context context, String str, long j, DialogInterface.OnCancelListener onCancelListener);

    /* renamed from: tO */
    boolean mo76879tO();

    /* renamed from: tQ */
    void mo76880tQ(Context context, Intent intent, int i);

    /* renamed from: tZ */
    Object mo76881tZ(Context context, C89349b bVar, boolean z, C15601d<? super C51398th3> dVar);

    /* renamed from: tg */
    void mo76882tg(String str, View view);

    boolean u60();

    /* renamed from: uQ */
    C58010a mo76884uQ(FinderMedia finderMedia, long j, boolean z);

    /* renamed from: uf */
    C8806u4 mo76885uf();

    void ui0(View view, Object obj, int i, int i2, int i3, long j, String str, int i4, boolean z);

    /* renamed from: v1 */
    void mo76887v1(Activity activity, Intent intent);

    /* renamed from: vm */
    void mo76888vm(Context context, String str);

    /* renamed from: vp */
    long mo76889vp();

    /* renamed from: w4 */
    FinderObject mo76890w4(long j, String str, int i);

    /* renamed from: w7 */
    void mo76891w7(Activity activity, String str, C60216z4.C8821a<Integer> aVar, C60216z4.C8821a<Integer> aVar2, boolean z);

    void wk0();

    Object wn0(Context context, C51398th3 th32, long j, long j2, C89349b bVar, String str, C15601d<? super C13605o<Boolean, Integer, String>> dVar);

    void wp0(Context context, long j, String str, String str2, int i, JSONObject jSONObject);

    /* renamed from: xS */
    C91753f mo76895xS();

    /* renamed from: xh */
    void mo76896xh(Context context, String str, C60216z4.C8821a<Object> aVar, C60216z4.C8821a<Integer> aVar2, C60216z4.C8821a<JSONObject> aVar3);

    /* renamed from: xo */
    boolean mo76897xo(int i);

    /* renamed from: xr */
    void mo76898xr(Context context, String str, C60216z4.C8821a<Object> aVar);

    /* renamed from: xw */
    void mo76899xw(String str, String str2, String str3, int i, String str4, int i2, long j, long j2, int i3, int i4, String str5, String str6, boolean z);

    /* renamed from: y */
    void mo76900y(C49712hj1 hj12, int i, C48978cb0 cb02);

    /* renamed from: yF */
    void mo76901yF(C104289g gVar, Context context, C60216z4.C8821a<Object> aVar, String str, boolean z, C60216z4.C8821a<JSONObject> aVar2);

    void yj0(String str, ImageView imageView, C11978e0.C11979a aVar);

    void yt0(Context context, Intent intent);

    /* renamed from: z2 */
    C32026j mo76905z2();

    /* renamed from: zn */
    void mo76906zn(Context context, boolean z, String str, C60216z4.C8821a<Object> aVar, C60216z4.C8821a<Integer> aVar2, C60216z4.C8821a<JSONObject> aVar3);

    /* renamed from: zu */
    void mo76907zu(FinderObject finderObject, String str);
}
