package com.tencent.qbar;

import android.graphics.Point;
import android.graphics.PointF;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.qbar.C19931a;
import com.tencent.qbar.QbarNative;
import com.tencent.qbar.WxQbarNative;
import it3.C21134a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p200lx.C21474i0;
import qs3.C36079a;

/* renamed from: com.tencent.qbar.e */
public class C19937e extends C21134a implements C21474i0 {

    /* renamed from: e */
    public int f56889e = 0;

    public C19937e(String str) {
        super(str);
        this.f59752b = new C19936d();
    }

    /* renamed from: a */
    public List<C19931a.C19932a> mo27321a(byte[] bArr, int i, int i2, boolean z, List<QbarNative.QBarPoint> list, List<WxQbarNative.QBarReportMsg> list2) {
        synchronized (this.f59754d) {
            long currentTimeMillis = System.currentTimeMillis();
            int h = ((C19936d) this.f59752b).mo27320h(bArr, i, i2, true, z);
            if (h < 0) {
                Log.m105920e("WxQBarAIDecoder", "scanImage result " + h);
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int c = ((C19936d) this.f59752b).mo27318c(3, arrayList, list, list2, true);
            this.f56889e = ((C19936d) this.f59752b).f56887d;
            Log.m105925i("WxQBarAIDecoder", "decodeGrayData get %d results ,cost %dms, tryHarder:%b", Integer.valueOf(c), Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Boolean.valueOf(z));
            return arrayList;
        }
    }

    /* renamed from: b */
    public void mo27322b() {
        C19936d dVar = (C19936d) this.f59752b;
        if (dVar == null) {
            int i = C36079a.f96165a;
            Log.m105928w("MicroMsg.QBarAIModHelper", "config wxQBar is null");
            return;
        }
        Iterator it = ((ArrayList) C36079a.f96166b).iterator();
        while (it.hasNext()) {
            dVar.f56886c.AddWhiteList((String) it.next(), dVar.f56825a);
        }
        Iterator it4 = ((ArrayList) C36079a.f96167c).iterator();
        while (it4.hasNext()) {
            dVar.f56886c.AddBlackList((String) it4.next(), dVar.f56825a);
        }
        dVar.f56886c.AddBlackInternal(6, dVar.f56825a);
    }

    /* renamed from: i */
    public List<C19931a.C19932a> mo27323i(int[] iArr, Point point, PointF pointF, List<QbarNative.QBarPoint> list, List<WxQbarNative.QBarReportMsg> list2, boolean z) {
        int[] iArr2 = iArr;
        Point point2 = point;
        PointF pointF2 = pointF;
        Log.m105925i("WxQBarAIDecoder", "decodeFile size: %s, useNewInterface: %b", point2, Boolean.valueOf(z));
        long currentTimeMillis = System.currentTimeMillis();
        if (iArr2 == null || iArr2.length <= 0) {
            Log.m105928w("WxQBarAIDecoder", "prepareGrayData , data is null");
            return null;
        }
        int i = point2.x;
        int i2 = point2.y;
        byte[] bArr = new byte[(i * i2)];
        int nativeTransBytes = QbarNative.nativeTransBytes(iArr2, bArr, i, i2);
        if (nativeTransBytes != 0) {
            Log.m105920e("WxQBarAIDecoder", "rotate result " + nativeTransBytes);
            return null;
        }
        int h = ((C19936d) this.f59752b).mo27320h(bArr, point2.x, point2.y, z, false);
        if (h < 0) {
            Log.m105920e("WxQBarAIDecoder", "scanImage result " + h);
            return null;
        }
        if (pointF2 != null) {
            C19936d dVar = (C19936d) this.f59752b;
            dVar.f56886c.SetTouchCoordinate(dVar.f56825a, pointF2.x, pointF2.y);
        }
        ArrayList arrayList = new ArrayList();
        Log.m105924i("WxQBarAIDecoder", String.format("get %d results ,cost %dms", new Object[]{Integer.valueOf(((C19936d) this.f59752b).mo27318c(3, arrayList, list, list2, z)), Long.valueOf(System.currentTimeMillis() - currentTimeMillis)}));
        return arrayList;
    }

    /* renamed from: j */
    public String mo27324j() {
        String GetCallSnapshot;
        synchronized (this.f59754d) {
            C19931a aVar = this.f59752b;
            if (aVar == null) {
                return "";
            }
            C19936d dVar = (C19936d) aVar;
            synchronized (dVar) {
                int i = dVar.f56825a;
                GetCallSnapshot = i < 0 ? null : dVar.f56886c.GetCallSnapshot(i);
            }
            return GetCallSnapshot;
        }
    }

    /* renamed from: k */
    public String mo27325k() {
        String GetDebugString;
        synchronized (this.f59754d) {
            if (this.f59752b == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            C19936d dVar = (C19936d) this.f59752b;
            synchronized (dVar) {
                int i = dVar.f56825a;
                GetDebugString = i < 0 ? null : dVar.f56886c.GetDebugString(i);
            }
            sb.append(GetDebugString);
            sb.append("wait frame: ");
            sb.append(this.f56889e);
            String sb4 = sb.toString();
            return sb4;
        }
    }
}
