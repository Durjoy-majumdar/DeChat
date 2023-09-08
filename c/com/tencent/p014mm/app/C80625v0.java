package com.tencent.p014mm.app;

import android.content.Context;
import com.tencent.p014mm.app.C80622u0;

/* renamed from: com.tencent.mm.app.v0 */
public enum C80625v0 {
    MATCH_MM(r1, C80622u0.MM),
    MATCH_PUSH(r1, C80622u0.PUSH),
    MATCH_TOOLS(r1, C80622u0.TOOLS),
    MATCH_APPBRAND(r7, ":appbrand"),
    MATCH_APPBRAND1(r1, C80622u0.APPBRAND1),
    MATCH_SANDBOX(r1, C80622u0.SANDBOX),
    MATCH_EXDEVICE(r1, C80622u0.EXDEVICE),
    MATCH_SUPPORT(r1, C80622u0.SUPPORT),
    MATCH_CUPLOADER(r1, C80622u0.CUPLOADER),
    MATCH_PATCH(r1, C80622u0.PATCH),
    MATCH_HOTPOT_DOTDOT(r1, C80622u0.HOTPOT_DOTDOT),
    MATCH_FALLBACK(r1, C80622u0.FALLBACK),
    MATCH_DEXOPT(r1, C80622u0.DEXOPT),
    MATCH_RECOVERY(r1, C80622u0.RECOVERY),
    MATCH_NOSPACE(r1, C80622u0.NOSPACE),
    MATCH_JECTL(r1, C80622u0.JECTL),
    MATCH_OPENGL_DETECTOR(r1, C80622u0.OPENGL_DETECTOR),
    MATCH_RUBBISHBIN(r1, C80622u0.RUBBISHBIN),
    MATCH_ISOLATED_PROCESS(r7, ":isolated_process"),
    MATCH_XWEB_SANDBOXED_PROCESS(r7, ":xweb_sandboxed_process_"),
    MATCH_XWEB_SANDBOXED_PROCESS_EX(r7, ":xweb_sandboxed_process_ex_"),
    MATCH_XWEB_SANDBOXED_PROCESS_EX_APPBRAND(r7, ":xweb_sandboxed_process_ex_appbrand_"),
    MATCH_XWEB_PRIVILEGED_PROCESS(r7, ":xweb_privileged_process_"),
    MATCH_XWEB_PRIVILEGED_PROCESS_APPBRAND(r7, ":xweb_privileged_process_appbrand_"),
    MATCH_RES_CAN_WORKER(r1, C80622u0.RES_CAN_WORKER),
    MATCH_EXTMIG(r1, C80622u0.EXTMIG),
    MATCH_BACKTRACE__(r1, C80622u0.BACKTRACE__),
    MATCH_TM_ASSISTANT_DOWNLOAD_SDK_SERVICE(r1, C80622u0.TM_ASSISTANT_DOWNLOAD_SDK_SERVICE),
    MATCH_SWITCH(r1, C80622u0.SWITCH),
    MATCH_LITE(r1, C80622u0.LITE),
    MATCH_HLD(r1, C80622u0.HLD),
    MATCH_PLAYCORE_MISSING_SPLITS_ACTIVITY(r1, C80622u0.PLAYCORE_MISSING_SPLITS_ACTIVITY),
    MATCH_HLDFL(r1, C80622u0.HLDFL),
    MATCH_MAGIC_EMOJI(r1, C80622u0.MAGIC_EMOJI),
    MATCH_NOT_PLAIN_PROCESSES(C80627b.NOT_PLAIN, (int) null),
    MATCH_NOT_PLAIN_NOT_ISOLATED_PROCESSES(C80627b.NOT_PLAIN_NOT_ISOLATED, (int) null);
    
    private final int[] mCachedResult;
    private final Object mExpected;
    private final C80627b mMatchAction;

    /* renamed from: com.tencent.mm.app.v0$b */
    public enum C80627b {
        EXACT {
            /* renamed from: a */
            public boolean mo112369a(C80622u0 u0Var, Object obj) {
                return u0Var == obj;
            }
        },
        PREFIX_STARTS_WITH {
            /* renamed from: a */
            public boolean mo112369a(C80622u0 u0Var, Object obj) {
                return u0Var.f235886d.startsWith((String) obj);
            }
        },
        NOT_PLAIN {
            /* renamed from: a */
            public boolean mo112369a(C80622u0 u0Var, Object obj) {
                return u0Var.f235889g == C80622u0.C80623a.DEFAULT;
            }
        },
        NOT_PLAIN_NOT_ISOLATED {
            /* renamed from: a */
            public boolean mo112369a(C80622u0 u0Var, Object obj) {
                C80622u0.C80623a aVar = u0Var.f235889g;
                return (aVar == C80622u0.C80623a.DEFAULT) && aVar != C80622u0.C80623a.ISOLATED;
            }
        };

        /* access modifiers changed from: public */
        C80627b(C80626a aVar) {
        }

        /* renamed from: a */
        public abstract boolean mo112369a(C80622u0 u0Var, Object obj);
    }

    private C80625v0(C80627b bVar, Object obj) {
        this.mCachedResult = new int[]{-1};
        this.mMatchAction = bVar;
        this.mExpected = obj;
    }

    public final boolean matches(Context context) {
        int[] iArr = this.mCachedResult;
        if (iArr[0] == -1) {
            synchronized (iArr) {
                if (this.mCachedResult[0] == -1) {
                    C80622u0 a = C80622u0.m98265a(context);
                    if (a == null) {
                        return false;
                    }
                    this.mCachedResult[0] = this.mMatchAction.mo112369a(a, this.mExpected) ? 1 : 0;
                }
            }
        }
        return this.mCachedResult[0] == 1;
    }
}
