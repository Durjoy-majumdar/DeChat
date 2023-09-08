package tf0;

import al1.C0081n;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import cj1.C54738b1;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import di3.C7335d;
import er1.C7777a0;
import fy3.C32224a;
import fy3.C32226l;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;
import rx3.C13598b0;
import te3.C49007cj0;
import te3.C49098d51;
import te3.C49567gj0;
import te3.C49712hj1;
import te3.C49765hx0;
import te3.C50019jp1;
import te3.C51745vv0;
import te3.C51773w21;
import te3.C64273c21;
import te3.C64848y91;
import te3.m74;

/* renamed from: tf0.o1 */
public interface C13883o1 extends C7335d {

    /* renamed from: tf0.o1$a */
    public static final class C13884a {
        /* renamed from: a */
        public static /* synthetic */ void m13249a(C13883o1 o1Var, Context context, long j, String str, C64273c21 c212, C0081n nVar, C49098d51 d512, String str2, LinkedList linkedList, C64848y91 y912, String str3, String str4, LinkedList linkedList2, Intent intent, int i, Object obj) {
            int i2 = i;
            if (obj == null) {
                o1Var.Ee0(context, j, str, (i2 & 8) != 0 ? new C64273c21() : c212, (i2 & 16) != 0 ? null : nVar, (i2 & 32) != 0 ? null : d512, (i2 & 64) != 0 ? null : str2, (i2 & 128) != 0 ? null : linkedList, (i2 & 256) != 0 ? null : y912, (i2 & 512) != 0 ? "" : str3, (i2 & 1024) != 0 ? null : str4, (i2 & 2048) != 0 ? null : linkedList2, (i2 & 4096) != 0 ? null : intent);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enterFinderLiveAnchorUI");
        }

        /* renamed from: b */
        public static /* synthetic */ void m13250b(C13883o1 o1Var, Context context, Intent intent, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    i = 0;
                }
                o1Var.mo13288tj(context, intent, i);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enterFinderLiveNoticeQrCodeUI");
        }

