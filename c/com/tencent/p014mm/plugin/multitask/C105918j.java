package com.tencent.p014mm.plugin.multitask;

import android.graphics.Bitmap;
import android.graphics.Point;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import di3.C7335d;
import java.util.List;
import l92.C109294b;
import te3.C110964i13;
import te3.C64459j13;

/* renamed from: com.tencent.mm.plugin.multitask.j */
public interface C105918j extends C7335d {
    /* renamed from: B4 */
    boolean mo151015B4();

    /* renamed from: D3 */
    void mo151016D3(String str, int i, C64459j13 j132, Bitmap bitmap, byte[] bArr);

    /* renamed from: H3 */
    void mo151017H3(C109294b bVar);

    /* renamed from: P */
    String mo151018P(String str, int i, int i2);

    /* renamed from: S5 */
    boolean mo151019S5(MultiTaskInfo multiTaskInfo);

    /* renamed from: Ub */
    void mo151020Ub(String str);

    /* renamed from: b4 */
    Point mo151021b4();

    /* renamed from: kF */
    boolean mo151022kF();

    /* renamed from: l0 */
    void mo151023l0(String str, int i, C64459j13 j132, Bitmap bitmap, byte[] bArr, C110964i13 i132);

    MultiTaskInfo nm0(String str);

    /* renamed from: p5 */
    List<MultiTaskInfo> mo151025p5(int i);

    void r40(String str, int i, C64459j13 j132, byte[] bArr, C110964i13 i132);

    /* renamed from: r5 */
    void mo151027r5(int i, String str, int i2);

    /* renamed from: y5 */
    void mo151028y5(String str, int i, C64459j13 j132, byte[] bArr);
}
