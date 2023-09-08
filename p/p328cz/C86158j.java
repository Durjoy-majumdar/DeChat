package p328cz;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.api.TPPlayerMgr;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;

/* renamed from: cz.j */
public final class C86158j implements TPPlayerMgr.OnLogListener {

    /* renamed from: a */
    public final /* synthetic */ C20373i f250685a;

    public C86158j(C20373i iVar) {
        this.f250685a = iVar;
    }

    /* renamed from: d */
    public int mo22568d(String str, String str2) {
        C20373i iVar = this.f250685a;
        if (C20373i.vx0(iVar, iVar.f57091e)) {
            Log.LogInstance logInstance = this.f250685a.f57090d;
            if (logInstance != null) {
                logInstance.mo119534d("Finder.TPPlayerMgr", str + XVFSFile.PATH_SEPARATOR_CHAR + str2, new Object[0]);
            } else {
                C87412m.m108603p("log");
                throw null;
            }
        } else {
            Log.m105918d("Finder.TPPlayerMgr", str + XVFSFile.PATH_SEPARATOR_CHAR + str2);
        }
        return 0;
    }

    /* renamed from: e */
    public int mo22569e(String str, String str2) {
        C20373i iVar = this.f250685a;
        if (C20373i.vx0(iVar, iVar.f57091e)) {
            Log.LogInstance logInstance = this.f250685a.f57090d;
            if (logInstance != null) {
                logInstance.mo119535e("Finder.TPPlayerMgr", str + XVFSFile.PATH_SEPARATOR_CHAR + str2, new Object[0]);
            } else {
                C87412m.m108603p("log");
                throw null;
            }
        } else {
            Log.m105920e("Finder.TPPlayerMgr", str + XVFSFile.PATH_SEPARATOR_CHAR + str2);
        }
        return 0;
    }

    /* renamed from: i */
    public int mo22570i(String str, String str2) {
        C20373i iVar = this.f250685a;
        if (C20373i.vx0(iVar, iVar.f57091e)) {
            Log.LogInstance logInstance = this.f250685a.f57090d;
            if (logInstance != null) {
                logInstance.mo119538i("Finder.TPPlayerMgr", str + XVFSFile.PATH_SEPARATOR_CHAR + str2, new Object[0]);
            } else {
                C87412m.m108603p("log");
                throw null;
            }
        } else {
            Log.m105924i("Finder.TPPlayerMgr", str + XVFSFile.PATH_SEPARATOR_CHAR + str2);
        }
        return 0;
    }

    /* renamed from: v */
    public int mo22571v(String str, String str2) {
        C20373i iVar = this.f250685a;
        if (C20373i.vx0(iVar, iVar.f57091e)) {
            Log.LogInstance logInstance = this.f250685a.f57090d;
            if (logInstance != null) {
                logInstance.mo119544v("Finder.TPPlayerMgr", str + XVFSFile.PATH_SEPARATOR_CHAR + str2, new Object[0]);
            } else {
                C87412m.m108603p("log");
                throw null;
            }
        } else {
            Log.m105926v("Finder.TPPlayerMgr", str + XVFSFile.PATH_SEPARATOR_CHAR + str2);
        }
        return 0;
    }

    /* renamed from: w */
    public int mo22572w(String str, String str2) {
        C20373i iVar = this.f250685a;
        if (C20373i.vx0(iVar, iVar.f57091e)) {
            Log.LogInstance logInstance = this.f250685a.f57090d;
            if (logInstance != null) {
                logInstance.mo119545w("Finder.TPPlayerMgr", str + XVFSFile.PATH_SEPARATOR_CHAR + str2, new Object[0]);
            } else {
                C87412m.m108603p("log");
                throw null;
            }
        } else {
            Log.m105928w("Finder.TPPlayerMgr", str + XVFSFile.PATH_SEPARATOR_CHAR + str2);
        }
        return 0;
    }
}
