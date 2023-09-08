package com.tencent.p014mm.plugin.sns.model;

import ad0.C91999u;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import ao2.C79617c;
import co2.C92442i;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.events.FavoriteOperationEvent;
import com.tencent.p014mm.autogen.events.FinderCnyEggCardEvent;
import com.tencent.p014mm.autogen.events.FollowUserEvent;
import com.tencent.p014mm.autogen.events.TimelinePlayBackAnimEvent;
import com.tencent.p014mm.autogen.events.TimelinePlayClickAnimEvent;
import com.tencent.p014mm.plugin.downloader.api.C29841c;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.C40939n;
import com.tencent.p014mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.p014mm.plugin.downloader_app.model.C40979a;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.plugin.scanner.C42902i;
import com.tencent.p014mm.plugin.sns.model.C94853e;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.C94724k;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdProxyUI;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTransparentUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0;
import com.tencent.p014mm.plugin.sns.storage.AdSnsInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.remoteservice.C96897a;
import com.tencent.p014mm.remoteservice.C96905d;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.C96983o3;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.IXWebBroadcastListener;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import di3.C86312j;
import e51.C45547h;
import eb0.C31543z5;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C86493v0;
import ef3.C86513a;
import ef3.C86514b;
import f40.C86709a0;
import f62.C75700k0;
import fm0.C8136w;
import hd0.C98398h0;
import ht1.C60187m5;
import ht1.C60200t1;
import ht1.C60208v1;
import j20.C117292a;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import jo2.C98951a;
import jp2.C46565k;
import jp2.C98962n;
import jp3.C9487b;
import jq2.C88011l;
import k20.C9556a;
import lo2.C99542h0;
import lo2.C99544i0;
import lo2.C99552l;
import lp2.C46884e;
import lp3.C88631d;
import m02.C46940b;
import nd3.C47223a;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONObject;
import os2.C100417r0;
import p011cm.C28611c;
import p1081gi.C98121d;
import p1081gi.C98127h;
import p159gw.C45962f;
import p166hy.C98559a0;
import p196ln.C76705f;
import p200lx.C46896e0;
import p200lx.C46897s;
import p237sp.C13754y;
import p239sv.C48464g;
import p567iu.C46287c;
import p567iu.C98798b;
import p763ym.C39072t;
import p763ym.C79138l;
import pb1.C100714h1;
import pe3.C47465a;
import pe3.C89349b;
import ps2.C100853b;
import ps2.C100884n;
import ps2.C12004a;
import ps2.C35631d0;
import ps2.C47520d;
import q62.C101048b;
import rq2.C101425k;
import rq2.C63505q;
import te3.C101801kd0;
import te3.C101804kv2;
import te3.C101834rc0;
import te3.C49263ec2;
import te3.C49355f0;
import te3.C49492g0;
import te3.C49788i22;
import te3.C50007jl3;
import te3.C51216sa2;
import te3.C51263sl2;
import te3.C51767w1;
import te3.C52075y62;
import te3.C52157yr;
import te3.C77967mx3;
import te3.hm4;
import vd3.C78407r;
import vo2.C65831b;
import vo2.C65832c;
import vo2.C65833d;
import vr2.C102240d;
import vr2.C102260r;
import vr2.C102268v;
import we3.C78592b;
import yo2.C102894c;
import ys2.C39156j;
import ys2.C53552a;
import ys2.C53553b;
import ys2.C53554c;
import ys2.C53555d;
import ys2.C53556e;
import ys2.C53557f;
import ys2.C53559k;
import ys2.C53560m;
import ys2.C66695g;
import ys2.C66696h;
import ys2.C66698l;
import z41.C53737b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.sns.model.AdLandingPagesProxy */
public class AdLandingPagesProxy extends C96897a {

    /* renamed from: r */
    public static AdLandingPagesProxy f274678r;

    /* renamed from: s */
    public static final AtomicInteger f274679s = new AtomicInteger(0);

    /* renamed from: f */
    public Map<Long, C94830p> f274680f = new HashMap();

    /* renamed from: g */
    public Map<C117747y, Long> f274681g = new HashMap();

    /* renamed from: h */
    public C96905d f274682h;

    /* renamed from: i */
    public FollowUserEventListener f274683i;

    /* renamed from: j */
    public C11385n f274684j = new C43028c();

    /* renamed from: n */
    public ConcurrentHashMap<Long, ArrayList<C94827l>> f274685n = new ConcurrentHashMap<>();

    /* renamed from: o */
    public C100853b.C100856c f274686o = new C94822e();

    /* renamed from: p */
    public Map<String, List<C98559a0>> f274687p = new HashMap();

    /* renamed from: q */
    public Map<String, C98127h.C98128a> f274688q = new HashMap();

