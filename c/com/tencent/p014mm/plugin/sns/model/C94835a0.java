package com.tencent.p014mm.plugin.sns.model;

import android.text.TextUtils;
import com.tencent.p014mm.modelimage.C92856r0;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.AdSnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import fm0.C8136w;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import jq2.C99001u;
import lo2.C99569s;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import ps2.C100901x;
import rq2.C101418d;
import sf0.C48374j0;
import te3.C48952c4;
import te3.C51018qv3;
import te3.C51163rv3;
import te3.C52156yq3;
import te3.h64;
import te3.i64;
import te3.j64;
import te3.w64;
import vr2.C102236a0;
import xb0.C102609h;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.sns.model.a0 */
public class C94835a0 extends C117747y implements C1311n {

    /* renamed from: h */
    public static List<Long> f274744h = Collections.synchronizedList(new LinkedList());

    /* renamed from: i */
    public static List<Long> f274745i = Collections.synchronizedList(new LinkedList());

    /* renamed from: d */
    public C47350c f274746d;

    /* renamed from: e */
    public long f274747e;

    /* renamed from: f */
    public C11385n f274748f;

    /* renamed from: g */
    public String f274749g;

    public C94835a0(long j, int i, String str) {
        this.f274747e = j;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new i64();
        bVar.f127067b = new j64();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmsnsadobjectdetail";
        bVar.f127069d = 683;
        StringBuilder sb = new StringBuilder();
        C86709a0.m107528h();
        sb.append(C86709a0.m107535s().f251807e);
        sb.append("ad_detail_session");
        this.f274749g = sb.toString();
        int F = C102236a0.m134711F();
        boolean z = false;
        byte[] O = C86013q1.m106433O(this.f274749g, 0, -1);
        C47350c a = bVar.mo72403a();
        this.f274746d = a;
        C47465a aVar = a.f127055a.f127080a;
        ((i64) aVar).f135129d = j;
        ((i64) aVar).f135131f = C48374j0.m53712a(O);
        C47465a aVar2 = this.f274746d.f127055a.f127080a;
        ((i64) aVar2).f135130e = i;
        ((i64) aVar2).f135134i = F;
        if (str != null && str.length() > 0) {
            ((i64) this.f274746d.f127055a.f127080a).f135133h = C48374j0.m53719h(str, true);
        }
        i64 i64 = (i64) this.f274746d.f127055a.f127080a;
        if (i64 != null) {
            if (C99569s.m129964f()) {
                i64.f135136n = C102609h.m135510UY(6) ? 1 : 0;
                i64.f135137o = C92856r0.m117121g() ? 1 : 0;
            }
            Log.m105924i("MicroMsg.NetSceneSnsAdObjectDetial", "SupportH265 is " + i64.f135136n + ", SupportWebP is " + i64.f135137o);
        }
        C115669n.INSTANCE.mo175911u(1612, 32);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("NetSceneSnsAdObjectDetial, snsId=");
        sb4.append(C102236a0.m134765q0(j));
        sb4.append(", scene=");
        sb4.append(i);
        sb4.append(", buf is null?");
        sb4.append(O == null ? true : z);
        sb4.append(", syncBuf=");
        sb4.append(str);
        Log.m105924i("MicroMsg.NetSceneSnsAdObjectDetial", sb4.toString());
    }

