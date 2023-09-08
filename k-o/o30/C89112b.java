package o30;

import android.text.TextUtils;
import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.Log;
import e40.C86423a;
import f30.C86704a;
import f30.C86705b;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: o30.b */
public abstract class C89112b implements C86705b {
    private static final int ONE_ARG = 1;
    private static final String TAG = "FeatureGroup";
    private String _uid;
    private Object extra;
    private boolean hasBuild = false;

    /* renamed from: a */
    public float[] mo121090a(Map<String, Integer> map) {
        try {
            float[] fArr = new float[map.size()];
            String name = getName();
            JSONObject jSONObject = new JSONObject();
            mo123440c(name, jSONObject);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        fArr[map.get(next + ":arr:" + i).intValue()] = Float.valueOf(String.valueOf(jSONArray.get(i))).floatValue();
                    }
                } else {
                    if (obj instanceof String) {
                        obj = Float.valueOf(C86423a.m107089a((String) obj));
                    }
                    fArr[map.get(next).intValue()] = Float.valueOf(String.valueOf(obj)).floatValue();
                }
            }
            return fArr;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object[] mo121091b(java.lang.Object r13) {
        /*
            r12 = this;
            r0 = 0
            if (r13 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r13 instanceof org.tensorflow.lite.C89289c
            if (r1 != 0) goto L_0x0009
            return r0
        L_0x0009:
            org.tensorflow.lite.c r13 = (org.tensorflow.lite.C89289c) r13
            boolean r1 = r12.hasBuild
            if (r1 != 0) goto L_0x0012
            r12.build()
        L_0x0012:
            int r1 = r13.mo123626c()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = ""
            r12.mo123442e(r3, r2)
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r4 = 0
            r5 = 0
        L_0x0024:
            if (r5 >= r1) goto L_0x00e5
            org.tensorflow.lite.Tensor r6 = r13.mo123625b(r5)
            org.tensorflow.lite.a r7 = r6.f257226b
            java.lang.String r7 = r7.name()
            java.lang.String r8 = "FLOAT"
            boolean r7 = r7.contains(r8)
            if (r7 != 0) goto L_0x0039
            return r0
        L_0x0039:
            int r7 = r6.mo123618i()
            java.lang.String r8 = r6.mo123617h()
            java.lang.Object r8 = r2.get(r8)
            r9 = 1
            if (r8 == 0) goto L_0x004a
            r10 = 1
            goto L_0x004b
        L_0x004a:
            r10 = 0
        L_0x004b:
            if (r8 == 0) goto L_0x0068
            java.lang.Class r11 = r8.getClass()
            boolean r11 = r11.isArray()
            if (r10 == 0) goto L_0x0067
            if (r7 != r9) goto L_0x005b
            if (r11 == 0) goto L_0x0065
        L_0x005b:
            if (r7 <= r9) goto L_0x0067
            if (r11 == 0) goto L_0x0067
            int r10 = java.lang.reflect.Array.getLength(r8)
            if (r7 != r10) goto L_0x0067
        L_0x0065:
            r10 = 1
            goto L_0x0068
        L_0x0067:
            r10 = 0
        L_0x0068:
            r11 = 2
            if (r10 == 0) goto L_0x00bf
            int r6 = r6.mo123618i()
            if (r6 != r9) goto L_0x0088
            float[][] r6 = new float[r9][]
            float[] r7 = new float[r9]
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            float r8 = r8.floatValue()
            r7[r4] = r8
            r6[r4] = r7
            r3[r5] = r6
            goto L_0x00e1
        L_0x0088:
            int[] r6 = new int[r11]
            r6[r9] = r7
            r6[r4] = r9
            java.lang.Class r7 = java.lang.Float.TYPE
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r7, r6)
            float[][] r6 = (float[][]) r6
            boolean r7 = r8 instanceof int[]
            if (r7 == 0) goto L_0x00b8
            int[] r8 = (int[]) r8
            int r7 = r8.length
            float[] r9 = new float[r7]
            r10 = 0
        L_0x00a0:
            if (r10 >= r7) goto L_0x00b5
            r11 = r8[r10]
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            float r11 = r11.floatValue()
            r9[r10] = r11
            int r10 = r10 + 1
            goto L_0x00a0
        L_0x00b5:
            r6[r4] = r9
            goto L_0x00bc
        L_0x00b8:
            float[] r8 = (float[]) r8
            r6[r4] = r8
        L_0x00bc:
            r3[r5] = r6
            goto L_0x00e1
        L_0x00bf:
            int r6 = r6.mo123618i()
            if (r6 != r9) goto L_0x00d1
            float[][] r6 = new float[r9][]
            float[] r7 = new float[r9]
            r8 = 0
            r7[r4] = r8
            r6[r4] = r7
            r3[r5] = r6
            goto L_0x00e1
        L_0x00d1:
            int[] r6 = new int[r11]
            r6[r9] = r7
            r6[r4] = r9
            java.lang.Class r7 = java.lang.Float.TYPE
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r7, r6)
            float[][] r6 = (float[][]) r6
            r3[r5] = r6
        L_0x00e1:
            int r5 = r5 + 1
            goto L_0x0024
        L_0x00e5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o30.C89112b.mo121091b(java.lang.Object):java.lang.Object[]");
    }

    public void build() {
        try {
            for (Field field : getClass().getFields()) {
                Object obj = field.get(this);
                if ((obj instanceof C89112b) && field.isAnnotationPresent(C86704a.class)) {
                    ((C89112b) obj).build();
                }
            }
            this.hasBuild = true;
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    /* renamed from: c */
    public final JSONObject mo123440c(String str, JSONObject jSONObject) {
        String str2;
        if (str.equals(getName())) {
            str2 = getName();
        } else {
            str2 = str + "_" + getName();
        }
        try {
            for (Field field : getClass().getFields()) {
                Object obj = field.get(this);
                if (obj != null) {
                    if (field.isAnnotationPresent(C86704a.class)) {
                        if (obj instanceof C89112b) {
                            ((C89112b) obj).mo123440c(str2, jSONObject);
                        } else if (obj.getClass().isArray()) {
                            JSONArray jSONArray = new JSONArray();
                            for (int i = 0; i < Array.getLength(obj); i++) {
                                jSONArray.put(mo123441d(Array.get(obj, i)));
                            }
                            jSONObject.put(str2 + "_" + field.getName(), jSONArray);
                        } else {
                            jSONObject.put(str2 + "_" + field.getName(), mo123441d(obj));
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: d */
    public final Object mo123441d(Object obj) {
        if (!(obj instanceof Float)) {
            return obj;
        }
        int floatToIntBits = Float.floatToIntBits(((Float) obj).floatValue());
        byte[] bArr = new byte[4];
        for (int i = 0; i < 4; i++) {
            bArr[i] = (byte) (floatToIntBits >> (24 - (i * 8)));
        }
        return Base64.encodeToString(bArr, 2);
    }

    /* renamed from: e */
    public final void mo123442e(String str, Map<String, Object> map) {
        String str2;
        try {
            String name = getName();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            if (TextUtils.isEmpty(name)) {
                str2 = "";
            } else {
                str2 = name + "_";
            }
            sb.append(str2);
            String sb4 = sb.toString();
            for (Field field : getClass().getFields()) {
                Object obj = field.get(this);
                if (obj != null) {
                    if (field.isAnnotationPresent(C86704a.class)) {
                        if (obj instanceof C89112b) {
                            ((C89112b) obj).mo123442e(sb4, map);
                        } else {
                            map.put(sb4 + field.getName(), obj);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    public void mo123443f(Object obj) {
        this.extra = obj;
    }

    /* renamed from: g */
    public void mo123444g(String str) {
        this._uid = str;
    }

    public Object getExtra() {
        return this.extra;
    }

    public String getUid() {
        return this._uid;
    }
}
