package com.tencent.p014mm.plugin.sns.model;

import android.util.Base64;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.modelstat.C92859v;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.AdSnsInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.storage.observer.StorageEventId;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import gv2.C98242p;
import h81.C32735h;
import i40.C60247c;
import iu2.C60631e;
import iu2.C98802d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import jq2.C98993j;
import jq2.C98995n;
import jr2.C99016j;
import lo2.C99554m;
import lo2.C99569s;
import os2.C100417r0;
import ps2.C100897v;
import rd3.C48020a;
import rq2.C101418d;
import sf0.C48374j0;
import te3.C48952c4;
import te3.C50903q2;
import te3.C51018qv3;
import te3.C51163rv3;
import te3.C51573un3;
import te3.C52156yq3;
import te3.bb4;
import te3.cb4;
import te3.g84;
import te3.h64;
import te3.m64;
import te3.n64;
import te3.w64;
import vr2.C102236a0;
import vr2.C102259p;

/* renamed from: com.tencent.mm.plugin.sns.model.a */
public class C94833a {

    /* renamed from: a */
    public static final Object f274740a = new Object();

    /* renamed from: b */
    public static final String f274741b;

    /* renamed from: c */
    public static LinkedHashMap<Long, Integer> f274742c;

    /* renamed from: d */
    public static Comparator<w64> f274743d = new C94834a();

    /* renamed from: com.tencent.mm.plugin.sns.model.a$a */
    public class C94834a implements Comparator<w64> {
        public int compare(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic$1");
            SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic$1");
            int i = ((w64) obj).f299708i - ((w64) obj2).f299708i;
            SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic$1");
            SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic$1");
            return i;
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        C86709a0.m107528h();
        sb.append(C86709a0.m107535s().f251807e);
        sb.append("sns_recvd_ad");
        f274741b = sb.toString();
    }

