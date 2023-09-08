package p669qw;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import java.util.Iterator;
import org.json.JSONObject;
import p232rw.C101476o;
import te3.C101781gb0;
import zg2.C103014f;
import zg2.C103020m;
import zg2.C53790e;

@C86522b
/* renamed from: qw.z */
public final class C101309z extends C86301e implements C101476o {
    /* renamed from: Ie */
    public C53790e mo140776Ie(String str) {
        C87412m.m108594g(str, "taskId");
        return C103020m.f303985a.mo142735c(str);
    }

    public Bundle Ip0(String str) {
        C87412m.m108594g(str, "taskId");
        C103014f c = C103020m.f303985a.mo142735c(str);
        if (c == null) {
            return new Bundle();
        }
        String str2 = c.field_userData;
        C87412m.m108593f(str2, "videoEditData.field_userData");
        Bundle bundle = new Bundle();
        if (!(str2.length() == 0)) {
            JSONObject jSONObject = new JSONObject(str2);
            Iterator<String> keys = jSONObject.keys();
            C87412m.m108593f(keys, "jsonObject.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    bundle.putString(next, (String) obj);
                } else if (obj instanceof Integer) {
                    C87412m.m108593f(obj, "value");
                    bundle.putInt(next, ((Number) obj).intValue());
                } else if (obj instanceof Long) {
                    C87412m.m108593f(obj, "value");
                    bundle.putLong(next, ((Number) obj).longValue());
                } else if (obj instanceof Boolean) {
                    C87412m.m108593f(obj, "value");
                    bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Byte) {
                    C87412m.m108593f(obj, "value");
                    bundle.putByte(next, ((Number) obj).byteValue());
                } else if (obj instanceof Character) {
                    C87412m.m108593f(obj, "value");
                    bundle.putChar(next, ((Character) obj).charValue());
                } else if (obj instanceof Float) {
                    C87412m.m108593f(obj, "value");
                    bundle.putFloat(next, ((Number) obj).floatValue());
                } else if (obj instanceof Short) {
                    C87412m.m108593f(obj, "value");
                    bundle.putShort(next, ((Number) obj).shortValue());
                } else if (obj instanceof Double) {
                    C87412m.m108593f(obj, "value");
                    bundle.putDouble(next, ((Number) obj).doubleValue());
                } else {
                    bundle.putString(next, obj.toString());
                }
            }
        }
        return bundle;
    }

    /* renamed from: RL */
    public C101781gb0 mo140778RL(String str) {
        C87412m.m108594g(str, "taskId");
        C103014f c = C103020m.f303985a.mo142735c(str);
        if (c == null) {
            return null;
        }
        C101781gb0 gb02 = new C101781gb0();
        byte[] bArr = c.field_extraConfig;
        if (bArr == null) {
            return null;
        }
        try {
            gb02.parseFrom(bArr);
            return gb02;
        } catch (Exception e) {
            Log.printDebugStack("safeParser", "", e);
            return null;
        }
    }

    /* renamed from: XR */
    public void mo140779XR(String str) {
        C87412m.m108594g(str, "taskId");
        C103020m.f303985a.mo142733a(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void uh0(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "taskId"
            gy3.C87412m.m108594g(r7, r0)
            zg2.m r0 = zg2.C103020m.f303985a
            zg2.g r0 = zg2.C103020m.f303986b
            zg2.f r7 = r0.mo62033jo(r7)
            te3.e70 r0 = new te3.e70
            r0.<init>()
            r1 = 0
            if (r7 == 0) goto L_0x0019
            byte[] r7 = r7.field_baseItemData
            goto L_0x001a
        L_0x0019:
            r7 = r1
        L_0x001a:
            r2 = 1
            r3 = 0
            if (r7 != 0) goto L_0x001f
            goto L_0x0030
        L_0x001f:
            r0.parseFrom(r7)     // Catch:{ Exception -> 0x0023 }
            goto L_0x0031
        L_0x0023:
            r7 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r7
            java.lang.String r7 = "safeParser"
            java.lang.String r4 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r7, r4, r0)
        L_0x0030:
            r0 = r1
        L_0x0031:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r4 = "cleanUnAvailableData, videoPath "
            r7.append(r4)
            r7.append(r0)
            java.lang.String r4 = "?.videoPath"
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = "MicroMsg.mix_background.VideoEditStorageUtil"
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r5, r7, r4)
            if (r0 == 0) goto L_0x0055
            boolean r7 = r0.f298176y
            if (r7 != r2) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r2 = 0
        L_0x0056:
            if (r2 == 0) goto L_0x005d
            java.lang.String r7 = r0.f298158d
            com.tencent.p014mm.vfs.C86013q1.m106447h(r7)
        L_0x005d:
            if (r0 == 0) goto L_0x0062
            java.lang.String r7 = r0.f298161g
            goto L_0x0063
        L_0x0062:
            r7 = r1
        L_0x0063:
            com.tencent.p014mm.vfs.C86013q1.m106447h(r7)
            if (r0 == 0) goto L_0x006b
            java.lang.String r7 = r0.f298164j
            goto L_0x006c
        L_0x006b:
            r7 = r1
        L_0x006c:
            com.tencent.p014mm.vfs.C86013q1.m106447h(r7)
            if (r0 == 0) goto L_0x0073
            java.lang.String r1 = r0.f298163i
        L_0x0073:
            com.tencent.p014mm.vfs.C86013q1.m106447h(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p669qw.C101309z.uh0(java.lang.String):void");
    }
}
