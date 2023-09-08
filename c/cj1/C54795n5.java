package cj1;

import a14.C0000n0;
import al1.C0079b;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.trtc.TRTCCloudDef;
import d50.C58113g;
import dj1.C45341a;
import dj1.C45343b;
import dj1.C45346d;
import dj1.C45350e;
import dj1.C45360g;
import dj1.C45364h;
import dj1.C45369j0;
import dj1.C45377n;
import dj1.C45384r;
import dj1.C45389s0;
import dj1.C45391t;
import dj1.C45393v;
import dj1.C45395w;
import dj1.C45397x;
import dj1.C45401y;
import dj1.C7339i0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import fy3.C32229r;
import fy3.C32230s;
import fy3.C32232u;
import java.util.LinkedList;
import java.util.List;
import m53.C10757d;
import pe3.C89349b;
import qg1.C47826f;
import qg1.C47836x;
import qj1.C12360e8;
import qj1.C12666si;
import rx3.C13598b0;
import sk1.C63965x;
import te3.C49291ej0;
import te3.C49366f21;
import te3.C49585go0;
import te3.C49765hx0;
import te3.C50131kh1;
import te3.C50262lh0;
import te3.C50401mh0;
import te3.C50542nh0;
import te3.C50863pr0;
import te3.C50912q41;
import te3.C51203s61;
import te3.C51316sz0;
import te3.C51778w31;
import te3.C51790w61;
import te3.C51868wr1;
import te3.C52005xq0;
import te3.C52047y01;
import te3.C64414h71;
import te3.C64707sc1;
import te3.C64756up2;
import wx3.C15601d;

/* renamed from: cj1.n5 */
public interface C54795n5 {

    /* renamed from: cj1.n5$a */
    public static final class C54796a {
        /* renamed from: a */
        public static /* synthetic */ void m61723a(C54795n5 n5Var, int i, C32230s sVar, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    i = 0;
                }
                n5Var.mo75748p(i, sVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doCloseLive");
        }

