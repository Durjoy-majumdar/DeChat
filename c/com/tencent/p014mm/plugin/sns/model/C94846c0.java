package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.u64;
import te3.v64;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.model.c0 */
public class C94846c0 extends C117747y implements C1311n {

    /* renamed from: j */
    public static Vector<String> f274784j = new Vector<>();

    /* renamed from: d */
    public C47350c f274785d;

    /* renamed from: e */
    public long f274786e = 0;

    /* renamed from: f */
    public final int f274787f;

    /* renamed from: g */
    public ArrayList<SnsInfo> f274788g = new ArrayList<>();

    /* renamed from: h */
    public C11385n f274789h;

    /* renamed from: i */
    public String f274790i = "";

    public C94846c0(long j, String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new u64();
        bVar.f127067b = new v64();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmsnsclassifytimeline";
        bVar.f127069d = 601;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f274785d = a;
        this.f274786e = j;
        this.f274787f = 2;
        u64 u64 = (u64) a.f127055a.f127080a;
        u64.f142631d = "";
        u64.f142632e = j;
        u64.f142633f = str;
        u64.f142634g = 1;
        Log.m105919d("MicroMsg.NetSceneSnsClassifyTimeLine", "maxid %s classifyid %s classifyType %d", C102236a0.m134765q0(j), str, 0);
    }

    /* renamed from: j1 */
    public static synchronized boolean m120211j1(String str) {
        synchronized (C94846c0.class) {
            SnsMethodCalculate.markStartTimeMs("addTimeLineReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
            if (f274784j.contains(str)) {
                SnsMethodCalculate.markEndTimeMs("addTimeLineReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
                return false;
            }
            f274784j.add(str);
            SnsMethodCalculate.markEndTimeMs("addTimeLineReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
            return true;
        }
    }

    /* renamed from: k1 */
    public static synchronized boolean m120212k1(String str) {
        synchronized (C94846c0.class) {
            SnsMethodCalculate.markStartTimeMs("removeTimeLineReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
            f274784j.remove(str);
            SnsMethodCalculate.markEndTimeMs("removeTimeLineReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
        }
        return true;
    }

    public final int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
        this.f274789h = nVar;
        int dispatch = dispatch(gVar, this.f274785d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
        return 601;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
        Log.m105918d("MicroMsg.NetSceneSnsClassifyTimeLine", "netId : " + i + " errType :" + i4 + " errCode: " + i5 + " errMsg :" + str2);
        v64 v64 = (v64) ((C47350c) uVar).f127056b.f127083a;
        if (uVar.getRespObj().getRetCode() == 207 || uVar.getRespObj().getRetCode() == 0 || uVar.getRespObj().getRetCode() == 212) {
            uVar.getRespObj().getRetCode();
            int i6 = v64.f143365g;
            this.f274790i = v64.f143366h;
            C102236a0.m134763p0(this.f274786e);
            int i7 = 0;
            int i8 = 1;
            Log.m105919d("MicroMsg.NetSceneSnsClassifyTimeLine", "resp objCount %d desc %s", Integer.valueOf(v64.f143363e), this.f274790i);
            Iterator<SnsObject> it = v64.f143364f.iterator();
            while (it.hasNext()) {
                SnsObject next = it.next();
                SnsMethodCalculate.markStartTimeMs("objToSnsInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
                SnsInfo snsInfo = new SnsInfo();
                String str3 = new String(next.ObjectDesc.f140574f.mo123703f());
                Object[] objArr = new Object[i8];
                String str4 = "objToSnsInfo";
                objArr[i7] = Long.valueOf(next.f283891Id);
                Log.m105919d("MicroMsg.NetSceneSnsClassifyTimeLine", "from server %d ", objArr);
                if (!snsInfo.setContent(str3)) {
                    snsInfo = null;
                    SnsMethodCalculate.markEndTimeMs(str4, "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
                } else {
                    next.ObjectDesc.mo73350k(new byte[i7]);
                    snsInfo.setUserName(next.Username);
                    snsInfo.setCreateTime(next.CreateTime);
                    snsInfo.setLikeFlag(next.LikeFlag);
                    String str5 = str4;
                    snsInfo.setSnsId(next.f283891Id);
                    snsInfo.setStringSeq(next.f283891Id);
                    snsInfo.addSourceFlag(this.f274787f);
                    try {
                        snsInfo.setAttrBuf(next.toByteArray());
                        i7 = 0;
                    } catch (Exception e) {
                        i7 = 0;
                        Log.printErrStackTrace("MicroMsg.NetSceneSnsClassifyTimeLine", e, "", new Object[0]);
                    }
                    TimeLineObject timeLine = snsInfo.getTimeLine();
                    timeLine.UserName = next.Username;
                    snsInfo.setPravited(timeLine.Privated);
                    Log.m105918d("MicroMsg.NetSceneSnsClassifyTimeLine", "ext flag " + next.ExtFlag);
                    snsInfo.setExtFlag();
                    snsInfo.setTimeLine(timeLine);
                    snsInfo.setTypeFlag(timeLine.ContentObj.f298424e);
                    snsInfo.setSubTypeFlag(timeLine.ContentObj.f298428i);
                    SnsMethodCalculate.markEndTimeMs(str5, "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
                }
                if (snsInfo != null) {
                    this.f274788g.add(snsInfo);
                }
                i8 = 1;
            }
            m120212k1("@__classify_timeline");
            this.f274789h.onSceneEnd(i4, i5, str2, this);
            SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
            return;
        }
        m120212k1("@__classify_timeline");
        this.f274789h.onSceneEnd(i4, i5, str2, this);
        SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
    }
}
