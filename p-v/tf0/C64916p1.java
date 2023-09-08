package tf0;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.C67092e0;
import androidx.recyclerview.widget.RecyclerView;
import bd1.C0264h;
import cm1.C0740i2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.feed.model.C2780c;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import di0.C86299o;
import di3.C7335d;
import er1.C58744l;
import er1.C58773q5;
import er1.C7840n;
import fe1.C58959b;
import fe1.C58969q;
import fe1.C8012e;
import fe1.C8015l;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import ht1.C60216z4;
import it1.C60625c;
import it1.C60628i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import kf1.C9818k2;
import nj3.C76875f0;
import ob0.C89132b;
import pe3.C89349b;
import pl1.C11977d0;
import rx3.C13598b0;
import rx3.C13604l;
import rx3.C13605o;
import te3.C48978cb0;
import te3.C49704hh0;
import te3.C49712hj1;
import te3.C49946j51;
import te3.C50008jm0;
import te3.C50717oq2;
import te3.C51833wh0;
import te3.C51978xi1;
import te3.C64284cg;
import te3.C64414h71;
import te3.C64465jc1;
import te3.C64586nn1;
import te3.C64728tj0;
import te3.C64777vl1;
import te3.C64831xk1;
import te3.C64837xq2;
import up1.C37521f;
import up1.C65416i;
import up1.C65426w0;

/* renamed from: tf0.p1 */
public interface C64916p1 extends C8015l, C8012e, C7335d {

    /* renamed from: tf0.p1$a */
    public static final class C64917a {

        /* renamed from: tf0.p1$a$a */
        public static final class C13885a extends C87413o implements C32226l<C60628i, C13598b0> {

            /* renamed from: d */
            public static final C13885a f39046d = new C13885a();

            public C13885a() {
                super(1);
            }