    /* renamed from: a */
    public static void m120148a(long j) {
        SnsMethodCalculate.markStartTimeMs("addRecvdAd", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (j == 0) {
            SnsMethodCalculate.markEndTimeMs("addRecvdAd", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return;
        }
        if (f274742c == null) {
            m120159l();
        }
        f274742c.put(Long.valueOf(j), 0);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(f274742c);
            objectOutputStream.flush();
            C48020a.m53389f(f274741b, byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            Log.m105920e("MicroMsg.AdSnsInfoStorageLogic", Util.stackTraceToString(e));
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused) {
            }
            SnsMethodCalculate.markEndTimeMs("addRecvdAd", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            throw th;
        }
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused2) {
        }
        SnsMethodCalculate.markEndTimeMs("addRecvdAd", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
    }

    /* renamed from: b */
    public static boolean m120149b(long j, n64 n64, int i, int i2, int i3, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        int i4;
        String str5;
        String str6;
        String str7;
        m64 m64;
        m64 m642;
        String str8;
        int i5;
        long j2 = j;
        n64 n642 = n64;
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        Class cls = C99016j.class;
        SnsMethodCalculate.markStartTimeMs("checkComment", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (n642 == null || (i5 = n642.f298899f.f298777h) == 7 || i5 == 8 || i5 == 16) {
            String s = C75592q0.m90789s();
            if (n642 == null || (m642 = n642.f298900g) == null || (str8 = m642.f298773d) == null || !str8.equals(s)) {
                AdSnsInfo jo = C94866e1.zx0().mo139864jo(j2);
                if (jo == null) {
                    Log.m105925i("MicroMsg.AdSnsInfoStorageLogic", "AdSnsInfo of %s is not exist!", Long.valueOf(j));
                    SnsMethodCalculate.markEndTimeMs("checkComment", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                    return false;
                }
                try {
                    SnsObject snsObject = (SnsObject) new SnsObject().parseFrom(jo.field_attrBuf);
                    snsObject.f283891Id = j2;
                    int i9 = jo.field_firstControlTime;
                    m64 m643 = n642.f298899f;
                    int i15 = m643.f298777h;
                    String str9 = s;
                    String str10 = " actionCommentTimeLimit: ";
                    String str11 = "checkComment";
                    String str12 = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic";
                    if (i15 == 7) {
                        if (i7 > 0) {
                            try {
                                if (i9 + i7 < m643.f298779j) {
                                    if (!z) {
                                        m64 = m643;
                                        str7 = " actionLikeTimeLimit: ";
                                    } else if (C94866e1.Yx0().mo139807TE(jo.getSnsId()) != null) {
                                        ADInfo adInfo = jo.getAdInfo();
                                        if (adInfo != null) {
                                            C99016j jVar = (C99016j) C86312j.m106911c(cls);
                                            int source = jo.getSource();
                                            Object[] objArr = new Object[7];
                                            objArr[0] = Long.valueOf(C100417r0.m131425n(jo.getSnsId()));
                                            objArr[1] = adInfo.viewId;
                                            objArr[2] = 2;
                                            objArr[3] = 1;
                                            LinkedList<w64> linkedList = snsObject.LikeUserList;
                                            objArr[4] = Integer.valueOf(linkedList != null ? linkedList.size() : 0);
                                            LinkedList<w64> linkedList2 = snsObject.CommentUserList;
                                            objArr[5] = Integer.valueOf(linkedList2 != null ? linkedList2.size() : 0);
                                            m64 = m643;
                                            str7 = " actionLikeTimeLimit: ";
                                            objArr[6] = Integer.valueOf((int) (System.currentTimeMillis() / 1000));
                                            jVar.mo55732rh(13182, source, objArr);
                                        } else {
                                            m64 = m643;
                                            str7 = " actionLikeTimeLimit: ";
                                            Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the adinfo is null!");
                                        }
                                    } else {
                                        m64 = m643;
                                        str7 = " actionLikeTimeLimit: ";
                                        Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the snsInfo is null!");
                                    }
                                    Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "snsid " + j2 + " firstCreateTime " + i9 + str7 + i7 + " curAction.createTime: " + m64.f298779j + "is over the time limit!");
                                    SnsMethodCalculate.markEndTimeMs(str11, str12);
                                    return false;
                                }
                            } catch (Exception e) {
                                e = e;
                                str = str11;
                                str2 = str12;
                                Log.printErrStackTrace("MicroMsg.AdSnsInfoStorageLogic", e, "", new Object[0]);
                                SnsMethodCalculate.markEndTimeMs(str, str2);
                                return true;
                            }
                        }
                        str5 = str10;
                        str3 = " actionLikeTimeLimit: ";
                        str4 = " firstCreateTime ";
                        str = str11;
                        str2 = str12;
                        i4 = i3;
                    } else {
                        m64 m644 = m643;
                        str3 = " actionLikeTimeLimit: ";
                        str = str11;
                        String str13 = str12;
                        String str14 = " firstCreateTime ";
                        if (i15 == 8 || i15 == 16) {
                            i4 = i3;
                            str4 = str14;
                            if (i4 > 0) {
                                str12 = str13;
                                try {
                                    if (i9 + i4 < m644.f298779j) {
                                        if (z) {
                                            if (C94866e1.Yx0().mo139807TE(jo.getSnsId()) != null) {
                                                ADInfo adInfo2 = jo.getAdInfo();
                                                if (adInfo2 != null) {
                                                    C99016j jVar2 = (C99016j) C86312j.m106911c(cls);
                                                    int source2 = jo.getSource();
                                                    Object[] objArr2 = new Object[7];
                                                    objArr2[0] = Long.valueOf(C100417r0.m131425n(jo.getSnsId()));
                                                    objArr2[1] = adInfo2.viewId;
                                                    objArr2[2] = 2;
                                                    objArr2[3] = 2;
                                                    LinkedList<w64> linkedList3 = snsObject.LikeUserList;
                                                    objArr2[4] = Integer.valueOf(linkedList3 != null ? linkedList3.size() : 0);
                                                    LinkedList<w64> linkedList4 = snsObject.CommentUserList;
                                                    objArr2[5] = Integer.valueOf(linkedList4 != null ? linkedList4.size() : 0);
                                                    objArr2[6] = Integer.valueOf((int) (System.currentTimeMillis() / 1000));
                                                    jVar2.mo55732rh(13182, source2, objArr2);
                                                } else {
                                                    Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the adinfo is null!");
                                                }
                                            } else {
                                                Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the snsInfo is null!");
                                            }
                                        }
                                        Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "snsid " + j2 + str4 + i9 + str10 + i4 + " curAction.createTime: " + m644.f298779j + "is over the time limit!");
                                        SnsMethodCalculate.markEndTimeMs(str, str12);
                                        return false;
                                    }
                                    str5 = str10;
                                    str2 = str12;
                                } catch (Exception e2) {
                                    e = e2;
                                    str2 = str12;
                                    Log.printErrStackTrace("MicroMsg.AdSnsInfoStorageLogic", e, "", new Object[0]);
                                    SnsMethodCalculate.markEndTimeMs(str, str2);
                                    return true;
                                }
                            } else {
                                str5 = str10;
                                str2 = str13;
                            }
                        } else {
                            str5 = str10;
                            i4 = i3;
                            str2 = str13;
                            str4 = str14;
                        }
                    }
                    try {
                        Iterator<w64> it = snsObject.LikeUserList.iterator();
                        int i16 = 0;
                        while (it.hasNext()) {
                            w64 next = it.next();
                            if (next.f299708i > i9) {
                                String str15 = next.f299703d;
                                str6 = str9;
                                if (str15 == null || !str15.equals(str6)) {
                                    i16++;
                                }
                            } else {
                                str6 = str9;
                            }
                            str9 = str6;
                        }
                        String str16 = str9;
                        int i17 = i16 + 0;
                        Iterator<w64> it4 = snsObject.CommentUserList.iterator();
                        int i18 = 0;
                        while (it4.hasNext()) {
                            Iterator<w64> it5 = it4;
                            w64 next2 = it4.next();
                            str12 = str2;
                            if (next2.f299708i > i9) {
                                String str17 = next2.f299703d;
                                if (str17 == null || !str17.equals(str16)) {
                                    i18++;
                                }
                            }
                            it4 = it5;
                            str2 = str12;
                        }
                        String str18 = str2;
                        int i19 = i17 + i18;
                        StringBuilder sb = new StringBuilder();
                        sb.append("totalsize ");
                        sb.append(i19);
                        sb.append(str4);
                        sb.append(i9);
                        sb.append(" actionLimit: ");
                        int i25 = i;
                        sb.append(i25);
                        sb.append(str3);
                        sb.append(i2);
                        sb.append(str5);
                        sb.append(i4);
                        Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", sb.toString());
                        if (i19 >= i25) {
                            if (z) {
                                SnsInfo TE = C94866e1.Yx0().mo139807TE(jo.getSnsId());
                                if (TE != null) {
                                    ADInfo adInfo3 = TE.getAdInfo();
                                    if (adInfo3 != null) {
                                        C99016j jVar3 = (C99016j) C86312j.m106911c(cls);
                                        int source3 = jo.getSource();
                                        Object[] objArr3 = new Object[7];
                                        objArr3[0] = Long.valueOf(C100417r0.m131425n(jo.getSnsId()));
                                        objArr3[1] = adInfo3.viewId;
                                        objArr3[2] = 1;
                                        objArr3[3] = 2;
                                        LinkedList<w64> linkedList5 = snsObject.LikeUserList;
                                        objArr3[4] = Integer.valueOf(linkedList5 != null ? linkedList5.size() : 0);
                                        LinkedList<w64> linkedList6 = snsObject.CommentUserList;
                                        objArr3[5] = Integer.valueOf(linkedList6 != null ? linkedList6.size() : 0);
                                        objArr3[6] = Integer.valueOf((int) (System.currentTimeMillis() / 1000));
                                        jVar3.mo55732rh(13182, source3, objArr3);
                                    } else {
                                        Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the adinfo is null!");
                                    }
                                } else {
                                    Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the snsInfo is null!");
                                }
                            }
                            SnsMethodCalculate.markEndTimeMs(str, str18);
                            return false;
                        }
                        str2 = str18;
                        SnsMethodCalculate.markEndTimeMs(str, str2);
                        return true;
                    } catch (Exception e3) {
                        e = e3;
                        Log.printErrStackTrace("MicroMsg.AdSnsInfoStorageLogic", e, "", new Object[0]);
                        SnsMethodCalculate.markEndTimeMs(str, str2);
                        return true;
                    }
                } catch (Exception e4) {
                    e = e4;
                    str = "checkComment";
                    str2 = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic";
                    Log.printErrStackTrace("MicroMsg.AdSnsInfoStorageLogic", e, "", new Object[0]);
                    SnsMethodCalculate.markEndTimeMs(str, str2);
                    return true;
                }
            } else {
                SnsMethodCalculate.markEndTimeMs("checkComment", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                return true;
            }
        } else {
            SnsMethodCalculate.markEndTimeMs("checkComment", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return false;
        }
    }

    /* renamed from: c */
    public static C48952c4 m120150c(C51573un3 un32) {
        SnsMethodCalculate.markStartTimeMs("convert", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (un32 != null) {
            C48952c4 c4Var = new C48952c4();
            C51163rv3 rv32 = un32.f142967e;
            c4Var.f131490e = rv32;
            if (rv32 == null) {
                Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "recObject.RecommendInfo is null");
                SnsMethodCalculate.markEndTimeMs("convert", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                return null;
            }
            c4Var.f131489d = m120151d(un32.f142966d);
            SnsMethodCalculate.markEndTimeMs("convert", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return c4Var;
        }
        SnsMethodCalculate.markEndTimeMs("convert", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        return null;
    }

    /* renamed from: d */
    public static h64 m120151d(g84 g84) {
        SnsMethodCalculate.markStartTimeMs("convert", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (g84 != null) {
            h64 h64 = new h64();
            C51163rv3 rv32 = g84.f133931e;
            h64.f134465e = rv32;
            if (rv32 == null) {
                Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "recommendObj.RecommendXml is null");
            }
            h64.f134464d = g84.f133930d;
            SnsMethodCalculate.markEndTimeMs("convert", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return h64;
        }
        SnsMethodCalculate.markEndTimeMs("convert", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        return null;
    }

    /* renamed from: e */
    public static LinkedList<C48952c4> m120152e(LinkedList<C51573un3> linkedList) {
        SnsMethodCalculate.markStartTimeMs("convertRecObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        LinkedList<C48952c4> linkedList2 = new LinkedList<>();
        Iterator<C51573un3> it = linkedList.iterator();
        while (it.hasNext()) {
            C48952c4 c = m120150c(it.next());
            if (c != null) {
                linkedList2.add(c);
            }
        }
        SnsMethodCalculate.markEndTimeMs("convertRecObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        return linkedList2;
    }

    /* renamed from: f */
    public static void m120153f(long j, int i) {
        SnsMethodCalculate.markStartTimeMs("deleteAdWithNoCheck", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        try {
            String q0 = C102236a0.m134765q0(j);
            AdSnsInfo jo = C94866e1.zx0().mo139864jo(j);
            if (jo == null) {
                Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "deleteAdWithNoCheck, adSnsInfo is null, snsId=" + q0);
                SnsMethodCalculate.markEndTimeMs("deleteAdWithNoCheck", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                return;
            }
            Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "deleteAdWithNoCheck, snsId=" + q0);
            try {
                C102259p.m134829b(i, j, jo.getAdInfo(), jo.getAdXml());
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.AdSnsInfoStorageLogic", "reportAdDelException: " + th.toString());
            }
            C101418d.m133073c(jo);
            SnsMethodCalculate.markEndTimeMs("deleteAdWithNoCheck", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        } catch (Exception e) {
            Log.m105920e("MicroMsg.AdSnsInfoStorageLogic", "deleteAdWithNoCheck, snsId=" + C102236a0.m134765q0(j) + ", exp=" + e.toString());
            SnsMethodCalculate.markEndTimeMs("deleteAdWithNoCheck", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        }
    }

    /* renamed from: g */
    public static int m120154g(SnsObject snsObject) {
        SnsMethodCalculate.markStartTimeMs("getCreateTime", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        SnsInfo SE = C94866e1.Yx0().mo139806SE(snsObject.f283891Id);
        int i = SE == null ? snsObject.CreateTime : SE.field_createTime;
        SnsMethodCalculate.markEndTimeMs("getCreateTime", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        return i;
    }

    /* renamed from: h */
    public static int m120155h() {
        SnsMethodCalculate.markStartTimeMs("getDynamicGraySwitch", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        int i = 1;
        try {
            i = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_timeline_dynamic_snsobject_enable_android, 1);
            Log.m105918d("MicroMsg.AdSnsInfoStorageLogic", "getDynamicGraySwitch called " + i);
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.AdSnsInfoStorageLogic", "getDynamicGraySwitch, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("getDynamicGraySwitch", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        return i;
    }

    /* renamed from: i */
    public static void m120156i(List<C48952c4> list, List<SnsObject> list2, boolean z, int i) {
        int i2;
        int i3;
        List<C48952c4> list3 = list;
        List<SnsObject> list4 = list2;
        SnsMethodCalculate.markStartTimeMs("insert", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (WeChatBrands.Business.Entries.MomentAds.banned()) {
            Log.m105928w("MicroMsg.AdSnsInfoStorageLogic", "insert, forbid ad");
            SnsMethodCalculate.markEndTimeMs("insert", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        } else if (list3 == null || list4 == null || list2.size() == 0) {
            SnsMethodCalculate.markEndTimeMs("insert", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        } else {
            int g = m120154g(list4.get(list2.size() - 1));
            StringBuilder sb = new StringBuilder();
            sb.append("adList[");
            int i4 = 0;
            boolean z2 = false;
            while (i4 < list.size()) {
                C48952c4 c4Var = list3.get(i4);
                if (c4Var == null) {
                    Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "ad is null");
                } else {
                    h64 h64 = c4Var.f131489d;
                    if (h64 == null) {
                        Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "item.SnsADObject is null");
                    } else if (h64.f134464d == null) {
                        Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "item.SnsADObject.SnsObject is null");
                    } else {
                        String g2 = C48374j0.m53718g(c4Var.f131490e);
                        String g3 = C48374j0.m53718g(c4Var.f131489d.f134465e);
                        String f = C48374j0.m53717f(c4Var.f131489d.f134464d.ObjectDesc);
                        ADInfo aDInfo = new ADInfo(g2);
                        Log.m105925i("MicroMsg.AdSnsInfoStorageLogic", "insert ad, skXml %s, adXml %s, snsXml %s", g2, g3, f);
                        C99569s.m129965g(aDInfo.adIPv4Url);
                        String q0 = C102236a0.m134765q0(c4Var.f131489d.f134464d.f283891Id);
                        try {
                            sb.append(q0);
                            sb.append(",");
                            sb.append(aDInfo.ad_sns_pos);
                            sb.append("|");
                        } catch (Exception e) {
                            Log.m105920e("MicroMsg.AdSnsInfoStorageLogic", "log exp=" + e.toString());
                        }
                        int i5 = g + 1;
                        if (aDInfo.ad_sns_pos >= list2.size() || (i3 = aDInfo.ad_sns_pos) < 0) {
                            Log.m105928w("MicroMsg.AdSnsInfoStorageLogic", "insert ad, invalid ad.pos " + aDInfo.ad_sns_pos);
                        } else {
                            i5 = m120154g(list4.get(i3)) + 1;
                            Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "insert ad, create adinfo time  " + i5 + " pos " + aDInfo.ad_sns_pos);
                        }
                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                        Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "insert ad, gettime " + currentTimeMillis);
                        m120162o(c4Var, i5, currentTimeMillis);
                        AdSnsInfo jo = C94866e1.zx0().mo139864jo(c4Var.f131489d.f134464d.f283891Id);
                        if (jo != null) {
                            Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "insert ad, snsId=" + q0 + ", exposureTime=" + jo.field_exposureTime + ", , expouseCnt=" + jo.field_exposureCount + ", isExposued=" + jo.isExposured() + ", adDupSnsIdDel=" + aDInfo.adDupSnsIdDel);
                            if (aDInfo.adDupSnsIdDel == 1) {
                                C99554m.m129937b(jo);
                            }
                            C50903q2 remindInfoGroup = jo.getRemindInfoGroup();
                            if (remindInfoGroup == null) {
                                remindInfoGroup = new C50903q2();
                            }
                            C52156yq3 yq32 = c4Var.f131492g;
                            remindInfoGroup.f140095d = yq32;
                            if (yq32 != null) {
                                i2 = g;
                                Log.m105925i("MicroMsg.AdSnsInfoStorageLogic", "insert ad, update timeline remind info , aid64:%d, aid:%d", Long.valueOf(yq32.f145470i), Integer.valueOf(remindInfoGroup.f140095d.f145465d));
                            } else {
                                i2 = g;
                            }
                            jo.setRemindInfoGroup(remindInfoGroup);
                            jo.setLocalVisible();
                            C94866e1.zx0().replace(jo);
                            SnsInfo convertToSnsInfo = jo.convertToSnsInfo();
                            if (C98993j.m128899a(convertToSnsInfo)) {
                                C94866e1.hy0().mo131026l(convertToSnsInfo);
                                z2 = true;
                            }
                        } else {
                            i2 = g;
                        }
                        m120168u(c4Var.f131489d.f134464d.f283891Id, aDInfo);
                        try {
                            String q05 = C102236a0.m134765q0(c4Var.f131489d.f134464d.f283891Id);
                            if (!C98995n.m128906b(aDInfo, q05)) {
                                try {
                                    C98995n.m128907c(1, q05, aDInfo, c4Var.f131489d.f134464d);
                                } catch (Throwable th) {
                                    th = th;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            Log.m105920e("MicroMsg.AdSnsInfoStorageLogic", th.toString());
                            i4++;
                            list3 = list;
                            g = i2;
                        }
                        i4++;
                        list3 = list;
                        g = i2;
                    }
                }
                i2 = g;
                i4++;
                list3 = list;
                g = i2;
            }
            if (z2) {
                Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "the on line video preload start in AdSnsInfoStorageLogic ");
                C94866e1.hy0().mo131035u();
            }
            try {
                sb.append("], objList[");
                for (int i6 = 0; i6 < list2.size(); i6++) {
                    sb.append(C102236a0.m134765q0(list4.get(i6).f283891Id));
                    sb.append(",");
                }
                sb.append("]");
                sb.append(", isFp:");
                sb.append(z);
                sb.append(", pullType:");
                sb.append(i);
                Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "insert ad, " + sb.toString());
            } catch (Exception e2) {
                Log.m105920e("MicroMsg.AdSnsInfoStorageLogic", "log exp=" + e2.toString());
            }
            SnsMethodCalculate.markEndTimeMs("insert", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        }
    }

    /* renamed from: j */
    public static void m120157j(LinkedList<C51573un3> linkedList, LinkedList<SnsObject> linkedList2) {
        int i;
        LinkedList<SnsObject> linkedList3 = linkedList2;
        SnsMethodCalculate.markStartTimeMs("insertRec", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (linkedList != null) {
            LinkedList<C48952c4> e = m120152e(linkedList);
            Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "convert " + e.size() + " recObj to AdvertiseObj");
            Iterator<C48952c4> it = e.iterator();
            while (it.hasNext()) {
                C48952c4 next = it.next();
                if (m120158k(next.f131489d.f134464d.f283891Id)) {
                    Log.m105928w("MicroMsg.AdSnsInfoStorageLogic", "ignore recvd ad filter by snsId " + next.f131489d.f134464d.f283891Id);
                    it.remove();
                }
            }
            SnsMethodCalculate.markStartTimeMs("insertTestAD", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            if (linkedList3 == null || linkedList2.size() == 0) {
                SnsMethodCalculate.markEndTimeMs("insertTestAD", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            } else {
                int g = m120154g(linkedList3.get(linkedList2.size() - 1));
                for (int i2 = 0; i2 < e.size(); i2++) {
                    C48952c4 c4Var = e.get(i2);
                    if (c4Var == null) {
                        Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "ad is null");
                    } else {
                        h64 h64 = c4Var.f131489d;
                        if (h64 == null) {
                            Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "item.SnsADObject is null");
                        } else if (h64.f134464d == null) {
                            Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "item.SnsADObject.SnsObject is null");
                        } else {
                            String g2 = C48374j0.m53718g(c4Var.f131490e);
                            String g3 = C48374j0.m53718g(c4Var.f131489d.f134465e);
                            String f = C48374j0.m53717f(c4Var.f131489d.f134464d.ObjectDesc);
                            ADInfo aDInfo = new ADInfo(g2);
                            Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "skXml " + g2);
                            Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "adXml " + g3);
                            Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "snsXml " + f + APLogFileUtil.SEPARATOR_LINE);
                            ADXml aDXml = new ADXml(g3);
                            long j = aDXml.originSnsId;
                            if (j == 0 || !m120158k(j)) {
                                int i3 = g + 1;
                                if (aDInfo.ad_sns_pos >= linkedList2.size() || (i = aDInfo.ad_sns_pos) < 0) {
                                    Log.m105928w("MicroMsg.AdSnsInfoStorageLogic", "invalid ad.pos " + aDInfo.ad_sns_pos);
                                } else {
                                    i3 = m120154g(linkedList3.get(i)) + 1;
                                    Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "create adinfo time  " + i3 + " pos " + aDInfo.ad_sns_pos);
                                }
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "gettime " + currentTimeMillis);
                                m120162o(c4Var, i3, currentTimeMillis);
                                m120148a(c4Var.f131489d.f134464d.f283891Id);
                                m120148a(aDXml.originSnsId);
                                m120168u(c4Var.f131489d.f134464d.f283891Id, aDInfo);
                            } else {
                                Log.m105928w("MicroMsg.AdSnsInfoStorageLogic", "ignore recvd ad filter by originSnsId " + aDXml.originSnsId);
                            }
                        }
                    }
                }
                SnsMethodCalculate.markEndTimeMs("insertTestAD", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            }
        }
        SnsMethodCalculate.markEndTimeMs("insertRec", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
    }

    /* renamed from: k */
    public static boolean m120158k(long j) {
        SnsMethodCalculate.markStartTimeMs("isRecvdAd", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        m120159l();
        boolean z = f274742c.get(Long.valueOf(j)) != null;
        SnsMethodCalculate.markEndTimeMs("isRecvdAd", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        if (r5 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0061, code lost:
        if (r5 != null) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0056 A[Catch:{ StreamCorruptedException -> 0x0057, IOException -> 0x004a, ClassNotFoundException -> 0x003a, all -> 0x0038, all -> 0x002f }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0066 A[SYNTHETIC, Splitter:B:36:0x0066] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x003d=Splitter:B:20:0x003d, B:27:0x004d=Splitter:B:27:0x004d} */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m120159l() {
        /*
            java.lang.String r0 = "MicroMsg.AdSnsInfoStorageLogic"
            java.lang.String r1 = "loadRecvdAd"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.util.LinkedHashMap<java.lang.Long, java.lang.Integer> r3 = f274742c
            if (r3 != 0) goto L_0x008e
            java.lang.String r3 = f274741b
            byte[] r3 = rd3.C48020a.m53387d(r3)
            if (r3 == 0) goto L_0x006d
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
            r4.<init>(r3)
            r3 = 0
            java.io.ObjectInputStream r5 = new java.io.ObjectInputStream     // Catch:{ StreamCorruptedException -> 0x0057, IOException -> 0x004a, ClassNotFoundException -> 0x003a, all -> 0x0038 }
            r5.<init>(r4)     // Catch:{ StreamCorruptedException -> 0x0057, IOException -> 0x004a, ClassNotFoundException -> 0x003a, all -> 0x0038 }
            java.lang.Object r3 = r5.readObject()     // Catch:{ StreamCorruptedException -> 0x0036, IOException -> 0x0034, ClassNotFoundException -> 0x0032 }
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3     // Catch:{ StreamCorruptedException -> 0x0036, IOException -> 0x0034, ClassNotFoundException -> 0x0032 }
            f274742c = r3     // Catch:{ StreamCorruptedException -> 0x0036, IOException -> 0x0034, ClassNotFoundException -> 0x0032 }
            r5.close()     // Catch:{ IOException -> 0x002d }
            goto L_0x006d
        L_0x002d:
            goto L_0x006d
        L_0x002f:
            r0 = move-exception
            r3 = r5
            goto L_0x0064
        L_0x0032:
            r3 = move-exception
            goto L_0x003d
        L_0x0034:
            r3 = move-exception
            goto L_0x004d
        L_0x0036:
            r3 = move-exception
            goto L_0x005a
        L_0x0038:
            r0 = move-exception
            goto L_0x0064
        L_0x003a:
            r4 = move-exception
            r5 = r3
            r3 = r4
        L_0x003d:
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r3)     // Catch:{ all -> 0x002f }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)     // Catch:{ all -> 0x002f }
            if (r5 == 0) goto L_0x006d
        L_0x0046:
            r5.close()     // Catch:{ IOException -> 0x002d }
            goto L_0x006d
        L_0x004a:
            r4 = move-exception
            r5 = r3
            r3 = r4
        L_0x004d:
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r3)     // Catch:{ all -> 0x002f }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)     // Catch:{ all -> 0x002f }
            if (r5 == 0) goto L_0x006d
            goto L_0x0046
        L_0x0057:
            r4 = move-exception
            r5 = r3
            r3 = r4
        L_0x005a:
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r3)     // Catch:{ all -> 0x002f }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)     // Catch:{ all -> 0x002f }
            if (r5 == 0) goto L_0x006d
            goto L_0x0046
        L_0x0064:
            if (r3 == 0) goto L_0x0069
            r3.close()     // Catch:{ IOException -> 0x0069 }
        L_0x0069:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            throw r0
        L_0x006d:
            java.util.LinkedHashMap<java.lang.Long, java.lang.Integer> r0 = f274742c
            if (r0 != 0) goto L_0x008e
            java.lang.String r0 = "instanceRecvdAd"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r2)
            com.tencent.mm.plugin.sns.model.b r3 = new com.tencent.mm.plugin.sns.model.b
            r4 = 4649075278012743680(0x4084d55560000000, double:666.6666870117188)
            double r4 = java.lang.Math.ceil(r4)
            int r4 = (int) r4
            int r4 = r4 + 1
            r5 = 1061158912(0x3f400000, float:0.75)
            r3.<init>(r4, r5)
            f274742c = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
        L_0x008e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94833a.m120159l():void");
    }

    /* renamed from: m */
    public static void m120160m(LinkedList<C51573un3> linkedList) {
        SnsMethodCalculate.markStartTimeMs("preDownloadAdLandingPagesRec", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (linkedList != null && !linkedList.isEmpty()) {
            LinkedList<C48952c4> e = m120152e(linkedList);
            Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "convert " + e.size() + " recObj to AdvertiseObj");
            C100897v.m132252a(e, true);
        }
        SnsMethodCalculate.markEndTimeMs("preDownloadAdLandingPagesRec", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
    }

    /* JADX WARNING: Removed duplicated region for block: B:127:0x02f1 A[Catch:{ Exception -> 0x03f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0454 A[Catch:{ all -> 0x0476 }] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x02bb A[EDGE_INSN: B:206:0x02bb->B:203:0x02bb ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009a  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.p014mm.plugin.sns.storage.AdSnsInfo m120161n(te3.h64 r19, int r20) {
        /*
            r0 = r19
            r1 = r20
            java.lang.Class<f62.k0> r2 = f62.C75700k0.class
            java.lang.String r3 = ""
            java.lang.String r4 = "replace"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            os2.j r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.zx0()
            com.tencent.mm.protocal.protobuf.SnsObject r7 = r0.f134464d
            long r7 = r7.f283891Id
            com.tencent.mm.plugin.sns.storage.AdSnsInfo r6 = r6.mo139864jo(r7)
            com.tencent.mm.protocal.protobuf.SnsObject r7 = r0.f134464d
            r8 = 0
            if (r6 != 0) goto L_0x0028
            com.tencent.mm.plugin.sns.storage.AdSnsInfo r6 = new com.tencent.mm.plugin.sns.storage.AdSnsInfo
            r6.<init>()
            r9 = r8
            goto L_0x002e
        L_0x0028:
            com.tencent.mm.protocal.protobuf.TimeLineObject r9 = r6.getTimeLine()
            java.lang.String r9 = r9.statExtStr
        L_0x002e:
            te3.qv3 r10 = r7.ObjectDesc
            java.lang.String r11 = "updateObjectDescForAdSnsInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r5)
            r12 = 2
            r13 = 1
            r14 = 0
            if (r1 != 0) goto L_0x0046
            boolean r10 = m120171x(r6, r10)
            if (r10 == 0) goto L_0x006c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r5)
        L_0x0044:
            r10 = 1
            goto L_0x0070
        L_0x0046:
            if (r1 != r13) goto L_0x0059
            byte[] r15 = r6.field_content
            if (r15 == 0) goto L_0x004f
            int r15 = r15.length
            if (r15 > 0) goto L_0x006c
        L_0x004f:
            boolean r10 = m120171x(r6, r10)
            if (r10 == 0) goto L_0x006c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r5)
            goto L_0x0044
        L_0x0059:
            if (r1 != r12) goto L_0x006c
            boolean r10 = m120171x(r6, r10)
            if (r10 == 0) goto L_0x006c
            byte[] r10 = r6.field_content
            if (r10 == 0) goto L_0x0068
            int r10 = r10.length
            if (r10 > 0) goto L_0x006c
        L_0x0068:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r5)
            goto L_0x0044
        L_0x006c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r5)
            r10 = 0
        L_0x0070:
            java.lang.String r11 = "MicroMsg.AdSnsInfoStorageLogic"
            if (r10 == 0) goto L_0x009a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "updateObjectDesc failed called with: adObj = ["
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = "], replaceDynamicMode = ["
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "]"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            return r8
        L_0x009a:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r8 != 0) goto L_0x00a9
            com.tencent.mm.protocal.protobuf.TimeLineObject r8 = r6.getTimeLine()
            r8.statExtStr = r9
            r6.setTimeLine(r8)
        L_0x00a9:
            te3.qv3 r8 = r7.ObjectOperations
            byte[] r9 = r6.field_attrBuf
            te3.qv3 r8 = com.tencent.p014mm.plugin.sns.model.C94897n1.m120373k(r8, r9)
            r7.ObjectOperations = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "replace, snsId="
            r8.append(r9)
            long r9 = r7.f283891Id
            java.lang.String r9 = vr2.C102236a0.m134765q0(r9)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r8)
            te3.qv3 r8 = r7.ObjectDesc
            byte[] r9 = new byte[r14]
            r8.mo73350k(r9)
            java.lang.String r8 = r7.Username
            r6.field_userName = r8
            if (r1 == 0) goto L_0x00f4
            if (r1 != r12) goto L_0x00de
            goto L_0x00f4
        L_0x00de:
            if (r1 != r13) goto L_0x00f7
            java.lang.String[] r1 = new java.lang.String[r12]
            java.lang.String r8 = r6.field_recxml
            r1[r14] = r8
            java.lang.String r8 = r6.field_adxml
            r1[r13] = r8
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String[]) r1)
            if (r1 == 0) goto L_0x00f7
            m120170w(r0, r6)
            goto L_0x00f7
        L_0x00f4:
            m120170w(r0, r6)
        L_0x00f7:
            int r0 = r7.LikeFlag
            r6.field_likeFlag = r0
            long r0 = r7.f283891Id
            r6.setSnsId(r0)
            r6.addSourceFlag(r12)
            r0 = 32
            r6.addSourceFlag(r0)
            byte[] r0 = r6.field_attrBuf     // Catch:{ Exception -> 0x03f6 }
            if (r0 != 0) goto L_0x0112
            com.tencent.mm.protocal.protobuf.SnsObject r0 = new com.tencent.mm.protocal.protobuf.SnsObject     // Catch:{ Exception -> 0x03f6 }
            r0.<init>()     // Catch:{ Exception -> 0x03f6 }
            goto L_0x011f
        L_0x0112:
            com.tencent.mm.protocal.protobuf.SnsObject r0 = new com.tencent.mm.protocal.protobuf.SnsObject     // Catch:{ Exception -> 0x03f6 }
            r0.<init>()     // Catch:{ Exception -> 0x03f6 }
            byte[] r1 = r6.field_attrBuf     // Catch:{ Exception -> 0x03f6 }
            pe3.a r0 = r0.parseFrom(r1)     // Catch:{ Exception -> 0x03f6 }
            com.tencent.mm.protocal.protobuf.SnsObject r0 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r0     // Catch:{ Exception -> 0x03f6 }
        L_0x011f:
            java.util.LinkedList<te3.w64> r1 = r7.CommentUserList     // Catch:{ Exception -> 0x03f6 }
            if (r1 != 0) goto L_0x0125
            r1 = 0
            goto L_0x0129
        L_0x0125:
            int r1 = r1.size()     // Catch:{ Exception -> 0x03f6 }
        L_0x0129:
            if (r0 == 0) goto L_0x025b
            java.util.LinkedList<te3.w64> r8 = r0.CommentUserList     // Catch:{ Exception -> 0x03f6 }
            if (r8 == 0) goto L_0x025b
            int r8 = r8.size()     // Catch:{ Exception -> 0x03f6 }
            java.util.LinkedList r9 = new java.util.LinkedList     // Catch:{ Exception -> 0x03f6 }
            r9.<init>()     // Catch:{ Exception -> 0x03f6 }
            java.util.LinkedList<te3.w64> r10 = r7.CommentUserList     // Catch:{ Exception -> 0x03f6 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ Exception -> 0x03f6 }
        L_0x013e:
            boolean r12 = r10.hasNext()     // Catch:{ Exception -> 0x03f6 }
            if (r12 == 0) goto L_0x01a0
            java.lang.Object r12 = r10.next()     // Catch:{ Exception -> 0x03f6 }
            te3.w64 r12 = (te3.w64) r12     // Catch:{ Exception -> 0x03f6 }
            int r15 = r12.f299715s     // Catch:{ Exception -> 0x03f6 }
            if (r15 <= 0) goto L_0x0195
            r9.add(r12)     // Catch:{ Exception -> 0x03f6 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03f6 }
            r15.<init>()     // Catch:{ Exception -> 0x03f6 }
            java.lang.String r13 = "commentItem has DeleteFlag"
            r15.append(r13)     // Catch:{ Exception -> 0x03f6 }
            java.lang.String r13 = r12.f299703d     // Catch:{ Exception -> 0x03f6 }
            r15.append(r13)     // Catch:{ Exception -> 0x03f6 }
            java.lang.String r13 = r15.toString()     // Catch:{ Exception -> 0x03f6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r13)     // Catch:{ Exception -> 0x03f6 }
            java.util.LinkedList<te3.w64> r13 = r0.CommentUserList     // Catch:{ Exception -> 0x03f6 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ Exception -> 0x03f6 }
        L_0x016d:
            boolean r15 = r13.hasNext()     // Catch:{ Exception -> 0x03f6 }
            if (r15 == 0) goto L_0x0195
            java.lang.Object r15 = r13.next()     // Catch:{ Exception -> 0x03f6 }
            te3.w64 r15 = (te3.w64) r15     // Catch:{ Exception -> 0x03f6 }
            r17 = r3
            r16 = r4
            long r3 = r15.f299714r     // Catch:{ Exception -> 0x03f4 }
            r19 = r15
            long r14 = r12.f299714r     // Catch:{ Exception -> 0x03f4 }
            int r18 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r18 != 0) goto L_0x018f
            java.util.LinkedList<te3.w64> r3 = r0.CommentUserList     // Catch:{ Exception -> 0x03f4 }
            r15 = r19
            r3.remove(r15)     // Catch:{ Exception -> 0x03f4 }
            goto L_0x0199
        L_0x018f:
            r4 = r16
            r3 = r17
            r14 = 0
            goto L_0x016d
        L_0x0195:
            r17 = r3
            r16 = r4
        L_0x0199:
            r4 = r16
            r3 = r17
            r13 = 1
            r14 = 0
            goto L_0x013e
        L_0x01a0:
            r17 = r3
            r16 = r4
            java.util.Iterator r3 = r9.iterator()     // Catch:{ Exception -> 0x03f4 }
        L_0x01a8:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x03f4 }
            if (r4 == 0) goto L_0x01ba
            java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x03f4 }
            te3.w64 r4 = (te3.w64) r4     // Catch:{ Exception -> 0x03f4 }
            java.util.LinkedList<te3.w64> r10 = r7.CommentUserList     // Catch:{ Exception -> 0x03f4 }
            r10.remove(r4)     // Catch:{ Exception -> 0x03f4 }
            goto L_0x01a8
        L_0x01ba:
            r9.clear()     // Catch:{ Exception -> 0x03f4 }
            java.util.LinkedList<te3.w64> r3 = r0.CommentUserList     // Catch:{ Exception -> 0x03f4 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x03f4 }
        L_0x01c3:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x03f4 }
            if (r4 == 0) goto L_0x0259
            java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x03f4 }
            te3.w64 r4 = (te3.w64) r4     // Catch:{ Exception -> 0x03f4 }
            java.util.LinkedList<te3.w64> r9 = r7.CommentUserList     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r10 = "isInComment"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r5)     // Catch:{ Exception -> 0x03f4 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ Exception -> 0x03f4 }
        L_0x01db:
            boolean r12 = r9.hasNext()     // Catch:{ Exception -> 0x03f4 }
            if (r12 == 0) goto L_0x0201
            java.lang.Object r12 = r9.next()     // Catch:{ Exception -> 0x03f4 }
            te3.w64 r12 = (te3.w64) r12     // Catch:{ Exception -> 0x03f4 }
            long r13 = r4.f299714r     // Catch:{ Exception -> 0x03f4 }
            r15 = r8
            r18 = r9
            long r8 = r12.f299714r     // Catch:{ Exception -> 0x03f4 }
            int r12 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r12 != 0) goto L_0x01fd
            r12 = 0
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x01fd
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r5)     // Catch:{ Exception -> 0x03f4 }
            r8 = 1
            goto L_0x0206
        L_0x01fd:
            r8 = r15
            r9 = r18
            goto L_0x01db
        L_0x0201:
            r15 = r8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r5)     // Catch:{ Exception -> 0x03f4 }
            r8 = 0
        L_0x0206:
            if (r8 != 0) goto L_0x0256
            long r8 = r4.f299714r     // Catch:{ Exception -> 0x03f4 }
            r12 = 0
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r10 == 0) goto L_0x0256
            f40.C86709a0.m107528h()     // Catch:{ Exception -> 0x03f4 }
            k40.a r8 = f40.C86709a0.m107533q(r2)     // Catch:{ Exception -> 0x03f4 }
            f62.k0 r8 = (f62.C75700k0) r8     // Catch:{ Exception -> 0x03f4 }
            com.tencent.mm.storage.u3 r8 = r8.mo96097Ni()     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r9 = r4.f299703d     // Catch:{ Exception -> 0x03f4 }
            com.tencent.mm.storage.z1 r8 = r8.get(r9)     // Catch:{ Exception -> 0x03f4 }
            if (r8 == 0) goto L_0x023f
            boolean r9 = r8.mo62927s3()     // Catch:{ Exception -> 0x03f4 }
            if (r9 == 0) goto L_0x023f
            boolean r8 = r8.mo62920o3()     // Catch:{ Exception -> 0x03f4 }
            if (r8 != 0) goto L_0x023f
            java.util.LinkedList<te3.w64> r8 = r7.CommentUserList     // Catch:{ Exception -> 0x03f4 }
            r8.add(r4)     // Catch:{ Exception -> 0x03f4 }
            java.util.LinkedList<te3.w64> r4 = r7.CommentUserList     // Catch:{ Exception -> 0x03f4 }
            int r4 = r4.size()     // Catch:{ Exception -> 0x03f4 }
            r7.CommentUserListCount = r4     // Catch:{ Exception -> 0x03f4 }
            goto L_0x0256
        L_0x023f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03f4 }
            r8.<init>()     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r9 = "not in commentlist not mycontact "
            r8.append(r9)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r4 = r4.f299703d     // Catch:{ Exception -> 0x03f4 }
            r8.append(r4)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r4 = r8.toString()     // Catch:{ Exception -> 0x03f4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r4)     // Catch:{ Exception -> 0x03f4 }
        L_0x0256:
            r8 = r15
            goto L_0x01c3
        L_0x0259:
            r15 = r8
            goto L_0x0260
        L_0x025b:
            r17 = r3
            r16 = r4
            r8 = 0
        L_0x0260:
            java.util.LinkedList<te3.w64> r3 = r7.CommentUserList     // Catch:{ Exception -> 0x03f4 }
            java.util.Comparator<te3.w64> r4 = f274743d     // Catch:{ Exception -> 0x03f4 }
            java.util.Collections.sort(r3, r4)     // Catch:{ Exception -> 0x03f4 }
            java.util.LinkedList<te3.w64> r3 = r7.CommentUserList     // Catch:{ Exception -> 0x03f4 }
            if (r3 != 0) goto L_0x026d
            r3 = 0
            goto L_0x0271
        L_0x026d:
            int r3 = r3.size()     // Catch:{ Exception -> 0x03f4 }
        L_0x0271:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03f4 }
            r4.<init>()     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r9 = "replace, localCommentSize="
            r4.append(r9)     // Catch:{ Exception -> 0x03f4 }
            r4.append(r8)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r8 = ", serverCommentSize="
            r4.append(r8)     // Catch:{ Exception -> 0x03f4 }
            r4.append(r1)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r1 = ", lastCommentSize="
            r4.append(r1)     // Catch:{ Exception -> 0x03f4 }
            r4.append(r3)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x03f4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)     // Catch:{ Exception -> 0x03f4 }
            if (r0 == 0) goto L_0x02a1
            java.util.LinkedList<te3.w64> r1 = r0.LikeUserList     // Catch:{ Exception -> 0x03f4 }
            if (r1 == 0) goto L_0x02a1
            int r1 = r1.size()     // Catch:{ Exception -> 0x03f4 }
            goto L_0x02a2
        L_0x02a1:
            r1 = 0
        L_0x02a2:
            java.util.LinkedList<te3.w64> r3 = r7.LikeUserList     // Catch:{ Exception -> 0x03f4 }
            if (r3 != 0) goto L_0x02a8
            r3 = 0
            goto L_0x02ac
        L_0x02a8:
            int r3 = r3.size()     // Catch:{ Exception -> 0x03f4 }
        L_0x02ac:
            java.util.LinkedList<te3.w64> r4 = r7.LikeUserList     // Catch:{ Exception -> 0x03f4 }
            if (r4 == 0) goto L_0x03f1
            java.util.LinkedList r4 = new java.util.LinkedList     // Catch:{ Exception -> 0x03f4 }
            r4.<init>()     // Catch:{ Exception -> 0x03f4 }
            java.util.LinkedList<te3.w64> r8 = r7.LikeUserList     // Catch:{ Exception -> 0x03f4 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x03f4 }
        L_0x02bb:
            boolean r9 = r8.hasNext()     // Catch:{ Exception -> 0x03f4 }
            if (r9 == 0) goto L_0x030f
            java.lang.Object r9 = r8.next()     // Catch:{ Exception -> 0x03f4 }
            te3.w64 r9 = (te3.w64) r9     // Catch:{ Exception -> 0x03f4 }
            int r10 = r9.f299715s     // Catch:{ Exception -> 0x03f4 }
            if (r10 <= 0) goto L_0x02bb
            r4.add(r9)     // Catch:{ Exception -> 0x03f4 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03f4 }
            r10.<init>()     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r12 = "likeItem has DeleteFlag"
            r10.append(r12)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r12 = r9.f299703d     // Catch:{ Exception -> 0x03f4 }
            r10.append(r12)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x03f4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)     // Catch:{ Exception -> 0x03f4 }
            java.util.LinkedList<te3.w64> r10 = r0.LikeUserList     // Catch:{ Exception -> 0x03f4 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ Exception -> 0x03f4 }
        L_0x02eb:
            boolean r12 = r10.hasNext()     // Catch:{ Exception -> 0x03f4 }
            if (r12 == 0) goto L_0x02bb
            java.lang.Object r12 = r10.next()     // Catch:{ Exception -> 0x03f4 }
            te3.w64 r12 = (te3.w64) r12     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r13 = r12.f299703d     // Catch:{ Exception -> 0x03f4 }
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)     // Catch:{ Exception -> 0x03f4 }
            if (r13 != 0) goto L_0x0309
            java.lang.String r13 = r12.f299703d     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r14 = r9.f299703d     // Catch:{ Exception -> 0x03f4 }
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x03f4 }
            if (r13 == 0) goto L_0x02eb
        L_0x0309:
            java.util.LinkedList<te3.w64> r9 = r0.LikeUserList     // Catch:{ Exception -> 0x03f4 }
            r9.remove(r12)     // Catch:{ Exception -> 0x03f4 }
            goto L_0x02bb
        L_0x030f:
            java.util.Iterator r8 = r4.iterator()     // Catch:{ Exception -> 0x03f4 }
        L_0x0313:
            boolean r9 = r8.hasNext()     // Catch:{ Exception -> 0x03f4 }
            if (r9 == 0) goto L_0x0325
            java.lang.Object r9 = r8.next()     // Catch:{ Exception -> 0x03f4 }
            te3.w64 r9 = (te3.w64) r9     // Catch:{ Exception -> 0x03f4 }
            java.util.LinkedList<te3.w64> r10 = r7.LikeUserList     // Catch:{ Exception -> 0x03f4 }
            r10.remove(r9)     // Catch:{ Exception -> 0x03f4 }
            goto L_0x0313
        L_0x0325:
            r4.clear()     // Catch:{ Exception -> 0x03f4 }
            if (r0 == 0) goto L_0x03bb
            java.util.LinkedList<te3.w64> r0 = r0.LikeUserList     // Catch:{ Exception -> 0x03f4 }
            if (r0 == 0) goto L_0x03bb
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x03f4 }
        L_0x0332:
            boolean r4 = r0.hasNext()     // Catch:{ Exception -> 0x03f4 }
            if (r4 == 0) goto L_0x03bb
            java.lang.Object r4 = r0.next()     // Catch:{ Exception -> 0x03f4 }
            te3.w64 r4 = (te3.w64) r4     // Catch:{ Exception -> 0x03f4 }
            java.util.LinkedList<te3.w64> r8 = r7.LikeUserList     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r9 = "isInLikeList"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r5)     // Catch:{ Exception -> 0x03f4 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x03f4 }
        L_0x034a:
            boolean r10 = r8.hasNext()     // Catch:{ Exception -> 0x03f4 }
            if (r10 == 0) goto L_0x036d
            java.lang.Object r10 = r8.next()     // Catch:{ Exception -> 0x03f4 }
            te3.w64 r10 = (te3.w64) r10     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r12 = r4.f299703d     // Catch:{ Exception -> 0x03f4 }
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)     // Catch:{ Exception -> 0x03f4 }
            if (r12 != 0) goto L_0x034a
            java.lang.String r12 = r4.f299703d     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r10 = r10.f299703d     // Catch:{ Exception -> 0x03f4 }
            boolean r10 = r12.equals(r10)     // Catch:{ Exception -> 0x03f4 }
            if (r10 == 0) goto L_0x034a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r5)     // Catch:{ Exception -> 0x03f4 }
            r8 = 1
            goto L_0x0371
        L_0x036d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r5)     // Catch:{ Exception -> 0x03f4 }
            r8 = 0
        L_0x0371:
            if (r8 != 0) goto L_0x0332
            f40.C86709a0.m107528h()     // Catch:{ Exception -> 0x03f4 }
            k40.a r8 = f40.C86709a0.m107533q(r2)     // Catch:{ Exception -> 0x03f4 }
            f62.k0 r8 = (f62.C75700k0) r8     // Catch:{ Exception -> 0x03f4 }
            com.tencent.mm.storage.u3 r8 = r8.mo96097Ni()     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r9 = r4.f299703d     // Catch:{ Exception -> 0x03f4 }
            com.tencent.mm.storage.z1 r8 = r8.get(r9)     // Catch:{ Exception -> 0x03f4 }
            if (r8 == 0) goto L_0x03a2
            boolean r9 = r8.mo62927s3()     // Catch:{ Exception -> 0x03f4 }
            if (r9 == 0) goto L_0x03a2
            boolean r8 = r8.mo62920o3()     // Catch:{ Exception -> 0x03f4 }
            if (r8 != 0) goto L_0x03a2
            java.util.LinkedList<te3.w64> r8 = r7.LikeUserList     // Catch:{ Exception -> 0x03f4 }
            r8.add(r4)     // Catch:{ Exception -> 0x03f4 }
            java.util.LinkedList<te3.w64> r4 = r7.LikeUserList     // Catch:{ Exception -> 0x03f4 }
            int r4 = r4.size()     // Catch:{ Exception -> 0x03f4 }
            r7.LikeUserListCount = r4     // Catch:{ Exception -> 0x03f4 }
            goto L_0x0332
        L_0x03a2:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03f4 }
            r8.<init>()     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r9 = "not in likelist not mycontact "
            r8.append(r9)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r4 = r4.f299703d     // Catch:{ Exception -> 0x03f4 }
            r8.append(r4)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r4 = r8.toString()     // Catch:{ Exception -> 0x03f4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r4)     // Catch:{ Exception -> 0x03f4 }
            goto L_0x0332
        L_0x03bb:
            java.util.LinkedList<te3.w64> r0 = r7.LikeUserList     // Catch:{ Exception -> 0x03f4 }
            java.util.Comparator<te3.w64> r2 = f274743d     // Catch:{ Exception -> 0x03f4 }
            java.util.Collections.sort(r0, r2)     // Catch:{ Exception -> 0x03f4 }
            java.util.LinkedList<te3.w64> r0 = r7.LikeUserList     // Catch:{ Exception -> 0x03f4 }
            if (r0 != 0) goto L_0x03c8
            r0 = 0
            goto L_0x03cc
        L_0x03c8:
            int r0 = r0.size()     // Catch:{ Exception -> 0x03f4 }
        L_0x03cc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03f4 }
            r2.<init>()     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r4 = "replace, localLikeSize="
            r2.append(r4)     // Catch:{ Exception -> 0x03f4 }
            r2.append(r1)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r1 = ", serverLikeSize="
            r2.append(r1)     // Catch:{ Exception -> 0x03f4 }
            r2.append(r3)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r1 = ", lastLikeSize="
            r2.append(r1)     // Catch:{ Exception -> 0x03f4 }
            r2.append(r0)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x03f4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)     // Catch:{ Exception -> 0x03f4 }
        L_0x03f1:
            r1 = r17
            goto L_0x041c
        L_0x03f4:
            r0 = move-exception
            goto L_0x03fb
        L_0x03f6:
            r0 = move-exception
            r17 = r3
            r16 = r4
        L_0x03fb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "replace, error "
            r1.append(r2)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r1 = r17
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r1, r2)
        L_0x041c:
            byte[] r0 = r7.toByteArray()     // Catch:{ Exception -> 0x0424 }
            r6.setAttrBuf(r0)     // Catch:{ Exception -> 0x0424 }
            goto L_0x042b
        L_0x0424:
            r0 = move-exception
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r1, r3)
        L_0x042b:
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r6.getTimeLine()
            java.lang.String r1 = r7.Username
            r0.UserName = r1
            int r1 = r0.Privated
            r6.field_pravited = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "replace, ext flag "
            r1.append(r2)
            int r2 = r7.ExtFlag
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            te3.j00 r1 = r0.ContentObj     // Catch:{ all -> 0x0476 }
            java.util.LinkedList<te3.kv2> r1 = r1.f298427h     // Catch:{ all -> 0x0476 }
            if (r1 == 0) goto L_0x0468
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0476 }
        L_0x0458:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0476 }
            if (r2 == 0) goto L_0x0468
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0476 }
            te3.kv2 r2 = (te3.C101804kv2) r2     // Catch:{ all -> 0x0476 }
            r3 = 1
            r2.f298681N = r3     // Catch:{ all -> 0x0476 }
            goto L_0x0458
        L_0x0468:
            r6.setTimeLine(r0)     // Catch:{ all -> 0x0476 }
            te3.j00 r0 = r0.ContentObj     // Catch:{ all -> 0x0476 }
            int r1 = r0.f298424e     // Catch:{ all -> 0x0476 }
            r6.field_type = r1     // Catch:{ all -> 0x0476 }
            int r0 = r0.f298428i     // Catch:{ all -> 0x0476 }
            r6.field_subType = r0     // Catch:{ all -> 0x0476 }
            goto L_0x0482
        L_0x0476:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "error in get media"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r0, r1)
        L_0x0482:
            r1 = r16
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94833a.m120161n(te3.h64, int):com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    /* renamed from: o */
    public static void m120162o(C48952c4 c4Var, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("replace", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        m120163p(c4Var, i, i2, 0);
        SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
    }

    /* renamed from: p */
    public static void m120163p(C48952c4 c4Var, int i, int i2, int i3) {
        SnsObject snsObject;
        SnsMethodCalculate.markStartTimeMs("replace", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (c4Var == null) {
            Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "error adobj");
            SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return;
        }
        h64 h64 = c4Var.f131489d;
        if (h64 == null || (snsObject = h64.f134464d) == null) {
            Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "error adobj");
            SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return;
        }
        AdSnsInfo n = m120161n(h64, i3);
        if (n == null) {
            Log.m105928w("MicroMsg.AdSnsInfoStorageLogic", "adSnsInfo is null!");
            SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return;
        }
        String g = C48374j0.m53718g(c4Var.f131490e);
        if (i3 == 1 && !Util.isNullOrNil(n.field_adinfo)) {
            g = n.field_adinfo;
        }
        m120173z(n, new ADInfo(g));
        n.field_createTime = i;
        n.field_createAdTime = i2;
        String g2 = C48374j0.m53718g(c4Var.f131489d.f134465e);
        if (!Util.isNullOrNil(g2)) {
            n.field_recxml = g2;
        }
        String str = n.field_recxml;
        SnsMethodCalculate.markStartTimeMs("filterAdxml", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        SnsMethodCalculate.markEndTimeMs("filterAdxml", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        n.field_adxml = str;
        if (i3 == 0) {
            n.field_adinfo = C48374j0.m53718g(c4Var.f131490e);
        } else if (i3 == 1) {
            if (Util.isNullOrNil(n.field_adinfo)) {
                n.field_adinfo = C48374j0.m53718g(c4Var.f131490e);
            }
        } else if (i3 == 2 && !Util.isNullOrNil(C48374j0.m53718g(c4Var.f131490e))) {
            n.field_adinfo = C48374j0.m53718g(c4Var.f131490e);
        }
        C94866e1.zx0().mo139861Ow(snsObject.f283891Id, n);
        SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
    }

    /* renamed from: q */
    public static void m120164q(C48952c4 c4Var, int i) {
        int i2;
        SnsMethodCalculate.markStartTimeMs("replaceAtObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (c4Var == null) {
            Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "advertiseObject null");
            SnsMethodCalculate.markEndTimeMs("replaceAtObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return;
        }
        h64 h64 = c4Var.f131489d;
        if (h64 == null) {
            Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "advertiseObject.SnsADObject is null ");
            SnsMethodCalculate.markEndTimeMs("replaceAtObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return;
        }
        SnsObject snsObject = h64.f134464d;
        if (snsObject == null) {
            Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "advertiseObject.SnsADObject.SnsObject is null");
            SnsMethodCalculate.markEndTimeMs("replaceAtObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return;
        }
        String q0 = C102236a0.m134765q0(snsObject.f283891Id);
        if (!C94866e1.zx0().mo139862Yt(c4Var.f131489d.f134464d.f283891Id)) {
            SnsObject snsObject2 = c4Var.f131489d.f134464d;
            int i3 = snsObject2.CommentUserListCount;
            LinkedList<w64> linkedList = snsObject2.CommentUserList;
            SnsMethodCalculate.markStartTimeMs("getAdCreateTimeByComments", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            if (i3 > 0 && linkedList != null) {
                Iterator<w64> it = linkedList.iterator();
                while (it.hasNext()) {
                    w64 next = it.next();
                    if (!C98242p.m126942d(next.f299716t, 32) && currentTimeMillis > (i2 = next.f299708i)) {
                        currentTimeMillis = i2;
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("getAdCreateTimeByComments", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "replaceAtObj, insert at adObject, snsId=" + q0 + ", createTime=" + currentTimeMillis);
            m120163p(c4Var, currentTimeMillis, currentTimeMillis, i);
            AdSnsInfo jo = C94866e1.zx0().mo139864jo(c4Var.f131489d.f134464d.f283891Id);
            if (jo != null) {
                Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "set at ad invisible");
                jo.setLocalInvisible();
                C94866e1.zx0().mo139861Ow(jo.field_snsId, jo);
            }
        } else {
            Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "replaceAtObj, update, snsId=" + q0);
            m120165r(c4Var.f131489d, "", i, true);
        }
        AdSnsInfo jo4 = C94866e1.zx0().mo139864jo(c4Var.f131489d.f134464d.f283891Id);
        if (jo4 != null) {
            String str = jo4.field_atAdinfo;
            jo4.field_atAdinfo = C48374j0.m53718g(c4Var.f131490e);
            if (i == 1 && !Util.isNullOrNil(str)) {
                jo4.field_atAdinfo = str;
            }
            C50903q2 remindInfoGroup = jo4.getRemindInfoGroup();
            if (remindInfoGroup == null) {
                remindInfoGroup = new C50903q2();
            }
            C52156yq3 yq32 = c4Var.f131492g;
            remindInfoGroup.f140096e = yq32;
            if (yq32 != null) {
                Log.m105925i("MicroMsg.AdSnsInfoStorageLogic", "update atFriend remindInfo, aid64 %d, aid %d", Long.valueOf(yq32.f145470i), Integer.valueOf(remindInfoGroup.f140096e.f145465d));
            } else {
                Log.m105920e("MicroMsg.AdSnsInfoStorageLogic", "atFriendRemindInfo == null");
            }
            jo4.setRemindInfoGroup(remindInfoGroup);
            C94866e1.zx0().mo139861Ow(jo4.field_snsId, jo4);
        }
        SnsMethodCalculate.markEndTimeMs("replaceAtObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
    }

    /* renamed from: r */
    public static void m120165r(h64 h64, String str, int i, boolean z) {
        C39622i0 a;
        SnsMethodCalculate.markStartTimeMs("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (h64 == null) {
            Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "replaceObj, error adobj");
            SnsMethodCalculate.markEndTimeMs("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return;
        }
        SnsObject snsObject = h64.f134464d;
        if (snsObject == null) {
            Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "replaceObj, error adobj");
            SnsMethodCalculate.markEndTimeMs("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return;
        }
        String q0 = C102236a0.m134765q0(snsObject.f283891Id);
        AdSnsInfo n = m120161n(h64, i);
        if (!z && i == 2 && n != null && !Util.isNullOrNil(str)) {
            n.field_adinfo = str;
        }
        if (!z && i == 2 && n != null && !Util.isNullOrNil(n.field_adinfo)) {
            m120173z(n, new ADInfo(n.field_adinfo));
        }
        Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "adDynamic replaceObj, snsId=" + q0 + "isAt=" + z + ", replaceDynamicMode=" + i + ", dynamicAdinfoStr=" + str);
        C94866e1.zx0().mo139861Ow(h64.f134464d.f283891Id, n);
        Class cls = C60631e.class;
        synchronized (C60247c.f171776h) {
            C86709a0.m107523b().mo121108c();
            if (C60247c.class.isAssignableFrom(cls)) {
                a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
            } else {
                throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
        }
        ((C98802d) ((C60631e) a).mo85233d3(C98802d.class)).mo138174d3(C100417r0.m131424m(n.getLocalid()), StorageEventId.getUPDATE());
        SnsMethodCalculate.markEndTimeMs("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
    }

    /* renamed from: s */
    public static boolean m120166s(long j, n64 n64) {
        C39622i0 a;
        SnsMethodCalculate.markStartTimeMs("updataComment", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        m64 m64 = n64.f298899f;
        int i = m64.f298777h;
        if (i == 7 || i == 8 || i == 16) {
            AdSnsInfo jo = C94866e1.zx0().mo139864jo(j);
            if (jo == null) {
                Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "pass the action because the snsinfo is null " + j);
                SnsMethodCalculate.markEndTimeMs("updataComment", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                return false;
            }
            try {
                SnsObject snsObject = (SnsObject) new SnsObject().parseFrom(jo.field_attrBuf);
                snsObject.f283891Id = j;
                int i2 = m64.f298777h;
                if (i2 == 7) {
                    Iterator<w64> it = snsObject.LikeUserList.iterator();
                    while (it.hasNext()) {
                        w64 next = it.next();
                        if (next.f299708i == m64.f298779j && next.f299703d.equals(m64.f298773d)) {
                            Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "like create time " + next.f299708i + " ");
                            SnsMethodCalculate.markEndTimeMs("updataComment", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                            return false;
                        }
                    }
                    snsObject.LikeUserList.add(C94843b1.m120188i(n64));
                } else if (i2 == 8 || i2 == 16) {
                    Iterator<w64> it4 = snsObject.CommentUserList.iterator();
                    while (it4.hasNext()) {
                        w64 next2 = it4.next();
                        if (next2.f299708i == m64.f298779j && next2.f299703d.equals(m64.f298773d)) {
                            Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "like create time " + next2.f299708i + " ");
                            SnsMethodCalculate.markEndTimeMs("updataComment", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                            return false;
                        }
                    }
                    snsObject.CommentUserList.add(C94843b1.m120188i(n64));
                }
                jo.setAttrBuf(snsObject.toByteArray());
                C94866e1.zx0().mo139861Ow(snsObject.f283891Id, jo);
                Class cls = C60631e.class;
                synchronized (C60247c.f171776h) {
                    C86709a0.m107523b().mo121108c();
                    if (C60247c.class.isAssignableFrom(cls)) {
                        a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
                    } else {
                        throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                    }
                }
                ((C98802d) ((C60631e) a).mo85233d3(C98802d.class)).mo138174d3(C100417r0.m131424m(jo.getLocalid()), StorageEventId.getUPDATE());
            } catch (Exception e) {
                Log.m105920e("MicroMsg.AdSnsInfoStorageLogic", "e " + e.getMessage());
                Log.printErrStackTrace("MicroMsg.AdSnsInfoStorageLogic", e, "", new Object[0]);
            }
            SnsMethodCalculate.markEndTimeMs("updataComment", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("updataComment", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0171  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m120167t(te3.h64 r17, te3.C51018qv3 r18, java.lang.String r19, int r20) {
        /*
            r1 = r17
            r0 = r18
            r2 = r20
            java.lang.String r3 = "update"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            java.lang.String r5 = "update, error adobj"
            java.lang.String r6 = "MicroMsg.AdSnsInfoStorageLogic"
            if (r1 != 0) goto L_0x001c
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return
        L_0x001c:
            com.tencent.mm.protocal.protobuf.SnsObject r7 = r1.f134464d
            if (r7 != 0) goto L_0x0027
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return
        L_0x0027:
            com.tencent.mm.plugin.sns.storage.AdSnsInfo r5 = m120161n(r1, r2)
            if (r5 != 0) goto L_0x0031
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return
        L_0x0031:
            java.lang.String r7 = r5.field_adinfo
            r8 = 2
            if (r2 != r8) goto L_0x003e
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r19)
            if (r9 != 0) goto L_0x003e
            r7 = r19
        L_0x003e:
            if (r2 != r8) goto L_0x004e
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r2 != 0) goto L_0x004e
            com.tencent.mm.plugin.sns.storage.ADInfo r2 = new com.tencent.mm.plugin.sns.storage.ADInfo
            r2.<init>(r7)
            m120173z(r5, r2)
        L_0x004e:
            java.lang.String r2 = "updateAdInfoXmlWithDynamicData"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r4)
            if (r0 == 0) goto L_0x0134
            if (r7 != 0) goto L_0x005a
            goto L_0x0134
        L_0x005a:
            r9 = 0
            te3.h0 r10 = new te3.h0     // Catch:{ Exception -> 0x0124 }
            r10.<init>()     // Catch:{ Exception -> 0x0124 }
            pe3.b r0 = r0.f140574f     // Catch:{ Exception -> 0x0124 }
            byte[] r0 = r0.f257327a     // Catch:{ Exception -> 0x0124 }
            r10.parseFrom(r0)     // Catch:{ Exception -> 0x0124 }
            java.util.LinkedList<te3.k64> r0 = r10.f134374e     // Catch:{ Exception -> 0x0124 }
            if (r0 == 0) goto L_0x0130
            java.lang.String r10 = "<(([a-zA-Z0-9\\-_]+)([^>]+)dynamicKey=[\"']%s[\"']([^>]*))"
            java.lang.String r11 = ""
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0124 }
            r12 = r7
        L_0x0074:
            boolean r13 = r0.hasNext()     // Catch:{ Exception -> 0x0121 }
            r14 = 1
            if (r13 == 0) goto L_0x0104
            java.lang.Object r13 = r0.next()     // Catch:{ Exception -> 0x0121 }
            te3.k64 r13 = (te3.k64) r13     // Catch:{ Exception -> 0x0121 }
            java.lang.String r15 = r13.f136586d     // Catch:{ Exception -> 0x0121 }
            if (r15 == 0) goto L_0x00fc
            java.lang.Object[] r8 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x0121 }
            r8[r9] = r15     // Catch:{ Exception -> 0x0121 }
            java.lang.String r8 = java.lang.String.format(r10, r8)     // Catch:{ Exception -> 0x0121 }
            java.util.regex.Pattern r15 = java.util.regex.Pattern.compile(r8)     // Catch:{ Exception -> 0x0121 }
            java.util.regex.Matcher r15 = r15.matcher(r12)     // Catch:{ Exception -> 0x0121 }
            boolean r16 = r15.find()     // Catch:{ Exception -> 0x0121 }
            if (r16 == 0) goto L_0x00fc
            r9 = 2
            java.lang.String r15 = r15.group(r9)     // Catch:{ Exception -> 0x0121 }
            if (r15 == 0) goto L_0x00fc
            int r9 = r15.length()     // Catch:{ Exception -> 0x0121 }
            if (r9 <= 0) goto L_0x00fc
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0121 }
            r9.<init>()     // Catch:{ Exception -> 0x0121 }
            r9.append(r8)     // Catch:{ Exception -> 0x0121 }
            java.lang.String r8 = "((>[\\s\\S]*</%s>)|(/([^>]*)>))"
            r18 = r0
            java.lang.Object[] r0 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x0121 }
            r16 = 0
            r0[r16] = r15     // Catch:{ Exception -> 0x0121 }
            java.lang.String r0 = java.lang.String.format(r8, r0)     // Catch:{ Exception -> 0x0121 }
            r9.append(r0)     // Catch:{ Exception -> 0x0121 }
            java.lang.String r0 = r9.toString()     // Catch:{ Exception -> 0x0121 }
            java.lang.String r8 = "<$1>%s</%s>"
            r9 = 2
            java.lang.Object[] r14 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0121 }
            java.lang.String r9 = r13.f136587e     // Catch:{ Exception -> 0x0121 }
            r16 = 0
            r14[r16] = r9     // Catch:{ Exception -> 0x0121 }
            r9 = 1
            r14[r9] = r15     // Catch:{ Exception -> 0x0121 }
            java.lang.String r8 = java.lang.String.format(r8, r14)     // Catch:{ Exception -> 0x0121 }
            java.lang.String r12 = r12.replaceAll(r0, r8)     // Catch:{ Exception -> 0x0121 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0121 }
            r0.<init>()     // Catch:{ Exception -> 0x0121 }
            r0.append(r11)     // Catch:{ Exception -> 0x0121 }
            java.lang.String r8 = r13.f136586d     // Catch:{ Exception -> 0x0121 }
            r0.append(r8)     // Catch:{ Exception -> 0x0121 }
            java.lang.String r8 = ":"
            r0.append(r8)     // Catch:{ Exception -> 0x0121 }
            java.lang.String r8 = r13.f136587e     // Catch:{ Exception -> 0x0121 }
            r0.append(r8)     // Catch:{ Exception -> 0x0121 }
            java.lang.String r8 = ";"
            r0.append(r8)     // Catch:{ Exception -> 0x0121 }
            java.lang.String r11 = r0.toString()     // Catch:{ Exception -> 0x0121 }
            goto L_0x00fe
        L_0x00fc:
            r18 = r0
        L_0x00fe:
            r0 = r18
            r8 = 2
            r9 = 0
            goto L_0x0074
        L_0x0104:
            java.lang.String r0 = "DynamicData is: [%s]"
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0121 }
            r9 = 0
            r8[r9] = r11     // Catch:{ Exception -> 0x0121 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r8)     // Catch:{ Exception -> 0x0121 }
            java.lang.String r0 = "ADInfo"
            r8 = 0
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r7, r0, r8)     // Catch:{ Exception -> 0x0121 }
            if (r0 != 0) goto L_0x012f
            java.lang.String r0 = "DynamicData xml format error!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r0)     // Catch:{ Exception -> 0x0121 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            goto L_0x013d
        L_0x0121:
            r0 = move-exception
            r7 = r12
            goto L_0x0125
        L_0x0124:
            r0 = move-exception
        L_0x0125:
            r8 = 0
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.String r9 = "replace error occurs!"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r9, r8)
            r12 = r7
        L_0x012f:
            r7 = r12
        L_0x0130:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            goto L_0x013d
        L_0x0134:
            java.lang.String r0 = "update with empty dynamic data"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
        L_0x013d:
            r5.field_adinfo = r7
            os2.j r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.zx0()
            com.tencent.mm.protocal.protobuf.SnsObject r2 = r1.f134464d
            long r7 = r2.f283891Id
            boolean r0 = r0.mo139862Yt(r7)
            if (r0 == 0) goto L_0x0171
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "find this adobj and update"
            r0.append(r2)
            com.tencent.mm.protocal.protobuf.SnsObject r2 = r1.f134464d
            long r7 = r2.f283891Id
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            os2.j r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.zx0()
            com.tencent.mm.protocal.protobuf.SnsObject r1 = r1.f134464d
            long r1 = r1.f283891Id
            r0.mo139863bD(r1, r5)
            goto L_0x018a
        L_0x0171:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "local can not find this adobj "
            r0.append(r2)
            com.tencent.mm.protocal.protobuf.SnsObject r1 = r1.f134464d
            long r1 = r1.f283891Id
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
        L_0x018a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94833a.m120167t(te3.h64, te3.qv3, java.lang.String, int):void");
    }

    /* renamed from: u */
    public static void m120168u(long j, ADInfo aDInfo) {
        SnsMethodCalculate.markStartTimeMs("updateADInfoImm", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (aDInfo == null || !aDInfo.adInfoSyncBufferImm || Util.isNullOrNil(aDInfo.adInfoSyncBuffer)) {
            SnsMethodCalculate.markEndTimeMs("updateADInfoImm", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return;
        }
        C94835a0 a0Var = new C94835a0(j, 1, aDInfo.adInfoSyncBuffer);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(a0Var);
        SnsMethodCalculate.markEndTimeMs("updateADInfoImm", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
    }

    /* renamed from: v */
    public static boolean m120169v(C48952c4 c4Var) {
        h64 h64;
        SnsObject snsObject;
        SnsMethodCalculate.markStartTimeMs("updateAdvertiseObjDynamicField", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (c4Var == null || (h64 = c4Var.f131489d) == null || (snsObject = h64.f134464d) == null) {
            Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "updateAdvertiseObjDynamicField, params err");
            SnsMethodCalculate.markEndTimeMs("updateAdvertiseObjDynamicField", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return false;
        }
        String q0 = C102236a0.m134765q0(snsObject.f283891Id);
        h64 h642 = c4Var.f131489d;
        if (h642.f134465e == null) {
            h642.f134465e = C48374j0.m53720i("");
        }
        if (c4Var.f131490e == null) {
            c4Var.f131490e = C48374j0.m53720i("");
        }
        SnsObject snsObject2 = c4Var.f131489d.f134464d;
        if (snsObject2.ObjectDesc == null) {
            snsObject2.ObjectDesc = C48374j0.m53719h("", false);
        }
        h64 h643 = c4Var.f131489d;
        boolean c = C48374j0.m53714c(h643.f134467g, h643.f134468h, h643.f134466f);
        if (c) {
            c4Var.f131490e.mo73357f(C48374j0.m53718g(c4Var.f131489d.f134467g));
            h64 h644 = c4Var.f131489d;
            h644.f134465e.mo73357f(C48374j0.m53718g(h644.f134468h));
            h64 h645 = c4Var.f131489d;
            h645.f134464d.ObjectDesc.mo73350k(C48374j0.m53718g(h645.f134466f).getBytes(StandardCharsets.UTF_8));
        }
        Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "adDynamic, updateAdvertiseObjDynamicField called with: advertiseObject = [" + c4Var + "] isValid = " + c + ", snsId=" + q0);
        SnsMethodCalculate.markEndTimeMs("updateAdvertiseObjDynamicField", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        return c;
    }

    /* renamed from: w */
    public static void m120170w(h64 h64, AdSnsInfo adSnsInfo) {
        SnsMethodCalculate.markStartTimeMs("updateAdxmlForAdSnsInfo", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        C51163rv3 rv32 = h64.f134465e;
        if (rv32 != null) {
            String g = C48374j0.m53718g(rv32);
            if (!Util.isNullOrNil(g)) {
                adSnsInfo.field_recxml = g;
            }
            String str = adSnsInfo.field_recxml;
            SnsMethodCalculate.markStartTimeMs("filterAdxml", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            SnsMethodCalculate.markEndTimeMs("filterAdxml", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            if (!Util.isNullOrNil(str) && !str.equals(adSnsInfo.field_adxml)) {
                Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "update field adxml " + str);
                adSnsInfo.field_adxml = str;
            }
        }
        SnsMethodCalculate.markEndTimeMs("updateAdxmlForAdSnsInfo", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
    }

    /* renamed from: x */
    public static boolean m120171x(AdSnsInfo adSnsInfo, C51018qv3 qv32) {
        SnsMethodCalculate.markStartTimeMs("updateContentForAdSnsInfo", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        String f = C48374j0.m53717f(qv32);
        if (Util.isNullOrNil(f)) {
            SnsMethodCalculate.markEndTimeMs("updateContentForAdSnsInfo", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return true;
        } else if (!adSnsInfo.setContent(f)) {
            SnsMethodCalculate.markEndTimeMs("updateContentForAdSnsInfo", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return true;
        } else {
            SnsMethodCalculate.markEndTimeMs("updateContentForAdSnsInfo", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return false;
        }
    }

    /* renamed from: y */
    public static boolean m120172y(h64 h64) {
        SnsMethodCalculate.markStartTimeMs("updateSnsADObjDynamicField", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (h64 == null || h64.f134464d == null) {
            SnsMethodCalculate.markEndTimeMs("updateSnsADObjDynamicField", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return false;
        }
        if (h64.f134465e == null) {
            h64.f134465e = C48374j0.m53720i("");
        }
        SnsObject snsObject = h64.f134464d;
        if (snsObject.ObjectDesc == null) {
            snsObject.ObjectDesc = C48374j0.m53719h("", false);
        }
        boolean c = C48374j0.m53714c(h64.f134467g, h64.f134468h, h64.f134466f);
        if (c) {
            h64.f134465e.mo73357f(C48374j0.m53718g(h64.f134468h));
            h64.f134464d.ObjectDesc.mo73350k(C48374j0.m53718g(h64.f134466f).getBytes(StandardCharsets.UTF_8));
        }
        Log.m105918d("MicroMsg.AdSnsInfoStorageLogic", "updateSnsADObjDynamicField called with: advertiseObject = [" + h64 + "] isValid = " + c);
        SnsMethodCalculate.markEndTimeMs("updateSnsADObjDynamicField", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        return c;
    }

    /* renamed from: z */
    public static void m120173z(AdSnsInfo adSnsInfo, ADInfo aDInfo) {
        SnsMethodCalculate.markStartTimeMs("updateStatExtInfo", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        TimeLineObject timeLine = adSnsInfo.getTimeLine();
        bb4 bb4 = new bb4();
        cb4 cb4 = new cb4();
        bb4.f226992d = cb4;
        cb4.f298024f = aDInfo.uxInfo;
        cb4.f298023e = timeLine.f283893Id;
        cb4.f298025g = adSnsInfo.getSource();
        cb4 cb42 = bb4.f226992d;
        cb42.f298026h = C92859v.m117128f(cb42);
        int i = timeLine.ContentObj.f298424e;
        if (i == 1) {
            bb4.f226992d.f298022d = 1;
        } else if (i == 15) {
            bb4.f226992d.f298022d = 2;
        } else {
            bb4.f226992d.f298022d = 0;
        }
        bb4.f226992d.f298027i = adSnsInfo.getExpId();
        try {
            String replace = Base64.encodeToString(bb4.toByteArray(), 0).replace("\n", "");
            cb4 cb43 = bb4.f226992d;
            Log.m105925i("MicroMsg.AdSnsInfoStorageLogic", "replace newly add snsId:%s, statExtStr:%s(id=%s,uxInfo=%s)", timeLine.f283893Id, replace, cb43.f298023e, cb43.f298024f);
            timeLine.statExtStr = replace;
            adSnsInfo.setTimeLine(timeLine);
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.AdSnsInfoStorageLogic", e, "", new Object[0]);
        }
        SnsMethodCalculate.markEndTimeMs("updateStatExtInfo", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
    }
}