    /* renamed from: com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$c */
    public class C43028c implements C11385n {
        public C43028c() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            int i3 = i;
            int i4 = i2;
            String str2 = str;
            C117747y yVar2 = yVar;
            SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$1");
            StringBuilder sb = new StringBuilder();
            sb.append("onSceneEnd, funcId=");
            sb.append(yVar2 == null ? 0 : yVar.getType());
            sb.append(", errType=");
            sb.append(i3);
            sb.append(", errCode=");
            sb.append(i4);
            sb.append(", errMsg=");
            sb.append(str2);
            Log.m105924i("AdLandingPagesProxy", sb.toString());
            String str3 = "";
            if (yVar2 instanceof C53559k) {
                if (i3 == 0 && i4 == 0) {
                    str3 = ((C53559k) yVar2).mo74210j1();
                    Log.m105924i("AdLandingPagesProxy", "the dynamic string is " + str3 + ", sceneType is " + yVar.getType());
                } else {
                    Log.m105920e("AdLandingPagesProxy", "the netscene is error ,error type is " + i3 + " error msg is " + str2 + " sceneType is " + yVar.getType());
                }
                if (((HashMap) AdLandingPagesProxy.m120129c(AdLandingPagesProxy.this)).containsKey(yVar2)) {
                    AdLandingPagesProxy.this.CLIENT_CALL("onDynamicUpdateEnd", Long.valueOf(((Long) ((HashMap) AdLandingPagesProxy.m120129c(AdLandingPagesProxy.this)).remove(yVar2)).longValue()), str3);
                    C86709a0.m107524d().mo123470p(yVar.getType(), AdLandingPagesProxy.m120130e(AdLandingPagesProxy.this));
                }
            } else if (yVar2 instanceof C53553b) {
                if (((HashMap) AdLandingPagesProxy.m120129c(AdLandingPagesProxy.this)).containsKey(yVar2)) {
                    try {
                        long longValue = ((Long) ((HashMap) AdLandingPagesProxy.m120129c(AdLandingPagesProxy.this)).remove(yVar2)).longValue();
                        Log.m105925i("AdLandingPagesProxy", "NetSceneAdChannelPkgInfo onSceneEnd, id %d", Long.valueOf(longValue));
                        C52157yr yrVar = (C52157yr) ((C47350c) yVar.getReqResp()).mo72395b();
                        AdLandingPagesProxy.this.CLIENT_CALL("onAdChannelEnd", Long.valueOf(longValue), Integer.valueOf(i), Integer.valueOf(i2), (i3 == 0 && i4 == 0 && yrVar != null) ? yrVar.toByteArray() : null);
                        C86709a0.m107524d().mo123470p(yVar.getType(), AdLandingPagesProxy.m120130e(AdLandingPagesProxy.this));
                    } catch (Exception e) {
                        Log.m105920e("AdLandingPagesProxy", Util.stackTraceToString(e));
                    }
                }
            } else if (yVar2 instanceof C39156j) {
                if (((HashMap) AdLandingPagesProxy.m120129c(AdLandingPagesProxy.this)).containsKey(yVar2)) {
                    AdLandingPagesProxy.this.CLIENT_CALL("onFavOfficialItemEnd", Long.valueOf(((Long) ((HashMap) AdLandingPagesProxy.m120129c(AdLandingPagesProxy.this)).remove(yVar2)).longValue()), ((C39156j) yVar2).mo61961j1(), Integer.valueOf(i), Integer.valueOf(i2));
                    C86709a0.m107524d().mo123470p(yVar.getType(), AdLandingPagesProxy.m120130e(AdLandingPagesProxy.this));
                }
            } else if (yVar2 instanceof C46565k) {
                Log.m105924i("AdLandingPagesProxy", "real time report done.");
                C86709a0.m107524d().mo123470p(yVar.getType(), AdLandingPagesProxy.m120130e(AdLandingPagesProxy.this));
            } else if (yVar2 instanceof C53556e) {
                if (((HashMap) AdLandingPagesProxy.m120129c(AdLandingPagesProxy.this)).containsKey(yVar2)) {
                    try {
                        long longValue2 = ((Long) ((HashMap) AdLandingPagesProxy.m120129c(AdLandingPagesProxy.this)).remove(yVar2)).longValue();
                        Log.m105925i("AdLandingPagesProxy", "NetSceneAdGetSmartPhoneNumber onSceneEnd, id %d", Long.valueOf(longValue2));
                        C49788i22 i222 = (C49788i22) ((C47350c) yVar.getReqResp()).mo72395b();
                        AdLandingPagesProxy.this.CLIENT_CALL("onGetSmartPhoneScene", Long.valueOf(longValue2), Integer.valueOf(i), Integer.valueOf(i2), (i3 == 0 && i4 == 0 && i222 != null) ? i222.toByteArray() : null);
                        C86709a0.m107524d().mo123470p(yVar.getType(), AdLandingPagesProxy.m120130e(AdLandingPagesProxy.this));
                    } catch (Exception e2) {
                        Log.m105920e("AdLandingPagesProxy", "NetSceneAdGetSmartPhoneNumber onSceneEnd exp=" + e2.toString());
                    }
                }
            } else if (yVar2 instanceof C53560m) {
                if (((HashMap) AdLandingPagesProxy.m120129c(AdLandingPagesProxy.this)).containsKey(yVar2)) {
                    try {
                        long longValue3 = ((Long) ((HashMap) AdLandingPagesProxy.m120129c(AdLandingPagesProxy.this)).remove(yVar2)).longValue();
                        Log.m105925i("AdLandingPagesProxy", "NetSceneUpdateUxInfo onSceneEnd, id %d", Long.valueOf(longValue3));
                        hm4 hm4 = (hm4) ((C47350c) yVar.getReqResp()).mo72395b();
                        if (i3 == 0 && i4 == 0 && hm4 != null) {
                            str3 = hm4.f134741d;
                        }
                        AdLandingPagesProxy.this.CLIENT_CALL("onUpdateUxInfo", Long.valueOf(longValue3), Integer.valueOf(i), Integer.valueOf(i2), str3);
                        C86709a0.m107524d().mo123470p(yVar.getType(), AdLandingPagesProxy.m120130e(AdLandingPagesProxy.this));
                    } catch (Exception e3) {
                        Log.m105920e("AdLandingPagesProxy", "NetSceneUpdateUxInfo onSceneEnd exp=" + e3.toString());
                    }
                }
            } else if (yVar2 instanceof C53555d) {
                if (((HashMap) AdLandingPagesProxy.m120129c(AdLandingPagesProxy.this)).containsKey(yVar2)) {
                    long longValue4 = ((Long) ((HashMap) AdLandingPagesProxy.m120129c(AdLandingPagesProxy.this)).remove(yVar2)).longValue();
                    Log.m105925i("AdLandingPagesProxy", "NetSceneAdGetHbCoverState onSceneEnd, id %d", Long.valueOf(longValue4));
                    int i5 = -1;
                    try {
                        C50007jl3 jl32 = (C50007jl3) ((C47350c) yVar.getReqResp()).mo72395b();
                        if (i3 == 0 && i4 == 0 && jl32 != null) {
                            i5 = jl32.f136180d;
                        }
                        AdLandingPagesProxy.this.CLIENT_CALL("onGetHbCoverStateScene", Long.valueOf(longValue4), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i5));
                        C86709a0.m107524d().mo123470p(yVar.getType(), AdLandingPagesProxy.m120130e(AdLandingPagesProxy.this));
                    } catch (Exception e4) {
                        Log.m105920e("AdLandingPagesProxy", "NetSceneAdGetHbCoverState onSceneEnd exp=" + e4.toString());
                    }
                }
            } else if (yVar2 instanceof C66698l) {
                try {
                    if (((HashMap) AdLandingPagesProxy.m120129c(AdLandingPagesProxy.this)).containsKey(yVar2)) {
                        long longValue5 = ((Long) ((HashMap) AdLandingPagesProxy.m120129c(AdLandingPagesProxy.this)).remove(yVar2)).longValue();
                        Log.m105925i("AdLandingPagesProxy", "NetSceneUpdateQrUrl onSceneEnd, id %d", Long.valueOf(longValue5));
                        C52075y62 y622 = (C52075y62) ((C47350c) yVar.getReqResp()).mo72395b();
                        AdLandingPagesProxy.this.CLIENT_CALL("onAdUpdateQrUrlEnd", Long.valueOf(longValue5), Integer.valueOf(i), Integer.valueOf(i2), (i3 == 0 && i4 == 0 && y622 != null) ? y622.toByteArray() : null);
                        C86709a0.m107524d().mo123470p(yVar.getType(), AdLandingPagesProxy.m120130e(AdLandingPagesProxy.this));
                    }
                } catch (Throwable th) {
                    Log.m105920e("AdLandingPagesProxy", "NetSceneUpdateQrUrl onSceneEnd exp=" + th.toString());
                }
            } else if ((yVar2 instanceof C48464g) || (yVar2 instanceof C28611c)) {
                try {
                    if (((HashMap) AdLandingPagesProxy.m120129c(AdLandingPagesProxy.this)).containsKey(yVar2)) {
                        Log.m105918d("AdLandingPagesProxy", "onSceneEnd, errType = " + i3 + ", errCode = " + i4 + "," + str2);
                        long longValue6 = ((Long) ((HashMap) AdLandingPagesProxy.m120129c(AdLandingPagesProxy.this)).remove(yVar2)).longValue();
                        if (yVar.getType() != 30 && yVar.getType() != 667) {
                            Log.m105928w("AdLandingPagesProxy", "not expected scene,  type = " + yVar.getType());
                            SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$1");
                            return;
                        } else if (!(yVar2 instanceof C28611c) || ((C28611c) yVar2).mo56095v0() == 1) {
                            JSONObject jSONObject = new JSONObject();
                            if (i3 == 0 && i4 == 0) {
                                if (yVar.getType() == 30) {
                                    str3 = ((C28611c) yVar2).mo56091T0();
                                } else if (yVar.getType() == 667) {
                                    str3 = ((C48464g) yVar2).mo71849i();
                                }
                            }
                            jSONObject.put("errMsg", str2);
                            jSONObject.put("respUsername", str3);
                            AdLandingPagesProxy.this.CLIENT_CALL("onAddBrandSceneEnd", Long.valueOf(longValue6), Integer.valueOf(i), Integer.valueOf(i2), jSONObject.toString());
                            C43035c.m46670b(AdLandingPagesProxy.m120130e(AdLandingPagesProxy.this));
                        } else {
                            Log.m105920e("AdLandingPagesProxy", "not opcode addcontact!");
                            SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$1");
                            return;
                        }
                    }
                } catch (Throwable th4) {
                    Log.m105920e("AdLandingPagesProxy", "NetSceneAddOpenIMContact or NetSceneVerifyUser onSceneEnd exp=" + th4.toString());
                }
            } else if (yVar2 instanceof C46287c) {
                try {
                    if (((HashMap) AdLandingPagesProxy.m120129c(AdLandingPagesProxy.this)).containsKey(yVar2)) {
                        long longValue7 = ((Long) ((HashMap) AdLandingPagesProxy.m120129c(AdLandingPagesProxy.this)).remove(yVar2)).longValue();
                        C77967mx3 mx32 = (C77967mx3) ((C47350c) yVar.getReqResp()).mo72395b();
                        AdLandingPagesProxy.this.CLIENT_CALL("onSearchContact", Long.valueOf(longValue7), Integer.valueOf(i), Integer.valueOf(i2), (i3 == 0 && i4 == 0 && mx32 != null) ? mx32.toByteArray() : null);
                    }
                } catch (Throwable th5) {
                    Log.m105920e("AdLandingPagesProxy", "NetSceneSearchContact, onSceneEnd exp=" + th5.toString());
                }
                C86709a0.m107524d().mo123470p(yVar.getType(), AdLandingPagesProxy.m120130e(AdLandingPagesProxy.this));
            } else if (yVar2 instanceof C53552a) {
                try {
                    if (((HashMap) AdLandingPagesProxy.m120129c(AdLandingPagesProxy.this)).containsKey(yVar2)) {
                        long longValue8 = ((Long) ((HashMap) AdLandingPagesProxy.m120129c(AdLandingPagesProxy.this)).remove(yVar2)).longValue();
                        C51767w1 w1Var = (C51767w1) ((C47350c) yVar.getReqResp()).mo72395b();
                        AdLandingPagesProxy.this.CLIENT_CALL("onAdNativeAntiAbuse", Long.valueOf(longValue8), Integer.valueOf(i), Integer.valueOf(i2), (i3 == 0 && i4 == 0 && w1Var != null) ? w1Var.toByteArray() : null);
                    }
                } catch (Throwable th6) {
                    Log.m105920e("AdLandingPagesProxy", "NetSceneAdAntiAbuse, onSceneEnd exp = " + th6.toString());
                }
                C86709a0.m107524d().mo123470p(yVar.getType(), AdLandingPagesProxy.m120130e(AdLandingPagesProxy.this));
            } else if (yVar2 instanceof C46884e) {
                try {
                    if (((HashMap) AdLandingPagesProxy.m120129c(AdLandingPagesProxy.this)).containsKey(yVar2)) {
                        long longValue9 = ((Long) ((HashMap) AdLandingPagesProxy.m120129c(AdLandingPagesProxy.this)).remove(yVar2)).longValue();
                        int i6 = ((C49355f0) ((C47350c) yVar.getReqResp()).mo72394a()).f133214f;
                        String str4 = "-1";
                        if (i3 == 0 && i4 == 0) {
                            str4 = String.valueOf(((C49492g0) ((C47350c) yVar.getReqResp()).mo72395b()).f133754d);
                        }
                        Log.m105924i("AdLandingPagesProxy", "NetSceneAdAppointment, errType=" + i3 + ", errCode=" + i4 + ", errMsg=" + str2 + ", opType=" + i6 + ", status=" + str4);
                        AdLandingPagesProxy.this.CLIENT_CALL("onSendAppointmentReq", Long.valueOf(longValue9), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i6), str4);
                    }
                } catch (Throwable th7) {
                    Log.m105920e("AdLandingPagesProxy", "NetSceneAdAppointment, onSceneEnd exp = " + th7.toString());
                }
                C86709a0.m107524d().mo123470p(yVar.getType(), AdLandingPagesProxy.m120130e(AdLandingPagesProxy.this));
            } else if (yVar2 != null) {
                try {
                    if (((HashMap) AdLandingPagesProxy.m120129c(AdLandingPagesProxy.this)).containsKey(yVar2)) {
                        long longValue10 = ((Long) ((HashMap) AdLandingPagesProxy.m120129c(AdLandingPagesProxy.this)).remove(yVar2)).longValue();
                        C47465a b = ((C47350c) yVar.getReqResp()).mo72395b();
                        AdLandingPagesProxy.this.CLIENT_CALL("onRspCallbackCommon", Long.valueOf(longValue10), Integer.valueOf(i), Integer.valueOf(i2), (i3 == 0 && i4 == 0 && b != null) ? b.toByteArray() : null);
                    }
                } catch (Throwable th8) {
                    Log.m105920e("AdLandingPagesProxy", "default, onSceneEnd exp=" + th8.toString());
                }
                C86709a0.m107524d().mo123470p(yVar.getType(), AdLandingPagesProxy.m120130e(AdLandingPagesProxy.this));
            }
            SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$d */
    public class C43029d implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ long f116476d;

        public C43029d(long j) {
            this.f116476d = j;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$2");
            Log.m105924i("AdLandingPagesProxy", "getBtnPersonalWxUserNameMM, errType=" + i + ", errCode=" + i2 + ", errMsg=" + str);
            if (i == 0 && i2 == 0) {
                C49263ec2 ec22 = (C49263ec2) ((C47350c) yVar.getReqResp()).f127056b.f127083a;
                if (ec22 == null || TextUtils.isEmpty(ec22.f132864e)) {
                    Log.m105920e("AdLandingPagesProxy", "getBtnPersonalWxUserNameMM, rsp==null");
                    AdLandingPagesProxy.this.CLIENT_CALL("onSearchContact", Long.valueOf(this.f116476d), Integer.valueOf(i), Integer.valueOf(i2), null);
                } else {
                    AdLandingPagesProxy.this.CLIENT_CALL("onGetBtnPersonalWxUserName", Long.valueOf(this.f116476d), ec22.f132863d, ec22.f132864e);
                    AdLandingPagesProxy.this.doSearchContactMM(this.f116476d, ec22.f132864e);
                }
            } else {
                Log.m105920e("AdLandingPagesProxy", "getBtnPersonalWxUserNameMM, failed");
                AdLandingPagesProxy.this.CLIENT_CALL("onSearchContact", Long.valueOf(this.f116476d), Integer.valueOf(i), Integer.valueOf(i2), null);
            }
            C86709a0.m107524d().mo123470p(yVar.getType(), this);
            SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$i */
    public class C43030i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f116478d;

        /* renamed from: e */
        public final /* synthetic */ String f116479e;

        /* renamed from: f */
        public final /* synthetic */ long f116480f;

        /* renamed from: com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$i$a */
        public class C43031a implements C88631d.C88632b<C51216sa2> {
            public C43031a() {
            }

            /* renamed from: a */
            public void mo1772a(Object obj) {
                SnsMethodCalculate.markStartTimeMs("onTerminate", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$7$1");
                C51216sa2 sa22 = (C51216sa2) obj;
                SnsMethodCalculate.markStartTimeMs("onTerminate", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$7$1");
                if (sa22 == null) {
                    SnsMethodCalculate.markEndTimeMs("onTerminate", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$7$1");
                } else {
                    byte[] bArr = null;
                    int i = -1;
                    try {
                        i = sa22.f141401d;
                        bArr = sa22.toByteArray();
                        Log.m105924i("AdLandingPagesProxy", "fetchQRCodeInfoMM end, ret=" + sa22.f141401d + ", urlType=" + sa22.f141404g + ", actionCode=" + sa22.f141403f);
                    } catch (Exception e) {
                        Log.m105920e("AdLandingPagesProxy", "fetchQRCodeInfoMM, exp=" + e.toString());
                    }
                    C43030i iVar = C43030i.this;
                    AdLandingPagesProxy.this.CLIENT_CALL("onFetchQRCodeInfo", Long.valueOf(iVar.f116480f), Integer.valueOf(i), 0, bArr);
                    SnsMethodCalculate.markEndTimeMs("onTerminate", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$7$1");
                }
                SnsMethodCalculate.markEndTimeMs("onTerminate", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$7$1");
            }
        }

        public C43030i(int i, String str, long j) {
            this.f116478d = i;
            this.f116479e = str;
            this.f116480f = j;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$7");
            C46897s xp02 = ((C46896e0) C86312j.m106911c(C46896e0.class)).xp0();
            int i = this.f116478d;
            String str = this.f116479e;
            C42902i iVar = (C42902i) xp02;
            iVar.getClass();
            iVar.mo67099a(i, new C46897s.C46898a(str)).mo114038a(new C43031a());
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$7");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$j */
    public class C43032j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C72996z1 f116483d;

        /* renamed from: e */
        public final /* synthetic */ C44668u3 f116484e;

        public C43032j(AdLandingPagesProxy adLandingPagesProxy, C72996z1 z1Var, C44668u3 u3Var) {
            this.f116483d = z1Var;
            this.f116484e = u3Var;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$8");
            try {
                C72996z1 z1Var = this.f116483d;
                if (((int) z1Var.f108320R1) == 0) {
                    this.f116484e.mo69707j3(z1Var);
                }
                C72996z1 z1Var2 = this.f116483d;
                if (((int) z1Var2.f108320R1) <= 0) {
                    Log.m105920e("AdLandingPagesProxy", "addContact : insert contact failed");
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$8");
                    return;
                }
                C45628s0.m50775g0(z1Var2);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$8");
            } catch (Throwable th) {
                Log.m105920e("AdLandingPagesProxy", th.toString());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$k */
    public class C43033k implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f116485d;

        /* renamed from: e */
        public final /* synthetic */ long f116486e;

        public C43033k(String str, long j) {
            this.f116485d = str;
            this.f116486e = j;
        }

        public void run() {
            Class cls = C79138l.class;
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$9");
            String str = "";
            try {
                C44561j appInfo = ((C79138l) C86312j.m106911c(cls)).getAppInfo(this.f116485d);
                if (appInfo == null) {
                    Log.m105924i("AdLandingPagesProxy", "getOpenSdkAppInfoMM, no cahcer, appId=" + this.f116485d);
                    appInfo = ((C79138l) C86312j.m106911c(cls)).mo74001TT(this.f116485d, true);
                } else {
                    Log.m105924i("AdLandingPagesProxy", "getOpenSdkAppInfoMM, hit cache, appId=" + this.f116485d);
                }
                if (appInfo != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("icon", Util.nullAsNil(appInfo.field_appIconUrl));
                        jSONObject.put("name", Util.nullAsNil(appInfo.field_appName));
                        jSONObject.put("pkg", Util.nullAsNil(appInfo.field_packageName));
                        str = jSONObject.toString();
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                Log.m105920e("AdLandingPagesProxy", "getOpenSdkAppInfoMM, exp=" + th.toString());
            }
            AdLandingPagesProxy.this.CLIENT_CALL("onGetOpenSdkAppInfo", str, Long.valueOf(this.f116486e));
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$9");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$FollowUserEventListener */
    public class FollowUserEventListener extends IListener<FollowUserEvent> {

        /* renamed from: d */
        public long f164325d;

        /* renamed from: e */
        public String f164326e;

        public FollowUserEventListener(long j, String str) {
            super(C40008f.f107254d);
            this.f164325d = j;
            this.f164326e = str;
            this.__eventId = 398763182;
        }

        public boolean callback(IEvent iEvent) {
            SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$FollowUserEventListener");
            FollowUserEvent followUserEvent = (FollowUserEvent) iEvent;
            SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$FollowUserEventListener");
            if (followUserEvent == null || followUserEvent.f154820d == null) {
                Log.m105928w("AdLandingPagesProxy", "FollowUserEventListener, event.data==null");
            } else {
                Log.m105924i("AdLandingPagesProxy", "FollowUserEventListener, result=" + followUserEvent.f154820d.f154823c + ", opType=" + followUserEvent.f154820d.f154822b + ", opScene=" + followUserEvent.f154820d.f154824d + ", finderUserName=" + followUserEvent.f154820d.f154821a);
                FollowUserEvent.C55139a aVar = followUserEvent.f154820d;
                if (aVar.f154822b == 1 && aVar.f154824d == 102 && this.f164326e.equals(aVar.f154821a)) {
                    String str = "";
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("followType", 2);
                        jSONObject.put("followRet", followUserEvent.f154820d.f154823c);
                        str = jSONObject.toString();
                        AdLandingPagesProxy adLandingPagesProxy = AdLandingPagesProxy.this;
                        AdLandingPagesProxy adLandingPagesProxy2 = AdLandingPagesProxy.f274678r;
                        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                        FollowUserEventListener followUserEventListener = adLandingPagesProxy.f274683i;
                        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                        if (followUserEventListener != null) {
                            AdLandingPagesProxy adLandingPagesProxy3 = AdLandingPagesProxy.this;
                            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                            FollowUserEventListener followUserEventListener2 = adLandingPagesProxy3.f274683i;
                            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                            followUserEventListener2.dead();
                            AdLandingPagesProxy adLandingPagesProxy4 = AdLandingPagesProxy.this;
                            SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                            adLandingPagesProxy4.f274683i = null;
                            SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                        }
                    } catch (Throwable th) {
                        Log.m105920e("AdLandingPagesProxy", "FollowUserEventListener, exp is " + th.toString());
                    }
                    AdLandingPagesProxy.this.CLIENT_CALL("onGetBtnAdFinderContact", Long.valueOf(this.f164325d), str);
                } else {
                    Log.m105928w("AdLandingPagesProxy", "FollowUserEventListener, event from other");
                }
            }
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$FollowUserEventListener");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$FollowUserEventListener");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$a */
    public class C57351a implements C60208v1.C60209a {

        /* renamed from: a */
        public final /* synthetic */ long f164328a;

        public C57351a(long j) {
            this.f164328a = j;
        }

        /* renamed from: a */
        public void mo78737a(C60187m5 m5Var) {
            String str;
            SnsMethodCalculate.markStartTimeMs("onDone", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$10");
            if (m5Var != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("followType", 1);
                    jSONObject.put("followFlg", m5Var.getFollowFlag());
                    jSONObject.put("followNum", m5Var.mo84186k2());
                    jSONObject.put("feedNum", m5Var.getFeedCount());
                    jSONObject.put("errCode", m5Var.isValid() ? 0 : 1);
                    str = jSONObject.toString();
                } catch (Throwable th) {
                    Log.m105920e("AdLandingPagesProxy", "getAdFinderContactMM, exp is " + th.toString());
                }
                AdLandingPagesProxy.this.CLIENT_CALL("onGetBtnAdFinderContact", Long.valueOf(this.f164328a), str);
                SnsMethodCalculate.markEndTimeMs("onDone", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$10");
            }
            str = "";
            AdLandingPagesProxy.this.CLIENT_CALL("onGetBtnAdFinderContact", Long.valueOf(this.f164328a), str);
            SnsMethodCalculate.markEndTimeMs("onDone", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$10");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$o */
    public class C57352o implements C98127h.C98128a {

        /* renamed from: d */
        public String f164330d;

        public C57352o(String str) {
            this.f164330d = str;
        }

        /* renamed from: e */
        public void mo17917e(String str, long j, long j2) {
            SnsMethodCalculate.markStartTimeMs("onProgress", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNVideoDownloadCallback");
            if (str.equals(this.f164330d)) {
                AdLandingPagesProxy.this.CLIENT_CALL("onCdnVideoProgress", str, Long.valueOf(j), Long.valueOf(j2));
            }
            SnsMethodCalculate.markEndTimeMs("onProgress", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNVideoDownloadCallback");
        }

        /* renamed from: g */
        public void mo17918g(String str, int i, C98121d dVar) {
            SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNVideoDownloadCallback");
            if (str.equals(this.f164330d)) {
                C115669n.INSTANCE.mo175911u(C8136w.CTRL_INDEX, 30);
                AdLandingPagesProxy.this.CLIENT_CALL("onCdnVideoFinish", str, Integer.valueOf(i));
            }
            SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNVideoDownloadCallback");
        }

        public void onDataAvailable(String str, long j, long j2) {
            SnsMethodCalculate.markStartTimeMs("onDataAvailable", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNVideoDownloadCallback");
            if (str.equals(this.f164330d)) {
                C115669n.INSTANCE.mo175911u(C8136w.CTRL_INDEX, 28);
                AdLandingPagesProxy.this.CLIENT_CALL("onCdnVideoDataAvailable", str, Long.valueOf(j), Long.valueOf(j2));
            }
            SnsMethodCalculate.markEndTimeMs("onDataAvailable", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNVideoDownloadCallback");
        }

        public void onM3U8Ready(String str, String str2) {
            SnsMethodCalculate.markStartTimeMs("onM3U8Ready", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNVideoDownloadCallback");
            SnsMethodCalculate.markEndTimeMs("onM3U8Ready", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNVideoDownloadCallback");
        }

        public void onMoovReady(String str, long j, long j2, CdnLogic.VideoInfo videoInfo) {
            SnsMethodCalculate.markStartTimeMs("onMoovReady", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNVideoDownloadCallback");
            if (str.equals(this.f164330d)) {
                C115669n.INSTANCE.mo175911u(C8136w.CTRL_INDEX, 26);
                AdLandingPagesProxy.this.CLIENT_CALL("onCdnVideoMoovReady", str, Long.valueOf(j), Long.valueOf(j2), videoInfo != null ? videoInfo.svrFlag : "");
            }
            SnsMethodCalculate.markEndTimeMs("onMoovReady", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNVideoDownloadCallback");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$b */
    public class C94821b implements C35631d0.C35635d {

        /* renamed from: a */
        public final /* synthetic */ long f274689a;

        /* renamed from: b */
        public final /* synthetic */ long f274690b;

        public C94821b(long j, long j2) {
            this.f274689a = j;
            this.f274690b = j2;
        }

        /* renamed from: a */
        public int mo60346a(boolean z, String str) {
            SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$11");
            try {
                Log.m105924i("AdLandingPagesProxy", "doRequestDynamicCanvasXml callback, isSuccess is " + z + ", pageId is " + this.f274689a);
                AdLandingPagesProxy.this.CLIENT_CALL("onGetAdCanvasXmlFromNet", Long.valueOf(this.f274690b), Boolean.valueOf(z), str);
            } catch (Throwable th) {
                Log.m105920e("AdLandingPagesProxy", "doRequestDynamicCanvasXml callback, exp is " + th);
            }
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$11");
            return 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$e */
    public class C94822e implements C100853b.C100856c {
        public C94822e() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$f */
    public class C94823f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C101804kv2 f274693d;

        /* renamed from: e */
        public final /* synthetic */ C102268v f274694e;

        /* renamed from: f */
        public final /* synthetic */ String f274695f;

        /* renamed from: g */
        public final /* synthetic */ String f274696g;

        public C94823f(C101804kv2 kv22, C102268v vVar, String str, String str2) {
            this.f274693d = kv22;
            this.f274694e = vVar;
            this.f274695f = str;
            this.f274696g = str2;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$4");
            C94866e1.Vx0().mo130978c(new C94829n(this.f274693d.f298689d));
            C94853e Vx0 = C94866e1.Vx0();
            C101804kv2 kv22 = this.f274693d;
            C102268v vVar = this.f274694e;
            C96983o3 c = C96983o3.m124651c();
            c.f284145b = (int) (System.currentTimeMillis() / 1000);
            Vx0.mo130982g(kv22, 8, vVar, c, this.f274695f, this.f274696g);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$4");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$g */
    public class C94824g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C101804kv2 f274698d;

        /* renamed from: e */
        public final /* synthetic */ String f274699e;

        /* renamed from: f */
        public final /* synthetic */ String f274700f;

        public C94824g(C101804kv2 kv22, String str, String str2) {
            this.f274698d = kv22;
            this.f274699e = str;
            this.f274700f = str2;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$5");
            C94866e1.Vx0().mo130978c(new C94829n(this.f274698d.f298689d));
            C94853e Vx0 = C94866e1.Vx0();
            C101804kv2 kv22 = this.f274698d;
            C96983o3 c = C96983o3.m124651c();
            c.f284145b = (int) (System.currentTimeMillis() / 1000);
            Vx0.mo130982g(kv22, 4, (C102268v) null, c, this.f274699e, this.f274700f);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$5");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$h */
    public class C94825h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f274702d;

        /* renamed from: e */
        public final /* synthetic */ String f274703e;

        /* renamed from: f */
        public final /* synthetic */ String f274704f;

        /* renamed from: g */
        public final /* synthetic */ int f274705g;

        /* renamed from: h */
        public final /* synthetic */ boolean f274706h;

        /* renamed from: i */
        public final /* synthetic */ int f274707i;

        /* renamed from: com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$h$a */
        public class C94826a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C94853e f274709d;

            public C94826a(C94853e eVar) {
                this.f274709d = eVar;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$6$1");
                C94853e eVar = this.f274709d;
                C94825h hVar = C94825h.this;
                String str = hVar.f274702d;
                eVar.mo130984i(str, hVar.f274703e, hVar.f274704f, hVar.f274705g, hVar.f274706h, hVar.f274707i, new C57352o(str));
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$6$1");
            }
        }

        public C94825h(String str, String str2, String str3, int i, boolean z, int i2) {
            this.f274702d = str;
            this.f274703e = str2;
            this.f274704f = str3;
            this.f274705g = i;
            this.f274706h = z;
            this.f274707i = i2;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$6");
            C86709a0.m107525e().postToWorker(new C94826a(C94866e1.Vx0()));
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$6");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$l */
    public interface C94827l {
        /* renamed from: a */
        void mo130929a();

        /* renamed from: b */
        void mo130930b();

        /* renamed from: c */
        void mo130931c(int i);

        /* renamed from: d */
        void mo130932d();

        /* renamed from: e */
        void mo130933e();

        /* renamed from: f */
        void mo130934f();

        void start();
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$m */
    public class C94828m implements C100853b.C100858e {

        /* renamed from: a */
        public String f274711a;

        /* renamed from: b */
        public String f274712b;

        /* renamed from: c */
        public boolean f274713c;

        /* renamed from: d */
        public int f274714d;

        public C94828m(String str, String str2, boolean z, int i) {
            this.f274712b = str2;
            this.f274711a = str;
            this.f274713c = z;
            this.f274714d = i;
        }

        /* renamed from: a */
        public void mo130936a(String str) {
            SnsMethodCalculate.markStartTimeMs("onPkgRemoved", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$ApkInstallCallback");
            Log.m105925i("AdLandingPagesProxy", "pkg %s removed", str);
            if (!Util.isNullOrNil(str) && str.equals(this.f274712b)) {
                AdLandingPagesProxy.this.deleteDeferredDeepLinkMM(str);
            }
            SnsMethodCalculate.markEndTimeMs("onPkgRemoved", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$ApkInstallCallback");
        }

        /* renamed from: b */
        public void mo130937b(String str) {
            String str2;
            String str3;
            SnsMethodCalculate.markStartTimeMs("onPkgInstalled", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$ApkInstallCallback");
            Log.m105925i("AdLandingPagesProxy", "pkg %s installed", str);
            if (this.f274713c) {
                C100853b.m132142e().mo140328l(4, this.f274711a);
            }
            C100853b.m132142e().mo140328l(5, this.f274711a);
            C100853b e = C100853b.m132142e();
            String str4 = this.f274711a;
            int i = this.f274714d;
            e.getClass();
            SnsMethodCalculate.markStartTimeMs("reportConversionDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            if (((C53737b) ((C29841c) C86312j.m106911c(C29841c.class)).mo56945gI()).mo74328qq(str4) == null) {
                Log.m105920e("MicroMsg.AdDownloadApkMgr", "fileDownloadInfo is null");
                SnsMethodCalculate.markEndTimeMs("reportConversionDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            } else {
                C100853b.C100859f fVar = e.f295373f.get(str4);
                if (fVar == null) {
                    Log.m105920e("MicroMsg.AdDownloadApkMgr", "reportInfo is null, appid = " + str4);
                    SnsMethodCalculate.markEndTimeMs("reportConversionDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
                } else {
                    SnsMethodCalculate.markStartTimeMs("getUxInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
                    String str5 = fVar.f295381f;
                    SnsMethodCalculate.markEndTimeMs("getUxInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
                    String str6 = fVar.f295382g;
                    int i2 = fVar.f295383h;
                    String str7 = fVar.f295384i;
                    SnsMethodCalculate.markStartTimeMs("getAid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
                    String str8 = fVar.f295379d;
                    SnsMethodCalculate.markEndTimeMs("getAid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
                    SnsMethodCalculate.markStartTimeMs("getTraceid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
                    String str9 = fVar.f295380e;
                    SnsMethodCalculate.markEndTimeMs("getTraceid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
                    String str10 = fVar.f295385j;
                    int i3 = fVar.f295386n;
                    SnsMethodCalculate.markStartTimeMs("setActor", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
                    SnsMethodCalculate.markEndTimeMs("setActor", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
                    String str11 = "onPkgInstalled";
                    str2 = "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$ApkInstallCallback";
                    int currentTimeMillis = (int) (System.currentTimeMillis() - fVar.f295387o);
                    SnsMethodCalculate.markStartTimeMs("setCostTime", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
                    SnsMethodCalculate.markEndTimeMs("setCostTime", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
                    ArrayList<Integer> arrayList = C99552l.f291829a;
                    SnsMethodCalculate.markStartTimeMs("reportInstallComplete", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                    try {
                        C102240d.C102242b bVar = new C102240d.C102242b();
                        str3 = str11;
                        try {
                            bVar.mo141803k(4001011);
                            bVar.mo141805m(str5);
                            bVar.mo141797e(str6);
                            bVar.mo141802j(i2);
                            bVar.mo141795c(str7);
                            bVar.mo141806n(str8);
                            bVar.mo141804l(str9);
                            bVar.mo141807o(str10);
                            bVar.mo141801i(4);
                            bVar.mo141796d(i3);
                            bVar.mo141794b(i);
                            bVar.mo141798f(currentTimeMillis);
                            C63505q.m74843b(bVar.mo141793a());
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        str3 = str11;
                        Log.m105920e("AdConversionOnlineReportHelper", "reportInstallComplete, exp is " + th.toString());
                        SnsMethodCalculate.markEndTimeMs("reportInstallComplete", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                        SnsMethodCalculate.markEndTimeMs("reportConversionDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
                        C115669n.INSTANCE.mo175911u(1958, 32);
                        SnsMethodCalculate.markEndTimeMs(str3, str2);
                    }
                    SnsMethodCalculate.markEndTimeMs("reportInstallComplete", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                    SnsMethodCalculate.markEndTimeMs("reportConversionDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
                    C115669n.INSTANCE.mo175911u(1958, 32);
                    SnsMethodCalculate.markEndTimeMs(str3, str2);
                }
            }
            str3 = "onPkgInstalled";
            str2 = "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$ApkInstallCallback";
            C115669n.INSTANCE.mo175911u(1958, 32);
            SnsMethodCalculate.markEndTimeMs(str3, str2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$n */
    public class C94829n implements C94853e.C94861h {

        /* renamed from: d */
        public String f274716d;

        public C94829n(String str) {
            this.f274716d = str;
        }

        public void onImageFinish(String str, boolean z) {
            SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNMediaDownloadListener");
            Log.m105924i("AdLandingPagesProxy", "onImageFinish, mediaId=" + str + ", isOk=" + z);
            if (!Util.isNullOrNil(str, this.f274716d) && str.equals(this.f274716d)) {
                AdLandingPagesProxy.this.CLIENT_CALL("onImgDownloadCallback", str, Boolean.valueOf(z));
                C94866e1.Vx0().mo130997v(this);
            }
            SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNMediaDownloadListener");
        }

        public void onSetbg() {
            SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNMediaDownloadListener");
            SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNMediaDownloadListener");
        }

        public void onSightFinish(String str, boolean z) {
            SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNMediaDownloadListener");
            Log.m105924i("AdLandingPagesProxy", "onSightFinish, mediaId=" + str + ", isOk=" + z);
            if (!Util.isNullOrNil(str, this.f274716d) && str.equals(this.f274716d)) {
                AdLandingPagesProxy.this.CLIENT_CALL("onSightDownloadCallback", str, Boolean.valueOf(z));
                C94866e1.Vx0().mo130997v(this);
            }
            SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNMediaDownloadListener");
        }

        public void onThumbFinish(String str) {
            SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNMediaDownloadListener");
            SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNMediaDownloadListener");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$p */
    public interface C94830p {
        /* renamed from: a */
        void mo10855a(Object obj);

        /* renamed from: b */
        void mo10856b(int i, int i2, Object obj);
    }

    public AdLandingPagesProxy(C96905d dVar) {
        super(dVar);
        this.f274682h = dVar;
    }

    /* renamed from: c */
    public static /* synthetic */ Map m120129c(AdLandingPagesProxy adLandingPagesProxy) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Map<C117747y, Long> map = adLandingPagesProxy.f274681g;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return map;
    }

    /* renamed from: e */
    public static /* synthetic */ C11385n m120130e(AdLandingPagesProxy adLandingPagesProxy) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C11385n nVar = adLandingPagesProxy.f274684j;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return nVar;
    }

    public static AdLandingPagesProxy getInstance() {
        SnsMethodCalculate.markStartTimeMs("getInstance", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        if (f274678r == null) {
            C96905d dVar = new C96905d(MMApplicationContext.getContext());
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            f274678r = new AdLandingPagesProxy(dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        }
        AdLandingPagesProxy adLandingPagesProxy = f274678r;
        SnsMethodCalculate.markEndTimeMs("getInstance", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return adLandingPagesProxy;
    }

    public void addAdFinderContract(C92442i iVar, int i, C94830p pVar) {
        SnsMethodCalculate.markStartTimeMs("addAdFinderContract", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = System.currentTimeMillis();
        ((HashMap) this.f274680f).put(Long.valueOf(currentTimeMillis), pVar);
        REMOTE_CALL("doAddAdFinderContractMM", Long.valueOf(currentTimeMillis), iVar.f264532a, iVar.f264533b, iVar.f264535d, iVar.f264534c, iVar.f264536e, iVar.f264537f, iVar.f264538g, Integer.valueOf(i));
        SnsMethodCalculate.markEndTimeMs("addAdFinderContract", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void addReportInfo(String str, String str2, String str3, String str4, C95144m0.C95147c cVar) {
        SnsMethodCalculate.markStartTimeMs("addReportInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        REMOTE_CALL("addReportInfoMM", str, str2, str3, str4, cVar);
        SnsMethodCalculate.markEndTimeMs("addReportInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void addReportInfoMM(String str, String str2, String str3, String str4, C95144m0.C95147c cVar) {
        String str5 = str;
        C95144m0.C95147c cVar2 = cVar;
        SnsMethodCalculate.markStartTimeMs("addReportInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C100853b e = C100853b.m132142e();
        e.getClass();
        SnsMethodCalculate.markStartTimeMs("addReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        if (str5 == null || str.length() == 0 || cVar2 == null) {
            SnsMethodCalculate.markEndTimeMs("addReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        } else {
            e.f295373f.put(str5, new C100853b.C100859f(str2, str3, str4, cVar2.f276172d, cVar2.f276173e, cVar2.f276174f, cVar2.f276175g, cVar2.f276176h));
            SnsMethodCalculate.markEndTimeMs("addReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        }
        SnsMethodCalculate.markEndTimeMs("addReportInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86513a
    public void clearCallback() {
        SnsMethodCalculate.markStartTimeMs("clearCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        REMOTE_CALL("clearCallbackMM", new Object[0]);
        synchronized (this.f274687p) {
            try {
                ((HashMap) this.f274687p).clear();
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("clearCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                    throw th;
                }
            }
        }
        ((HashMap) this.f274680f).clear();
        this.f274685n.clear();
        SnsMethodCalculate.markEndTimeMs("clearCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void clearCallbackMM() {
        SnsMethodCalculate.markStartTimeMs("clearCallbackMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ((HashMap) this.f274681g).clear();
        this.f274686o = null;
        SnsMethodCalculate.markStartTimeMs("removeOnSceneEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(1337, this.f274684j);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(1210, this.f274684j);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(2874, this.f274684j);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(2721, this.f274684j);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(1802, this.f274684j);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(2605, this.f274684j);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(2883, this.f274684j);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(4353, this.f274684j);
        SnsMethodCalculate.markEndTimeMs("removeOnSceneEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        SnsMethodCalculate.markEndTimeMs("clearCallbackMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void confirmDialPhoneNum(Activity activity, String str) {
        SnsMethodCalculate.markStartTimeMs("confirmDialPhoneNum", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        if (str == null || str.length() <= 0) {
            SnsMethodCalculate.markEndTimeMs("confirmDialPhoneNum", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return;
        }
        Intent intent = new Intent(MMApplicationContext.getContext(), SnsTransparentUI.class);
        intent.putExtra("phoneNum", str);
        intent.putExtra("op", 4);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/plugin/sns/model/AdLandingPagesProxy", "confirmDialPhoneNum", "(Landroid/app/Activity;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(activity, "com/tencent/mm/plugin/sns/model/AdLandingPagesProxy", "confirmDialPhoneNum", "(Landroid/app/Activity;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        SnsMethodCalculate.markEndTimeMs("confirmDialPhoneNum", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void connect(Runnable runnable) {
        SnsMethodCalculate.markStartTimeMs("connect", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        this.f274682h.mo135257a(runnable);
        SnsMethodCalculate.markEndTimeMs("connect", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public int contactGetTypeTextFromUserName(String str) {
        SnsMethodCalculate.markStartTimeMs("contactGetTypeTextFromUserName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        int i = 0;
        Object REMOTE_CALL = REMOTE_CALL("contactGetTypeTextFromUserNameMM", str);
        if (REMOTE_CALL != null) {
            i = ((Integer) REMOTE_CALL).intValue();
        }
        SnsMethodCalculate.markEndTimeMs("contactGetTypeTextFromUserName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return i;
    }

    @C86514b
    public int contactGetTypeTextFromUserNameMM(String str) {
        SnsMethodCalculate.markStartTimeMs("contactGetTypeTextFromUserNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        int y = C45628s0.m50810y(str);
        SnsMethodCalculate.markEndTimeMs("contactGetTypeTextFromUserNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return y;
    }

    public void deleteDeferredDeepLink(String str) {
        SnsMethodCalculate.markStartTimeMs("deleteDeferredDeepLink", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        REMOTE_CALL("deleteDeferredDeepLinkMM", str);
        SnsMethodCalculate.markEndTimeMs("deleteDeferredDeepLink", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void deleteDeferredDeepLinkMM(String str) {
        SnsMethodCalculate.markStartTimeMs("deleteDeferredDeepLinkMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        mo130839j().edit().remove(str).commit();
        SnsMethodCalculate.markEndTimeMs("deleteDeferredDeepLinkMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void doAdChannelScene(String str, String str2, C94830p pVar, boolean z) {
        SnsMethodCalculate.markStartTimeMs("doAdChannelScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = System.currentTimeMillis();
        ((HashMap) this.f274680f).put(Long.valueOf(currentTimeMillis), pVar);
        REMOTE_CALL("doAdChannelSceneMM", Long.valueOf(currentTimeMillis), str, str2, Boolean.valueOf(z));
        SnsMethodCalculate.markEndTimeMs("doAdChannelScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void doAdChannelSceneMM(long j, String str, String str2, boolean z) {
        SnsMethodCalculate.markStartTimeMs("doAdChannelSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C53553b bVar = new C53553b(str, str2, z);
        ((HashMap) this.f274681g).put(bVar, Long.valueOf(j));
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(bVar);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(1210, this.f274684j);
        SnsMethodCalculate.markEndTimeMs("doAdChannelSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void doAdNativeAntiAbuseScene(String str, String str2, String str3, int i, String str4, C94830p pVar) {
        SnsMethodCalculate.markStartTimeMs("doAdNativeAntiAbuseScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = System.currentTimeMillis();
        ((HashMap) this.f274680f).put(Long.valueOf(currentTimeMillis), pVar);
        REMOTE_CALL("doAdNativeAntiAbuseSceneMM", Long.valueOf(currentTimeMillis), str, str2, str3, Integer.valueOf(i), str4);
        SnsMethodCalculate.markEndTimeMs("doAdNativeAntiAbuseScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void doAdNativeAntiAbuseSceneMM(long j, String str, String str2, String str3, int i, String str4) {
        SnsMethodCalculate.markStartTimeMs("doAdNativeAntiAbuseSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C53552a aVar = new C53552a(str, str2, str3, i, str4);
        ((HashMap) this.f274681g).put(aVar, Long.valueOf(j));
        C86709a0.m107524d().mo123455a(4679, this.f274684j);
        C86709a0.m107524d().mo123460f(aVar);
        SnsMethodCalculate.markEndTimeMs("doAdNativeAntiAbuseSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void doAdUpdateQrUrlScene(String str, String str2, String str3, String str4, String str5, String str6, C94830p pVar) {
        SnsMethodCalculate.markStartTimeMs("doAdUpdateQrUrlScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long incrementAndGet = (long) f274679s.incrementAndGet();
        ((HashMap) this.f274680f).put(Long.valueOf(incrementAndGet), pVar);
        REMOTE_CALL("doAdUpdateQrUrlSceneMM", Long.valueOf(incrementAndGet), str, str2, str3, str4, str5, str6);
        SnsMethodCalculate.markEndTimeMs("doAdUpdateQrUrlScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void doAdUpdateQrUrlSceneMM(long j, String str, String str2, String str3, String str4, String str5, String str6) {
        SnsMethodCalculate.markStartTimeMs("doAdUpdateQrUrlSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C66698l lVar = new C66698l(str, str2, str3, str4, str5, str6);
        ((HashMap) this.f274681g).put(lVar, Long.valueOf(j));
        C86709a0.m107524d().mo123455a(TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED, this.f274684j);
        C86709a0.m107524d().mo123460f(lVar);
        SnsMethodCalculate.markEndTimeMs("doAdUpdateQrUrlSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void doAddAdFinderContractMM(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        String str8 = str;
        SnsMethodCalculate.markStartTimeMs("doAddAdFinderContractMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        SnsMethodCalculate.markStartTimeMs("doFollowFinder", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Log.m105924i("AdLandingPagesProxy", "doFollowFinder, userName=" + str);
        if (this.f274683i == null) {
            long j2 = j;
            FollowUserEventListener followUserEventListener = new FollowUserEventListener(j, str);
            this.f274683i = followUserEventListener;
            followUserEventListener.alive();
        }
        try {
            ((C60208v1) C86312j.m106911c(C60208v1.class)).mo78717rl(str, 1, (Long) null, false, 102);
        } catch (Throwable th) {
            Log.m105920e("AdLandingPagesProxy", "doFollowFinder exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("doFollowFinder", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        SnsMethodCalculate.markEndTimeMs("doAddAdFinderContractMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void doAddBrandScene(String str, int i, C94830p pVar) {
        SnsMethodCalculate.markStartTimeMs("doAddBrandScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = System.currentTimeMillis();
        ((HashMap) this.f274680f).put(Long.valueOf(currentTimeMillis), pVar);
        REMOTE_CALL("doAddBrandSceneSceneMM", Long.valueOf(currentTimeMillis), str, Integer.valueOf(i));
        SnsMethodCalculate.markEndTimeMs("doAddBrandScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void doAddBrandSceneSceneMM(long j, String str, int i) {
        SnsMethodCalculate.markStartTimeMs("doAddBrandSceneSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C117747y a = C43035c.m46669a(str, this.f274684j, i);
        if (a instanceof C48464g) {
            ((HashMap) this.f274681g).put(a, Long.valueOf(j));
            C86709a0.m107524d().mo123460f(a);
        } else if (a instanceof C28611c) {
            ((HashMap) this.f274681g).put(a, Long.valueOf(j));
            C86709a0.m107524d().mo123460f(a);
        }
        SnsMethodCalculate.markEndTimeMs("doAddBrandSceneSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void doCgiReportCanvasBrowseInfo(int i, String str) {
        SnsMethodCalculate.markStartTimeMs("doCgiReportCanvasBrowseInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        REMOTE_CALL("doCgiReportCanvasBrowseInfoMM", Integer.valueOf(i), str);
        SnsMethodCalculate.markEndTimeMs("doCgiReportCanvasBrowseInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void doCgiReportCanvasBrowseInfoMM(int i, String str) {
        SnsMethodCalculate.markStartTimeMs("doCgiReportCanvasBrowseInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C51263sl2 sl22 = new C51263sl2();
        sl22.f141588d = i;
        sl22.f141590f = (int) (System.currentTimeMillis() / 1000);
        sl22.f141591g = 1;
        sl22.f141589e = new C89349b(str.getBytes());
        ArrayList arrayList = new ArrayList();
        arrayList.add(sl22);
        C46565k kVar = new C46565k(arrayList);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(kVar);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(1802, this.f274684j);
        SnsMethodCalculate.markEndTimeMs("doCgiReportCanvasBrowseInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void doDynamicUpdateScene(String str, String str2, String str3, C94830p pVar) {
        SnsMethodCalculate.markStartTimeMs("doDynamicUpdateScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = System.currentTimeMillis();
        ((HashMap) this.f274680f).put(Long.valueOf(currentTimeMillis), pVar);
        REMOTE_CALL("doDynamicUpdateSceneMM", Long.valueOf(currentTimeMillis), str, str2, str3);
        SnsMethodCalculate.markEndTimeMs("doDynamicUpdateScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void doDynamicUpdateSceneMM(long j, String str, String str2, String str3) {
        SnsMethodCalculate.markStartTimeMs("doDynamicUpdateSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C53559k kVar = new C53559k(str, str2, str3);
        ((HashMap) this.f274681g).put(kVar, Long.valueOf(j));
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(kVar);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(1337, this.f274684j);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(2721, this.f274684j);
        SnsMethodCalculate.markEndTimeMs("doDynamicUpdateSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public int doFav(Intent intent, int i) {
        SnsMethodCalculate.markStartTimeMs("doFav", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        int i2 = 0;
        Object REMOTE_CALL = REMOTE_CALL("doFavMM", intent, Integer.valueOf(i));
        if (REMOTE_CALL != null) {
            i2 = ((Integer) REMOTE_CALL).intValue();
        }
        SnsMethodCalculate.markEndTimeMs("doFav", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return i2;
    }

    public int doFavAdlanding(long j, String str, int i, String str2, String str3, String str4, String str5, String str6, int i2, String str7, String str8) {
        SnsMethodCalculate.markStartTimeMs("doFavAdlanding", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        int i3 = 0;
        Object REMOTE_CALL = REMOTE_CALL("doFavAdlandingMM", Long.valueOf(j), str, Integer.valueOf(i), str2, str3, str4, str5, str6, Integer.valueOf(i2), str7, str8);
        if (REMOTE_CALL != null) {
            i3 = ((Integer) REMOTE_CALL).intValue();
        }
        SnsMethodCalculate.markEndTimeMs("doFavAdlanding", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return i3;
    }

    @C86514b
    public int doFavAdlandingMM(long j, String str, int i, String str2, String str3, String str4, String str5, String str6, int i2, String str7, String str8) {
        LinkedList<C101834rc0> linkedList;
        int i3 = i;
        String str9 = str4;
        String str10 = str5;
        SnsMethodCalculate.markStartTimeMs("doFavAdlandingMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
        if ((!(i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4 || i3 == 9 || i3 == 10 || i3 == 11) || Util.isNullOrNil(str)) && (!(i3 == 5 || i3 == 6) || j == -2147483648L)) {
        }
        if (!((C100714h1) C86312j.m106911c(C100714h1.class)).Cq0(doFavoriteEvent, str6.hashCode() + "", C75592q0.m90789s(), str4, str5, str6, str7, str2)) {
            DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
            if (aVar.f264687l == 0) {
                aVar.f264687l = C0966R.string.co9;
            }
            int i4 = aVar.f264687l;
            SnsMethodCalculate.markEndTimeMs("doFavAdlandingMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return i4;
        }
        String a = C86493v0.m107223a(str3);
        DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent.f264674d;
        aVar2.f264683h = a;
        aVar2.f264679d = str9;
        aVar2.f264680e = str10;
        C101801kd0 kd02 = aVar2.f264676a;
        if (!(kd02 == null || (linkedList = kd02.f298618f) == null || linkedList.size() <= 0 || kd02.f298618f.get(0) == null)) {
            kd02.f298618f.get(0).mo141252d(str6);
            kd02.f298618f.get(0).mo141246U(str9);
            kd02.f298618f.get(0).mo141265u(str10);
            kd02.f298618f.get(0).mo141239N(str8);
        }
        if (kd02 != null) {
            kd02.mo141220r(str9);
            kd02.mo141212j(str10);
        }
        doFavoriteEvent.f264674d.f264688m = i2;
        doFavoriteEvent.publish();
        int i5 = doFavoriteEvent.f264674d.f264687l;
        SnsMethodCalculate.markEndTimeMs("doFavAdlandingMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return i5;
    }

    @C86514b
    public int doFavMM(Intent intent, int i) {
        SnsMethodCalculate.markStartTimeMs("doFavMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
        ((C100714h1) C86312j.m106911c(C100714h1.class)).Ae0(doFavoriteEvent, intent);
        doFavoriteEvent.f264674d.f264688m = i;
        doFavoriteEvent.publish();
        int i2 = doFavoriteEvent.f264674d.f264687l;
        SnsMethodCalculate.markEndTimeMs("doFavMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return i2;
    }

    public void doFavOfficialItemScene(String str, C94830p pVar) {
        SnsMethodCalculate.markStartTimeMs("doFavOfficialItemScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        if (Util.isNullOrNil(str)) {
            Log.m105920e("AdLandingPagesProxy", "doFavOfficialItemScene with empty itemBuff, interrupted!");
            SnsMethodCalculate.markEndTimeMs("doFavOfficialItemScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ((HashMap) this.f274680f).put(Long.valueOf(currentTimeMillis), pVar);
        REMOTE_CALL("doFavOfficialItemSceneMM", Long.valueOf(currentTimeMillis), str);
        SnsMethodCalculate.markEndTimeMs("doFavOfficialItemScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void doFavOfficialItemSceneMM(long j, String str) {
        SnsMethodCalculate.markStartTimeMs("doFavOfficialItemSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C39156j jVar = new C39156j(str);
        ((HashMap) this.f274681g).put(jVar, Long.valueOf(j));
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(jVar);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(2874, this.f274684j);
        SnsMethodCalculate.markEndTimeMs("doFavOfficialItemSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void doGetHbCoverState(String str, C94830p pVar) {
        SnsMethodCalculate.markStartTimeMs("doGetHbCoverState", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = System.currentTimeMillis();
        ((HashMap) this.f274680f).put(Long.valueOf(currentTimeMillis), pVar);
        REMOTE_CALL("doGetHbCoverStateMM", Long.valueOf(currentTimeMillis), str);
        Log.m105924i("AdLandingPagesProxy", "doGetHbCoverState, hbCoverId=" + str);
        SnsMethodCalculate.markEndTimeMs("doGetHbCoverState", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void doGetHbCoverStateMM(long j, String str) {
        SnsMethodCalculate.markStartTimeMs("doGetHbCoverStateMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C53555d dVar = new C53555d(str);
        ((HashMap) this.f274681g).put(dVar, Long.valueOf(j));
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(dVar);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(2944, this.f274684j);
        SnsMethodCalculate.markEndTimeMs("doGetHbCoverStateMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void doGetSmartPhoneScene(long j, int i, String str, String str2, int i2, String str3, C94830p pVar) {
        SnsMethodCalculate.markStartTimeMs("doGetSmartPhoneScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = System.currentTimeMillis();
        ((HashMap) this.f274680f).put(Long.valueOf(currentTimeMillis), pVar);
        REMOTE_CALL("doGetSmartPhoneSceneMM", Long.valueOf(currentTimeMillis), Long.valueOf(j), Integer.valueOf(i), str, str2, Integer.valueOf(i2), str3);
        SnsMethodCalculate.markEndTimeMs("doGetSmartPhoneScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void doGetSmartPhoneSceneMM(long j, long j2, int i, String str, String str2, int i2, String str3) {
        SnsMethodCalculate.markStartTimeMs("doGetSmartPhoneSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C53556e eVar = new C53556e(j2, i, str, str2, i2, str3);
        ((HashMap) this.f274681g).put(eVar, Long.valueOf(j));
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(eVar);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(2605, this.f274684j);
        SnsMethodCalculate.markEndTimeMs("doGetSmartPhoneSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void doJumpToFinderFeedsDetailUI(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("doJumpToFinderFeedsDetailUI", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            REMOTE_CALL("doJumpToFinderFeedsDetailUIMM", str, str2, str3, str4, str5, Integer.valueOf(i), Integer.valueOf(i2));
        } catch (Throwable unused) {
            Log.m105920e("AdLandingPagesProxy", "doJumpToFinderFeedsDetailUI remote call has an exception!");
        }
        SnsMethodCalculate.markEndTimeMs("doJumpToFinderFeedsDetailUI", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void doJumpToFinderFeedsDetailUIMM(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("doJumpToFinderFeedsDetailUIMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            SnsInfo TE = C94866e1.Yx0().mo139807TE(str5);
            if (TE == null) {
                z = false;
            } else {
                z = (i == 16 ? TE.getAtAdInfo() : TE.getAdInfo()).preloadFinderFeed;
            }
            C99542h0.m129907e(MMApplicationContext.getContext(), str4, str, str2, str3, C102260r.m134863c0(str5), z, i2);
        } catch (Throwable unused) {
            Log.m105920e("AdLandingPagesProxy", "doJumpToFinderFeedsDetailUI call has an exception");
        }
        SnsMethodCalculate.markEndTimeMs("doJumpToFinderFeedsDetailUIMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public boolean doJumpToFinderProfileUI(Context context, String str, String str2, String str3, int i) {
        Context context2;
        SnsMethodCalculate.markStartTimeMs("doJumpToFinderProfileUI", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        if (context == null) {
            try {
                Log.m105924i("AdLandingPagesProxy", "doJumpToFinderProfileUI, context==null");
                context2 = MMApplicationContext.getContext();
            } catch (Throwable th) {
                Log.m105920e("AdLandingPagesProxy", "doJumpToFinderProfileUI, exp=" + th.toString());
                SnsMethodCalculate.markEndTimeMs("doJumpToFinderProfileUI", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                return false;
            }
        } else {
            context2 = context;
        }
        Intent intent = new Intent(context2, SnsAdProxyUI.class);
        intent.putExtra("action_type", 4);
        intent.putExtra("finderUsername", Util.nullAsNil(str));
        intent.putExtra("uxInfo", Util.nullAsNil(str2));
        intent.putExtra("snsIdStr", Util.nullAsNil(str3));
        intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/model/AdLandingPagesProxy", "doJumpToFinderProfileUI", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/sns/model/AdLandingPagesProxy", "doJumpToFinderProfileUI", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        SnsMethodCalculate.markEndTimeMs("doJumpToFinderProfileUI", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return true;
    }

    public void doPreloadAdCanvas(long j, String str, String str2, boolean z) {
        SnsMethodCalculate.markStartTimeMs("doPreloadAdCanvas", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        REMOTE_CALL("doPreloadAdCanvasMM", Long.valueOf(j), str, str2, Boolean.valueOf(z));
        SnsMethodCalculate.markEndTimeMs("doPreloadAdCanvas", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void doPreloadAdCanvasMM(long j, String str, String str2, boolean z) {
        SnsMethodCalculate.markStartTimeMs("doPreloadAdCanvasMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        SnsMethodCalculate.markStartTimeMs("doPreloadAdCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        C100884n.m132182b(j, z, str, str2);
        SnsMethodCalculate.markEndTimeMs("doPreloadAdCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        SnsMethodCalculate.markEndTimeMs("doPreloadAdCanvasMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void doSearchContactMM(long j, String str) {
        SnsMethodCalculate.markStartTimeMs("doSearchContactMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Log.m105924i("AdLandingPagesProxy", "doSearchContactMM, userName=" + str);
        C117747y m9 = ((C98798b) C86312j.m106911c(C98798b.class)).mo71569m9(str, 1);
        ((HashMap) this.f274681g).put(m9, Long.valueOf(j));
        C86709a0.m107524d().mo123455a(106, this.f274684j);
        C86709a0.m107524d().mo123460f(m9);
        SnsMethodCalculate.markEndTimeMs("doSearchContactMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void doSearchDynamicUpdateScene(String str, C94830p pVar) {
        SnsMethodCalculate.markStartTimeMs("doSearchDynamicUpdateScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = System.currentTimeMillis();
        ((HashMap) this.f274680f).put(Long.valueOf(currentTimeMillis), pVar);
        REMOTE_CALL("doSearchDynamicUpdateSceneMM", Long.valueOf(currentTimeMillis), str);
        SnsMethodCalculate.markEndTimeMs("doSearchDynamicUpdateScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void doSearchDynamicUpdateSceneMM(long j, String str) {
        SnsMethodCalculate.markStartTimeMs("doSearchDynamicUpdateSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C53559k kVar = new C53559k(str);
        ((HashMap) this.f274681g).put(kVar, Long.valueOf(j));
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(kVar);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(1337, this.f274684j);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(2721, this.f274684j);
        SnsMethodCalculate.markEndTimeMs("doSearchDynamicUpdateSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void doTransimt(Activity activity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        SnsMethodCalculate.markStartTimeMs("doTransimt", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Intent intent = new Intent(MMApplicationContext.getContext(), SnsTransparentUI.class);
        String str9 = str;
        intent.putExtra("adlandingXml", str);
        String str10 = str2;
        intent.putExtra("shareTitle", str2);
        String str11 = str3;
        intent.putExtra("shareThumbUrl", str3);
        String str12 = str4;
        intent.putExtra("shareDesc", str4);
        intent.putExtra("shareUrl", str5);
        intent.putExtra("statExtStr", str6);
        intent.putExtra("uxInfo", str7);
        intent.putExtra("canvasId", str8);
        intent.putExtra("op", 2);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/plugin/sns/model/AdLandingPagesProxy", "doTransimt", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        Activity activity2 = activity;
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(activity, "com/tencent/mm/plugin/sns/model/AdLandingPagesProxy", "doTransimt", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        SnsMethodCalculate.markEndTimeMs("doTransimt", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void doTransimtMM(String str, String str2, String str3, String str4, String str5) {
        SnsMethodCalculate.markStartTimeMs("doTransimtMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        SnsMethodCalculate.markEndTimeMs("doTransimtMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void doUpdateUxInfoScene(String str, int i, C94830p pVar) {
        SnsMethodCalculate.markStartTimeMs("doUpdateUxInfoScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = System.currentTimeMillis();
        ((HashMap) this.f274680f).put(Long.valueOf(currentTimeMillis), pVar);
        REMOTE_CALL("doUpdateUxInfoSceneMM", Long.valueOf(currentTimeMillis), str, Integer.valueOf(i));
        SnsMethodCalculate.markEndTimeMs("doUpdateUxInfoScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void doUpdateUxInfoSceneMM(long j, String str, int i) {
        SnsMethodCalculate.markStartTimeMs("doUpdateUxInfoSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C53560m mVar = new C53560m(str, i);
        ((HashMap) this.f274681g).put(mVar, Long.valueOf(j));
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(mVar);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(2883, this.f274684j);
        SnsMethodCalculate.markEndTimeMs("doUpdateUxInfoSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void downloadLandingPageVideo(String str, String str2, String str3, int i, boolean z, int i2, C98127h.C98128a aVar) {
        String str4 = str;
        String str5 = str2;
        C98127h.C98128a aVar2 = aVar;
        SnsMethodCalculate.markStartTimeMs("downloadLandingPageVideo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        if (Util.isNullOrNil(str4, str5, str3)) {
            if (aVar2 != null) {
                aVar2.mo17918g(str4, -1, (C98121d) null);
            }
            SnsMethodCalculate.markEndTimeMs("downloadLandingPageVideo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return;
        }
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175911u(C8136w.CTRL_INDEX, 20);
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("sns_ad_download_resource_preferences", 0);
        boolean z2 = sharedPreferences.getBoolean(str4, false);
        if (C86013q1.m106450k(str3)) {
            Log.m105925i("AdLandingPagesProxy", "is already download %s", Boolean.valueOf(z2));
            if (z2) {
                nVar.mo175911u(C8136w.CTRL_INDEX, 21);
                aVar2.mo17918g(str4, 0, (C98121d) null);
                SnsMethodCalculate.markEndTimeMs("downloadLandingPageVideo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                return;
            }
            nVar.mo175911u(C8136w.CTRL_INDEX, 22);
        } else if (z2) {
            Log.m105924i("AdLandingPagesProxy", "last download file was deleted");
            nVar.mo175911u(C8136w.CTRL_INDEX, 23);
            sharedPreferences.edit().putBoolean(str4, false).commit();
        } else {
            nVar.mo175911u(C8136w.CTRL_INDEX, 24);
        }
        if (((HashMap) this.f274688q).containsKey(str4)) {
            Log.m105924i("%s is already in downloading", str5);
            SnsMethodCalculate.markEndTimeMs("downloadLandingPageVideo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return;
        }
        if (aVar2 != null) {
            ((HashMap) this.f274688q).put(str4, aVar2);
        }
        REMOTE_CALL("downloadLandingPageVideoMM", str4, str5, str3, Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2));
        SnsMethodCalculate.markEndTimeMs("downloadLandingPageVideo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void downloadLandingPageVideoMM(String str, String str2, String str3, int i, boolean z, int i2) {
        SnsMethodCalculate.markStartTimeMs("downloadLandingPageVideoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Log.m105925i("AdLandingPagesProxy", "add online video task [%s] url[%s] path[%s]", str, str2, str3);
        C115669n.INSTANCE.mo175911u(C8136w.CTRL_INDEX, 25);
        MMHandlerThread.postToMainThread(new C94825h(str, str2, str3, i, z, i2));
        SnsMethodCalculate.markEndTimeMs("downloadLandingPageVideoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void downloadLandingPagesCDNFile(String str, String str2, String str3, int i, C98559a0 a0Var) {
        SnsMethodCalculate.markStartTimeMs("downloadLandingPagesCDNFile", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2) || Util.isNullOrNil(str3)) {
            if (a0Var != null) {
                a0Var.mo121891a();
            }
            SnsMethodCalculate.markEndTimeMs("downloadLandingPagesCDNFile", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return;
        }
        if (a0Var != null) {
            synchronized (this.f274687p) {
                try {
                    if (!((HashMap) this.f274687p).containsKey(str2)) {
                        ((HashMap) this.f274687p).put(str2, new ArrayList());
                    }
                    List list = (List) ((HashMap) this.f274687p).get(str2);
                    if (list != null) {
                        list.add(a0Var);
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("downloadLandingPagesCDNFile", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                    throw th;
                }
            }
        }
        REMOTE_CALL("downloadLandingPagesCDNFileMM", str, str2, str3, Integer.valueOf(i));
        SnsMethodCalculate.markEndTimeMs("downloadLandingPagesCDNFile", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void downloadLandingPagesCDNFileMM(String str, String str2, String str3, int i) {
        SnsMethodCalculate.markStartTimeMs("downloadLandingPagesCDNFileMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        if (i == 0) {
            downloadLandingPagesImageMMImpl(str, str2, str3);
        } else if (i == 1) {
            downloadLandingPagesSightMMImpl(str, str2, str3);
        }
        SnsMethodCalculate.markEndTimeMs("downloadLandingPagesCDNFileMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void downloadLandingPagesImageMMImpl(String str, String str2, String str3) {
        SnsMethodCalculate.markStartTimeMs("downloadLandingPagesImageMMImpl", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Log.m105924i("AdLandingPagesProxy", "downloadLandingPagesImageMMImpl, mediaId=" + str2);
        C101804kv2 h = C91999u.m115562h(str2, 2, str3, str3, 1, 1, "");
        C102268v vVar = new C102268v(h);
        vVar.mo141832d(3);
        vVar.mo141833e(h.f298689d);
        MMHandlerThread.postToMainThread(new C94823f(h, vVar, str, str2));
        SnsMethodCalculate.markEndTimeMs("downloadLandingPagesImageMMImpl", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void downloadLandingPagesSightMMImpl(String str, String str2, String str3) {
        SnsMethodCalculate.markStartTimeMs("downloadLandingPagesSightMMImpl", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Log.m105924i("AdLandingPagesProxy", "downloadLandingPagesSightMMImpl, mediaId=" + str2);
        C101804kv2 h = C91999u.m115562h(str2, 6, str3, str3, 1, 1, "");
        h.f298681N = true;
        MMHandlerThread.postToMainThread(new C94824g(h, str, str2));
        SnsMethodCalculate.markEndTimeMs("downloadLandingPagesSightMMImpl", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void downloadPagFile(String str) {
        SnsMethodCalculate.markStartTimeMs("downloadPagFile", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        REMOTE_CALL("downloadPagFileMM", str);
        SnsMethodCalculate.markEndTimeMs("downloadPagFile", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public boolean downloadPagFileMM(String str) {
        SnsMethodCalculate.markStartTimeMs("downloadPagFileMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            C94724k.m119921a(str);
        } catch (Throwable th) {
            Log.m105920e("AdLandingPagesProxy", "downloadPagFileMM exp=" + android.util.Log.getStackTraceString(th));
        }
        SnsMethodCalculate.markEndTimeMs("downloadPagFileMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return false;
    }

    @C86513a
    public void failed(long j) {
        SnsMethodCalculate.markStartTimeMs(StateEvent.ProcessResult.FAILED, "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Iterator it = this.f274685n.get(Long.valueOf(j)).iterator();
        while (it.hasNext()) {
            C94827l lVar = (C94827l) it.next();
            if (lVar != null) {
                lVar.mo130932d();
            }
        }
        this.f274685n.remove(Long.valueOf(j));
        SnsMethodCalculate.markEndTimeMs(StateEvent.ProcessResult.FAILED, "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void favEditTag() {
        SnsMethodCalculate.markStartTimeMs("favEditTag", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        REMOTE_CALL("favEditTagMM", new Object[0]);
        SnsMethodCalculate.markEndTimeMs("favEditTag", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void favEditTagMM() {
        SnsMethodCalculate.markStartTimeMs("favEditTagMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
        favoriteOperationEvent.f264833d.f264835a = 35;
        favoriteOperationEvent.publish();
        SnsMethodCalculate.markEndTimeMs("favEditTagMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void fetchQRCodeInfo(int i, String str, C94830p pVar) {
        SnsMethodCalculate.markStartTimeMs("fetchQRCodeInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = System.currentTimeMillis();
        ((HashMap) this.f274680f).put(Long.valueOf(currentTimeMillis), pVar);
        REMOTE_CALL("fetchQRCodeInfoMM", Long.valueOf(currentTimeMillis), Integer.valueOf(i), str);
        SnsMethodCalculate.markEndTimeMs("fetchQRCodeInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void fetchQRCodeInfoMM(long j, int i, String str) {
        SnsMethodCalculate.markStartTimeMs("fetchQRCodeInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ((C119157j) C119157j.f356862d).mo183875f(new C43030i(i, str, j));
        SnsMethodCalculate.markEndTimeMs("fetchQRCodeInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void geoLocation(String str, C94830p pVar) {
        SnsMethodCalculate.markStartTimeMs("geoLocation", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            Log.m105918d("AdLandingPagesProxy", "geoLocation is called!!");
            long currentTimeMillis = System.currentTimeMillis();
            ((HashMap) this.f274680f).put(Long.valueOf(currentTimeMillis), pVar);
            REMOTE_CALL("geoLocationMM", Long.valueOf(currentTimeMillis), str);
        } catch (Throwable unused) {
            Log.m105920e("AdLandingPagesProxy", "geoLocation catch one exception");
        }
        SnsMethodCalculate.markEndTimeMs("geoLocation", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void geoLocationMM(long j, String str) {
        C102894c cVar;
        SnsMethodCalculate.markStartTimeMs("geoLocationMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            Log.m105918d("AdLandingPagesProxy", "geoLocationMM is called!!");
            SnsMethodCalculate.markStartTimeMs("makeRequester", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
            cVar = null;
            if (j <= 0) {
                SnsMethodCalculate.markEndTimeMs("makeRequester", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
            } else {
                cVar = new C102894c(this, "onGeoLocation", j);
                SnsMethodCalculate.markEndTimeMs("makeRequester", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
            }
        } catch (Throwable unused) {
            Log.m105920e("AdLandingPagesProxy", "geoLocationMM catch one exception");
        }
        if (cVar != null) {
            SnsMethodCalculate.markStartTimeMs("request", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
            try {
                SnsMethodCalculate.markStartTimeMs("requestGeo", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
                if ("GCJ02".equalsIgnoreCase(str)) {
                    cVar.f303717g.mo126412f(cVar, false);
                } else {
                    cVar.f303717g.mo126407a(cVar, false);
                }
                C5139t.m5183e(12, 10);
                SnsMethodCalculate.markEndTimeMs("requestGeo", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
            } catch (Throwable unused2) {
                Log.m105920e("GeoServerRequester", "there is something wrong in request");
            }
            SnsMethodCalculate.markEndTimeMs("request", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
        }
        SnsMethodCalculate.markEndTimeMs("geoLocationMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public String getAccSnsPath() {
        SnsMethodCalculate.markStartTimeMs("getAccSnsPath", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        String str = (String) REMOTE_CALL("getAccSnsPathMM", new Object[0]);
        SnsMethodCalculate.markEndTimeMs("getAccSnsPath", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str;
    }

    @C86514b
    public String getAccSnsPathMM() {
        SnsMethodCalculate.markStartTimeMs("getAccSnsPathMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        String YO = C94866e1.m120262YO();
        SnsMethodCalculate.markEndTimeMs("getAccSnsPathMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return YO;
    }

    public void getAdFinderContact(String str, C94830p pVar) {
        SnsMethodCalculate.markStartTimeMs("getAdFinderContact", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = System.currentTimeMillis();
        ((HashMap) this.f274680f).put(Long.valueOf(currentTimeMillis), pVar);
        REMOTE_CALL("getAdFinderContactMM", Long.valueOf(currentTimeMillis), str);
        SnsMethodCalculate.markEndTimeMs("getAdFinderContact", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void getAdFinderContactMM(long j, String str) {
        SnsMethodCalculate.markStartTimeMs("getAdFinderContactMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ((C60208v1) C86312j.m106911c(C60208v1.class)).Aw0(str, new C57351a(j), 4);
        SnsMethodCalculate.markEndTimeMs("getAdFinderContactMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public String getAdValue(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("getAdValue", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            SnsMethodCalculate.markEndTimeMs("getAdValue", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return "";
        }
        try {
            Object REMOTE_CALL = REMOTE_CALL("getAdValueMM", str, str2);
            if (REMOTE_CALL instanceof String) {
                String str3 = (String) REMOTE_CALL;
                SnsMethodCalculate.markEndTimeMs("getAdValue", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                return str3;
            }
        } catch (Throwable th) {
            Log.m105920e("AdLandingPagesProxy", "getAdValue exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("getAdValue", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return "";
    }

    @C86514b
    public String getAdValueMM(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("getAdValueMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            String c = C79617c.m96684c(str, str2);
            SnsMethodCalculate.markEndTimeMs("getAdValueMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return c;
        } catch (Throwable th) {
            Log.m105920e("AdLandingPagesProxy", "getAdValueMM exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("getAdValueMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return "";
        }
    }

    public int getAdVoteIndex(String str, String str2, String str3) {
        SnsMethodCalculate.markStartTimeMs("getAdVoteIndex", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        int intValue = ((Integer) REMOTE_CALL("getAdVoteIndexMM", str, str2, str3)).intValue();
        SnsMethodCalculate.markEndTimeMs("getAdVoteIndex", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return intValue;
    }

    @C86514b
    public int getAdVoteIndexMM(String str, String str2, String str3) {
        SnsMethodCalculate.markStartTimeMs("getAdVoteIndexMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        int c = C100417r0.m131414c(str, str2, str3);
        SnsMethodCalculate.markEndTimeMs("getAdVoteIndexMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return c;
    }

    public String getAdVoteInfo(String str, String str2, String str3) {
        SnsMethodCalculate.markStartTimeMs("getAdVoteInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        String str4 = (String) REMOTE_CALL("getAdVoteInfoMM", str, str2, str3);
        SnsMethodCalculate.markEndTimeMs("getAdVoteInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str4;
    }

    @C86514b
    public String getAdVoteInfoMM(String str, String str2, String str3) {
        SnsMethodCalculate.markStartTimeMs("getAdVoteInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        String d = C100417r0.m131415d(str, str2, str3);
        SnsMethodCalculate.markEndTimeMs("getAdVoteInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return d;
    }

    public String getAdWuid() {
        SnsMethodCalculate.markStartTimeMs("getAdWuid", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Object REMOTE_CALL = REMOTE_CALL("getAdWuidMM", new Object[0]);
        String str = REMOTE_CALL == null ? "" : (String) REMOTE_CALL;
        SnsMethodCalculate.markEndTimeMs("getAdWuid", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str;
    }

    @C86514b
    public String getAdWuidMM() {
        SnsMethodCalculate.markStartTimeMs("getAdWuidMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        SnsMethodCalculate.markStartTimeMs("getWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
        long currentTimeMillis = System.currentTimeMillis();
        String b = C88011l.m109540b(false);
        Log.m105918d("AdWuidHelper", "getWuid, timeCost=" + (System.currentTimeMillis() - currentTimeMillis));
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175911u(1940, 1);
        if (TextUtils.isEmpty(b)) {
            nVar.mo175911u(1940, 2);
        }
        SnsMethodCalculate.markEndTimeMs("getWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
        SnsMethodCalculate.markEndTimeMs("getAdWuidMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return b;
    }

    public Bitmap getAvatarByUserName(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("getAvatarByUserName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Object REMOTE_CALL = REMOTE_CALL("getAvatarByUserNameMM", str, Boolean.valueOf(z));
        if (REMOTE_CALL instanceof Bitmap) {
            Bitmap bitmap = (Bitmap) REMOTE_CALL;
            SnsMethodCalculate.markEndTimeMs("getAvatarByUserName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return bitmap;
        }
        SnsMethodCalculate.markEndTimeMs("getAvatarByUserName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return null;
    }

    @C86514b
    public Bitmap getAvatarByUserNameMM(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("getAvatarByUserNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            String str2 = str + "-" + 1.0f;
            C78592b a = C78592b.C53158a.m59566a();
            Bitmap uf02 = a != null ? C78592b.C53158a.m59566a().uf0(str2) : null;
            if (uf02 == null || uf02.isRecycled()) {
                C78407r.C78409b VT = ((C76705f) C86312j.m106911c(C76705f.class)).mo106829VT();
                if (VT != null) {
                    uf02 = VT.loadBitmap(str);
                } else {
                    Log.m105924i("AdLandingPagesProxy", "getAvatarByUserNameMM, loader==null");
                }
                if (uf02 != null) {
                    Bitmap roundedCornerBitmap = BitmapUtil.getRoundedCornerBitmap(uf02, false, ((float) uf02.getWidth()) * 1.0f);
                    if (a != null) {
                        a.om0(str2, roundedCornerBitmap);
                    }
                    if (roundedCornerBitmap != null && !roundedCornerBitmap.isRecycled()) {
                        SnsMethodCalculate.markEndTimeMs("getAvatarByUserNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                        return roundedCornerBitmap;
                    }
                } else {
                    Log.m105924i("AdLandingPagesProxy", "getAvatarByUserNameMM, loader return null");
                }
                SnsMethodCalculate.markEndTimeMs("getAvatarByUserNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                return null;
            }
            Log.m105924i("AdLandingPagesProxy", "getAvatarByUserNameMM, useCache, name=" + str);
            SnsMethodCalculate.markEndTimeMs("getAvatarByUserNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return uf02;
        } catch (Throwable th) {
            Log.m105920e("AdLandingPagesProxy", "getAvatarByUserNameMM name=" + str + ", exp=" + android.util.Log.getStackTraceString(th));
        }
    }

    public void getBtnPersonalWxUserName(String str, String str2, C94830p pVar) {
        SnsMethodCalculate.markStartTimeMs("getBtnPersonalWxUserName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = System.currentTimeMillis();
        ((HashMap) this.f274680f).put(Long.valueOf(currentTimeMillis), pVar);
        REMOTE_CALL("getBtnPersonalWxUserNameMM", Long.valueOf(currentTimeMillis), str, str2);
        SnsMethodCalculate.markEndTimeMs("getBtnPersonalWxUserName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void getBtnPersonalWxUserNameMM(long j, String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("getBtnPersonalWxUserNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C53554c cVar = new C53554c(str, str2);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(cVar);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(4353, new C43029d(j));
        SnsMethodCalculate.markEndTimeMs("getBtnPersonalWxUserNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public Object getCfg(int i, Object obj) {
        SnsMethodCalculate.markStartTimeMs("getCfg", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Object REMOTE_CALL = REMOTE_CALL("getCfgMM", Integer.valueOf(i), obj);
        if (REMOTE_CALL != null) {
            obj = REMOTE_CALL;
        }
        SnsMethodCalculate.markEndTimeMs("getCfg", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return obj;
    }

    @C86514b
    public Object getCfgMM(int i, Object obj) {
        SnsMethodCalculate.markStartTimeMs("getCfgMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C86709a0.m107528h();
        Object e = C86709a0.m107535s().mo121142i().mo119684e(i, obj);
        SnsMethodCalculate.markEndTimeMs("getCfgMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return e;
    }

    public String getDisplayName(String str) {
        SnsMethodCalculate.markStartTimeMs("getDisplayName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Object REMOTE_CALL = REMOTE_CALL("getDisplayNameMM", str);
        String str2 = REMOTE_CALL == null ? "" : (String) REMOTE_CALL;
        SnsMethodCalculate.markEndTimeMs("getDisplayName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str2;
    }

    @C86514b
    public String getDisplayNameMM(String str) {
        String str2 = "";
        SnsMethodCalculate.markStartTimeMs("getDisplayNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            C86709a0.m107528h();
            C44668u3 Ni = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni();
            C72996z1 H3 = Ni == null ? null : Ni.mo69656H3(str);
            if (H3 != null) {
                str2 = H3.mo62898f();
            }
            SnsMethodCalculate.markEndTimeMs("getDisplayNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return str2;
        } catch (Throwable th) {
            Log.m105920e("AdLandingPagesProxy", "getDisplayNameMM, exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("getDisplayNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return str2;
        }
    }

    public void getOpenSdkAppInfo(String str, C94830p pVar) {
        SnsMethodCalculate.markStartTimeMs("getOpenSdkAppInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Log.m105924i("AdLandingPagesProxy", "getOpenSdkAppInfo, appId=" + str);
        long currentTimeMillis = System.currentTimeMillis();
        ((HashMap) this.f274680f).put(Long.valueOf(currentTimeMillis), pVar);
        REMOTE_CALL("getOpenSdkAppInfoMM", str, Long.valueOf(currentTimeMillis));
        SnsMethodCalculate.markEndTimeMs("getOpenSdkAppInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void getOpenSdkAppInfoMM(String str, long j) {
        SnsMethodCalculate.markStartTimeMs("getOpenSdkAppInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ((C119157j) C119157j.f356862d).mo183875f(new C43033k(str, j));
        SnsMethodCalculate.markEndTimeMs("getOpenSdkAppInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public String getPhoneNumber() {
        SnsMethodCalculate.markStartTimeMs("getPhoneNumber", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Object REMOTE_CALL = REMOTE_CALL("getPhoneNumberMM", new Object[0]);
        if (REMOTE_CALL instanceof String) {
            String str = (String) REMOTE_CALL;
            SnsMethodCalculate.markEndTimeMs("getPhoneNumber", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return str;
        }
        SnsMethodCalculate.markEndTimeMs("getPhoneNumber", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return "";
    }

    @C86514b
    public String getPhoneNumberMM() {
        String str;
        SnsMethodCalculate.markStartTimeMs("getPhoneNumberMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            str = (String) C86709a0.m107535s().mo121142i().mo119684e(6, (Object) null);
        } catch (Throwable th) {
            Log.m105920e("AdLandingPagesProxy", "getPhoneNumberMM exp=" + android.util.Log.getStackTraceString(th));
            str = "";
        }
        SnsMethodCalculate.markEndTimeMs("getPhoneNumberMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str;
    }

    public C96905d getRemoteServiceProxy() {
        SnsMethodCalculate.markStartTimeMs("getRemoteServiceProxy", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C96905d dVar = this.f274682h;
        SnsMethodCalculate.markEndTimeMs("getRemoteServiceProxy", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return dVar;
    }

    public String getSelfNickName() {
        SnsMethodCalculate.markStartTimeMs("getSelfNickName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Object REMOTE_CALL = REMOTE_CALL("getSelfNickNameMM", new Object[0]);
        String str = REMOTE_CALL == null ? "" : (String) REMOTE_CALL;
        SnsMethodCalculate.markEndTimeMs("getSelfNickName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str;
    }

    @C86514b
    public String getSelfNickNameMM() {
        SnsMethodCalculate.markStartTimeMs("getSelfNickNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            String m = C75592q0.m90783m();
            SnsMethodCalculate.markEndTimeMs("getSelfNickNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return m;
        } catch (Throwable th) {
            Log.m105920e("AdLandingPagesProxy", "getSelfNickNameMM, exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("getSelfNickNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return "";
        }
    }

    public String getSelfUserName() {
        SnsMethodCalculate.markStartTimeMs("getSelfUserName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Object REMOTE_CALL = REMOTE_CALL("getSelfUserNameMM", new Object[0]);
        String str = REMOTE_CALL == null ? "" : (String) REMOTE_CALL;
        SnsMethodCalculate.markEndTimeMs("getSelfUserName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str;
    }

    @C86514b
    public String getSelfUserNameMM() {
        SnsMethodCalculate.markStartTimeMs("getSelfUserNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            String s = C75592q0.m90789s();
            SnsMethodCalculate.markEndTimeMs("getSelfUserNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return s;
        } catch (Throwable th) {
            Log.m105920e("AdLandingPagesProxy", "getSelfUserNameMM, exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("getSelfUserNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return "";
        }
    }

    public String getSnsAdCanvasExtXml(String str) {
        SnsMethodCalculate.markStartTimeMs("getSnsAdCanvasExtXml", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        String str2 = (String) REMOTE_CALL("getSnsAdCanvasExtXmlMM", str);
        SnsMethodCalculate.markEndTimeMs("getSnsAdCanvasExtXml", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str2;
    }

    @C86514b
    public String getSnsAdCanvasExtXmlMM(String str) {
        SnsMethodCalculate.markStartTimeMs("getSnsAdCanvasExtXmlMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        SnsInfo TE = C94866e1.Yx0().mo139807TE(str);
        if (TE != null) {
            String str2 = TE.getAdInfo().adCanvasExtXml;
            SnsMethodCalculate.markEndTimeMs("getSnsAdCanvasExtXmlMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return str2;
        }
        SnsMethodCalculate.markEndTimeMs("getSnsAdCanvasExtXmlMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return "";
    }

    public int getSnsAdType(String str) {
        SnsMethodCalculate.markStartTimeMs("getSnsAdType", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Object REMOTE_CALL = REMOTE_CALL("getSnsAdTypeMM", str);
        if (REMOTE_CALL instanceof Number) {
            int intValue = ((Number) REMOTE_CALL).intValue();
            SnsMethodCalculate.markEndTimeMs("getSnsAdType", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return intValue;
        }
        SnsMethodCalculate.markEndTimeMs("getSnsAdType", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return 0;
    }

    @C86514b
    public int getSnsAdTypeMM(String str) {
        SnsMethodCalculate.markStartTimeMs("getSnsAdTypeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        SnsInfo TE = C94866e1.Yx0().mo139807TE(str);
        if (TE != null) {
            int adType = TE.getAdType();
            SnsMethodCalculate.markEndTimeMs("getSnsAdTypeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return adType;
        }
        SnsMethodCalculate.markEndTimeMs("getSnsAdTypeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return 0;
    }

    public String getSnsAid(String str) {
        SnsMethodCalculate.markStartTimeMs("getSnsAid", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        String str2 = (String) REMOTE_CALL("getSnsAidMM", str);
        SnsMethodCalculate.markEndTimeMs("getSnsAid", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str2;
    }

    @C86514b
    public String getSnsAidMM(String str) {
        SnsMethodCalculate.markStartTimeMs("getSnsAidMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        SnsInfo TE = C94866e1.Yx0().mo139807TE(str);
        if (TE != null) {
            String aid = TE.getAid();
            SnsMethodCalculate.markEndTimeMs("getSnsAidMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return aid;
        }
        SnsMethodCalculate.markEndTimeMs("getSnsAidMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return "";
    }

    public SnsInfo getSnsInfo(String str) {
        SnsMethodCalculate.markStartTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Bundle bundle = null;
        try {
            Bundle bundle2 = (Bundle) REMOTE_CALL("getSnsInfoMM", str);
            if (bundle2 == null) {
                SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                return null;
            }
            bundle = bundle2;
            SnsInfo snsInfo = new SnsInfo();
            snsInfo.readFromBundle(bundle);
            SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return snsInfo;
        } catch (Exception e) {
            Log.printErrStackTrace("AdLandingPagesProxy", e, "", new Object[0]);
        }
    }

    @C86514b
    public Bundle getSnsInfoMM(String str) {
        SnsMethodCalculate.markStartTimeMs("getSnsInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        SnsInfo TE = C94866e1.Yx0().mo139807TE(str);
        if (TE == null) {
            SnsMethodCalculate.markEndTimeMs("getSnsInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return null;
        }
        Bundle writeToBundle = TE.writeToBundle();
        SnsMethodCalculate.markEndTimeMs("getSnsInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return writeToBundle;
    }

    public String getSnsStatExtBySnsId(long j) {
        SnsMethodCalculate.markStartTimeMs("getSnsStatExtBySnsId", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        String str = (String) REMOTE_CALL("getSnsStatExtBySnsIdMM", Long.valueOf(j));
        SnsMethodCalculate.markEndTimeMs("getSnsStatExtBySnsId", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str;
    }

    @C86514b
    public String getSnsStatExtBySnsIdMM(long j) {
        String str;
        SnsMethodCalculate.markStartTimeMs("getSnsStatExtBySnsIdMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        SnsMethodCalculate.markStartTimeMs("getSnsStatExtBySnsId", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        AdSnsInfo jo = C94866e1.zx0().mo139864jo(j);
        if (jo != null) {
            str = C98962n.m128839d(jo.getTimeLine());
            SnsMethodCalculate.markEndTimeMs("getSnsStatExtBySnsId", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        } else {
            Log.m105927v("SnsAdExtUtil", "getSnsStatExtBySnsId snsInfo null, snsId %s", Long.valueOf(j));
            SnsMethodCalculate.markEndTimeMs("getSnsStatExtBySnsId", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
            str = "";
        }
        SnsMethodCalculate.markEndTimeMs("getSnsStatExtBySnsIdMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str;
    }

    public String getSnsTraceid(String str) {
        SnsMethodCalculate.markStartTimeMs("getSnsTraceid", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        String str2 = (String) REMOTE_CALL("getSnsTraceidMM", str);
        SnsMethodCalculate.markEndTimeMs("getSnsTraceid", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str2;
    }

    @C86514b
    public String getSnsTraceidMM(String str) {
        SnsMethodCalculate.markStartTimeMs("getSnsTraceidMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        SnsInfo TE = C94866e1.Yx0().mo139807TE(str);
        if (TE != null) {
            String traceid = TE.getTraceid();
            SnsMethodCalculate.markEndTimeMs("getSnsTraceidMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return traceid;
        }
        SnsMethodCalculate.markEndTimeMs("getSnsTraceidMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return "";
    }

    public String getSnsUxInfo(String str) {
        SnsMethodCalculate.markStartTimeMs("getSnsUxInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        String str2 = (String) REMOTE_CALL("getSnsUxInfoMM", str);
        SnsMethodCalculate.markEndTimeMs("getSnsUxInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str2;
    }

    @C86514b
    public String getSnsUxInfoMM(String str) {
        SnsMethodCalculate.markStartTimeMs("getSnsUxInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        SnsInfo TE = C94866e1.Yx0().mo139807TE(str);
        if (TE != null) {
            String uxinfo = TE.getUxinfo();
            SnsMethodCalculate.markEndTimeMs("getSnsUxInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return uxinfo;
        }
        SnsMethodCalculate.markEndTimeMs("getSnsUxInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return "";
    }

    public int getSyncServerTimeSecond() {
        SnsMethodCalculate.markStartTimeMs("getSyncServerTimeSecond", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Object REMOTE_CALL = REMOTE_CALL("getSyncServerTimeSecondMM", new Object[0]);
        if (REMOTE_CALL instanceof Integer) {
            int intValue = ((Integer) REMOTE_CALL).intValue();
            SnsMethodCalculate.markEndTimeMs("getSyncServerTimeSecond", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return intValue;
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        SnsMethodCalculate.markEndTimeMs("getSyncServerTimeSecond", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return currentTimeMillis;
    }

    @C86514b
    public int getSyncServerTimeSecondMM() {
        SnsMethodCalculate.markStartTimeMs("getSyncServerTimeSecondMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            int e = C31543z5.m39455e();
            SnsMethodCalculate.markEndTimeMs("getSyncServerTimeSecondMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return e;
        } catch (Throwable th) {
            Log.m105920e("AdLandingPagesProxy", "getSyncServerTimeSecondMM, exp=" + th.toString());
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            SnsMethodCalculate.markEndTimeMs("getSyncServerTimeSecondMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return currentTimeMillis;
        }
    }

    public int getTaskProgress(String str) {
        SnsMethodCalculate.markStartTimeMs("getTaskProgress", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Object REMOTE_CALL = REMOTE_CALL("getTaskProgressMM", str);
        int intValue = REMOTE_CALL == null ? -1 : ((Integer) REMOTE_CALL).intValue();
        SnsMethodCalculate.markEndTimeMs("getTaskProgress", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return intValue;
    }

    @C86514b
    public int getTaskProgressMM(String str) {
        SnsMethodCalculate.markStartTimeMs("getTaskProgressMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C100853b.m132142e().getClass();
        SnsMethodCalculate.markStartTimeMs("getTaskProgress", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        FileDownloadTaskInfo o = ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63967o(str);
        long j = o.f12201n;
        int i = j != 0 ? (int) ((o.f12200j * 100) / j) : 0;
        SnsMethodCalculate.markEndTimeMs("getTaskProgress", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        SnsMethodCalculate.markEndTimeMs("getTaskProgressMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return i;
    }

    public void getTwistAdCard(String str, String str2, int i, String str3, String str4, C94830p pVar) {
        SnsMethodCalculate.markStartTimeMs("getTwistAdCard", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = System.currentTimeMillis();
        ((HashMap) this.f274680f).put(Long.valueOf(currentTimeMillis), pVar);
        REMOTE_CALL("getTwistAdCardMM", Long.valueOf(currentTimeMillis), str, str2, Integer.valueOf(i), str3, str4);
        SnsMethodCalculate.markEndTimeMs("getTwistAdCard", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void getTwistAdCardMM(long j, String str, String str2, int i, String str3, String str4) {
        SnsMethodCalculate.markStartTimeMs("getTwistAdCardMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C53557f fVar = new C53557f(str, str2, i, str3, str4);
        ((HashMap) this.f274681g).put(fVar, Long.valueOf(j));
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(fVar);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(4729, this.f274684j);
        SnsMethodCalculate.markEndTimeMs("getTwistAdCardMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void getTwistAdCardStatus(String str, int i, String str2, String str3, String str4, int i2, C94830p pVar) {
        SnsMethodCalculate.markStartTimeMs("getTwistAdCardStatus", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = System.currentTimeMillis();
        ((HashMap) this.f274680f).put(Long.valueOf(currentTimeMillis), pVar);
        REMOTE_CALL("getTwistAdCardStatusMM", Long.valueOf(currentTimeMillis), str, Integer.valueOf(i), str2, str3, str4, Integer.valueOf(i2));
        SnsMethodCalculate.markEndTimeMs("getTwistAdCardStatus", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void getTwistAdCardStatusMM(long j, String str, int i, String str2, String str3, String str4, int i2) {
        SnsMethodCalculate.markStartTimeMs("getTwistAdCardStatusMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C66695g gVar = new C66695g(str, i, str2, str3, str4, i2);
        ((HashMap) this.f274681g).put(gVar, Long.valueOf(j));
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(gVar);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(4689, this.f274684j);
        SnsMethodCalculate.markEndTimeMs("getTwistAdCardStatusMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public String getUin() {
        SnsMethodCalculate.markStartTimeMs("getUin", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Object REMOTE_CALL = REMOTE_CALL("getUinMM", new Object[0]);
        String str = REMOTE_CALL == null ? "" : (String) REMOTE_CALL;
        SnsMethodCalculate.markEndTimeMs("getUin", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str;
    }

    @C86514b
    public String getUinMM() {
        SnsMethodCalculate.markStartTimeMs("getUinMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        String i = C86709a0.m107523b().mo121111i();
        SnsMethodCalculate.markEndTimeMs("getUinMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return i;
    }

    public boolean installApp(Context context, String str, String str2, String str3, String str4) {
        SnsMethodCalculate.markStartTimeMs("installApp", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        boolean z = false;
        Object REMOTE_CALL = REMOTE_CALL("installAppMM", str, str2, str3, str4);
        if (REMOTE_CALL != null) {
            z = ((Boolean) REMOTE_CALL).booleanValue();
        }
        SnsMethodCalculate.markEndTimeMs("installApp", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return z;
    }

    @C86514b
    public boolean installAppMM(String str, String str2, String str3, String str4) {
        SnsMethodCalculate.markStartTimeMs("installAppMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C100853b e = C100853b.m132142e();
        Context context = MMApplicationContext.getContext();
        C94828m mVar = new C94828m(str, str2, false, 1);
        e.getClass();
        SnsMethodCalculate.markStartTimeMs("installApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        boolean z = false;
        if (context == null || TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markEndTimeMs("installApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        } else {
            FileDownloadTaskInfo o = ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63967o(str);
            if (o == null || o.f12196f != 3 || TextUtils.isEmpty(o.f12197g)) {
                SnsMethodCalculate.markEndTimeMs("installApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            } else {
                e.mo140327k(4, o.f12194d);
                e.mo140326j(4001010, o.f12194d, new C100853b.C100857d(1));
                ((C45962f) C86312j.m106911c(C45962f.class)).go0(context, o.f12197g, (C47223a) null, false);
                e.mo140325i(str2, mVar);
                SnsMethodCalculate.markEndTimeMs("installApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
                z = true;
            }
        }
        SnsMethodCalculate.markEndTimeMs("installAppMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return z;
    }

    @C86513a
    public boolean isApkExist(String str) {
        SnsMethodCalculate.markStartTimeMs("isApkExist", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        boolean z = false;
        Object REMOTE_CALL = REMOTE_CALL("isApkExistMM", str);
        if (REMOTE_CALL != null) {
            z = ((Boolean) REMOTE_CALL).booleanValue();
        }
        SnsMethodCalculate.markEndTimeMs("isApkExist", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return z;
    }

    @C86514b
    public boolean isApkExistMM(String str) {
        SnsMethodCalculate.markStartTimeMs("isApkExistMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        boolean f = C100853b.m132142e().mo140322f(str);
        SnsMethodCalculate.markEndTimeMs("isApkExistMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return f;
    }

    public int isAutoAdDownload() {
        SnsMethodCalculate.markStartTimeMs("isAutoAdDownload", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        int i = 0;
        Object REMOTE_CALL = REMOTE_CALL("isAutoAdDownloadMM", new Object[0]);
        if (REMOTE_CALL != null) {
            i = ((Integer) REMOTE_CALL).intValue();
        }
        SnsMethodCalculate.markEndTimeMs("isAutoAdDownload", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return i;
    }

    @C86514b
    public int isAutoAdDownloadMM() {
        SnsMethodCalculate.markStartTimeMs("isAutoAdDownloadMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C94901o Fx0 = C94866e1.Fx0();
        Fx0.getClass();
        SnsMethodCalculate.markStartTimeMs("isAutoAdDownload", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        int p = Fx0.mo131133p((SnsInfo) null);
        SnsMethodCalculate.markEndTimeMs("isAutoAdDownload", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        SnsMethodCalculate.markEndTimeMs("isAutoAdDownloadMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return p;
    }

    public boolean isBrandAdded(String str) {
        SnsMethodCalculate.markStartTimeMs("isBrandAdded", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Object REMOTE_CALL = REMOTE_CALL("selectBrandAdd", str);
        if (REMOTE_CALL instanceof Boolean) {
            boolean booleanValue = ((Boolean) REMOTE_CALL).booleanValue();
            SnsMethodCalculate.markEndTimeMs("isBrandAdded", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return booleanValue;
        }
        SnsMethodCalculate.markEndTimeMs("isBrandAdded", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return false;
    }

    public boolean isConnected() {
        SnsMethodCalculate.markStartTimeMs("isConnected", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C96905d dVar = this.f274682h;
        boolean c = dVar == null ? false : dVar.mo135259c();
        SnsMethodCalculate.markEndTimeMs("isConnected", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return c;
    }

    public boolean isDownloading(String str) {
        SnsMethodCalculate.markStartTimeMs("isDownloading", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        boolean z = false;
        Object REMOTE_CALL = REMOTE_CALL("isDownloadingMM", str);
        if (REMOTE_CALL != null) {
            z = ((Boolean) REMOTE_CALL).booleanValue();
        }
        SnsMethodCalculate.markEndTimeMs("isDownloading", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return z;
    }

    @C86514b
    public boolean isDownloadingMM(String str) {
        SnsMethodCalculate.markStartTimeMs("isDownloadingMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C100853b.m132142e().getClass();
        SnsMethodCalculate.markStartTimeMs("isDownloading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        FileDownloadTaskInfo o = ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63967o(str);
        boolean z = true;
        if (o == null || o.f12196f != 1) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("isDownloading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        SnsMethodCalculate.markEndTimeMs("isDownloadingMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return z;
    }

    public boolean isFreeSimCard() {
        SnsMethodCalculate.markStartTimeMs("isFreeSimCard", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Object REMOTE_CALL = REMOTE_CALL("isFreeSimCardMM", new Object[0]);
        if (REMOTE_CALL instanceof Boolean) {
            boolean booleanValue = ((Boolean) REMOTE_CALL).booleanValue();
            SnsMethodCalculate.markEndTimeMs("isFreeSimCard", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return booleanValue;
        }
        SnsMethodCalculate.markEndTimeMs("isFreeSimCard", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return false;
    }

    @C86514b
    public boolean isFreeSimCardMM() {
        SnsMethodCalculate.markStartTimeMs("isFreeSimCardMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        int Pe = ((C101048b) C86312j.m106911c(C101048b.class)).mo60591Pe();
        boolean z = Pe == 3 || Pe == 4 || Pe == 5;
        Log.m105924i("AdLandingPagesProxy", "isFreeSimCard, simType=" + Pe + ", isFree=" + z);
        SnsMethodCalculate.markEndTimeMs("isFreeSimCardMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return z;
    }

    public String isFriend(String str) {
        SnsMethodCalculate.markStartTimeMs("isFriend", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Object REMOTE_CALL = REMOTE_CALL("isFriendMM", str);
        if (REMOTE_CALL instanceof String) {
            String str2 = (String) REMOTE_CALL;
            SnsMethodCalculate.markEndTimeMs("isFriend", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return str2;
        }
        SnsMethodCalculate.markEndTimeMs("isFriend", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return "";
    }

    @C86514b
    public String isFriendMM(String str) {
        SnsMethodCalculate.markStartTimeMs("isFriendMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            String jk = ((C46940b) C86312j.m106911c(C46940b.class)).mo72127jk(str, 2);
            Log.m105924i("AdLandingPagesProxy", "isFriendMM, hashName=" + str + ", userName=" + jk);
            if (!TextUtils.isEmpty(jk)) {
                str = jk;
            }
            if (!TextUtils.isEmpty(str)) {
                C86709a0.m107528h();
                C44668u3 Ni = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni();
                if (Ni != null) {
                    boolean s3 = Ni.mo69724s3(str);
                    Log.m105924i("AdLandingPagesProxy", "userName=" + str + ", isFriend=" + s3);
                    if (s3) {
                        SnsMethodCalculate.markEndTimeMs("isFriendMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                        return str;
                    }
                }
            }
        } catch (Throwable th) {
            Log.m105920e("AdLandingPagesProxy", "isFriendMM exp=" + android.util.Log.getStackTraceString(th));
        }
        SnsMethodCalculate.markEndTimeMs("isFriendMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return "";
    }

    public boolean isPaused(String str) {
        SnsMethodCalculate.markStartTimeMs("isPaused", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        boolean z = false;
        Object REMOTE_CALL = REMOTE_CALL("isPausedMM", str);
        if (REMOTE_CALL != null) {
            z = ((Boolean) REMOTE_CALL).booleanValue();
        }
        SnsMethodCalculate.markEndTimeMs("isPaused", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return z;
    }

    @C86514b
    public boolean isPausedMM(String str) {
        SnsMethodCalculate.markStartTimeMs("isPausedMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C100853b.m132142e().getClass();
        SnsMethodCalculate.markStartTimeMs("isPaused", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        FileDownloadTaskInfo o = ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63967o(str);
        boolean z = o != null && o.f12196f == 2;
        SnsMethodCalculate.markEndTimeMs("isPaused", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        SnsMethodCalculate.markEndTimeMs("isPausedMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return z;
    }

    public boolean isPkgInstalled(String str) {
        SnsMethodCalculate.markStartTimeMs("isPkgInstalled", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        boolean z = false;
        Object REMOTE_CALL = REMOTE_CALL("isPkgInstalledMM", str);
        if (REMOTE_CALL != null) {
            z = ((Boolean) REMOTE_CALL).booleanValue();
        }
        SnsMethodCalculate.markEndTimeMs("isPkgInstalled", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return z;
    }

    @C86514b
    public boolean isPkgInstalledMM(String str) {
        SnsMethodCalculate.markStartTimeMs("isPkgInstalledMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        boolean g = C100853b.m132142e().mo140323g(MMApplicationContext.getContext(), str);
        SnsMethodCalculate.markEndTimeMs("isPkgInstalledMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return g;
    }

    public boolean isRecExpAd(String str) {
        SnsMethodCalculate.markStartTimeMs("isRecExpAd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        boolean z = false;
        Object REMOTE_CALL = REMOTE_CALL("isRecExpAdMM", str);
        if (REMOTE_CALL != null) {
            z = ((Boolean) REMOTE_CALL).booleanValue();
        }
        SnsMethodCalculate.markEndTimeMs("isRecExpAd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return z;
    }

    @C86514b
    public boolean isRecExpAdMM(String str) {
        SnsMethodCalculate.markStartTimeMs("isRecExpAdMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        SnsInfo TE = C94866e1.Yx0().mo139807TE(str);
        if (TE == null) {
            SnsMethodCalculate.markEndTimeMs("isRecExpAdMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return false;
        }
        boolean isRecExpAd = TE.isRecExpAd();
        SnsMethodCalculate.markEndTimeMs("isRecExpAdMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return isRecExpAd;
    }

    public boolean isVideoDataAvailable(String str, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("isVideoDataAvailable", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        boolean z = false;
        Object REMOTE_CALL = REMOTE_CALL("isVideoDataAvailableMM", str, Integer.valueOf(i), Integer.valueOf(i2));
        if (REMOTE_CALL != null) {
            z = ((Boolean) REMOTE_CALL).booleanValue();
        }
        SnsMethodCalculate.markEndTimeMs("isVideoDataAvailable", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return z;
    }

    @C86514b
    public boolean isVideoDataAvailableMM(String str, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("isVideoDataAvailableMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        boolean m = C98398h0.xx0().mo126989m(str, i, i2);
        Log.m105925i("AdLandingPagesProxy", "is video data avaiable %s %d %d %s", str, Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(m));
        SnsMethodCalculate.markEndTimeMs("isVideoDataAvailableMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return m;
    }

    public boolean isWeAppAppendClickTime(String str, int i) {
        SnsMethodCalculate.markStartTimeMs("isWeAppAppendClickTime", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        boolean z = false;
        try {
            Object REMOTE_CALL = REMOTE_CALL("isWeAppAppendClickTimeMM", str, Integer.valueOf(i));
            if ((REMOTE_CALL instanceof Boolean) && ((Boolean) REMOTE_CALL).booleanValue()) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("isWeAppAppendClickTime", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return z;
        } catch (Throwable unused) {
            Log.m105920e("AdLandingPagesProxy", "isWeAppAppendClickTime remote call has an exception!");
            SnsMethodCalculate.markEndTimeMs("isWeAppAppendClickTime", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return false;
        }
    }

    @C86514b
    public boolean isWeAppAppendClickTimeMM(String str, int i) {
        SnsMethodCalculate.markStartTimeMs("isWeAppAppendClickTimeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        boolean z = false;
        try {
            SnsInfo TE = C94866e1.Yx0().mo139807TE(str);
            if (TE != null) {
                z = (i == 16 ? TE.getAtAdInfo() : TE.getAdInfo()).addClickTimeToWeAppPath;
            }
            SnsMethodCalculate.markEndTimeMs("isWeAppAppendClickTimeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return z;
        } catch (Throwable unused) {
            Log.m105920e("AdLandingPagesProxy", "isWeAppAppendClickTimeMM call has an exception");
            SnsMethodCalculate.markEndTimeMs("isWeAppAppendClickTimeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return false;
        }
    }

    /* renamed from: j */
    public final SharedPreferences mo130839j() {
        SnsMethodCalculate.markStartTimeMs("getSP", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Context context = MMApplicationContext.getContext();
        SharedPreferences sharedPreferences = context.getSharedPreferences(MMApplicationContext.getPackageName() + "_comm_preferences", 0);
        SnsMethodCalculate.markEndTimeMs("getSP", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return sharedPreferences;
    }

    public void launchBackApp(String str) {
        SnsMethodCalculate.markStartTimeMs("launchBackApp", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        REMOTE_CALL("launchBackAppMM", str);
        SnsMethodCalculate.markEndTimeMs("launchBackApp", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void launchBackAppMM(String str) {
        SnsMethodCalculate.markStartTimeMs("launchBackAppMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ((C39072t) C86312j.m106911c(C39072t.class)).r10("nativeOpenAdCanvas", "", str, 0, "");
        SnsMethodCalculate.markEndTimeMs("launchBackAppMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void notifyFinderCnyEggCardResult(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("notifyFinderCnyEggCardResult", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Log.m105924i("AdLandingPagesProxy", "notifyFinderCnyEggCardResult, pageId=" + str + ", cardId=" + str2);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            SnsMethodCalculate.markEndTimeMs("notifyFinderCnyEggCardResult", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return;
        }
        REMOTE_CALL("notifyFinderCnyEggCardResultMM", str, str2);
        SnsMethodCalculate.markEndTimeMs("notifyFinderCnyEggCardResult", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void notifyFinderCnyEggCardResultMM(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("notifyFinderCnyEggCardResultMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Log.m105924i("AdLandingPagesProxy", "notifyFinderCnyEggCardResultMM, pageId=" + str + ", cardId=" + str2);
        FinderCnyEggCardEvent finderCnyEggCardEvent = new FinderCnyEggCardEvent();
        FinderCnyEggCardEvent.C92517a aVar = finderCnyEggCardEvent.f264865d;
        aVar.f264866a = 1;
        aVar.f264867b = str;
        aVar.f264868c = str2;
        finderCnyEggCardEvent.publish();
        SnsMethodCalculate.markEndTimeMs("notifyFinderCnyEggCardResultMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void notifyFinderVideoPlayStateToChange(boolean z) {
        SnsMethodCalculate.markStartTimeMs("notifyFinderVideoPlayStateToChange", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Log.m105924i("AdLandingPagesProxy", "notifyFinderVideoPlayStateToChange tools, shouldPlay=" + z);
        REMOTE_CALL("notifyFinderVideoPlayStateToChangeMM", Boolean.valueOf(z));
        SnsMethodCalculate.markEndTimeMs("notifyFinderVideoPlayStateToChange", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void notifyFinderVideoPlayStateToChangeMM(boolean z) {
        SnsMethodCalculate.markStartTimeMs("notifyFinderVideoPlayStateToChangeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76853gy(z);
        } catch (Throwable th) {
            Log.m105920e("AdLandingPagesProxy", "notifyFinderVideoPlayStateToChangeMM, shouldPlay=" + z + ", exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("notifyFinderVideoPlayStateToChangeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86513a
    public void onAdChannelEnd(long j, int i, int i2, Object obj) {
        SnsMethodCalculate.markStartTimeMs("onAdChannelEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C94830p pVar = (C94830p) ((HashMap) this.f274680f).remove(Long.valueOf(j));
        if (pVar != null) {
            pVar.mo10856b(i, i2, obj);
        }
        SnsMethodCalculate.markEndTimeMs("onAdChannelEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void onAdLandingPageClick(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onAdLandingPageClick", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        System.currentTimeMillis();
        REMOTE_CALL("onAdLandingPageClickMM", str, str2);
        SnsMethodCalculate.markEndTimeMs("onAdLandingPageClick", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void onAdLandingPageClickMM(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onAdLandingPageClickMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C66696h hVar = new C66696h(str, str2);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(hVar);
        Log.m105924i("AdLandingPagesProxy", "NetSceneAdLadingPageClick, adChannelCgiReport, main, channel=" + str + ", content=" + str2);
        SnsMethodCalculate.markEndTimeMs("onAdLandingPageClickMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86513a
    public void onAdNativeAntiAbuse(long j, int i, int i2, Object obj) {
        SnsMethodCalculate.markStartTimeMs("onAdNativeAntiAbuse", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C94830p pVar = (C94830p) ((HashMap) this.f274680f).remove(Long.valueOf(j));
        if (pVar != null) {
            pVar.mo10856b(i, i2, obj);
        }
        SnsMethodCalculate.markEndTimeMs("onAdNativeAntiAbuse", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86513a
    public void onAdUpdateQrUrlEnd(long j, int i, int i2, Object obj) {
        SnsMethodCalculate.markStartTimeMs("onAdUpdateQrUrlEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C94830p pVar = (C94830p) ((HashMap) this.f274680f).remove(Long.valueOf(j));
        if (pVar != null) {
            pVar.mo10856b(i, i2, obj);
        }
        SnsMethodCalculate.markEndTimeMs("onAdUpdateQrUrlEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86513a
    public void onAddBrandSceneEnd(long j, int i, int i2, Object obj) {
        SnsMethodCalculate.markStartTimeMs("onAddBrandSceneEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C94830p pVar = (C94830p) ((HashMap) this.f274680f).remove(Long.valueOf(j));
        if (pVar != null) {
            pVar.mo10856b(i, i2, obj);
        }
        SnsMethodCalculate.markEndTimeMs("onAddBrandSceneEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void onCallback(String str, Bundle bundle, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Log.m105919d("AdLandingPagesProxy", "class:%s, method:%s, clientCall:%B", getClass().getName(), str, Boolean.valueOf(z));
        Method method = null;
        try {
            Method[] methods = getClass().getMethods();
            int length = methods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Method method2 = methods[i];
                if (method2.getName().equalsIgnoreCase(str)) {
                    method = method2;
                    break;
                }
                i++;
            }
            if (method != null) {
                if (method.isAnnotationPresent(z ? C86513a.class : C86514b.class)) {
                    Object invoke = method.invoke(this, getArgs(bundle));
                    if (method.getReturnType() != Void.TYPE) {
                        if (invoke instanceof Parcelable) {
                            bundle.putParcelable("result_key", (Parcelable) invoke);
                        } else {
                            bundle.putSerializable("result_key", (Serializable) invoke);
                        }
                    }
                }
            }
        } catch (Exception e) {
            Log.m105921e("AdLandingPagesProxy", "exception:%s", Util.stackTraceToString(e));
        }
        SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86513a
    public void onCdnVideoDataAvailable(String str, long j, long j2) {
        SnsMethodCalculate.markStartTimeMs("onCdnVideoDataAvailable", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Log.m105925i("AdLandingPagesProxy", "cdn video data available %s %d %d", str, Long.valueOf(j), Long.valueOf(j2));
        if (((HashMap) this.f274688q).containsKey(str)) {
            ((C98127h.C98128a) ((HashMap) this.f274688q).get(str)).onDataAvailable(str, j, j2);
        }
        SnsMethodCalculate.markEndTimeMs("onCdnVideoDataAvailable", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86513a
    public void onCdnVideoFinish(String str, int i) {
        SnsMethodCalculate.markStartTimeMs("onCdnVideoFinish", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Log.m105925i("AdLandingPagesProxy", "cdn video finish %s, %d", str, Integer.valueOf(i));
        if (i == 0) {
            MMApplicationContext.getContext().getSharedPreferences("sns_ad_download_resource_preferences", 0).edit().putBoolean(str, true).commit();
        }
        if (((HashMap) this.f274688q).containsKey(str)) {
            ((C98127h.C98128a) ((HashMap) this.f274688q).remove(str)).mo17918g(str, i, (C98121d) null);
        }
        SnsMethodCalculate.markEndTimeMs("onCdnVideoFinish", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86513a
    public void onCdnVideoMoovReady(String str, long j, long j2, String str2) {
        SnsMethodCalculate.markStartTimeMs("onCdnVideoMoovReady", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Log.m105925i("AdLandingPagesProxy", "cdn video moov ready %s %d %d", str, Long.valueOf(j), Long.valueOf(j2));
        if (((HashMap) this.f274688q).containsKey(str)) {
            CdnLogic.VideoInfo videoInfo = new CdnLogic.VideoInfo();
            videoInfo.svrFlag = str2;
            ((C98127h.C98128a) ((HashMap) this.f274688q).get(str)).onMoovReady(str, j, j2, videoInfo);
        }
        SnsMethodCalculate.markEndTimeMs("onCdnVideoMoovReady", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86513a
    public void onCdnVideoProgress(String str, long j, long j2) {
        SnsMethodCalculate.markStartTimeMs("onCdnVideoProgress", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Log.m105925i("AdLandingPagesProxy", "cdn video progress %s %d %d", str, Long.valueOf(j), Long.valueOf(j2));
        if (((HashMap) this.f274688q).containsKey(str)) {
            ((C98127h.C98128a) ((HashMap) this.f274688q).get(str)).mo17917e(str, j, j2);
        }
        SnsMethodCalculate.markEndTimeMs("onCdnVideoProgress", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86513a
    public void onDynamicUpdateEnd(long j, String str) {
        SnsMethodCalculate.markStartTimeMs("onDynamicUpdateEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C94830p pVar = (C94830p) ((HashMap) this.f274680f).remove(Long.valueOf(j));
        if (pVar != null && !Util.isNullOrNil(str)) {
            pVar.mo10855a(str);
        }
        SnsMethodCalculate.markEndTimeMs("onDynamicUpdateEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86513a
    public void onFavOfficialItemEnd(long j, String str, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onFavOfficialItemEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C94830p pVar = (C94830p) ((HashMap) this.f274680f).remove(Long.valueOf(j));
        if (i == 0 && i2 == 0) {
            Log.m105925i("AdLandingPagesProxy", "FavOfficialItem succeed, item_buff[%s]", str);
        } else {
            Log.m105921e("AdLandingPagesProxy", "FavOfficialItem fail, errrType[%d], errCode[%d], item_buff[%s]", Integer.valueOf(i), Integer.valueOf(i2), str);
        }
        if (pVar != null) {
            pVar.mo10856b(i, i2, (Object) null);
        }
        SnsMethodCalculate.markEndTimeMs("onFavOfficialItemEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86513a
    public void onFetchQRCodeInfo(long j, int i, int i2, Object obj) {
        SnsMethodCalculate.markStartTimeMs("onFetchQRCodeInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C94830p pVar = (C94830p) ((HashMap) this.f274680f).remove(Long.valueOf(j));
        if (pVar != null) {
            pVar.mo10856b(i, i2, obj);
        }
        SnsMethodCalculate.markEndTimeMs("onFetchQRCodeInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86513a
    public void onGeoLocation(long j, Object obj) {
        SnsMethodCalculate.markStartTimeMs("onGeoLocation", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            Log.m105918d("AdLandingPagesProxy", "onGeoLocation is called!!");
            C94830p pVar = (C94830p) ((HashMap) this.f274680f).remove(Long.valueOf(j));
            if (pVar != null) {
                pVar.mo10855a(obj);
            }
        } catch (Throwable unused) {
            Log.m105920e("AdLandingPagesProxy", "onGeoLocation catch one exception");
        }
        SnsMethodCalculate.markEndTimeMs("onGeoLocation", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86513a
    public void onGetAdCanvasXmlFromNet(long j, boolean z, String str) {
        SnsMethodCalculate.markStartTimeMs("onGetAdCanvasXmlFromNet", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C94830p pVar = (C94830p) ((HashMap) this.f274680f).remove(Long.valueOf(j));
        if (pVar != null) {
            pVar.mo10855a(str);
        }
        SnsMethodCalculate.markEndTimeMs("onGetAdCanvasXmlFromNet", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86513a
    public void onGetBtnAdFinderContact(long j, String str) {
        SnsMethodCalculate.markStartTimeMs("onGetBtnAdFinderContact", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C94830p pVar = (C94830p) ((HashMap) this.f274680f).remove(Long.valueOf(j));
        if (pVar != null) {
            pVar.mo10855a(str);
        }
        SnsMethodCalculate.markEndTimeMs("onGetBtnAdFinderContact", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86513a
    public void onGetBtnPersonalWxUserName(long j, String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onGetBtnPersonalWxUserName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C94830p pVar = (C94830p) ((HashMap) this.f274680f).get(Long.valueOf(j));
        if (pVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("username", str);
                jSONObject.put("aliasname", str2);
                pVar.mo10855a(jSONObject.toString());
            } catch (Exception e) {
                Log.m105920e("AdLandingPagesProxy", "onGetBtnPersonalWxUserName, exp=" + e.toString());
            }
        }
        SnsMethodCalculate.markEndTimeMs("onGetBtnPersonalWxUserName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86513a
    public void onGetHbCoverStateScene(long j, int i, int i2, Object obj) {
        SnsMethodCalculate.markStartTimeMs("onGetHbCoverStateScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C94830p pVar = (C94830p) ((HashMap) this.f274680f).remove(Long.valueOf(j));
        if (pVar != null) {
            pVar.mo10856b(i, i2, obj);
        }
        SnsMethodCalculate.markEndTimeMs("onGetHbCoverStateScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86513a
    public void onGetOpenSdkAppInfo(String str, long j) {
        SnsMethodCalculate.markStartTimeMs("onGetOpenSdkAppInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C94830p pVar = (C94830p) ((HashMap) this.f274680f).remove(Long.valueOf(j));
        if (pVar != null) {
            Log.m105924i("AdLandingPagesProxy", "onGetOpenSdkAppInfo");
            pVar.mo10855a(str);
        }
        SnsMethodCalculate.markEndTimeMs("onGetOpenSdkAppInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86513a
    public void onGetSmartPhoneScene(long j, int i, int i2, Object obj) {
        SnsMethodCalculate.markStartTimeMs("onGetSmartPhoneScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C94830p pVar = (C94830p) ((HashMap) this.f274680f).remove(Long.valueOf(j));
        if (pVar != null) {
            pVar.mo10856b(i, i2, obj);
        }
        SnsMethodCalculate.markEndTimeMs("onGetSmartPhoneScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void onHalfScreenAnimationChange(boolean z, boolean z2) {
        SnsMethodCalculate.markStartTimeMs("onHalfScreenAnimationChange", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Log.m105924i("AdLandingPagesProxy", "onHalfScreenAnimationChange tools, isOpen=" + z + ", isAnimBegin=" + z2);
        REMOTE_CALL("onHalfScreenAnimationChangeMM", Boolean.valueOf(z), Boolean.valueOf(z2));
        SnsMethodCalculate.markEndTimeMs("onHalfScreenAnimationChange", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void onHalfScreenAnimationChangeMM(boolean z, boolean z2) {
        SnsMethodCalculate.markStartTimeMs("onHalfScreenAnimationChangeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        boolean a = C65833d.m77546a();
        StringBuilder sb = new StringBuilder();
        sb.append("onHalfScreenAnimationChange, isOpen=");
        sb.append(z);
        sb.append(", isAnimBegin=");
        sb.append(z2);
        sb.append(", notify=");
        sb.append(a);
        sb.append(", listener=");
        RecyclerViewDrawerSquares.C45117c cVar = C65833d.f189314a;
        sb.append(cVar == null ? "null" : Integer.valueOf(cVar.hashCode()));
        Log.m105924i("AdHalfScreenLandingPageState", sb.toString());
        if (a && C65833d.f189314a != null) {
            ((C119157j) C119157j.f356862d).mo183895z(new C65832c(z, z2));
        }
        SnsMethodCalculate.markEndTimeMs("onHalfScreenAnimationChangeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void onHalfScreenHeightChange(float f) {
        SnsMethodCalculate.markStartTimeMs("onHalfScreenHeightChange", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Log.m105918d("AdLandingPagesProxy", "onHalfScreenHeightChange tools, isShow=" + f);
        REMOTE_CALL("onHalfScreenHeightChangeMM", Float.valueOf(f));
        SnsMethodCalculate.markEndTimeMs("onHalfScreenHeightChange", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void onHalfScreenHeightChangeMM(float f) {
        SnsMethodCalculate.markStartTimeMs("onHalfScreenHeightChangeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        boolean a = C65833d.m77546a();
        StringBuilder sb = new StringBuilder();
        sb.append("onHalfScreenHeightChange, percent=");
        sb.append(f);
        sb.append(", notify=");
        sb.append(a);
        sb.append(", listener=");
        RecyclerViewDrawerSquares.C45117c cVar = C65833d.f189314a;
        sb.append(cVar == null ? "null" : Integer.valueOf(cVar.hashCode()));
        Log.m105924i("AdHalfScreenLandingPageState", sb.toString());
        ((C119157j) C119157j.f356862d).mo183895z(new C65831b(a, f));
        SnsMethodCalculate.markEndTimeMs("onHalfScreenHeightChangeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86513a
    public void onImgDownloadCallback(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onImgDownloadCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Log.m105924i("AdLandingPagesProxy", "onImgDownloadCallback, id=" + str + ", isOk=" + z);
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("onImgDownloadCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return;
        }
        synchronized (this.f274687p) {
            try {
                List list = (List) ((HashMap) this.f274687p).remove(str);
                if (list == null) {
                    SnsMethodCalculate.markEndTimeMs("onImgDownloadCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                    return;
                }
                for (int i = 0; i < list.size(); i++) {
                    C98559a0 a0Var = (C98559a0) list.get(i);
                    if (a0Var != null) {
                        if (z) {
                            a0Var.mo121892b();
                        } else {
                            a0Var.mo121891a();
                        }
                    }
                }
                SnsMethodCalculate.markEndTimeMs("onImgDownloadCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("onImgDownloadCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                    throw th;
                }
            }
        }
    }

    @C86513a
    public void onRspCallbackCommon(long j, int i, int i2, Object obj) {
        SnsMethodCalculate.markStartTimeMs("onRspCallbackCommon", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C94830p pVar = (C94830p) ((HashMap) this.f274680f).remove(Long.valueOf(j));
        if (pVar != null) {
            pVar.mo10856b(i, i2, obj);
        }
        SnsMethodCalculate.markEndTimeMs("onRspCallbackCommon", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86513a
    public void onSearchContact(long j, int i, int i2, Object obj) {
        SnsMethodCalculate.markStartTimeMs("onSearchContact", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C94830p pVar = (C94830p) ((HashMap) this.f274680f).remove(Long.valueOf(j));
        if (pVar != null) {
            pVar.mo10856b(i, i2, obj);
        }
        SnsMethodCalculate.markEndTimeMs("onSearchContact", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86513a
    public void onSendAppointmentReq(long j, int i, int i2, int i3, String str) {
        SnsMethodCalculate.markStartTimeMs("onSendAppointmentReq", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C94830p pVar = (C94830p) ((HashMap) this.f274680f).remove(Long.valueOf(j));
        if (pVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("status", str);
                jSONObject.put("opType", i3);
                pVar.mo10856b(i, i2, jSONObject.toString());
            } catch (Exception e) {
                Log.m105920e("AdLandingPagesProxy", "onSendAppointmentReq, exp=" + e.toString());
            }
        }
        SnsMethodCalculate.markEndTimeMs("onSendAppointmentReq", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86513a
    public void onSightDownloadCallback(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onSightDownloadCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Log.m105924i("AdLandingPagesProxy", "onSightDownloadCallback, id=" + str + ", isOk=" + z);
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("onSightDownloadCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return;
        }
        synchronized (this.f274687p) {
            try {
                List list = (List) ((HashMap) this.f274687p).remove(str);
                if (list == null) {
                    SnsMethodCalculate.markEndTimeMs("onSightDownloadCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                    return;
                }
                for (int i = 0; i < list.size(); i++) {
                    C98559a0 a0Var = (C98559a0) list.get(i);
                    if (a0Var != null) {
                        if (z) {
                            a0Var.mo121892b();
                        } else {
                            a0Var.mo121891a();
                        }
                    }
                }
                SnsMethodCalculate.markEndTimeMs("onSightDownloadCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("onSightDownloadCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                    throw th;
                }
            }
        }
    }

    @C86513a
    public void onUpdateUxInfo(long j, int i, int i2, Object obj) {
        SnsMethodCalculate.markStartTimeMs("onUpdateUxInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C94830p pVar = (C94830p) ((HashMap) this.f274680f).remove(Long.valueOf(j));
        if (pVar != null) {
            pVar.mo10856b(i, i2, obj);
        }
        SnsMethodCalculate.markEndTimeMs("onUpdateUxInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public String openForAd(long j, int i, int i2, int i3, int i4, String str, String str2, C12004a aVar) {
        SnsMethodCalculate.markStartTimeMs("openForAd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Object REMOTE_CALL = REMOTE_CALL("openForAdMM", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str, str2, aVar);
        if (REMOTE_CALL instanceof String) {
            String str3 = (String) REMOTE_CALL;
            SnsMethodCalculate.markEndTimeMs("openForAd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return str3;
        }
        SnsMethodCalculate.markEndTimeMs("openForAd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return "";
    }

    @C86514b
    public String openForAdMM(long j, int i, int i2, int i3, int i4, String str, String str2, C12004a aVar) {
        SnsMethodCalculate.markStartTimeMs("openForAdMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        String c = C35631d0.m40782b().mo60342c(j, i, i2, i3, i4, str, str2, aVar);
        SnsMethodCalculate.markEndTimeMs("openForAdMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return c;
    }

    public boolean pauseTask(String str) {
        SnsMethodCalculate.markStartTimeMs("pauseTask", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        boolean z = false;
        Object REMOTE_CALL = REMOTE_CALL("pauseTaskMM", str);
        if (REMOTE_CALL != null) {
            z = ((Boolean) REMOTE_CALL).booleanValue();
        }
        SnsMethodCalculate.markEndTimeMs("pauseTask", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return z;
    }

    @C86514b
    public boolean pauseTaskMM(String str) {
        SnsMethodCalculate.markStartTimeMs("pauseTaskMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C100853b e = C100853b.m132142e();
        e.getClass();
        SnsMethodCalculate.markStartTimeMs("pauseTask", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        SnsMethodCalculate.markStartTimeMs("pauseTaskByAppid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        long h = e.mo140324h(str);
        SnsMethodCalculate.markStartTimeMs("pauseTask", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        boolean m = ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63965m(h);
        SnsMethodCalculate.markEndTimeMs("pauseTask", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        SnsMethodCalculate.markEndTimeMs("pauseTaskByAppid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        SnsMethodCalculate.markEndTimeMs("pauseTask", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        SnsMethodCalculate.markEndTimeMs("pauseTaskMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return m;
    }

    @C86513a
    public void paused(long j) {
        SnsMethodCalculate.markStartTimeMs("paused", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Iterator it = this.f274685n.get(Long.valueOf(j)).iterator();
        while (it.hasNext()) {
            C94827l lVar = (C94827l) it.next();
            if (lVar != null) {
                lVar.mo130933e();
            }
        }
        SnsMethodCalculate.markEndTimeMs("paused", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void playTimelineBackAnimation(long j) {
        SnsMethodCalculate.markStartTimeMs("playTimelineBackAnimation", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = System.currentTimeMillis();
        ((HashMap) this.f274680f).put(Long.valueOf(currentTimeMillis), (Object) null);
        REMOTE_CALL("playTimelineBackAnimationMM", Long.valueOf(currentTimeMillis), Long.valueOf(j));
        SnsMethodCalculate.markEndTimeMs("playTimelineBackAnimation", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void playTimelineBackAnimationMM(long j, long j2) {
        SnsMethodCalculate.markStartTimeMs("playTimelineBackAnimationMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        TimelinePlayBackAnimEvent timelinePlayBackAnimEvent = new TimelinePlayBackAnimEvent();
        timelinePlayBackAnimEvent.f265239d.f265240a = j2;
        timelinePlayBackAnimEvent.publish();
        SnsMethodCalculate.markEndTimeMs("playTimelineBackAnimationMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void playTimelineClickAnimation(long j) {
        SnsMethodCalculate.markStartTimeMs("playTimelineClickAnimation", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = System.currentTimeMillis();
        ((HashMap) this.f274680f).put(Long.valueOf(currentTimeMillis), (Object) null);
        REMOTE_CALL("playTimelineClickAnimationMM", Long.valueOf(currentTimeMillis), Long.valueOf(j));
        SnsMethodCalculate.markEndTimeMs("playTimelineClickAnimation", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void playTimelineClickAnimationMM(long j, long j2) {
        SnsMethodCalculate.markStartTimeMs("playTimelineClickAnimationMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        TimelinePlayClickAnimEvent timelinePlayClickAnimEvent = new TimelinePlayClickAnimEvent();
        timelinePlayClickAnimEvent.f265241d.f265242a = j2;
        timelinePlayClickAnimEvent.publish();
        SnsMethodCalculate.markEndTimeMs("playTimelineClickAnimationMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void prefetchH5Url(String str, String[] strArr) {
        SnsMethodCalculate.markStartTimeMs("prefetchH5Url", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            REMOTE_CALL("prefetchH5UrlMM", str, strArr);
        } catch (Throwable unused) {
            Log.m105920e("AdLandingPagesProxy", "prefetchH5Url remote call has an exception!");
        }
        SnsMethodCalculate.markEndTimeMs("prefetchH5Url", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void prefetchH5UrlMM(String str, String[] strArr) {
        SnsMethodCalculate.markStartTimeMs("prefetchH5UrlMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        if (!TextUtils.isEmpty(str) && !C101425k.m133099c(strArr)) {
            try {
                C98951a aVar = C98951a.f290046b;
                SnsMethodCalculate.markStartTimeMs("instance", "com.tencent.mm.plugin.sns.ad.h5.H5PrefetchManager");
                C98951a aVar2 = C98951a.f290046b;
                SnsMethodCalculate.markEndTimeMs("instance", "com.tencent.mm.plugin.sns.ad.h5.H5PrefetchManager");
                aVar2.mo138280a(str, strArr);
            } catch (Throwable unused) {
                Log.m105920e("AdLandingPagesProxy", "prefetchH5UrlMM call has an exception!");
            }
        }
        SnsMethodCalculate.markEndTimeMs("prefetchH5UrlMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void preloadFinderFeeds(String str, int i, String str2) {
        SnsMethodCalculate.markStartTimeMs("preloadFinderFeeds", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            REMOTE_CALL("preloadFinderFeedsMM", str, Integer.valueOf(i), str2);
        } catch (Throwable unused) {
            Log.m105920e("AdLandingPagesProxy", "preloadFinderFeeds remote call has an exception!");
        }
        SnsMethodCalculate.markEndTimeMs("preloadFinderFeeds", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void preloadFinderFeedsMM(String str, int i, String str2) {
        SnsMethodCalculate.markStartTimeMs("preloadFinderFeedsMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            SnsInfo TE = C94866e1.Yx0().mo139807TE(str);
            if (TE == null) {
                SnsMethodCalculate.markEndTimeMs("preloadFinderFeedsMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                return;
            }
            ADInfo atAdInfo = i == 16 ? TE.getAtAdInfo() : TE.getAdInfo();
            if (atAdInfo != null && atAdInfo.preloadFinderFeed) {
                C99544i0.m129921h(str2);
            }
            SnsMethodCalculate.markEndTimeMs("preloadFinderFeedsMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        } catch (Throwable unused) {
            Log.m105920e("AdLandingPagesProxy", "preloadFinderFeeds call has an exception!");
        }
    }

    @C86513a
    public void progress(long j, int i) {
        SnsMethodCalculate.markStartTimeMs("progress", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Log.m105927v("AdLandingPagesProxy", "progress client id %d , progress %d", Long.valueOf(j), Integer.valueOf(i));
        Iterator it = this.f274685n.get(Long.valueOf(j)).iterator();
        while (it.hasNext()) {
            C94827l lVar = (C94827l) it.next();
            if (lVar != null) {
                lVar.mo130931c(i);
            }
        }
        SnsMethodCalculate.markEndTimeMs("progress", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public long queryIdByAppid(String str) {
        SnsMethodCalculate.markStartTimeMs("queryIdByAppid", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Object REMOTE_CALL = REMOTE_CALL("queryIdByAppidMM", str);
        long longValue = REMOTE_CALL == null ? -1 : ((Long) REMOTE_CALL).longValue();
        SnsMethodCalculate.markEndTimeMs("queryIdByAppid", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return longValue;
    }

    @C86514b
    public long queryIdByAppidMM(String str) {
        SnsMethodCalculate.markStartTimeMs("queryIdByAppidMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long h = C100853b.m132142e().mo140324h(str);
        SnsMethodCalculate.markEndTimeMs("queryIdByAppidMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return h;
    }

    public long[] queryVideoMoov(String str, String str2, String str3) {
        SnsMethodCalculate.markStartTimeMs("queryVideoMoov", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Log.m105925i("AdLandingPagesProxy", "mediaId %s, path %s, url %s", str, str2, str3);
        if (Util.isNullOrNil(str, str2, str3)) {
            SnsMethodCalculate.markEndTimeMs("queryVideoMoov", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return null;
        }
        long[] jArr = (long[]) REMOTE_CALL("queryVideoMoovMM", str, str2, str3);
        SnsMethodCalculate.markEndTimeMs("queryVideoMoov", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return jArr;
    }

    @C86514b
    public long[] queryVideoMoovMM(String str, String str2, String str3) {
        SnsMethodCalculate.markStartTimeMs("queryVideoMoovMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        CdnLogic.C2CDownloadRequest c2CDownloadRequest = new CdnLogic.C2CDownloadRequest();
        c2CDownloadRequest.fileKey = str;
        c2CDownloadRequest.fileType = 100;
        c2CDownloadRequest.url = str3;
        c2CDownloadRequest.setSavePath(str2);
        long[] jArr = new long[2];
        if (CdnLogic.queryVideoMoovInfo(c2CDownloadRequest, jArr)) {
            SnsMethodCalculate.markEndTimeMs("queryVideoMoovMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return jArr;
        }
        SnsMethodCalculate.markEndTimeMs("queryVideoMoovMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return null;
    }

    public void reportOpenAppInfo(int i, String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("reportOpenAppInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        REMOTE_CALL("reportOpenAppInfoMM", Integer.valueOf(i), str, str2);
        SnsMethodCalculate.markEndTimeMs("reportOpenAppInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void reportOpenAppInfoMM(int i, String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("reportOpenAppInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C100853b e = C100853b.m132142e();
        e.getClass();
        SnsMethodCalculate.markStartTimeMs("reportOpenAppInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        e.mo140329m(i, str, str2, "", "");
        SnsMethodCalculate.markEndTimeMs("reportOpenAppInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        SnsMethodCalculate.markEndTimeMs("reportOpenAppInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void requestAdCanvasXmlFromNet(long j, int i, int i2, int i3, String str, String str2, C12004a aVar, C94830p pVar) {
        SnsMethodCalculate.markStartTimeMs("requestAdCanvasXmlFromNet", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = System.currentTimeMillis();
        ((HashMap) this.f274680f).put(Long.valueOf(currentTimeMillis), pVar);
        REMOTE_CALL("requestAdCanvasXmlFromNetMM", Long.valueOf(currentTimeMillis), Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str, str2, aVar);
        SnsMethodCalculate.markEndTimeMs("requestAdCanvasXmlFromNet", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void requestAdCanvasXmlFromNetMM(long j, long j2, int i, int i2, int i3, String str, String str2, C12004a aVar) {
        SnsMethodCalculate.markStartTimeMs("requestAdCanvasXmlFromNetMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            C35631d0.m40783e(j2, i, i2, i3, str, str2, aVar, new C94821b(j2, j), (C9487b) null);
        } catch (Throwable th) {
            Log.m105920e("AdLandingPagesProxy", "doRequestDynamicCanvasXml, exp is " + th);
        }
        SnsMethodCalculate.markEndTimeMs("requestAdCanvasXmlFromNetMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void requestVideoData(String str, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("requestVideoData", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C115669n.INSTANCE.mo175911u(C8136w.CTRL_INDEX, 32);
        REMOTE_CALL("requestVideoDataMM", str, Integer.valueOf(i), Integer.valueOf(i2));
        SnsMethodCalculate.markEndTimeMs("requestVideoData", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void requestVideoDataMM(String str, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("requestVideoDataMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C115669n.INSTANCE.mo175911u(C8136w.CTRL_INDEX, 33);
        C98398h0.xx0().mo126990n(str, i, i2, 0);
        SnsMethodCalculate.markEndTimeMs("requestVideoDataMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public boolean resumeTask(String str, C94827l lVar, String str2, String str3, String str4, C95144m0.C95147c cVar) {
        SnsMethodCalculate.markStartTimeMs("resumeTask", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        boolean z = false;
        Object REMOTE_CALL = REMOTE_CALL("resumeTaskMM", str, str2, str3, str4, cVar);
        if (REMOTE_CALL != null) {
            z = ((Boolean) REMOTE_CALL).booleanValue();
        }
        if (z) {
            long queryIdByAppid = queryIdByAppid(str);
            ArrayList arrayList = this.f274685n.get(Long.valueOf(queryIdByAppid));
            if (arrayList == null) {
                arrayList = new ArrayList();
                arrayList.add(lVar);
            } else if (!arrayList.contains(lVar)) {
                arrayList.add(lVar);
            }
            this.f274685n.put(Long.valueOf(queryIdByAppid), arrayList);
        }
        SnsMethodCalculate.markEndTimeMs("resumeTask", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return z;
    }

    @C86514b
    public boolean resumeTaskMM(String str, String str2, String str3, String str4, C95144m0.C95147c cVar) {
        boolean z;
        String str5 = str;
        C95144m0.C95147c cVar2 = cVar;
        SnsMethodCalculate.markStartTimeMs("resumeTaskMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C100853b e = C100853b.m132142e();
        C100853b.C100856c cVar3 = this.f274686o;
        e.getClass();
        Class cls = C13754y.class;
        SnsMethodCalculate.markStartTimeMs("resumeTask", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63955a(e.f295374g);
        FileDownloadTaskInfo o = ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63967o(str5);
        if (o != null) {
            if (cVar3 != null) {
                e.f295371d = cVar3;
            }
            ConcurrentHashMap<String, C100853b.C100859f> concurrentHashMap = e.f295373f;
            String str6 = cVar2.f276172d;
            int i = cVar2.f276173e;
            String str7 = cVar2.f276174f;
            String str8 = str7;
            int i2 = i;
            concurrentHashMap.put(str5, new C100853b.C100859f(str2, str3, str4, str6, i2, str8, cVar2.f276175g, cVar2.f276176h));
            z = ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63972t(o.f12194d);
            SnsMethodCalculate.markEndTimeMs("resumeTask", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        } else {
            z = false;
            SnsMethodCalculate.markEndTimeMs("resumeTask", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        }
        SnsMethodCalculate.markEndTimeMs("resumeTaskMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return z;
    }

    @C86513a
    public void resumed(long j) {
        SnsMethodCalculate.markStartTimeMs("resumed", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Iterator it = this.f274685n.get(Long.valueOf(j)).iterator();
        while (it.hasNext()) {
            C94827l lVar = (C94827l) it.next();
            if (lVar != null) {
                lVar.mo130930b();
            }
        }
        SnsMethodCalculate.markEndTimeMs("resumed", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void saveAdVoteInfo(String str, String str2, String str3, int i, int i2, String str4) {
        SnsMethodCalculate.markStartTimeMs("saveAdVoteInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        REMOTE_CALL("saveAdVoteInfoMM", str, str2, str3, Integer.valueOf(i), Integer.valueOf(i2), str4);
        SnsMethodCalculate.markEndTimeMs("saveAdVoteInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void saveAdVoteInfoMM(String str, String str2, String str3, int i, int i2, String str4) {
        SnsMethodCalculate.markStartTimeMs("saveAdVoteInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C100417r0.m131423l(str, str2, str3, i, i2, str4);
        SnsMethodCalculate.markEndTimeMs("saveAdVoteInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public boolean selectBrandAdd(String str) {
        SnsMethodCalculate.markStartTimeMs("selectBrandAdd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C44668u3 Ni = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni();
        boolean z = false;
        if (Ni == null || Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("selectBrandAdd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return false;
        }
        C72996z1 z1Var = Ni.get(str);
        if (z1Var != null && z1Var.mo62927s3()) {
            z = true;
        }
        SnsMethodCalculate.markEndTimeMs("selectBrandAdd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return z;
    }

    public void sendAppointmentReq(String str, long j, int i, String str2, C94830p pVar) {
        SnsMethodCalculate.markStartTimeMs("sendAppointmentReq", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = System.currentTimeMillis();
        ((HashMap) this.f274680f).put(Long.valueOf(currentTimeMillis), pVar);
        REMOTE_CALL("sendAppointmentReqMM", Long.valueOf(currentTimeMillis), str, Long.valueOf(j), Integer.valueOf(i), str2);
        SnsMethodCalculate.markEndTimeMs("sendAppointmentReq", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void sendAppointmentReqMM(long j, String str, long j2, int i, String str2) {
        SnsMethodCalculate.markStartTimeMs("sendAppointmentReqMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C46884e eVar = new C46884e(str, j2, i, str2);
        ((HashMap) this.f274681g).put(eVar, Long.valueOf(j));
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(eVar);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(5159, this.f274684j);
        SnsMethodCalculate.markEndTimeMs("sendAppointmentReqMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void setAdValue(String str, String str2, String str3) {
        SnsMethodCalculate.markStartTimeMs("setAdValue", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            SnsMethodCalculate.markEndTimeMs("setAdValue", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return;
        }
        try {
            REMOTE_CALL("setAdValueMM", str, str2, str3);
        } catch (Throwable th) {
            Log.m105920e("AdLandingPagesProxy", "setAdValue exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("setAdValue", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public String setAdValueMM(String str, String str2, String str3) {
        SnsMethodCalculate.markStartTimeMs("setAdValueMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            C79617c.m96686e(str, str2, str3);
        } catch (Throwable th) {
            Log.m105920e("AdLandingPagesProxy", "setAdValueMM exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("setAdValueMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return "";
    }

    public void setHalfScreenLandingPageShow(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setHalfScreenLandingPageShow", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Log.m105924i("AdLandingPagesProxy", "setHalfScreenLandingPageShow tools, isShow=" + z);
        REMOTE_CALL("setHalfScreenLandingPageShowMM", Boolean.valueOf(z));
        SnsMethodCalculate.markEndTimeMs("setHalfScreenLandingPageShow", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void setHalfScreenLandingPageShowMM(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setHalfScreenLandingPageShowMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C65833d.m77547b(z);
        SnsMethodCalculate.markEndTimeMs("setHalfScreenLandingPageShowMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86513a
    public void start(long j) {
        SnsMethodCalculate.markStartTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Iterator it = this.f274685n.get(Long.valueOf(j)).iterator();
        while (it.hasNext()) {
            C94827l lVar = (C94827l) it.next();
            if (lVar != null) {
                lVar.start();
            }
        }
        SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public long startDownload(String str, String str2, String str3, String str4, String str5, String str6, boolean z, C94827l lVar, String str7, String str8, String str9, boolean z2, C95144m0.C95147c cVar) {
        String str10 = str3;
        String str11 = str5;
        String str12 = str6;
        C94827l lVar2 = lVar;
        String str13 = str7;
        String str14 = str9;
        SnsMethodCalculate.markStartTimeMs("startDownload", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Log.m105924i("AdLandingPagesProxy", "startDownload, appId=" + str + ", pkg=" + str10 + ", aid=" + str13 + ", fileName=" + str12 + ", isGameApp=" + z2 + ", url=" + str11 + ", uxinfo=" + str14);
        Object REMOTE_CALL = REMOTE_CALL("startDownloadMM", str, str2, str10, str4, str11, str12, Boolean.valueOf(z), str13, str8, str14, Boolean.valueOf(z2), cVar);
        long longValue = REMOTE_CALL == null ? -1 : ((Long) REMOTE_CALL).longValue();
        ArrayList arrayList = this.f274685n.get(Long.valueOf(longValue));
        if (arrayList == null) {
            arrayList = new ArrayList();
            arrayList.add(lVar2);
        } else if (!arrayList.contains(lVar2)) {
            arrayList.add(lVar2);
        }
        this.f274685n.put(Long.valueOf(longValue), arrayList);
        SnsMethodCalculate.markEndTimeMs("startDownload", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return longValue;
    }

    @C86514b
    public long startDownloadMM(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, String str9, boolean z2, C95144m0.C95147c cVar) {
        long j;
        String str10 = str;
        String str11 = str3;
        String str12 = str4;
        String str13 = str5;
        String str14 = str6;
        boolean z3 = z;
        C95144m0.C95147c cVar2 = cVar;
        SnsMethodCalculate.markStartTimeMs("startDownloadMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C100853b e = C100853b.m132142e();
        String str15 = "startDownloadMM";
        C94828m mVar = r0;
        C94828m mVar2 = new C94828m(str, str3, z, 2);
        C100853b.C100856c cVar3 = this.f274686o;
        e.getClass();
        Class cls = C13754y.class;
        SnsMethodCalculate.markStartTimeMs("startDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        if (!z2) {
            C40939n nVar = new C40939n((C40939n.C2206a) null);
            nVar.f110182g = str10;
            nVar.f110199x = str10;
            nVar.f110183h = str11;
            nVar.f110180e = str12;
            nVar.f110176a = str13;
            nVar.f110179d = str14;
            nVar.f110184i = z3;
            j = ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63956b(nVar);
        } else {
            C40979a aVar = new C40979a();
            aVar.f110289a = str13;
            aVar.f110292d = str2;
            aVar.f110293e = str10;
            aVar.f110294f = str11;
            aVar.f110296h = str12;
            aVar.f110291c = str14;
            aVar.f110297i = 1;
            aVar.f110301m = z3;
            aVar.f110299k = 5101;
            j = ((C45547h) C86312j.m106911c(C45547h.class)).mo70789R7(aVar, new C47520d(e));
        }
        if (cVar3 != null) {
            e.f295371d = cVar3;
        }
        if (z3) {
            e.mo140325i(str11, mVar);
        }
        e.f295373f.put(str10, new C100853b.C100859f(str7, str8, str9, cVar2.f276172d, cVar2.f276173e, cVar2.f276174f, cVar2.f276175g, cVar2.f276176h));
        ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63955a(e.f295374g);
        SnsMethodCalculate.markEndTimeMs("startDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        Log.m105925i("AdLandingPagesProxy", "startDownloadMM, id %d", Long.valueOf(j));
        SnsMethodCalculate.markEndTimeMs(str15, "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return j;
    }

    public void stopDownloadLandingPageVideo(String str) {
        SnsMethodCalculate.markStartTimeMs("stopDownloadLandingPageVideo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        if (((HashMap) this.f274688q).containsKey(str)) {
            ((HashMap) this.f274688q).remove(str);
            Log.m105925i("AdLandingPagesProxy", "stop download video %s", str);
            C115669n.INSTANCE.mo175911u(C8136w.CTRL_INDEX, 34);
            MMApplicationContext.getContext().getSharedPreferences("sns_ad_download_resource_preferences", 0).edit().putBoolean(str, false).commit();
        }
        REMOTE_CALL("stopDownloadLandingPageVideoMM", str);
        SnsMethodCalculate.markEndTimeMs("stopDownloadLandingPageVideo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void stopDownloadLandingPageVideoMM(String str) {
        SnsMethodCalculate.markStartTimeMs("stopDownloadLandingPageVideoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C94866e1.Vx0().mo130998w(str, (Object[]) null);
        SnsMethodCalculate.markEndTimeMs("stopDownloadLandingPageVideoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void stopTask(String str) {
        SnsMethodCalculate.markStartTimeMs("stopTask", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        REMOTE_CALL("stopTaskMM", str);
        SnsMethodCalculate.markEndTimeMs("stopTask", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void stopTaskMM(String str) {
        SnsMethodCalculate.markStartTimeMs("stopTaskMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C100853b.m132142e().getClass();
        Class cls = C13754y.class;
        SnsMethodCalculate.markStartTimeMs("stopTask", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        FileDownloadTaskInfo o = ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63967o(str);
        if (o != null) {
            long j = o.f12194d;
            SnsMethodCalculate.markStartTimeMs("stopTask", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63970r(j);
            SnsMethodCalculate.markEndTimeMs("stopTask", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        }
        SnsMethodCalculate.markEndTimeMs("stopTask", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        SnsMethodCalculate.markEndTimeMs("stopTaskMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86513a
    public void stopped(long j) {
        SnsMethodCalculate.markStartTimeMs("stopped", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Iterator it = this.f274685n.get(Long.valueOf(j)).iterator();
        while (it.hasNext()) {
            C94827l lVar = (C94827l) it.next();
            if (lVar != null) {
                lVar.mo130934f();
            }
        }
        this.f274685n.remove(Long.valueOf(j));
        SnsMethodCalculate.markEndTimeMs("stopped", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86513a
    public void succeed(long j) {
        SnsMethodCalculate.markStartTimeMs(StateEvent.ProcessResult.SUCCEED, "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        Iterator it = this.f274685n.get(Long.valueOf(j)).iterator();
        while (it.hasNext()) {
            C94827l lVar = (C94827l) it.next();
            if (lVar != null) {
                lVar.mo130929a();
            }
        }
        this.f274685n.remove(Long.valueOf(j));
        SnsMethodCalculate.markEndTimeMs(StateEvent.ProcessResult.SUCCEED, "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void updateContact(String str) {
        SnsMethodCalculate.markStartTimeMs("updateContact", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        REMOTE_CALL("updateContactMM", str);
        SnsMethodCalculate.markEndTimeMs("updateContact", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void updateContactMM(String str) {
        SnsMethodCalculate.markStartTimeMs("updateContactMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        C44668u3 Ni = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni();
        if (Ni == null || Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("updateContactMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return;
        }
        C72996z1 z1Var = Ni.get(str);
        z1Var.mo62868O3();
        z1Var.setUsername(str);
        ((C119157j) C119157j.f356862d).mo183875f(new C43032j(this, z1Var, Ni));
        SnsMethodCalculate.markEndTimeMs("updateContactMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void writeDeferredDeepLink(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("writeDeferredDeepLink", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        REMOTE_CALL("writeDeferredDeepLinkMM", str, str2);
        SnsMethodCalculate.markEndTimeMs("writeDeferredDeepLink", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @C86514b
    public void writeDeferredDeepLinkMM(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("writeDeferredDeepLinkMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        mo130839j().edit().putString(str, str2).commit();
        SnsMethodCalculate.markEndTimeMs("writeDeferredDeepLinkMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }
}
