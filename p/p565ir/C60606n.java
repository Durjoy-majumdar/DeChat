package p565ir;

import a14.C0000n0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.opengl.EGLContext;
import android.text.style.ImageSpan;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import di3.C7335d;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import fy3.C32229r;
import ht1.C60151b;
import ht1.C60216z4;
import ht1.C76242a3;
import is3.C60622a;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import jp3.C9486a;
import jp3.C9487b;
import kg3.C76577a;
import ks3.C10407d;
import ks3.C61161k;
import ks3.C61165t;
import ob0.C89132b;
import org.json.JSONObject;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C48770aw0;
import te3.C49098d51;
import te3.C49352ez;
import te3.C49712hj1;
import te3.C49765hx0;
import te3.C50073k31;
import te3.C50397mg0;
import te3.C50429mo2;
import te3.C50508n81;
import te3.C50516na1;
import te3.C50602nw0;
import te3.C51965xf0;
import te3.C52005xq0;
import te3.C52153yq0;
import te3.C64257bc1;
import te3.C64273c21;
import te3.C64321dp2;
import te3.C64351ey0;
import te3.C64390ga1;
import te3.C64414h71;
import te3.C64623p81;
import te3.C64700s53;
import te3.C64733to;
import te3.C64855yf1;
import wx3.C15601d;
import zh3.C91753f;

/* renamed from: ir.n */
public interface C60606n extends C7335d {

    /* renamed from: ir.n$d */
    public interface C46282d {
        /* renamed from: a */
        void mo71688a(int i);
    }

