package p645pj;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.downloadservice.DownloadHelper;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import lc3.C10485b;

/* renamed from: pj.c */
public class C77092c {
    /* renamed from: a */
    public static int m93039a() {
        try {
            return Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("InputLimitSendAppMsgEmotionBufSize"), 5242880);
        } catch (Exception e) {
            Log.printDebugStack("MicroMsg.BoundaryConfig", "getAppEmojiMsgMaxSize:%s", e);
            return 5242880;
        }
    }

    /* renamed from: b */
    public static int m93040b() {
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_emoji_custom_max_size, 1);
        Log.m105925i("MicroMsg.BoundaryConfig", "getCustomEmojiMaxSize: %s", Integer.valueOf(Qe));
        return Qe * 1048576;
    }

    /* renamed from: c */
    public static int m93041c() {
        try {
            return Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("InputLimitSendEmotionWidth"), 1024);
        } catch (Exception e) {
            Log.printDebugStack("MicroMsg.BoundaryConfig", "getCustomEmojiMaxWidthAndHeight:%s", e);
            return 1024;
        }
    }

    /* renamed from: d */
    public static int m93042d() {
        return Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("InputLimitSendEmotionBufSize"), 10485760);
    }

    /* renamed from: e */
    public static String m93043e() {
        return ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("InputLimitForbiddenChar");
    }

    /* renamed from: f */
    public static long m93044f() {
        try {
            String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("InputLimitFavFileSize");
            if (Util.isNullOrNil(c)) {
                Log.m105924i("MicroMsg.BoundaryConfig", "getFileSizeLimit nullOrNil");
            } else {
                Log.m105924i("MicroMsg.BoundaryConfig", "getFileSizeLimit " + c);
            }
            return Util.getLong(c, DownloadHelper.SAVE_LENGTH);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.BoundaryConfig", th, "getMaxFavFileSize", new Object[0]);
            return DownloadHelper.SAVE_LENGTH;
        }
    }

    /* renamed from: g */
    public static long m93045g() {
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("InputLimitFavNotesSize");
        Log.m105919d("MicroMsg.BoundaryConfig", "getMaxFavNoteSize, svrLimit:%s, localLimit:%s", c, 1073741824L);
        return Util.getLong(c, 1073741824);
    }

    /* renamed from: h */
    public static long m93046h() {
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("InputLimitGroupFileTotalSize");
        Log.m105919d("MicroMsg.BoundaryConfig", "MaxMultipleFileTotalSize, svrLimit:%s, localLimit:%s", c, 1073741824L);
        return Util.getLong(c, 1073741824);
    }

    /* renamed from: i */
    public static long m93047i() {
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("InputLimitSendFileSize");
        Log.m105925i("MicroMsg.BoundaryConfig", "MaxSendFileSize, svrLimit:%s, localLimit:%s", c, Long.valueOf(DownloadHelper.SAVE_LENGTH));
        return Util.getLong(c, DownloadHelper.SAVE_LENGTH);
    }

    /* renamed from: j */
    public static long m93048j() {
        return Util.getLong(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("InputLimitVideoSize"), 26214400);
    }

    /* renamed from: k */
    public static int m93049k() {
        return Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("SnsCommentMaxSize"), 1000) * 2;
    }

    /* renamed from: l */
    public static int m93050l() {
        return Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("InputLimitSNSObjectText"), 2000) * 2;
    }
}
