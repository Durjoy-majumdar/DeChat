package com.tencent.p014mm.plugin.multitask;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import d92.C107028a;
import d92.C45292b;
import di3.C7335d;
import g92.C59398d;
import h92.C108177a;
import k92.C108975c;
import k92.C108976d;
import l92.C109293a;
import l92.C109294b;
import l92.C109299f;
import te3.C101828pe0;
import te3.C110964i13;
import te3.C51173ry;
import te3.C64459j13;
import te3.i25;

/* renamed from: com.tencent.mm.plugin.multitask.k */
public interface C105919k extends C7335d {

    /* renamed from: com.tencent.mm.plugin.multitask.k$a */
    public static final class C105920a {
        /* renamed from: a */
        public static /* synthetic */ void m142391a(C105919k kVar, int i, String str, int i2, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 2) != 0) {
                    str = "";
                }
                if ((i3 & 4) != 0) {
                    i2 = 0;
                }
                kVar.mo151050r5(i, str, i2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendMultiTaskEvent");
        }
    }

    /* renamed from: AF */
    Bitmap mo151029AF(C51173ry ryVar);

    /* renamed from: Bv */
    long mo151030Bv();

    C45292b Cj0(Activity activity);

    /* renamed from: D3 */
    void mo151032D3(String str, int i, C64459j13 j132, Bitmap bitmap, byte[] bArr);

    /* renamed from: H3 */
    void mo151033H3(C109294b bVar);

    /* renamed from: IA */
    void mo151034IA(Bundle bundle, i25 i25);

    /* renamed from: LY */
    String mo151035LY();

    /* renamed from: P */
    String mo151036P(String str, int i, int i2);

    /* renamed from: PA */
    C108177a mo151037PA();

    /* renamed from: Ph */
    void mo151038Ph(C107028a aVar, C109293a aVar2);

    /* renamed from: S5 */
    boolean mo151039S5(MultiTaskInfo multiTaskInfo);

    C108177a W10();

    /* renamed from: Y1 */
    void mo151041Y1();

    /* renamed from: ZS */
    void mo151042ZS(Intent intent, C101828pe0 pe02);

    /* renamed from: b4 */
    Point mo151043b4();

    /* renamed from: bP */
    C59398d mo151044bP(C107028a aVar, C109299f fVar);

    /* renamed from: de */
    void mo151045de(Intent intent, i25 i25);

    /* renamed from: eZ */
    String mo151046eZ(MultiTaskInfo multiTaskInfo);

    /* renamed from: kV */
    void mo151047kV(int i, C110964i13 i132);

    /* renamed from: l0 */
    void mo151048l0(String str, int i, C64459j13 j132, Bitmap bitmap, byte[] bArr, C110964i13 i132);

    void nb0(C107028a aVar, C110964i13 i132, MultiTaskInfo multiTaskInfo);

    /* renamed from: r5 */
    void mo151050r5(int i, String str, int i2);

    C108975c tt0(C107028a aVar, C108976d dVar);

    int us0(String str);

    /* renamed from: y5 */
    void mo151053y5(String str, int i, C64459j13 j132, byte[] bArr);
}
