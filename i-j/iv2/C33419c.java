package iv2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.xweb.file.XVFSFile;
import rx3.C13604l;

/* renamed from: iv2.c */
public final class C33419c {

    /* renamed from: a */
    public static final C33419c f90549a = new C33419c();

    /* renamed from: a */
    public final String mo59133a() {
        SnsMethodCalculate.markStartTimeMs("getSnsMediaDir", "com.tencent.mm.plugin.sns.util.SnsFilePathUtil");
        String str = VFSStrategy.m163776d("draft") + XVFSFile.SEPARATOR_CHAR;
        Log.m105924i("MicroMsg.SnsFilePathUtil", "create sns draft dir:" + str + " result:" + C86013q1.m106461v(str));
        SnsMethodCalculate.markEndTimeMs("getSnsMediaDir", "com.tencent.mm.plugin.sns.util.SnsFilePathUtil");
        return str;
    }

    /* renamed from: b */
    public final C13604l<String, String> mo59134b() {
        SnsMethodCalculate.markStartTimeMs("getSnsMediaPath", "com.tencent.mm.plugin.sns.util.SnsFilePathUtil");
        long currentTimeMillis = System.currentTimeMillis();
        String a = mo59133a();
        C13604l<String, String> lVar = new C13604l<>(a + "video_" + currentTimeMillis + ".mp4", a + "thumb_" + currentTimeMillis + ".jpg");
        SnsMethodCalculate.markEndTimeMs("getSnsMediaPath", "com.tencent.mm.plugin.sns.util.SnsFilePathUtil");
        return lVar;
    }
}
