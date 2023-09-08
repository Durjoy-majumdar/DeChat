package sn2;

import android.bluetooth.BluetoothAdapter;
import android.os.Build;
import cc0.C92411b;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiInstallDownloadTaskForNative;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.plugin.shake.p103ui.ShakeReportUI;
import com.tencent.p014mm.sdk.platformtools.LocationUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import eb0.C97625j3;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import nn2.C21685l;
import nn2.C47288f;
import nn2.C47289g;
import nn2.C76942m;
import ob0.C11385n;
import ob0.C117747y;
import org.json.JSONArray;
import org.json.JSONObject;
import p702ts.C78085c;
import te3.C49285eh2;
import te3.C49706hh2;

/* renamed from: sn2.k */
public class C48438k extends C21685l.C21687b implements C11385n {

    /* renamed from: e */
    public C48435f f129618e;

    /* renamed from: f */
    public Collection<C48443e> f129619f = null;

    /* renamed from: g */
    public C92411b f129620g;

    /* renamed from: h */
    public float f129621h = -85.0f;

    /* renamed from: i */
    public float f129622i = -1000.0f;

    /* renamed from: j */
    public int f129623j = -1000;

    /* renamed from: n */
    public int f129624n = 10001;

    /* renamed from: o */
    public int f129625o = 10002;

    /* renamed from: p */
    public int f129626p = 10003;

    /* renamed from: q */
    public C92411b.C92412a f129627q = new C48439a();

    /* renamed from: sn2.k$a */
    public class C48439a implements C92411b.C92412a {
        public C48439a() {
        }

