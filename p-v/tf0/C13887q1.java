package tf0;

import ak1.C54095l;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.widget.ImageView;
import cj1.C54738b1;
import cm1.C0740i2;
import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.view.ratio.RatioLayout;
import di0.C86299o;
import di0.C86300q;
import di3.C7335d;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import gi1.C59463a;
import gr1.C59670o2;
import ht1.C33062n5;
import ht1.C46108j1;
import ht1.C60211v2;
import ht1.C8772i1;
import ht1.C8779k1;
import ht1.C98520u2;
import iq3.C60600b;
import it1.C60625c;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import ob0.C117747y;
import pe3.C89349b;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C48722aj0;
import te3.C48833bb1;
import te3.C49098d51;
import te3.C49255ea1;
import te3.C49396f91;
import te3.C49712hj1;
import te3.C50397mg0;
import te3.C50851pn0;
import te3.C51965xf0;
import te3.C64373fs0;
import te3.C64650q60;
import te3.C64800wf1;
import u60.C65220d;
import wx3.C15601d;

/* renamed from: tf0.q1 */
public interface C13887q1 extends C7335d {

    /* renamed from: tf0.q1$a */
    public static final class C13888a {
        /* renamed from: a */
        public static /* synthetic */ C117747y m13305a(C13887q1 q1Var, String str, String str2, int i, C49712hj1 hj12, String str3, Integer num, Long l, int i2, Object obj) {
            if (obj == null) {
                return q1Var.y30(str, str2, i, hj12, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? -1 : num, (i2 & 64) != 0 ? -1L : l);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createNetSceneAudienceReserveLive");
        }

        /* renamed from: b */
        public static /* synthetic */ C60625c m13306b(C13887q1 q1Var, List list, int i, int i2, int i3, String str, String str2, C64650q60 q602, int i4, int i5, Object obj) {
            int i6 = i5;
            if (obj == null) {
                int i7 = 0;
                int i8 = (i6 & 2) != 0 ? 0 : i;
                int i9 = (i6 & 4) != 0 ? 0 : i2;
                int i15 = (i6 & 8) != 0 ? 0 : i3;
                String str3 = "";
                String str4 = (i6 & 16) != 0 ? str3 : str;
                if ((i6 & 32) == 0) {
                    str3 = str2;
                }
                C64650q60 q603 = (i6 & 64) != 0 ? null : q602;
                if ((i6 & 128) == 0) {
                    i7 = i4;
                }
                return q1Var.mo13305EQ(list, i8, i9, i15, str4, str3, q603, i7);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doCgiFinderBatchGetObjectAsyncLoadInfo");
        }

        /* renamed from: c */
        public static /* synthetic */ int m13307c(C13887q1 q1Var, Context context, C54738b1 b1Var, String str, String str2, Intent intent, boolean z, C32224a aVar, int i, Object obj) {
            if (obj == null) {
                return q1Var.Id0(context, b1Var, (i & 4) != 0 ? "" : str, str2, (i & 16) != 0 ? null : intent, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : aVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goVisitorUIWithCheck");
        }

        /* renamed from: d */
        public static /* synthetic */ void m13308d(C13887q1 q1Var, Context context, Intent intent, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    z = true;
                }
                q1Var.mo13349lV(context, intent, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoReplayUI");
        }

        /* renamed from: e */
        public static /* synthetic */ void m13309e(C13887q1 q1Var, ImageView imageView, String str, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    i = 25;
                }
                q1Var.mo13300B5(imageView, str, i);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setBlurBitmap");
        }
    }

    /* renamed from: B5 */
    void mo13300B5(ImageView imageView, String str, int i);

    /* renamed from: C7 */
    int mo13301C7();

    void Cg0(String str);

    /* renamed from: D0 */
    boolean mo13303D0();

    /* renamed from: EM */
    void mo13304EM(C54095l lVar);

    /* renamed from: EQ */
    C60625c<C50397mg0> mo13305EQ(List<? extends C64800wf1> list, int i, int i2, int i3, String str, String str2, C64650q60 q602, int i4);

    /* renamed from: Eb */
    String mo13306Eb();

    /* renamed from: Fo */
    Object mo13307Fo(long j, long j2, int i, String str, C15601d<? super C49255ea1> dVar);

    /* renamed from: GZ */
    void mo13308GZ();

    String Gc0(long j);

    /* renamed from: Ho */
    void mo13310Ho(Context context, FinderObject finderObject, C49712hj1 hj12);

    int Id0(Context context, C54738b1 b1Var, String str, String str2, Intent intent, boolean z, C32224a<C13598b0> aVar);

    C60211v2 Iv0(int i, RatioLayout ratioLayout, C32226l<? super Boolean, C13598b0> lVar);

    /* renamed from: J */
    int mo13313J();

    /* renamed from: J9 */
    boolean mo13314J9();

    /* renamed from: K5 */
    long mo13315K5();

    /* renamed from: LA */
    LinkedList<C0740i2> mo13316LA(BaseFeedLoader<C0740i2> baseFeedLoader, int i, int i2);

    /* renamed from: LT */
    C60625c<C50397mg0> mo13317LT(List<C13604l<Long, String>> list, int i, int i2, String str, String str2);

    /* renamed from: LX */
    void mo13318LX(LinkedList<C64373fs0> linkedList);

    /* renamed from: Lr */
    void mo13319Lr(Context context, FinderObject finderObject, C49712hj1 hj12, boolean z);

    /* renamed from: MZ */
    void mo13320MZ(int i, int i2, int i3);

    /* renamed from: Mx */
    void mo13321Mx(C72963f4 f4Var);

    /* renamed from: Pi */
    void mo13322Pi(C45795b bVar, C86299o oVar, boolean z);

    /* renamed from: QM */
    void mo13323QM(Context context, C54738b1 b1Var, String str, String str2, Intent intent);

    /* renamed from: QR */
    LiveConfig mo13324QR(FinderObject finderObject, int i, boolean z);

    /* renamed from: QY */
    void mo13325QY(String str, String str2, C49098d51 d512);

    /* renamed from: Qt */
    String mo13326Qt(int i);

    /* renamed from: RX */
    void mo13327RX();

    Class<? extends C59670o2> S40();

    /* renamed from: Sg */
    Object mo13329Sg(String str, String str2, C15601d<? super Boolean> dVar);

    /* renamed from: Tz */
    C60625c<C49396f91> mo13330Tz(C89349b bVar, int i, float f, float f2, C8779k1 k1Var);

    /* renamed from: Ut */
    List<String> mo13331Ut(String str);

    void Ut0(boolean z);

    /* renamed from: W8 */
    C59670o2 mo13333W8(Context context);

    /* renamed from: XI */
    String[] mo13334XI();

    C60625c<Object> Xm0(String str, String str2, C8772i1 i1Var);

    /* renamed from: Y2 */
    boolean mo13336Y2();

    /* renamed from: YF */
    List<C86299o> mo13337YF(C48833bb1 bb12);

    boolean Zh0(long j);

    C60625c<C48722aj0> c90(String str, C49098d51 d512, int i, C49712hj1 hj12);

    /* renamed from: cL */
    String mo13340cL(long j);

    /* renamed from: cR */
    boolean mo13341cR(int i, int i2, BaseFinderFeed baseFinderFeed);

    C65220d gq0(String str, String str2);

    /* renamed from: h4 */
    C49098d51 mo13343h4(String str, String str2);

    void ho0(Point point);

    /* renamed from: i9 */
    C60600b<C59463a> mo13345i9(int i);

    /* renamed from: ib */
    boolean mo13346ib();

    C60625c<C50851pn0> k60(String str, C46108j1 j1Var);

    /* renamed from: kt */
    int mo13348kt();

    /* renamed from: lV */
    void mo13349lV(Context context, Intent intent, boolean z);

    C86300q m70(C45795b bVar, C33062n5 n5Var);

    /* renamed from: n5 */
    C60625c<C51965xf0> mo13351n5(String str, String str2, int i, C49712hj1 hj12, int i2);

    /* renamed from: oU */
    void mo13352oU(long j);

    /* renamed from: oq */
    ArrayList<List<String>> mo13353oq(int i, int i2, boolean z);

    /* renamed from: pC */
    void mo13354pC(long j);

    void pm0(long j);

    /* renamed from: qM */
    void mo13356qM(C49098d51 d512);

    /* renamed from: s2 */
    C98520u2 mo13357s2(Context context);

    /* renamed from: sY */
    void mo13358sY(boolean z);

    /* renamed from: tY */
    Object mo13359tY(long j, String str, long j2, C15601d<? super Boolean> dVar);

    C49098d51 td0(String str);

    int vl0();

    /* renamed from: wc */
    void mo13362wc(LinkedList<C49098d51> linkedList);

    C117747y y30(String str, String str2, int i, C49712hj1 hj12, String str3, Integer num, Long l);

    /* renamed from: y6 */
    void mo13364y6(boolean z, boolean z2);
}
