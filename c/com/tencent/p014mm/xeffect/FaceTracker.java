package com.tencent.p014mm.xeffect;

import android.graphics.PointF;
import android.graphics.RectF;
import gy3.C87412m;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import qr3.C110464a;
import qr3.C110470e;
import qr3.C36070f;
import sx3.C64192l;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H ¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH J\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\u0005H J\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\u0005H J\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\u0005H J\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\u0005H J\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\u0005H J\u0011\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0005H ¨\u0006\u0017"}, mo182094d2 = {"Lcom/tencent/mm/xeffect/FaceTracker;", "", "", "", "modelMap", "", "nInitWithMap", "([Ljava/lang/String;)J", "nPtr", "Ljava/nio/Buffer;", "data", "", "width", "height", "nDetect", "", "nGetAlignments", "nGetFaceRect", "nGetFaceAngles", "nGetFaceRects", "nGetFacePartConf", "Lrx3/b0;", "nDestroy", "renderlib_release"}, mo182095k = 1, mo182096mv = {1, 4, 0})
/* renamed from: com.tencent.mm.xeffect.FaceTracker */
public final class FaceTracker {

    /* renamed from: a */
    public long f319971a;

    static {
        C36070f.m40901a("xlabeffect");
    }

    public FaceTracker(Map<String, String> map) {
        C87412m.m108595h(map, "modelMap");
        this.f319971a = nInitWithMap(C110470e.f330364b.mo161949a(map));
    }

    private final native void nDestroy(long j);

    private final native int nDetect(long j, Buffer buffer, int i, int i2);

    private final native float[] nGetAlignments(long j);

    private final native float[] nGetFaceAngles(long j);

    private final native float[] nGetFacePartConf(long j);

    private final native float[] nGetFaceRect(long j);

    private final native float[] nGetFaceRects(long j);

    private final native long nInitWithMap(String[] strArr);

    /* renamed from: a */
    public final void mo154899a() {
        long j = this.f319971a;
        if (j != 0) {
            nDestroy(j);
        }
    }

    /* renamed from: b */
    public final int mo154900b(Buffer buffer, int i, int i2) {
        C87412m.m108595h(buffer, "data");
        long j = this.f319971a;
        if (j != 0) {
            return nDetect(j, buffer, i, i2);
        }
        return -1;
    }

    /* renamed from: c */
    public final List<PointF[]> mo154901c() {
        ArrayList arrayList = new ArrayList();
        float[] nGetAlignments = nGetAlignments(this.f319971a);
        if (nGetAlignments != null) {
            int length = nGetAlignments.length;
            if (length < 2) {
                XEffectLog.m144538b("FaceTracker", "alignments data no face count", new Object[0]);
            }
            int i = (int) nGetAlignments[0];
            int i2 = (int) nGetAlignments[1];
            if (length != (i * i2 * 2) + 2) {
                XEffectLog.m144538b("FaceTracker", "alignments data size error, face:" + i + ", point:" + i2 + ", float:" + length, new Object[0]);
            }
            for (int i3 = 0; i3 < i; i3++) {
                PointF[] pointFArr = new PointF[i2];
                for (int i4 = 0; i4 < i2; i4++) {
                    pointFArr[i4] = new PointF();
                }
                for (int i5 = 0; i5 < i2; i5++) {
                    PointF pointF = new PointF();
                    pointFArr[i5] = pointF;
                    int i6 = (i3 * i) + (i5 * 2);
                    pointF.x = nGetAlignments[i6 + 2];
                    pointF.y = nGetAlignments[i6 + 3];
                }
                arrayList.add(pointFArr);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final List<C110464a> mo154902d() {
        ArrayList arrayList = new ArrayList();
        float[] nGetFaceAngles = nGetFaceAngles(this.f319971a);
        if (nGetFaceAngles != null) {
            int length = nGetFaceAngles.length;
            if (length % 3 != 0) {
                XEffectLog.m144538b("FaceTracker", "angles data size not match " + length, new Object[0]);
            }
            int i = length / 3;
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * 3;
                arrayList.add(new C110464a(nGetFaceAngles[i3], nGetFaceAngles[i3 + 1], nGetFaceAngles[i3 + 2]));
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public final List<float[]> mo154903e() {
        ArrayList arrayList = new ArrayList();
        float[] nGetFacePartConf = nGetFacePartConf(this.f319971a);
        if (nGetFacePartConf != null) {
            int length = nGetFacePartConf.length;
            if (length < 2) {
                XEffectLog.m144538b("FaceTracker", "part conf data no face count", new Object[0]);
                return arrayList;
            }
            int i = (int) nGetFacePartConf[0];
            int i2 = (int) nGetFacePartConf[1];
            if (length != (i * i2) + 2) {
                XEffectLog.m144538b("FaceTracker", "part conf data size error, face:" + i + ", conf:" + i2 + ", float:" + length, new Object[0]);
                return arrayList;
            }
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = (i3 * i) + 2;
                int i5 = i4 + i2;
                C64192l.m75528a(i5, nGetFacePartConf.length);
                float[] copyOfRange = Arrays.copyOfRange(nGetFacePartConf, i4, i5);
                C87412m.m108593f(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
                arrayList.add(copyOfRange);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public final List<RectF> mo154904f() {
        ArrayList arrayList = new ArrayList();
        float[] nGetFaceRects = nGetFaceRects(this.f319971a);
        if (nGetFaceRects != null) {
            int length = nGetFaceRects.length;
            if (length % 4 != 0) {
                XEffectLog.m144538b("FaceTracker", "rects data size not match " + length, new Object[0]);
            }
            int i = length / 4;
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * 4;
                float f = nGetFaceRects[i3];
                float f2 = nGetFaceRects[i3 + 1];
                arrayList.add(new RectF(f, f2, nGetFaceRects[i3 + 2] + f, nGetFaceRects[i3 + 3] + f2));
            }
        }
        return arrayList;
    }
}