        public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
            if (!z) {
                return true;
            }
            C48438k kVar = C48438k.this;
            kVar.f129621h = f2;
            kVar.f129622i = f;
            kVar.f129623j = (int) d2;
            return false;
        }
    }

    /* renamed from: sn2.k$b */
    public class C48440b implements Runnable {
        public C48440b() {
        }

        public void run() {
            ((ShakeReportUI) C48438k.this.f61391d).mo24635O7((List<C47288f>) null, 8);
        }
    }

    /* renamed from: sn2.k$c */
    public class C48441c implements Runnable {
        public C48441c() {
        }

        public void run() {
            ((ShakeReportUI) C48438k.this.f61391d).mo24635O7((List<C47288f>) null, 9);
        }
    }

    /* renamed from: sn2.k$d */
    public class C48442d implements Runnable {
        public C48442d() {
        }

        public void run() {
            ((ShakeReportUI) C48438k.this.f61391d).mo24635O7((List<C47288f>) null, 10);
        }
    }

    /* renamed from: sn2.k$e */
    public static final class C48443e {

        /* renamed from: a */
        public String f129632a = null;

        /* renamed from: b */
        public int f129633b = 0;

        /* renamed from: c */
        public int f129634c = 0;

        /* renamed from: d */
        public String f129635d = "";
    }

    public C48438k(C21685l.C21686a aVar) {
        super(aVar);
    }

    /* renamed from: f */
    public static void m53791f(C47288f fVar) {
        if (fVar != null && fVar.field_sex == 3) {
            C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_IBEACON_PUSH_IS_OPEN_BOOLEAN, Boolean.TRUE);
            C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_IBEACON_PUSH_OPEN_TIEMSTAMP_LONG, Long.valueOf(Util.nowSecond()));
            String str = null;
            try {
                str = new String(fVar.field_lvbuffer, "utf-8");
            } catch (UnsupportedEncodingException e) {
                Log.printErrStackTrace("MicroMsg.ShakeIbeaconService", e, "%s", "Unsupported");
            }
            if (str != null) {
                String[] split = str.split(",");
                if (split.length == 4) {
                    C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_IBEACON_PUSH_SHOP_ID_LONG, Long.valueOf(split[0]));
                }
            }
        }
    }

    /* renamed from: a */
    public void mo33950a() {
        mo73109g();
        this.f61391d = null;
        C97625j3.m125815e().mo123470p(JsApiInstallDownloadTaskForNative.CTRL_INDEX, this);
    }

    /* renamed from: b */
    public void mo33951b() {
        C97625j3.m125815e().mo123455a(JsApiInstallDownloadTaskForNative.CTRL_INDEX, this);
        C92411b ms = ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms();
        this.f129620g = ms;
        ms.mo126407a(this.f129627q, true);
        C5139t.m5183e(22, 10);
    }

    /* renamed from: c */
    public void mo33952c() {
        C92411b bVar = this.f129620g;
        if (bVar != null) {
            bVar.mo126408b(this.f129627q);
        }
    }

    /* renamed from: d */
    public void mo33953d() {
        C92411b bVar = this.f129620g;
        if (bVar != null) {
            bVar.mo126407a(this.f129627q, true);
            C5139t.m5183e(22, 10);
        }
    }

    /* renamed from: e */
    public void mo33954e() {
        Log.m105924i("MicroMsg.ShakeIbeaconService", "[oneliang][ShakeIbeaconService][shakezb]:start");
        mo33951b();
        mo73109g();
        if (this.f129620g == null) {
            C92411b ms = ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms();
            this.f129620g = ms;
            ms.mo126407a(this.f129627q, true);
            C5139t.m5183e(22, 10);
        }
        this.f129620g.mo126412f(this.f129627q, true);
        C5139t.m5183e(22, 10);
        String str = Build.VERSION.RELEASE;
        if (str.equals("6.0") || str.equals("6.0.0") || Build.VERSION.SDK_INT < 23 || LocationUtil.isGpsEnable()) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null && defaultAdapter.getState() != 12) {
                new MMHandler().postDelayed(new C48441c(), 1000);
            } else if (defaultAdapter == null) {
                new MMHandler().postDelayed(new C48442d(), 1000);
            } else {
                Object[] objArr = new Object[1];
                Collection<C48443e> collection = this.f129619f;
                objArr[0] = Integer.valueOf(collection != null ? collection.size() : 0);
                Log.m105925i("MicroMsg.ShakeIbeaconService", "[oneliang][ShakeIbeaconService][shakezb]:beaconCollection.size:%d", objArr);
                this.f129618e = new C48435f((String) null, this.f129619f, 1, this.f129621h, this.f129622i, this.f129623j);
                C97625j3.m125815e().mo123460f(this.f129618e);
            }
        } else {
            new MMHandler().postDelayed(new C48440b(), 1000);
        }
    }

    /* renamed from: g */
    public void mo73109g() {
        if (this.f129618e != null) {
            C97625j3.m125815e().mo123458d(this.f129618e);
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2;
        int i3;
        String str3;
        ArrayList arrayList;
        int i4;
        C48438k kVar = this;
        if (kVar.f61391d != null) {
            String str4 = "MicroMsg.ShakeIbeaconService";
            Log.m105925i(str4, "[oneliang][ShakeIbeaconService]onSceneEnd :netId:%s,errType:%s,errCode:%s,errMsg:%s", Integer.valueOf(yVar.getType()), Integer.valueOf(i), Integer.valueOf(i2), str);
            if (i == 0 && i2 == 0) {
                C48435f fVar = (C48435f) yVar;
                if (658 == yVar.getType() && fVar.f129612f == 1) {
                    C49285eh2 eh22 = (C49285eh2) fVar.f129611e.f127056b.f127083a;
                    C49706hh2 hh22 = eh22.f132926d;
                    if (hh22 == null) {
                        ((ShakeReportUI) kVar.f61391d).mo24635O7((List<C47288f>) null, 3);
                        return;
                    }
                    int i5 = hh22.f134655d;
                    if (i5 == 0) {
                        Log.m105925i(str4, "[oneliang][ShakeIbeaconService][shakezb]onSceneEnd :message:%s,tips:%s,result:%s", hh22.f134657f, hh22.f134656e, Integer.valueOf(i5));
                        try {
                            JSONObject jSONObject = new JSONObject(eh22.f132926d.f134657f);
                            JSONArray jSONArray = jSONObject.getJSONArray("msgs");
                            JSONObject jSONObject2 = jSONObject.getJSONObject("guide_switch");
                            int i6 = jSONObject2.getInt("channel_open_method");
                            long j = jSONObject2.getLong("channel_open_time");
                            int i7 = jSONObject2.getInt("shake_tab_display");
                            int i8 = jSONObject.getJSONObject("gated_launch_option").getInt("tab_state");
                            C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_IBEACON_PUSH_CHANNEL_OPEN_METHOD_INT, Integer.valueOf(i6));
                            C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_IBEACON_PUSH_CHANNEL_OPEN_TIME_LONG, Long.valueOf(j));
                            C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_IBEACON_SHAKE_TAB_DISPLAY_INT, Integer.valueOf(i7));
                            C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_IBEACON_SHAKE_TAB_IS_UIN_RESIDENT_INT, Integer.valueOf(i8));
                            Log.m105924i(str4, "[shakezb]channel_open_method is " + i6 + " ,channel_open_time is " + j + ", shake_tab_display is " + i7);
                            int length = jSONArray.length();
                            C47289g zx02 = C76942m.zx0();
                            zx02.mo72323Ow();
                            if (length > 0) {
                                try {
                                    arrayList = new ArrayList();
                                    int i9 = 0;
                                    while (i9 < length) {
                                        C47288f fVar2 = new C47288f();
                                        JSONObject jSONObject3 = jSONArray.getJSONObject(i9);
                                        String string = jSONObject3.getString("url");
                                        String string2 = jSONObject3.getString("content");
                                        String string3 = jSONObject3.getString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                                        String string4 = jSONObject3.getString("picurl");
                                        String string5 = jSONObject3.getString("shopid");
                                        int i15 = length;
                                        JSONObject jSONObject4 = jSONObject3.getJSONObject("beacon");
                                        JSONArray jSONArray2 = jSONArray;
                                        String string6 = jSONObject4.getString("uuid");
                                        str2 = str4;
                                        try {
                                            String string7 = jSONObject4.getString("major");
                                            String string8 = jSONObject4.getString("minor");
                                            int i16 = jSONObject3.getInt("guide_state");
                                            int i17 = i9;
                                            String string9 = jSONObject3.getString("wxa_username");
                                            int i18 = i6;
                                            String string10 = jSONObject3.getString("wxa_path");
                                            C47289g gVar = zx02;
                                            int i19 = jSONObject3.getInt("wxa_version_type");
                                            fVar2.field_type = 11;
                                            fVar2.field_username = string3;
                                            fVar2.field_nickname = string3;
                                            fVar2.field_signature = string2;
                                            fVar2.field_province = string4;
                                            fVar2.field_city = string;
                                            if (i16 == 1) {
                                                fVar2.field_sex = 3;
                                            }
                                            fVar2.field_lvbuffer = (String.valueOf(string5) + "," + String.valueOf(string6) + "," + String.valueOf(string7) + "," + String.valueOf(string8)).getBytes("utf-8");
                                            fVar2.field_insertBatch = 2;
                                            fVar2.field_reserved3 = "" + string9 + "," + string10 + "," + i19;
                                            arrayList.add(fVar2);
                                            C47289g gVar2 = gVar;
                                            gVar2.mo72324Yt(fVar2, true);
                                            if (fVar2.field_sex == 3) {
                                                i4 = i18;
                                                if (i4 == 1) {
                                                    m53791f(fVar2);
                                                }
                                            } else {
                                                i4 = i18;
                                            }
                                            i9 = i17 + 1;
                                            zx02 = gVar2;
                                            i6 = i4;
                                            jSONArray = jSONArray2;
                                            str4 = str2;
                                            length = i15;
                                        } catch (Exception e) {
                                            e = e;
                                            i3 = 1;
                                            kVar = this;
                                            Object[] objArr = new Object[i3];
                                            objArr[0] = Util.nullAsNil(e.getMessage());
                                            Log.m105921e(str2, "[oneliang][ShakeIbeaconService][shakezb] parse error.%s", objArr);
                                            ((ShakeReportUI) kVar.f61391d).mo24635O7((List<C47288f>) null, 1);
                                        }
                                    }
                                    str3 = str4;
                                } catch (Exception e2) {
                                    e = e2;
                                    str2 = str4;
                                    i3 = 1;
                                    kVar = this;
                                    Object[] objArr2 = new Object[i3];
                                    objArr2[0] = Util.nullAsNil(e.getMessage());
                                    Log.m105921e(str2, "[oneliang][ShakeIbeaconService][shakezb] parse error.%s", objArr2);
                                    ((ShakeReportUI) kVar.f61391d).mo24635O7((List<C47288f>) null, 1);
                                }
                            } else {
                                str3 = str4;
                                arrayList = null;
                            }
                            kVar = this;
                            try {
                                ((ShakeReportUI) kVar.f61391d).mo24635O7(arrayList, 1);
                            } catch (Exception e3) {
                                e = e3;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            str3 = str4;
                            i3 = 1;
                            Object[] objArr22 = new Object[i3];
                            objArr22[0] = Util.nullAsNil(e.getMessage());
                            Log.m105921e(str2, "[oneliang][ShakeIbeaconService][shakezb] parse error.%s", objArr22);
                            ((ShakeReportUI) kVar.f61391d).mo24635O7((List<C47288f>) null, 1);
                        }
                    } else if (i5 == kVar.f129624n) {
                        ((ShakeReportUI) kVar.f61391d).mo24635O7((List<C47288f>) null, 6);
                    } else if (i5 == kVar.f129625o) {
                        ((ShakeReportUI) kVar.f61391d).mo24635O7((List<C47288f>) null, 7);
                    } else if (i5 == kVar.f129626p) {
                        ((ShakeReportUI) kVar.f61391d).mo24635O7((List<C47288f>) null, 8);
                    } else {
                        ((ShakeReportUI) kVar.f61391d).mo24635O7((List<C47288f>) null, 1);
                    }
                }
            } else {
                ((ShakeReportUI) kVar.f61391d).mo24635O7((List<C47288f>) null, 3);
            }
        }
    }
}