            public Object invoke(Object obj) {
                C87412m.m108594g((C60628i) obj, LocaleUtil.ITALIAN);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ C60628i m76434a(C64916p1 p1Var, String str, int i, String str2, C89349b bVar, int i2, C49712hj1 hj12, C89349b bVar2, C89349b bVar3, C89349b bVar4, int i3, Object obj) {
            int i4 = i3;
            if (obj == null) {
                return p1Var.mo76715qB(str, i, str2, bVar, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? null : hj12, (i4 & 64) != 0 ? null : bVar2, (i4 & 128) != 0 ? null : bVar3, (i4 & 256) != 0 ? null : bVar4);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cgiFinderSearch");
        }

        /* renamed from: b */
        public static /* synthetic */ C60625c m76435b(C64916p1 p1Var, long j, String str, int i, int i2, String str2, boolean z, C89349b bVar, C65426w0 w0Var, long j2, String str3, boolean z2, boolean z3, String str4, C49712hj1 hj12, int i3, int i4, Object obj) {
            int i5 = i4;
            if (obj == null) {
                return p1Var.qr0(j, str, i, i2, str2, (i5 & 32) != 0 ? false : z, (i5 & 64) != 0 ? null : bVar, (i5 & 128) != 0 ? null : w0Var, (i5 & 256) != 0 ? 0 : j2, (i5 & 512) != 0 ? "" : str3, (i5 & 1024) != 0 ? true : z2, (i5 & 2048) != 0 ? false : z3, (i5 & 4096) != 0 ? "" : str4, hj12, (i5 & 16384) != 0 ? 6 : i3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cgiGetFinderFeedComment");
        }

        /* renamed from: c */
        public static /* synthetic */ void m76436c(C64916p1 p1Var, MMActivity mMActivity, long j, String str, int i, int i2, String str2, boolean z, C89349b bVar, C65426w0 w0Var, long j2, String str3, boolean z2, boolean z3, String str4, C49712hj1 hj12, boolean z4, int i3, C32226l lVar, int i4, Object obj) {
            int i5 = i4;
            if (obj == null) {
                p1Var.ve0(mMActivity, j, str, i, i2, str2, (i5 & 64) != 0 ? false : z, (i5 & 128) != 0 ? null : bVar, (i5 & 256) != 0 ? null : w0Var, (i5 & 512) != 0 ? 0 : j2, (i5 & 1024) != 0 ? "" : str3, (i5 & 2048) != 0 ? true : z2, (i5 & 4096) != 0 ? false : z3, (i5 & 8192) != 0 ? "" : str4, hj12, (32768 & i5) != 0 ? true : z4, (i5 & 65536) != 0 ? 6 : i3, lVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cgiGetFinderFeedComment");
        }

        /* renamed from: d */
        public static /* synthetic */ void m76437d(C64916p1 p1Var, int i, C32226l lVar, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    lVar = C13885a.f39046d;
                }
                p1Var.mo76658FS(i, lVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cgiGetFinderPrepareUser");
        }

        /* renamed from: e */
        public static /* synthetic */ void m76438e(C64916p1 p1Var, Context context, FinderJumpInfo finderJumpInfo, C86299o oVar, int i, C60905o oVar2, int i2, Object obj) {
            if (obj == null) {
                int i3 = (i2 & 8) != 0 ? 0 : i;
                if ((i2 & 16) != 0) {
                    oVar2 = null;
                }
                p1Var.mo76675Od(context, finderJumpInfo, oVar, i3, oVar2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchJump");
        }

        /* renamed from: f */
        public static /* synthetic */ void m76439f(C64916p1 p1Var, Context context, C64837xq2 xq22, C86299o oVar, C60905o oVar2, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    oVar2 = null;
                }
                p1Var.mo76692dG(context, xq22, oVar, oVar2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchJumpV1");
        }

        /* renamed from: g */
        public static /* synthetic */ void m76440g(C64916p1 p1Var, C49712hj1 hj12, String str, int i, long j, boolean z, String str2, C64414h71 h712, Integer num, Integer num2, int i2, Object obj) {
            int i3 = i2;
            if (obj == null) {
                p1Var.yi0(hj12, str, i, (i3 & 8) != 0 ? 0 : j, (i3 & 16) != 0 ? false : z, (i3 & 32) != 0 ? "" : str2, (i3 & 64) != 0 ? null : h712, (i3 & 128) != 0 ? 0 : num, (i3 & 256) != 0 ? -1 : num2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: followAsync");
        }

        /* renamed from: h */
        public static /* synthetic */ CharSequence m76441h(C64916p1 p1Var, Context context, TextPaint textPaint, CharSequence charSequence, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 8) != 0) {
                    i = C37521f.f99374d.mo61150D();
                }
                return p1Var.mo76710p2(context, textPaint, charSequence, i);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNickName");
        }

        /* renamed from: i */
        public static /* synthetic */ CharSequence m76442i(C64916p1 p1Var, TextView textView, CharSequence charSequence, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    i = C37521f.f99374d.mo61150D();
                }
                return p1Var.mo76677Ur(textView, charSequence, i);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNickName");
        }

        /* renamed from: j */
        public static /* synthetic */ void m76443j(C64916p1 p1Var, Context context, Intent intent, long j, String str, int i, int i2, boolean z, int i3, Object obj) {
            if (obj == null) {
                p1Var.mo76711p3(context, intent, (i3 & 4) != 0 ? 0 : j, (i3 & 8) != 0 ? null : str, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? false : z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initIntentParams");
        }

        /* renamed from: k */
        public static /* synthetic */ void m76444k(C64916p1 p1Var, ImageView imageView, FinderAuthInfo finderAuthInfo, int i, C64284cg cgVar, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    i = 1;
                }
                if ((i2 & 8) != 0) {
                    cgVar = null;
                }
                p1Var.mo76683X(imageView, finderAuthInfo, i, cgVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAuthIcon");
        }

        /* renamed from: l */
        public static /* synthetic */ void m76445l(C64916p1 p1Var, Context context, String str, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnDismissListener onDismissListener, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 16) != 0) {
                    onDismissListener = null;
                }
                p1Var.ts0(context, str, onClickListener, onClickListener2, onDismissListener, (i & 32) != 0 ? false : z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showUserInfoConfirmDialog");
        }
    }

    /* renamed from: AJ */
    void mo76649AJ(long j, int i);

    /* renamed from: AV */
    boolean mo76650AV(String str);

    BaseFinderFeed B40(FinderItem finderItem);

    /* renamed from: BO */
    void mo76652BO(AppCompatActivity appCompatActivity, String str, C76875f0 f0Var, FinderItem finderItem, C32226l<? super List<String>, C13598b0> lVar);

    FinderItem Br0(long j);

    C55718s0 Ck0(C51978xi1 xi12, String str, HashSet<String> hashSet, boolean z, C13604l<C55718s0, ? extends C64586nn1> lVar, C32226l<? super C55718s0, C13598b0> lVar2);

    /* renamed from: Cu */
    String mo76655Cu(long j, int i);

    /* renamed from: D0 */
    boolean mo76656D0();

    /* renamed from: EE */
    boolean mo76657EE(String str);

    /* renamed from: FS */
    void mo76658FS(int i, C32226l<? super C60628i, C13598b0> lVar);

    /* renamed from: G5 */
    C55718s0 mo76659G5(String str);

    void G50(MMFinderUI mMFinderUI);

    /* renamed from: GH */
    void mo76661GH(MMFinderUI mMFinderUI);

    /* renamed from: GJ */
    String mo76662GJ(String str, String str2, boolean z);

    /* renamed from: Gi */
    boolean mo76663Gi(String str);

    /* renamed from: Hs */
    void mo76664Hs(Context context, String str, FinderItem finderItem);

    /* renamed from: I8 */
    void mo76665I8();

    boolean J30(int i);

    /* renamed from: Js */
    boolean mo76667Js();

    String L60(String str, LinkedList<C51833wh0> linkedList, ArrayList<C50717oq2> arrayList);

    /* renamed from: M7 */
    void mo76669M7(Context context, String str, long j, String str2, Long l, int i);

    /* renamed from: MT */
    String mo76670MT(C11977d0 d0Var);

    /* renamed from: Mk */
    void mo76671Mk(MMFinderUI mMFinderUI);

    /* renamed from: N */
    boolean mo59665N();

    C49704hh0 Na0();

    /* renamed from: O2 */
    void mo76673O2();

    /* renamed from: OT */
    void mo76674OT(String str, Long l, C7840n nVar);

    /* renamed from: Od */
    void mo76675Od(Context context, FinderJumpInfo finderJumpInfo, C86299o oVar, int i, C60905o oVar2);

    /* renamed from: RO */
    C64777vl1 mo76676RO();

    /* renamed from: Ur */
    CharSequence mo76677Ur(TextView textView, CharSequence charSequence, int i);

    /* renamed from: VK */
    C60628i mo76678VK(C89349b bVar, long j, int i);

    void Ve0(int i, List<? extends C0740i2> list, C89349b bVar, Intent intent, C2780c cVar);

    void Vm0(String str);

    /* renamed from: W5 */
    C58969q mo76681W5(String str);

    void Wm0(MMFinderUI mMFinderUI);

    /* renamed from: X */
    void mo76683X(ImageView imageView, FinderAuthInfo finderAuthInfo, int i, C64284cg cgVar);

    C67092e0 Xd0();

    List<C64728tj0> Z20();

    C9818k2 Zg0(MMActivity mMActivity);

    C58959b Zj0();

    /* renamed from: a5 */
    void mo76688a5(Context context, C64831xk1 xk12, String str);

    /* renamed from: aP */
    boolean mo76689aP(String str);

    /* renamed from: c5 */
    Set<MMFinderUI> mo76690c5();

    /* renamed from: d2 */
    void mo76691d2();

    /* renamed from: dG */
    void mo76692dG(Context context, C64837xq2 xq22, C86299o oVar, C60905o oVar2);

    String du0(String str);

    /* renamed from: dv */
    void mo76694dv(FinderObject finderObject, C49712hj1 hj12);

    String e80();

    SpannableString e90(String str, SpannableString spannableString, long j, List<C58773q5> list, LinkedList<FinderContact> linkedList, LinkedList<C64465jc1> linkedList2, C32227p<? super String, ? super C7840n, C13598b0> pVar, C32226l<? super String, C13598b0> lVar);

    /* renamed from: gW */
    C65416i mo76697gW();

    C60172g4 gr0(Context context);

    C58744l gv0(RecyclerView recyclerView, int i, int i2, Set<Integer> set);

    /* renamed from: hY */
    boolean mo76700hY(Context context);

    /* renamed from: iy */
    FinderItem mo76701iy(long j);

    void j80(FinderObject finderObject, int i);

    /* renamed from: jw */
    int mo76703jw();

    void kr0(MMFinderUI mMFinderUI);

    /* renamed from: lw */
    String mo76705lw(String str, String str2, boolean z);

    boolean m40();

    void m90(C49712hj1 hj12, int i, C48978cb0 cb02, String str);

    /* renamed from: mv */
    C13605o<String, String, String> mo76708mv(Context context, BaseFinderFeed baseFinderFeed, int i, C32226l<? super C13605o<String, String, String>, C13598b0> lVar);

    /* renamed from: nI */
    void mo76709nI(Activity activity, int i, Intent intent, int i2, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnDismissListener onDismissListener);

    /* renamed from: p2 */
    CharSequence mo76710p2(Context context, TextPaint textPaint, CharSequence charSequence, int i);

    /* renamed from: p3 */
    void mo76711p3(Context context, Intent intent, long j, String str, int i, int i2, boolean z);

    /* renamed from: p8 */
    void mo76712p8(Context context, int i, Intent intent);

    /* renamed from: pw */
    String mo76713pw();

    boolean q90();

    /* renamed from: qB */
    C60628i mo76715qB(String str, int i, String str2, C89349b bVar, int i2, C49712hj1 hj12, C89349b bVar2, C89349b bVar3, C89349b bVar4);

    C60625c<C50008jm0> qr0(long j, String str, int i, int i2, String str2, boolean z, C89349b bVar, C65426w0 w0Var, long j2, String str3, boolean z2, boolean z3, String str4, C49712hj1 hj12, int i3);

    /* renamed from: qx */
    int mo76717qx(String str);

    /* renamed from: rZ */
    String mo76718rZ(C11977d0 d0Var);

    void sa0(String str, C0264h hVar);

    Spanned t50(String str, String str2);

    /* renamed from: tb */
    SpannableString mo76721tb(String str, String str2, ArrayList<C50717oq2> arrayList, C32226l<? super C50717oq2, C13598b0> lVar);

    void ts0(Context context, String str, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnDismissListener onDismissListener, boolean z);

    /* renamed from: ty */
    boolean mo76723ty();

    /* renamed from: vV */
    void mo76724vV(AppCompatActivity appCompatActivity, String str, C76875f0 f0Var, FinderItem finderItem, C32226l<? super List<String>, C13598b0> lVar);

    void ve0(MMActivity mMActivity, long j, String str, int i, int i2, String str2, boolean z, C89349b bVar, C65426w0 w0Var, long j2, String str3, boolean z2, boolean z3, String str4, C49712hj1 hj12, boolean z4, int i3, C32226l<? super C89132b.C89134c<C50008jm0>, C13598b0> lVar);

    /* renamed from: wa */
    String mo76726wa(String str, String str2);

    /* renamed from: xV */
    void mo76727xV(Context context, long j, String str, Long l, int i);

    /* renamed from: y */
    void mo76728y(C49712hj1 hj12, int i, C48978cb0 cb02);

    /* renamed from: yP */
    String mo76729yP();

    void yi0(C49712hj1 hj12, String str, int i, long j, boolean z, String str2, C64414h71 h712, Integer num, Integer num2);

    /* renamed from: z7 */
    void mo76731z7(String str, String str2, C60216z4.C8821a<Integer> aVar, String str3, long j, C60216z4.C8821a<Void> aVar2, String str4, String str5, C49946j51 j512, long j2, Intent intent, Map<String, Object> map);

    C60896i<C9493c> zl0();
}
