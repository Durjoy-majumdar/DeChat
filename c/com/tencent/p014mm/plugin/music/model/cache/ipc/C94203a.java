package com.tencent.p014mm.plugin.music.model.cache.ipc;

import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.ipcinvoker.type.IPCLong;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.music.cache.ipc.IPCAudioParamRequest;
import com.tencent.p014mm.plugin.music.cache.ipc.IPCAudioParamResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import qc0.C101108q;
import za2.C102984b;

/* renamed from: com.tencent.mm.plugin.music.model.cache.ipc.a */
public class C94203a {

    /* renamed from: com.tencent.mm.plugin.music.model.cache.ipc.a$a */
    public static final class C4898a implements C80916r<IPCString, IPCVoid> {
        private C4898a() {
        }

        public Object invoke(Object obj) {
            IPCString iPCString = (IPCString) obj;
            try {
                Log.m105925i("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc deletePieceMusicInfo Task, musicId:%s", iPCString);
                C94208b.m119125b(iPCString.f10315d);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Audio.MusicDataSourceCrossProcessImp", e, "ipc deletePieceMusicInfo task", new Object[0]);
            }
            return new IPCVoid();
        }
    }

    /* renamed from: com.tencent.mm.plugin.music.model.cache.ipc.a$b */
    public static final class C4899b implements C80916r<IPCVoid, IPCString> {
        private C4899b() {
        }

