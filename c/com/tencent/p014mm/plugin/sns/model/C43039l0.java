package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiSetAudioState;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import os2.C100398c0;
import os2.C11765l0;
import te3.C51163rv3;
import te3.m84;
import te3.n84;
import te3.o84;

/* renamed from: com.tencent.mm.plugin.sns.model.l0 */
public class C43039l0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f116500d;

    /* renamed from: e */
    public int f116501e;

    /* renamed from: f */
    public String f116502f;

    /* renamed from: g */
    public C11385n f116503g;

    /* renamed from: h */
    public LinkedList<m84> f116504h = null;

    /* renamed from: i */
    public int f116505i;

    public C43039l0(int i) {
        this.f116501e = i;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new n84();
        bVar.f127067b = new o84();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmsnstaglist";
        bVar.f127069d = JsApiSetAudioState.CTRL_INDEX;
        bVar.f127070e = 116;
        bVar.f127071f = 1000000116;
        this.f116500d = bVar.mo72403a();
        String str = C94866e1.Xx0().mo139782Yt("@__weixintsnstag").field_md5;
        str = str == null ? "" : str;
        this.f116502f = str;
        n84 n84 = (n84) this.f116500d.f127055a.f127080a;
        n84.f138483d = i;
        n84.f138484e = str;
    }

    public final int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
        this.f116503g = nVar;
        int dispatch = dispatch(gVar, this.f116500d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
        return JsApiSetAudioState.CTRL_INDEX;
    }

    /* renamed from: j1 */
    public List<String> mo67231j1(long j) {
        SnsMethodCalculate.markStartTimeMs("getTagList", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
        LinkedList linkedList = new LinkedList();
        LinkedList<m84> linkedList2 = this.f116504h;
        if (linkedList2 == null) {
            SnsMethodCalculate.markEndTimeMs("getTagList", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
            return linkedList;
        }
        Iterator<m84> it = linkedList2.iterator();
        while (it.hasNext()) {
            m84 next = it.next();
            if (next.f137907d == j) {
                Iterator<C51163rv3> it4 = next.f137910g.iterator();
                while (it4.hasNext()) {
                    linkedList.add(it4.next().f141175d);
                }
                SnsMethodCalculate.markEndTimeMs("getTagList", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
                return linkedList;
            }
        }
        SnsMethodCalculate.markEndTimeMs("getTagList", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
        return linkedList;
    }

    /* renamed from: k1 */
    public C11765l0 mo67232k1(C11765l0 l0Var, m84 m84) {
        SnsMethodCalculate.markStartTimeMs("tagToInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
        l0Var.field_tagId = m84.f137907d;
        l0Var.field_tagName = Util.nullAs(m84.f137908e, "");
        l0Var.field_count = m84.f137909f;
        l0Var.mo11649l2(m84.f137910g);
        Log.m105918d("MicroMsg.NetSceneSnsTagList", "tagInfo getList: " + m84.toString());
        SnsMethodCalculate.markEndTimeMs("tagToInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
        return l0Var;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        boolean z;
        boolean z2;
        boolean z3;
        List<Long> list;
        boolean z4;
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
        Log.m105918d("MicroMsg.NetSceneSnsTagList", "netId : " + i + " errType :" + i4 + " errCode: " + i5 + " errMsg :" + str2);
        if (i4 == 0 && i5 == 0) {
            o84 o84 = (o84) ((C47350c) uVar).f127056b.f127083a;
            Log.m105919d("MicroMsg.NetSceneSnsTagList", "[onGYNetEnd]State：%s", Integer.valueOf(this.f116505i));
            this.f116505i = o84.f139033h;
            this.f116504h = o84.f139032g;
            String str3 = o84.f139030e;
            if (this.f116502f.equals(str3)) {
                this.f116503g.onSceneEnd(i4, i5, str2, this);
                SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
                return;
            }
            List<Long> Lo = C94866e1.ey0().mo11650Lo();
            if (this.f116501e != 3) {
                Iterator it = ((ArrayList) Lo).iterator();
                while (it.hasNext()) {
                    Long l = (Long) it.next();
                    Iterator<m84> it4 = o84.f139032g.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            list = Lo;
                            z4 = false;
                            break;
                        }
                        list = Lo;
                        if (l.longValue() == it4.next().f137907d) {
                            z4 = true;
                            break;
                        }
                        Lo = list;
                    }
                    if (!z4) {
                        it.remove();
                        C94866e1.ey0().mo11655jo(l.longValue());
                    }
                    Lo = list;
                }
            }
            List<Long> list2 = Lo;
            Iterator<m84> it5 = o84.f139032g.iterator();
            while (it5.hasNext()) {
                m84 next = it5.next();
                Long valueOf = Long.valueOf(next.f137907d);
                SnsMethodCalculate.markStartTimeMs("isListContainId", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
                Iterator it6 = ((ArrayList) list2).iterator();
                while (true) {
                    if (it6.hasNext()) {
                        if (((Long) it6.next()).longValue() == valueOf.longValue()) {
                            SnsMethodCalculate.markEndTimeMs("isListContainId", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
                            z = true;
                            break;
                        }
                    } else {
                        SnsMethodCalculate.markEndTimeMs("isListContainId", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    C11765l0 l0Var = new C11765l0();
                    mo67232k1(l0Var, next);
                    C94866e1.ey0().mo11652SE(l0Var);
                } else {
                    C11765l0 qq = C94866e1.ey0().mo11657qq(next.f137907d);
                    String str4 = qq.field_tagName;
                    if ((str4 == null || str4.equals(next.f137908e)) && qq.field_count == next.f137909f) {
                        SnsMethodCalculate.markStartTimeMs("isMemberListChange", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
                        String[] split = qq.field_memberList.split(",");
                        Iterator<C51163rv3> it7 = next.f137910g.iterator();
                        while (true) {
                            if (!it7.hasNext()) {
                                z2 = false;
                                break;
                            }
                            C51163rv3 next2 = it7.next();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= split.length) {
                                    z3 = false;
                                    break;
                                } else if (split[i6].equals(next2)) {
                                    z3 = true;
                                    break;
                                } else {
                                    i6++;
                                }
                            }
                            if (!z3) {
                                z2 = true;
                                break;
                            }
                        }
                        SnsMethodCalculate.markEndTimeMs("isMemberListChange", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
                        if (!z2) {
                        }
                    }
                    mo67232k1(qq, next);
                    C94866e1.ey0().mo11652SE(qq);
                }
            }
            C100398c0 Yt = C94866e1.Xx0().mo139782Yt("@__weixintsnstag");
            Yt.field_md5 = str3;
            C94866e1.Xx0().mo139775LL(Yt);
            this.f116503g.onSceneEnd(i4, i5, str2, this);
            SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
            return;
        }
        this.f116503g.onSceneEnd(i4, i5, str2, this);
        SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
    }
}
