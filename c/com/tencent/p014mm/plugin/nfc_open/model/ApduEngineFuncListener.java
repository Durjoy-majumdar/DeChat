package com.tencent.p014mm.plugin.nfc_open.model;

import android.content.Context;
import android.nfc.tech.IsoDep;
import android.nfc.tech.NfcA;
import android.os.Bundle;
import com.google.android.gms.wearable.WearableStatusCodes;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ApduEngineFuncEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kc2.C46686a;
import lc2.C46846a;
import mc2.C46992a;
import mc2.C46994c;
import nc2.C47222a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.nfc_open.model.ApduEngineFuncListener */
public class ApduEngineFuncListener extends IListener<ApduEngineFuncEvent> {
    public ApduEngineFuncListener() {
        super(C40008f.f107254d);
        this.__eventId = 1620532420;
    }

    public boolean callback(IEvent iEvent) {
        ApduEngineFuncEvent.C40036a aVar;
        String str;
        JSONObject jSONObject;
        String[] strArr;
        ApduEngineFuncEvent apduEngineFuncEvent = (ApduEngineFuncEvent) iEvent;
        int i = 0;
        if (!(apduEngineFuncEvent instanceof ApduEngineFuncEvent) || (aVar = apduEngineFuncEvent.f107356d) == null) {
            return false;
        }
        int i2 = aVar.f107358a;
        Context context = aVar.f107359b;
        if (context == null) {
            context = MMApplicationContext.getContext();
        }
        Bundle bundle = new Bundle();
        if (i2 != 4008) {
            switch (i2) {
                case 4001:
                    bundle.putInt("status", C46992a.m52304c().mo72181d(context));
                    break;
                case 4002:
                    int a = C46992a.m52304c().mo72179a(context);
                    Log.m105925i("MicroMsg.ApduEngineFuncListener", "alvinluo NFC connect status: %d", Integer.valueOf(a));
                    bundle.putInt("status", a);
                    break;
                case WearableStatusCodes.DATA_ITEM_TOO_LARGE /*4003*/:
                    String str2 = apduEngineFuncEvent.f107356d.f107360c;
                    if (!Util.isNullOrNil(str2)) {
                        try {
                            C46686a aVar2 = new C46686a(str2);
                            C46992a c = C46992a.m52304c();
                            c.getClass();
                            C46846a aVar3 = new C46846a(1, "def", aVar2);
                            c.mo72180b(aVar3);
                            bundle.putString("result", aVar3.f126007g.toString());
                            break;
                        } catch (Exception e) {
                            Log.m105920e("MicroMsg.ApduEngineFuncListener", "alex: execute nfc command exception");
                            Log.printErrStackTrace("MicroMsg.ApduEngineFuncListener", e, "", new Object[0]);
                            bundle.putString("result", (String) null);
                            break;
                        }
                    } else {
                        Log.m105920e("MicroMsg.ApduEngineFuncListener", "[NFC] transceive apdu is null");
                        break;
                    }
                case WearableStatusCodes.INVALID_TARGET_NODE /*4004*/:
                    try {
                        ApduEngineFuncEvent.C40036a aVar4 = apduEngineFuncEvent.f107356d;
                        String str3 = aVar4.f107360c;
                        boolean z = aVar4.f107361d;
                        boolean z2 = aVar4.f107362e;
                        if (!Util.isNullOrNil(str3)) {
                            String[] split = str3.split("\\|");
                            ArrayList arrayList = new ArrayList();
                            int length = split.length;
                            int i3 = 0;
                            while (i3 < length) {
                                String str4 = split[i3];
                                if (Util.isNullOrNil(str4)) {
                                    Log.m105928w("MicroMsg.ApduEngineFuncListener", "[NFC] batch transceive apduStr is null");
                                    strArr = split;
                                } else {
                                    String[] split2 = str4.split(XVFSFile.PATH_SEPARATOR);
                                    if (split2 != null) {
                                        if (split2.length >= 2) {
                                            int i4 = Util.getInt(split2[i], i);
                                            strArr = split;
                                            arrayList.add(new C46846a(i4, String.valueOf(i4), new C46686a(split2[1])));
                                        }
                                    }
                                    strArr = split;
                                    Log.m105928w("MicroMsg.ApduEngineFuncListener", "[NFC] transceive apdu's size is wrong");
                                }
                                i3++;
                                split = strArr;
                                i = 0;
                            }
                            C46992a c2 = C46992a.m52304c();
                            c2.getClass();
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    boolean b = c2.mo72180b((C46846a) it.next());
                                    if (b || !z) {
                                        if (!b || !z2) {
                                        }
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            Iterator it4 = arrayList.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    C46846a aVar5 = (C46846a) it4.next();
                                    if (aVar5.f126007g != null) {
                                        sb.append(aVar5.f126004d);
                                        sb.append(XVFSFile.PATH_SEPARATOR);
                                        sb.append(aVar5.f126007g.toString());
                                        sb.append("|");
                                    }
                                }
                            }
                            bundle.putString("result", sb.toString());
                            break;
                        } else {
                            Log.m105920e("MicroMsg.ApduEngineFuncListener", "[NFC] transceive apdu is null");
                            break;
                        }
                    } catch (Exception e2) {
                        Log.m105920e("MicroMsg.ApduEngineFuncListener", "alex: execute nfc command exception");
                        Log.printErrStackTrace("MicroMsg.ApduEngineFuncListener", e2, "", new Object[0]);
                        bundle.putString("result", (String) null);
                        break;
                    }
                    break;
                case WearableStatusCodes.ASSET_UNAVAILABLE /*4005*/:
                    bundle.putString("id", C47222a.m52527a(C46992a.m52304c().f126009b));
                    break;
            }
        } else {
            C46992a c3 = C46992a.m52304c();
            if (c3.f126008a == null) {
                Log.m105928w("MicroMsg.ApduEngine", "lo-nfc-getInfo: tag null");
                str = null;
            } else {
                long nowMilliSecond = Util.nowMilliSecond();
                JSONObject jSONObject2 = new JSONObject();
                Log.m105918d("MicroMsg.ApduEngine", "lo-nfc-getInfo: mTechList = " + ((HashSet) c3.f126349c).size());
                Iterator it5 = ((HashSet) c3.f126349c).iterator();
                while (it5.hasNext()) {
                    String str5 = (String) it5.next();
                    Log.m105918d("MicroMsg.ApduEngine", "lo-nfc-getInfo: tech = " + str5);
                    try {
                        if (str5.equals(NfcA.class.getName())) {
                            jSONObject2.put(NfcA.class.getSimpleName(), C46994c.m52311c(c3.f126008a));
                        } else if (str5.equals(IsoDep.class.getName())) {
                            IsoDep isoDep = IsoDep.get(c3.f126008a);
                            if (isoDep == null) {
                                Log.m105928w("MicroMsg.ApduEngineIsoDep", "lo-nfc-getInfoJsonObject: get IsoDep null");
                                jSONObject = null;
                            } else {
                                jSONObject = new JSONObject();
                                jSONObject.put("hiLayerResponse", C47222a.m52527a(isoDep.getHiLayerResponse()));
                                jSONObject.put("historicalBytes", C47222a.m52527a(isoDep.getHistoricalBytes()));
                            }
                            jSONObject2.put(IsoDep.class.getSimpleName(), jSONObject);
                        }
                    } catch (JSONException e3) {
                        Log.m105928w("MicroMsg.ApduEngine", "lo-nfc-getInfo: exp:+" + e3.getLocalizedMessage());
                        str = jSONObject2.toString();
                    }
                }
                Log.m105926v("MicroMsg.ApduEngine", "lo-nfc-getInfo: cost=" + (Util.nowMilliSecond() - nowMilliSecond));
                Log.m105926v("MicroMsg.ApduEngine", "lo-nfc-getInfo: res=" + jSONObject2.toString());
                str = jSONObject2.toString();
            }
            bundle.putString("info", str);
        }
        apduEngineFuncEvent.f107357e.f107363a = bundle;
        return false;
    }
}
