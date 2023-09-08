package com.tencent.p014mm.plugin.appbrand.media.record;

import android.text.TextUtils;
import com.tencent.xweb.FileReaderHelper;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.appbrand.media.record.r */
public class C29597r {

    /* renamed from: a */
    public static C29599b f80527a = new C29598a();

    /* renamed from: com.tencent.mm.plugin.appbrand.media.record.r$a */
    public class C29598a implements C29599b {
        public void loadLibrary(String str, ClassLoader classLoader) {
            C9556a aVar = new C9556a();
            aVar.mo10233c(str);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/media/record/AudioRecordUtil$1", "loadLibrary", "(Ljava/lang/String;Ljava/lang/ClassLoader;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/plugin/appbrand/media/record/AudioRecordUtil$1", "loadLibrary", "(Ljava/lang/String;Ljava/lang/ClassLoader;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.media.record.r$b */
    public interface C29599b {
        void loadLibrary(String str, ClassLoader classLoader);
    }

    /* renamed from: a */
    public static boolean m38828a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return FileReaderHelper.AAC_EXT.equalsIgnoreCase(str) || FileReaderHelper.MP3_EXT.equalsIgnoreCase(str) || FileReaderHelper.WAV_EXT.equalsIgnoreCase(str) || "pcm".equalsIgnoreCase(str);
    }
}