        /* renamed from: c */
        public static /* synthetic */ int m13251c(C13883o1 o1Var, Context context, C54738b1 b1Var, String str, String str2, Intent intent, boolean z, int i, Object obj) {
            if (obj == null) {
                return o1Var.Hg0(context, b1Var, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : intent, (i & 32) != 0 ? false : z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enterFinderLiveVisitorUI");
        }

        /* renamed from: d */
        public static /* synthetic */ void m13252d(C13883o1 o1Var, Intent intent, Context context, long j, long j2, String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, Integer num, int i2, byte[] bArr, FinderObject finderObject, boolean z, int i3, Object obj) {
            int i4 = i3;
            if (obj == null) {
                o1Var.mo13261KH(intent, context, j, j2, str, str2, str3, str4, i, (i4 & 512) != 0 ? null : str5, (i4 & 1024) != 0 ? "" : str6, (i4 & 2048) != 0 ? "" : str7, (i4 & 4096) != 0 ? 1 : num, (i4 & 8192) != 0 ? 0 : i2, (i4 & 16384) != 0 ? null : bArr, (32768 & i4) != 0 ? null : finderObject, (i4 & 65536) != 0 ? false : z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enterFinderLiveVisitorUI");
        }

        /* renamed from: e */
        public static /* synthetic */ void m13253e(C13883o1 o1Var, Context context, Intent intent, m74 m74, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 8) != 0) {
                    i = 11;
                }
                o1Var.mo13291vy(context, intent, m74, i);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enterPoiFeedMapUI");
        }

        /* renamed from: f */
        public static /* synthetic */ void m13254f(C13883o1 o1Var, AppCompatActivity appCompatActivity, FinderItem finderItem, Bundle bundle, int i, C32226l lVar, int i2, Object obj) {
            if (obj == null) {
                o1Var.Ki0(appCompatActivity, finderItem, (i2 & 4) != 0 ? null : bundle, (i2 & 8) != 0 ? 1 : i, (i2 & 16) != 0 ? null : lVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shareToConversation");
        }

        /* renamed from: g */
        public static /* synthetic */ void m13255g(C13883o1 o1Var, AppCompatActivity appCompatActivity, BaseFinderFeed baseFinderFeed, Bundle bundle, int i, int i2, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    bundle = null;
                }
                o1Var.mo13278cd(appCompatActivity, baseFinderFeed, bundle, (i3 & 8) != 0 ? 2 : i, (i3 & 16) != 0 ? 0 : i2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shareToSnsTimeLine");
        }
    }

    /* renamed from: CN */
    void mo13250CN(Activity activity, Intent intent, int i);

    void E50(AppCompatActivity appCompatActivity, BaseFinderFeed baseFinderFeed, Bundle bundle, int i);

    void Ee0(Context context, long j, String str, C64273c21 c212, C0081n nVar, C49098d51 d512, String str2, LinkedList<C64848y91> linkedList, C64848y91 y912, String str3, String str4, LinkedList<C51745vv0> linkedList2, Intent intent);

    void F50(Context context, Intent intent);

    /* renamed from: H9 */
    void mo13254H9(Context context, int i, C51773w21 w212, String str, long j, C49712hj1 hj12, boolean z);

    int Hg0(Context context, C54738b1 b1Var, String str, String str2, Intent intent, boolean z);

    /* renamed from: Hl */
    void mo13256Hl(Activity activity, Intent intent);

    void I00(Context context, Intent intent);

    /* renamed from: Ig */
    void mo13258Ig(Context context, Intent intent);

    /* renamed from: Ix */
    void mo13259Ix(Context context, Intent intent);

    void Jl0(Context context, Intent intent);

    /* renamed from: KH */
    void mo13261KH(Intent intent, Context context, long j, long j2, String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, Integer num, int i2, byte[] bArr, FinderObject finderObject, boolean z);

    void Ki0(AppCompatActivity appCompatActivity, FinderItem finderItem, Bundle bundle, int i, C32226l<? super List<String>, C13598b0> lVar);

    void Mc0(Activity activity, Intent intent, int i);

    /* renamed from: Mw */
    void mo13264Mw(Context context, C49007cj0 cj02, Intent intent, boolean z);

    /* renamed from: OD */
    void mo13265OD(Activity activity, Intent intent, int i);

    void Or0(Context context, String str, C49765hx0 hx02, int i, C32224a<C13598b0> aVar);

    void Rd0(C7777a0 a0Var, String str, String str2, int i, float f, int i2, boolean z);

    void Ro0(Context context, String str, int i);

    /* renamed from: T8 */
    void mo13269T8(Activity activity, int i, String str, String str2, float f, int i2, boolean z);

    /* renamed from: U5 */
    void mo13270U5(Context context, String str, String str2, int i, String str3);

    void Uq0(Intent intent, Context context, long j, long j2, String str, String str2, String str3, String str4, String str5);

    /* renamed from: V1 */
    void mo13272V1(Context context, Intent intent);

    void Wb0(Context context, long j, JSONObject jSONObject);

    /* renamed from: YX */
    void mo13274YX(Activity activity, Intent intent, int i);

    /* renamed from: Z3 */
    void mo13275Z3(Context context, Intent intent);

    /* renamed from: ZK */
    void mo13276ZK(Context context, String str, String str2, String str3, long j, long j2);

    void b30(Activity activity, Intent intent, int i);

    /* renamed from: cd */
    void mo13278cd(AppCompatActivity appCompatActivity, BaseFinderFeed baseFinderFeed, Bundle bundle, int i, int i2);

    /* renamed from: ch */
    void mo13279ch(Context context, Intent intent, int i, String str);

    /* renamed from: eM */
    void mo13280eM(Context context, Intent intent);

    /* renamed from: h6 */
    void mo13281h6(Context context, Intent intent);

    /* renamed from: k4 */
    void mo13282k4(Context context, Intent intent);

    /* renamed from: k9 */
    void mo13283k9(Activity activity, Intent intent, int i, C49567gj0 gj02, Integer num);

    /* renamed from: kI */
    void mo13284kI(Activity activity, int i, String str, String str2, float f, int i2);

    /* renamed from: ny */
    void mo13285ny(Activity activity, Intent intent, int i);

    /* renamed from: s3 */
    void mo13286s3(Activity activity, Intent intent);

    void tb0(Context context, Intent intent);

    /* renamed from: tj */
    void mo13288tj(Context context, Intent intent, int i);

    /* renamed from: tu */
    void mo13289tu(Activity activity, Intent intent, FinderContact finderContact, int i, boolean z, C50019jp1 jp12);

    /* renamed from: v1 */
    void mo13290v1(Activity activity, Intent intent);

    /* renamed from: vy */
    void mo13291vy(Context context, Intent intent, m74 m74, int i);

    void ww0(Context context, Intent intent);

    /* renamed from: xI */
    void mo13293xI(Context context, Intent intent);

    /* renamed from: xt */
    void mo13294xt(Activity activity, Intent intent, int i, boolean z);

    /* renamed from: yB */
    void mo13295yB(Context context, Intent intent, boolean z);

    void za0(Context context, Intent intent);

    /* renamed from: zc */
    void mo13297zc(Context context, Intent intent);

    void zf0(Activity activity, Intent intent, int i);
}
