package com.tencent.p014mm.api;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.api.IEmojiInfo */
public interface IEmojiInfo extends Parcelable {

    /* renamed from: com.tencent.mm.api.IEmojiInfo$a */
    public enum C40005a {
        STATUS_SUCCESS,
        STATUS_MIXING,
        STATUS_MIX_FAIL,
        STATUS_UPLOADING,
        STATUS_UPLOAD_FAIL
    }

    /* renamed from: com.tencent.mm.api.IEmojiInfo$b */
    public enum C40006b {
        ERR_SUCCESS,
        ERR_NON_NETWORK,
        ERR_WIFI_NETWORK,
        ERR_MOBILE_NETWORK,
        ERR_NOT_COMPLETED,
        ERR_OVER_LIMIT,
        ERR_OTHERS,
        ERR_LOCAL_FILE,
        ERR_OVER_SIZE,
        ERR_SPAM,
        ERR_OVER_UPLOAD_TIME
    }

    /* renamed from: A */
    void mo62630A(String str);

    /* renamed from: C */
    String mo62631C();

    /* renamed from: C0 */
    void mo62632C0(int i);

    /* renamed from: C1 */
    boolean mo62633C1();

    /* renamed from: E */
    void mo62634E(String str);

    /* renamed from: F0 */
    String mo62635F0();

    /* renamed from: I */
    void mo62636I(String str);

    /* renamed from: I0 */
    boolean mo62637I0();

    /* renamed from: I1 */
    void mo62638I1(String str);

    /* renamed from: J */
    EmotionStrategyInfo mo62639J();

    /* renamed from: K1 */
    String mo62640K1();

    /* renamed from: L */
    int mo62641L();

    /* renamed from: M0 */
    boolean mo62642M0();

    /* renamed from: P0 */
    void mo62643P0(String str);

    /* renamed from: P1 */
    String mo62644P1();

    /* renamed from: S0 */
    void mo62645S0();

    /* renamed from: T */
    String mo62646T();

    /* renamed from: T1 */
    C40005a mo62647T1();

    /* renamed from: U1 */
    int mo62648U1();

    /* renamed from: V0 */
    void mo62649V0(String str);

    /* renamed from: V1 */
    int mo62650V1();

    /* renamed from: X1 */
    C40006b mo62651X1();

    /* renamed from: Z1 */
    String mo62652Z1();

    /* renamed from: a1 */
    void mo62653a1(String str);

    /* renamed from: b0 */
    int mo62654b0();

    /* renamed from: c0 */
    void mo62655c0(int i);

    /* renamed from: c2 */
    void mo62656c2(int i);

    /* renamed from: d1 */
    Bitmap mo62657d1(Context context, int i);

    /* renamed from: e1 */
    void mo62658e1(String str);

    /* renamed from: e2 */
    void mo62659e2(C40005a aVar);

    /* renamed from: g2 */
    String mo62660g2();

    String getAesKey();

    String getAppid();

    String getContent();

    String getCoverPath();

    int getExtFlag();

    int getGroup();

    String getGroupId();

    int getHeight();

    int getIndex();

    String getMd5();

    String getName();

    int getSize();

    String getThumbUrl();

    int getType();

    int getWidth();

    /* renamed from: i0 */
    String mo62676i0();

    /* renamed from: j2 */
    void mo62677j2(String str);

    /* renamed from: k */
    boolean mo62678k();

    /* renamed from: k0 */
    void mo62679k0(String str, String str2);

    /* renamed from: l */
    String mo62680l();

    /* renamed from: l0 */
    void mo62681l0(int i);

    /* renamed from: l1 */
    void mo62682l1(int i);

    /* renamed from: m1 */
    String mo62683m1();

    /* renamed from: n */
    String mo62684n();

    /* renamed from: o0 */
    String mo62685o0();

    /* renamed from: o1 */
    String mo62686o1();

    /* renamed from: p1 */
    void mo62687p1(int i);

    /* renamed from: q0 */
    long mo62688q0();

    /* renamed from: q1 */
    void mo62689q1(String str);

    /* renamed from: r */
    void mo62690r(int i);

    /* renamed from: s */
    void mo62691s(String str);

    /* renamed from: s0 */
    void mo62692s0(int i);

    /* renamed from: s1 */
    void mo62693s1(int i);

    void setAesKey(String str);

    void setMd5(String str);

    void setType(int i);

    /* renamed from: x0 */
    void mo62697x0(String str);

    /* renamed from: y */
    Bitmap mo62698y(Context context);
}
