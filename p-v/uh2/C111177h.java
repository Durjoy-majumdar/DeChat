package uh2;

import a70.C112760b;
import ac3.C91992q0;
import com.tencent.p014mm.plugin.recordvideo.res.BaseVideoResLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;

/* renamed from: uh2.h */
public final class C111177h extends BaseVideoResLogic {

    /* renamed from: d */
    public static final C111177h f332960d = new C111177h();

    /* renamed from: e */
    public static final C111178i f332961e = new C111178i(75);

    /* renamed from: a */
    public void mo151271a(boolean z) {
        if (z) {
            Log.m105924i("MicroMsg.VideoLabelModelResLogic", "afterUnZipRes, success:" + z);
            StringBuilder sb = new StringBuilder();
            C91992q0 q0Var = C91992q0.f263331a;
            sb.append(C91992q0.f263334d);
            sb.append(XVFSFile.SEPARATOR_CHAR);
            sb.append(C91992q0.f263341k);
            String sb4 = sb.toString();
            C86013q1.m106463x(mo162907p(), sb4);
            Log.m105924i("MicroMsg.VideoLabelModelResLogic", "afterUnZipRes, copy image label model path, from:" + mo162907p() + " to " + sb4);
        }
    }

    /* renamed from: d */
    public String mo151274d() {
        return "ImageLabelModel/";
    }

    /* renamed from: e */
    public String[] mo151275e() {
        return new String[]{"path"};
    }

    /* renamed from: f */
    public C111170b mo151276f() {
        return f332961e;
    }

    /* renamed from: g */
    public String mo151277g() {
        return C112760b.m154231g() + "ImageLabel/";
    }

    /* renamed from: i */
    public int mo151279i() {
        return 80;
    }

    /* renamed from: j */
    public String mo151280j() {
        return "MicroMsg.VideoLabelModelResLogic";
    }

    /* renamed from: p */
    public final String mo162907p() {
        return mo151277g() + "ImageLabel.xnet";
    }
}
