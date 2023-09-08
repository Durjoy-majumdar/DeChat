package com.tencent.p014mm.app;

import android.content.Context;
import bp3.C79757o;
import com.tencent.stubs.logger.Log;
import com.tencent.xweb.file.XVFSFile;

/* renamed from: com.tencent.mm.app.u0 */
public enum C80622u0 {
    MM("", "MM", true, r6),
    PUSH(":push", "PUSH", false, r6),
    TOOLS(":tools", "TOOL", true, r6),
    APPBRAND1(":appbrand1", "APPBRAND1", true, r6),
    SANDBOX(":sandbox", "SANDBOX", true, r6),
    EXDEVICE(":exdevice", "EXDEVICE", false, r6),
    SUPPORT(":support", "SUPPORT", true, r6),
    CUPLOADER(":cuploader", (int) null, false, r27),
    PATCH(":patch", "PATCH", false, r6),
    HOTPOT_DOTDOT(":hotpot..", "HOTPOT..", false, r6),
    FALLBACK(":fallback", (int) null, false, r6),
    DEXOPT(":dexopt", (int) null, false, r6),
    RECOVERY(":recovery", "RECOVERY", true, r6),
    NOSPACE(":nospace", (int) null, true, r6),
    JECTL(":jectl", "JECTL", false, r6),
    OPENGL_DETECTOR(":opengl_detector", "OPENGL_DETECTOR", false, r6),
    RUBBISHBIN(":rubbishbin", "RUBBISHBIN", false, r6),
    RES_CAN_WORKER(":res_can_worker", (int) null, false, r6),
    EXTMIG(":extmig", "EXTMIG", true, r6),
    BACKTRACE__(":backtrace__", "BACKTRACE__", false, r6),
    TM_ASSISTANT_DOWNLOAD_SDK_SERVICE(":TMAssistantDownloadSDKService", (int) null, false, r6),
    SWITCH(":switch", "SWITCH", true, r6),
    HLD(":hld", "HLD", true, r6),
    LITE(":lite", "LITE", true, r6),
    PLAYCORE_MISSING_SPLITS_ACTIVITY(":playcore_missing_splits_activity", (int) null, true, r6),
    HLDFL(":hldfl", "HLDFL", true, r6),
    MAGIC_EMOJI(":magic_emoji", "ME", false, r6);
    

    /* renamed from: L */
    public static final C80622u0[] f235868L = null;

    /* renamed from: d */
    public final String f235886d;

    /* renamed from: e */
    public final String f235887e;

    /* renamed from: f */
    public final boolean f235888f;

    /* renamed from: g */
    public final C80623a f235889g;

    /* renamed from: com.tencent.mm.app.u0$a */
    public enum C80623a {
        DEFAULT,
        CLEAN,
        ISOLATED
    }

    /* access modifiers changed from: public */
    static {
        f235868L = new C80622u0[]{null};
    }

    /* access modifiers changed from: public */
    C80622u0(String str, String str2, boolean z, C80623a aVar) {
        this.f235886d = str;
        this.f235887e = str2;
        this.f235888f = z;
        this.f235889g = aVar;
    }

    /* renamed from: a */
    public static C80622u0 m98265a(Context context) {
        C80622u0 u0Var;
        C80622u0[] u0VarArr = f235868L;
        if (u0VarArr[0] == null) {
            synchronized (u0VarArr) {
                if (u0VarArr[0] == null) {
                    String[] strArr = C79757o.f233759a;
                    if (strArr[1] == null) {
                        synchronized (strArr) {
                            if (strArr[1] == null) {
                                String a = C79757o.m96896a(context);
                                int indexOf = a.indexOf(58);
                                strArr[1] = indexOf >= 0 ? a.substring(indexOf) : "";
                            }
                        }
                    }
                    String str = strArr[1];
                    C80622u0[] values = values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        u0Var = values[i];
                        String str2 = u0Var.f235886d;
                        if (str2.equals(str)) {
                            break;
                        }
                        if (u0Var != MM) {
                            if (str.startsWith(str2 + XVFSFile.PATH_SEPARATOR)) {
                                break;
                            }
                        }
                        i++;
                    }
                    f235868L[0] = u0Var;
                    if (f235868L[0] == null) {
                        Log.m106498e("MicroMsg.ProcessDescriptor", "Fail to get current process descriptor, curr_process_suffix: %s", str);
                    }
                }
            }
        }
        return f235868L[0];
    }
}