        public Object invoke(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            try {
                Log.m105924i("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc getAccPath task");
                return new IPCString(C86709a0.m107535s().f251806d);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Audio.MusicDataSourceCrossProcessImp", e, "ipc getAccPath task", new Object[0]);
                return new IPCString("");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.music.model.cache.ipc.a$c */
    public static final class C4900c implements C80916r<IPCVoid, IPCLong> {
        private C4900c() {
        }

        public Object invoke(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            try {
                Log.m105924i("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc getLastScanMusicPieceFileTime task");
                return new IPCLong(((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_MUSIO_LAST_SCAN_MUSIC_PIECE_FILE_TIME_LONG, 0L)).longValue());
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Audio.MusicDataSourceCrossProcessImp", e, "ipc getLastScanMusicPieceFileTime task", new Object[0]);
                return new IPCLong(0);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.music.model.cache.ipc.a$d */
    public static final class C4901d implements C80916r<IPCString, IPCString> {
        private C4901d() {
        }

        public Object invoke(Object obj) {
            IPCString iPCString = (IPCString) obj;
            try {
                Log.m105925i("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc getMusicMIMETypeByMusicId Task, musicId:%s", iPCString);
                return new IPCString(C94208b.m119126c(iPCString.f10315d));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Audio.MusicDataSourceCrossProcessImp", e, "ipc getMusicMIMETypeByMusicId task", new Object[0]);
                return new IPCString("");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.music.model.cache.ipc.a$f */
    public static final class C4902f implements C80916r<IPCInteger, IPCInteger> {
        private C4902f() {
        }

        public Object invoke(Object obj) {
            IPCInteger iPCInteger = (IPCInteger) obj;
            try {
                Log.m105924i("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc getRemovePlayingAudioPlayerGroupCount task");
                return new IPCInteger(((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_MUSIC_RREMOVE_PLAYING_AUDIO_PLAYER_GROUP_COUNT_INT_SYNC, Integer.valueOf(iPCInteger.f10313d))).intValue());
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Audio.MusicDataSourceCrossProcessImp", e, "ipc getRemovePlayingAudioPlayerGroupCount task", new Object[0]);
                return new IPCInteger(iPCInteger.f10313d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.music.model.cache.ipc.a$g */
    public static final class C4903g implements C80916r<IPCVoid, IPCBoolean> {
        private C4903g() {
        }

        public Object invoke(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            try {
                Log.m105924i("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc isSupportMixAudioByCP task");
                return new IPCBoolean(((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_MUSIC_OPEN_MIX_AUDIO_BOOLEAN_SYNC, Boolean.FALSE)).booleanValue());
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Audio.MusicDataSourceCrossProcessImp", e, "ipc isSupportMixAudioByCP task", new Object[0]);
                return new IPCBoolean(false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.music.model.cache.ipc.a$h */
    public static final class C4904h implements C80916r<IPCLong, IPCVoid> {
        private C4904h() {
        }

        public Object invoke(Object obj) {
            IPCLong iPCLong = (IPCLong) obj;
            try {
                Log.m105924i("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc setLastScanMusicPieceFileTime task");
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_MUSIO_LAST_SCAN_MUSIC_PIECE_FILE_TIME_LONG, Long.valueOf(iPCLong.f10314d));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Audio.MusicDataSourceCrossProcessImp", e, "ipc setLastScanMusicPieceFileTime task", new Object[0]);
            }
            return new IPCVoid();
        }
    }

    /* renamed from: com.tencent.mm.plugin.music.model.cache.ipc.a$j */
    public static final class C4905j implements C80916r<IPCVoid, IPCBoolean> {
        private C4905j() {
        }

        public Object invoke(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            try {
                Log.m105924i("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc showAudioToast");
                return new IPCBoolean(((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_MUSIC_SHOW_AUDIO_TOAST_BOOLEAN_SYNC, Boolean.FALSE)).booleanValue());
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Audio.MusicDataSourceCrossProcessImp", e, "ipc showAudioToast task", new Object[0]);
                return new IPCBoolean(false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.music.model.cache.ipc.a$l */
    public static final class C4906l implements C80916r<IPCString, IPCString> {
        private C4906l() {
        }

        public Object invoke(Object obj) {
            IPCString iPCString = (IPCString) obj;
            try {
                Log.m105925i("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc updatePieceMusicInfo Task, src:%s", iPCString);
                return new IPCString(C94208b.m119131h(iPCString.f10315d));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Audio.MusicDataSourceCrossProcessImp", e, "ipc updatePieceMusicInfo task", new Object[0]);
                return new IPCString("");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.music.model.cache.ipc.a$e */
    public static final class C94204e implements C80916r<IPCString, IPCAudioParamResponse> {
        private C94204e() {
        }

        public Object invoke(Object obj) {
            IPCString iPCString = (IPCString) obj;
            try {
                Log.m105919d("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc getPieceMusicInfo Task, src:%s", iPCString);
                C101108q d = C94208b.m119127d(iPCString.f10315d);
                if (d != null) {
                    return new IPCAudioParamResponse(d);
                }
                Log.m105920e("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "pmInfo is null");
                return new IPCAudioParamResponse();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Audio.MusicDataSourceCrossProcessImp", e, "ipc getPieceMusicInfo task", new Object[0]);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.music.model.cache.ipc.a$i */
    public static final class C94205i implements C80916r<IPCAudioParamRequest, IPCVoid> {
        private C94205i() {
        }

        public Object invoke(Object obj) {
            IPCAudioParamRequest iPCAudioParamRequest = (IPCAudioParamRequest) obj;
            try {
                Log.m105925i("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc setMusicMIMETypeByMusicId Task, musicId:%s, mimeType:%s", iPCAudioParamRequest.f272147d, iPCAudioParamRequest.f272149f);
                C94208b.m119128e(iPCAudioParamRequest.f272147d, iPCAudioParamRequest.f272149f);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Audio.MusicDataSourceCrossProcessImp", e, "ipc setMusicMIMETypeByMusicId task", new Object[0]);
            }
            return new IPCVoid();
        }
    }

    /* renamed from: com.tencent.mm.plugin.music.model.cache.ipc.a$k */
    public static final class C94206k implements C80916r<IPCAudioParamRequest, IPCVoid> {
        private C94206k() {
        }

        public Object invoke(Object obj) {
            IPCAudioParamRequest iPCAudioParamRequest = (IPCAudioParamRequest) obj;
            try {
                Object[] objArr = new Object[2];
                objArr[0] = iPCAudioParamRequest.f272147d;
                objArr[1] = Boolean.valueOf(iPCAudioParamRequest.f272150g != null);
                Log.m105925i("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc updateMusicFileIndexBitCache Task, musicId:%s, bitset is valid:%b", objArr);
                C94208b.m119130g(iPCAudioParamRequest.f272147d, iPCAudioParamRequest.f272150g);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Audio.MusicDataSourceCrossProcessImp", e, "ipc updateMusicFileIndexBitCache task", new Object[0]);
            }
            return new IPCVoid();
        }
    }

    /* renamed from: com.tencent.mm.plugin.music.model.cache.ipc.a$m */
    public static final class C94207m implements C80916r<IPCAudioParamRequest, IPCVoid> {
        private C94207m() {
        }

        public Object invoke(Object obj) {
            IPCAudioParamRequest iPCAudioParamRequest = (IPCAudioParamRequest) obj;
            try {
                Log.m105925i("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc updateMusicFileCacheComplete Task, musicId:%s, complete:%d", iPCAudioParamRequest.f272147d, Integer.valueOf(iPCAudioParamRequest.f272148e));
                C94208b.m119129f(iPCAudioParamRequest.f272147d, iPCAudioParamRequest.f272148e);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Audio.MusicDataSourceCrossProcessImp", e, "ipc updateMusicFileCacheComplete task", new Object[0]);
            }
            return new IPCVoid();
        }
    }

    /* renamed from: a */
    public static void m119112a(String str) {
        XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, new IPCString(str), C4898a.class);
    }

    /* renamed from: b */
    public static String m119113b() {
        IPCString iPCString = (IPCString) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, null, C4899b.class);
        if (iPCString == null) {
            return null;
        }
        return iPCString.f10315d;
    }

    /* renamed from: c */
    public static long m119114c() {
        IPCLong iPCLong = (IPCLong) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, null, C4900c.class);
        if (iPCLong == null) {
            return 0;
        }
        return iPCLong.f10314d;
    }

    /* renamed from: d */
    public static String m119115d(String str) {
        IPCString iPCString = (IPCString) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, new IPCString(str), C4901d.class);
        if (iPCString == null) {
            return null;
        }
        return iPCString.f10315d;
    }

    /* renamed from: e */
    public static IPCAudioParamResponse m119116e(String str) {
        return (IPCAudioParamResponse) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, new IPCString(str), C94204e.class);
    }

    /* renamed from: f */
    public static int m119117f(int i) {
        IPCInteger iPCInteger = (IPCInteger) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, new IPCInteger(i), C4902f.class);
        return iPCInteger == null ? i : iPCInteger.f10313d;
    }

    /* renamed from: g */
    public static void m119118g(long j) {
        XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, new IPCLong(j), C4904h.class);
    }

    /* renamed from: h */
    public static void m119119h(String str, String str2) {
        IPCAudioParamRequest iPCAudioParamRequest = new IPCAudioParamRequest();
        iPCAudioParamRequest.f272147d = str;
        iPCAudioParamRequest.f272149f = str2;
        XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, iPCAudioParamRequest, C94205i.class);
    }

    /* renamed from: i */
    public static boolean m119120i() {
        IPCBoolean iPCBoolean = (IPCBoolean) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, null, C4905j.class);
        if (iPCBoolean == null) {
            return false;
        }
        return iPCBoolean.f10312d;
    }

    /* renamed from: j */
    public static void m119121j(String str, int i) {
        IPCAudioParamRequest iPCAudioParamRequest = new IPCAudioParamRequest();
        iPCAudioParamRequest.f272147d = str;
        iPCAudioParamRequest.f272148e = i;
        XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, iPCAudioParamRequest, C94207m.class);
    }

    /* renamed from: k */
    public static void m119122k(String str, byte[] bArr) {
        IPCAudioParamRequest iPCAudioParamRequest = new IPCAudioParamRequest();
        iPCAudioParamRequest.f272147d = str;
        iPCAudioParamRequest.f272150g = bArr;
        XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, iPCAudioParamRequest, C94206k.class);
    }

    /* renamed from: l */
    public static String m119123l(String str) {
        IPCString iPCString = (IPCString) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, new IPCString(str), C4906l.class);
        return iPCString == null ? C102984b.m136165b(str) : iPCString.f10315d;
    }
}
