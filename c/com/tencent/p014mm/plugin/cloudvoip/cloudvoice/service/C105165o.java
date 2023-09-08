package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import lu3.C34379c;
import n11.C109669c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.o */
public class C105165o {

    /* renamed from: a */
    public final ArrayList<C109669c> f312278a = new ArrayList<>(10);

    /* renamed from: b */
    public final ArrayList<C109669c> f312279b = new ArrayList<>(10);

    /* renamed from: c */
    public ArrayList<C109669c> f312280c = new ArrayList<>(10);

    /* renamed from: d */
    public long f312281d = 0;

    /* renamed from: e */
    public final ArrayList<C105166a> f312282e = new ArrayList<>(2);

    /* renamed from: f */
    public C34379c<?> f312283f;

    /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.o$a */
    public interface C105166a {
        /* renamed from: a */
        void mo149470a(ArrayList<C109669c> arrayList);
    }

    /* renamed from: a */
    public Map<String, Object> mo149484a() {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        try {
            Iterator<C109669c> it = this.f312279b.iterator();
            while (it.hasNext()) {
                C109669c next = it.next();
                jSONArray.put(next.f328294b);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("openId", next.f328294b);
                jSONObject.put("memberId", next.f328293a);
                jSONObject.put("type", next.f328295c);
                jSONArray2.put(jSONObject);
            }
            hashMap.put("openIdList", jSONArray);
            hashMap.put("data", jSONArray2);
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.OpenVoice.OpenVoiceMemberMgr", e, "", new Object[0]);
        }
        return hashMap;
    }
}
