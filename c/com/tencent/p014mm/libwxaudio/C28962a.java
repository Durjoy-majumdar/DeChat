package com.tencent.p014mm.libwxaudio;

import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.libwxaudio.a */
public class C28962a {

    /* renamed from: a */
    public static C28964b f79434a = new C28963a();

    /* renamed from: com.tencent.mm.libwxaudio.a$a */
    public class C28963a implements C28964b {
        public void loadLibrary(String str) {
            C9556a aVar = new C9556a();
            aVar.mo10233c(str);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/libwxaudio/WxAudioLoadDelegate$1", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/libwxaudio/WxAudioLoadDelegate$1", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        }
    }

    /* renamed from: com.tencent.mm.libwxaudio.a$b */
    public interface C28964b {
        void loadLibrary(String str);
    }
}