    /* renamed from: j1 */
    public static boolean m120174j1(long j) {
        SnsMethodCalculate.markStartTimeMs("addAtDetailReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        if (f274745i.contains(Long.valueOf(j))) {
            SnsMethodCalculate.markEndTimeMs("addAtDetailReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
            return false;
        }
        f274745i.add(Long.valueOf(j));
        SnsMethodCalculate.markEndTimeMs("addAtDetailReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        return true;
    }

    /* renamed from: k1 */
    public static boolean m120175k1(long j) {
        SnsMethodCalculate.markStartTimeMs("removeAtDetailId", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        f274745i.remove(Long.valueOf(j));
        SnsMethodCalculate.markEndTimeMs("removeAtDetailId", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        return true;
    }

    /* renamed from: l1 */
    public static boolean m120176l1(long j) {
        SnsMethodCalculate.markStartTimeMs("removeDetialId", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        f274744h.remove(Long.valueOf(j));
        SnsMethodCalculate.markEndTimeMs("removeDetialId", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        return true;
    }

    public final int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        this.f274748f = nVar;
        int dispatch = dispatch(gVar, this.f274746d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        return 683;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        boolean z;
        boolean z2;
        C51163rv3 rv32;
        boolean z3;
        C51163rv3 rv33;
        SnsObject snsObject;
        SnsObject snsObject2;
        byte[] d;
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        String q0 = C102236a0.m134765q0(this.f274747e);
        Log.m105924i("MicroMsg.NetSceneSnsAdObjectDetial", "onGYNetEnd, errType " + i4 + " errCode " + i5 + ", snsId=" + q0);
        int i6 = 1;
        int i7 = 0;
        if (i4 == 0 && i5 == 0) {
            z = true;
        } else {
            if (i4 == 4 && i5 == 1 && (d = C48374j0.m53715d(((j64) this.f274746d.f127056b.f127083a).f135903e)) != null) {
                C86013q1.m106447h(this.f274749g);
                C86013q1.m106438T(this.f274749g, d, 0, d.length);
            }
            z = false;
        }
        if (!z) {
            this.f274748f.onSceneEnd(i4, i5, str2, this);
            if (((i64) this.f274746d.f127055a.f127080a).f135130e == 2) {
                C115669n.INSTANCE.mo175911u(C8136w.CTRL_INDEX, 1);
            } else {
                C115669n.INSTANCE.mo175911u(C8136w.CTRL_INDEX, 0);
            }
            m120176l1(this.f274747e);
            m120175k1(this.f274747e);
            C115669n.INSTANCE.mo175911u(1612, 27);
            SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
            return;
        }
        byte[] d2 = C48374j0.m53715d(((j64) this.f274746d.f127056b.f127083a).f135903e);
        if (d2 != null) {
            C86013q1.m106447h(this.f274749g);
            C86013q1.m106438T(this.f274749g, d2, 0, d2.length);
        }
        C47350c cVar = this.f274746d;
        C47465a aVar = cVar.f127056b.f127083a;
        h64 h64 = ((j64) aVar).f135902d;
        C51018qv3 qv32 = ((j64) aVar).f135905g;
        int i8 = ((i64) cVar.f127055a.f127080a).f135130e;
        if (h64 != null) {
            Log.m105924i("MicroMsg.NetSceneSnsAdObjectDetial", "snsdetail scene=" + i8 + ", snsXml=" + C48374j0.m53717f(h64.f134464d.ObjectDesc));
            StringBuilder sb = new StringBuilder();
            sb.append("adxml=");
            sb.append(h64.f134465e);
            Log.m105924i("MicroMsg.NetSceneSnsAdObjectDetial", sb.toString());
            Log.m105924i("MicroMsg.NetSceneSnsAdObjectDetial", "dynamicData=" + C48374j0.m53717f(qv32));
        }
        if (h64 == null || (snsObject2 = h64.f134464d) == null || snsObject2.DeleteFlag <= 0) {
            if (!(h64 == null || (snsObject = h64.f134464d) == null)) {
                LinkedList<w64> linkedList = snsObject.CommentUserList;
                int size = linkedList == null ? 0 : linkedList.size();
                LinkedList<w64> linkedList2 = h64.f134464d.LikeUserList;
                int size2 = linkedList2 == null ? 0 : linkedList2.size();
                Log.m105924i("MicroMsg.NetSceneSnsAdObjectDetial", "detail comment.size=" + size + " liked.size=" + size2 + ", likeFlag=" + h64.f134464d.LikeFlag + ", snsId=" + C102236a0.m134765q0(h64.f134464d.f283891Id));
            }
            if (i8 == 2) {
                Log.m105925i("MicroMsg.NetSceneSnsAdObjectDetial", "get atDetail %s", q0);
                C48952c4 c4Var = ((j64) this.f274746d.f127056b.f127083a).f135906h;
                h64 h642 = null;
                if (c4Var != null) {
                    h642 = c4Var.f131489d;
                }
                synchronized (C94833a.f274740a) {
                    try {
                        boolean z4 = C94833a.m120155h() == 1;
                        Log.m105924i("MicroMsg.NetSceneSnsAdObjectDetial", "atDetail, graySwitch=" + z4);
                        if (!z4 || h642 == null || (rv33 = h642.f134467g) == null || TextUtils.isEmpty(C48374j0.m53718g(rv33))) {
                            z3 = false;
                        } else {
                            z3 = C94833a.m120169v(c4Var);
                            Log.m105924i("MicroMsg.NetSceneSnsAdObjectDetial", "atDetail, isValid=" + z3);
                            if (z3) {
                                C115669n.INSTANCE.mo175911u(1802, 4);
                            } else {
                                C115669n.INSTANCE.mo175911u(1802, 5);
                            }
                        }
                        if (c4Var != null) {
                            if (z4) {
                                i7 = 2;
                            }
                            if (!z4 || z3) {
                                i6 = i7;
                            }
                            String g = C48374j0.m53718g(c4Var.f131490e);
                            Log.m105924i("MicroMsg.NetSceneSnsAdObjectDetial", "recv at adInfoXml=" + g + ", replaceMode=" + i6);
                            C94833a.m120164q(c4Var, i6);
                            AdSnsInfo jo = C94866e1.zx0().mo139864jo(c4Var.f131489d.f134464d.f283891Id);
                            if (jo != null) {
                                ADInfo atAdInfo = jo.getAtAdInfo();
                                if (atAdInfo == null) {
                                    atAdInfo = jo.getAdInfo();
                                }
                                C99001u.m128917c(jo.getTimeLine(), jo.getAdXml(), atAdInfo, 3);
                                Log.m105924i("MicroMsg.NetSceneSnsAdObjectDetial", "preDownloadAdLandingPagesForAtMsg, id=" + q0);
                                String str3 = jo.field_adxml;
                                SnsMethodCalculate.markStartTimeMs("preDownloadAdLandingPagesForAtMsg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
                                if (Util.isNullOrNil(str3)) {
                                    SnsMethodCalculate.markEndTimeMs("preDownloadAdLandingPagesForAtMsg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
                                } else {
                                    ((C119157j) C119157j.f356862d).mo183875f(new C100901x(atAdInfo, str3));
                                    SnsMethodCalculate.markEndTimeMs("preDownloadAdLandingPagesForAtMsg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
                                }
                            }
                        } else {
                            Log.m105920e("MicroMsg.NetSceneSnsAdObjectDetial", "remindObject == null");
                        }
                    } catch (Throwable th) {
                        SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
                        throw th;
                    }
                }
            } else {
                synchronized (C94833a.f274740a) {
                    try {
                        boolean z5 = C94833a.m120155h() == 1;
                        Log.m105924i("MicroMsg.NetSceneSnsAdObjectDetial", "detail, graySwitch=" + z5);
                        String str4 = "";
                        if (!z5 || h64 == null || (rv32 = h64.f134467g) == null || TextUtils.isEmpty(C48374j0.m53718g(rv32))) {
                            z2 = false;
                        } else {
                            str4 = h64.f134467g.f141175d;
                            z2 = C94833a.m120172y(h64);
                            if (z2) {
                                C115669n.INSTANCE.mo175911u(1802, 6);
                            } else {
                                C115669n.INSTANCE.mo175911u(1802, 7);
                            }
                        }
                        if (z5) {
                            i7 = 2;
                        }
                        if (!z5 || z2) {
                            i6 = i7;
                        }
                        Log.m105924i("MicroMsg.NetSceneSnsAdObjectDetial", "detail, isValid=" + z2 + ", replaceMode=" + i6 + ", dynamicAdinfo=" + str4);
                        C94833a.m120167t(h64, qv32, str4, i6);
                    } catch (Throwable th4) {
                        while (true) {
                            SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
                            throw th4;
                        }
                    }
                }
            }
            this.f274748f.onSceneEnd(i4, i5, str2, this);
            m120176l1(this.f274747e);
            m120175k1(this.f274747e);
            SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
            return;
        }
        Log.m105924i("MicroMsg.NetSceneSnsAdObjectDetial", C102236a0.m134765q0(h64.f134464d.f283891Id) + " will remove by get detail ");
        m120176l1(this.f274747e);
        m120175k1(this.f274747e);
        C101418d.m133072b(h64.f134464d.f283891Id);
        this.f274748f.onSceneEnd(i4, i5, str2, this);
        SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
    }

    public C94835a0(long j, int i, C52156yq3 yq32) {
        this(j, i, "");
        ((i64) this.f274746d.f127055a.f127080a).f135135j = yq32;
        if (yq32 == null) {
            Log.m105920e("MicroMsg.NetSceneSnsAdObjectDetial", "NetSceneSnsAdObjectDetial, remindFriendsInfo==null");
            return;
        }
        String str = null;
        C51018qv3 qv32 = yq32.f145469h;
        str = qv32 != null ? C48374j0.m53717f(qv32) : str;
        Log.m105924i("MicroMsg.NetSceneSnsAdObjectDetial", "NetSceneSnsAdObjectDetial, scene=" + i + ", ADGroupId64=" + yq32.f145470i + ", ADGroupId=" + yq32.f145465d + ", extInfo=" + str);
    }
}
