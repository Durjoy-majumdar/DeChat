package iv3;

import android.content.Context;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import cv3.C86144a;
import ev3.C86700b;
import ev3.C86701c;
import gv3.C87400a;
import gv3.C87401b;
import gv3.C87402c;
import gv3.C87403d;
import java.io.File;
import jv3.C88033a;

/* renamed from: iv3.a */
public class C87821a {

    /* renamed from: m */
    public static C87821a f254226m;

    /* renamed from: n */
    public static boolean f254227n;

    /* renamed from: a */
    public final Context f254228a;

    /* renamed from: b */
    public final File f254229b;

    /* renamed from: c */
    public final C86701c f254230c;

    /* renamed from: d */
    public final C87402c f254231d;

    /* renamed from: e */
    public final C87403d f254232e;

    /* renamed from: f */
    public final File f254233f;

    /* renamed from: g */
    public final C86144a f254234g;

    /* renamed from: h */
    public final boolean f254235h;

    /* renamed from: i */
    public final boolean f254236i;

    /* renamed from: j */
    public int f254237j;

    /* renamed from: k */
    public C87826d f254238k;

    /* renamed from: l */
    public boolean f254239l = false;

    /* renamed from: iv3.a$b */
    public static class C87823b {

        /* renamed from: a */
        public final Context f254240a;

        /* renamed from: b */
        public final boolean f254241b;

        /* renamed from: c */
        public final boolean f254242c;

        /* renamed from: d */
        public int f254243d = -1;

        /* renamed from: e */
        public C87402c f254244e;

        /* renamed from: f */
        public C87403d f254245f;

        /* renamed from: g */
        public C86701c f254246g;

        /* renamed from: h */
        public C86144a f254247h;

        /* renamed from: i */
        public File f254248i;

        /* renamed from: j */
        public File f254249j;

        /* renamed from: k */
        public File f254250k;

        /* renamed from: l */
        public Boolean f254251l;

        public C87823b(Context context) {
            if (context != null) {
                this.f254240a = context;
                this.f254241b = ShareTinkerInternals.isInMainProcess(context);
                String str = C88033a.f254653a;
                String processName = ShareTinkerInternals.getProcessName(context);
                String a = C88033a.m109600a(context);
                this.f254242c = (a == null || a.length() == 0) ? false : processName.equals(a);
                File patchDirectory = SharePatchFileUtil.getPatchDirectory(context);
                this.f254248i = patchDirectory;
                if (patchDirectory == null) {
                    ShareTinkerLog.m106531e("Tinker.Tinker", "patchDirectory is null!", new Object[0]);
                    return;
                }
                this.f254249j = SharePatchFileUtil.getPatchInfoFile(patchDirectory.getAbsolutePath());
                this.f254250k = SharePatchFileUtil.getPatchInfoLockFile(this.f254248i.getAbsolutePath());
                ShareTinkerLog.m106534w("Tinker.Tinker", "tinker patch directory: %s", this.f254248i);
                return;
            }
            throw new TinkerRuntimeException("Context must not be null.");
        }

        /* renamed from: a */
        public C87821a mo122279a() {
            if (this.f254243d == -1) {
                this.f254243d = 15;
            }
            if (this.f254244e == null) {
                this.f254244e = new C87400a(this.f254240a);
            }
            if (this.f254245f == null) {
                this.f254245f = new C87401b(this.f254240a);
            }
            if (this.f254246g == null) {
                this.f254246g = new C86700b(this.f254240a);
            }
            if (this.f254251l == null) {
                this.f254251l = Boolean.FALSE;
            }
            return new C87821a(this.f254240a, this.f254243d, this.f254244e, this.f254245f, this.f254246g, this.f254248i, this.f254249j, this.f254250k, this.f254247h, this.f254241b, this.f254242c, this.f254251l.booleanValue(), (C87822a) null);
        }
    }

    public C87821a(Context context, int i, C87402c cVar, C87403d dVar, C86701c cVar2, File file, File file2, File file3, C86144a aVar, boolean z, boolean z2, boolean z3, C87822a aVar2) {
        this.f254228a = context;
        this.f254230c = cVar2;
        this.f254231d = cVar;
        this.f254232e = dVar;
        this.f254237j = i;
        this.f254229b = file;
        this.f254233f = file2;
        this.f254234g = aVar;
        this.f254235h = z;
        this.f254236i = z2;
    }

    /* renamed from: c */
    public static C87821a m109275c(Context context) {
        if (f254227n) {
            synchronized (C87821a.class) {
                if (f254226m == null) {
                    f254226m = new C87823b(context).mo122279a();
                }
            }
            return f254226m;
        }
        throw new TinkerRuntimeException("you must install tinker before get tinker sInstance");
    }

    /* renamed from: a */
    public void mo122277a() {
        ShareTinkerInternals.cleanPatch(this.f254228a);
    }

    /* renamed from: b */
    public void mo122278b(File file) {
        if (this.f254229b != null && file != null && file.exists()) {
            String patchVersionDirectory = SharePatchFileUtil.getPatchVersionDirectory(SharePatchFileUtil.getMD5(file));
            if (this.f254229b != null && patchVersionDirectory != null) {
                SharePatchFileUtil.deleteDir(this.f254229b.getAbsolutePath() + "/" + patchVersionDirectory);
            }
        }
    }
}