    /* renamed from: ir.n$a */
    public static final class C60607a {
        /* renamed from: a */
        public static /* synthetic */ void m70857a(C60606n nVar, long j, boolean z, C9487b bVar, C60609c cVar, int i, String str, C50429mo2 mo22, int i2, Object obj) {
            if (obj == null) {
                nVar.Kc0(j, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? null : bVar, cVar, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? "" : str, (i2 & 64) != 0 ? null : mo22);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLiveInfo");
        }

        /* renamed from: b */
        public static /* synthetic */ void m70858b(C60606n nVar, String str, C0000n0 n0Var, TextView textView, List list, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i, C32224a aVar, int i2, Object obj) {
            int i3 = i2;
            if (obj == null) {
                nVar.ae0(str, n0Var, textView, list, str2, z, z2, z3, (i3 & 256) != 0 ? true : z4, (i3 & 512) != 0 ? C76577a.m92151b(textView.getContext(), 16) : i, (i3 & 1024) != 0 ? null : aVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insertImageSpanToText");
        }

        /* renamed from: c */
        public static /* synthetic */ void m70859c(C60606n nVar, Context context, C49352ez ezVar, C49712hj1 hj12, String str, String str2, int i, Object obj) {
            if (obj == null) {
                C49712hj1 hj13 = (i & 4) != 0 ? null : hj12;
                String str3 = (i & 8) != 0 ? null : str;
                if ((i & 16) != 0) {
                    str2 = "";
                }
                nVar.mo85089tW(context, ezVar, hj13, str3, str2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpToGetConcertTicket");
        }

        /* renamed from: d */
        public static /* synthetic */ void m70860d(C60606n nVar, long j, long j2, String str, String str2, C89349b bVar, LinkedList linkedList, String str3, Context context, boolean z, C32227p pVar, int i, Object obj) {
            int i2 = i;
            if (obj == null) {
                nVar.mo85103yW(j, j2, str, str2, bVar, linkedList, (i2 & 64) != 0 ? "" : str3, context, (i2 & 256) != 0 ? true : z, (i2 & 512) != 0 ? null : pVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: runCgiFinderLiveReceiveCoupon");
        }

        /* renamed from: e */
        public static /* synthetic */ void m70861e(C60606n nVar, View view, C61161k kVar, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    z = false;
                }
                nVar.jr0(view, kVar, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFinderLiveTagText");
        }
    }

    /* renamed from: ir.n$b */
    public interface C60608b {
        /* renamed from: a */
        void mo83467a(Map<Long, Integer> map, int i);
    }

    /* renamed from: ir.n$c */
    public interface C60609c {
        void onLiveStatusCallback(long j, int i, Object obj);
    }

    /* renamed from: ir.n$e */
    public interface C60610e {
        /* renamed from: a */
        void mo85563a(boolean z, String str);
    }

    /* renamed from: Aw */
    void mo84986Aw(ImageView imageView, String str, float f, C32226l<? super Bitmap, C13598b0> lVar);

    /* renamed from: BG */
    void mo84988BG(String str, String str2, String str3, boolean z);

    /* renamed from: BR */
    void mo84989BR(String str);

    void Bs0(int i, int i2, boolean z);

    /* renamed from: Cx */
    void mo84992Cx();

    void Dc0(JSONObject jSONObject);

    void Di0(int i);

    /* renamed from: Dk */
    String mo84996Dk(long j);

    /* renamed from: Dr */
    void mo84997Dr(boolean z);

    /* renamed from: ES */
    void mo84999ES(C60216z4.C8821a<List<C50073k31>> aVar);

    void Ej0(View view, boolean z, int i);

    /* renamed from: F */
    boolean mo85002F();

    void F40(String str);

    /* renamed from: Ft */
    void mo85004Ft();

    /* renamed from: G0 */
    boolean mo85005G0(C64623p81 p812);

    void Gi0(C64273c21 c212, C64733to toVar);

    /* renamed from: Gk */
    void mo85007Gk(long j, byte[] bArr, long j2, int i, String str, String str2, String str3, int i2, C49712hj1 hj12, int i3, C52153yq0 yq02, String str4, String str5, int i4, String str6, C64414h71 h712, long j3, int i5, String str7, C89349b bVar, int i6, String str8, C32226l<? super C89132b.C89134c<C52005xq0>, C13598b0> lVar);

    /* renamed from: I1 */
    boolean mo85008I1(C64273c21 c212);

    /* renamed from: IS */
    boolean mo85009IS();

    /* renamed from: J */
    int mo85010J();

    boolean J10();

    /* renamed from: JC */
    void mo85012JC(String str, String str2, int i, C32228q<? super String, ? super String, ? super Integer, C13598b0> qVar);

    void Ja0(Context context, String str, C60216z4.C8821a<Integer> aVar, C60216z4.C8821a<Integer> aVar2, boolean z);

    /* renamed from: KM */
    void mo85014KM(LinkedList<C64257bc1> linkedList);

    void Kb0(JSONObject jSONObject, C46282d dVar);

    void Kc0(long j, boolean z, C9487b<C9486a> bVar, C60609c cVar, int i, String str, C50429mo2 mo22);

    /* renamed from: L5 */
    boolean mo85017L5();

    void Lm0(String str, String str2, Context context, C32229r<? super Integer, ? super Integer, ? super String, ? super C50397mg0, C13598b0> rVar);

    /* renamed from: Lu */
    void mo85019Lu(int i);

    /* renamed from: MO */
    void mo85020MO(Context context, String str, C64855yf1 yf12, C64700s53 s532);

    /* renamed from: OV */
    void mo85021OV(int i);

    /* renamed from: Oh */
    List<C50516na1> mo85022Oh(long j);

    /* renamed from: Pn */
    void mo85023Pn(JSONObject jSONObject, String str, Context context, C60216z4.C8821a<Object> aVar, C60216z4.C8821a<Integer> aVar2);

    boolean Q30();

    /* renamed from: Qf */
    boolean mo85025Qf(String str);

    void Qk0();

    /* renamed from: Qo */
    void mo85027Qo(Activity activity, C32224a<C13598b0> aVar, boolean z);

    void Qv0(Context context, String str, int i, boolean z, String str2, String str3, int i2, long j);

    void R70(Context context, String str, String str2, Integer num, List<String> list, List<String> list2);

    /* renamed from: SV */
    void mo85030SV(Context context, C49765hx0 hx02, boolean z, String str, C60216z4.C8821a<Object> aVar, C60216z4.C8821a<Object> aVar2);

    /* renamed from: Sb */
    void mo85031Sb(C60622a aVar);

    /* renamed from: Sc */
    void mo85032Sc();

    /* renamed from: Sh */
    String mo85033Sh();

    boolean Sj0(C64273c21 c212);

    /* renamed from: Sm */
    boolean mo85035Sm();

    C64273c21 T70(long j);

    /* renamed from: Tb */
    void mo85037Tb(TextView textView, ImageView imageView, C60151b bVar, float f);

    /* renamed from: Ti */
    Object mo85038Ti(long j, int i, C15601d<? super C50602nw0> dVar);

    List<ImageSpan> Tv0(View view, List<? extends C48770aw0> list, int[] iArr, int i, int i2);

    /* renamed from: UB */
    void mo85040UB(TextView textView, List<String> list, List<Float> list2, String str, int i, boolean z);

    /* renamed from: WK */
    void mo85041WK(Context context, String str);

    /* renamed from: XT */
    void mo85042XT(int i);

    /* renamed from: Xf */
    void mo85043Xf(String str, String str2, boolean z);

    /* renamed from: Xi */
    void mo85044Xi(int i);

    /* renamed from: Xr */
    HashMap<Integer, C91753f.C66827b> mo85045Xr();

    /* renamed from: Z3 */
    void mo85046Z3(Context context, Intent intent);

    /* renamed from: ZH */
    void mo85047ZH(Intent intent, Context context, long j, Long l, String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, int i2, boolean z);

    void a50(int i);

    void ae0(String str, C0000n0 n0Var, TextView textView, List<String> list, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i, C32224a<C13598b0> aVar);

    /* renamed from: bT */
    void mo85050bT(EGLContext eGLContext, int i, int i2, int i3, long j);

    /* renamed from: bg */
    int mo85051bg(long j);

    /* renamed from: c7 */
    void mo85052c7(Context context, C32226l<? super Boolean, C13598b0> lVar);

    void ck0(long j, int i, long j2, C9487b<C9486a> bVar, C60609c cVar, int i2);

    /* renamed from: dz */
    void mo85054dz(boolean z);

    void enableAudioVolumeEvaluation(int i);

    /* renamed from: fR */
    void mo85056fR();

    void fs0(long j);

    /* renamed from: fy */
    C64321dp2 mo85058fy(long j, C64390ga1 ga12);

    /* renamed from: h4 */
    C49098d51 mo85059h4(String str, String str2);

    View h40();

    /* renamed from: hZ */
    void mo85061hZ(int i);

    /* renamed from: iC */
    C61161k mo85062iC(C64623p81 p812, boolean z);

    /* renamed from: ie */
    void mo85063ie(Context context, String str);

    boolean ih0(long j);

    /* renamed from: jR */
    void mo85065jR(String str);

    /* renamed from: jY */
    void mo85066jY(String str, String str2);

    void jd0(int i);

    void jr0(View view, C61161k kVar, boolean z);

    C61161k jv0(String str, C64273c21 c212);

    /* renamed from: k4 */
    void mo85070k4(Context context, Intent intent);

    C50508n81 kj0();

    String l90();

    void lc0(boolean z);

    /* renamed from: n5 */
    C89132b<C51965xf0> mo85074n5(String str, String str2, int i, C49712hj1 hj12, int i2);

    /* renamed from: nB */
    boolean mo85075nB(C64273c21 c212);

    void o90(Intent intent, Context context, long j, Long l, String str, String str2, String str3, String str4, String str5);

    void ok0(AppCompatActivity appCompatActivity, C32224a<C13598b0> aVar);

    /* renamed from: pP */
    void mo85078pP(C60622a aVar);

    /* renamed from: pT */
    boolean mo85079pT(String str, View view, View view2, long j);

    void pj0(Context context, String str);

    /* renamed from: pt */
    void mo85081pt(JSONObject jSONObject, boolean z, C60216z4.C8821a<Integer> aVar, C60216z4.C8821a<Object> aVar2, String str);

    void pu0(String str, Context context, ViewGroup viewGroup, String str2, float f, int i, int i2, boolean z);

    /* renamed from: qY */
    void mo85083qY(AppCompatActivity appCompatActivity);

    /* renamed from: r0 */
    void mo85084r0(String str);

    /* renamed from: sN */
    void mo85085sN(List<? extends Pair<Long, String>> list, C60608b bVar, Context context);

    /* renamed from: sb */
    void mo85086sb(String str, C60610e eVar);

    void setVoiceCaptureVolume(int i);

    HashMap<Integer, C91753f.C66827b> sr0();

    /* renamed from: tW */
    void mo85089tW(Context context, C49352ez ezVar, C49712hj1 hj12, String str, String str2);

    String tx0();

    /* renamed from: uI */
    int mo85091uI(int i);

    void uq0(byte[] bArr, int i, int i2, long j);

    /* renamed from: vB */
    void mo85093vB(int i);

    /* renamed from: vK */
    void mo85094vK(boolean z, boolean z2);

    /* renamed from: va */
    void mo85095va(String str, String str2, String str3, String str4);

    void vb0(ImageView imageView, TextView textView, ImageView imageView2);

    /* renamed from: vi */
    void mo85097vi(String str, C10407d dVar);

    Object vj0(Context context, long j, String str, ImageView imageView, int i, C15601d<? super C13598b0> dVar);

    /* renamed from: wF */
    void mo85099wF(boolean z, Context context);

    /* renamed from: ww */
    C76242a3 mo85100ww();

    void x30(ImageView imageView, C61165t tVar, int i);

    /* renamed from: y7 */
    void mo85102y7(Context context, boolean z, boolean z2);

    /* renamed from: yW */
    void mo85103yW(long j, long j2, String str, String str2, C89349b bVar, LinkedList<String> linkedList, String str3, Context context, boolean z, C32227p<? super Boolean, ? super String, C13598b0> pVar);

    void z40(Context context, String str, String str2, String str3, String str4, String str5);

    C64351ey0 zg0();

    void zr0(Context context);
}
