package com.tencent.p014mm.plugin.sight.base;

import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import kj2.C117407d;

/* renamed from: com.tencent.mm.plugin.sight.base.b */
public class C85456b {
    /* renamed from: a */
    public static boolean m105448a(boolean z, boolean z2) {
        int intValue;
        try {
            if (C86709a0.m107528h().f251735l && C86709a0.m107523b().mo121114l() && (intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_LOCAL_SIGHT_CAPTURE_USE_FFMPEG_INT_SYNC, -1)).intValue()) > 0) {
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(intValue);
                objArr[1] = Boolean.valueOf(intValue == 2);
                Log.m105925i("MicroMsg.WechatSight.PacketMuxerController", "WechatSight isIsUseFFmpeg localConfig: %d, isIsUseFFmpeg: %b", objArr);
                return intValue == 2;
            }
        } catch (Error e) {
            Log.printErrStackTrace("MicroMsg.WechatSight.PacketMuxerController", e, "load isIsUseFFmpeg local config fail", new Object[0]);
        }
        boolean z3 = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_is_use_ffmpeg_muxer_for_capture, 0) == 1;
        if (!z3 && z2) {
            Log.m105925i("MicroMsg.WechatSight.PacketMuxerController", "xSwitch: %b, enableHevc: %b, H265 must use ffmpeg_muxer", Boolean.valueOf(z3), Boolean.valueOf(z2));
            z3 = true;
        }
        Log.m105925i("MicroMsg.WechatSight.PacketMuxerController", "WechatSight isIsUseFFmpeg xSwitch: %b, useSoftEncode:%s, enableHevc:%s", Boolean.valueOf(z3), Boolean.valueOf(z), Boolean.valueOf(z2));
        return z3;
    }

    /* renamed from: b */
    public static String m105449b() {
        if (MMApplicationContext.getContext() == null || MMApplicationContext.getContext().getCacheDir() == null) {
            Log.m105920e("MicroMsg.WechatSight.PacketMuxerController", "path is empty, MMApplicationContext.getContext() == null");
            return "";
        }
        String str = MMApplicationContext.getContext().getCacheDir().getAbsolutePath() + "/mux";
        Uri n = C116299g2.m163858n(str);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
            C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n, l);
            if (l2.mo177810a()) {
                l2.f348991a.mo119937g(l2.f348992b);
            }
            Log.m105925i("MicroMsg.WechatSight.PacketMuxerController", "path is not exists, mkdir path: %s", str);
        }
        Log.m105919d("MicroMsg.WechatSight.PacketMuxerController", "WechatSight ffmpegMuxerPath path is %s", str);
        return str;
    }

    /* renamed from: c */
    public static boolean m105450c(boolean z, boolean z2) {
        int intValue;
        try {
            if (C86709a0.m107528h().f251735l && C86709a0.m107523b().mo121114l() && (intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_LOCAL_SIGHT_RECORD_USE_FFMPEG_INT_SYNC, -1)).intValue()) > 0) {
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(intValue);
                objArr[1] = Boolean.valueOf(intValue == 2);
                Log.m105925i("MicroMsg.WechatSight.PacketMuxerController", "WechatSight isIsUseFFmpeg localConfig: %d, isIsUseFFmpeg: %b", objArr);
                return intValue == 2;
            }
        } catch (Error e) {
            Log.printErrStackTrace("MicroMsg.WechatSight.PacketMuxerController", e, "load isIsUseFFmpeg local config fail", new Object[0]);
        }
        boolean z3 = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_is_use_ffmpeg_muxer, 0) == 1;
        if (!z3 && z2) {
            Log.m105925i("MicroMsg.WechatSight.PacketMuxerController", "xSwitch: %b, enableHevc: %b, H265 must use ffmpeg_muxer", Boolean.valueOf(z3), Boolean.valueOf(z2));
            z3 = true;
        }
        Log.m105925i("MicroMsg.WechatSight.PacketMuxerController", "WechatSight isIsUseFFmpeg xSwitch: %b, useSoftEncode:%s, enableHevc:%s", Boolean.valueOf(z3), Boolean.valueOf(z), Boolean.valueOf(z2));
        return z3;
    }

    /* renamed from: d */
    public static boolean m105451d() {
        int intValue;
        try {
            if (C86709a0.m107528h().f251735l && C86709a0.m107523b().mo121114l() && (intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_LOCAL_SIGHT_RECORD_USE_FFMPEG_INT_SYNC, -1)).intValue()) > 0) {
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(intValue);
                objArr[1] = Boolean.valueOf(intValue == 2);
                Log.m105925i("MicroMsg.WechatSight.PacketMuxerController", "WechatSight isIsUseFFmpeg localConfig: %d, isIsUseFFmpeg: %b", objArr);
                return intValue == 2;
            }
        } catch (Error e) {
            Log.printErrStackTrace("MicroMsg.WechatSight.PacketMuxerController", e, "load isIsUseFFmpeg local config fail", new Object[0]);
        }
        boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_sight_video_jni_remuxing_is_use_ffmpeg_muxer, 0) == 1;
        Log.m105925i("MicroMsg.WechatSight.PacketMuxerController", "WechatSight isIsUseFFmpeg xSwitch: %b", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: e */
    public static void m105452e(long j, long j2) {
        try {
            C117407d.INSTANCE.idkeyStat(1280, j, j2, false);
            Log.m105919d("MicroMsg.WechatSight.PacketMuxerController", "reportIDKey muxer called: %d, %d", Long.valueOf(j), Long.valueOf(j2));
        } catch (Error e) {
            Log.printErrStackTrace("MicroMsg.WechatSight.PacketMuxerController", e, "reportIDKey muxer called error", new Object[0]);
        }
    }

    /* renamed from: f */
    public static void m105453f(int i, long j) {
        m105452e(0, 1);
        if (i < 0) {
            m105452e(2, 1);
        } else {
            m105452e(1, 1);
        }
        long ticksToNow = Util.ticksToNow(j);
        m105452e(3, ticksToNow);
        Log.m105925i("MicroMsg.WechatSight.PacketMuxerController", "WechatSight reportMuxingResult retVal: %d", Integer.valueOf(i));
        switch (i) {
            case -10006:
                m105452e(40, 1);
                m105452e(42, 1);
                m105452e(43, ticksToNow);
                return;
            case -10005:
                m105452e(35, 1);
                m105452e(37, 1);
                m105452e(38, ticksToNow);
                return;
            case -10004:
                m105452e(30, 1);
                m105452e(32, 1);
                m105452e(33, ticksToNow);
                return;
            case -10003:
                m105452e(25, 1);
                m105452e(27, 1);
                m105452e(28, ticksToNow);
                return;
            case -10002:
                m105452e(20, 1);
                m105452e(22, 1);
                m105452e(23, ticksToNow);
                return;
            case -10001:
                m105452e(15, 1);
                m105452e(17, 1);
                m105452e(18, ticksToNow);
                return;
            default:
                switch (i) {
                    case 10001:
                        m105452e(15, 1);
                        m105452e(16, 1);
                        m105452e(18, ticksToNow);
                        return;
                    case 10002:
                        m105452e(20, 1);
                        m105452e(21, 1);
                        m105452e(23, ticksToNow);
                        return;
                    case 10003:
                        m105452e(25, 1);
                        m105452e(26, 1);
                        m105452e(28, ticksToNow);
                        return;
                    case 10004:
                        m105452e(30, 1);
                        m105452e(31, 1);
                        m105452e(33, ticksToNow);
                        return;
                    case 10005:
                        m105452e(35, 1);
                        m105452e(36, 1);
                        m105452e(38, ticksToNow);
                        return;
                    case 10006:
                        m105452e(40, 1);
                        m105452e(41, 1);
                        m105452e(43, ticksToNow);
                        return;
                    default:
                        return;
                }
        }
    }

    /* renamed from: g */
    public static boolean m105454g() {
        int intValue;
        try {
            if (C86709a0.m107528h().f251735l && C86709a0.m107523b().mo121114l() && (intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_LOCAL_SIGHT_RECORD_USE_FFMPEG_CODEC_PTS_INT_SYNC, -1)).intValue()) > 0) {
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(intValue);
                objArr[1] = Boolean.valueOf(intValue == 1);
                Log.m105919d("MicroMsg.WechatSight.PacketMuxerController", "WechatSight useCodecPts localConfig: %d, useCodecPts: %b", objArr);
                return intValue == 1;
            }
        } catch (Error e) {
            Log.printErrStackTrace("MicroMsg.WechatSight.PacketMuxerController", e, "load useCodecPts local config fail", new Object[0]);
        }
        boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ffmpeg_muxer_use_codec_pts, 1) == 1;
        Log.m105925i("MicroMsg.WechatSight.PacketMuxerController", "WechatSight useCodecPts: %b", Boolean.valueOf(z));
        return z;
    }
}