        /* renamed from: b */
        public static /* synthetic */ void m61724b(C54795n5 n5Var, long j, long j2, String str, int i, C32227p pVar, int i2, Object obj) {
            if (obj == null) {
                n5Var.mo75755w(j, j2, str, i, (i2 & 16) != 0 ? null : pVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doGetGiftList");
        }

        /* renamed from: c */
        public static /* synthetic */ void m61725c(C54795n5 n5Var, Context context, long j, long j2, String str, int i, int i2, String str2, String str3, int i3, C89349b bVar, List list, String str4, String str5, C12360e8.C12371d dVar, int i4, Object obj) {
            int i5 = i4;
            if (obj == null) {
                n5Var.mo75750r(context, j, j2, str, i, i2, str2, str3, (i5 & 256) != 0 ? 0 : i3, (i5 & 512) != 0 ? null : bVar, list, (i5 & 2048) != 0 ? null : str4, (i5 & 4096) != 0 ? null : str5, (i5 & 8192) != 0 ? null : dVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doPostGift");
        }

        /* renamed from: d */
        public static /* synthetic */ void m61726d(C54795n5 n5Var, long j, long j2, int i, int i2, C47826f.C47827a aVar, int i3, Object obj) {
            if (obj == null) {
                n5Var.mo75706J(j, j2, i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? null : aVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAnchorStatus");
        }

        /* renamed from: e */
        public static /* synthetic */ void m61727e(C54795n5 n5Var, long j, long j2, int i, long j3, int i2, C47826f.C47827a aVar, int i3, Object obj) {
            if (obj == null) {
                n5Var.mo75724a0(j, j2, i, j3, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? null : aVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAnchorStatusWithOpFlag");
        }
    }

    /* renamed from: A */
    void mo75697A(Activity activity, C51790w61 w612, ResultReceiver resultReceiver, C32226l<? super Integer, C13598b0> lVar);

    /* renamed from: B */
    void mo75698B(Context context, long j, String str, Long l, int i);

    /* renamed from: C */
    C10757d mo75699C(FragmentActivity fragmentActivity, int i, C32224a<C13598b0> aVar);

    /* renamed from: D */
    void mo75700D(int i, C49765hx0 hx02, String str, String str2, C45360g.C45361a aVar);

    /* renamed from: E */
    void mo75701E(String str, long j, C45377n.C45378a aVar);

    /* renamed from: F */
    void mo75702F(long j, long j2, String str, byte[] bArr, int i, LinkedList<String> linkedList, C45393v.C45394a aVar);

    /* renamed from: G */
    boolean mo75703G(Intent intent);

    /* renamed from: H */
    void mo75704H(String str, boolean z, Context context, C32226l<? super Boolean, C13598b0> lVar);

    /* renamed from: I */
    void mo75705I(Bundle bundle, Object obj, String str);

    /* renamed from: J */
    void mo75706J(long j, long j2, int i, int i2, C47826f.C47827a aVar);

    /* renamed from: K */
    void mo75707K(long j, long j2, String str, byte[] bArr, int i, C49765hx0 hx02, String str2, int i2, C89349b bVar, C45350e.C45351a aVar);

    /* renamed from: L */
    void mo75708L(C45397x.C45398a aVar);

    /* renamed from: M */
    void mo75709M(byte[] bArr, long j, long j2, String str, String str2, int i, C47836x.C47837a aVar);

    /* renamed from: N */
    void mo75710N(String str);

    /* renamed from: O */
    void mo75711O(String str, C89349b bVar, C7339i0.C7340a aVar);

    /* renamed from: P */
    void mo75712P();

    /* renamed from: Q */
    void mo75713Q(Activity activity, boolean z);

    /* renamed from: R */
    void mo75714R(Context context, Intent intent, Integer num);

    /* renamed from: S */
    void mo75715S(Context context, C32226l<? super Boolean, C13598b0> lVar, C32227p<? super Integer, ? super Integer, C13598b0> pVar);

    /* renamed from: T */
    void mo75716T(View view, int i);

    /* renamed from: U */
    void mo75717U(Activity activity);

    /* renamed from: V */
    long mo75718V();

    /* renamed from: W */
    void mo75719W(Context context, long j, long j2, C51868wr1 wr12, C47826f.C47827a aVar);

    /* renamed from: X */
    void mo75720X(C32232u<? super Boolean, ? super Boolean, ? super String, ? super Integer, ? super Integer, ? super String, ? super C49291ej0, C13598b0> uVar);

    /* renamed from: Y */
    void mo75721Y(MMActivity mMActivity, C63965x xVar, C32227p<? super Boolean, ? super C51203s61, C13598b0> pVar);

    /* renamed from: Z */
    Object mo75722Z(C64756up2 up22, C15601d<? super C51778w31> dVar);

    /* renamed from: a */
    void mo75723a(long j, long j2, String str, byte[] bArr, int i, C49765hx0 hx02, String str2, int i2, String str3, C89349b bVar, C45343b.C45344a aVar);

    /* renamed from: a0 */
    void mo75724a0(long j, long j2, int i, long j3, int i2, C47826f.C47827a aVar);

    /* renamed from: b */
    void mo75725b(String str, boolean z, int i, C32227p<? super Boolean, ? super Boolean, C13598b0> pVar);

    /* renamed from: b0 */
    void mo75726b0(MMActivity mMActivity, C32227p<? super Boolean, ? super C51316sz0, C13598b0> pVar);

    /* renamed from: c */
    void mo75727c(int i, int i2, C45389s0.C45390a aVar);

    /* renamed from: c0 */
    void mo75728c0(long j, long j2, long j3, String str, C47826f.C47827a aVar);

    /* renamed from: d */
    void mo75729d(long j, C32227p<? super Long, ? super Long, C13598b0> pVar);

    /* renamed from: d0 */
    Object mo75730d0(int i, int i2, C15601d<? super C50863pr0> dVar);

    /* renamed from: e */
    void mo75731e(long j, long j2, String str, byte[] bArr, int i, C49765hx0 hx02, int i2, int i3, C45346d.C45347a aVar);

    /* renamed from: e0 */
    C64414h71 mo75732e0(long j);

    /* renamed from: f */
    void mo75733f(String str, int i, C89349b bVar, C32227p<? super Boolean, ? super C49765hx0, C13598b0> pVar);

    /* renamed from: f0 */
    void mo75734f0(Context context, long j, int i, C32232u<? super Boolean, ? super Integer, ? super Integer, ? super String, ? super C58113g, ? super TRTCCloudDef.TRTCParams, ? super C52005xq0, C13598b0> uVar);

    /* renamed from: g */
    void mo75735g(long j, byte[] bArr, String str, long j2, int i, LinkedList<Integer> linkedList, C45395w.C45396a aVar);

    /* renamed from: g0 */
    void mo75736g0(long j, long j2, String str, byte[] bArr, int i, C49765hx0 hx02, String str2, C45401y.C45402a aVar);

    /* renamed from: h */
    void mo75737h(MMActivity mMActivity, long j, long j2, String str, C50401mh0 mh02, C32228q<? super Boolean, ? super String, ? super C50912q41, C13598b0> qVar);

    /* renamed from: h0 */
    void mo75738h0(Context context, int i);

    /* renamed from: i */
    void mo75739i(MMActivity mMActivity, long j, C32227p<? super Boolean, ? super C52047y01, C13598b0> pVar);

    /* renamed from: i0 */
    void mo75740i0(int i, String str, String str2, int i2, C49765hx0 hx02, C45364h.C45365a aVar);

    /* renamed from: j */
    void mo75741j(long j, long j2, String str, byte[] bArr, int i, C49765hx0 hx02, int i2, String str2, String str3, int i3, C45341a.C45342a aVar);

    /* renamed from: j0 */
    void mo75742j0(String str, C32227p<? super C64707sc1, ? super C50542nh0, C13598b0> pVar);

    /* renamed from: k */
    void mo75743k(long j, long j2, String str, byte[] bArr, int i, List<String> list, C45369j0.C45370a aVar);

    /* renamed from: l */
    void mo75744l(long j, long j2, String str, byte[] bArr, int i, C49765hx0 hx02, String str2, C45384r.C45385a aVar);

    /* renamed from: m */
    void mo75745m(C32229r<? super Integer, ? super Integer, ? super String, ? super C50131kh1, C13598b0> rVar);

    /* renamed from: n */
    void mo75746n(MMActivity mMActivity, long j, long j2, String str, byte[] bArr, String str2, int i, String str3, C32226l<? super Boolean, C13598b0> lVar);

    /* renamed from: o */
    void mo75747o(Context context, int i, int i2);

    /* renamed from: p */
    void mo75748p(int i, C32230s<? super Boolean, ? super Integer, ? super Integer, ? super String, ? super C50262lh0, C13598b0> sVar);

    /* renamed from: q */
    void mo75749q(String str, C32227p<? super Boolean, ? super String, C13598b0> pVar);

    /* renamed from: r */
    void mo75750r(Context context, long j, long j2, String str, int i, int i2, String str2, String str3, int i3, C89349b bVar, List<C12666si.C12667a> list, String str4, String str5, C12360e8.C12371d dVar);

    /* renamed from: s */
    void mo75751s(C0000n0 n0Var, boolean z, C32230s<? super Boolean, ? super Integer, ? super Integer, ? super String, ? super C0079b, C13598b0> sVar);

    /* renamed from: t */
    void mo75752t(Context context, int i);

    /* renamed from: u */
    void mo75753u(MMActivity mMActivity, String str, int i, C32230s<? super Boolean, ? super Integer, ? super Integer, ? super String, ? super C49366f21, C13598b0> sVar);

    /* renamed from: v */
    void mo75754v(long j, long j2, String str, byte[] bArr, int i, C49765hx0 hx02, String str2, C45391t.C45392a aVar);

    /* renamed from: w */
    void mo75755w(long j, long j2, String str, int i, C32227p<? super Boolean, ? super Integer, C13598b0> pVar);

    /* renamed from: x */
    void mo75756x(int i, C32229r<? super Integer, ? super Integer, ? super String, ? super C49585go0, C13598b0> rVar);

    /* renamed from: y */
    void mo75757y(MMActivity mMActivity, LinkedList<String> linkedList, boolean z, C32227p<? super Boolean, ? super C51203s61, C13598b0> pVar);

    /* renamed from: z */
    void mo75758z(long j, long j2, String str, byte[] bArr, String str2);
}
