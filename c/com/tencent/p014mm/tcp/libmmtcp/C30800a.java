package com.tencent.p014mm.tcp.libmmtcp;

import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.tcp.libmmtcp.a */
public class C30800a {

    /* renamed from: a */
    public static C30802b f82805a = new C30801a();

    /* renamed from: com.tencent.mm.tcp.libmmtcp.a$a */
    public class C30801a implements C30802b {
        public void loadLibrary(String str) {
            C9556a aVar = new C9556a();
            aVar.mo10233c(str);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/tcp/libmmtcp/TcpLoadDelegate$1", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/tcp/libmmtcp/TcpLoadDelegate$1", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        }
    }

    /* renamed from: com.tencent.mm.tcp.libmmtcp.a$b */
    public interface C30802b {
        void loadLibrary(String str);
    }
}
