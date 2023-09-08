package gl0;

import android.graphics.PointF;
import android.graphics.RectF;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83170k;
import com.tencent.p014mm.plugin.appbrand.utils.C84782s1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gl0.C107850a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;
import qr3.C110464a;

/* renamed from: gl0.b */
public class C107856b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C107850a f322970d;

    /* renamed from: e */
    public final /* synthetic */ C81925i2 f322971e;

    /* renamed from: f */
    public final /* synthetic */ int f322972f;

    /* renamed from: g */
    public final /* synthetic */ JSONObject f322973g;

    /* renamed from: h */
    public final /* synthetic */ C87267c f322974h;

    public C107856b(C87267c cVar, C107850a aVar, C81925i2 i2Var, int i, JSONObject jSONObject) {
        this.f322974h = cVar;
        this.f322970d = aVar;
        this.f322971e = i2Var;
        this.f322972f = i;
        this.f322973g = jSONObject;
    }

    public void run() {
        ByteBuffer byteBuffer;
        C107850a.C107853c cVar;
        String str;
        HashMap hashMap;
        String str2;
        C107856b bVar;
        ByteBuffer byteBuffer2;
        String str3;
        JSONObject jSONObject;
        List<PointF[]> list;
        String str4;
        ArrayList arrayList;
        PointF[] pointFArr;
        C107850a.C107853c cVar2 = C107850a.C107853c.ResultOK;
        C107850a.C107853c cVar3 = C107850a.C107853c.ResultFaceDetectedFail;
        HashMap hashMap2 = new HashMap(1);
        String str5 = "errCode";
        if (this.f322970d.f322942a == null) {
            Log.m105920e("MicroMsg.JsApiFaceDetect", "hy: not prepared effect!");
            hashMap2.put(str5, Integer.valueOf(this.f322970d.mo158270a(C107850a.C107853c.ResultInitFail)));
            this.f322971e.mo109647a(this.f322972f, this.f322974h.mo115112m("fail: not started yet", hashMap2));
        } else if (!this.f322973g.has("frameBuffer") || !this.f322973g.has("width") || !this.f322973g.has("height")) {
            Log.m105920e("MicroMsg.JsApiFaceDetect", "hy: not given framebuffer");
            hashMap2.put(str5, Integer.valueOf(this.f322970d.mo158270a(cVar3)));
            this.f322971e.mo109647a(this.f322972f, this.f322974h.mo115112m("fail: not given framebuffer or size", hashMap2));
        } else {
            ByteBuffer byteBuffer3 = (ByteBuffer) this.f322973g.opt("frameBuffer");
            int optInt = this.f322973g.optInt("width");
            int optInt2 = this.f322973g.optInt("height");
            if (byteBuffer3 == null || optInt < 0 || optInt2 < 0) {
                Log.m105920e("MicroMsg.JsApiFaceDetect", "hy: invalid params when detect");
                hashMap2.put(str5, Integer.valueOf(this.f322970d.mo158270a(cVar3)));
                this.f322971e.mo109647a(this.f322972f, this.f322974h.mo115112m("fail: not valid params when detect frame buffer", hashMap2));
                return;
            }
            C107850a aVar = this.f322970d;
            JSONObject jSONObject2 = this.f322973g;
            aVar.getClass();
            HashMap hashMap3 = new HashMap();
            C107850a aVar2 = C107850a.f322941d;
            if (aVar2 == null || aVar2.f322942a == null) {
                cVar = cVar2;
                byteBuffer = byteBuffer3;
                str = "MicroMsg.JsApiFaceDetect";
                str2 = str5;
                hashMap = hashMap3;
                hashMap.put(str2, Integer.valueOf(aVar.mo158270a(C107850a.C107853c.ResultNotInit)));
            } else {
                if (!byteBuffer3.isDirect()) {
                    byteBuffer2 = C84782s1.m104460a(byteBuffer3).order(ByteOrder.nativeOrder());
                    byteBuffer2.position(0);
                } else {
                    byteBuffer2 = byteBuffer3;
                }
                int b = C107850a.f322941d.f322942a.mo154900b(byteBuffer2, optInt, optInt2);
                List<RectF> f = C107850a.f322941d.f322942a.mo154904f();
                if (b == 0) {
                    ArrayList arrayList2 = (ArrayList) f;
                    if (arrayList2.size() > 0) {
                        hashMap3.put(str5, Integer.valueOf(aVar.mo158270a(cVar2)));
                        aVar.f322944c.clear();
                        String str6 = "enablePoint";
                        List<PointF[]> c = jSONObject2.optBoolean(str6) ? C107850a.f322941d.f322942a.mo154901c() : null;
                        String str7 = "enableConf";
                        List<float[]> e = jSONObject2.optBoolean(str7) ? C107850a.f322941d.f322942a.mo154903e() : null;
                        String str8 = "enableAngle";
                        List<C110464a> d = jSONObject2.optBoolean(str8) ? C107850a.f322941d.f322942a.mo154902d() : null;
                        str = "MicroMsg.JsApiFaceDetect";
                        int i = 0;
                        while (true) {
                            cVar = cVar2;
                            if (i >= arrayList2.size()) {
                                byteBuffer = byteBuffer3;
                                str3 = str5;
                                hashMap = hashMap3;
                                jSONObject = jSONObject2;
                                break;
                            }
                            HashMap hashMap4 = hashMap3;
                            C107850a.C107854d dVar = new C107850a.C107854d(aVar, (RectF) arrayList2.get(i));
                            if (!jSONObject2.optBoolean(str6) || Util.isNullOrNil((List) c) || c.size() <= i || (pointFArr = c.get(i)) == null) {
                                str4 = str6;
                                byteBuffer = byteBuffer3;
                                str3 = str5;
                                list = c;
                                arrayList = null;
                            } else {
                                str4 = str6;
                                list = c;
                                ArrayList arrayList3 = new ArrayList(pointFArr.length);
                                int length = pointFArr.length;
                                int i2 = 0;
                                while (i2 < length) {
                                    int i3 = length;
                                    PointF pointF = pointFArr[i2];
                                    PointF[] pointFArr2 = pointFArr;
                                    HashMap hashMap5 = new HashMap(2);
                                    hashMap5.put("x", Float.valueOf(pointF.x));
                                    hashMap5.put("y", Float.valueOf(pointF.y));
                                    arrayList3.add(hashMap5);
                                    i2++;
                                    length = i3;
                                    pointFArr = pointFArr2;
                                    byteBuffer3 = byteBuffer3;
                                    str5 = str5;
                                }
                                byteBuffer = byteBuffer3;
                                str3 = str5;
                                arrayList = arrayList3;
                            }
                            List<C110464a> list2 = d;
                            String str9 = str8;
                            List<float[]> list3 = e;
                            hashMap = hashMap4;
                            String str10 = str7;
                            jSONObject = jSONObject2;
                            HashMap<String, Object> a = new C107850a.C107855e(aVar, ((RectF) arrayList2.get(i)).centerX(), ((RectF) arrayList2.get(i)).centerY(), dVar, arrayList, (!jSONObject2.optBoolean(str7) || Util.isNullOrNil((List) e) || e.size() <= i) ? null : new C107850a.C107852b(aVar, e.get(i)), (!jSONObject2.optBoolean(str8) || Util.isNullOrNil((List) d) || d.size() <= i) ? null : new C107850a.C107851a(aVar, d.get(i))).mo158271a();
                            if (!jSONObject.optBoolean("enableMultiFace")) {
                                hashMap.putAll(a);
                                break;
                            }
                            aVar.f322944c.add(a);
                            i++;
                            jSONObject2 = jSONObject;
                            hashMap3 = hashMap;
                            cVar2 = cVar;
                            str6 = str4;
                            str7 = str10;
                            c = list;
                            d = list2;
                            str8 = str9;
                            byteBuffer3 = byteBuffer;
                            str5 = str3;
                            e = list3;
                        }
                        if (jSONObject.optBoolean("enableMultiFace")) {
                            hashMap.put("faceInfo", aVar.f322944c);
                        }
                        str2 = str3;
                    }
                }
                cVar = cVar2;
                byteBuffer = byteBuffer3;
                str = "MicroMsg.JsApiFaceDetect";
                hashMap = hashMap3;
                C107850a aVar3 = aVar;
                hashMap.putAll(new C107850a.C107855e(aVar3, -1.0f, -1.0f, new C107850a.C107854d(aVar3, -1.0f, -1.0f, 0.0f, 0.0f), (ArrayList<HashMap<String, Float>>) null, (C107850a.C107852b) null, (C107850a.C107851a) null).mo158271a());
                str2 = str5;
                hashMap.put(str2, Integer.valueOf(aVar.mo158270a(cVar3)));
            }
            if (byteBuffer.isDirect()) {
                bVar = this;
                C83170k kVar = (C83170k) bVar.f322971e.getJsRuntime().mo63321n0(C83170k.class);
                if (kVar == null) {
                    Log.m105928w("MicroMsg.NativeBufferUtil", "hy: no buffer addon support");
                } else {
                    kVar.releaseDirectByteBuffer(byteBuffer);
                }
            } else {
                bVar = this;
            }
            if (Objects.equals(hashMap.get(str2), Integer.valueOf(bVar.f322970d.mo158270a(cVar)))) {
                bVar.f322971e.mo109647a(bVar.f322972f, bVar.f322974h.mo115112m("ok", hashMap));
                return;
            }
            Log.m105928w(str, "hy: face detect failed");
            bVar.f322971e.mo109647a(bVar.f322972f, bVar.f322974h.mo115112m("fail: face detect failed", hashMap));
        }
    }
}
