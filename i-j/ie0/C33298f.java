package ie0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75596v4;
import eb0.C75597w2;
import he0.C46020f;
import he0.C46021h;
import he0.C46027q;

/* renamed from: ie0.f */
public final class C33298f implements C75596v4 {

    /* renamed from: ie0.f$a */
    public static final class C33299a implements C75597w2 {

        /* renamed from: ie0.f$a$a */
        public static final class C33300a implements C46021h.C46022a {

            /* renamed from: a */
            public final /* synthetic */ String f90306a;

            /* renamed from: b */
            public final /* synthetic */ C75597w2.C31525a f90307b;

            public C33300a(String str, C75597w2.C31525a aVar) {
                this.f90306a = str;
                this.f90307b = aVar;
            }

            /* renamed from: a */
            public void mo33215a(C46027q qVar) {
                Object[] objArr = new Object[2];
                boolean z = false;
                objArr[0] = this.f90306a;
                C46020f fVar = null;
                objArr[1] = Boolean.valueOf((qVar != null ? qVar.f124111d : null) != null);
                Log.m105925i("MicroMsg.OpenIMKFGetContactInterceptor", "alvinluo getContact username: %s, success: %s", objArr);
                C75597w2.C31525a aVar = this.f90307b;
                if (aVar != null) {
                    String str = this.f90306a;
                    if (qVar != null) {
                        fVar = qVar.f124111d;
                    }
                    if (fVar != null) {
                        z = true;
                    }
                    aVar.mo1109a(str, z);
                }
            }

            /* renamed from: b */
            public void mo33216b(String str) {
            }
        }

        /* renamed from: a */
        public void mo55985a() {
        }

        /* renamed from: b */
        public void mo55986b(String str) {
        }

        /* renamed from: c */
        public void mo55987c(String str, String str2) {
            mo59063d(str, (C75597w2.C31525a) null);
        }

        /* renamed from: d */
        public final void mo59063d(String str, C75597w2.C31525a aVar) {
            C46021h hVar;
            if (!(str == null || str.length() == 0) && C72996z1.m85846q5(str) && (hVar = (C46021h) C86312j.m106911c(C46021h.class)) != null) {
                hVar.Ss0(str, new C33300a(str, aVar));
            }
        }

        /* renamed from: e */
        public void mo55988e(String str, String str2, C75597w2.C31525a aVar) {
            if (str != null) {
                mo59063d(str, aVar);
            }
        }

        /* renamed from: f */
        public void mo55989f(String str) {
        }

        /* renamed from: g */
        public void mo55990g(String str, int i, String str2) {
        }
    }

    /* renamed from: S2 */
    public boolean mo55983S2(String str, int i) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return C72996z1.m85846q5(str);
    }

    /* renamed from: g2 */
    public C75597w2 mo55984g2() {
        return new C33299a();
    }
}
