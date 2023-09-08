package com.tencent.p014mm.udp.libmmudp;

import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.udp.libmmudp.a */
public class C30803a {

    /* renamed from: a */
    public static C30805b f82806a = new C30804a();

    /* renamed from: com.tencent.mm.udp.libmmudp.a$a */
    public class C30804a implements C30805b {
        public void loadLibrary(String str) {
            C9556a aVar = new C9556a();
            aVar.mo10233c(str);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/udp/libmmudp/UdpLoadDelegate$1", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/udp/libmmudp/UdpLoadDelegate$1", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        }
    }

    /* renamed from: com.tencent.mm.udp.libmmudp.a$b */
    public interface C30805b {
        void loadLibrary(String str);
    }
}
