package com.tencent.matrix.openglleak.detector;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Process;
import com.tencent.matrix.openglleak.detector.C80507a;
import com.tencent.matrix.openglleak.hook.OpenGLHook;
import j20.C117292a;
import java.util.HashMap;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import p1053ve.C111513c;
import p723vf.C118672d;

public class OpenglIndexDetectorService extends Service {

    /* renamed from: e */
    public static final /* synthetic */ int f235505e = 0;

    /* renamed from: d */
    public final C80507a.C80508a f235506d = new C80506a();

    /* renamed from: com.tencent.matrix.openglleak.detector.OpenglIndexDetectorService$a */
    public class C80506a extends C80507a.C80508a {
        public C80506a() {
        }

        /* renamed from: uN */
        public void mo112032uN() {
            OpenglIndexDetectorService.this.stopSelf();
            int myPid = Process.myPid();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(myPid));
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/matrix/openglleak/detector/OpenglIndexDetectorService$1", "destory", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(obj, "com/tencent/matrix/openglleak/detector/OpenglIndexDetectorService$1", "destory", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            Object obj2 = new Object();
            C117292a.m165358d(obj2, aVar2.mo10232b(), "com/tencent/matrix/openglleak/detector/OpenglIndexDetectorService$1", "destory", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
            System.exit(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(obj2, "com/tencent/matrix/openglleak/detector/OpenglIndexDetectorService$1", "destory", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
        }

        public Map<String, Integer> zs0() {
            OpenglIndexDetectorService openglIndexDetectorService = OpenglIndexDetectorService.this;
            int i = OpenglIndexDetectorService.f235505e;
            openglIndexDetectorService.getClass();
            C111513c.m152016a();
            OpenGLHook.getInstance().init();
            C118672d.m167353c("matrix.OpenglIndexDetectorService", "init env succ", new Object[0]);
            int funcIndex = FuncSeeker.getFuncIndex("glGenTextures");
            C118672d.m167353c("matrix.OpenglIndexDetectorService", "glGenTextures index:" + funcIndex, new Object[0]);
            int funcIndex2 = FuncSeeker.getFuncIndex("glDeleteTextures");
            C118672d.m167353c("matrix.OpenglIndexDetectorService", "glDeleteTextures index:" + funcIndex2, new Object[0]);
            int funcIndex3 = FuncSeeker.getFuncIndex("glGenBuffers");
            C118672d.m167353c("matrix.OpenglIndexDetectorService", "glGenBuffers index:" + funcIndex3, new Object[0]);
            int funcIndex4 = FuncSeeker.getFuncIndex("glDeleteBuffers");
            C118672d.m167353c("matrix.OpenglIndexDetectorService", "glDeleteBuffers index:" + funcIndex4, new Object[0]);
            int funcIndex5 = FuncSeeker.getFuncIndex("glGenFramebuffers");
            C118672d.m167353c("matrix.OpenglIndexDetectorService", "glGenFramebuffers index:" + funcIndex5, new Object[0]);
            int funcIndex6 = FuncSeeker.getFuncIndex("glDeleteFramebuffers");
            C118672d.m167353c("matrix.OpenglIndexDetectorService", "glDeleteFramebuffers index:" + funcIndex6, new Object[0]);
            int funcIndex7 = FuncSeeker.getFuncIndex("glGenRenderbuffers");
            StringBuilder sb = new StringBuilder();
            Object obj = "glGenRenderbuffers";
            sb.append("glGenRenderbuffers index:");
            sb.append(funcIndex7);
            Object obj2 = "glDeleteFramebuffers";
            C118672d.m167353c("matrix.OpenglIndexDetectorService", sb.toString(), new Object[0]);
            int funcIndex8 = FuncSeeker.getFuncIndex("glDeleteRenderbuffers");
            StringBuilder sb4 = new StringBuilder();
            Object obj3 = "glDeleteRenderbuffers";
            sb4.append("glDeleteRenderbuffers index:");
            sb4.append(funcIndex8);
            Object obj4 = "glGenFramebuffers";
            C118672d.m167353c("matrix.OpenglIndexDetectorService", sb4.toString(), new Object[0]);
            int funcIndex9 = FuncSeeker.getFuncIndex("glTexImage2D");
            StringBuilder sb5 = new StringBuilder();
            Object obj5 = "glTexImage2D";
            sb5.append("glTexImage2DIndex index:");
            sb5.append(funcIndex9);
            Object obj6 = "glDeleteBuffers";
            C118672d.m167353c("matrix.OpenglIndexDetectorService", sb5.toString(), new Object[0]);
            int funcIndex10 = FuncSeeker.getFuncIndex("glTexImage3D");
            StringBuilder sb6 = new StringBuilder();
            Object obj7 = "glTexImage3D";
            sb6.append("glTexImage3DIndex index:");
            sb6.append(funcIndex10);
            Object obj8 = "glGenBuffers";
            C118672d.m167353c("matrix.OpenglIndexDetectorService", sb6.toString(), new Object[0]);
            int funcIndex11 = FuncSeeker.getFuncIndex("glBindTexture");
            StringBuilder sb7 = new StringBuilder();
            Object obj9 = "glBindTexture";
            sb7.append("glBindTextureIndex index:");
            sb7.append(funcIndex11);
            Object obj10 = "glDeleteTextures";
            C118672d.m167353c("matrix.OpenglIndexDetectorService", sb7.toString(), new Object[0]);
            int funcIndex12 = FuncSeeker.getFuncIndex("glBindBuffer");
            StringBuilder sb8 = new StringBuilder();
            Object obj11 = "glBindBuffer";
            sb8.append("glBindBufferIndex index:");
            sb8.append(funcIndex12);
            Object obj12 = "glGenTextures";
            C118672d.m167353c("matrix.OpenglIndexDetectorService", sb8.toString(), new Object[0]);
            int funcIndex13 = FuncSeeker.getFuncIndex("glBindFramebuffer");
            StringBuilder sb9 = new StringBuilder();
            Object obj13 = "glBindFramebuffer";
            sb9.append("glBindFramebufferIndex index:");
            sb9.append(funcIndex13);
            int i2 = funcIndex13;
            C118672d.m167353c("matrix.OpenglIndexDetectorService", sb9.toString(), new Object[0]);
            int funcIndex14 = FuncSeeker.getFuncIndex("glBindRenderbuffer");
            StringBuilder sb10 = new StringBuilder();
            Object obj14 = "glBindRenderbuffer";
            sb10.append("glBindRenderbufferIndex index:");
            sb10.append(funcIndex14);
            int i3 = funcIndex14;
            C118672d.m167353c("matrix.OpenglIndexDetectorService", sb10.toString(), new Object[0]);
            int funcIndex15 = FuncSeeker.getFuncIndex("glBufferData");
            StringBuilder sb11 = new StringBuilder();
            Object obj15 = "glBufferData";
            sb11.append("glBufferData index:");
            sb11.append(funcIndex15);
            int i4 = funcIndex15;
            C118672d.m167353c("matrix.OpenglIndexDetectorService", sb11.toString(), new Object[0]);
            int funcIndex16 = FuncSeeker.getFuncIndex("glRenderbufferStorage");
            StringBuilder sb12 = new StringBuilder();
            Object obj16 = "glRenderbufferStorage";
            sb12.append("glRenderbufferStorage index:");
            sb12.append(funcIndex16);
            int i5 = funcIndex16;
            C118672d.m167353c("matrix.OpenglIndexDetectorService", sb12.toString(), new Object[0]);
            if (funcIndex * funcIndex2 * funcIndex3 * funcIndex4 * funcIndex5 * funcIndex6 * funcIndex7 * funcIndex8 * funcIndex9 * funcIndex10 * funcIndex11 * funcIndex12 * i2 * i3 * i5 * i4 == 0) {
                C118672d.m167352b("matrix.OpenglIndexDetectorService", "seek func index fail!", new Object[0]);
                return null;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(obj12, Integer.valueOf(funcIndex));
            hashMap.put(obj10, Integer.valueOf(funcIndex2));
            hashMap.put(obj8, Integer.valueOf(funcIndex3));
            hashMap.put(obj6, Integer.valueOf(funcIndex4));
            hashMap.put(obj4, Integer.valueOf(funcIndex5));
            hashMap.put(obj2, Integer.valueOf(funcIndex6));
            hashMap.put(obj, Integer.valueOf(funcIndex7));
            hashMap.put(obj3, Integer.valueOf(funcIndex8));
            hashMap.put(obj5, Integer.valueOf(funcIndex9));
            hashMap.put(obj7, Integer.valueOf(funcIndex10));
            hashMap.put(obj9, Integer.valueOf(funcIndex11));
            hashMap.put(obj11, Integer.valueOf(funcIndex12));
            hashMap.put(obj13, Integer.valueOf(i2));
            hashMap.put(obj14, Integer.valueOf(i3));
            hashMap.put(obj15, Integer.valueOf(i4));
            hashMap.put(obj16, Integer.valueOf(i5));
            C118672d.m167353c("matrix.OpenglIndexDetectorService", "seek func index succ!", new Object[0]);
            return hashMap;
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f235506d;
    }
}
