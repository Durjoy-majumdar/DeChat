package com.tencent.p014mm.normsgcontent;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.normsg.C115634f;
import com.tencent.p014mm.plugin.report.service.C115669n;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.normsgcontent.e */
final class C68153e {

    /* renamed from: com.tencent.mm.normsgcontent.e$m */
    public static final class C68154m {
        static {
            StringBuilder reverse = new StringBuilder("wg").reverse();
            reverse.append(new StringBuilder("ofni").reverse().toString());
            String sb = reverse.toString();
            C9556a aVar = new C9556a();
            aVar.mo10233c(sb);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/normsgcontent/e$m", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/normsgcontent/e$m", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        }

        /* renamed from: aa */
        public static native byte[] m80554aa(String str, String str2, String str3, int i);
    }

    /* renamed from: com.tencent.mm.normsgcontent.e$n */
    public static final class C68155n {

        /* renamed from: a */
        public static volatile C114835a f195837a;

        /* renamed from: c0 */
        public static synchronized void m80555c0(C114835a aVar) {
            synchronized (C68155n.class) {
                f195837a = aVar;
            }
        }

        /* renamed from: c1 */
        public static synchronized void m80556c1(int i, String str) {
            synchronized (C68155n.class) {
                if (f195837a != null) {
                    ((C115634f) f195837a).getClass();
                    C115669n.INSTANCE.kvStat(i, str);
                }
            }
        }

        /* renamed from: c2 */
        public static synchronized void m80557c2(int i, int i2, int i3) {
            synchronized (C68155n.class) {
                if (f195837a != null) {
                    ((C115634f) f195837a).getClass();
                    C115669n.INSTANCE.mo175913w((long) i, (long) i2, (long) i3);
                }
            }
        }

        /* renamed from: c3 */
        public static synchronized void m80558c3(int i, int i2, int i3, int i4) {
            synchronized (C68155n.class) {
                if (f195837a != null) {
                    ((C115634f) f195837a).getClass();
                    C115669n.INSTANCE.mo160138m(i, i2, i3, i4, true);
                }
            }
        }

        /* renamed from: c4 */
        private static boolean m80559c4(String str, byte[] bArr) {
            if (f195837a != null) {
                return ((C115634f) f195837a).Dx0(str, bArr);
            }
            return false;
        }

        /* renamed from: c5 */
        private static byte[] m80560c5(String str) {
            return f195837a != null ? ((C115634f) f195837a).xx0(str) : new byte[0];
        }

        /* renamed from: c6 */
        private static void m80561c6(String str) {
            if (f195837a != null) {
                ((C115634f) f195837a).Ex0(str);
            }
        }

        /* renamed from: c7 */
        private static String m80562c7() {
            if (f195837a == null) {
                return "";
            }
            String Cx0 = ((C115634f) f195837a).Cx0();
            return !TextUtils.isEmpty(Cx0) ? Cx0 : "";
        }
    }
}
